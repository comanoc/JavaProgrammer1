### [Assignment 3.1](https://github.com/comanoc/JavaProgrammer1/blob/master/Topic3/Assignment3/Assignment3_1.java)
Create a class named Assignment3_1.
In the main method, create a variable named, isRaining (a boolean) and assign it a
value of true.
Evaluate the value stored in the variable, using an if-else statement. The program
should display one of the following messages:
* “Bring your umbrella, it’s raining."
* “No need for an umbrella, it’s dry”.

### Assignment 3.2
#### [Part A](https://github.com/comanoc/JavaProgrammer1/blob/master/Topic3/Assignment3/Assignment3_2A.java)
Create a class named Assignment3_2A.
Write a program, which displays the name of the season to match a given
temperature. In the main method, create a variable named, currentTemperature (a
float) and assign it a value of 15.00f.
Use an if - else if - else statement to evaluate the value stored in the variable,
currentTemperature. Display the name of the appropriate season.

| Temperature | Season |
| --- | --- |
| >= 16 | Summer |
| 11-15 | Spring |
| 7-10  | Autumn |
| <7    | Winter |

#### [Part B](https://github.com/comanoc/JavaProgrammer1/blob/master/Topic3/Assignment3/Assignment3_2B.java)
Create a class named Assignment3_2B.
In the main method, create a variable named, pointsWon (an integer). This variable
is used to store the number of points won by your favourite football team in the
Premier League. Assign a value of 44 to the variable.
Use an if - else if - else statement to evaluate the value stored in the variable,
pointsWon.
Display an appropriate message.

| Points Won | Message |
| --- | --- |
| >= 65 | The team has qualified for the Champions League.                                  |
| 57-64 | The team has qualified for the Europa League.                                     |
| 50-56 | The team has finished in mid-table.                                               |
| 40-49 | The team has finished in the lower-half of the table but has avoided relegation.  |
| <40   | The team has been relegated                                                       |

#### [Part C](https://github.com/comanoc/JavaProgrammer1/blob/master/Topic3/Assignment3/Assignment3_2C.java)
Create a class named Assignment3_2C.
Each month, a store offers a loyalty gift to its customers, depending on the number
of loyalty points they have earned in the month.
Create a program, which determines whether a customer has qualified for a loyalty
gift.
In the main method, create a variable named noLoyaltyPointsEarned (an integer)
and assign it a value of 260.
Use an if - else if - else statement to evaluate the value stored in the variable,
noLoyaltyPointsEarned.
Display an appropriate message

| Points Target Reached | Loyalty Gift                        |
| --- | --- |
| <150                  |  No gift.                           |
| 151 - 250             | 35 Euro off your next shopping bill |
| 251 - 350             | 50 Euro off your next shopping bill |
| >350                  | 75 Euro off your next shopping bill |

### Assignment 3.3
#### [Part A](https://github.com/comanoc/JavaProgrammer1/blob/master/Topic3/Assignment3/Assignment3_3A.java)
Create a class named Assignment3_3A.
A motor tax office operates a queue system to allow members of the public to
consult with officials.
A member of the public is given a ticket number and a position in the queue.
In the main method, create the following two variables.
* byte positionInQueue = 3;
* String ticketNo = "12345Z";
Test the value stored in the variable positionInQueue.
* If the number stored is from 1-3 (inclusive), a message should be displayed, instructing the waiting person to proceed to the front desk.
* Otherwise, the person should be told to remain seated.
Use a switch statement to evaluate the value stored in the variable, positionInQueue. 


#### [Part B](https://github.com/comanoc/JavaProgrammer1/blob/master/Topic3/Assignment3/Assignment3_3B.java)
Create a class named Assignment3_3B.
A steak is a piece of meat, which can be cooked in one of several different ways.

| Style     | Description                       |
| --- | --- |
| Rare      | Cool RED centre.                  |
| Medium    | Rare Hot RED centre.              |
| Medium    | Pink throughout.                  |
| Well Done | Brown and well-cooked throughout. |

Create a Java program, which uses an enum (steakCooked) to store the following
constants, RARE, MEDIUM_RARE, MEDIUM, WELL_DONE.
In the main method, create a variable of the specified enum type, and assign it a
value of RARE.
Evaluate the value stored in the variable using a switch statement, and display an
appropriate description to the user

#### [Part C](https://github.com/comanoc/JavaProgrammer1/blob/master/Topic3/Assignment3/Assignment3_3C.java)
Create a class named Assignment3_3C.
Create a program, which displays a welcome message to a user to match their
locale.

| Locale  | Welcome Message |
| --- | --- |
| Ireland | Failte!         |
| France  | Bienvenue!      |
| Germany | Willkommen!     |
| Spain   | Bienvenida!     |

