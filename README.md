# JavaProgrammer1
Practice assisgnments to prepare for oracle exam.
Some examples are purposly confusing or badly layout as it is similar on the exam.

# [Topic 2](https://github.com/comanoc/JavaProgrammer1/tree/master/Topic2)
## [Assignment 1.2](https://github.com/comanoc/JavaProgrammer1/tree/master/Topic2/Assignment1.2)
### [Part A](https://github.com/comanoc/JavaProgrammer1/blob/master/Topic2/Assignment1.2/PartA.java)
  Create a Java program, which is passed two arguments at the command prompt.
  The arguments should represent the names of your favourite fruits and be stored in
  the args array.
  Using the arguments stored in the args array, display a message in the console.

## [Assignment 1.3](https://github.com/comanoc/JavaProgrammer1/tree/master/Topic2/Assignment1.3)
  An important skill for a Java programmer, is the ability to read and understand the
  Java API.
  
### [Part A](https://github.com/comanoc/JavaProgrammer1/blob/master/Topic2/Assignment1.3/PartA.java)
  Briefly review the Arrays class in the java.util package (note, the Arrays class is not
  examinable on the Java Associate 8 exam).
* Create an array to store the following integers: 7,6,5,4,3,2,1.
* Sort the contents of the array in ascending numerical order.
* Output the contents of the array using an enhanced for loop.
    
### [Part B](https://github.com/comanoc/JavaProgrammer1/blob/master/Topic2/Assignment1.3/PartB.java)
  Briefly review the Collections class in the java.util package (note, the Collections
  class is not examinable on the Java Associate 8 exam).
  Create an ArrayList named members, to store the following strings:
* "John"
* "Paul",
* "George"
* "Ringo"

Sort the collection in ascending order and display the contents in the console.
  
### [Part C](https://github.com/comanoc/JavaProgrammer1/blob/master/Topic2/Assignment1.3/PartC.java)

  To answer this question, you will need to briefly review the String class (java.lang)
  and the Console class in the java.io package (note, the Console class is not
  examinable on the Java Associate 8 exam).
  The Console class allows for a password or passphrase to be read from the console
  with echoing disabled.
  Create a program (utilising the Console class), which prompts the user to enter a
  ghosted password at the command prompt.
  
## [Assignment 1.4](https://github.com/comanoc/JavaProgrammer1/tree/master/Topic2/Assignment1.4)

  In this program, you are asked to create a simple desktop calculator. The program
  should be compiled and run from the command prompt (cmd).
* Create a class named Calculator, to be stored in a package named,
com.javadevelopers.code.
* The class should have the following instance variables.
  * private float no1;
  * private float no2;
  * private String operator;
* Accessor (‘setter and getter’) methods should be created to allow the instance
variables to be set and retrieved.
* Create a method named, performCalculation(), which performs the
appropriate calculation (addition, subtraction, multiplication, division and
modulus) and returns the result.
* Create a class named, Assignment1_4.java, which contains the main
method.
* Use a Scanner object to prompt the user to enter two operands and an
operator.
* The user must not be allowed to enter invalid data. For example, the
operands must be numeric and the operator must be one of the following (+,-
,*,/,%). For each data input, the program should not proceed, until the user
has entered valid data.
* Finally, class Assignment1_4 should use the Calculator class, to perform the
calculation, and display the result.
The password is enigma and the user should be given three opportunities to enter it

## [Assignment 1.5](https://github.com/comanoc/JavaProgrammer1/tree/master/Topic2/Assignment1.5)
Create a class named, ClassA. The class should be stored in a package, named
packageA. The class should be able to track and return, the number of objects
instantiated of its type (how many ClassA objects have been created).
Create another class named, ClassB. The class should be stored in a package,
named packageB. The class should be able to track and return, the number of
objects instantiated of its type (how many ClassB objects have been created).
Finally, create a class named, Assignment1_5. This class should contain the main
method. In main:
* Create two ClassA objects and one ClassB object.
* Display the number of ClassA and ClassB objects created, in the console.
Compile and run the program from the command prompt (cmd)

## [Assignment 1.6](https://github.com/comanoc/JavaProgrammer1/tree/master/Topic2/Assignment1.6)
Create an exercise folder named, Assignment 1.6.
* Create a class file named, HelloWorld.java.
* Create a no-argument constructor for the class. In the constructor, output the message, Hello World!
* Don’t compile the .java file yet.

