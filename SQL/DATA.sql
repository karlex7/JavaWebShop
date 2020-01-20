


USE WebShop
go


Insert into Customer(FirstName,LastName,Adress,Email,CustomerPassword)
Values ('Karlo','Hren','Hum Stubicki 1 Gornja Stubica 49245','karlo@email.hr','123')
Insert into Customer(FirstName,LastName,Adress,Email,CustomerPassword)
Values ('Lovro','Hren','Hum Stubicki 2 Gornja Stubica 49245','lovro@email.hr','123')
Insert into Customer(FirstName,LastName,Adress,Email,CustomerPassword)
Values ('Filip','Hren','Hum Stubicki 3 Gornja Stubica 49245','filip@email.hr','123')
Insert into Customer(FirstName,LastName,Adress,Email,CustomerPassword)
Values ('Soni','Hren','Hum Stubicki 4 Gornja Stubica 49245','soni@email.hr','123')


Insert into Category(Title)
Values('Coupe')
Insert into Category(Title)
Values('Sedan')
Insert into Category(Title)
Values('HatchBack')
Insert into Category(Title)
Values('SUV')
Insert into Category(Title)
Values('Pickup')
Insert into Category(Title)
Values('Cabriolet')

select*from Category

Insert into Product(Title,Brand,About,Price,CatgoryID)
Values('420xD','BMW','Prodaje se bmw serije 4 2015',30000,1)
Insert into Product(Title,Brand,About,Price,CatgoryID)
Values('A1','Audi','Prodaje se Audi a1 2014',10000,3)
Insert into Product(Title,Brand,About,Price,CatgoryID)
Values('C 250','Mercedes','Prodaje se Mercedes C klasa 2018',40000,2)
Insert into Product(Title,Brand,About,Price,CatgoryID)
Values('Toureg','VW','Prodaje se VW Toureg 2019',80000,4)
Insert into Product(Title,Brand,About,Price,CatgoryID)
Values('Raptor','Ford','Prodaje se Ford Raptor 2015',90000,5)
Insert into Product(Title,Brand,About,Price,CatgoryID)
Values('911','Porsche','Prodaje se Porsche 911 2020',120000,6)

--UPDATE za slike

Update Product
set Img='img/Bmw-420xd.jpg'
where IDProduct=1
Update Product
set Img='img/Audi-a1.jpg'
where IDProduct=2
Update Product
set Img='img/Mercedes-c250.jpeg'
where IDProduct=3
Update Product
set Img='img/VW-touareg.jpg'
where IDProduct=4
Update Product
set Img='img/Ford-raptor.jpg'
where IDProduct=5
Update Product
set Img='img/Porsche-911.jpg'
where IDProduct=6

select*from Product

Insert into PaymentMethod(PaymentMethodName)
Values('PayPal')
Insert into PaymentMethod(PaymentMethodName)
Values('Gotovina - Pouzece')
Insert into PaymentMethod(PaymentMethodName)
Values('BitCoin')

select*from PaymentMethod

Insert into Bill(BillDate,CustomerID,PaymentMethodID)
Values('2020-01-10',1,1)
Insert into Bill(BillDate,CustomerID,PaymentMethodID)
Values('2020-01-11',2,2)
Insert into Bill(BillDate,CustomerID,PaymentMethodID)
Values('2020-01-12',3,3)
Insert into Bill(BillDate,CustomerID,PaymentMethodID)
Values('2020-01-13',4,1)
Insert into Bill(BillDate,CustomerID,PaymentMethodID)
Values('2020-01-14',1,1)
Insert into Bill(BillDate,CustomerID,PaymentMethodID)
Values('2020-01-15',3,2)

select*from Bill
select*from Product

Insert into Item(ProductID,BillID,Quantity)
Values(1,1,1)
Insert into Item(ProductID,BillID,Quantity)
Values(2,2,1)
Insert into Item(ProductID,BillID,Quantity)
Values(3,3,2)
Insert into Item(ProductID,BillID,Quantity)
Values(1,4,3)
Insert into Item(ProductID,BillID,Quantity)
Values(4,5,1)
Insert into Item(ProductID,BillID,Quantity)
Values(5,6,1)

select*from Item
