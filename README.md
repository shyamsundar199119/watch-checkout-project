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

## Domain Model

### Product
Represents a purchasable item with:
- Product ID
- Product name
- Unit price
- Pricing rule

### Pricing Rules
Two pricing rules are supported:
- `UnitPriceRule` – standard per-unit pricing
- `BundleDiscountRule` – bundle-based discounts (e.g. 3 for 200)

---

## 🚀 API Endpoint

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
