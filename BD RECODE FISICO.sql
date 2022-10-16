USE tssviagens;

create or replace table Cliente(
id_CpfCliente VARCHAR(11) not null,
nome VARCHAR(50) not null,
email VARCHAR(50) not NULL,
telefone VARCHAR(11) NOT NULL,
datNasc DATE,
primary key(id_CpfCliente)
);


CREATE OR REPLACE TABLE Usuario (
id_Usuario int auto_increment,
nome varchar(50) not null,
telefone varchar(11),
email varchar(50) unique not null,
senha VARCHAR(10) not NULL,
dataCad DATE, 
Primary key (id_Usuario)
);

create or replace table Contato(
id_Contato int(10) auto_increment not null,
nome varchar(70) not null,
email varchar(100) not NULL UNIQUE,
telefone varchar(11),
primary key(id_Contato)
);

create or replace table Destino(
id_Destino int(10) auto_increment not NULL,
Quant_Disponivel int not null,
Nome_Destino VARCHAR(20) not NULL,
Aeroporto VARCHAR(10),
Valor_Destino DOUBLE NOT NULL,
primary key(id_Destino)
);



create or replace table Passagem(
id_Pass int AUTO_INCREMENT,
dataEmbarque date not null,
dataRetorno date not NULL,
Preco_Pass DOUBLE not NULL,
primary key(id_Pass)
);
