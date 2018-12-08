/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.varejo.pedidos;

import br.com.senior.messaging.model.*;

@CommandDescription(name="exportCliente", kind=CommandKind.Query, requestPrimitive="exportCliente", responsePrimitive="exportClienteResponse")
public interface ExportCliente extends MessageHandler {
    
    public ExportClienteOutput exportCliente(ExportClienteInput request);
    
}
