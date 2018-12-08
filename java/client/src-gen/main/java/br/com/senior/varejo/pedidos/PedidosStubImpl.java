/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.varejo.pedidos;

import java.util.function.Supplier;

import br.com.senior.messaging.Message;
import br.com.senior.messaging.IMessenger;
import br.com.senior.messaging.utils.DtoJsonConverter;
import br.com.senior.sdl.user.UserIdentifier;

import br.com.senior.varejo.pedidos.impl.*;
import java.util.concurrent.CompletableFuture;
import br.com.senior.varejo.pedidos.HelloWorldInput;
import br.com.senior.varejo.pedidos.HelloWorldOutput;
import br.com.senior.varejo.pedidos.ObterUrlUploadFotoInput;
import br.com.senior.varejo.pedidos.ObterUrlUploadFotoOutput;
import br.com.senior.varejo.pedidos.GravarFotoInput;
import br.com.senior.varejo.pedidos.GravarFotoOutput;
import br.com.senior.varejo.pedidos.ObterUrlDownloadFotoInput;
import br.com.senior.varejo.pedidos.ObterUrlDownloadFotoOutput;
import br.com.senior.varejo.pedidos.GetMetadataInput;
import br.com.senior.varejo.pedidos.GetMetadataOutput;
import br.com.senior.varejo.pedidos.ImportClienteInput;
import br.com.senior.varejo.pedidos.ImportClienteOutput;
import br.com.senior.varejo.pedidos.ExportClienteInput;
import br.com.senior.varejo.pedidos.ExportClienteOutput;
import br.com.senior.varejo.pedidos.ImportItemInput;
import br.com.senior.varejo.pedidos.ImportItemOutput;
import br.com.senior.varejo.pedidos.ExportItemInput;
import br.com.senior.varejo.pedidos.ExportItemOutput;
import br.com.senior.varejo.pedidos.ImportPedidoInput;
import br.com.senior.varejo.pedidos.ImportPedidoOutput;
import br.com.senior.varejo.pedidos.ExportPedidoInput;
import br.com.senior.varejo.pedidos.ExportPedidoOutput;
import br.com.senior.varejo.pedidos.GetDependenciesOutput;
import br.com.senior.varejo.pedidos.Cliente;
import br.com.senior.varejo.pedidos.CreateBulkClienteInput;
import br.com.senior.varejo.pedidos.CreateBulkClienteOutput;
import br.com.senior.varejo.pedidos.Item;
import br.com.senior.varejo.pedidos.CreateBulkItemInput;
import br.com.senior.varejo.pedidos.CreateBulkItemOutput;
import br.com.senior.varejo.pedidos.Pedido;
import br.com.senior.varejo.pedidos.CreateBulkPedidoInput;
import br.com.senior.varejo.pedidos.CreateBulkPedidoOutput;
import br.com.senior.varejo.pedidos.ServiceStartedPayload;
import br.com.senior.varejo.pedidos.NotifyUserEventPayload;
import br.com.senior.varejo.pedidos.ImportClienteEventPayload;
import br.com.senior.varejo.pedidos.ExportClienteEventPayload;
import br.com.senior.varejo.pedidos.ImportItemEventPayload;
import br.com.senior.varejo.pedidos.ExportItemEventPayload;
import br.com.senior.varejo.pedidos.ImportPedidoEventPayload;
import br.com.senior.varejo.pedidos.ExportPedidoEventPayload;

/**
* 
*/
public class PedidosStubImpl implements PedidosStub {

	private final Supplier<IMessenger> messengerSupplier;

	private final UserIdentifier userId;

	private final Supplier<Message> messageSupplier;

	/**
	 * Use {@link #ManufaturaJsonStubImpl(MessengerSupplier, UserIdentifier, MessageSupplier)} instead.
	 */
	@Deprecated
	public PedidosStubImpl(IMessenger messenger, UserIdentifier userId) {
		this(new InstanceMessengerSupplier(messenger), userId, null);
	}

	/**
	 * @param messengerSupplier Supplies current service messenger.
	 * @param userId Provides tenant and user name to send or publish messages.
	 * @param messageSupplier Supplies current message being processed by service. Used to send messages by foolowup.
	 */
	public PedidosStubImpl(Supplier<IMessenger> messengerSupplier, UserIdentifier userId, Supplier<Message> messageSupplier) {
		this.messengerSupplier = messengerSupplier;
		this.userId = userId;
		this.messageSupplier = messageSupplier;
	}

	/**
	* Chamada síncrona para o método helloWorld
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	* 
	* @throws PedidosMessageException quando um erro com payload for retornado pela mensageria
	*/
	@Override
	public HelloWorldOutput helloWorld(HelloWorldInput input, long timeout) {
		HelloWorldImpl impl = new HelloWorldImpl(messengerSupplier, userId, messageSupplier);
		return impl.helloWorld(input, timeout);
	}
	
	/**
	* Chamada assíncrona para o método helloWorld
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	* 
	*/
	@Override
	public void helloWorld(HelloWorldInput input) {
		HelloWorldImpl impl = new HelloWorldImpl(messengerSupplier, userId, messageSupplier);
		impl.helloWorld(input);
	}
	
	/**
	* Chamada assíncrona para o método helloWorld
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	* 
	*/
	@Override
	public CompletableFuture<HelloWorldOutput> helloWorldRequest(HelloWorldInput input) {
		HelloWorldImpl impl = new HelloWorldImpl(messengerSupplier, userId, messageSupplier);
		return impl.helloWorldRequest(input);
	}
	/**
	* Chamada síncrona para o método obterUrlUploadFoto
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	* Obtém a URL para upload da foto
	* @throws PedidosMessageException quando um erro com payload for retornado pela mensageria
	*/
	@Override
	public ObterUrlUploadFotoOutput obterUrlUploadFoto(ObterUrlUploadFotoInput input, long timeout) {
		ObterUrlUploadFotoImpl impl = new ObterUrlUploadFotoImpl(messengerSupplier, userId, messageSupplier);
		return impl.obterUrlUploadFoto(input, timeout);
	}
	
