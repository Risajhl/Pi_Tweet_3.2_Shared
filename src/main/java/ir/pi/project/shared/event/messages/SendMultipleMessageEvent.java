package ir.pi.project.shared.event.messages;

import ir.pi.project.shared.enums.Pages.MessagesPage;
import ir.pi.project.shared.event.Event;
import ir.pi.project.shared.event.EventVisitor;
import ir.pi.project.shared.response.Response;

public class SendMultipleMessageEvent extends Event {

    MessagesPage messagesPage;
    String text;
    String imageInString;

    public SendMultipleMessageEvent(MessagesPage messagesPage,String text,String imageInString){
        this.messagesPage=messagesPage;
        this.text=text;
        this.imageInString=imageInString;
    }
    @Override
    public Response visit(EventVisitor eventVisitor) {
        return eventVisitor.sendMultipleMessageEvent(messagesPage,text,imageInString);
    }
}
