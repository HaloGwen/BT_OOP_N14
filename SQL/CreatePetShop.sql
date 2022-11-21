create database petshop1
use petshop1
create table Buyer(
	Name nvarchar(50) not null,
	NumberPhone varchar(50) not null primary key,
	Email varchar(50) not null,
	Address nvarchar(500) not null,
	Gender varchar(20) not null,
	Status nchar(10) not null default '1'
)

create table Pet(
	pId int not null primary key,
	pName nvarchar(50) not null,
	Price decimal(18,0) not null,
	Description nvarchar(500) not null,
	Species varchar(10) not null,
	Status int not null default '1'
)

create table Orderr(
	ID_Order int not null primary key,
	ID_Bill int not null foreign key references Bill(ID_Bill),
	pId int not null foreign key references Pet(pId),
	pName nvarchar(50) not null,
	Species varchar(50) not null,
	Price decimal(18,0) not null,
	Name nvarchar(50) not null,
	NumberPhone varchar(50) not null foreign key references Buyer(NumberPhone),
	Date varchar(50) not null,
	Status int not null default '1'
)

create table Bill(
	ID_Bill int not null primary key,
	Total decimal(18,0) not null,
	Paid decimal(18,0) not null,
	Retun decimal(18,0) not null,
)