	/**
	* Chamada assíncrona para o método obterUrlUploadFoto
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	* Obtém a URL para upload da foto
	*/
	@Override
	public void obterUrlUploadFoto(ObterUrlUploadFotoInput input) {
		ObterUrlUploadFotoImpl impl = new ObterUrlUploadFotoImpl(messengerSupplier, userId, messageSupplier);
		impl.obterUrlUploadFoto(input);
	}
	
	/**
	* Chamada assíncrona para o método obterUrlUploadFoto
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	* Obtém a URL para upload da foto
	*/
	@Override
	public CompletableFuture<ObterUrlUploadFotoOutput> obterUrlUploadFotoRequest(ObterUrlUploadFotoInput input) {
		ObterUrlUploadFotoImpl impl = new ObterUrlUploadFotoImpl(messengerSupplier, userId, messageSupplier);
		return impl.obterUrlUploadFotoRequest(input);
	}
	/**
	* Chamada síncrona para o método gravarFoto
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	* Grava a foto que foi upada
	* @throws PedidosMessageException quando um erro com payload for retornado pela mensageria
	*/
	@Override
	public GravarFotoOutput gravarFoto(GravarFotoInput input, long timeout) {
		GravarFotoImpl impl = new GravarFotoImpl(messengerSupplier, userId, messageSupplier);
		return impl.gravarFoto(input, timeout);
	}
	
	/**
	* Chamada assíncrona para o método gravarFoto
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	* Grava a foto que foi upada
	*/
	@Override
	public void gravarFoto(GravarFotoInput input) {
		GravarFotoImpl impl = new GravarFotoImpl(messengerSupplier, userId, messageSupplier);
		impl.gravarFoto(input);
	}
	
	/**
	* Chamada assíncrona para o método gravarFoto
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	* Grava a foto que foi upada
	*/
	@Override
	public CompletableFuture<GravarFotoOutput> gravarFotoRequest(GravarFotoInput input) {
		GravarFotoImpl impl = new GravarFotoImpl(messengerSupplier, userId, messageSupplier);
		return impl.gravarFotoRequest(input);
	}
	/**
	* Chamada síncrona para o método obterUrlDownloadFoto
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	* Obtém a URL para download da foto
	* @throws PedidosMessageException quando um erro com payload for retornado pela mensageria
	*/
	@Override
	public ObterUrlDownloadFotoOutput obterUrlDownloadFoto(ObterUrlDownloadFotoInput input, long timeout) {
		ObterUrlDownloadFotoImpl impl = new ObterUrlDownloadFotoImpl(messengerSupplier, userId, messageSupplier);
		return impl.obterUrlDownloadFoto(input, timeout);
	}
	
	/**
	* Chamada assíncrona para o método obterUrlDownloadFoto
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	* Obtém a URL para download da foto
	*/
	@Override
	public void obterUrlDownloadFoto(ObterUrlDownloadFotoInput input) {
		ObterUrlDownloadFotoImpl impl = new ObterUrlDownloadFotoImpl(messengerSupplier, userId, messageSupplier);
		impl.obterUrlDownloadFoto(input);
	}
	
	/**
	* Chamada assíncrona para o método obterUrlDownloadFoto
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	* Obtém a URL para download da foto
	*/
	@Override
	public CompletableFuture<ObterUrlDownloadFotoOutput> obterUrlDownloadFotoRequest(ObterUrlDownloadFotoInput input) {
		ObterUrlDownloadFotoImpl impl = new ObterUrlDownloadFotoImpl(messengerSupplier, userId, messageSupplier);
		return impl.obterUrlDownloadFotoRequest(input);
	}
	/**
	* Chamada síncrona para o método getMetadata
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	* Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
	* @throws PedidosMessageException quando um erro com payload for retornado pela mensageria
	*/
	@Override
	public GetMetadataOutput getMetadata(GetMetadataInput input, long timeout) {
		GetMetadataImpl impl = new GetMetadataImpl(messengerSupplier, userId, messageSupplier);
		return impl.getMetadata(input, timeout);
	}
	
	/**
	* Chamada assíncrona para o método getMetadata
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	* Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
	*/
	@Override
	public void getMetadata(GetMetadataInput input) {
		GetMetadataImpl impl = new GetMetadataImpl(messengerSupplier, userId, messageSupplier);
		impl.getMetadata(input);
	}
	
	/**
	* Chamada assíncrona para o método getMetadata
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	* Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
	*/
	@Override
	public CompletableFuture<GetMetadataOutput> getMetadataRequest(GetMetadataInput input) {
		GetMetadataImpl impl = new GetMetadataImpl(messengerSupplier, userId, messageSupplier);
		return impl.getMetadataRequest(input);
	}
	/**
	* Chamada síncrona para o método importCliente
	* This is a public operation
	* 
	* @throws PedidosMessageException quando um erro com payload for retornado pela mensageria
	*/
	@Override
	public ImportClienteOutput importCliente(ImportClienteInput input, long timeout) {
		ImportClienteImpl impl = new ImportClienteImpl(messengerSupplier, userId, messageSupplier);
		return impl.importCliente(input, timeout);
	}
	
	/**
	* Chamada assíncrona para o método importCliente
	* This is a public operation
	* 
	*/
	@Override
	public void importCliente(ImportClienteInput input) {
		ImportClienteImpl impl = new ImportClienteImpl(messengerSupplier, userId, messageSupplier);
		impl.importCliente(input);
	}
	
	/**
	* Chamada assíncrona para o método importCliente
	* This is a public operation
	* 
	*/
	@Override
	public CompletableFuture<ImportClienteOutput> importClienteRequest(ImportClienteInput input) {
		ImportClienteImpl impl = new ImportClienteImpl(messengerSupplier, userId, messageSupplier);
		return impl.importClienteRequest(input);
	}
	/**
	* Chamada síncrona para o método exportCliente
	* This is a public operation
	* 
	* @throws PedidosMessageException quando um erro com payload for retornado pela mensageria
	*/
	@Override
	public ExportClienteOutput exportCliente(ExportClienteInput input, long timeout) {
		ExportClienteImpl impl = new ExportClienteImpl(messengerSupplier, userId, messageSupplier);
		return impl.exportCliente(input, timeout);
	}
	
