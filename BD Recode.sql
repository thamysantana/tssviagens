create or replace table cliente(
id int(10) auto_increment not null,
Nome VARCHAR(50) NOT NULL,  
 Login VARCHAR(50) NOT NULL,  
 Senha VARCHAR(10) NOT NULL,
 primary key(id)
);

create or replace table Passageiros(
id int(10) auto_increment not null,
 Nome VARCHAR(50),  
 CPF VARCHAR(11),  
 RG VARCHAR(10),  
 Telefone VARCHAR(10),  
primary key(id)
);

create or replace table destino(
id int(10) auto_increment not null,
DataViagens DATE NOT NULL,  
 horaPartida TIME NOT NULL,  
 origem VARCHAR(50) NOT NULL,  
 destino VARCHAR(50) NOT NULL,
primary key(id)
);

create or replace table viagens(
id int(10) auto_increment not null,
CompanhiaAerea VARCHAR(50),  
modelo VARCHAR(50),  
primary key(id)
);