In the main method, create the following variables.
* locale (a string). Assign it the value, “Ireland”.
* user (a string). Assign it the value, “Java Duke”.
Use a switch statement to evaluate the value stored in the variable, locale.
Display an appropriate message to the user.

### Assignment 3.4
#### [Part A](https://github.com/comanoc/JavaProgrammer1/blob/master/Topic3/Assignment3/Assignment3_4A.java)
Create a class named Assignment3_4A.java.
In the main method, create an array named myBytes. The size of the array is 10 and
it should store byte literal values.
Use a for loop to populate the array with the values, 1-10 (inclusive).
Use a separate for loop to display the contents of the array in the console.

#### [Part B](https://github.com/comanoc/JavaProgrammer1/blob/master/Topic3/Assignment3/Assignment3_4B.java)
Create a class named Assignment3_4B.java.
The following output was produced using a single for loop.

<p align="left">
  <img src="https://github.com/comanoc/JavaProgrammer1/blob/master/Topic3/Assignment3/Screenshot%202021-04-08%20at%2010.07.09.png" title="Screen Shot">
</p>

One variable is increasing in value, while the other is decreasing. When the two
variables have the same value, the loop should exit.
Create the for loop to produce the output as shown in the screenshot.

### Assignment 3.5
#### [Part A](https://github.com/comanoc/JavaProgrammer1/blob/master/Topic3/Assignment3/Assignment3_5A.java)
Create a class named Assignment3_5A.java.
In this exercise, you are asked to re-write Assignment 3.4 – Part A, using while
loops.

#### [Part B](https://github.com/comanoc/JavaProgrammer1/blob/master/Topic3/Assignment3/Assignment3_5B.java)
Create a class named Assignment3_5B.java.
Re-write Assignment 3.4 – Part B, using a single while loop.

#### [Part C](https://github.com/comanoc/JavaProgrammer1/blob/master/Topic3/Assignment3/Assignment3_5C.java)
Create a class named Assignment3_5C.java.
Re-write Assignment 3.4 – Part B, using a single do while loop.

### [Assignment 3.6](https://github.com/comanoc/JavaProgrammer1/blob/master/Topic3/Assignment3/Assignment3_6.java)
Create a class named Assignment3_5C.java.
Create a class named Assignment3_6.java.
In this program, you are asked to store the names of the following people going on a
camping trip.
  * Fred Smith
  * Helena Davis
  * Brian Burrows
  * Jane Beagles

An ArrayList (of type String) should be used to store the names of the participants.
An enhanced for loop should be used to display the contents of the collection.

### Assignment 3.7
#### [Part A](https://github.com/comanoc/JavaProgrammer1/blob/master/Topic3/Assignment3/Assignment3_7A.java)
Create a class named Assignment3_7A.java.
Create the following output using nested for loops.

<p align="left">
  <img src="https://github.com/comanoc/JavaProgrammer1/blob/master/Topic3/Assignment3/Screenshot%202021-04-08%20at%2010.19.06.png" title="Screen Shot">
</p>

#### [PartB](https://github.com/comanoc/JavaProgrammer1/blob/master/Topic3/Assignment3/Assignment3_7B.java)
Create a class named Assignment3_7B.java.
Re-write Part A of this assignment using nested while loops.

### [Assignment 3.9](https://github.com/comanoc/JavaProgrammer1/blob/master/Topic3/Assignment3/Assignment3_9.java)
Create a class named Assignment3_9.java.
In this program, you will ask a user to enter their password.
The program should store the passwords in a two-dimensional array (of type String).

|JavaDuke      |   JavaBean     | TheNullPointer  |
| ------------ | -------------  | --------------- |
|StackOverflow | VirtualMachine | LossyPrecision  |

A user is given three attempts to enter a correct password.
If the user enters an invalid password, the number of remaining attempts should be
displayed. If the password is found, the password validation process should
immediately end.
* A Scanner object should be used to facilitate user input.
* A labelled do-while loop should be used as part of your solution.

### [Assignment 3.10](https://github.com/comanoc/JavaProgrammer1/blob/master/Topic3/Assignment3/Assignment3_10.java)
‘The Lotto Terminal – programming challenge’
You have been asked to create a lotto application to run in a terminal. The Console
class in the java.io package should be used to process user input.
The specifications of the program:
* Numbers entered must be in the range 1-36 (inclusive).
Ex: 6 23 1 36 9 10
* Text entries for numbers are not allowed, ex: one.
* Duplicate numbers are not allowed.
* When the user has entered six valid numbers, they should be prompted to
confirm if they are happy with their selection. If they wish, they should be
allowed to re-enter a different set of six numbers.
* Any runtime exceptions should be handled gracefully.
* Thoroughly test your program against the requirements outlined above.
