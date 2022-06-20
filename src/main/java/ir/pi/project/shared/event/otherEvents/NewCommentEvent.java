package ir.pi.project.shared.event.otherEvents;

import ir.pi.project.shared.event.Event;
import ir.pi.project.shared.event.EventVisitor;
import ir.pi.project.shared.model.Tweet;
import ir.pi.project.shared.model.User;
import ir.pi.project.shared.response.Response;
import ir.pi.project.shared.response.ResponseVisitor;

public class NewCommentEvent extends Event {
    String text;
    String imageInString;

    public NewCommentEvent(String text,String imageInString){
        this.text=text;
        this.imageInString=imageInString;
    }

    @Override
    public Response visit(EventVisitor eventVisitor) {
        return eventVisitor.newComment(text,imageInString);
    }
}
