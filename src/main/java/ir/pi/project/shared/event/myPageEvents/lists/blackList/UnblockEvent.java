package ir.pi.project.shared.event.myPageEvents.lists.blackList;

import ir.pi.project.shared.event.Event;
import ir.pi.project.shared.event.EventVisitor;
import ir.pi.project.shared.response.Response;

public class UnblockEvent extends Event {
    String username;
    public UnblockEvent(String username){
        this.username=username;
    }
    @Override
    public Response visit(EventVisitor eventVisitor) {
        return eventVisitor.unblock(username);
    }
}
