/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.varejo.pedidos;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.varejo.pedidos.ImportItemOutput;

/**
* Response method for importItem
*/
@CommandDescription(name="importItemResponse", kind=CommandKind.ResponseCommand, requestPrimitive="importItemResponse")
public interface ImportItemResponse extends MessageHandler {

	void importItemResponse(ImportItemOutput response);
	
	void importItemResponseError(ErrorPayload error);

}
