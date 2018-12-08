/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.varejo.pedidos;

import br.com.senior.messaging.model.*;

@CommandDescription(name="exportItem", kind=CommandKind.Query, requestPrimitive="exportItem", responsePrimitive="exportItemResponse")
public interface ExportItem extends MessageHandler {
    
    public ExportItemOutput exportItem(ExportItemInput request);
    
}
