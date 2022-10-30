class Dog {
  private String name;

  public Dog() {
    name = "Doggie";
  }

  public String tellMeYourName() {
    return name;
  }

  public void giveName(String newName) {
    name = newName;
  }
}