

use WebShop
go


/*******   T A B L E S   ********/
/*
CUSTOMER
CATEGORY
PRODUCT
PAYMENTMETHOD
BILL
ITEM
LOGINFO
*/

CREATE TABLE Customer(
IDCustomer int primary key identity,
FirstName nvarchar(30),
LastName nvarchar(30),
Adress nvarchar(100),
Email nvarchar(30),
CustomerPassword nvarchar(30)
)
go

CREATE TABLE Category(
IDCategory int primary key identity,
Title nvarchar(30)
)

CREATE TABLE Product(
IDProduct int primary key identity,
Title nvarchar(30),
Brand nvarchar(40),
About nvarchar(300),
Price float,
Img nvarchar(200),
CatgoryID int foreign key references Category(IDCategory)
)

CREATE TABLE PaymentMethod(
IDPaymentMethod int primary key identity,
PaymentMethodName nvarchar(30)
)

CREATE TABLE Bill(
IDBill int primary key identity,
BillDate nvarchar(50),
CustomerID int foreign key references Customer(IDCustomer),
PaymentMethodID int foreign key references PaymentMethod(IDPaymentMethod)
)


CREATE TABLE Item(
IDItem int primary key identity,
ProductID int foreign key references Product(IDProduct),
BillID int foreign key references Bill(IDBill),
Quantity int
)


CREATE TABLE LogInfo(
IDLogInfo int primary key identity,
CustomerID int foreign key references Customer(IDCustomer),
LogDate nvarchar(50),
IPAdress nvarchar(300)
)



