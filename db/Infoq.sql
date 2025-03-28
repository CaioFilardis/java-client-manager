CREATE DATABASE dbinfo;

SELECT * FROM tbusuario;

USE dbinfo;

/* tabela usuario */
CREATE TABLE tbusuario (
	iduser int primary key,
	usuario varchar(50) not null,
	telefone varchar(15),
	login varchar(15) not null unique,
	senha varchar(15) not null
);

INSERT INTO tbusuario (iduser, usuario, telefone, login, senha)
VALUES (1, 'Caio Filardis', '99999-9999', 'caio', '123');

/* tabela cliente */
CREATE TABLE tbcliente (
	idcliente int primary key auto_increment,
    nome varchar(50) not null,
    endereco varchar(100),
    telefone varchar(15),
    email varchar(50)
);

INSERT INTO tbcliente (nome, endereco, telefone, email)
VALUES ('Fulano', 'rua fulano', '99999-9999', 'fulano@teste.com');

SELECT * FROM tbcliente;


    

