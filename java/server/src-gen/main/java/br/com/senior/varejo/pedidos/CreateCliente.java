/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.varejo.pedidos;

import br.com.senior.messaging.model.*;

/**
 * The 'create' request primitive for the Cliente entity.
 */
@CommandDescription(name="createCliente", kind=CommandKind.Create, requestPrimitive="createCliente", responsePrimitive="createClienteResponse")
public interface CreateCliente extends MessageHandler {
    
    public Cliente createCliente(Cliente toCreate);
    
}
