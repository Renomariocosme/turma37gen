CREATE DATABASE db_farmacia_do_bem;

USE db_farmacia_do_bem;

CREATE TABLE tb_categorias (
    id_categoria INT AUTO_INCREMENT,
    cliente VARCHAR(255),
    tipo_produto VARCHAR (250),
    PRIMARY KEY (id_categoria)
);

CREATE TABLE tb_produtos (
    id_produto INT AUTO_INCREMENT,
    nome VARCHAR(255),
    quantidade INT,
    valor DOUBLE,
    fk_id_categoria INT,
    PRIMARY KEY (id_produto),
    FOREIGN KEY (fk_id_categoria) REFERENCES tb_categorias (id_categoria)
    );

INSERT INTO tb_categorias (cliente, tipo_produto) VALUES
("Laiane", "Remédio"),
("Jéssica", "Remédio"),
("Laisa", "Remédio"),
("Rebecca", "Rémedio"),
("Adriana", "Remédio");

INSERT INTO tb_produtos (nome, quantidade, valor) VALUES
("Clonazepam","2","50.00"),
("Rivotril","3","45.00"),
("Parecetamol","1","3.00"),
("Ibuprofeno","2","60.00"),
("Pirocixam","2","70.00");

SELECT * FROM tb_produtos where valor>50.00;
SELECT * FROM tb_produtos where valor between 3.00 AND 60.00;

SELECT * FROM tb_produtos where nome like 'c%';

SELECT * FROM tb_produtos
INNER JOIN tb_categorias
ON tb_categorias.id_categoria = tb_produtos.fk_id_categoria;

-- FULL JOIN --
SELECT * FROM tb_produtos LEFT JOIN tb_categorias ON tb_categorias.id_categoria = tb_produtos.fk_id_categoria
UNION
SELECT * FROM tb_produtos LEFT JOIN tb_categorias ON tb_categorias.id_categoria = tb_produtos.fk_id_categoria;
 


