
# Java Fundamentals Practice Project

This project contains a set of simple Java programs used to practice core programming concepts. It includes examples of **printing output**, **working with variables and data types**, **taking user input**, **using conditional logic**, **performing basic arithmetic**, and a fun **story game** using string input.

---

## Concepts Covered

### 1. **Console Output**
Using `System.out.println()` and `System.out.print()` to display messages in the console.

```java
System.out.println("I like pizza!");  // Prints with newline
System.out.print("Buy me pizza");     // Prints without newline
````

---

### 2. **Variables and Primitive Data Types**

Understanding how to declare and use different types of variables:

* `int` – Whole numbers
* `double` – Decimal numbers
* `char` – Single characters
* `boolean` – True or false values
* `String` – A sequence of characters (text)

```java
int age = 30;
double price = 19.99;
char grade = 'A';
boolean isStudent = true;
String name = "Gidayi";
```

---

### 3. **Conditional Statements**

Making decisions using `if` and `else` based on boolean values.

```java
if (isStudent) {
    System.out.println("You are a student");
} else {
    System.out.println("You are not a student");
}
```

---

### 4. **Taking User Input**

Using `Scanner` to capture user input for various data types:

```java
Scanner scanner = new Scanner(System.in);

String name = scanner.nextLine();     // Text input
int age = scanner.nextInt();          // Integer input
double gpa = scanner.nextDouble();    // Decimal input
boolean isStudent = scanner.nextBoolean(); // Boolean input
```

> 📝 Remember: Use `scanner.nextLine()` after `nextInt()` or `nextDouble()` to consume the leftover newline character.

---

### 5. **String Concatenation**

Combining text and variables into readable messages.

```java
System.out.println("Hello " + name);
System.out.println("You are " + age + " years old");
```

---

### 6. **Basic Arithmetic**

Performing simple calculations such as computing area.

```java
int area = width * length;
System.out.println("The area is: " + area);
```

---

### 7. **Mini Story Game (Mad Libs Style)**

A fun interactive program that creates a short story based on user input.

```java
System.out.println("Today I went to a " + adjective1 + " zoo.");
System.out.println("In an exhibit, I saw a " + noun1 + ".");
System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
System.out.println("I was " + adjective3 + "!");
```

---
