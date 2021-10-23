create database db_escola;

create table tb_estudantes(
	id_estudante INT AUTO_INCREMENT,
nome VARCHAR (100),
turma VARCHAR (100),
idade VARCHAR (100),
nota FLOAT NULL,
email VARCHAR (100),
primary key(id_estudante)

);
USE db_escola;

insert into tb_estudantes (nome,turma,idade,nota,email) values 
("Pedro Tavares","4° A", "10","8.0","pedrinho_1996@gmail.com"),
("Rebeca Pereira","6° A", "13","6.0","rebecaboneca@gmail.com"),
("Jaqueline Andrade","9° A", "16","4.0","jaquelineperfeitinha@gmail.com"),
("Rodrigo Gustavo","2° B", "5","3.0","rodrigo_cmp@gmail.com"),
("Yasmim frança","6° A", "13","8.0","yasmimfranca@gmail.com"),
("Alison Ferreira","4° A", "12","7.0","alisonferreira@gmail.com"),
("Tânia Maria","8° A", "15","5.0","taniamaria@gmail.com"),
("Paulo Aurelio","7° B", "10","3.0","paulodogera@gmail.com");

select * from tb_estudantes where nota>7;
select * from tb_estudantes where nota<7;

use db_escola;
update tb_estudantes  
set nota=3.0 where id_estudante=4;

