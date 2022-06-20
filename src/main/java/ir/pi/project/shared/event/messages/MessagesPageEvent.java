package ir.pi.project.shared.event.messages;

import ir.pi.project.shared.enums.Pages.MessagesPage;
import ir.pi.project.shared.event.Event;
import ir.pi.project.shared.event.EventVisitor;
import ir.pi.project.shared.response.Response;

public class MessagesPageEvent extends Event {
    MessagesPage messagesPage;
    public MessagesPageEvent(MessagesPage messagesPage){
        this.messagesPage=messagesPage;
    }
    @Override
    public Response visit(EventVisitor eventVisitor) {
        return eventVisitor.messagesPageEvent(messagesPage);
    }
}
