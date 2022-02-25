CREATE TABLE estabelecimento (
  id bigint NOT NULL AUTO_INCREMENT PRIMARY KEY ,
  nome_fantasia varchar(120) not null ,
  cnpj varchar(14) not null ,
  endereco varchar(150) not null ,
  bairro varchar(120),
  cidade varchar(120),
  estado varchar(2),
  cep varchar(8),
  telefone varchar(11),
  celular varchar(12),
  email varchar(120),
  site varchar(150),
  CONSTRAINT u_cnpj UNIQUE(cnpj)
);