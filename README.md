# Technical Evaluation Kantox


This is a Java application that simulates a simple cashier function for a small chain of supermarkets. 
The system allows you to add products to a cart and displays the total price based on various pricing rules.

## Short description of the design

The Supermarket Checkout System is designed to focus on flexibility and extensibility to accommodate various pricing rules for different products. 

**Design Pattern Used**:

Strategy Pattern:
The Strategy Pattern defines a family of pricing strategies and allows each product to have its own pricing strategy.

**Design Overview**:

-Product: 
Represents a supermarket product with a name, price and code. 
It embeds a pricing strategy using the Strategy Pattern.

-PricingStrategy: 
An interface representing the pricing strategy for a product.

-CheckoutSystem: 
The main class represents the supermarket checkout system. It contains a map of products and their pricing strategies. It also includes methods to scan products, apply pricing strategies, and calculate the total price.


## Requirements
Java (JDK 8 or higher)

## Usage

To use the application:

1. Initialize the CheckoutSystem class with the products and their pricing strategies.
2. Scan products and quantities using the scan method.
3. Retrieve the total price of the cart using the getTotalPrice method.

The class Main shows an example on how to use it

## Tests

The project includes test cases implemented using JUnit to validate the correctness of the application

