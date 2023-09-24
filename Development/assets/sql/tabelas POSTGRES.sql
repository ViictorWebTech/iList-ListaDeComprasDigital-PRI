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

drop table usuarios;

select * from usuarios;

INSERT INTO usuarios(nome, email, senha) 
    VALUES ('Victor','victor@gmail.com', 123);
   
   INSERT INTO usuarios(nome, email, senha) 
    VALUES ('Marcos','marcos@gmail.com', 123);

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

drop table itens;

INSERT INTO itens(nome, urlfoto, nome_mercado, preco) 
    VALUES ('Chinelo','https://havaianas.com.br/dw/image/v2/BDDJ_PRD/on/demandware.static/-/Sites-havaianas-master/default/dw978a6e76/product-images/4001280_0031_HAVAIANAS%20TRADICIONAL_C.png','Porecatu', 20);
 
   
   
INSERT INTO itens(nome, urlfoto, nome_mercado, preco) 
    VALUES ('Chinelo 2.0','https://havaianas.com.br/dw/image/v2/BDDJ_PRD/on/demandware.static/-/Sites-havaianas-master/default/dw978a6e76/product-images/4001280_0031_HAVAIANAS%20TRADICIONAL_C.png','Porecatu', 30);
 
   
   select * from itens;