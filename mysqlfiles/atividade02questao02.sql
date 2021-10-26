create database db_pizzaria_legal;
use db_pizzaria_legal;

create table tb_categorias(
id_categoria int not null auto_increment,
nome VARCHAR (255),
funcao VARCHAR (255),
idade VARCHAR (255),
primary key (id_categoria)
);

create table tb_pizzas(
id_pizza int not null auto_increment,
tamanho VARCHAR (255),
valor DOUBLE NOT NULL,
sabor VARCHAR (255),
acompanhamento VARCHAR (255),
bordas VARCHAR (255),
fk_produtos INT,
primary key (id_pizza),
foreign key (fk_produtos) REFERENCES tb_categorias (id_categoria)
);

INSERT INTO tb_categorias (nome, funcao, idade)
VALUES 
("Pizza do recanto","garcom", "24"),
("Pizza mais voce","gerente","25"),
("Pizzaria LLs","atendente","27"),
("Pizzaria Renom","garcom","18"),
("Pizza de Josi", "pizzaiolo","23");


INSERT INTO tb_pizzas (tamanho, valor, sabor, acompanhamento, bordas)
VALUES
("P","29.00","Calabresa","Coca-cola","bordas de cheddar"),
("M","45.00","Frango","Refrigerante","bordas de catupiry"),
("G","60.00","Portuguesa","Coca-cola","bordas de cheddar"),
("P","29.00","Muçarela","Suco","bordas de cheddar"),
("M","45.00","Marguerita","Coca-cola","bordas de catupiry"),
("P","29.00","Chocolate","Suco","bordas de cheddar"),
("G","60.00","Calabresa","Coca-cola","bordas de cheddar"),
("P","29.00","Frango","Coca-cola","bordas de cheddar");


SELECT * FROM tb_pizzas where valor>45.00;
SELECT * FROM tb_pizzas  where valor BETWEEN 29.00 AND 60.00;


-- pesquisa com Like 
SELECT*FROM tb_pizzas WHERE sabor LIKE 'c%';

-- inner join 
SELECT * FROM tb_pizzas -- ESQUERDA
INNER JOIN tb_categorias -- DIREITA
ON tb_categorias.id_categoria = tb_pizzas.fk_produtos;

SELECT * FROM tb_pizzas LEFT JOIN tb_categorias ON tb_categorias.id_categoria = tb_pizzas.fk_produtos
UNION
SELECT * FROM tb_pizzas RIGHT JOIN tb_categorias ON tb_categorias.id_categoria = tb_pizzas.fk_produtos;
