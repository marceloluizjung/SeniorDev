/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.varejo.pedidos;

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
public interface PedidosStub {

	/**
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	* 
	* Chamada síncrona, o valor de timeout deve ser informado em ms 
	*/
	HelloWorldOutput helloWorld(HelloWorldInput input, long timeout);
	
	/**
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	* 
	* Chamada assíncrona
	*/
	void helloWorld(HelloWorldInput input);
	
	/**
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	* 
	* Chamada assíncrona utilizando request
	*/
	CompletableFuture<HelloWorldOutput> helloWorldRequest(HelloWorldInput input);
	
	/**
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	* Obtém a URL para upload da foto
	* Chamada síncrona, o valor de timeout deve ser informado em ms 
	*/
	ObterUrlUploadFotoOutput obterUrlUploadFoto(ObterUrlUploadFotoInput input, long timeout);
	
	/**
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	* Obtém a URL para upload da foto
	* Chamada assíncrona
	*/
	void obterUrlUploadFoto(ObterUrlUploadFotoInput input);
	
	/**
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	* Obtém a URL para upload da foto
	* Chamada assíncrona utilizando request
	*/
	CompletableFuture<ObterUrlUploadFotoOutput> obterUrlUploadFotoRequest(ObterUrlUploadFotoInput input);
	
	/**
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	* Grava a foto que foi upada
	* Chamada síncrona, o valor de timeout deve ser informado em ms 
	*/
	GravarFotoOutput gravarFoto(GravarFotoInput input, long timeout);
	
	/**
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	* Grava a foto que foi upada
	* Chamada assíncrona
	*/
	void gravarFoto(GravarFotoInput input);
	
	/**
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	* Grava a foto que foi upada
	* Chamada assíncrona utilizando request
	*/
	CompletableFuture<GravarFotoOutput> gravarFotoRequest(GravarFotoInput input);
	
	/**
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	* Obtém a URL para download da foto
	* Chamada síncrona, o valor de timeout deve ser informado em ms 
	*/
	ObterUrlDownloadFotoOutput obterUrlDownloadFoto(ObterUrlDownloadFotoInput input, long timeout);
	
	/**
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	* Obtém a URL para download da foto
	* Chamada assíncrona
	*/
	void obterUrlDownloadFoto(ObterUrlDownloadFotoInput input);
	
	/**
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	* Obtém a URL para download da foto
	* Chamada assíncrona utilizando request
	*/
	CompletableFuture<ObterUrlDownloadFotoOutput> obterUrlDownloadFotoRequest(ObterUrlDownloadFotoInput input);
	
	/**
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	* Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
	* Chamada síncrona, o valor de timeout deve ser informado em ms 
	*/
	GetMetadataOutput getMetadata(GetMetadataInput input, long timeout);
	
	/**
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	* Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
	* Chamada assíncrona
	*/
	void getMetadata(GetMetadataInput input);
	
	/**
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	* Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
	* Chamada assíncrona utilizando request
	*/
	CompletableFuture<GetMetadataOutput> getMetadataRequest(GetMetadataInput input);
	
	/**
	* This is a public operation
	* 
	* Chamada síncrona, o valor de timeout deve ser informado em ms 
	*/
	ImportClienteOutput importCliente(ImportClienteInput input, long timeout);
	
	/**
	* This is a public operation
	* 
	* Chamada assíncrona
	*/
	void importCliente(ImportClienteInput input);
	
	/**
	* This is a public operation
	* 
	* Chamada assíncrona utilizando request
	*/
	CompletableFuture<ImportClienteOutput> importClienteRequest(ImportClienteInput input);
	
	/**
	* This is a public operation
	* 
	* Chamada síncrona, o valor de timeout deve ser informado em ms 
	*/
	ExportClienteOutput exportCliente(ExportClienteInput input, long timeout);
	
	/**
	* This is a public operation
	* 
	* Chamada assíncrona
	*/
	void exportCliente(ExportClienteInput input);
	
