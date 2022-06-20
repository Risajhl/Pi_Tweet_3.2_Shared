package ir.pi.project.shared.event.myPageEvents.lists.requests;

import ir.pi.project.shared.enums.others.RequestComponent;
import ir.pi.project.shared.event.Event;
import ir.pi.project.shared.event.EventVisitor;
import ir.pi.project.shared.response.Response;

public class RequestComponentEvent extends Event {
    RequestComponent requestComponent;
    String username;
    public RequestComponentEvent(String username,RequestComponent requestComponent){
        this.username=username;
        this.requestComponent=requestComponent;
    }
    @Override
    public Response visit(EventVisitor eventVisitor) {
        return eventVisitor.requestComponentEvent(username,requestComponent);
    }
}
