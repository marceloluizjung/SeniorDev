/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.varejo.pedidos;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.stream.Collectors;

import javax.inject.Inject;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.scheduling.annotation.Async;
import org.springframework.transaction.annotation.Transactional;

import br.com.senior.messaging.ErrorCategory;
import br.com.senior.messaging.model.HandlerImpl;
import br.com.senior.messaging.model.ServiceException;
import br.com.senior.custom.metadata.EntityDefProviderImpl;
import br.com.senior.custom.validator.CustomDTOValidatorImpl;
import br.com.senior.springbatchintegration.control.BatchIntegrationController;
import br.com.senior.springbatchintegration.importer.Importer;
import br.com.senior.springbatchintegration.importer.ImporterException;
import br.com.senior.springbatchintegration.model.Layout;
import br.com.senior.varejo.pedidos.Cliente;
import br.com.senior.varejo.pedidos.Cliente.Id;
import br.com.senior.varejo.pedidos.Cliente.PageRequest;
import br.com.senior.varejo.pedidos.Cliente.PagedResults;
import br.com.senior.varejo.pedidos.PedidosConstants;
import br.com.senior.varejo.pedidos.CreateCliente;
import br.com.senior.varejo.pedidos.UpdateCliente;
import br.com.senior.varejo.pedidos.DeleteCliente;
import br.com.senior.varejo.pedidos.RetrieveCliente;
import br.com.senior.varejo.pedidos.ListCliente;
import br.com.senior.varejo.pedidos.ImportConfig;
import br.com.senior.varejo.pedidos.LayoutDTOConverter;
import br.com.senior.varejo.pedidos.ImportClienteInput;
import br.com.senior.varejo.pedidos.ImportClienteOutput;
import br.com.senior.varejo.pedidos.ExportClienteInput;
import br.com.senior.varejo.pedidos.ExportClienteOutput;
import br.com.senior.varejo.pedidos.ClienteDTOConverter;