	/**
	* This is a public operation
	* 
	* Chamada assíncrona utilizando request
	*/
	CompletableFuture<ExportClienteOutput> exportClienteRequest(ExportClienteInput input);
	
	/**
	* This is a public operation
	* 
	* Chamada síncrona, o valor de timeout deve ser informado em ms 
	*/
	ImportItemOutput importItem(ImportItemInput input, long timeout);
	
	/**
	* This is a public operation
	* 
	* Chamada assíncrona
	*/
	void importItem(ImportItemInput input);
	
	/**
	* This is a public operation
	* 
	* Chamada assíncrona utilizando request
	*/
	CompletableFuture<ImportItemOutput> importItemRequest(ImportItemInput input);
	
	/**
	* This is a public operation
	* 
	* Chamada síncrona, o valor de timeout deve ser informado em ms 
	*/
	ExportItemOutput exportItem(ExportItemInput input, long timeout);
	
	/**
	* This is a public operation
	* 
	* Chamada assíncrona
	*/
	void exportItem(ExportItemInput input);
	
	/**
	* This is a public operation
	* 
	* Chamada assíncrona utilizando request
	*/
	CompletableFuture<ExportItemOutput> exportItemRequest(ExportItemInput input);
	
	/**
	* This is a public operation
	* 
	* Chamada síncrona, o valor de timeout deve ser informado em ms 
	*/
	ImportPedidoOutput importPedido(ImportPedidoInput input, long timeout);
	
	/**
	* This is a public operation
	* 
	* Chamada assíncrona
	*/
	void importPedido(ImportPedidoInput input);
	
	/**
	* This is a public operation
	* 
	* Chamada assíncrona utilizando request
	*/
	CompletableFuture<ImportPedidoOutput> importPedidoRequest(ImportPedidoInput input);
	
	/**
	* This is a public operation
	* 
	* Chamada síncrona, o valor de timeout deve ser informado em ms 
	*/
	ExportPedidoOutput exportPedido(ExportPedidoInput input, long timeout);
	
	/**
	* This is a public operation
	* 
	* Chamada assíncrona
	*/
	void exportPedido(ExportPedidoInput input);
	
	/**
	* This is a public operation
	* 
	* Chamada assíncrona utilizando request
	*/
	CompletableFuture<ExportPedidoOutput> exportPedidoRequest(ExportPedidoInput input);
	
	/**
	* This is a public operation
	* The 'list' request primitive for the Cliente entity.
	* Chamada síncrona, o valor de timeout deve ser informado em ms 
	*/
	Cliente.PagedResults listCliente(Cliente.PageRequest input, long timeout);
	
	/**
	* This is a public operation
	* The 'list' request primitive for the Cliente entity.
	* Chamada assíncrona
	*/
	void listCliente(Cliente.PageRequest input);
	
	/**
	* This is a public operation
	* The 'list' request primitive for the Cliente entity.
	* Chamada assíncrona utilizando request
	*/
	CompletableFuture<Cliente.PagedResults> listClienteRequest(Cliente.PageRequest input);
	
	/**
	* This is a public operation
	* The 'list' request primitive for the Item entity.
	* Chamada síncrona, o valor de timeout deve ser informado em ms 
	*/
	Item.PagedResults listItem(Item.PageRequest input, long timeout);
	
	/**
	* This is a public operation
	* The 'list' request primitive for the Item entity.
	* Chamada assíncrona
	*/
	void listItem(Item.PageRequest input);
	
	/**
	* This is a public operation
	* The 'list' request primitive for the Item entity.
	* Chamada assíncrona utilizando request
	*/
	CompletableFuture<Item.PagedResults> listItemRequest(Item.PageRequest input);
	
	/**
	* This is a public operation
	* The 'list' request primitive for the Pedido entity.
	* Chamada síncrona, o valor de timeout deve ser informado em ms 
	*/
	Pedido.PagedResults listPedido(Pedido.PageRequest input, long timeout);
	
