create database inventory_management;

show tables;

create table Products(
    pid int(5) unique PRIMARY KEY not NULL,
    pname varchar(120) not null,
    quantity int(3) not null,
    Price int(3) not null
);
describe Products;

create table Seller(
    sid int(5) unique PRIMARY KEY not NULL,
    sname varchar(100) not null,
    pid int(5),
    FOREIGN key (pid) REFERENCES Products(pid)
);

desc Seller;

create table Customer(
    custid int(5) not null unique primary key,
    custname varchar(100),
    sid int(5),
    pid int(5),
    FOREIGN KEY (sid) REFERENCES Seller(sid),
    FOREIGN KEY (pid) REFERENCES Products(pid)
);

desc Customer;

COMMIT;