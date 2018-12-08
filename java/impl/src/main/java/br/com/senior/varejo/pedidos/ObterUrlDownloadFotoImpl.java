package br.com.senior.varejo.pedidos;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.senior.messaging.model.HandlerImpl;

@HandlerImpl
public class ObterUrlDownloadFotoImpl implements ObterUrlDownloadFoto {

    @Autowired
    ClienteFotoService clienteFotoService;

    @Override
    public ObterUrlDownloadFotoOutput obterUrlDownloadFoto(ObterUrlDownloadFotoInput request) {
        return clienteFotoService.obterUrlDownloadFoto(request);
    }

}
