package ir.pi.project.shared.event.messages;

import ir.pi.project.shared.enums.Pages.ChatPage;
import ir.pi.project.shared.enums.Pages.MessagesPage;
import ir.pi.project.shared.event.Event;
import ir.pi.project.shared.event.EventVisitor;
import ir.pi.project.shared.response.Response;

public class ChatPageEvent extends Event {
    MessagesPage messagesPage;
    ChatPage chatPage;
    String string;
    public ChatPageEvent(MessagesPage messagesPage,ChatPage chatPage,String string){
        this.messagesPage=messagesPage;
        this.chatPage=chatPage;
        this.string=string;
    }
    @Override
    public Response visit(EventVisitor eventVisitor) {
        return eventVisitor.chatPageEvent(messagesPage,chatPage,string);
    }
}
