package com.myorg.sp.singleResponsibility.basics.goodPractise;

public class MessageCommunicator {
  /**
   * Only one responsibility - Message communication management
   */
  public void send(String message) {
    System.out.println("SENDING - " + message);
  }

  public String receive(String message) {
    return message;
  }
}
