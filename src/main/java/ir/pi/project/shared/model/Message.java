package ir.pi.project.shared.model;


import ir.pi.project.shared.enums.others.MessageStatus;

import java.time.LocalDateTime;

public class Message {
//    static private final Logger logger= LogManager.getLogger(Message.class);

    int id;
    private final int senderId;
    private final int receiverId;
    private String text;
    private LocalDateTime time;
    private boolean isForwarded;
    private boolean isDeleted;
    private boolean isBotSeen;
    private MessageStatus status;
    private String imageInString;


    public Message(int id,int senderId,int receiverId, String text){
            this.id=id;
            this.senderId=senderId;
            this.receiverId=receiverId;
            this.text = text;
            this.time = LocalDateTime.now();
            this.isForwarded=false;
            this.isDeleted=false;
            this.status=MessageStatus.DELIVERED;

    }


    public int getId() {
        return id;
    }

    public int getSenderId() {
        return senderId;
    }

    public int getReceiverId() {
        return receiverId;
    }

    public String getText() {
        return text;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public boolean isForwarded() {
        return isForwarded;
    }

    public void setForwarded(boolean forwarded) {
        isForwarded = forwarded;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public MessageStatus getStatus() {
        return status;
    }

    public void setStatus(MessageStatus status) {
        this.status = status;
    }

    public String getImageInString() {
        return imageInString;
    }

    public void setImageInString(String imageInString) {
        this.imageInString = imageInString;
    }

    public boolean isBotSeen() {
        return isBotSeen;
    }

    public void setBotSeen(boolean botSeen) {
        isBotSeen = botSeen;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", text='" + text + '\'' +
                '}';
    }
}
