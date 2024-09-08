# java-learning-hou

## Overview

This project showcases a variety of Java programming exercises and examples, covering design patterns, exception handling, data structures, date and time manipulations, and more. It aims to provide a comprehensive set of examples to help developers understand and implement these concepts in their own projects.

## Table of Contents

1. [Project Structure](#project-structure)
2. [Implemented Features](#implemented-features)
3. [Setup Instructions](#setup-instructions)
4. [Usage](#usage)

## Project Structure

The project is organized into various packages, each focusing on different aspects of Java programming:

- **designpatterns.memento**: Demonstrates the Memento design pattern.
- **exceptions**: Contains several exercises exploring Java exception handling mechanisms.
- **exercise1, exercise2, ...**: Different exercises focusing on tasks like file handling, date and time manipulation, list operations, and more.
- **inheritance**: Examples of Java inheritance and polymorphism.
- **modarraylist**: Custom data structure modifications.

## Implemented Features

### Memento Design Pattern

- **Commit c51794f**: Enhanced `Main.java` in the Memento design pattern example by adding a new state "C" and additional undo operations with print statements.
- **Commit 5bb20f8c**: Initial implementation of the Memento design pattern with classes `Item`, `ItemHistory`, and `ItemState`.

### Exception Handling

- **Commit 7cf7609**: Main class to check for vowels in strings.
- **Commit d659e12**: Main class to check for duplicates in a list.
- **Commit 87baae1**: Examples for file handling and exception handling.
- **Commit a37bf12**: Implements file reading with exception handling.
- **Commit d3841e9**: Main class for checking number parity and handling exceptions.
- **Commit 2b41505**: Renamed directory and added custom exception example.

### Date and Time Manipulation

- **Commit 69f87b9**: Main class to check for Friday the 13th.
- **Commit ef941cc**: Main class to list Mondays of a given month.
- **Commit 8302508**: Exercises focused on date and time, like calculating the length of each month in a year.

### Data Structures & Algorithms

- **Commit 34df9ee**: Polymorphism for contact creation and management.
- **Commit 96cca09**: ModArrayList class for modular index handling.
- **Commit 895f99c**: Simplified BankAccount class.
- **Commit b7b5f08**: Implemented BankAccount with encapsulation.

### Other Implementations

- **Commit 32bde78**: Employee class with raise functionality.
- **Commit f75f066**: Basic project setup with Maven and Docker Compose.

## Setup Instructions

1. **Clone the repository:**

    ```bash
    git clone https://github.com/yourusername/projectname.git
    cd projectname
    ```

2. **Build the project:**

    ```bash
    mvn clean install
    ```

3. **Run the application:**

    ```bash
    java -jar target/yourapp.jar
    ```

4. **Using Docker Compose:**

    ```bash
    docker-compose up --build
    ```

## Usage

Refer to the main classes in each package to run specific examples. For example:

To compile and run the `Main.java` for exercise 3:

```bash
cd src/main/java/site/nosaj/exceptions/exercise3
javac Main.java
java Main
```
