CREATE TABLE itens
(
    id_item          serial NOT NULL,
    nome        character varying(350) NOT NULL,
    urlfoto     character varying(350),
    id_usuario          serial NOT NULL,
    CONSTRAINT PK_itens PRIMARY KEY (id_item),
    CONSTRAINT FK_itens FOREIGN KEY (id_usuario)
        REFERENCES usuarios (id_usuario) 
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

INSERT INTO produtos(nome, urlfoto, descricao) 
    VALUES ('Chinelo','https://havaianas.com.br/dw/image/v2/BDDJ_PRD/on/demandware.static/-/Sites-havaianas-master/default/dw978a6e76/product-images/4001280_0031_HAVAIANAS%20TRADICIONAL_C.png','Este é o modelo que deu início à história de Havaianas e traduz a autenticidade da marca: para alguns é uma Havaianas com preço acessível; para muitos, representa um produto vintage que traz boas lembranças.');
 