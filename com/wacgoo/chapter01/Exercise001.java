package com.wacgoo.chapter01;

import com.wacgoo.IExercise;

public class Exercise001 implements IExercise {

  private Dog roofus;

  // this function is to help you display the name of a dog
  private static void printName(String name) {
    System.out.println("My dog's name is " + name);
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

    /* ******************
    ** What you just learned
    **   Calling constructor to instantiate a object, then
    **   perform action to the object
    ** ******************
    */
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

    /* ******************
    ** What you just learned
    **   Create additional contructors that accept arguments
    ** ******************
    */

  }

  private void ladyAndTheTramp() {
    System.out.println("\n==Exercise: Lady and the Tramp\n");
    // todo: create 2 dogs and name them "Lady" and "Jock"
    Dog lady = null;
    Dog jock = null;

    // todo: ask dog "Lady" to bit "Jock" by calling
    // biteOtherDog.
    // biteOtherDog returns a sound (in String),
    // print out the sound

    // System.out.println(biteSound);

    if (lady!=null) {
      System.out.println(lady.getName() + " belongs to " +
                        lady.KINGDOM + " kingdom and " +
                        lady.FAMILY + " family");
    }

    if (jock!=null) {
      // todo: print out which kingdom and family Jock
      //       belongs to


    }

    if (lady!=null) {
      System.out.println(lady.getName() + "'s favorite food is " +
                        lady.favoriteFood);      
    }
    if (jock!=null) {
      System.out.println(jock.getName() + "'s favorite food is " +
                        jock.favoriteFood);      
    }

    // todo: change all dogs' favorite food to Ramen

    if (lady!=null) {
      System.out.println(lady.getName() + "'s favorite food is " +
                        lady.favoriteFood);      
    }
    if (jock!=null) {
      System.out.println(jock.getName() + "'s favorite food is " +
                        jock.favoriteFood);
    }

    /* ******************
    ** What you just learned
    **   Class is a blueprint, you can create multiple instances
    **   base on this blueprint.
    **   Each instance has its own state (e.g. name of a dog)
    **   However, all instances of the same Class share the STATIC
    **   attributes.
    ** ******************
    */    
  }

  private void feedRoofus() {
    System.out.println("\n==Exercise: feed Roofus\n");
    // todo: create a Dog with name "Roofus", and save it
    // to the class attribute roofus (already defined)

    // todo: feed Roofus by calling feed() with appretizer
    // "pickle" and main dish "hot dog". Print the
    // returned string.

    // todo: create another "feed" method in Dog class to
    // *overload* the feed() by taking only one parameter,
    // and returning "Roofus ate <name of the food>"

    // todo: feed Roofus only pizza, and display the result

    /*
     * todo: create another Dog name "Scooby-Do" and save it
     * in the following *local variable* scoobydo
     */
    Dog scoobydo;

    /*
     * todo: display what scoobydo ate after calling "feed"
     * with "fish" to scoobydo
     */

    
    /* ******************
    ** What you just learned
    **   Method overloading
    **   Local variable instantiation
    ** ******************
    */
  }

  private void scoobydoWhereAreYou() {
    System.out.println("\n==Exercise: Scooby-Do Where Are You?\n");
    if (roofus != null) {
      printName(roofus.getName());
    }

    Dog scoobydo = null;
    if (scoobydo != null) {
      printName(scoobydo.getName());
    } else {
      System.out.println("Scooby-Do, where are you?!");
      /*
       * answer:
       * you instantiated a variable "scoobydo"
       * in the previous method. But why can't scoobydo
       * here is still null?
       */

      // todo: adjust the variable scoobydo so that you can create
      // it in the previous method "feedRoofus()", and
      // get its name here, just like roofus
    }
    
    /* ******************
    ** What you just learned
    **   Class attributes and local variable scopes.
    **   Class attributes, like roofus, remains across method scopes.
    **   Local variables stay within the same scope they were defined.
    ** ******************
    */
  }

  private void imposter() {
    System.out.println("\n==Exercise: imposter\n");

    if (roofus != null) {
      printName(roofus.getName());
    }

    Dog roofus = new Dog();
    roofus.setName("Goofy");
    printName(roofus.getName());

    System.out.println("No! That's not my dog.");
    // Roofus still exists. But the roofus above is not the right dog.
    
    // todo: change the following line to get to real Roofus,
    //       display its name without setting the name again.
    printName(roofus.getName());

    /* ******************
    ** What you just learned
    **   Variable name collision, how to resolve them
    ** ******************
    */
  }

  private void dogDoesTricks() {
    System.out.println("\n==Exercise: dog does tricks\n");

    // todo: run and observe the output of this exercise

    int numOfSticks = 5;
    if (iHaveRoofus()) {
      System.out.println("You said, \"" + roofus.getName() +
          ", fetch me " +
          numOfSticks + " sticks\"");
      roofus.fetchStick(numOfSticks);
      /*
       * answer:
       * - why Roofus didn't fetch you 5 sticks?
       * - Inside the method fetchStick() of Dog, numOfSticks
       * was changed. But why it is still showing
       * 5 sticks here after calling fetchStick()?
       */

      /*
       * todo: notice fetchStick() in Dog class returns the actual
       * number of sticks fetched. Make necessary
       * changes only in this method to show the actual
       * number of sticks fetched
       */
      System.out.println("You received " + numOfSticks +
          " sticks from " + roofus.getName());
    }

    /* ******************
    ** What you just learned
    **   Method parameters of primative types (e.g. int) 
    **   are pass-by-value. They cannot be 
    **   modified by the method.
    ** ******************
    */    
  }

  private void catLover() {
    System.out.println("\n==Exercise: cat lover\n");
    /*
     * todo: create a new Class Cat with the following:
     * - has a String attribute "name"
     * - one constructor that takes single String. The
     * value will be used as the name of the Cat
     * - has a getName method that returns the name
     */

    /*
     * todo: create a Cat object with name Felix, then
     * display its name
     */

    /* ******************
    ** What you just learned
    **   Create your own Class
    ** ******************
    */    
  }

  /* **************************************************
  **  STOP, this exercise is completed
  ** ************************************************** 
  */

  public void run() {
    welcomeDog();
    iWantMyOwnDog();
    ladyAndTheTramp();
    feedRoofus();
    scoobydoWhereAreYou();
    imposter();
    dogDoesTricks();
    catLover();
  }

  private boolean iHaveRoofus() {
    return roofus != null;
  }
}