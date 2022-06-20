package ir.pi.project.shared.event.settingsEvents;

import ir.pi.project.shared.event.Event;
import ir.pi.project.shared.event.EventVisitor;
import ir.pi.project.shared.response.Response;

public class CheckPassword extends Event {
    String password;

    public CheckPassword(String password){
        this.password=password;
    }

    @Override
    public Response visit(EventVisitor eventVisitor) {
        return eventVisitor.checkPassword(password);
    }
}
