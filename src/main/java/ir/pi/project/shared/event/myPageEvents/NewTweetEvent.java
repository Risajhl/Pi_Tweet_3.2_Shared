package ir.pi.project.shared.event.myPageEvents;

import ir.pi.project.shared.event.Event;
import ir.pi.project.shared.event.EventVisitor;
import ir.pi.project.shared.response.Response;

public class NewTweetEvent extends Event{
    String text;
    String imageInString;
    public NewTweetEvent(String text,String imageInString){
        this.text=text;
        this.imageInString=imageInString;
    }
    public Response visit(EventVisitor eventVisitor) {
       return eventVisitor.newTweet(text,imageInString);
    }
}
