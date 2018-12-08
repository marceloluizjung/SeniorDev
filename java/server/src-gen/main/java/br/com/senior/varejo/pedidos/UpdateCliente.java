/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.varejo.pedidos;

import br.com.senior.messaging.model.*;

/**
 * The 'update' request primitive for the Cliente entity.
 */
@CommandDescription(name="updateCliente", kind=CommandKind.Update, requestPrimitive="updateCliente", responsePrimitive="updateClienteResponse")
public interface UpdateCliente extends MessageHandler {
    
    public Cliente updateCliente(Cliente toUpdate);
    
}
