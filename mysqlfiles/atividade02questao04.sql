create database db_cidades_das_frutas;

use db_cidades_das_frutas;

create table tb_categorias(
id_categoria INT NOT NULL AUTO_INCREMENT,
nome VARCHAR(100),
cor VARCHAR(100),
primary key(id_categoria)
);

create table tb_produtos(
	id_produto INT NOT NULL auto_increment,
    valor DOUBLE NOT NULL,
    quantidade VARCHAR(1000),
    fk_produtos INT,
    primary key(id_produto),
    foreign key (fk_produtos) references tb_categorias(id_categoria)

);

INSERT INTO tb_categorias(nome, cor) values 
("Banana","Amarela"),
("Caju","Laranja"),
("Cajá","Laranja"),
("Acerola","Vermelha"),
("Uva","roxa");

INSERT INTO tb_produtos(valor, quantidade) values
("50.00","10"),
("8.00","3"),
("60.00","200"),
("25.00",100),
("50.00","10");


Select * from tb_produtos where valor>50.00;

SELECT * FROM tb_produtos where valor between 3.00 and 60.00;

-- PESQUISAR COM LIKE --

SELECT * FROM tb_categorias where  nome LIKE 'c%';

-- INNER JOIN --
SELECT * FROM tb_produtos
INNER JOIN tb_categorias
ON tb_categorias.id_categoria = tb_produtos.fk_produtos;

-- FULL JOIN --

SELECT * FROM tb_produtos LEFT JOIN tb_categorias ON tb_categorias.id_categoria = tb_produtos.fk_produtos
UNION 
SELECT * FROM tb_produtos RIGHT JOIN tb_categorias ON tb_categorias.id_categoria = tb_produtos.fk_produtos;