	/**
	* This is a public operation
	* The 'list' request primitive for the Pedido entity.
	* Chamada assíncrona
	*/
	void listPedido(Pedido.PageRequest input);
	
	/**
	* This is a public operation
	* The 'list' request primitive for the Pedido entity.
	* Chamada assíncrona utilizando request
	*/
	CompletableFuture<Pedido.PagedResults> listPedidoRequest(Pedido.PageRequest input);
	
	/**
	* This is a public operation
	* Returns a list with all dependencies from this service, along with their respective versions
	* Chamada síncrona, o valor de timeout deve ser informado em ms 
	*/
	GetDependenciesOutput getDependencies(long timeout);
	
	/**
	* This is a public operation
	* Returns a list with all dependencies from this service, along with their respective versions
	* Chamada assíncrona
	*/
	void getDependencies();
	
	/**
	* This is a public operation
	* Returns a list with all dependencies from this service, along with their respective versions
	* Chamada assíncrona utilizando request
	*/
	CompletableFuture<GetDependenciesOutput> getDependenciesRequest();
	
	/**
	* This is a public operation
	* The 'create' request primitive for the Cliente entity.
	* Chamada síncrona, o valor de timeout deve ser informado em ms 
	*/
	Cliente createCliente(Cliente input, long timeout);
	
	/**
	* This is a public operation
	* The 'create' request primitive for the Cliente entity.
	* Chamada assíncrona
	*/
	void createCliente(Cliente input);
	
	/**
	* This is a public operation
	* The 'create' request primitive for the Cliente entity.
	* Chamada assíncrona utilizando request
	*/
	CompletableFuture<Cliente> createClienteRequest(Cliente input);
	
	/**
	* This is a public operation
	* The 'createBulk' request primitive for the Cliente entity.
	* Chamada síncrona, o valor de timeout deve ser informado em ms 
	*/
	CreateBulkClienteOutput createBulkCliente(CreateBulkClienteInput input, long timeout);
	
	/**
	* This is a public operation
	* The 'createBulk' request primitive for the Cliente entity.
	* Chamada assíncrona
	*/
	void createBulkCliente(CreateBulkClienteInput input);
	
	/**
	* This is a public operation
	* The 'createBulk' request primitive for the Cliente entity.
	* Chamada assíncrona utilizando request
	*/
	CompletableFuture<CreateBulkClienteOutput> createBulkClienteRequest(CreateBulkClienteInput input);
	
	/**
	* This is a public operation
	* The 'createMerge' request primitive for the Cliente entity.
	* Chamada síncrona, o valor de timeout deve ser informado em ms 
	*/
	Cliente createMergeCliente(Cliente input, long timeout);
	
	/**
	* This is a public operation
	* The 'createMerge' request primitive for the Cliente entity.
	* Chamada assíncrona
	*/
	void createMergeCliente(Cliente input);
	
	/**
	* This is a public operation
	* The 'createMerge' request primitive for the Cliente entity.
	* Chamada assíncrona utilizando request
	*/
	CompletableFuture<Cliente> createMergeClienteRequest(Cliente input);
	
	/**
	* This is a public operation
	* The 'retrieve' request primitive for the Cliente entity.
	* Chamada síncrona, o valor de timeout deve ser informado em ms 
	*/
	Cliente retrieveCliente(Cliente.Id input, long timeout);
	
	/**
	* This is a public operation
	* The 'retrieve' request primitive for the Cliente entity.
	* Chamada assíncrona
	*/
	void retrieveCliente(Cliente.Id input);
	
	/**
	* This is a public operation
	* The 'retrieve' request primitive for the Cliente entity.
	* Chamada assíncrona utilizando request
	*/
	CompletableFuture<Cliente> retrieveClienteRequest(Cliente.Id input);
	
