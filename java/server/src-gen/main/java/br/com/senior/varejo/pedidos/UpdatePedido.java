/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.varejo.pedidos;

import br.com.senior.messaging.model.*;

/**
 * The 'update' request primitive for the Pedido entity.
 */
@CommandDescription(name="updatePedido", kind=CommandKind.Update, requestPrimitive="updatePedido", responsePrimitive="updatePedidoResponse")
public interface UpdatePedido extends MessageHandler {
    
    public Pedido updatePedido(Pedido toUpdate);
    
}