	/**
	* Chamada assíncrona para o método exportCliente
	* This is a public operation
	* 
	*/
	@Override
	public void exportCliente(ExportClienteInput input) {
		ExportClienteImpl impl = new ExportClienteImpl(messengerSupplier, userId, messageSupplier);
		impl.exportCliente(input);
	}
	
	/**
	* Chamada assíncrona para o método exportCliente
	* This is a public operation
	* 
	*/
	@Override
	public CompletableFuture<ExportClienteOutput> exportClienteRequest(ExportClienteInput input) {
		ExportClienteImpl impl = new ExportClienteImpl(messengerSupplier, userId, messageSupplier);
		return impl.exportClienteRequest(input);
	}
	/**
	* Chamada síncrona para o método importItem
	* This is a public operation
	* 
	* @throws PedidosMessageException quando um erro com payload for retornado pela mensageria
	*/
	@Override
	public ImportItemOutput importItem(ImportItemInput input, long timeout) {
		ImportItemImpl impl = new ImportItemImpl(messengerSupplier, userId, messageSupplier);
		return impl.importItem(input, timeout);
	}
	
	/**
	* Chamada assíncrona para o método importItem
	* This is a public operation
	* 
	*/
	@Override
	public void importItem(ImportItemInput input) {
		ImportItemImpl impl = new ImportItemImpl(messengerSupplier, userId, messageSupplier);
		impl.importItem(input);
	}
	
	/**
	* Chamada assíncrona para o método importItem
	* This is a public operation
	* 
	*/
	@Override
	public CompletableFuture<ImportItemOutput> importItemRequest(ImportItemInput input) {
		ImportItemImpl impl = new ImportItemImpl(messengerSupplier, userId, messageSupplier);
		return impl.importItemRequest(input);
	}
	/**
	* Chamada síncrona para o método exportItem
	* This is a public operation
	* 
	* @throws PedidosMessageException quando um erro com payload for retornado pela mensageria
	*/
	@Override
	public ExportItemOutput exportItem(ExportItemInput input, long timeout) {
		ExportItemImpl impl = new ExportItemImpl(messengerSupplier, userId, messageSupplier);
		return impl.exportItem(input, timeout);
	}
	
	/**
	* Chamada assíncrona para o método exportItem
	* This is a public operation
	* 
	*/
	@Override
	public void exportItem(ExportItemInput input) {
		ExportItemImpl impl = new ExportItemImpl(messengerSupplier, userId, messageSupplier);
		impl.exportItem(input);
	}
	
	/**
	* Chamada assíncrona para o método exportItem
	* This is a public operation
	* 
	*/
	@Override
	public CompletableFuture<ExportItemOutput> exportItemRequest(ExportItemInput input) {
		ExportItemImpl impl = new ExportItemImpl(messengerSupplier, userId, messageSupplier);
		return impl.exportItemRequest(input);
	}
	/**
	* Chamada síncrona para o método importPedido
	* This is a public operation
	* 
	* @throws PedidosMessageException quando um erro com payload for retornado pela mensageria
	*/
	@Override
	public ImportPedidoOutput importPedido(ImportPedidoInput input, long timeout) {
		ImportPedidoImpl impl = new ImportPedidoImpl(messengerSupplier, userId, messageSupplier);
		return impl.importPedido(input, timeout);
	}
	
	/**
	* Chamada assíncrona para o método importPedido
	* This is a public operation
	* 
	*/
	@Override
	public void importPedido(ImportPedidoInput input) {
		ImportPedidoImpl impl = new ImportPedidoImpl(messengerSupplier, userId, messageSupplier);
		impl.importPedido(input);
	}
	
	/**
	* Chamada assíncrona para o método importPedido
	* This is a public operation
	* 
	*/
	@Override
	public CompletableFuture<ImportPedidoOutput> importPedidoRequest(ImportPedidoInput input) {
		ImportPedidoImpl impl = new ImportPedidoImpl(messengerSupplier, userId, messageSupplier);
		return impl.importPedidoRequest(input);
	}
	/**
	* Chamada síncrona para o método exportPedido
	* This is a public operation
	* 
	* @throws PedidosMessageException quando um erro com payload for retornado pela mensageria
	*/
	@Override
	public ExportPedidoOutput exportPedido(ExportPedidoInput input, long timeout) {
		ExportPedidoImpl impl = new ExportPedidoImpl(messengerSupplier, userId, messageSupplier);
		return impl.exportPedido(input, timeout);
	}
	
	/**
	* Chamada assíncrona para o método exportPedido
	* This is a public operation
	* 
	*/
	@Override
	public void exportPedido(ExportPedidoInput input) {
		ExportPedidoImpl impl = new ExportPedidoImpl(messengerSupplier, userId, messageSupplier);
		impl.exportPedido(input);
	}
	
	/**
	* Chamada assíncrona para o método exportPedido
	* This is a public operation
	* 
	*/
	@Override
	public CompletableFuture<ExportPedidoOutput> exportPedidoRequest(ExportPedidoInput input) {
		ExportPedidoImpl impl = new ExportPedidoImpl(messengerSupplier, userId, messageSupplier);
		return impl.exportPedidoRequest(input);
	}
	/**
	* Chamada síncrona para o método listCliente
	* This is a public operation
	* The 'list' request primitive for the Cliente entity.
	* @throws PedidosMessageException quando um erro com payload for retornado pela mensageria
	*/
	@Override
	public Cliente.PagedResults listCliente(Cliente.PageRequest input, long timeout) {
		ListClienteImpl impl = new ListClienteImpl(messengerSupplier, userId, messageSupplier);
		return impl.listCliente(input, timeout);
	}
	
	/**
	* Chamada assíncrona para o método listCliente
	* This is a public operation
	* The 'list' request primitive for the Cliente entity.
	*/
	@Override
	public void listCliente(Cliente.PageRequest input) {
		ListClienteImpl impl = new ListClienteImpl(messengerSupplier, userId, messageSupplier);
		impl.listCliente(input);
	}
	
