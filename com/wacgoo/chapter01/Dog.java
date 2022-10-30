package com.wacgoo.chapter01;

class Dog {
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
}