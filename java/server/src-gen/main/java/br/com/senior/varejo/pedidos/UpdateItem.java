/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.varejo.pedidos;

import br.com.senior.messaging.model.*;

/**
 * The 'update' request primitive for the Item entity.
 */
@CommandDescription(name="updateItem", kind=CommandKind.Update, requestPrimitive="updateItem", responsePrimitive="updateItemResponse")
public interface UpdateItem extends MessageHandler {
    
    public Item updateItem(Item toUpdate);
    
}