	/**
	* Chamada assíncrona para o método listCliente
	* This is a public operation
	* The 'list' request primitive for the Cliente entity.
	*/
	@Override
	public CompletableFuture<Cliente.PagedResults> listClienteRequest(Cliente.PageRequest input) {
		ListClienteImpl impl = new ListClienteImpl(messengerSupplier, userId, messageSupplier);
		return impl.listClienteRequest(input);
	}
	/**
	* Chamada síncrona para o método listItem
	* This is a public operation
	* The 'list' request primitive for the Item entity.
	* @throws PedidosMessageException quando um erro com payload for retornado pela mensageria
	*/
	@Override
	public Item.PagedResults listItem(Item.PageRequest input, long timeout) {
		ListItemImpl impl = new ListItemImpl(messengerSupplier, userId, messageSupplier);
		return impl.listItem(input, timeout);
	}
	
	/**
	* Chamada assíncrona para o método listItem
	* This is a public operation
	* The 'list' request primitive for the Item entity.
	*/
	@Override
	public void listItem(Item.PageRequest input) {
		ListItemImpl impl = new ListItemImpl(messengerSupplier, userId, messageSupplier);
		impl.listItem(input);
	}
	
	/**
	* Chamada assíncrona para o método listItem
	* This is a public operation
	* The 'list' request primitive for the Item entity.
	*/
	@Override
	public CompletableFuture<Item.PagedResults> listItemRequest(Item.PageRequest input) {
		ListItemImpl impl = new ListItemImpl(messengerSupplier, userId, messageSupplier);
		return impl.listItemRequest(input);
	}
	/**
	* Chamada síncrona para o método listPedido
	* This is a public operation
	* The 'list' request primitive for the Pedido entity.
	* @throws PedidosMessageException quando um erro com payload for retornado pela mensageria
	*/
	@Override
	public Pedido.PagedResults listPedido(Pedido.PageRequest input, long timeout) {
		ListPedidoImpl impl = new ListPedidoImpl(messengerSupplier, userId, messageSupplier);
		return impl.listPedido(input, timeout);
	}
	
	/**
	* Chamada assíncrona para o método listPedido
	* This is a public operation
	* The 'list' request primitive for the Pedido entity.
	*/
	@Override
	public void listPedido(Pedido.PageRequest input) {
		ListPedidoImpl impl = new ListPedidoImpl(messengerSupplier, userId, messageSupplier);
		impl.listPedido(input);
	}
	
	/**
	* Chamada assíncrona para o método listPedido
	* This is a public operation
	* The 'list' request primitive for the Pedido entity.
	*/
	@Override
	public CompletableFuture<Pedido.PagedResults> listPedidoRequest(Pedido.PageRequest input) {
		ListPedidoImpl impl = new ListPedidoImpl(messengerSupplier, userId, messageSupplier);
		return impl.listPedidoRequest(input);
	}
	/**
	* Chamada síncrona para o método getDependencies
	* This is a public operation
	* Returns a list with all dependencies from this service, along with their respective versions
	* @throws PedidosMessageException quando um erro com payload for retornado pela mensageria
	*/
	@Override
	public GetDependenciesOutput getDependencies(long timeout) {
		GetDependenciesImpl impl = new GetDependenciesImpl(messengerSupplier, userId, messageSupplier);
		return impl.getDependencies(timeout);
	}
	
	/**
	* Chamada assíncrona para o método getDependencies
	* This is a public operation
	* Returns a list with all dependencies from this service, along with their respective versions
	*/
	@Override
	public void getDependencies() {
		GetDependenciesImpl impl = new GetDependenciesImpl(messengerSupplier, userId, messageSupplier);
		impl.getDependencies();
	}
	
	/**
	* Chamada assíncrona para o método getDependencies
	* This is a public operation
	* Returns a list with all dependencies from this service, along with their respective versions
	*/
	@Override
	public CompletableFuture<GetDependenciesOutput> getDependenciesRequest() {
		GetDependenciesImpl impl = new GetDependenciesImpl(messengerSupplier, userId, messageSupplier);
		return impl.getDependenciesRequest();
	}
	/**
	* Chamada síncrona para o método createCliente
	* This is a public operation
	* The 'create' request primitive for the Cliente entity.
	* @throws PedidosMessageException quando um erro com payload for retornado pela mensageria
	*/
	@Override
	public Cliente createCliente(Cliente input, long timeout) {
		CreateClienteImpl impl = new CreateClienteImpl(messengerSupplier, userId, messageSupplier);
		return impl.createCliente(input, timeout);
	}
	
	/**
	* Chamada assíncrona para o método createCliente
	* This is a public operation
	* The 'create' request primitive for the Cliente entity.
	*/
	@Override
	public void createCliente(Cliente input) {
		CreateClienteImpl impl = new CreateClienteImpl(messengerSupplier, userId, messageSupplier);
		impl.createCliente(input);
	}
	
	/**
	* Chamada assíncrona para o método createCliente
	* This is a public operation
	* The 'create' request primitive for the Cliente entity.
	*/
	@Override
	public CompletableFuture<Cliente> createClienteRequest(Cliente input) {
		CreateClienteImpl impl = new CreateClienteImpl(messengerSupplier, userId, messageSupplier);
		return impl.createClienteRequest(input);
	}
	/**
	* Chamada síncrona para o método createBulkCliente
	* This is a public operation
	* The 'createBulk' request primitive for the Cliente entity.
	* @throws PedidosMessageException quando um erro com payload for retornado pela mensageria
	*/
	@Override
	public CreateBulkClienteOutput createBulkCliente(CreateBulkClienteInput input, long timeout) {
		CreateBulkClienteImpl impl = new CreateBulkClienteImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkCliente(input, timeout);
	}
	
	/**
	* Chamada assíncrona para o método createBulkCliente
	* This is a public operation
	* The 'createBulk' request primitive for the Cliente entity.
	*/
	@Override
	public void createBulkCliente(CreateBulkClienteInput input) {
		CreateBulkClienteImpl impl = new CreateBulkClienteImpl(messengerSupplier, userId, messageSupplier);
		impl.createBulkCliente(input);
	}
	
