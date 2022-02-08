Due on: February 15th, 2022


(The Person, Student, Employee, Faculty, and Staff classes) Design a class named Person and its two subclasses named Student and Employee. Make Faculty and Staff subclasses of Employee. A person has a name, address, phone number, and e-mail address. A student has a class status freshman, sophomore, junior, or senior). Define the status as a constant. An employee has an office, salary, and date hired (String). A faculty member has office hours and a rank. A staff member has a title. Override the tostring method in each class to display the class name and the person's name. Draw the UML diagram for the classes and implement them. Write a driverclass called UniversityDriver.java that creates a Person, Student, Employee, Faculty, and Staff, and invokes their toString () methods.

--- 

(The Account class) Design a class named Account that contains
- A private int data field named id for the account (default 0).
- A private double data field named balance for the account (default O)
- A private double data field named annualInterestRate that stores current interest rate (default 0).
- A no-arg constructor that creates a default account.
- A constructor that creates an account with the specified id and initial balance.
- Accessor (getter) and mutator(setter) methods for id, balance, and annualInterestRate
- A method named getronthlyInterestRate(), that returns the monthly interest rate. (Hint: The method getMonthlyInterest () is to return monthly interest, not the interest rate. Monthly interest is annualInterestRate/12.
- A method named deposit that deposits a specified amount to the account.
- A method named withdraw that withdraws a specified amount to the account if available else prints 'balance not sufficient'.

Create two subclasses for checking and saving accounts. A checking account has an overdraft limit, but a savings account cannot be overdrawn. Draw the UML diagram for the class then implement the class.