package com.wacgoo.chapter01;

class Dog {
  public final static String KINGDOM = "Animal";
  public final static String FAMILY = "Canidae";

  public static String favoriteFood = "bone";
  
  private String name;

  public Dog() {
    name = "Doggie";
  }

  public String getName() {
    return name;
  }

  public void setName(String newName) {
    name = newName;
  }

  public String biteOtherDog(Dog otherDog) {
    String bittenSound = otherDog.bittenSound();
    return name + " bit " + otherDog.getName() + "\n" +
      bittenSound;
  }

  private String bittenSound() {
    return name + " said: ouch!";
  }

  public String feed(String appretizer, String mainDish) {
    return name + " ate " + appretizer + ", then ate " + 
      mainDish;
  }

  public int fetchStick(int numOfSticks) {
    // drop one stick
    numOfSticks = numOfSticks - 1;
    System.out.println(name + " fetched you " + numOfSticks +
                      " sticks");
    return numOfSticks;
  }
}