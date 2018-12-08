package br.com.senior.varejo.pedidos;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.senior.messaging.model.HandlerImpl;

@HandlerImpl
public class GravarFotoImpl implements GravarFoto {

    @Autowired
    ClienteFotoService clienteFotoService;

    @Override
    public GravarFotoOutput gravarFoto(GravarFotoInput request) {
        return clienteFotoService.gravarFoto(request);
    }

}
