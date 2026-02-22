# Librari-Api

A comprehensive RESTful API for library management system built with Java and Spring Boot. This application provides endpoints for managing books, users, and library operations efficiently.

## 📋 Table of Contents

- [Description](#description)
- [Requirements](#requirements)
- [Installation](#installation)
- [Project Structure](#project-structure)
- [Running the Application](#running-the-application)
- [Testing](#testing)
- [API Endpoints](#api-endpoints)
- [Technologies](#technologies)
- [License](#license)

## Description

**Librari-Api** is a RESTful API designed for managing library operations. It provides functionality for:
- Managing library books and their inventory
- User registration and authentication
- Book lending and return operations
- Library member management
- Book search and filtering

The API is built with modern Java technologies and follows best practices for REST API development.

## Requirements

- **Java**: JDK 11 or higher
- **Maven**: 3.6.0 or higher
- **Spring Boot**: 2.x or 3.x (depending on your configuration)
- **Database**: Any relational database (PostgreSQL, MySQL, H2, etc.)

## Installation

### 1. Clone the Repository

```bash
git clone https://github.com/AllaBeloshapka/Librari-Api.git
cd Librari-Api
```

### 2. Configure Database

Edit the `application.properties` or `application.yml` file in `src/main/resources/` with your database credentials:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/librari_db
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```

### 3. Install Dependencies

```bash
./mvnw clean install
```

Or on Windows:
```cmd
mvnw.cmd clean install
```

## Project Structure

```
Librari-Api/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/librari/
│   │   │       ├── controller/     # REST controllers
│   │   │       ├── service/        # Business logic
│   │   │       ├── repository/     # Data access layer
│   │   │       ├── model/          # Entity classes
│   │   │       └── LibrariApiApplication.java
│   │   └── resources/
│   │       ├── application.properties
│   │       └── application.yml
│   └── test/
│       └── java/                   # Unit and integration tests
├── .mvn/                           # Maven wrapper
├── pom.xml                         # Maven configuration
└── README.md                       # This file
```

## Running the Application

### Using Maven

```bash
./mvnw spring-boot:run
```

Or on Windows:
```cmd
mvnw.cmd spring-boot:run
```

The application will start on `http://localhost:8080` by default.

### Using Java Command

```bash
java -jar target/librari-api-1.0.0.jar
```

## Testing

### Run All Tests

```bash
./mvnw test
```

Or on Windows:
```cmd
mvnw.cmd test
```

### Run Specific Test Class

```bash
./mvnw test -Dtest=YourTestClassName
```

### Run Tests with Coverage

```bash
./mvnw test jacoco:report
```

## API Endpoints

### Books Management

- **GET** `/api/books` - Get all books
- **GET** `/api/books/{id}` - Get book by ID
- **POST** `/api/books` - Create new book
- **PUT** `/api/books/{id}` - Update book
- **DELETE** `/api/books/{id}` - Delete book
- **GET** `/api/books/search?title=...` - Search books by title

### Users Management

- **GET** `/api/users` - Get all users
- **GET** `/api/users/{id}` - Get user by ID
- **POST** `/api/users` - Register new user
- **PUT** `/api/users/{id}` - Update user information
- **DELETE** `/api/users/{id}` - Delete user

### Lending Operations

- **POST** `/api/lending/borrow` - Borrow a book
- **POST** `/api/lending/return` - Return a book
- **GET** `/api/lending/history/{userId}` - Get user's lending history

## Technologies

- **Language**: Java
- **Framework**: Spring Boot
- **Build Tool**: Maven
- **Database**: JPA/Hibernate ORM
- **API Documentation**: Swagger/OpenAPI (if configured)
- **Testing**: JUnit 5, Mockito
- **Version Control**: Git

## License

This project is licensed under the MIT License - see the LICENSE file for details.

## Contact

For questions or support, please contact the project author at [AllaBeloshapka](https://github.com/AllaBeloshapka)

---

**Happy coding!** 📚✨