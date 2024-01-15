create table Book(
    bookID int IDENTITY(1,1) Primary key,
	book_name varchar(50),
	authory varchar(50),
	prices varchar(50)
)

insert into Book (book_name,authory,prices) values
    ('Osaka', 'Robin July', '100'),
	('Products', 'Dried' , '200'),
	('Vegetables','Salach lemon', '150'),
	('Beverages','Soft drink', '100')

create table MyBook(
    bookID int Primary key,
	book_name varchar(50),
	authory varchar(50),
	prices varchar(50)
)