package com.wacgoo.chapter01;

import com.wacgoo.IExercise;

public class Exercise001 implements IExercise {

  private Dog roofus;
  
  public void run() {
    welcomeDog();
    iWantMyOwnDog();
    multipleDogs();
    feedRoofus();
    scoobydoWhereAreYou();
    catLover();
  }

  private void welcomeDog() {
    System.out.println("\n==Exercise: Welcome Dog\n");
    // todo: construct an instance from Dog class
    // using its default constructor, assign it to
    // a local variable

    // todo: display the dog's name by calling printName()

    // todo: now you have a dog, why don't you name it? Look at the
    // Dog class to see if there is a way to change the
    // name the dog.
    // Name the dog and display its new name
  }

  private static void printName(String name) {
    System.out.println("My dog's name is " + name + "\n");
  }

  private void iWantMyOwnDog() {
    System.out.println("\n==Exercise: I want my own dog\n");
    // todo: Sometimes you know what to name a dog when you see
    // it for the first time. Go to the Dog class and add
    // a new Constructor that would let you name the dog
    // right away when you creating a new dog instance

    // todo: now create a new Dog instance and store it locally
    // in this function

     // todo: display the dog's name by calling printName()
  }

  private void multipleDogs() {
    System.out.println("\n==Exercise: multiple dogs\n");
    // todo: create 2 dogs and name them "Evangelyn" and "Jak"

    // todo: ask dog "Evangelyn" to bit "Jak" by calling
    //       biteOtherDog. 
    //       biteOtherDog returns a sound (in String),
    //       print out the sound
    
    // System.out.println(biteSound);
  }

  private void feedRoofus() {
    System.out.println("\n==Exercise: feed Roofus\n");
    // todo: create a Dog with name "Roofus", and save it
    //       to the class attribute roofus (already defined)
    // todo: feed Roofus by calling feed() with appretizer
    //       "pickle" and main dish "hot dog". Print the
    //       returned string.

    // todo: create another "feed" method in Dog class to
    //       *overload* the feed() by taking only one parameter,
    //       and returning "Roofus ate <name of the food>"

    // todo: feed Roofus only pizza, and display the result

    /*
      todo: create another Dog name "Scooby-Do" and save it
            in the following *local variable* scoobydo
    */
    Dog scoobydo;

    /*
      todo: display what goofy ate after calling "feed" 
            with "fish" to Goofy
    */
    
  }

  private void scoobydoWhereAreYou() {
    System.out.println("\n==Exercise: Scooby-Do Where Are You?\n");    
    // todo: display Roofus' name again

    // think: why can't you display goofy's name here too?
    // todo: change the variable goofy so that you can create
    //       it in the previous method "feedRoofus", but
    //       still can get its name here, just like roofus
  }

  

  private void catLover() {
    System.out.println("\n==Exercise: cat lover\n");    
    /*
      todo: create a new Class Cat with the following:
            - has a String attribute "name"
            - one constructor that takes single String. The
              value will be used as the name of the Cat
            - has a getName method that returns the name
    */
    
    /*
      todo: create a Cat object with name Felix, then
            display its name
    */
  }
}