@HandlerImpl(serviceClass = PedidosConstants.class)
public class ClienteHandler implements CreateCliente, CreateMergeCliente, UpdateCliente, DeleteCliente, 
		 UpdateMergeCliente, CreateBulkCliente, RetrieveCliente, ListCliente, 
		 ImportCliente, ExportCliente {
	static final Logger logger = LoggerFactory.getLogger(ClienteHandler.class);

	@Inject
	ClienteCrudService service;
	
	@Inject
	ClienteDTOConverter dtoConverter;
	
	@Inject
	CustomDTOValidatorImpl customValidator;
	
	@Inject
	EntityDefProviderImpl entityDefProvider;
	
	@Override
	public Cliente createCliente(Cliente toCreate) {
		try {
			customValidator.validate(toCreate, entityDefProvider.getEntityDef("cliente"));
			ClienteEntity entity = service.createCliente(dtoConverter.toEntity(toCreate, ClienteEntity.class));
			return dtoConverter.toDTO(entity, Cliente.class);
			
		} catch (ServiceException | IllegalArgumentException e) {
			logger.error(e.getMessage(), e);
			throw e;
			
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, "An internal error occurred: "
					+ e.getClass().getSimpleName() + ". Please check the request parameters and try again.", e);
		}
	}
	
	@Override
	public Cliente createMergeCliente(Cliente toCreate) {
		try {
			ClienteEntity entity = service.createCliente(dtoConverter.toEntity(toCreate, ClienteEntity.class));
			return dtoConverter.toDTO(entity, Cliente.class);
			
		} catch (ServiceException | IllegalArgumentException e) {
			logger.error(e.getMessage(), e);
			throw e;
			
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, "An internal error occurred: "
					+ e.getClass().getSimpleName() + ". Please check the request parameters and try again.", e);
		}
	}
	
	@Override
	public Cliente updateCliente(Cliente toUpdate) {
		try {
			ClienteEntity modified = doUpdate(toUpdate);
			customValidator.validate(toUpdate, entityDefProvider.getEntityDef("cliente"));
			return dtoConverter.toDTO(modified, Cliente.class);
			
		} catch (ServiceException | IllegalArgumentException e) {
			logger.error(e.getMessage(), e);
			throw e;
			
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, "An internal error occurred: "
					+ e.getClass().getSimpleName() + ". Please check the request parameters and try again.", e);
		}
	}
	
	@Override
	public Cliente updateMergeCliente(Cliente toUpdate) {
		try {
			customValidator.validate(toUpdate, entityDefProvider.getEntityDef("cliente"));
			ClienteEntity entity = service.retrieveCliente(new Cliente.Id(toUpdate.id));
			dtoConverter.mergeToEntity(toUpdate, entity);
			entity = service.updateCliente(entity);
			return dtoConverter.toDTO(entity, Cliente.class);
			
		} catch (ServiceException | IllegalArgumentException e) {
			logger.error(e.getMessage(), e);
			throw e;
			
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, "An internal error occurred: "
					+ e.getClass().getSimpleName() + ". Please check the request parameters and try again.", e);
		}
	}
	
	private ClienteEntity doUpdate(Cliente toUpdate) {
		ClienteEntity entity = service.getRepository().findOne(java.util.UUID.fromString(toUpdate.id));
		dtoConverter.toEntity(toUpdate, entity);
		return doUpdate(entity);
	}
	
	private ClienteEntity doUpdate(ClienteEntity entity) {
		return service.updateCliente(entity);
	}
	
	@Override
	public void deleteCliente(Id id) {
		this.service.deleteCliente(id);
	}
	
	@Transactional(readOnly = true)
	@Override
	public Cliente retrieveCliente(Id id) {
		ClienteEntity entity = service.retrieveCliente(id);
		return dtoConverter.toDTO(entity, Cliente.class);
	}
	
	@Transactional(readOnly = true)
	@Override
	public PagedResults listCliente(PageRequest pageRequest) {
		int skip = pageRequest.offset != null ? pageRequest.offset.intValue() : 0;
		int top = pageRequest.size != null ? pageRequest.size.intValue() : 0;
		String orderBy = pageRequest.orderBy;
		String filter = pageRequest.filter;
		Page<ClienteEntity> pages = this.service.listClientePageable(skip, top, orderBy, filter);
		List<ClienteEntity> entities = pages.getContent();
		List<Cliente> dtos = null;
		
		dtos = entities != null ? entities.stream().map(e -> dtoConverter.toDTO(e, Cliente.class, pageRequest.displayFields)).collect(Collectors.toList()) : null;
		return new PagedResults(dtos, Long.valueOf(pages.getTotalPages()), Long.valueOf(pages.getTotalElements()));
	}
	
	@Transactional
	@Override
	public CreateBulkClienteOutput createBulkCliente(CreateBulkClienteInput toCreate) {
		if (toCreate != null) {
			List<Cliente> entitiesToCreate = toCreate.entities;
			if (entitiesToCreate != null && !entitiesToCreate.isEmpty()) {
				entitiesToCreate.forEach(bean -> {
					customValidator.validate(bean, entityDefProvider.getEntityDef("cliente"));
					bean.validate();
				});
				
				List<ClienteEntity> entities = entitiesToCreate.stream().map(bean -> dtoConverter.toEntity(bean, ClienteEntity.class))
						.collect(Collectors.toList());
				this.service.createBulk(entities);
			}
		}
		return new CreateBulkClienteOutput();
	}
	
	@Transactional
	@Override
	public ImportClienteOutput importCliente(ImportClienteInput request) {
		Importer importer = BatchIntegrationController.getInstance().newImporter();
		StartImportProcess startImportProcess = new StartImportProcess(importer, request.config);
		startImportProcess.start();
		ImportClienteOutput output = new ImportClienteOutput(importer.getId());
		return output;
	}
	
	@Transactional(readOnly = true)
	@Override
	public ExportClienteOutput exportCliente(ExportClienteInput request) {
		/*
		 * **** Not implemented yet **** ExporterControl control =
		 * ExporterControl.getInstance(); Exporter exporter =
		 * control.newExporter(); StartExportProcess startExportProcess = new
		 * StartExportProcess(exporter, request.config);
		 * startExportProcess.start();
		 */
		ExportClienteOutput output = new ExportClienteOutput(
				null /* exporter.getId() */);
		return output;
	}
	
	class StartImportProcess extends Thread {
	
		private Importer importer;
		private ImportConfig config;
		
		StartImportProcess(Importer importer, ImportConfig config) {
			this.importer = importer;
			this.importer.addListener(new ClienteImporterListener());
			this.config = config;
			this.importer.logUri(this.config.uri);
		}
		
		@Async
		@Override
		public void run() {
			File blob = getBlobFile();
			try {
				Layout layout = LayoutDTOConverter.dtoToLayout(config.layout);
				try (FileReader reader = new FileReader(blob)) {
					importer.setReader(reader);
					importer.setLayout(layout);
					importer.setBeanClass(Cliente.class.getName());
					importer.setCrudService(ClienteHandler.this.service, (config.batchSize > 0));
					importer.setBatchSize(config.batchSize);
					if (config.async) {
						importer.startAsync();
					} else {
						try {
							importer.start();
						} catch (ImporterException e) {
							logger.error(e.getMessage(), e);
						}
					}
				}
			} catch (IOException e) {
				// isto nao deveria ocorrer
				logger.error(e.getMessage(), e);
			}
		}
		
		private File getBlobFile() {
			URI uri = null;
			try {
				uri = new URI(config.uri);
			} catch (URISyntaxException e1) {
				logger.error(e1.getMessage(), e1);
			}
			String scheme = uri.getScheme();
			if (scheme.equals("file")) {
				return new File(uri);
			} else if (scheme.startsWith("http")) {
				return getHttpBlobFile(uri);
			}
			return null;
		}
		
		private File getHttpBlobFile(URI uri) {
			importer.notifyDownload();
			HttpGet get = new HttpGet(uri);
			try (CloseableHttpClient httpClient = HttpClients.createDefault();
					CloseableHttpResponse httpResponse = httpClient.execute(get);
					InputStream is = httpResponse.getEntity().getContent()) {
				File blob = File.createTempFile("cliente", "blob");
				try (FileOutputStream fos = new FileOutputStream(blob);
						BufferedOutputStream bos = new BufferedOutputStream(fos);
						BufferedInputStream bis = new BufferedInputStream(is)) {
					byte[] bytes = new byte[8192];
					int tam = 0;
					while ((tam = bis.read(bytes)) > 0) {
						bos.write(bytes, 0, tam);
					}
					bos.flush();
					fos.flush();
				}
				return blob;
			} catch (IOException e) {
				logger.error(e.getMessage(), e);
			}
			return null;
		}
	}
}
