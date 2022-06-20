package ir.pi.project.shared.event.myPageEvents;

import ir.pi.project.shared.event.Event;
import ir.pi.project.shared.event.EventVisitor;
import ir.pi.project.shared.response.Response;

public class ForwardTweetEvent extends Event {
    String username;
    public ForwardTweetEvent(String username){
        this.username=username;
    }
    @Override
    public Response visit(EventVisitor eventVisitor) {
        return eventVisitor.forwardTweetEvent(username);
    }
}
