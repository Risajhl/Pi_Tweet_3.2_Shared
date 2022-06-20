package ir.pi.project.shared.model.help;

import ir.pi.project.shared.enums.others.MessageStatus;

import java.time.LocalDateTime;

public class HelpMessage {
    int id;
    String senderUsername;
    int senderId;
    String text;
    LocalDateTime time;
    MessageStatus messageStatus;
    String imageInString;
    String senderImageInString;
    boolean EPBCanSee;

    public HelpMessage(int id, String text, String senderUsername, int senderId, LocalDateTime localDateTime, MessageStatus messageStatus){
        this.id=id;
        this.text=text;
        this.senderUsername=senderUsername;
        this.senderId=senderId;
        this.time=localDateTime;
        this.messageStatus=messageStatus;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getSenderUsername() { return senderUsername; }
    public void setSenderUsername(String senderUsername) { this.senderUsername = senderUsername; }
    public int getSenderId() { return senderId; }
    public void setSenderId(int senderId) { this.senderId = senderId; }
    public String getText() { return text; }
    public void setText(String text) { this.text = text; }
    public LocalDateTime getTime() { return time; }
    public void setTime(LocalDateTime time) { this.time = time; }
    public MessageStatus getMessageStatus() { return messageStatus; }
    public void setMessageStatus(MessageStatus messageStatus) { this.messageStatus = messageStatus; }

    public String getImageInString() {
        return imageInString;
    }

    public void setImageInString(String imageInString) {
        this.imageInString = imageInString;
    }

    public String getSenderImageInString() {
        return senderImageInString;
    }

    public void setSenderImageInString(String senderImageInString) {
        this.senderImageInString = senderImageInString;
    }

    public boolean isEPBCanSee() {
        return EPBCanSee;
    }

    public void setEPBCanSee(boolean EPBCanSee) {
        this.EPBCanSee = EPBCanSee;
    }
}