	/**
	* Chamada assíncrona para o método createBulkCliente
	* This is a public operation
	* The 'createBulk' request primitive for the Cliente entity.
	*/
	@Override
	public CompletableFuture<CreateBulkClienteOutput> createBulkClienteRequest(CreateBulkClienteInput input) {
		CreateBulkClienteImpl impl = new CreateBulkClienteImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkClienteRequest(input);
	}
	/**
	* Chamada síncrona para o método createMergeCliente
	* This is a public operation
	* The 'createMerge' request primitive for the Cliente entity.
	* @throws PedidosMessageException quando um erro com payload for retornado pela mensageria
	*/
	@Override
	public Cliente createMergeCliente(Cliente input, long timeout) {
		CreateMergeClienteImpl impl = new CreateMergeClienteImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeCliente(input, timeout);
	}
	
	/**
	* Chamada assíncrona para o método createMergeCliente
	* This is a public operation
	* The 'createMerge' request primitive for the Cliente entity.
	*/
	@Override
	public void createMergeCliente(Cliente input) {
		CreateMergeClienteImpl impl = new CreateMergeClienteImpl(messengerSupplier, userId, messageSupplier);
		impl.createMergeCliente(input);
	}
	
	/**
	* Chamada assíncrona para o método createMergeCliente
	* This is a public operation
	* The 'createMerge' request primitive for the Cliente entity.
	*/
	@Override
	public CompletableFuture<Cliente> createMergeClienteRequest(Cliente input) {
		CreateMergeClienteImpl impl = new CreateMergeClienteImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeClienteRequest(input);
	}
	/**
	* Chamada síncrona para o método retrieveCliente
	* This is a public operation
	* The 'retrieve' request primitive for the Cliente entity.
	* @throws PedidosMessageException quando um erro com payload for retornado pela mensageria
	*/
	@Override
	public Cliente retrieveCliente(Cliente.Id input, long timeout) {
		RetrieveClienteImpl impl = new RetrieveClienteImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveCliente(input, timeout);
	}
	
	/**
	* Chamada assíncrona para o método retrieveCliente
	* This is a public operation
	* The 'retrieve' request primitive for the Cliente entity.
	*/
	@Override
	public void retrieveCliente(Cliente.Id input) {
		RetrieveClienteImpl impl = new RetrieveClienteImpl(messengerSupplier, userId, messageSupplier);
		impl.retrieveCliente(input);
	}
	
	/**
	* Chamada assíncrona para o método retrieveCliente
	* This is a public operation
	* The 'retrieve' request primitive for the Cliente entity.
	*/
	@Override
	public CompletableFuture<Cliente> retrieveClienteRequest(Cliente.Id input) {
		RetrieveClienteImpl impl = new RetrieveClienteImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveClienteRequest(input);
	}
	/**
	* Chamada síncrona para o método updateCliente
	* This is a public operation
	* The 'update' request primitive for the Cliente entity.
	* @throws PedidosMessageException quando um erro com payload for retornado pela mensageria
	*/
	@Override
	public Cliente updateCliente(Cliente input, long timeout) {
		UpdateClienteImpl impl = new UpdateClienteImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateCliente(input, timeout);
	}
	
	/**
	* Chamada assíncrona para o método updateCliente
	* This is a public operation
	* The 'update' request primitive for the Cliente entity.
	*/
	@Override
	public void updateCliente(Cliente input) {
		UpdateClienteImpl impl = new UpdateClienteImpl(messengerSupplier, userId, messageSupplier);
		impl.updateCliente(input);
	}
	
	/**
	* Chamada assíncrona para o método updateCliente
	* This is a public operation
	* The 'update' request primitive for the Cliente entity.
	*/
	@Override
	public CompletableFuture<Cliente> updateClienteRequest(Cliente input) {
		UpdateClienteImpl impl = new UpdateClienteImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateClienteRequest(input);
	}
	/**
	* Chamada síncrona para o método updateMergeCliente
	* This is a public operation
	* The 'updateMerge' request primitive for the Cliente entity.
	* @throws PedidosMessageException quando um erro com payload for retornado pela mensageria
	*/
	@Override
	public Cliente updateMergeCliente(Cliente input, long timeout) {
		UpdateMergeClienteImpl impl = new UpdateMergeClienteImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeCliente(input, timeout);
	}
	
	/**
	* Chamada assíncrona para o método updateMergeCliente
	* This is a public operation
	* The 'updateMerge' request primitive for the Cliente entity.
	*/
	@Override
	public void updateMergeCliente(Cliente input) {
		UpdateMergeClienteImpl impl = new UpdateMergeClienteImpl(messengerSupplier, userId, messageSupplier);
		impl.updateMergeCliente(input);
	}
	
	/**
	* Chamada assíncrona para o método updateMergeCliente
	* This is a public operation
	* The 'updateMerge' request primitive for the Cliente entity.
	*/
	@Override
	public CompletableFuture<Cliente> updateMergeClienteRequest(Cliente input) {
		UpdateMergeClienteImpl impl = new UpdateMergeClienteImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeClienteRequest(input);
	}
	/**
	* Chamada síncrona para o método deleteCliente
	* This is a public operation
	* The 'delete' request primitive for the Cliente entity.
	* @throws PedidosMessageException quando um erro com payload for retornado pela mensageria
	*/
	@Override
	public void deleteCliente(Cliente.Id input, long timeout) {
		DeleteClienteImpl impl = new DeleteClienteImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteCliente(input, timeout);
	}
	
	/**
	* Chamada assíncrona para o método deleteCliente
	* This is a public operation
	* The 'delete' request primitive for the Cliente entity.
	*/
	@Override
	public void deleteCliente(Cliente.Id input) {
		DeleteClienteImpl impl = new DeleteClienteImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteCliente(input);
	}
	
	/**
	* Chamada síncrona para o método createItem
	* This is a public operation
	* The 'create' request primitive for the Item entity.
	* @throws PedidosMessageException quando um erro com payload for retornado pela mensageria
	*/
	@Override
	public Item createItem(Item input, long timeout) {
		CreateItemImpl impl = new CreateItemImpl(messengerSupplier, userId, messageSupplier);
		return impl.createItem(input, timeout);
	}
	
