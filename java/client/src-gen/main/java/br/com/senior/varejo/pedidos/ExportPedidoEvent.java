/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.varejo.pedidos;

import br.com.senior.messaging.model.*;

@SubscriptionDescription(domain="varejo", service="pedidos", event="exportPedidoEvent")
public interface ExportPedidoEvent extends MessageHandler {
    public void exportPedidoEvent(ExportPedidoEventPayload payload);
    
}
