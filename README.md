# SPRINT 1
## TASK 2: Exceptions

### LEVEL 1 - EXERCISE 1
Create a class called "Product" with the attributes name and price, and another class called "Sale".
This class has as attributes a collection of products and the total price of the sale.

The "Sale" class has a method called calculateTotal() that throws the custom exception
"EmptySaleException" and displays on the screen "To make a sale you must first add products" if the product collection is empty.
If the collection has products, then it must traverse the collection and save the sum of all the prices of the products in the attribute total price of the sale.

The custom exception "EmptySaleException" must be a child of the Exception class.
In its constructor we must pass the message "To make a sale you must first add products"
and when we capture the exception, we must display it on the screen with the exception's getMessage() method.

Write the code necessary to generate and catch an exception of type "IndexOutOfBoundsException".

### LEVEL 2 - EXERCISE 1
To implement

### TECHNOLOGIES
| Package | Version    | Description                |
|---------|------------|----------------------------|
| `java`  | ^1.8.0_441 | Principal project language |

### REQUIREMENTS
Local environment: `IntelliJ or Eclipse`

### EXECUTION
To Run code, press `Ctrl F5` or click the `play` icon in the gutter.