	/**
	* Chamada assíncrona para o método createItem
	* This is a public operation
	* The 'create' request primitive for the Item entity.
	*/
	@Override
	public void createItem(Item input) {
		CreateItemImpl impl = new CreateItemImpl(messengerSupplier, userId, messageSupplier);
		impl.createItem(input);
	}
	
	/**
	* Chamada assíncrona para o método createItem
	* This is a public operation
	* The 'create' request primitive for the Item entity.
	*/
	@Override
	public CompletableFuture<Item> createItemRequest(Item input) {
		CreateItemImpl impl = new CreateItemImpl(messengerSupplier, userId, messageSupplier);
		return impl.createItemRequest(input);
	}
	/**
	* Chamada síncrona para o método createBulkItem
	* This is a public operation
	* The 'createBulk' request primitive for the Item entity.
	* @throws PedidosMessageException quando um erro com payload for retornado pela mensageria
	*/
	@Override
	public CreateBulkItemOutput createBulkItem(CreateBulkItemInput input, long timeout) {
		CreateBulkItemImpl impl = new CreateBulkItemImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkItem(input, timeout);
	}
	
	/**
	* Chamada assíncrona para o método createBulkItem
	* This is a public operation
	* The 'createBulk' request primitive for the Item entity.
	*/
	@Override
	public void createBulkItem(CreateBulkItemInput input) {
		CreateBulkItemImpl impl = new CreateBulkItemImpl(messengerSupplier, userId, messageSupplier);
		impl.createBulkItem(input);
	}
	
	/**
	* Chamada assíncrona para o método createBulkItem
	* This is a public operation
	* The 'createBulk' request primitive for the Item entity.
	*/
	@Override
	public CompletableFuture<CreateBulkItemOutput> createBulkItemRequest(CreateBulkItemInput input) {
		CreateBulkItemImpl impl = new CreateBulkItemImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkItemRequest(input);
	}
	/**
	* Chamada síncrona para o método createMergeItem
	* This is a public operation
	* The 'createMerge' request primitive for the Item entity.
	* @throws PedidosMessageException quando um erro com payload for retornado pela mensageria
	*/
	@Override
	public Item createMergeItem(Item input, long timeout) {
		CreateMergeItemImpl impl = new CreateMergeItemImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeItem(input, timeout);
	}
	
	/**
	* Chamada assíncrona para o método createMergeItem
	* This is a public operation
	* The 'createMerge' request primitive for the Item entity.
	*/
	@Override
	public void createMergeItem(Item input) {
		CreateMergeItemImpl impl = new CreateMergeItemImpl(messengerSupplier, userId, messageSupplier);
		impl.createMergeItem(input);
	}
	
	/**
	* Chamada assíncrona para o método createMergeItem
	* This is a public operation
	* The 'createMerge' request primitive for the Item entity.
	*/
	@Override
	public CompletableFuture<Item> createMergeItemRequest(Item input) {
		CreateMergeItemImpl impl = new CreateMergeItemImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeItemRequest(input);
	}
	/**
	* Chamada síncrona para o método retrieveItem
	* This is a public operation
	* The 'retrieve' request primitive for the Item entity.
	* @throws PedidosMessageException quando um erro com payload for retornado pela mensageria
	*/
	@Override
	public Item retrieveItem(Item.Id input, long timeout) {
		RetrieveItemImpl impl = new RetrieveItemImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveItem(input, timeout);
	}
	
	/**
	* Chamada assíncrona para o método retrieveItem
	* This is a public operation
	* The 'retrieve' request primitive for the Item entity.
	*/
	@Override
	public void retrieveItem(Item.Id input) {
		RetrieveItemImpl impl = new RetrieveItemImpl(messengerSupplier, userId, messageSupplier);
		impl.retrieveItem(input);
	}
	
	/**
	* Chamada assíncrona para o método retrieveItem
	* This is a public operation
	* The 'retrieve' request primitive for the Item entity.
	*/
	@Override
	public CompletableFuture<Item> retrieveItemRequest(Item.Id input) {
		RetrieveItemImpl impl = new RetrieveItemImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveItemRequest(input);
	}
	/**
	* Chamada síncrona para o método updateItem
	* This is a public operation
	* The 'update' request primitive for the Item entity.
	* @throws PedidosMessageException quando um erro com payload for retornado pela mensageria
	*/
	@Override
	public Item updateItem(Item input, long timeout) {
		UpdateItemImpl impl = new UpdateItemImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateItem(input, timeout);
	}
	
	/**
	* Chamada assíncrona para o método updateItem
	* This is a public operation
	* The 'update' request primitive for the Item entity.
	*/
	@Override
	public void updateItem(Item input) {
		UpdateItemImpl impl = new UpdateItemImpl(messengerSupplier, userId, messageSupplier);
		impl.updateItem(input);
	}
	
	/**
	* Chamada assíncrona para o método updateItem
	* This is a public operation
	* The 'update' request primitive for the Item entity.
	*/
	@Override
	public CompletableFuture<Item> updateItemRequest(Item input) {
		UpdateItemImpl impl = new UpdateItemImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateItemRequest(input);
	}
	/**
	* Chamada síncrona para o método updateMergeItem
	* This is a public operation
	* The 'updateMerge' request primitive for the Item entity.
	* @throws PedidosMessageException quando um erro com payload for retornado pela mensageria
	*/
	@Override
	public Item updateMergeItem(Item input, long timeout) {
		UpdateMergeItemImpl impl = new UpdateMergeItemImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeItem(input, timeout);
	}
	
	/**
	* Chamada assíncrona para o método updateMergeItem
	* This is a public operation
	* The 'updateMerge' request primitive for the Item entity.
	*/
	@Override
	public void updateMergeItem(Item input) {
		UpdateMergeItemImpl impl = new UpdateMergeItemImpl(messengerSupplier, userId, messageSupplier);
		impl.updateMergeItem(input);
	}
	