	/**
	* This is a public operation
	* The 'update' request primitive for the Cliente entity.
	* Chamada síncrona, o valor de timeout deve ser informado em ms 
	*/
	Cliente updateCliente(Cliente input, long timeout);
	
	/**
	* This is a public operation
	* The 'update' request primitive for the Cliente entity.
	* Chamada assíncrona
	*/
	void updateCliente(Cliente input);
	
	/**
	* This is a public operation
	* The 'update' request primitive for the Cliente entity.
	* Chamada assíncrona utilizando request
	*/
	CompletableFuture<Cliente> updateClienteRequest(Cliente input);
	
	/**
	* This is a public operation
	* The 'updateMerge' request primitive for the Cliente entity.
	* Chamada síncrona, o valor de timeout deve ser informado em ms 
	*/
	Cliente updateMergeCliente(Cliente input, long timeout);
	
	/**
	* This is a public operation
	* The 'updateMerge' request primitive for the Cliente entity.
	* Chamada assíncrona
	*/
	void updateMergeCliente(Cliente input);
	
	/**
	* This is a public operation
	* The 'updateMerge' request primitive for the Cliente entity.
	* Chamada assíncrona utilizando request
	*/
	CompletableFuture<Cliente> updateMergeClienteRequest(Cliente input);
	
	/**
	* This is a public operation
	* The 'delete' request primitive for the Cliente entity.
	* Chamada síncrona, o valor de timeout deve ser informado em ms 
	*/
	void deleteCliente(Cliente.Id input, long timeout);
	
	/**
	* This is a public operation
	* The 'delete' request primitive for the Cliente entity.
	* Chamada assíncrona
	*/
	void deleteCliente(Cliente.Id input);
	
	/**
	* This is a public operation
	* The 'create' request primitive for the Item entity.
	* Chamada síncrona, o valor de timeout deve ser informado em ms 
	*/
	Item createItem(Item input, long timeout);
	
	/**
	* This is a public operation
	* The 'create' request primitive for the Item entity.
	* Chamada assíncrona
	*/
	void createItem(Item input);
	
	/**
	* This is a public operation
	* The 'create' request primitive for the Item entity.
	* Chamada assíncrona utilizando request
	*/
	CompletableFuture<Item> createItemRequest(Item input);
	
	/**
	* This is a public operation
	* The 'createBulk' request primitive for the Item entity.
	* Chamada síncrona, o valor de timeout deve ser informado em ms 
	*/
	CreateBulkItemOutput createBulkItem(CreateBulkItemInput input, long timeout);
	
	/**
	* This is a public operation
	* The 'createBulk' request primitive for the Item entity.
	* Chamada assíncrona
	*/
	void createBulkItem(CreateBulkItemInput input);
	
	/**
	* This is a public operation
	* The 'createBulk' request primitive for the Item entity.
	* Chamada assíncrona utilizando request
	*/
	CompletableFuture<CreateBulkItemOutput> createBulkItemRequest(CreateBulkItemInput input);
	
	/**
	* This is a public operation
	* The 'createMerge' request primitive for the Item entity.
	* Chamada síncrona, o valor de timeout deve ser informado em ms 
	*/
	Item createMergeItem(Item input, long timeout);
	
	/**
	* This is a public operation
	* The 'createMerge' request primitive for the Item entity.
	* Chamada assíncrona
	*/
	void createMergeItem(Item input);
	
	/**
	* This is a public operation
	* The 'createMerge' request primitive for the Item entity.
	* Chamada assíncrona utilizando request
	*/
	CompletableFuture<Item> createMergeItemRequest(Item input);
	
	/**
	* This is a public operation
	* The 'retrieve' request primitive for the Item entity.
	* Chamada síncrona, o valor de timeout deve ser informado em ms 
	*/
	Item retrieveItem(Item.Id input, long timeout);
	
