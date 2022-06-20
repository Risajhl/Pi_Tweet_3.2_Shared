package ir.pi.project.shared.event.messages;

import ir.pi.project.shared.enums.Pages.MessagesPage;
import ir.pi.project.shared.event.Event;
import ir.pi.project.shared.event.EventVisitor;
import ir.pi.project.shared.response.Response;

public class ShowChatEvent extends Event {
    MessagesPage messagesPage;
    String string;
    public ShowChatEvent(MessagesPage messagesPage,String string){
        this.messagesPage=messagesPage;
        this.string=string;
    }

    @Override
    public Response visit(EventVisitor eventVisitor) {
        return eventVisitor.showChatEvent(messagesPage,string);
    }
}
