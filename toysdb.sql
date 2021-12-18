create database toysdb;

create table Toy(
	ToyID int primary key auto_increment,
    Description varchar(255),
    Price double,
    TypeID int,
    CategoryID int,
    FOREIGN KEY (TypeID) REFERENCES Type(TypeID),
    FOREIGN KEY (CategoryID) REFERENCES Category(CategoryID)
);

create table Type(
	TypeID int primary key,
    TypeName varchar(255)
);

create table Category(
	CategoryID int primary key,
    CategoryName varchar(255)
);

insert into Type (TypeID, TypeName) values (1, 'Figurine');
insert into Type (TypeID, TypeName) values (2, 'Electrice');

insert into Category (CategoryID, CategoryName) values (1, 'LEGO');
insert into Category (CategoryID, CategoryName) values (2, 'Papusi');
insert into Category (CategoryID, CategoryName) values (3, 'Masini');
insert into Category (CategoryID, CategoryName) values (4, 'Puzzle');
insert into Category (CategoryID, CategoryName) values (5, 'Exterior');

insert into Toy (Description, Price, TypeID, CategoryID) values ('Titanic', 2500, 1, 1);
insert into Toy (Description, Price, TypeID, CategoryID) values ('Flowers', 300, 1, 1);
insert into Toy (Description, Price, TypeID, CategoryID) values ('Baby Ana', 200, 1, 2);
insert into Toy (Description, Price, TypeID, CategoryID) values ('Masina telecomanda', 500, 2, 3);
insert into Toy (Description, Price, TypeID, CategoryID) values ('Castelul Peles', 100, 1, 4);
insert into Toy (Description, Price, TypeID, CategoryID) values ('Leagan', 3000, 1, 5);


select * from Type;
select * from Category;
select * from Toy;

Select t.toyid, t.description, t.price, ty.typename, c.categoryname from Toy t inner join type ty on t.TypeID = ty.Typeid inner join category c on t.categoryid = c.Categoryid;
