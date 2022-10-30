package com.wacgoo.chapter01;

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!\nWelcome to AP Comp Sci 101!!");
    System.out.println("==================================\n\n");
    IExercise exercise = new Exercise001();
    exercise.run();

    System.out.println("==================================\n");
    System.out.println("Goodbye!!\n");
  }
}