	/**
	* This is a public operation
	* The 'retrieve' request primitive for the Item entity.
	* Chamada assíncrona
	*/
	void retrieveItem(Item.Id input);
	
	/**
	* This is a public operation
	* The 'retrieve' request primitive for the Item entity.
	* Chamada assíncrona utilizando request
	*/
	CompletableFuture<Item> retrieveItemRequest(Item.Id input);
	
	/**
	* This is a public operation
	* The 'update' request primitive for the Item entity.
	* Chamada síncrona, o valor de timeout deve ser informado em ms 
	*/
	Item updateItem(Item input, long timeout);
	
	/**
	* This is a public operation
	* The 'update' request primitive for the Item entity.
	* Chamada assíncrona
	*/
	void updateItem(Item input);
	
	/**
	* This is a public operation
	* The 'update' request primitive for the Item entity.
	* Chamada assíncrona utilizando request
	*/
	CompletableFuture<Item> updateItemRequest(Item input);
	
	/**
	* This is a public operation
	* The 'updateMerge' request primitive for the Item entity.
	* Chamada síncrona, o valor de timeout deve ser informado em ms 
	*/
	Item updateMergeItem(Item input, long timeout);
	
	/**
	* This is a public operation
	* The 'updateMerge' request primitive for the Item entity.
	* Chamada assíncrona
	*/
	void updateMergeItem(Item input);
	
	/**
	* This is a public operation
	* The 'updateMerge' request primitive for the Item entity.
	* Chamada assíncrona utilizando request
	*/
	CompletableFuture<Item> updateMergeItemRequest(Item input);
	
	/**
	* This is a public operation
	* The 'delete' request primitive for the Item entity.
	* Chamada síncrona, o valor de timeout deve ser informado em ms 
	*/
	void deleteItem(Item.Id input, long timeout);
	
	/**
	* This is a public operation
	* The 'delete' request primitive for the Item entity.
	* Chamada assíncrona
	*/
	void deleteItem(Item.Id input);
	
	/**
	* This is a public operation
	* The 'create' request primitive for the Pedido entity.
	* Chamada síncrona, o valor de timeout deve ser informado em ms 
	*/
	Pedido createPedido(Pedido input, long timeout);
	
	/**
	* This is a public operation
	* The 'create' request primitive for the Pedido entity.
	* Chamada assíncrona
	*/
	void createPedido(Pedido input);
	
	/**
	* This is a public operation
	* The 'create' request primitive for the Pedido entity.
	* Chamada assíncrona utilizando request
	*/
	CompletableFuture<Pedido> createPedidoRequest(Pedido input);
	
	/**
	* This is a public operation
	* The 'createBulk' request primitive for the Pedido entity.
	* Chamada síncrona, o valor de timeout deve ser informado em ms 
	*/
	CreateBulkPedidoOutput createBulkPedido(CreateBulkPedidoInput input, long timeout);
	
	/**
	* This is a public operation
	* The 'createBulk' request primitive for the Pedido entity.
	* Chamada assíncrona
	*/
	void createBulkPedido(CreateBulkPedidoInput input);
	
	/**
	* This is a public operation
	* The 'createBulk' request primitive for the Pedido entity.
	* Chamada assíncrona utilizando request
	*/
	CompletableFuture<CreateBulkPedidoOutput> createBulkPedidoRequest(CreateBulkPedidoInput input);
	
	/**
	* This is a public operation
	* The 'createMerge' request primitive for the Pedido entity.
	* Chamada síncrona, o valor de timeout deve ser informado em ms 
	*/
	Pedido createMergePedido(Pedido input, long timeout);
	
	/**
	* This is a public operation
	* The 'createMerge' request primitive for the Pedido entity.
	* Chamada assíncrona
	*/
	void createMergePedido(Pedido input);
	
	/**
	* This is a public operation
	* The 'createMerge' request primitive for the Pedido entity.
	* Chamada assíncrona utilizando request
	*/
	CompletableFuture<Pedido> createMergePedidoRequest(Pedido input);
	
