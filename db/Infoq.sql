USE dbinfo;

DESCRIBE tbusuario;

SELECT * FROM tbusuario;

ALTER TABLE tbusuario MODIFY iduser INT AUTO_INCREMENT;

/* Adicionando coluna em uma tabela */
ALTER TABLE 
tbusuario 
ADD COLUMN perfil VARCHAR(20) NOT NULL;

INSERT INTO `dbinfo`.`tbusuario` (`usuario`, `telefone`, `login`, `senha`, `perfil`) 
VALUES ('Funcionario', '99999-9999', 'funcionario', '123', 'user');
INSERT INTO `dbinfo`.`tbusuario` (`usuario`, `telefone`, `login`, `senha`) VALUES ('Funcioanrio', '99999-9999', 'funcionario', '123');

/* Inserindo usuário na tabela e na coluna em específico */
UPDATE 
	tbsusuario 
SET
	perfil = 'user'
WHERE
	iduser = 3;
