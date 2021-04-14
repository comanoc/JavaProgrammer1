package com.javadevelopers.japan;
import com.javadevelopers.ireland.PacmanMania;

public class MsPacmanMania extends PacmanMania {
  public static void main(String[] args){
    PacmanMania gameObj = new MsPacmanMania();
    System.out.println("aliens on screen " + gameObj.maxNoOfAliensOnScreen);
  }
}

/*
javac -d . PacmanMania; // compiles.
javac -d . MsPacmanMania; // compiler error.

*

PacmanMania gameObj = new MsPacmanMania();

This is an example of polymorphism. We are treating a subclass type as a super type.
However, this is not inheritance.

The reference type of the variable gameObj is PacmanMania (the super type).

*/
