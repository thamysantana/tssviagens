CREATE TABLE Cliente 
( 
 IDCliente INT PRIMARY KEY AUTO_INCREMENT,  
 Nome VARCHAR(50) NOT NULL,  
 Login VARCHAR(50) NOT NULL,  
 Senha VARCHAR(10) NOT NULL,  
); 

CREATE TABLE Veiculos 
( 
 IDveiculo INT PRIMARY KEY AUTO_INCREMENT,  
 CompanhiaAerea VARCHAR(50),  
 modelo VARCHAR(50),  
 idViagens INT,  
); 

CREATE TABLE Viagens 
( 
 IDViagens VARCHAR(n) PRIMARY KEY AUTO_INCREMENT,  
 DataViagens DATE NOT NULL,  
 horaPartida DATE NOT NULL,  
 origem VARCHAR(50) NOT NULL,  
 destino VARCHAR(50) NOT NULL,  
 idPassageiros INT,  
); 

CREATE TABLE Passageiros 
( 
 IDPassageiro INT PRIMARY KEY AUTO_INCREMENT,  
 Nome VARCHAR(50),  
 CPF VARCHAR(11),  
 RG VARCHAR(10),  
 Telefone VARCHAR(10),  
); 

ALTER TABLE Veiculos ADD FOREIGN KEY(idViagens) REFERENCES Viagens (idViagens)
ALTER TABLE Viagens ADD FOREIGN KEY(idPassageiros) REFERENCES Passageiros (idPassageiros)
