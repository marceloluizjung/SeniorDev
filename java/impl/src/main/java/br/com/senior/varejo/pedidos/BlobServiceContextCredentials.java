package br.com.senior.varejo.pedidos;

import br.com.senior.messaging.model.ServiceContext;
import br.com.senior.platform.blobservice.CredentialsProvider;

public class BlobServiceContextCredentials implements CredentialsProvider  {

    @Override
    public String getUsername() {
        return ServiceContext.get().getCurrentUsername();
    }

    @Override
    public void setUsername(String username) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String getTenant() {
        String tenant = ServiceContext.get().getCurrentTenant();
        return tenant == null ? "" : tenant;
    }

    @Override
    public void setTenant(String tenant) {
        throw new UnsupportedOperationException();
    }

    
}
