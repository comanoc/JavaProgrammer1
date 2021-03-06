### Assignment 4.1
#### Part A
Review the program shown below.

```Java
public class Assignment4_1A{
  public static void main(String[] args){
    System.out.println("My Lucky Numbers are: " + 75 +7);
  }
}
```

Will the program compile and if so, what output will it produce?

#### Part B
Review the class shown below. Consider whether the program will
compile, and if so, what is the output?

```Java
public class Assignment4_1B{
  public static void main(String[] args){
    byte y = 127;
    byte z = 1;
    z += y;

    String a = "Lucky Number: ";
    a+=z;
    a+=1;

    System.out.println(a);
  }
}
```

#### Part C
Consider the class shown below. What do you consider the output
to be?

```Java
public class Assignment4_1C{
  public static void main(String[] args){
    String story = "Duke great adventure";
    String poem = new String("Duke great adventure");
    System.out.println(story == poem);
  }
}
```

### Assignment 4.2
#### Part A
Create a class named, Assignment4_2A. The class should contain one instance
variable named message, of type String, to contain the following text.
`String message = "Duke's big day out!";`
In the main method, use the appropriate methods of the String class, to answer the
following questions.
* Is the string "big", contained in the string, "Duke's big day out!"? Print the
result to the console.
* Extract the string "big", from the string, "Duke's big day out!". Print the
extracted string in the console.
* Replace the string "big", in the string, "Duke's big day out!" with the string
"magical". Print the value of the new string to the console

#### Part B
Create a class named, Assignment4_2B. The class should contain one instance
variable named message, of type String, to contain the following text.
String message = "One, two, buckle my shoe";
In the main method, use the appropriate methods of the String class, to answer the
following questions.
* At what index position in the string variable, message, will you find the string,
“buckle"?
* Determine if the string variable, message, ends with the string, "shoe"?
* In the string variable, message, extract the character at index position 2.

#### Part C
Create a class named, Assignment4_2C.
The class should contain two instance variables:
```Java
String messageOne = "Java Duke";
String messageTwo = "java duke";
```

* Which string method can be used to determine whether two strings are equal
(ignoring case)?


#### Part D
Create a class named, Assignment4_2D.
Define the following instance variable.
```Java
String b = " double trouble ";
```

Using method chaining, perform the following actions:
* Remove any leading and trailing whitespace.
* Replace the string trouble with the string bubble.
* Find and display the index position of the string, “bubble”, in the newly created
string.

### Assignment 4.3
#### Part A
Create a class named Assignment4_3A.java.
You wish to store the following names in an array. The names to be stored are
Sandy, Mary and Jim.
Declare, create and initialise the array in one statement.
Use an enhanced for loop to display the contents of the array.


#### Part B
Create a source code file named, Assignment4_3B.java.
The source code file should contain the following two classes:
* public class Assignment4_3B
* class Friend

Class Friend, should contain the following:

##### Instance variables:
* `private String firstName;`
* `private String lastName;`
* `private String phoneNo;`
* `private String emailAddress;`

##### Constructor
`public Friend(String firstName, String lastName, String phoneNo, String emailAddress)`

##### Methods
`public String toString()`

The main method should be declared in class Assignment4_3B. In the main
method, create the following objects of type Friend.

| First Name | Last Name | Phone No.  | emailAddress:           |
| ---------- | --------- | ---------  | -------------           |
| Sandy      | Smith     | 0864545321 | sandysmith@livemail.com |
| Ben        | Jones     | 0864152412 | jonesben@livemail.com   |


* Use an array to store the two Friend object references created. Declare, create
and initialise the array in one statement.
* Use a standard for loop, to call the toString() method of each object stored.

#### Part C

Create a class named, Assignment4_3C.java.
The program when running, should allow the user to pass in to the args array, the
names of his/her favourite football stars.
Determine the number of entries passed to the program.

