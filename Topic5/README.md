### Assignment 5.1

Create a Java program, which converts miles to kilometres.

### Assignment 5.2
Given the following two classes (stored in separate source code files), what do
you expect the program output to be (if any?).

```Java
package com.javadevelopers.ireland;
public class PacmanMania{
  final protected int maxNoOfAliensOnScreen = 9;
}
```

```Java
package com.javadevelopers.japan;
import com.javadevelopers.ireland.PacmanMania;
public class MsPacmanMania extends PacmanMania {
public static void main(String[] args){
 PacmanMania gameObj = new MsPacmanMania();
 System.out.println("aliens on screen " + gameObj.maxNoOfAliensOnScreen);
}
}
```

### Assignment 5.3
Create a class named Assignment5_3.java.
Write a method named findMax(), which has a return type of void.
It should be possible to call the method (from main) and pass to it an indeterminate
number of integers.

For example:

new Assignment5_3().findMax(25,252,4,16,100);
new Assignment5_3().findMax();
The findMax() method should determine the maximum number passed.

If no numbers are passed to the method, the following message should be displayed.
* You haven't provided any search numbers!
Otherwise, the maximum number should be displayed in the console.

### Assignment 5.4

You have been asked to create an application that stores student grades recorded
on a quiz.
| First Name: | Last Name: | Grade Received:|
| ----------- | ---------- | -------------- |
| James       |   Dean     |   60.50        |
| Annie       |   Francis  |   80.50        |
| Davey       |   Jones    |   40.00        |

* Create a class to model a Student, using the information presented in the
table above.
* Create some Student objects and store them in an ArrayList.
* The program should display the first name, last name and grade recorded by
each student in the table.
* Finally, the total number of students should be displayed, along with the
average student grade (rounded to two decimal places)
* Make use of the static modifier as part of your solution.

### Assignment 5.5

You wish to create a program that stores information about your compact disc???s
(cd???s).
Create a class to model a CD.
The class should have the following fields / instance variables.
* `private String artist;`
* `private String title;`
* `private String label;`
* `private String decadeOfRelease;`

A constructor should be included in the class, which accepts four arguments.
The `testing()` method should be overridden to return the state of the instance
variables.
Create a method named `is80sCD()`, which returns a boolean value. The method
should determine if the album in question was released in the 1980???s.
Create a class named Assignment5_5.java, which contains the main method.
In the main method, create the following CD objects and add them to an ArrayList.

| Artist            | Title                    | Label            | Decade of Release |
| ----------------- | ------------------------ | ---------------- | ----------------- |
| Bon Jovi          | Slippery When Wet        | Mercury Records  | 80s               |
| Alanis Morissette | Jagged Little Pill       | Maverick Records | 90s               |
| Level 42          | The Pursuit of Accidents | Polydor          | 80s               |
| Level 42          | Running in the Family    | Polydor          | 80s               |

Create a method named `print()`, in the Assignment5_5.java class, with two
parameters - an object reference of type, java.util.List and an object reference of
type CheckAttribute. The `print()` method should display details of CD???s.
CheckAttribute is an interface, which you must create, containing the following

`boolean test(CD cd);`

Call the print method from main(), and pass to it a copy of the ArrayList object storing
the collection of CDs and a lambda expression, which will map to the CheckAttribute
interface. The lambda expression should be written so that only details of CDs
released in the 80???s, are displayed in the console.

### Assignment 5.6
You have discovered an old box of cassettes in your cupboard. Some of your
cassettes are read-only, that is, they cannot be re-recorded / taped over.
You decide to create a Java program to store details of your cassettes, using an
ArrayList.
Create a class named Cassette.java.
The class should have the following instance variables.
* private String title;
* private String artist;
* private boolean readOnly;

Create mutator and accessor methods for the instance variables.
Add a `toString()` method to return the state of an object created from the class.
Create a class named Assignment5_6.java, which includes the `main()` method.
In `main()` create an ArrayList object to store objects of type Cassette.
Create the following Cassette objects and add them to the ArrayList.

| Title           | Artist        | Read Only  |
| --------------- | ------------- | ---------- |
| Wired for Sound | Cliff Richard | Yes (true) |
| Results         | Liza Minnelli | Yes (true) |
| Actually        | Pet Shop Boys | No (false) |

In the Assignment5_6 class, create a method named, `displayCatalogue()`, which
has two parameters, an object reference of type `java.util.List` and an object reference
of type `java.util.function.Predicate`.
The method should display details of the albums (title, artist, read only).
Using lambda expressions,
??? From `main()`, call the `displayCatalogue()` method, and pass to it the required
arguments, so that only cassettes with read-only access are displayed.
??? From `main()`, call the `displayCatalogue()` method again, and pass to it the
required arguments, so that this time, only cassettes with read-write
(recordable) access are displayed.

