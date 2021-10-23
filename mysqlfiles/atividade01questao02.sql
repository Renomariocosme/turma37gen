create database db_ecommecer;


create table tb_produtos(
	id_produto INT auto_increment,
		nome VARCHAR (100),
        preco double ,
        tamanho VARCHAR(100),
        funcao VARCHAR(100),
        cor VARCHAR (100),
	primary key(id_produto)

); 
use db_ecommecer;
insert into tb_produtos (nome, preco, tamanho,funcao,cor) values
("Camisa","19.90","P","vestir","vermelho"),
("Calça","60.00","M","vestir","preto"),
("Vestido","29.99","G","vestir","lilás"),
("SHORT","39.99","GG","vestir","azul");

select * from tb_produtos WHERE preco>500;

select * from tb_produtos WHERE preco<500;

use db_ecommecer;
update tb_produtos
set  preco = 60.00  where id_produto = 1;




