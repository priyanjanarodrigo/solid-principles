package com.myorg.sp.singleResponsibility.basics.goodPractise;

public class SRP_GoodPractiseDemo {
  public static void main(String[] args) {
    /** Message communication responsibility is allocated to MessageCommunicator class */
    MessageCommunicator messageCommunicator = new MessageCommunicator();

    /** Message processing responsibility is allocated to MessageProcessor class */
    MessageProcessor messageProcessor = new MessageProcessor();

    /** Message viewing responsibility is allocated to MessageViewer class */
    MessageViewer messageViewer = new MessageViewer();

    String message = messageProcessor.createMessage("Hi how are you  ?");
    String editedMessage = messageProcessor.editMessage(message);
    messageCommunicator.send(editedMessage);
    messageViewer.showDeliveryStatus(true);

    String receivedMessage = messageCommunicator.receive("I am fine. thank you!");
    messageViewer.displayMessage(receivedMessage);
  }
}
