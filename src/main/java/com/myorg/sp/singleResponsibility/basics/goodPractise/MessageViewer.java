package com.myorg.sp.singleResponsibility.basics.goodPractise;

public class MessageViewer {
  /**
   * Only one responsibility - Message state representation
   */
  public void displayMessage(String message) {
    System.out.println(message);
  }

  public void showDeliveryStatus(boolean isDelivered) {
    System.out.println("Delivery Status - " + isDelivered);
  }
}