Create a separate folder out on your desktop named, someOtherLocation.
* Create a class file named, HelloUniverse.java.
* Create a no-argument constructor for the class. In the constructor, output the message, Hello Universe!
* Don’t compile the .java file yet.

Back in your exercise folder named, Assignment 1.6.
* Create a class file named, Assignment1_6.java, to contain the main method.
* Create an object from the HelloUniverse class.
* Create an object from the HelloWorld class.
* Compile all the .java files with one command line instruction (at cmd prompt).
* Run the program at the command prompt (at cmd prompt).

## [Assignment 1.7](https://github.com/comanoc/JavaProgrammer1/tree/master/Topic2/Assignment1.7)
Create a class named Balloon. It should contain the following:
* An instance variable named, pressure (of type float). Assign it a value of
100.56. Use public as the access modifier.
* An instance initializer block, in which the value of the instance variable is
assigned a value of 200.56.
* A no-argument constructor, in which the value of the instance variable is
assigned a value of 300.56.
Create a separate class named, Assignment1_7. This class should contain the main
method. Instantiate a Balloon object, and use the object reference created to access the
instance variable, pressure. What value to you expect to see displayed in the console?
* 100.56
* 200.56
* 300.56 = answer

## [Assignment 1.8](https://github.com/comanoc/JavaProgrammer1/tree/master/Topic2/Assignment1.8)
Carefully review the following programs. In each program, ask yourself 
1. How many objects have been created in heap memory? 
2. How many objects are eligible for garbage collection on Line 7 and Line 8 respectively?

### [Part A](https://github.com/comanoc/JavaProgrammer1/tree/master/Topic2/Assignment1.8/PartA.java)
### [Part B](https://github.com/comanoc/JavaProgrammer1/tree/master/Topic2/Assignment1.8/PartB.java)

## [Assignment 1.9](https://github.com/comanoc/JavaProgrammer1/tree/master/Topic2/Assignment1.9)

### [Part A](https://github.com/comanoc/JavaProgrammer1/tree/master/Topic2/Assignment1.9/PartA.java)
Write a program, which displays the maximum number that a variable of type int can
hold. The variable should be declared in the main method. Research the Integer
‘wrapper’ class in the Java API

### [Part B](https://github.com/comanoc/JavaProgrammer1/tree/master/Topic2/Assignment1.9/PartB.java)
Write a program, which declares a variable of type long, to store the value,
2,147,483,648. The variable should be declared in the main method.


### [Part C](https://github.com/comanoc/JavaProgrammer1/tree/master/Topic2/Assignment1.9/PartC.java)
Write a program, which declares a variable (of type int), named width. The variable
should be declared in the main method.
* The variable should be assigned the decimal literal value 3. Print the value stored in the variable to the console.
* Re-assign the variable with the binary literal value 3. Print the value stored in the variable to the console.
* Re-assign the variable with the octal literal value 3. Print the value stored in the variable to the console.
* Re-assign the variable with the hexadecimal literal value of 3. Print the value stored in the console.


### [Part D](https://github.com/comanoc/JavaProgrammer1/tree/master/Topic2/Assignment1.9/PartD.java)

Write a program, which declares a variable (of type float) and assign it the value,
3450000.34. Use the underscore, ‘_’, to make the literal value easier to read in the
program.

### [Part E](https://github.com/comanoc/JavaProgrammer1/tree/master/Topic2/Assignment1.9/PartE.java)

Create a simple class to model a Peach. The class should have one instance
variable, price, of type float. Create a class named, Assignment1_9E.java, which
includes the main method. In the main method, instantiate three Peach objects as
follows:
* Peach p1 = new Peach(3.40f);
* Peach p2 = new Peach(5.60f);
* Peach p3 = new Peach(3.00f);
In main, determine the number of Peach objects created and the average price of a
Peach. Include class variables and class methods in class Peach to help solve the
problem.


### [Part F](https://github.com/comanoc/JavaProgrammer1/tree/master/Topic2/Assignment1.9/PartF.java)
Carefully review the following program. 
* Does it compile? answer = Yes
* If so, does it produce any output? answer = true 

## [Assignment 1.10](https://github.com/comanoc/JavaProgrammer1/tree/master/Topic2/Assignment1.10)
In this program, you are asked to simulate the workings of an ATM machine.
Scenario
The Bank of Duke has asked you to create an ATM application to run in a terminal.
The bank currently only has three customers

