/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.varejo.pedidos;

import br.com.senior.messaging.model.*;

@CommandDescription(name = "createBulkItem", kind = CommandKind.Create, requestPrimitive = "createBulkItem", responsePrimitive="")
public interface CreateBulkItem extends MessageHandler {
    public CreateBulkItemOutput createBulkItem(CreateBulkItemInput toCreate);
}
