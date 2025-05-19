# SPRINT 1
## TASK 2: Exceptions

### LEVEL 1 - EXERCISE 1
Create a class called "Product" with the attributes name and price, 
and another class called "Sale".
This class has as attributes a collection of products and the total price of the sale.

The "Sale" class has a method called calculateTotal() that throws the custom exception
"EmptySaleException" and displays on the screen "To make a sale you must first add products"
if the product collection is empty.
If the collection has products, then it must traverse the collection and save 
the sum of all the prices of the products in the attribute total price of the sale.

The custom exception "EmptySaleException" must be a child of the Exception class.
In its constructor we must pass the message "To make a sale you must first add products"
and when we capture the exception, we must display it on the screen with 
the exception's getMessage() method.

Write the code necessary to generate and catch an exception of type "IndexOutOfBoundsException".

### LEVEL 2 - EXERCISE 1
Create a class called "Input". This class should be used to control the different 
exceptions that can appear in Java when entering data by keyboard using the Scanner class.

The first thing to do is instantiate an object of the Scanner class and from there, 
create static methods to read the different types of data from the keyboard.
All methods receive a String with the message that you want to show to the user, 
for example: "Enter your age", and return the appropriate data entered by the user in each method, 
for example: a byte with the user's age.

Methods to implement by catching the exception of the "InputMismatchException" class:

- public static byte readByte(String message);
- public static int readInt(String message);
- public static float readFloat(String message);
- public static double readDouble(String message);

Methods to implement by catching a custom exception from the Exception class:

- public static char readChar(String message);
- public static String readString(String message);
- public static boolean readSiNo(String message), if the user enters “s”,
returns “true”, if the user enters “n”, returns “false”.

### TECHNOLOGIES
| Package     | Version    | Description                |
|-------------|------------|----------------------------|
| `java`      | ^1.8.0_441 | Principal project language |
| `java.util` | ^1.8.0_441 | Java standard library   |
| `java.lang` | ^1.8.0_441 | Java standard library   |

### REQUIREMENTS
Local environment: `IntelliJ or Eclipse`

### EXECUTION
To Run code, press `Ctrl F5` or click the `play` icon in the gutter.

## HOW TO COMPILE & RUN

```bash
javac Main.java Sale.java Product.java EmptySaleException.java
java Main