package com.myorg.sp.interfaceSegregation.practicals.birdExample.goodPractise;

import com.myorg.sp.interfaceSegregation.practicals.birdExample.goodPractise.interf.CanRunnable;
import com.myorg.sp.interfaceSegregation.practicals.birdExample.goodPractise.interf.Walkable;

/**
 * Here Ostrich class can specifically implement only the required interfaces which are CanRunnable and Walkable.
 * With this, we do not need to implement any method forcibly.
 * We can implement this class using only the applicable interfaces.
 * In this case Flyable is not applicable, and therefore we do not implement that.
 */
public class Ostrich implements CanRunnable, Walkable {
  @Override
  public void run() {
    System.out.println("Ostrich is running really fast");
  }

  @Override
  public void walk() {
    System.out.println("Ostrich is walking");
  }
}
