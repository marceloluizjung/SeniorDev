/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.varejo.pedidos;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.varejo.pedidos.Item;

/**
* Response method for createMergeItem
*/
@CommandDescription(name="createMergeItemResponse", kind=CommandKind.ResponseCommand, requestPrimitive="createMergeItemResponse")
public interface CreateMergeItemResponse extends MessageHandler {

	void createMergeItemResponse(Item response);
	
	void createMergeItemResponseError(ErrorPayload error);

}
