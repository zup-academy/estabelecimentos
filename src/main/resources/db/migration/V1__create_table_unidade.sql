CREATE TABLE unidade (
  id bigint NOT NULL AUTO_INCREMENT PRIMARY KEY ,
  nome varchar(120) not null ,
  telefone varchar(11),
  documento varchar(18) not null,
  email varchar(120) not null,
  logradouro varchar(150) not null ,
  numero int,
  bairro varchar(120),
  cidade varchar(120),
  estado varchar(2),
  cep varchar(9),
  data_criado timestamp,
  CONSTRAINT u_documento UNIQUE(documento),
  CONSTRAINT  u_email UNIQUE(email)
);