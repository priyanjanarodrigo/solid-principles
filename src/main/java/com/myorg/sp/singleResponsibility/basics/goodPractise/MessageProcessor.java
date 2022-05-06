package com.myorg.sp.singleResponsibility.basics.goodPractise;

public class MessageProcessor {
  /**
   * Only one responsibility - Message Processing
   */
  public String createMessage(String newMessage) {
    return newMessage;
  }

  public String editMessage(String existingMessage) {
    return existingMessage.trim().toLowerCase();
  }
}
