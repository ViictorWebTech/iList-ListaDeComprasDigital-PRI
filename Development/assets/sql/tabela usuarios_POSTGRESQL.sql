CREATE TABLE usuarios
(
    id_usuario          serial NOT NULL,
    nome_usuario        character varying(350) NOT NULL,
    email       character varying(350) NOT NULL,
    senha       character varying(150) NOT NULL,
    urlfoto_usuario     character varying(350),
    
    CONSTRAINT  PK_usuarios PRIMARY KEY (id_usuario)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;