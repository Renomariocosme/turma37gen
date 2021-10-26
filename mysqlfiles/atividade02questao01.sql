create database db_generation_game_online;
use  db_generation_game_online;

create table  tb_classes(
id_classe int not null auto_increment,
poder_defesa VARCHAR (3000), 
poder_ataque VARCHAR (3000), 
nome VARCHAR (100), 
primary key (id_classe)
);

create table tb_personagem(
id_personagens int not null auto_increment,
maldade VARCHAR(100),
inteligencia VARCHAR (100),
bondade VARCHAR (100),
destreza VARCHAR (100),
supremo VARCHAR (100),
primary key (id_personagens),
fk_personagens INT,
foreign key (fk_personagens) REFERENCES tb_classes (id_classe)
);


INSERT INTO tb_classes(nome, poder_defesa, poder_ataque) 
values 
("guerreiro", "1500", "2050"),
("mago", "1000","2800"),
("assassino","700","3000"),
("necromancer","1900","2400"),
("sarcedote","1000","2304");

INSERT INTO tb_personagem(maldade, inteligencia, bondade, destreza, supremo)
values
("0","10","8","5","10"),
("2","10","9","4","7"),
("10","5","4","9","7"),
("10","8","3","2","4"),
("0","10","10","5","10");

select * from tb_classes where poder_defesa>2000;
select * from tb_classes where poder_ataque between 1000 and 2000;
update tb_classes 
set nome = "claus"
where id_classe = 2;



-- Pesquisa com LIKE
SELECT * FROM tb_classes WHERE nome LIKE '%c';

-- Inner Join 

SELECT * 
FROM tb_classes -- ESQUERDA
INNER JOIN tb_personagem -- DIREITA
ON tb_classes.id_classe = tb_personagem.fk_personagens;

-- FULL JOIN (UNION)
SELECT * FROM tb_classes LEFT JOIN tb_personagem ON tb_classes.id_classe = tb_personagem.fk_personagens
UNION
SELECT * FROM tb_classes RIGHT JOIN tb_personagem ON tb_classes.id_classe = tb_personagem.fk_personagens;