create sequence usuarios_id_usuario_seq start 1;

CREATE TABLE usuarios(
    id_usuario          int NOT null default nextval('usuarios_id_usuario_seq'),
    nome_usuario        character varying(350) NOT NULL,
    email       character varying(350) NOT NULL,
    senha       character varying(150) NOT NULL,
    urlfoto_usuario     character varying(350),
    
    CONSTRAINT  PK_usuarios PRIMARY key (id_usuario))
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;


--Comandos Úteis
--drop table usuarios;

--select * from usuarios;


CREATE TABLE itens
(
    id_item          serial NOT NULL,
    nome        character varying(350) NOT NULL,
    urlfoto     character varying(350),
    preco real,
    nome_mercado character varying(350),
    id_usuario          int NOT NULL,
    CONSTRAINT PK_itens PRIMARY KEY (id_item),
    constraint FK_usuario_item foreign KEY(id_usuario) references usuarios(id_usuario)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;


--Comandos Úteis
--drop table itens;
-- select * from itens;