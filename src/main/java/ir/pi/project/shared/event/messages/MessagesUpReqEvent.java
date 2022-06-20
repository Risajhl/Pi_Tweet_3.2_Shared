package ir.pi.project.shared.event.messages;

import ir.pi.project.shared.enums.others.MessagesUpReqs;
import ir.pi.project.shared.event.Event;
import ir.pi.project.shared.event.EventVisitor;
import ir.pi.project.shared.response.Response;

public class MessagesUpReqEvent extends Event {
    MessagesUpReqs messagesUpReqs;
    public MessagesUpReqEvent(MessagesUpReqs messagesUpReqs){
        this.messagesUpReqs=messagesUpReqs;
    }

    @Override
    public Response visit(EventVisitor eventVisitor) {
        return eventVisitor.messagesUpReqEvent(messagesUpReqs);
    }
}
