/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.varejo.pedidos;

import br.com.senior.messaging.model.*;

/**
 * The 'create' request primitive for the Item entity.
 */
@CommandDescription(name="createItem", kind=CommandKind.Create, requestPrimitive="createItem", responsePrimitive="createItemResponse")
public interface CreateItem extends MessageHandler {
    
    public Item createItem(Item toCreate);
    
}
