/* Database: Oracle. Generation date: 2018-12-08 11:17:29:437 */
/* Entity Cliente */
create table cliente (
	id RAW(16) NOT NULL,
	nome VARCHAR(255) NOT NULL,
	data_nascimento DATE NOT NULL /* dataNascimento */,
	credito_habilitado NUMBER(1) /* creditoHabilitado */,
	cpf VARCHAR(255) NOT NULL,
	id_foto VARCHAR(255) /* idFoto */,
	ext CLOB,
	CONSTRAINT cliente_JSON_ext CHECK (ext IS JSON)
);


/* Creating index for customization column */
CREATE INDEX cliente_ext ON cliente (ext) INDEXTYPE IS CTXSYS.CONTEXT PARAMETERS ('section group CTXSYS.JSON_SECTION_GROUP SYNC (ON COMMIT)');

/* Entity Item */
create table item (
	id RAW(16) NOT NULL,
	descricao VARCHAR(255) NOT NULL,
	quantidade NUMBER(19,4) NOT NULL,
	valor_unitario NUMBER(19,4) NOT NULL /* valorUnitario */,
	ext CLOB,
	CONSTRAINT item_JSON_ext CHECK (ext IS JSON)
);


/* Creating index for customization column */
CREATE INDEX item_ext ON item (ext) INDEXTYPE IS CTXSYS.CONTEXT PARAMETERS ('section group CTXSYS.JSON_SECTION_GROUP SYNC (ON COMMIT)');

/* Entity Pedido */
create table pedido (
	id RAW(16) NOT NULL,
	data DATE NOT NULL,
	obsservacoes VARCHAR(255),
	cliente RAW(16) NOT NULL,
	ext CLOB,
	CONSTRAINT pedido_JSON_ext CHECK (ext IS JSON)
);


/* Creating index for customization column */
CREATE INDEX pedido_ext ON pedido (ext) INDEXTYPE IS CTXSYS.CONTEXT PARAMETERS ('section group CTXSYS.JSON_SECTION_GROUP SYNC (ON COMMIT)');

/* Join Tables */
/* master: Pedido as pedido, detail: Item as item */
create table pedido_itens (
	pedido_id RAW(16) NOT NULL,
	itens_id RAW(16) NOT NULL
);

/* Primary Key Constraints */
alter table cliente add constraint pk_cliente_id primary key(id);
alter table item add constraint pk_item_id primary key(id);
alter table pedido_itens add constraint pk_pedido_itens primary key(pedido_id, itens_id);
alter table pedido add constraint pk_pedido_id primary key(id);

/* Foreign Key Constraints */
alter table pedido add constraint fkhwe8dz0lgrnr77lh0txuj1qvaipo foreign key (cliente) references cliente (id);
alter table pedido_itens add constraint fkfvpsepreojuackluccfwm7lkevtk foreign key (pedido_id) references pedido (id);
alter table pedido_itens add constraint fken3xyzrghmnharsdxeptninjedqo foreign key (itens_id) references item (id);

/* Unique Key Constraints */

/* Sequences for auto increment entity ids */