### Assignment 4.4
#### Part A
Create a class named, Assignment4_4A.java.
Create an array named, smallNos, to store the following byte literal values.
* 127,100,45,23,60
* Sort the contents of the array in ascending order.
* Display the contents of the array in the console.

#### Part B
Create a class named, Assignment4_4B.java.
Create an array named, numbers, to store the following int literal values.
* 34,67,23,180
Sort the array
and search for the index position of the number 67 in the array using binary search.

### Assignment 4.5
#### Part A
Create a class named, Assignment4_5A.java.
A company wants to store the following quarterly sales forecasts for the next three year period.

|         |   Q1    |   Q2   |  Q3   |   Q4   |
| -----   | ------- | ------ | ----- | ------ |
| Year 1  |  12000  | 13000  | 14000 |  15000 |
| Year 2  |  13000  | 14000  | 15000 |  16000 |
| Year 3  |  10000  | 12000  | 15000 |  13000 |

* Use a two-dimensional array to store the figures.
* Use standard for loops to display the values stored.

#### Part B
Create a class named, Assignment4_5B.java, to store the temperatures recorded
in Ireland for the last two years.

| Jan | Feb | Mar | Apr | May | Jun | Jul | Aug | Sep | Oct | Nov | Dec |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
| 9.0 | 9.1 | 11.2| 12.0| 14.1| 18.0| 23.0| 21.1| 20.0| 13.0| 10.1| 9.0 |
| 8.0 | 8.1 | 10.2| 11.0| 14.1| 17.0| 22.0| 22.1| 21.0| 12.0| 11.1| 8.0 |

Use a two-dimensional array to store the figures.

* (1): Use standard for loops to display the values stored.
* (2): Use enhanced for loops to display the values stored.

#### Part C
Create a class named Assignment4_5C.java.
Create a two-dimensional array to store the following Strings.

| green | white | orange |        |       |       |
| ----- | ----- | -----  | -----  | ----- | ----- |
| red   | white | blue   | yellow | black | green |

Display the values stored in the two-dimensional array, using a looping
mechanism of your choice.

### Assignment 4.6
#### Part A
Create a class named Assignment4_6A.java.
Create an ArrayList to store the names of the following film stars. The data type of
the ArrayList is String.
* Elvis Presley
* Marilyn Monroe
* James Dean
* Rita Davies

Complete the following actions, making use of the methods found in the ArrayList
object.

1. Cary Grant should be added to the list at index position two.
2. Determine if Marilyn Monroe is included in the list.
3. Display the name of the actor stored at index position four of the list.
4. At what index position of the list, is James Dean stored?
5. Remove Rita Davies from the list.
6. Display the new contents of the Arraylist.

#### Part B

Create a class named CD.
The class should contain the following members.
##### Instance Variables
* private String name;
* private String artist;
* private String yearReleased;
* private String recordLabel;

##### Constructor
* One constructor should be created to accept four arguments.
Methods
* Accessor Methods (setters and getters) should be set for each of the instance
variables.
* The equals() method should be overridden to allow two CD objects to be
considered equal. Assume that two CD objects are considered equal, if they
have the same (album) name
* The toString() method should also be overridden appropriately.

Create a class named Assignment4_6B.java.
In the main method, create an ArrayList object and complete the following steps.
* Step 1: Create the following objects and add them to the ArrayList.

|   Album                   |    Artist   | Year |   Record Label   |
| ------------------------  | ----------- | ---- | ---------------- |
| Rattle and Hum            |      U2     | 1988 | Island Records   |
| The Dark Side of the Moon | Pink Floyd  | 1973 | Capitol Records  |

* Step 2: Create the following object and add it to index position one of the ArrayList.

|   Album                         |    Artist     | Year |   Record Label       |
| ------------------------------- | ------------- | ---- | -------------------- |
| The Very Best Of Fleetwood Mac  | Fleetwood Mac | 2002 | Warner Bros. Records |

* Step 3: Create the following object and add it to index position two of the
ArrayList.

