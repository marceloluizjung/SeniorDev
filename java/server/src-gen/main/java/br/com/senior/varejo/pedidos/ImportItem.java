/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.varejo.pedidos;

import br.com.senior.messaging.model.*;

@CommandDescription(name="importItem", kind=CommandKind.Action, requestPrimitive="importItem", responsePrimitive="importItemResponse")
public interface ImportItem extends MessageHandler {
    
    public ImportItemOutput importItem(ImportItemInput request);
    
}
