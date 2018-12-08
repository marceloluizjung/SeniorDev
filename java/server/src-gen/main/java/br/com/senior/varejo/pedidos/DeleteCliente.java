/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.varejo.pedidos;

import br.com.senior.messaging.model.*;

/**
 * The 'delete' request primitive for the Cliente entity.
 */
@CommandDescription(name="deleteCliente", kind=CommandKind.Delete, requestPrimitive="deleteCliente", responsePrimitive="deleteClienteResponse")
public interface DeleteCliente extends MessageHandler {
    
    public void deleteCliente(Cliente.Id id);
    
}
