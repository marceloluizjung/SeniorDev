/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.varejo.pedidos;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.varejo.pedidos.Cliente;

/**
* Response method for updateMergeCliente
*/
@CommandDescription(name="updateMergeClienteResponse", kind=CommandKind.ResponseCommand, requestPrimitive="updateMergeClienteResponse")
public interface UpdateMergeClienteResponse extends MessageHandler {

	void updateMergeClienteResponse(Cliente response);
	
	void updateMergeClienteResponseError(ErrorPayload error);

}
