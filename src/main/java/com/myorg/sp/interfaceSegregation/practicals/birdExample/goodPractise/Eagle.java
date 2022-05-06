package com.myorg.sp.interfaceSegregation.practicals.birdExample.goodPractise;

import com.myorg.sp.interfaceSegregation.practicals.birdExample.goodPractise.interf.Flyable;
import com.myorg.sp.interfaceSegregation.practicals.birdExample.goodPractise.interf.Walkable;

/**
 * Here Eagle class can specifically implement only the required interfaces which are Flyable and Walkable.
 * With this, we do not need to implement any method forcibly.
 * We can implement this class using only the applicable interfaces.
 * In this case CanRunnable is not applicable, and therefore we do not implement that.
 */
public class Eagle implements Flyable, Walkable {
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
}
