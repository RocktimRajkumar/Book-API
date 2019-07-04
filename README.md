# BOOK API - Spring MVC, MySQL, Hibernate Rest API Tutorial

Build Restful CRUD API for a simple Book-Manage application using Spring MVC, Mysql and Hibernate.

## Requirements

    Java - 1.8.x

    Maven - 3.6.0

    MySQL - 8.0.2

## Steps to Setup

### 1. Clone the application

git clone https://github.com/scbushan05/book-api.git

### 2. Create Mysql database

create database bookapi

### 3. Change mysql username and password as per your installation

    open src/main/resources/db.properties

    change mysql.user and mysql.password as per your mysql installation

### 4. Build and run the app using maven

mvn package

A new WAR file will be generated at project/target/BookAPI.war, just copy and deploy to your Tomcat.

The app will start running at http://localhost:8080/bookapi/.

## Explore Rest APIs

The app defines following CRUD APIs.

GET /api/book

POST /api/book

GET /api/book/{bookId}

PUT /api/book/{bookId}

DELETE /api/book/{bookId}

You can test them using postman or any other rest client.
