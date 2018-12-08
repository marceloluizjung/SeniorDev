/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.varejo.pedidos;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.varejo.pedidos.CreateBulkClienteOutput;

/**
* Response method for createBulkCliente
*/
@CommandDescription(name="createBulkClienteResponse", kind=CommandKind.ResponseCommand, requestPrimitive="createBulkClienteResponse")
public interface CreateBulkClienteResponse extends MessageHandler {

	void createBulkClienteResponse(CreateBulkClienteOutput response);
	
	void createBulkClienteResponseError(ErrorPayload error);

}
