

use WebShop
go

/*******   P R O C E D U R E S   ********/
/*
CUSTOMER
	INSERT_CUSTOMER
	GET_ALL_CUSTOMERS
	GET_CUSTOMER
CATEGORY
	GET_ALL_CATEGORY
PRODUCT
	GET_ALL_PRODUCTS
	GET_PRODUCT
PAYMENT METHOD
	GET_ALL_PAYMENT_METHODS
BILL
	GET_ALL_BILLS
	INSERT_BILL
	GET_BILL
ITEM
	GET_ITEMS_FOR_BILL
	INSERT_ITEM
LOG INFO
	GET_ALL_LOGINFO
	INSERT_LOGINFO
*/

/***************************************************/
/*****************C U S T O M E R*******************/
/***************************************************/

CREATE PROC INSERT_CUSTOMER
@FirstName nvarchar(30),
@LastName nvarchar(30),
@Adress nvarchar(100),
@Email nvarchar(30),
@CustomerPassword nvarchar(30)
as
Insert into Customer(FirstName,LastName,Adress,Email,CustomerPassword)
Values(@FirstName,@LastName,@Adress,@Email,@CustomerPassword)
go

CREATE PROC GET_ALL_CUSTOMERS
as
select*from Customer
go

CREATE PROC GET_CUSTOMER
@id int
as
select*from Customer
where IDCustomer=@id
go


/***************************************************/
/*****************C A T E G O R Y*******************/
/***************************************************/
CREATE PROC GET_ALL_CATEGORY
as
select*from Category
go

/***************************************************/
/******************P R O D U C T********************/
/***************************************************/
CREATE PROC GET_ALL_PRODUCTS
as
select*from Product
go

/*
CREATE PROC INSERT_PRODUCT
@Title nvarchar(30),
@Brand nvarchar(40),
@About nvarchar(300),
@Price float,
@Img nvarchar(200),
@CatgoryID int
as
Insert into Product(Title,Brand,About,Price,Img,CatgoryID)
Value(@Title,@Brand,@About,@Price,@Img,@CatgoryID)
go
*/

CREATE PROC GET_PRODUCT
@id int
as
select IDProduct, Title, Brand, About, Price, Img, CatgoryID from Product
where IDProduct=@id
go

/***************************************************/
/******************P A Y M E N T********************/
/*******************M E T H O D*********************/
/***************************************************/
CREATE PROC GET_ALL_PAYMENT_METHODS
as
select*from PaymentMethod
go

/***************************************************/
/**********************B I L L**********************/
/***************************************************/
CREATE PROC GET_ALL_BILLS
as
select*from Bill
go

CREATE PROC INSERT_BILL
@BillDate date,
@CustomerID int,
@PaymentMethodID int
as
Insert into Bill(BillDate,CustomerID,PaymentMethodID)
Values(@BillDate,@CustomerID,@PaymentMethodID)
go

CREATE PROC GET_BILL
@id int
as
select*from Bill
where IDBill=@id
go

/***************************************************/
/**********************I T E M**********************/
/***************************************************/
CREATE PROC GET_ITEMS_FOR_BILL
@billID int
as
select*from Item
where BillID=@billID
go

CREATE PROC INSERT_ITEM
@ProductID int,
@BillID int,
@Quantity int
as
Insert into Item(ProductID,BillID,Quantity)
Values(@ProductID,@BillID,@Quantity)
go


/***************************************************/
/*****************L O G   I N F O*******************/
/***************************************************/
CREATE PROC GET_ALL_LOGINFO
as
select*from LogInfo
go

CREATE PROC INSERT_LOGINFO
@CustomerID int,
@LogDate date,
@IPAdress nvarchar(300)
as
Insert into LogInfo(CustomerID,LogDate,IPAdress)
Values(@CustomerID,@LogDate,@IPAdress)
go
