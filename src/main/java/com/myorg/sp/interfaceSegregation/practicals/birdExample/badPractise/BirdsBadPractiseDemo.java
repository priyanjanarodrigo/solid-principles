package com.myorg.sp.interfaceSegregation.practicals.birdExample.badPractise;

public class BirdsBadPractiseDemo {
  public static void main(String[] args) {
    System.out.println("\nOstrich -------------------------------------------------------------------------------");

    Ostrich ostrich = new Ostrich();

    ostrich.fly(); // flying is not applicable for Ostrich
    System.out.println(ostrich.getMaxFlyableHeight());// Ostrich does not have a max flyable height
    ostrich.walk();
    ostrich.run();

    System.out.println("\nPenguin -------------------------------------------------------------------------------");

    Penguin penguin = new Penguin();

    penguin.fly(); // flying is not applicable for Penguin
    System.out.println(penguin.getMaxFlyableHeight());// Penguin does not have a max flyable height
    penguin.walk();
    penguin.run(); // running is not applicable for Penguin

    System.out.println("\nEagle ---------------------------------------------------------------------------------");

    Eagle eagle = new Eagle();

    eagle.fly();
    System.out.println(eagle.getMaxFlyableHeight());
    eagle.walk();
    eagle.run(); // running is not applicable for Eagle
  }
}
