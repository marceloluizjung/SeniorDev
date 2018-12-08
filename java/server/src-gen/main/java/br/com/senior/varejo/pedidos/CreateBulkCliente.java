/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.varejo.pedidos;

import br.com.senior.messaging.model.*;

@CommandDescription(name = "createBulkCliente", kind = CommandKind.Create, requestPrimitive = "createBulkCliente", responsePrimitive="")
public interface CreateBulkCliente extends MessageHandler {
    public CreateBulkClienteOutput createBulkCliente(CreateBulkClienteInput toCreate);
}
