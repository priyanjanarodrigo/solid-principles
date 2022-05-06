package com.myorg.sp.interfaceSegregation.practicals.birdExample.goodPractise;

/**
 * Considering interface segregation principle we have split behaviours of births into 3 interfaces
 */
public class BirdsGoodPractiseDemo {
  public static void main(String[] args) {
    System.out.println("\nOstrich -------------------------------------------------------------------------------");

    Ostrich ostrich = new Ostrich();

    ostrich.walk();
    ostrich.run();

    System.out.println("\nPenguin -------------------------------------------------------------------------------");

    Penguin penguin = new Penguin();

    penguin.walk();

    System.out.println("\nEagle ---------------------------------------------------------------------------------");

    Eagle eagle = new Eagle();

    eagle.fly();
    System.out.println(eagle.getMaxFlyableHeight());
    eagle.walk();
  }
}
