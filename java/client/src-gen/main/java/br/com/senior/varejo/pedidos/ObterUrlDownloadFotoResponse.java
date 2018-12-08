/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.varejo.pedidos;	

import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.model.CommandDescription;
import br.com.senior.messaging.model.CommandKind;
import br.com.senior.messaging.model.MessageHandler;
import br.com.senior.varejo.pedidos.ObterUrlDownloadFotoOutput;

/**
* Response method for obterUrlDownloadFoto
*/
@CommandDescription(name="obterUrlDownloadFotoResponse", kind=CommandKind.ResponseCommand, requestPrimitive="obterUrlDownloadFotoResponse")
public interface ObterUrlDownloadFotoResponse extends MessageHandler {

	void obterUrlDownloadFotoResponse(ObterUrlDownloadFotoOutput response);
	
	void obterUrlDownloadFotoResponseError(ErrorPayload error);

}
