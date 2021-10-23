create database db_rh;
use db_rh;

create table tb_funcionarios(
	id_funcionario INT AUTO_INCREMENT,
    nome VARCHAR(255), 
    email VARCHAR(255),
    cpf VARCHAR (255),
    cargo VARCHAR (255),
    salario FLOAT NULL,
    primary key (id_funcionario)
);
insert into tb_funcionarios (nome, email, cpf, cargo, salario) values 
("laiane karla","laianekarla@gmail.com","514-111-111.31", "dev junior", 10.000),
("rebeca andrade","rebecaprincesinha@gmail.com","111-111-111.53", "auxi adm", 1.100),
("rininho cosme","rininhodosax@gmail.com","111-111-520.40","marketing", 3.500);


SELECT  * from tb_funcionarios where salario>2000;

SELECT * from tb_funcionarios where salario<2000;


use db_rh;

update tb_funcionarios 
set salario = 10.000 where id_funcionario = 2;

 

















	




