/*create database viniciusjs;
use viniciusjs;

create table medico ( idmedico int not null auto_increment,
 nome varchar(120),
 especialidade int,
 crm int, 
 cpf varchar(11),
 primary key(idmedico));
create table paciente ( idpaciente int not null auto_increment, 
nome varchar(120),
 cpf varchar(11),
 idade int,
 primary key(idpaciente));
create table consulta ( idconsulta int not null auto_increment, 
id_medico int,
 id_paciente int,
 convenio varchar(120),
 primary key(idconsulta),
 foreign key (id_paciente) references paciente(idpaciente),
 foreign key (id_medico) references medico(idmedico)
 );
*/