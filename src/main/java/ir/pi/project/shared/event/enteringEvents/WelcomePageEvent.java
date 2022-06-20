package ir.pi.project.shared.event.enteringEvents;

import ir.pi.project.shared.enums.Pages.WelcomePage;
import ir.pi.project.shared.event.Event;
import ir.pi.project.shared.event.EventVisitor;
import ir.pi.project.shared.response.Response;

public class WelcomePageEvent extends Event {
    WelcomePage welcomePage;
    public WelcomePageEvent(WelcomePage welcomePage){
        this.welcomePage=welcomePage;
    }
    @Override
    public Response visit(EventVisitor eventVisitor) {
        return eventVisitor.welcomePageEvent(welcomePage);
    }
}
