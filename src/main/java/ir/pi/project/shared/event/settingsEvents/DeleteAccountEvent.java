package ir.pi.project.shared.event.settingsEvents;

import ir.pi.project.shared.event.Event;
import ir.pi.project.shared.event.EventVisitor;
import ir.pi.project.shared.response.Response;

public class DeleteAccountEvent extends Event {

    String password;

    public DeleteAccountEvent(String password){
        this.password=password;
    }

    @Override
    public Response visit(EventVisitor eventVisitor) {
        return eventVisitor.deleteAccount(password);
    }
}
