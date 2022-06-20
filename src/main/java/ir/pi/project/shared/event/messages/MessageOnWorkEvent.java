package ir.pi.project.shared.event.messages;

import ir.pi.project.shared.enums.others.MessageOnWork;
import ir.pi.project.shared.event.Event;
import ir.pi.project.shared.event.EventVisitor;
import ir.pi.project.shared.response.Response;

public class MessageOnWorkEvent extends Event {
    MessageOnWork messageOnWork;
    int messageId;
    public MessageOnWorkEvent(MessageOnWork messageOnWork,int messageId){
        this.messageOnWork=messageOnWork;
        this.messageId=messageId;
    }
    @Override
    public Response visit(EventVisitor eventVisitor) {
        return eventVisitor.messageOnWorkEvent(messageOnWork,messageId);
    }
}
