package com.myorg.sp.singleResponsibility.basics.badPractise;

public class SRP_BadPractiseDemo {
  public static void main(String[] args) {
    /** All the responsibilities are allocated only to Messenger class . Therefore, here it has 3 responsibilities */
    Messenger messenger = new Messenger();

    String message = messenger.createMessage("Hi hOw aRe you ? "); // processing
    String editedMessage = messenger.editMessage(message); // processing
    messenger.send(editedMessage); // communicating
    messenger.showDeliveryStatus(true); // viewing
    String receivedMessage = messenger.receive("I am fine"); // communicating
    messenger.displayMessage(receivedMessage); // viewing
  }
}
