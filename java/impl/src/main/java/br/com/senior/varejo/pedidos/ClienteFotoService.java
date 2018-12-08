package br.com.senior.varejo.pedidos;

import java.util.Arrays;
import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.senior.messaging.model.ServiceContext;
import br.com.senior.platform.blobservice.BlobDetails;
import br.com.senior.platform.blobservice.BlobRequest;
import br.com.senior.platform.blobservice.BlobServiceStub;
import br.com.senior.platform.blobservice.BlobServiceStubImpl;
import br.com.senior.platform.blobservice.CommitFileInput;
import br.com.senior.platform.blobservice.CreateAreaInput;
import br.com.senior.platform.blobservice.Protocol;
import br.com.senior.platform.blobservice.Requirement;

@Service
public class ClienteFotoService {
    
    private static final int TIMEOUT = 50000;

    private static String AREA_SECRET = "aAGG33jRg4h855hkkP";

    private BlobServiceStub blobService;

    private BlobServiceStub getBlobService() {
        if(blobService == null) {
            blobService = new BlobServiceStubImpl(ServiceContext.get().getCurrentMessenger(), new BlobServiceContextCredentials()); 
        }
        return blobService;
    };


    public ObterUrlUploadFotoOutput obterUrlUploadFoto(String id) {
        ObterUrlUploadFotoOutput out = new ObterUrlUploadFotoOutput();
        if (id == null) {
            id = UUID.randomUUID().toString();
        }

        createArea();

        BlobServiceStub blobService = getBlobService();
        BlobRequest blobRequest = new BlobRequest();
        blobRequest.areaSecret = AREA_SECRET;
        blobRequest.domainName = PedidosConstants.DOMAIN;
        blobRequest.serviceName = PedidosConstants.SERVICE;
        blobRequest.fileName = id;
        blobRequest.requirements = Arrays.asList(Requirement.Temporary, Requirement.External);
        blobRequest.supportedProtocols = Arrays.asList(Protocol.HTTP);
        blobRequest.targetObjectId = id;

        BlobDetails requestUploadOut = blobService.requestUpload(blobRequest, TIMEOUT);

        out.id = id;
        out.version = requestUploadOut.version;
        out.url = requestUploadOut.location.uri;

        return out;
    }

    public GravarFotoOutput gravarFoto(GravarFotoInput gravarFotoinput) {
        GravarFotoOutput out = new GravarFotoOutput();
        try { 
            BlobServiceStub blobService = getBlobService();
            CommitFileInput input = new CommitFileInput();
            input.domainName = PedidosConstants.DOMAIN;
            input.serviceName = PedidosConstants.SERVICE;
            input.areaSecret = AREA_SECRET;
            input.targetObject = gravarFotoinput.id;
            input.fileName = gravarFotoinput.id;
            input.version = gravarFotoinput.version;
            input.release = Boolean.TRUE;

            blobService.commitFile(input, TIMEOUT);
            out.result = FotoOperationResult.SUCCESS;
        } catch(Exception e) {
            out.result = FotoOperationResult.ERROR;
        }
        return out;
    }


    public  ObterUrlDownloadFotoOutput obterUrlDownloadFoto(ObterUrlDownloadFotoInput input) {
        BlobServiceStub blobService = getBlobService();
        BlobRequest request = new BlobRequest();
        request.domainName = PedidosConstants.DOMAIN;
        request.serviceName = PedidosConstants.SERVICE;
        request.areaSecret = AREA_SECRET;
        request.fileName = input.id;
        request.targetObjectId = input.id;
        request.ttl = Long.valueOf(1000 * 60L);
        request.requirements = Arrays.asList(Requirement.Open, Requirement.External);
        BlobDetails requestAccess = blobService.requestAccess(request, TIMEOUT);

        ObterUrlDownloadFotoOutput out = new ObterUrlDownloadFotoOutput();
        out.url = requestAccess.location.uri;

        return out;
    }


    private void createArea() {
        BlobServiceStub blobService = getBlobService();
        CreateAreaInput createAreaInput = new CreateAreaInput();
        createAreaInput.areaSecret = AREA_SECRET;
        createAreaInput.domainName = PedidosConstants.DOMAIN;
        createAreaInput.serviceName = PedidosConstants.SERVICE;

        blobService.createArea(createAreaInput);
    }


}
