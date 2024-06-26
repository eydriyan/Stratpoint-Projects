
<details>
<summary>Mini project 1</summary>

# Simple Console-Based Calculator

This Java program implements a basic console-based calculator with operations for addition, subtraction, multiplication, and division. It uses a `Calculator` class to encapsulate the mathematical operations and a `Main` class for user interaction via console input.

## Features

- **Addition:** Adds two numbers.
- **Subtraction:** Subtracts one number from another.
- **Multiplication:** Multiplies two numbers.
- **Division:** Divides one number by another. Throws an `ArithmeticException` if the divisor is zero.

## Running the Application

1. Clone the repository:
2. Navigate to the project directory
3. Compile the Java files
4. Run the application
5. Follow the on-screen prompts:

Select an operation (Add, Subtract, Multiply, Divide).

Enter the first number.

Enter the second number.

View the result of the operation.

6. Exit the program:

Select 0 to exit the calculator.

</details>

<details>
<summary>Mini project 2</summary>
  
## Library Management System

A simple console-based Library Management System in Java that allows users to add, remove, search, and view books. The system supports both physical books and e-books, demonstrating basic Object-Oriented Programming (OOP) principles like encapsulation, inheritance, and polymorphism.

## Features

- Add books (both physical and e-books)
- Remove books
- Search books by title
- View all books

## Classes and Methods

### `Book` Class
The base class representing a book with the following attributes and methods:
- `title`: Title of the book
- `author`: Author of the book
- `ISBN`: ISBN of the book
- Constructor to initialize the attributes
- Getter and setter methods for each attribute
- `displayInformation()` method to display book details

### `PhysicalBook` Class
A subclass of `Book` representing a physical book with an additional attribute:
- `noOfPages`: Number of pages in the book
- Constructor to initialize the attributes, including those of the base class
- Getter and setter methods for the `noOfPages` attribute
- Overridden `displayInformation()` method to display book details, including the number of pages

### `EBook` Class
A subclass of `Book` representing an e-book with an additional attribute:
- `fileSize`: File size of the e-book in MB
- Constructor to initialize the attributes, including those of the base class
- Getter and setter methods for the `fileSize` attribute
- Overridden `displayInformation()` method to display book details, including the file size

### `Library` Class
Manages a collection of `Book` objects with the following methods:
- `addBook(Book book)`: Adds a book to the library if it does not already exist
- `removeBook(String ISBN)`: Removes a book from the library by its ISBN
- `searchBook(String bookTitle)`: Search a book from the library by its title
- `showAllBooks()`: List all books available in the library

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- A Java IDE or text editor (e.g., IntelliJ IDEA, Eclipse, VS Code)

### Running the Application

1. Clone the repository:
2. Navigate to the project directory
3. Compile the Java files
4. Run the application

When you run the application, you will see a menu with the following options:

[0] Exit

[1] Add Physical Book

[2] Add E-Book

[3] Remove Book

[4] Search Book by Title

[5] List All Books

Follow the prompts to interact with the system. Enter the corresponding number to select an option, and provide the required information when prompted.

</details>