	/**
	* Chamada assíncrona para o método updateMergeItem
	* This is a public operation
	* The 'updateMerge' request primitive for the Item entity.
	*/
	@Override
	public CompletableFuture<Item> updateMergeItemRequest(Item input) {
		UpdateMergeItemImpl impl = new UpdateMergeItemImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeItemRequest(input);
	}
	/**
	* Chamada síncrona para o método deleteItem
	* This is a public operation
	* The 'delete' request primitive for the Item entity.
	* @throws PedidosMessageException quando um erro com payload for retornado pela mensageria
	*/
	@Override
	public void deleteItem(Item.Id input, long timeout) {
		DeleteItemImpl impl = new DeleteItemImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteItem(input, timeout);
	}
	
	/**
	* Chamada assíncrona para o método deleteItem
	* This is a public operation
	* The 'delete' request primitive for the Item entity.
	*/
	@Override
	public void deleteItem(Item.Id input) {
		DeleteItemImpl impl = new DeleteItemImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteItem(input);
	}
	
	/**
	* Chamada síncrona para o método createPedido
	* This is a public operation
	* The 'create' request primitive for the Pedido entity.
	* @throws PedidosMessageException quando um erro com payload for retornado pela mensageria
	*/
	@Override
	public Pedido createPedido(Pedido input, long timeout) {
		CreatePedidoImpl impl = new CreatePedidoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createPedido(input, timeout);
	}
	
	/**
	* Chamada assíncrona para o método createPedido
	* This is a public operation
	* The 'create' request primitive for the Pedido entity.
	*/
	@Override
	public void createPedido(Pedido input) {
		CreatePedidoImpl impl = new CreatePedidoImpl(messengerSupplier, userId, messageSupplier);
		impl.createPedido(input);
	}
	
	/**
	* Chamada assíncrona para o método createPedido
	* This is a public operation
	* The 'create' request primitive for the Pedido entity.
	*/
	@Override
	public CompletableFuture<Pedido> createPedidoRequest(Pedido input) {
		CreatePedidoImpl impl = new CreatePedidoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createPedidoRequest(input);
	}
	/**
	* Chamada síncrona para o método createBulkPedido
	* This is a public operation
	* The 'createBulk' request primitive for the Pedido entity.
	* @throws PedidosMessageException quando um erro com payload for retornado pela mensageria
	*/
	@Override
	public CreateBulkPedidoOutput createBulkPedido(CreateBulkPedidoInput input, long timeout) {
		CreateBulkPedidoImpl impl = new CreateBulkPedidoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkPedido(input, timeout);
	}
	
	/**
	* Chamada assíncrona para o método createBulkPedido
	* This is a public operation
	* The 'createBulk' request primitive for the Pedido entity.
	*/
	@Override
	public void createBulkPedido(CreateBulkPedidoInput input) {
		CreateBulkPedidoImpl impl = new CreateBulkPedidoImpl(messengerSupplier, userId, messageSupplier);
		impl.createBulkPedido(input);
	}
	
	/**
	* Chamada assíncrona para o método createBulkPedido
	* This is a public operation
	* The 'createBulk' request primitive for the Pedido entity.
	*/
	@Override
	public CompletableFuture<CreateBulkPedidoOutput> createBulkPedidoRequest(CreateBulkPedidoInput input) {
		CreateBulkPedidoImpl impl = new CreateBulkPedidoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkPedidoRequest(input);
	}
	/**
	* Chamada síncrona para o método createMergePedido
	* This is a public operation
	* The 'createMerge' request primitive for the Pedido entity.
	* @throws PedidosMessageException quando um erro com payload for retornado pela mensageria
	*/
	@Override
	public Pedido createMergePedido(Pedido input, long timeout) {
		CreateMergePedidoImpl impl = new CreateMergePedidoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergePedido(input, timeout);
	}
	
	/**
	* Chamada assíncrona para o método createMergePedido
	* This is a public operation
	* The 'createMerge' request primitive for the Pedido entity.
	*/
	@Override
	public void createMergePedido(Pedido input) {
		CreateMergePedidoImpl impl = new CreateMergePedidoImpl(messengerSupplier, userId, messageSupplier);
		impl.createMergePedido(input);
	}
	
	/**
	* Chamada assíncrona para o método createMergePedido
	* This is a public operation
	* The 'createMerge' request primitive for the Pedido entity.
	*/
	@Override
	public CompletableFuture<Pedido> createMergePedidoRequest(Pedido input) {
		CreateMergePedidoImpl impl = new CreateMergePedidoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergePedidoRequest(input);
	}
	/**
	* Chamada síncrona para o método retrievePedido
	* This is a public operation
	* The 'retrieve' request primitive for the Pedido entity.
	* @throws PedidosMessageException quando um erro com payload for retornado pela mensageria
	*/
	@Override
	public Pedido retrievePedido(Pedido.Id input, long timeout) {
		RetrievePedidoImpl impl = new RetrievePedidoImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrievePedido(input, timeout);
	}
	
	/**
	* Chamada assíncrona para o método retrievePedido
	* This is a public operation
	* The 'retrieve' request primitive for the Pedido entity.
	*/
	@Override
	public void retrievePedido(Pedido.Id input) {
		RetrievePedidoImpl impl = new RetrievePedidoImpl(messengerSupplier, userId, messageSupplier);
		impl.retrievePedido(input);
	}
	
	/**
	* Chamada assíncrona para o método retrievePedido
	* This is a public operation
	* The 'retrieve' request primitive for the Pedido entity.
	*/
	@Override
	public CompletableFuture<Pedido> retrievePedidoRequest(Pedido.Id input) {
		RetrievePedidoImpl impl = new RetrievePedidoImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrievePedidoRequest(input);
	}
	/**
	* Chamada síncrona para o método updatePedido
	* This is a public operation
	* The 'update' request primitive for the Pedido entity.
	* @throws PedidosMessageException quando um erro com payload for retornado pela mensageria
	*/
	@Override
	public Pedido updatePedido(Pedido input, long timeout) {
		UpdatePedidoImpl impl = new UpdatePedidoImpl(messengerSupplier, userId, messageSupplier);
		return impl.updatePedido(input, timeout);
	}
	
	/**
	* Chamada assíncrona para o método updatePedido
	* This is a public operation
	* The 'update' request primitive for the Pedido entity.
	*/
	@Override
	public void updatePedido(Pedido input) {
		UpdatePedidoImpl impl = new UpdatePedidoImpl(messengerSupplier, userId, messageSupplier);
		impl.updatePedido(input);
	}
	
