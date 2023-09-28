
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
