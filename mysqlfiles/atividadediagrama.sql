create database db_blog_pessoal;
use db_blog_pessoal;

create table tb_temas(
	id_tema BIGINT NOT NULL AUTO_INCREMENT,
    descricao VARCHAR (255),
    primary key(id_tema)

);
create table tb_usuarios(
	id_usuario BIGINT NOT NULL,
    nome VARCHAR (255),
    usuario VARCHAR (255),
    senha VARCHAR (255),
    primary key (id_usuario)
);

create table postagens(
id_postagem BIGINT NOT NULL AUTO_INCREMENT,
titulo VARCHAR(255),
texto VARCHAR (1000),
fk_tema BIGINT,
fk_usuario BIGINT,
data_postagem timestamp,
primary key(id_postagem),
-- pode ter mais de uma chave estrageira sim --
foreign key (fk_tema) references tb_temas(id_tema),
foreign key (fk_usuario) references tb_usuarios(id_usuario)

);

