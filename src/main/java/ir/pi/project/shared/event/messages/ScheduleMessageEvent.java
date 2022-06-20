package ir.pi.project.shared.event.messages;

import ir.pi.project.shared.enums.Pages.MessagesPage;
import ir.pi.project.shared.event.Event;
import ir.pi.project.shared.event.EventVisitor;
import ir.pi.project.shared.response.Response;

import java.time.LocalDateTime;

public class ScheduleMessageEvent extends Event {
    MessagesPage messagesPage;
    LocalDateTime localDateTime;
    String text;
    String imageInString;

    public ScheduleMessageEvent(MessagesPage messagesPage,LocalDateTime localDateTime,String text,String imageInString){
        this.messagesPage=messagesPage;
        this.localDateTime=localDateTime;
        this.text=text;
        this.imageInString=imageInString;
    }

    @Override
    public Response visit(EventVisitor eventVisitor) {
        return eventVisitor.scheduleMessageEvent(messagesPage,localDateTime,text,imageInString);
    }
}
