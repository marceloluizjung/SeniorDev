/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.varejo.pedidos;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.varejo.pedidos.ObterUrlUploadFotoOutput;

/**
* Response method for obterUrlUploadFoto
*/
@CommandDescription(name="obterUrlUploadFotoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="obterUrlUploadFotoResponse")
public interface ObterUrlUploadFotoResponse extends MessageHandler {

	void obterUrlUploadFotoResponse(ObterUrlUploadFotoOutput response);
	
	void obterUrlUploadFotoResponseError(ErrorPayload error);

}
