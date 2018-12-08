/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.varejo.pedidos;

import br.com.senior.messaging.model.*;

/**
 * The 'create' request primitive for the Pedido entity.
 */
@CommandDescription(name="createPedido", kind=CommandKind.Create, requestPrimitive="createPedido", responsePrimitive="createPedidoResponse")
public interface CreatePedido extends MessageHandler {
    
    public Pedido createPedido(Pedido toCreate);
    
}
