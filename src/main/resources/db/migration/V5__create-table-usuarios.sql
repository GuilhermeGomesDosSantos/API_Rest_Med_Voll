create table usuarios(
    id bigint NOT NULL auto_increment,
    usuario VARCHAR(100) NOT NULL,
    senha VARCHAR(255) NOT NULL,

    primary key(id)
    );