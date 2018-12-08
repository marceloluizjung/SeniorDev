/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.varejo.pedidos;

import java.util.List;
import br.com.senior.varejo.pedidos.Item.Id;
import br.com.senior.messaging.customspringdata.EntityInfo;
import br.com.senior.springbatchintegration.importer.CrudService;
import org.springframework.data.domain.Page;

public interface ItemCrudService extends CrudService<ItemEntity> {
	
	public ItemEntity createItem(ItemEntity toCreate);
	
	@Deprecated
	public ItemEntity createMergeItem(ItemEntity toCreateMerge);
	
	public ItemEntity updateItem(ItemEntity toUpdate);
	
	@Deprecated
	public ItemEntity updateMergeItem(ItemEntity toUpdateMerge);
	
	public void deleteItem(Id id);
	
	public ItemEntity retrieveItem(Id id);
	
	@Deprecated
	public List<ItemEntity> listItem(int skip, int top);
	
	public Page<ItemEntity> listItemPageable(int skip, int top);
	
	public Page<ItemEntity> listItemPageable(int skip, int top, String orderBy);
	
	public Page<ItemEntity> listItemPageable(int skip, int top, String orderBy, String filter);
	
	public Page<ItemEntity> listItemPageable(int skip, int top, String orderBy, String filter, EntityInfo parentEntity);
	
	public void createBulkItem(List<ItemEntity> entities);

	public ItemBaseRepository getRepository();
	
}
