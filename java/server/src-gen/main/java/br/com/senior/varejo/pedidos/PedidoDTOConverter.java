/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.varejo.pedidos;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.AbstractConverter;
import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;

import br.com.senior.custom.ConversionContext;
import br.com.senior.custom.ConvertedObjectCondition;

import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Lazy;

import br.com.senior.custom.EntityDTOConverter;

@Component
@Lazy
public class PedidoDTOConverter extends EntityDTOConverter {

	@Override
	public ModelMapper createMapperToEntity(ConversionContext context) {
		ModelMapper mapper = super.createMapperToEntity(context);
		Converter<Cliente, ClienteEntity> clienteConverter = new AbstractConverter<Cliente, ClienteEntity>() {
			@Override
			public ClienteEntity convert(Cliente source) {
				return toEntity(source, ClienteEntity.class, context);
			}
		};
		Converter <List<Item>, List<ItemEntity>> itensConverter = new AbstractConverter<List<Item>, List<ItemEntity>>() {
			@Override
			public List<ItemEntity> convert(List<Item> source) {
				if (source == null) {
					return Collections.emptyList();
				}
				return source.stream().map(d -> toEntity(d, ItemEntity.class, context)).collect(Collectors.toList());
			}
		};

		PropertyMap<Pedido, PedidoEntity> pedidoMap = new PropertyMap<Pedido, PedidoEntity>() {
			@Override
			protected void configure() {
				using(clienteConverter).map(source.cliente).setCliente(null);
				using(itensConverter).map(source.itens).setItens(null);
			}
		};
		mapper.addMappings(pedidoMap);
		mapper.getTypeMap(Pedido.class, PedidoEntity.class).setPropertyCondition(new ConvertedObjectCondition(context));
		return mapper;
	}

	@Override
	public ModelMapper createMapperToDTO(ConversionContext context) {
		ModelMapper mapper = super.createMapperToDTO(context);
		Converter<ClienteEntity, Cliente> clienteConverter = new AbstractConverter<ClienteEntity, Cliente>() {
			@Override
			public Cliente convert(ClienteEntity source) {
				if (context.isIncludeTranslations()) {
					return toDTOWithTranslations(source, Cliente.class, context);
				}
				return toDTO(source, Cliente.class, context);
			}
		};
		Converter <List<ItemEntity>, List<Item>> itensConverter = new AbstractConverter<List<ItemEntity>, List<Item>>() {
			@Override
			public List<Item> convert(List<ItemEntity> source) {
				if (context.isIncludeTranslations()) {
					return source.stream().map(e -> toDTOWithTranslations(e, Item.class, context)).collect(Collectors.toList());
				}
				return source.stream().map(e -> toDTO(e, Item.class, context)).collect(Collectors.toList());
			}
		};
		
		PropertyMap<PedidoEntity, Pedido> pedidoMap = new PropertyMap<PedidoEntity, Pedido>() {
			@Override
			public void configure() {
				using(clienteConverter).map(source.getCliente(), destination.cliente);
				using(itensConverter).map(source.getItens(), destination.itens);
			}
		};
		
		mapper.addMappings(pedidoMap);
		mapper.getTypeMap(PedidoEntity.class, Pedido.class).setPropertyCondition(new ConvertedObjectCondition(context));
		return mapper;
	}
}
