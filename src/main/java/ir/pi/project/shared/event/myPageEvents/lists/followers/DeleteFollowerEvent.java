package ir.pi.project.shared.event.myPageEvents.lists.followers;

import ir.pi.project.shared.event.Event;
import ir.pi.project.shared.event.EventVisitor;
import ir.pi.project.shared.response.Response;

public class DeleteFollowerEvent extends Event {
    String username;
    public DeleteFollowerEvent(String username){
        this.username=username;
    }
    @Override
    public Response visit(EventVisitor eventVisitor) {
        return eventVisitor.deleteFollowerEvent(username);
    }
}
