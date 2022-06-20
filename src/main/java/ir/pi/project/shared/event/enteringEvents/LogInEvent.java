package ir.pi.project.shared.event.enteringEvents;


import ir.pi.project.shared.event.Event;
import ir.pi.project.shared.event.EventVisitor;
import ir.pi.project.shared.response.Response;

public class LogInEvent extends Event {
    String username,password;
    public LogInEvent(String username, String password){
        this.username=username;
        this.password=password;
    }
    @Override
    public Response visit(EventVisitor eventVisitor) {
        return eventVisitor.logIn(username,password);
    }
}