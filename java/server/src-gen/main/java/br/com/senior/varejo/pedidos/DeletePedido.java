/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.varejo.pedidos;

import br.com.senior.messaging.model.*;

/**
 * The 'delete' request primitive for the Pedido entity.
 */
@CommandDescription(name="deletePedido", kind=CommandKind.Delete, requestPrimitive="deletePedido", responsePrimitive="deletePedidoResponse")
public interface DeletePedido extends MessageHandler {
    
    public void deletePedido(Pedido.Id id);
    
}
