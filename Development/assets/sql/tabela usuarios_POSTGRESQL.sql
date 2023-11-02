create sequence usuarios_id_usuario_seq start 1;

create extension if not exists pgcrypto;

CREATE TABLE usuarios(
    id_usuario          int NOT null default nextval('usuarios_id_usuario_seq'),
    nome_usuario        character varying(350) NOT NULL,
    email       character varying(350) NOT NULL,
    senha       character varying(150) NOT NULL,
    urlfoto_usuario     character varying(350),
    
    CONSTRAINT  PK_usuarios PRIMARY key (id_usuario),
    constraint email_unico unique (email)
    )
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;