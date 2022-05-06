package com.myorg.sp.singleResponsibility.basics.badPractise;

/**
 * Note that this example Messenger class has three responsibilities.
 * Therefore, this implementation violates single responsibility principle.
 * In order to adhere with single responsibility pattern, these responsibilities have to be divided into three separate
 * classes where each class can concentrate on one/single responsibility.
 */
public class Messenger {
  /**
   * Responsibility 1 - Message communication management
   */
  public void send(String message) {
    System.out.println("SENDING - " + message);
  }

  public String receive(String message) {
    return message;
  }

  /**
   * Responsibility 2 - Message Processing
   */
  public String createMessage(String newMessage) {
    return newMessage;
  }

  public String editMessage(String existingMessage) {
    return existingMessage.trim().toLowerCase();
  }

  /**
   * Responsibility 3 - Message state representation
   */
  public void displayMessage(String message) {
    System.out.println(message);
  }

  public void showDeliveryStatus(boolean isDelivered) {
    System.out.println("Delivery Satatus - " + isDelivered);
  }
}
