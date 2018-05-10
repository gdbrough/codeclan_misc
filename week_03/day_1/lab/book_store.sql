DROP TABLE books;
DROP TABLE authors;

CREATE TABLE authors (
  auth_id SERIAL PRIMARY KEY,
  name varchar(225),
  age int
);

INSERT INTO authors (name, age) VALUES ('Stephen King', 60);
INSERT INTO authors (name, age) VALUES ('J K Rowling', 55);

SELECT * FROM authors;

CREATE TABLE books (
  book_id SERIAL PRIMARY KEY,
  title varchar(255),
  price int,
  author int REFERENCES authors(auth_id)
);

INSERT INTO books (title, price, author) VALUES ('IT', 12, 1);
INSERT INTO books (title, price, author) VALUES ('Christine', 15, 1);
INSERT INTO books (title, price, author) VALUES ('Harry Potter and the Chamber of Secrets', 10, 2);
INSERT INTO books (title, price, author) VALUES ('Harry Potter and the Goblet of Fire', 9, 2);

SELECT * FROM books;
