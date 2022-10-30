public class Exercise001 implements IExercise {
  public void run() {
    System.out.println("Exercise: Welcome Dog\n");
    welcomeDog();
    iWantMyOwnDog();
  }

  private void welcomeDog() {
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
    // todo: Sometimes you know what to name a dog when you see
    // it for the first time. Go to the Dog class and add
    // a new Constructor that would let you name the dog
    // right away when you creating a new dog instance

    // todo: now create a new Dog instance and store it locally
    // in this function

     // todo: display the dog's name by calling printName()
  }
}