	/**
	* This is a public operation
	* The 'retrieve' request primitive for the Pedido entity.
	* Chamada síncrona, o valor de timeout deve ser informado em ms 
	*/
	Pedido retrievePedido(Pedido.Id input, long timeout);
	
	/**
	* This is a public operation
	* The 'retrieve' request primitive for the Pedido entity.
	* Chamada assíncrona
	*/
	void retrievePedido(Pedido.Id input);
	
	/**
	* This is a public operation
	* The 'retrieve' request primitive for the Pedido entity.
	* Chamada assíncrona utilizando request
	*/
	CompletableFuture<Pedido> retrievePedidoRequest(Pedido.Id input);
	
	/**
	* This is a public operation
	* The 'update' request primitive for the Pedido entity.
	* Chamada síncrona, o valor de timeout deve ser informado em ms 
	*/
	Pedido updatePedido(Pedido input, long timeout);
	
	/**
	* This is a public operation
	* The 'update' request primitive for the Pedido entity.
	* Chamada assíncrona
	*/
	void updatePedido(Pedido input);
	
	/**
	* This is a public operation
	* The 'update' request primitive for the Pedido entity.
	* Chamada assíncrona utilizando request
	*/
	CompletableFuture<Pedido> updatePedidoRequest(Pedido input);
	
	/**
	* This is a public operation
	* The 'updateMerge' request primitive for the Pedido entity.
	* Chamada síncrona, o valor de timeout deve ser informado em ms 
	*/
	Pedido updateMergePedido(Pedido input, long timeout);
	
	/**
	* This is a public operation
	* The 'updateMerge' request primitive for the Pedido entity.
	* Chamada assíncrona
	*/
	void updateMergePedido(Pedido input);
	
	/**
	* This is a public operation
	* The 'updateMerge' request primitive for the Pedido entity.
	* Chamada assíncrona utilizando request
	*/
	CompletableFuture<Pedido> updateMergePedidoRequest(Pedido input);
	
	/**
	* This is a public operation
	* The 'delete' request primitive for the Pedido entity.
	* Chamada síncrona, o valor de timeout deve ser informado em ms 
	*/
	void deletePedido(Pedido.Id input, long timeout);
	
	/**
	* This is a public operation
	* The 'delete' request primitive for the Pedido entity.
	* Chamada assíncrona
	*/
	void deletePedido(Pedido.Id input);
	


	/**
	* Chamada assíncrona para o método publishServiceStarted 
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	*/
	void publishServiceStarted( ServiceStartedPayload input );
			
	
	/**
	* Chamada assíncrona para o método publishNotifyUserEvent 
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	*/
	void publishNotifyUserEvent( NotifyUserEventPayload input );
			
	
	/**
	* Chamada assíncrona para o método publishImportClienteEvent 
	* This is a public operation
	*/
	void publishImportClienteEvent( ImportClienteEventPayload input );
			
	
	/**
	* Chamada assíncrona para o método publishExportClienteEvent 
	* This is a public operation
	*/
	void publishExportClienteEvent( ExportClienteEventPayload input );
			
	
	/**
	* Chamada assíncrona para o método publishImportItemEvent 
	* This is a public operation
	*/
	void publishImportItemEvent( ImportItemEventPayload input );
			
	
	/**
	* Chamada assíncrona para o método publishExportItemEvent 
	* This is a public operation
	*/
	void publishExportItemEvent( ExportItemEventPayload input );
			
	
	/**
	* Chamada assíncrona para o método publishImportPedidoEvent 
	* This is a public operation
	*/
	void publishImportPedidoEvent( ImportPedidoEventPayload input );
			
	
	/**
	* Chamada assíncrona para o método publishExportPedidoEvent 
	* This is a public operation
	*/
	void publishExportPedidoEvent( ExportPedidoEventPayload input );
			
	

}
