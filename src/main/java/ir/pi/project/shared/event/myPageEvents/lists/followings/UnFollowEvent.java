package ir.pi.project.shared.event.myPageEvents.lists.followings;

import ir.pi.project.shared.event.Event;
import ir.pi.project.shared.event.EventVisitor;
import ir.pi.project.shared.response.Response;

public class UnFollowEvent extends Event {
    String username;
    public UnFollowEvent(String username){
        this.username=username;
    }

    @Override
    public Response visit(EventVisitor eventVisitor) {
        return eventVisitor.unfollowEvent(username);
    }
}
