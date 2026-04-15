# Entity-Management-Composition-System
A professional Java implementation demonstrating Domain-Driven Design and Object Composition. This system goes beyond basic data types to model complex human entities (Students, Employees, Faculty) using modular, reusable components.
🏗 System Architecture
The project is designed with a focus on low coupling and high cohesion, utilizing composition to build complex objects from simpler ones.

Component Breakdown
Core Entities: * Name: Handles first names, initials, and surnames.

Address: Manages multi-line physical locations.

Parent Entity: * Person: The primary container utilizing Composition to hold Name and Address objects.

Inheritance Tree:

Employee (extends Person): Adds corporate attributes like office location.

Faculty (extends Employee): Adds academic-specific attributes like rank.

🚀 Key Programming Concepts
1. Composition over Primitives
Instead of using a simple String for an address, this system uses an Address object. This allows for dedicated validation logic and formatting (via toString overrides) within the address component itself.

2. Deep Inheritance
The project demonstrates a three-level inheritance hierarchy:
Person ➔ Employee ➔ Faculty
Each level correctly utilizes super() calls to maintain data integrity across the hierarchy.

3. Smart Data Parsing
The Name and Address classes feature specialized constructors that utilize the .split(",") method to instantly transform raw CSV-style data into structured object properties.

🛠 Tech Stack
Language: Java (Core)

Principles: Object-Oriented Programming, Encapsulation, Composition, Inheritance.

📝 Author
Talani Mlangeni - North-West University
