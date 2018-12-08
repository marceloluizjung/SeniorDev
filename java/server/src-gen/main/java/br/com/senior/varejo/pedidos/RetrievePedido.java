/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.varejo.pedidos;

import br.com.senior.messaging.model.*;

/**
 * The 'retrieve' request primitive for the Pedido entity.
 */
@CommandDescription(name="retrievePedido", kind=CommandKind.Retrieve, requestPrimitive="retrievePedido", responsePrimitive="retrievePedidoResponse")
public interface RetrievePedido extends MessageHandler {
    
    public Pedido retrievePedido(Pedido.Id id);
    
}
