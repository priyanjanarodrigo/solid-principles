package com.myorg.sp.interfaceSegregation.practicals.birdExample.badPractise;

public class Eagle implements BirdActionable {

  @Override
  public void fly() {
    System.out.println("Eagle is flying really fast");
  }

  @Override
  public Double getMaxFlyableHeight() {
    return 1000d;
  }

  @Override
  public void walk() {
    System.out.println("Eagle is walking");
  }

  /**
   * Issue: Have to be overridden Forcibly :
   * ------------------------------------------
   * Cannot resist overriding this method from implemented interface BirdActionable, even if the
   * Eagle cannot run
   */
  @Override
  public void run() {
    System.out.println("N/A");
  }
}
