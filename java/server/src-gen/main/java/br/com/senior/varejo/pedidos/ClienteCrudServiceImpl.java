/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.varejo.pedidos;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.inject.Inject;

import org.apache.commons.collections.CollectionUtils;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.hibernate.Session;
import br.com.senior.custom.session.SessionInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import br.com.senior.varejo.pedidos.Cliente.Id;
import br.com.senior.messaging.ErrorCategory;
import br.com.senior.messaging.customspringdata.CustomOrder;
import br.com.senior.messaging.customspringdata.filter.FilterParser;
import br.com.senior.messaging.customspringdata.FilterParameters;
import br.com.senior.messaging.customspringdata.IntrospectorUtil;
import br.com.senior.messaging.model.ServiceException;

@Service
public class ClienteCrudServiceImpl implements ClienteCrudService {
	
	private static final Logger logger = LoggerFactory.getLogger(ClienteCrudServiceImpl.class);
	
	@Inject
	private ClienteBaseRepository repository;
	
	@Inject
	private FilterParser filterParser;

	@Inject
	private SessionInitializer sessionInitializer;
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public ClienteBaseRepository getRepository() {
		return repository;
	}
	
	@Override
	@Transactional
	public ClienteEntity create(ClienteEntity entity) {
		prepareSession();
		return this.repository.save(entity);
	}
	
	@Override
	@Transactional
	public ClienteEntity createCliente(ClienteEntity entity) {
		return create(entity);
	}
	
	@Override
	@Deprecated
	@Transactional
	public ClienteEntity createMergeCliente(ClienteEntity entity) {
		return create(entity);
	}
	
	@Override
	@Transactional
	public ClienteEntity updateCliente(ClienteEntity entity) {
		prepareSession();
		return repository.save(entity);
	}
	
	@Override
	@Deprecated
	@Transactional
	public ClienteEntity updateMergeCliente(ClienteEntity entity) {
		return updateCliente(entity);
	}
	
	@Override
	@Transactional
	public void deleteCliente(Id id) {
		prepareSession();
	    repository.delete(java.util.UUID.fromString(id.id));
	}
	
	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ClienteEntity retrieveCliente(Id id) {
		prepareSession();
		ClienteEntity entity = this.repository.findOne(java.util.UUID.fromString(id.id));
		if (entity == null) {
			throw new ServiceException(ErrorCategory.OBJECT_NOT_FOUND, "Cliente not found with id " + id.id);
		}
	    return entity;
	}
	
	@Override
	@Deprecated
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ClienteEntity> listCliente(int skip, int top) {
		prepareSession();
		List<ClienteEntity> entities = this.repository.findAll(null, null, null, skip, top);
		return entities;
	}
	
	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Page<ClienteEntity> listClientePageable(int skip, int top) {
		return listClientePageable(skip, top, null, null);
	}
	
	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Page<ClienteEntity> listClientePageable(int skip, int top, String orderBy) {
		return listClientePageable(skip, top, orderBy, null);
	}
	
	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Page<ClienteEntity> listClientePageable(int skip, int top, String orderBy, String filter) {
		prepareSession();
		int page = skip * top; //zero-based page index.
		int size = top > 0 ? top : 10; //the size of the page to be returned.
		List<CustomOrder> customOrder = new ArrayList<>();
		if (orderBy != null && !orderBy.trim().isEmpty()) {
			String[] ordersby = orderBy.split(",");
			for (String orderby : ordersby) {
				String[] orderparts = orderby.trim().split("\\s+");
				boolean desc = orderparts.length > 1 && orderparts[1].toUpperCase().equals("DESC");
				CustomOrder co = new CustomOrder(orderparts[0]);
				co.setDesc(desc);
				customOrder.add(co);
			}
		}
		
		FilterParameters filterParameters = null;
		try {
			filterParameters = filterParser.parseFilter(filter, ClienteEntity.class);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new ServiceException(ErrorCategory.BAD_REQUEST, "Invalid filter.");	
		}
		
		// Throws an exception if find a custom field in the filter expression or order by expression.
		validateFilterCustomFields(filterParameters != null ? filterParameters.getColumns() : null, customOrder);
		
		Page<ClienteEntity> requestedPage = this.repository.findAllPageable(filterParameters, customOrder, page, size);
		return requestedPage;
	}
	
	private void validateFilterCustomFields(Set<String> filterFieldNames, List<CustomOrder> customOrders) {
		Set<String> entityFieldNames = IntrospectorUtil.getAllEntityFieldNamesByClass(ClienteEntity.class);
		
		// The filter must not contain custom fields.
		if (!CollectionUtils.isEmpty(filterFieldNames)) {
			filterFieldNames.forEach(filterFieldName -> {
				if (!entityFieldNames.contains(filterFieldName)) {
					throw new ServiceException(ErrorCategory.BAD_REQUEST, "Invalid filter argument: " + filterFieldName);
				}
			});
		}
		
		// The orderby must not contain custom fields.
		if (!CollectionUtils.isEmpty(customOrders)) {
			customOrders.forEach(customOrder -> {
				if (!entityFieldNames.contains(customOrder.getField())) {
					throw new ServiceException(ErrorCategory.BAD_REQUEST, "Invalid orderby argument: " + customOrder.getField());
				}
			});
		}
	}
	
	@Override
	public void createBulk(List<ClienteEntity> entities) {
		prepareSession();
		if (entities != null && !entities.isEmpty()) {
			this.repository.save(entities);
		}
	}
	
	@Override
	public void createBulkCliente(List<ClienteEntity> entities) {
		this.createBulk(entities);
	}
	
	private void prepareSession(){
		Session session = em.unwrap(Session.class);
		sessionInitializer.initialize(session, ClienteEntity.class);
	}
}