### Assignment 5.7
#### Part A
This question will test your understanding of the terms, ???passing by value??? and
???passing by reference???.
Review the following program and consider what you believe the output to be.

```Java
public class Assignment5_7A{
 int x = 3;
 public static void main(String[] args){
 Assignment5_7A object = new Assignment5_7A();
 int x = 7;
 object.changeIt(x);
 System.out.println(x);

 Assignment5_7A obj = new Assignment5_7A();
 Assignment5_7A obj2 = new Assignment5_7A();
 obj.x = 3;
 obj2.x = 9;
 obj = obj2;
 obj.changeIt(obj2);
 System.out.println(obj.x);
 System.out.println(obj2.x);

}
public void changeIt(int param){
 param++;
}
public void changeIt(Assignment5_7A obj){
 obj.x = 900;
}
}
```

#### Part B
Review the following program and consider what you believe the output to be.

```Java
public class Assignment5_7B{
static int x = 3;
public static void main(String[] args){
 Assignment5_7B obj = new Assignment5_7B();
 obj.x=100;

 Assignment5_7B obj2 = new Assignment5_7B();
 obj2.x=200;

 x = 1000;
 obj.changeIt(x);

 x = 2000;
 obj2.changeIt(x);

 obj.changeIt(obj);

 System.out.println(Assignment5_7B.x);
 System.out.println(obj.x);
 System.out.println(obj2.x);
}
public void changeIt(int param){
 x=param;
}
public void changeIt(Assignment5_7B obj){
 obj.x = 900;
}
}
```

### Assignment 5.8
I wish to create an immutable class called Assignment5_8.
I wish to store the following numbers in an ArrayList. The ArrayList should be
declared and instantiated as an instance variable.

100
200
300
400

I only want users of my class to be returned a copy of the ArrayList.
Model the above requirements for class, Assignment5_8.

Create a second class named TestEncapsulation. In the main method, create an
object of type Assignment5_8.

* Using your Assignment5_8 object reference, call a method, which returns a
copy of the ArrayList of numbers. Display the contents of the local copy of the
ArrayList in the console. It should read: 100 200 300 400.
* Using the local copy of the ArrayList of numbers, remove the item stored at
element 3. Now display the contents of the local copy of the ArrayList in the
console. It should read 100 200 300.
* Finally, request access again to the ArrayList of numbers in the
Assignment5_8 class. Again, you will only receive a copy of the ArrayList
object. You should see the following numbers in the console. It should read:
100 200 300 400. The original ArrayList object is untouched ??? our class was
immutable.

### Assignment 5.9
Create a class named CalculateRemainder.java, the purpose of which is to perform
modulus (remainder) operations.

The following functionality should be incorporated.
* A method which is passed two bytes and returns the remainder of the two
numbers as a byte. For example, when 10 is divided by 3, the remainder is 1.
* A method which is passed two shorts and returns the remainder of the two
numbers as a short.
* A method which is passed two ints and returns the remainder of the two
numbers as an int.
* A method which is passed two longs and returns the remainder of the two
numbers as a long.

Create a class named Assignment 5_9.java, which contains the main method.
In main(), declare and instantiate an object of type CalculateRemainder.
Test the functionality of the methods declared in the CalculateRemainder class, as
shown below.

Mod operation on two bytes: 100 and 6: Result 4
Mod operation on two shorts: 100 and 6: Result 4
Mod operation on two ints: 100 and 6: Result 4
Mod operation on two longs: 100 and 6: Result 4


### Assignment 5.10
Create a class to model a Banana.
A Banana has a price and is produced by a manufacturer.
The following Banana objects should be created with the specified attributes:

| Manufacturer | Price |
| ------------ | ----- |
| Foffs        | 1.40  |
| Toffs        | 2.00  |
| Mushies      | 1.20  |


* A Banana object cannot be created if the price is negative.

The Banana class should be able to determine:
* the number of Banana objects created.
* the average price of a Banana.

The following design features should also be incorporated in the Banana class:
* Static initializers.
* Instance initializers.
* A constructor with two arguments.
* Accessor and mutator methods.
Create a separate class named, Assignment5_10.java, which contains the main
method. Create three Banana objects (using the table above) and using the
appropriate members of the Banana class, determine the following:
(A): the number of Banana objects created.
(B): the average price of a Banana
