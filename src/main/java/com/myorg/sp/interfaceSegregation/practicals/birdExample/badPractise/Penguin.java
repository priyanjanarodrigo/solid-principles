package com.myorg.sp.interfaceSegregation.practicals.birdExample.badPractise;

public class Penguin implements BirdActionable {

  /**
   * Issue: Have to be overridden Forcibly :
   * ------------------------------------------
   * Cannot resist overriding this method from implemented interface BirdActionable, even if the Penguin cannot fly
   */
  @Override
  public void fly() {
    System.out.println("N/A");
  }

  /**
   * Issue: Have to be overridden Forcibly :
   * ------------------------------------------
   * Cannot resist overriding this method from implemented interface BirdActionable, even if the
   * Penguin does not have a max flyable height due to it cannot fly
   */
  @Override
  public Double getMaxFlyableHeight() {
    return null;
  }

  @Override
  public void walk() {
    System.out.println("Penguin is walking");
  }

  /**
   * Issue: Have to be overridden Forcibly :
   * ------------------------------------------
   * Cannot resist overriding this method from implemented interface BirdActionable, even if the
   * Penguin cannot run
   */
  @Override
  public void run() {
    System.out.println("N/A");
  }
}
