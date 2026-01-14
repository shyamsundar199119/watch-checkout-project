# Product Checkout API

A simplified checkout REST API built using **Spring Boot (Java 11)**.  
The API calculates the total price for a shopping cart containing products, applying unit pricing and bundle discount rules.

---

## Problem Overview

The application exposes a REST endpoint that:
- Accepts a list of products with quantities
- Applies pricing rules (unit price or bundle discount)
- Returns a detailed price breakdown and final total

The solution is designed to be:
- Extensible
- Testable
- Aligned with Spring best practices

---

## Architecture Overview

The application follows a layered architecture:

controller → service → domain → pricing

---

## API Endpoint

### Checkout

**POST** `/api/checkout`

Calculates the total price for the provided cart.

#### Request Body

{
  "products": [
    {
      "productId": "001",
      "quantity": 3
    }
  ]
}

#### Response

{
  "items": [
    {
      "productId": "001",
      "productName": "Rolex",
      "quantity": 3,
      "finalPrice": 200.00
    }
  ],
  "totalAmount": 200.00
}

## Setup & Running the Application

### Prerequisites

Make sure you have installed:
- Java 11 (JDK 11)
- Maven 3.6+


### Clone the Repository

- git clone <your-repo-url>
- cd watch-checkout-project

### Build the Project

- Clean and build the project using Maven:
- mvn clean install

This will download all dependencies
Compile the code
Run unit tests


### Run the Application

Start the Spring Boot application:

mvn spring-boot:run

The application will start on port 8080 by default

Look for this log line:

Started CheckoutApplication in X seconds

### Test the Checkout API

Curl to test the /api/checkout endpoint.

## Future Enhancements

Given more time, the following improvements could be implemented to make the project more production-ready:

### Swagger Documentation Enhancements

- Currently, Swagger is not included in this version.

- In the future, we plan to add:
  - Interactive API documentation for all endpoints 
  - Example request/response payloads 
  - Validation messages and error schemas

### Method-Level JavaDoc Comments

- Adding comments for service and controller methods

- This will improve readability and maintainability for team members

### Other Potential Improvements

- Externalized product catalog (database)

- Include discounted amount in response

