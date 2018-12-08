/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.varejo.pedidos;

import br.com.senior.messaging.model.*;

/**
 * The 'createMerge' request primitive for the Item entity.
 */
@CommandDescription(name="createMergeItem", kind=CommandKind.CreateMerge, requestPrimitive="createMergeItem", responsePrimitive="createMergeItemResponse")
public interface CreateMergeItem extends MessageHandler {
    
    public Item createMergeItem(Item toCreateMerge);
    
}
