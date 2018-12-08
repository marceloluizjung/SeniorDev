/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.varejo.pedidos;

import br.com.senior.messaging.model.*;

/**
 * The 'list' request primitive for the Cliente entity.
 */
@CommandDescription(name="listCliente", kind=CommandKind.List, requestPrimitive="listCliente", responsePrimitive="listClienteResponse")
public interface ListCliente extends MessageHandler {
    
    public Cliente.PagedResults listCliente(Cliente.PageRequest pageRequest);
    
}
