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
import br.com.senior.varejo.pedidos.Item;
import br.com.senior.varejo.pedidos.Item.Id;
import br.com.senior.varejo.pedidos.Item.PageRequest;
import br.com.senior.varejo.pedidos.Item.PagedResults;
import br.com.senior.varejo.pedidos.PedidosConstants;
import br.com.senior.varejo.pedidos.CreateItem;
import br.com.senior.varejo.pedidos.UpdateItem;
import br.com.senior.varejo.pedidos.DeleteItem;
import br.com.senior.varejo.pedidos.RetrieveItem;
import br.com.senior.varejo.pedidos.ListItem;
import br.com.senior.varejo.pedidos.ImportConfig;
import br.com.senior.varejo.pedidos.LayoutDTOConverter;
import br.com.senior.varejo.pedidos.ImportItemInput;
import br.com.senior.varejo.pedidos.ImportItemOutput;
import br.com.senior.varejo.pedidos.ExportItemInput;
import br.com.senior.varejo.pedidos.ExportItemOutput;
import br.com.senior.varejo.pedidos.ItemDTOConverter;

@HandlerImpl(serviceClass = PedidosConstants.class)
public class ItemHandler implements CreateItem, CreateMergeItem, UpdateItem, DeleteItem, 
		 UpdateMergeItem, CreateBulkItem, RetrieveItem, ListItem, 
		 ImportItem, ExportItem {
	static final Logger logger = LoggerFactory.getLogger(ItemHandler.class);

	@Inject
	ItemCrudService service;
	
	@Inject
	ItemDTOConverter dtoConverter;
	
	@Inject
	CustomDTOValidatorImpl customValidator;
	
	@Inject
	EntityDefProviderImpl entityDefProvider;
	
	@Override
	public Item createItem(Item toCreate) {
		try {
			customValidator.validate(toCreate, entityDefProvider.getEntityDef("item"));
			ItemEntity entity = service.createItem(dtoConverter.toEntity(toCreate, ItemEntity.class));
			return dtoConverter.toDTO(entity, Item.class);
			
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
	public Item createMergeItem(Item toCreate) {
		try {
			ItemEntity entity = service.createItem(dtoConverter.toEntity(toCreate, ItemEntity.class));
			return dtoConverter.toDTO(entity, Item.class);
			
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
	public Item updateItem(Item toUpdate) {
		try {
			ItemEntity modified = doUpdate(toUpdate);
			customValidator.validate(toUpdate, entityDefProvider.getEntityDef("item"));
			return dtoConverter.toDTO(modified, Item.class);
			
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
	public Item updateMergeItem(Item toUpdate) {
		try {
			customValidator.validate(toUpdate, entityDefProvider.getEntityDef("item"));
			ItemEntity entity = service.retrieveItem(new Item.Id(toUpdate.id));
			dtoConverter.mergeToEntity(toUpdate, entity);
			entity = service.updateItem(entity);
			return dtoConverter.toDTO(entity, Item.class);
			
		} catch (ServiceException | IllegalArgumentException e) {
			logger.error(e.getMessage(), e);
			throw e;
			
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, "An internal error occurred: "
					+ e.getClass().getSimpleName() + ". Please check the request parameters and try again.", e);
		}
	}
	
	private ItemEntity doUpdate(Item toUpdate) {
		ItemEntity entity = service.getRepository().findOne(java.util.UUID.fromString(toUpdate.id));
		dtoConverter.toEntity(toUpdate, entity);
		return doUpdate(entity);
	}
	
	private ItemEntity doUpdate(ItemEntity entity) {
		return service.updateItem(entity);
	}
	
	@Override
	public void deleteItem(Id id) {
		this.service.deleteItem(id);
	}
	
	@Transactional(readOnly = true)
	@Override
	public Item retrieveItem(Id id) {
		ItemEntity entity = service.retrieveItem(id);
		return dtoConverter.toDTO(entity, Item.class);
	}
	
	@Transactional(readOnly = true)
	@Override
	public PagedResults listItem(PageRequest pageRequest) {
		int skip = pageRequest.offset != null ? pageRequest.offset.intValue() : 0;
		int top = pageRequest.size != null ? pageRequest.size.intValue() : 0;
		String orderBy = pageRequest.orderBy;
		String filter = pageRequest.filter;
		Page<ItemEntity> pages = this.service.listItemPageable(skip, top, orderBy, filter);
		List<ItemEntity> entities = pages.getContent();
		List<Item> dtos = null;
		
		dtos = entities != null ? entities.stream().map(e -> dtoConverter.toDTO(e, Item.class, pageRequest.displayFields)).collect(Collectors.toList()) : null;
		return new PagedResults(dtos, Long.valueOf(pages.getTotalPages()), Long.valueOf(pages.getTotalElements()));
	}
	
	@Transactional
	@Override
	public CreateBulkItemOutput createBulkItem(CreateBulkItemInput toCreate) {
		if (toCreate != null) {
			List<Item> entitiesToCreate = toCreate.entities;
			if (entitiesToCreate != null && !entitiesToCreate.isEmpty()) {
				entitiesToCreate.forEach(bean -> {
					customValidator.validate(bean, entityDefProvider.getEntityDef("item"));
					bean.validate();
				});
				
				List<ItemEntity> entities = entitiesToCreate.stream().map(bean -> dtoConverter.toEntity(bean, ItemEntity.class))
						.collect(Collectors.toList());
				this.service.createBulk(entities);
			}
		}
		return new CreateBulkItemOutput();
	}
	
	@Transactional
	@Override
	public ImportItemOutput importItem(ImportItemInput request) {
		Importer importer = BatchIntegrationController.getInstance().newImporter();
		StartImportProcess startImportProcess = new StartImportProcess(importer, request.config);
		startImportProcess.start();
		ImportItemOutput output = new ImportItemOutput(importer.getId());
		return output;
	}
	
	@Transactional(readOnly = true)
	@Override
	public ExportItemOutput exportItem(ExportItemInput request) {
		/*
		 * **** Not implemented yet **** ExporterControl control =
		 * ExporterControl.getInstance(); Exporter exporter =
		 * control.newExporter(); StartExportProcess startExportProcess = new
		 * StartExportProcess(exporter, request.config);
		 * startExportProcess.start();
		 */
		ExportItemOutput output = new ExportItemOutput(
				null /* exporter.getId() */);
		return output;
	}
	
	class StartImportProcess extends Thread {
	
		private Importer importer;
		private ImportConfig config;
		
		StartImportProcess(Importer importer, ImportConfig config) {
			this.importer = importer;
			this.importer.addListener(new ItemImporterListener());
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
					importer.setBeanClass(Item.class.getName());
					importer.setCrudService(ItemHandler.this.service, (config.batchSize > 0));
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
				File blob = File.createTempFile("item", "blob");
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
