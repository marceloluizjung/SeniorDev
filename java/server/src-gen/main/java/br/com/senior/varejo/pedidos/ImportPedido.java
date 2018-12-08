/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.varejo.pedidos;

import br.com.senior.messaging.model.*;

@CommandDescription(name="importPedido", kind=CommandKind.Action, requestPrimitive="importPedido", responsePrimitive="importPedidoResponse")
public interface ImportPedido extends MessageHandler {
    
    public ImportPedidoOutput importPedido(ImportPedidoInput request);
    
}
