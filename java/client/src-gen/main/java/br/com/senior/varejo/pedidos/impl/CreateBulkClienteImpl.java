/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.varejo.pedidos.impl;

import java.util.function.Supplier;

import br.com.senior.messaging.ErrorCategory;
import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.IMessenger;
import br.com.senior.messaging.Message;
import br.com.senior.messaging.utils.DtoJsonConverter;
import br.com.senior.sdl.user.UserIdentifier;			

import br.com.senior.varejo.pedidos.*;
import java.util.concurrent.CompletableFuture;

import br.com.senior.messaging.model.ServiceContext;
import br.com.senior.messaging.model.ServiceException;
import br.com.senior.messaging.model.ServiceRunner;
import br.com.senior.varejo.pedidos.CreateBulkClienteInput;
import br.com.senior.varejo.pedidos.CreateBulkClienteOutput;

/**
* 
*/
public class CreateBulkClienteImpl {

	private final Supplier<IMessenger> messengerSupplier;

	private final UserIdentifier userId;

	private final Supplier<Message> messageSupplier;

	public CreateBulkClienteImpl(Supplier<IMessenger> messengerSupplier, UserIdentifier userId, Supplier<Message> messageSupplier) {
		this.messengerSupplier = messengerSupplier;
		this.userId = userId;
		this.messageSupplier = messageSupplier;
	}

	private Message createMessage(CreateBulkClienteInput input) {
		if (messageSupplier != null && messageSupplier.get() != null) {
			return messageSupplier.get().followUp( //
				PedidosConstants.DOMAIN, //
				PedidosConstants.SERVICE, //
				PedidosConstants.Commands.CREATE_BULK_CLIENTE, //
				DtoJsonConverter.toJSON(input));
		}
		return new Message(userId.getTenant(), //
			PedidosConstants.DOMAIN, //
			PedidosConstants.SERVICE, //
			PedidosConstants.Commands.CREATE_BULK_CLIENTE, //
			DtoJsonConverter.toJSON(input));
	}
	
	/**
	* Chamada síncrona para o método createBulkCliente
	* This is a public operation
	* The 'createBulk' request primitive for the Cliente entity. 
	* @throws PedidosMessageException quando um erro com payload for retornado pela mensageria
	*/
	public CreateBulkClienteOutput createBulkCliente(CreateBulkClienteInput input, long timeout) {
		PedidosValidator.validate(input);
		
		Message message = createMessage(input);
		Message resultMessage; 
		try {
			addMessageHeaders(message);
			resultMessage = messengerSupplier.get().requestSync(message, timeout);
			messengerSupplier.get().ack(resultMessage);
		} catch (Exception e) {
			throw new PedidosException("Erro ao enviar a mensagem", e);
		}
		
		if (resultMessage == null) {
			throw new PedidosException("Retorno inválido");
		}
		
		if (resultMessage.isError()) {
			ErrorPayload error = DtoJsonConverter.toDTO(resultMessage.getContent(), ErrorPayload.class);
			throw new PedidosMessageException(resultMessage.getErrorCategory(), error.getMessage(), error.getErrorCode());
		}
		CreateBulkClienteOutput output = DtoJsonConverter.toDTO(resultMessage.getContent(), CreateBulkClienteOutput.class);
		if (output == null) {
			throw new PedidosException("Contéudo do retorno inválido");
		}
		return output;
	}
	
	/**
	* Chamada assíncrona para o método createBulkCliente
	* This is a public operation
	* The 'createBulk' request primitive for the Cliente entity.
	*/
	public void createBulkCliente(CreateBulkClienteInput input) {
		PedidosValidator.validate(input);
		
		Message message = createMessage(input);
		try {
			addMessageHeaders(message);
			messengerSupplier.get().send(message);
		} catch (Exception e) {
			throw new PedidosException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	* Chamada assíncrona para o método createBulkCliente
	* This is a public operation
	* The 'createBulk' request primitive for the Cliente entity.
	*/
	public CompletableFuture<CreateBulkClienteOutput> createBulkClienteRequest(CreateBulkClienteInput input) {
		PedidosValidator.validate(input);
	
		if (ServiceContext.get() == null) {
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, "Service Context não iniciado. Erro ao efetuar request da mensagem");
		}
		ServiceRunner serviceRunner = ServiceContext.get().getCurrentServiceRunner();
		Message message = createMessage(input);
		addMessageHeaders(message);
		return serviceRunner.request(message, CreateBulkClienteOutput.class);
	}
	private void addMessageHeaders(Message message) {
		message.setUsername(userId.getUsername());
		if (userId.isTrusted()) {
			message.addHeader("trusted", true);
		}
	}
}
