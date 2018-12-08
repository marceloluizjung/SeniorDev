/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.varejo.pedidos;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.varejo.pedidos.ExportClienteOutput;

/**
* Response method for exportCliente
*/
@CommandDescription(name="exportClienteResponse", kind=CommandKind.ResponseCommand, requestPrimitive="exportClienteResponse")
public interface ExportClienteResponse extends MessageHandler {

	void exportClienteResponse(ExportClienteOutput response);
	
	void exportClienteResponseError(ErrorPayload error);

}