	/**
	* Chamada assíncrona para o método updatePedido
	* This is a public operation
	* The 'update' request primitive for the Pedido entity.
	*/
	@Override
	public CompletableFuture<Pedido> updatePedidoRequest(Pedido input) {
		UpdatePedidoImpl impl = new UpdatePedidoImpl(messengerSupplier, userId, messageSupplier);
		return impl.updatePedidoRequest(input);
	}
	/**
	* Chamada síncrona para o método updateMergePedido
	* This is a public operation
	* The 'updateMerge' request primitive for the Pedido entity.
	* @throws PedidosMessageException quando um erro com payload for retornado pela mensageria
	*/
	@Override
	public Pedido updateMergePedido(Pedido input, long timeout) {
		UpdateMergePedidoImpl impl = new UpdateMergePedidoImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergePedido(input, timeout);
	}
	
	/**
	* Chamada assíncrona para o método updateMergePedido
	* This is a public operation
	* The 'updateMerge' request primitive for the Pedido entity.
	*/
	@Override
	public void updateMergePedido(Pedido input) {
		UpdateMergePedidoImpl impl = new UpdateMergePedidoImpl(messengerSupplier, userId, messageSupplier);
		impl.updateMergePedido(input);
	}
	
	/**
	* Chamada assíncrona para o método updateMergePedido
	* This is a public operation
	* The 'updateMerge' request primitive for the Pedido entity.
	*/
	@Override
	public CompletableFuture<Pedido> updateMergePedidoRequest(Pedido input) {
		UpdateMergePedidoImpl impl = new UpdateMergePedidoImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergePedidoRequest(input);
	}
	/**
	* Chamada síncrona para o método deletePedido
	* This is a public operation
	* The 'delete' request primitive for the Pedido entity.
	* @throws PedidosMessageException quando um erro com payload for retornado pela mensageria
	*/
	@Override
	public void deletePedido(Pedido.Id input, long timeout) {
		DeletePedidoImpl impl = new DeletePedidoImpl(messengerSupplier, userId, messageSupplier);
		impl.deletePedido(input, timeout);
	}
	
	/**
	* Chamada assíncrona para o método deletePedido
	* This is a public operation
	* The 'delete' request primitive for the Pedido entity.
	*/
	@Override
	public void deletePedido(Pedido.Id input) {
		DeletePedidoImpl impl = new DeletePedidoImpl(messengerSupplier, userId, messageSupplier);
		impl.deletePedido(input);
	}
	


	/**
	* Chamada assíncrona para o método publishServiceStarted
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	*/
	public void publishServiceStarted( ServiceStartedPayload input ) {
	
		Message message = new Message(userId.getTenant(), PedidosConstants.DOMAIN, PedidosConstants.SERVICE, PedidosConstants.Events.SERVICE_STARTED, DtoJsonConverter.toJSON(input));
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new PedidosException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	* Chamada assíncrona para o método publishNotifyUserEvent
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	*/
	public void publishNotifyUserEvent( NotifyUserEventPayload input ) {
	
		Message message = new Message(userId.getTenant(), PedidosConstants.DOMAIN, PedidosConstants.SERVICE, PedidosConstants.Events.NOTIFY_USER_EVENT, DtoJsonConverter.toJSON(input));
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new PedidosException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	* Chamada assíncrona para o método publishImportClienteEvent
	* This is a public operation
	*/
	public void publishImportClienteEvent( ImportClienteEventPayload input ) {
	
		Message message = new Message(userId.getTenant(), PedidosConstants.DOMAIN, PedidosConstants.SERVICE, PedidosConstants.Events.IMPORT_CLIENTE_EVENT, DtoJsonConverter.toJSON(input));
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new PedidosException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	* Chamada assíncrona para o método publishExportClienteEvent
	* This is a public operation
	*/
	public void publishExportClienteEvent( ExportClienteEventPayload input ) {
	
		Message message = new Message(userId.getTenant(), PedidosConstants.DOMAIN, PedidosConstants.SERVICE, PedidosConstants.Events.EXPORT_CLIENTE_EVENT, DtoJsonConverter.toJSON(input));
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new PedidosException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	* Chamada assíncrona para o método publishImportItemEvent
	* This is a public operation
	*/
	public void publishImportItemEvent( ImportItemEventPayload input ) {
	
		Message message = new Message(userId.getTenant(), PedidosConstants.DOMAIN, PedidosConstants.SERVICE, PedidosConstants.Events.IMPORT_ITEM_EVENT, DtoJsonConverter.toJSON(input));
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new PedidosException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	* Chamada assíncrona para o método publishExportItemEvent
	* This is a public operation
	*/
	public void publishExportItemEvent( ExportItemEventPayload input ) {
	
		Message message = new Message(userId.getTenant(), PedidosConstants.DOMAIN, PedidosConstants.SERVICE, PedidosConstants.Events.EXPORT_ITEM_EVENT, DtoJsonConverter.toJSON(input));
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new PedidosException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	* Chamada assíncrona para o método publishImportPedidoEvent
	* This is a public operation
	*/
	public void publishImportPedidoEvent( ImportPedidoEventPayload input ) {
	
		Message message = new Message(userId.getTenant(), PedidosConstants.DOMAIN, PedidosConstants.SERVICE, PedidosConstants.Events.IMPORT_PEDIDO_EVENT, DtoJsonConverter.toJSON(input));
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new PedidosException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	* Chamada assíncrona para o método publishExportPedidoEvent
	* This is a public operation
	*/
	public void publishExportPedidoEvent( ExportPedidoEventPayload input ) {
	
		Message message = new Message(userId.getTenant(), PedidosConstants.DOMAIN, PedidosConstants.SERVICE, PedidosConstants.Events.EXPORT_PEDIDO_EVENT, DtoJsonConverter.toJSON(input));
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new PedidosException("Erro ao enviar a mensagem", e);
		}
	}
	

	private void addMessageHeaders(Message message) {
		message.setUsername(userId.getUsername());
		if (userId.isTrusted()) {
			message.addHeader("trusted", true);
		}
	}
}
