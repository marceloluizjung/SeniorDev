package br.com.senior.varejo.pedidos;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.senior.messaging.model.HandlerImpl;

@HandlerImpl
public class ObterUrlUploadFotoImpl implements ObterUrlUploadFoto {

    @Autowired
    ClienteFotoService clienteFotoService;

    @Override
    public ObterUrlUploadFotoOutput obterUrlUploadFoto(ObterUrlUploadFotoInput request) {
        return clienteFotoService.obterUrlUploadFoto(request.id);
    }

}