|   Album                           |    Artist         | Year |   Record Label   |
| --------------------------------  | ----------------- | ---- | ---------------- |
| Alanis Morissette: The Collection | Alanis Morissette | 2005 |  Maverick        |

* Step 4: Determine if the album, ‘The Very Best of Fleetwood Mac', is stored in
the ArrayList.

* Step 5: Return details of the album stored at index position 3 of the ArrayList.
* Step 6: Remove the album, ‘The Very Best of Fleetwood Mac' from the ArrayList.
* Step 7: Display the number of albums stored in the ArrayList.
* Step 8: Display the contents of the ArrayList.

### Assignment 4.7
#### Part A
Create a Java program named, Assignment4_7A.java, which makes use of classes
in the java.time package to perform the following actions:

1. Display today’s date.
2. Display the current time.
3. Display the current date and time.
4. Construct the following date and time:

| Year | Month | Day of Month | Hour | Minute | Second |
| ---- | ----- | ------------ | ---- | ------ | ------ |
| 2017 |   12  |      25      |  13  |   00   |   05   |

#### Part B
Create a Java program named, Assignment4_7B.java, which uses the LocalDate
class to perform a number of date manipulations.

1. Use the LocalDate class to construct the following date: 2018-01-01
2. Add seven days to the date.
3. Add four weeks to the date.
4. Add six months to the date.
5. Add two years to the date.

#### Part C
Create a class named Assignment4_7C.java.

2017-06-07 11:20

Create the specified date and time (using a LocalDateTime object), making use of the following classes in the java.time package.

* LocalDate
* LocalTime
Using method chaining, use methods of the LocalDateTime object to subtract 7 days, 6 hours and 30 seconds from the LocalDateTime object, previously created.

### Assignment 4.8
#### Part A
Using classes defined in the java.time package, can you create the following output?

2017-01-01
2017-02-01
2017-03-01
2017-04-01
2017-05-01
2017-06-01
2017-07-01
2017-08-01
2017-09-01
2017-10-01
2017-11-01
2017-12-01

2017-12-02
2017-11-02
2017-10-02
2017-09-02
2017-08-02
2017-07-02
2017-06-02
2017-05-02
2017-04-02
2017-03-02
2017-02-02
2017-01-02

2017-01-01
2017-07-01

#### Part B
Create a class named, Assignment4_8B.java.
Create a LocalDate object to store 08/06/2017
Use methods of the LocalDate object, to produce the output shown below.

THURSDAY
JUNE
2017
159

#### Part C
Create a Java program, which formats the date and time, as shown below.

The Football Cup starts on; 17-06-2017
Russia v New Zealand kicks off at: 18:00:00

Use a user-defined date format and a user-defined time format in your solution.

#### Part D
Create a program, which formats the date and time, as shown below.

The first match in the Football Cup takes place on: 17/06/17
The Football Cup Final takes place on: 02-Jul-2017
The kick off time of the final is: 21:00:00

Use pre-defined format styles in our solution.

#### Part E
In 2017, the Wimbledon’s Men’s Tennis final took place on the 16th July.
Create a class named, Assignment4_8E.java, which contains the main method. In
main, create the following variable.

`String mensTennisFinal = "07 16 2017";`

Convert this String to a LocalDate object and display the output, as shown in the
screenshot.

### Assignment 4.9

Create a class named Assignment4_9A.java.
In the main method, create a StringBuilder object containing the String, “Learning
Java is fun”.

* Append the following String to the StringBuilder object. “ and rewarding.”.
Print the value of the StringBuilder object to the console.

* Insert the String, "programming ", after the word "Java ", in the StringBuilder object.
Print the value of the StringBuilder object to the console.

* Delete the String "Java ", from the StringBuilder object.
Print the value of theStringBuilder object to the console.

* Reverse the value of the String stored in the StringBuilder object.
Print the value of the StringBuilder object to the console.

* Reverse the value again and call the toString() method of the StringBuilder object.
