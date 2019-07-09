# BOOK API - Spring MVC, MySQL, Hibernate Rest API Tutorial

Build Restful CRUD API for a simple Book-Manage application using Spring MVC, Mysql and Hibernate.

## Requirements

    Java - 1.8.x

    Maven - 3.6.0

    MySQL - 8.0.2

## Steps to Setup

### 1. Clone the application

git clone https://github.com/RocktimRajkumar/Book-API.git

### 2. Create Mysql database

create database bookapi

### 3. Change mysql username and password as per your installation

    open src/main/resources/db.properties

    change mysql.user and mysql.password as per your mysql installation

### 4. Build and run the app using maven

mvn package

A new WAR file will be generated at project/target/BookAPI.war, just copy and deploy to your Tomcat.

The app will start running at http://localhost:8080/BookAPI/api/book/.

## Explore Rest APIs

The app defines following CRUD APIs.

|HTTP Method  | CRUD Operation  | Description |
|--|--|--|
| POST | Create  | Create a new Book <br> https://localhost:8080/BookAPI/api/book|
| GET  | Read 	 |Retrieve a Single Book/All Books <br> https://localhost:8080/BookAPI/api/book <br> https://localhost:8080/BookAPI/api/book/{id}|
| PUT  | Update  |Update or modify a Book <br> https://localhost:8080/BookAPI/api/book/{id}|
| DELETE| Delete |Delete a Book :- https://localhost:8080/BookAPI/api/book/{id}|

You can test them using postman or any other rest client.
