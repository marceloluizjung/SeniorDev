/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.varejo.pedidos;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.varejo.pedidos.ImportClienteOutput;

/**
* Response method for importCliente
*/
@CommandDescription(name="importClienteResponse", kind=CommandKind.ResponseCommand, requestPrimitive="importClienteResponse")
public interface ImportClienteResponse extends MessageHandler {

	void importClienteResponse(ImportClienteOutput response);
	
	void importClienteResponseError(ErrorPayload error);

}
