package ir.pi.project.shared.event.otherEvents;

import ir.pi.project.shared.enums.Pages.MainMenuPage;
import ir.pi.project.shared.event.Event;
import ir.pi.project.shared.event.EventVisitor;
import ir.pi.project.shared.response.Response;

public class MainMenuPageEvent extends Event {
    MainMenuPage mainMenuPage;
    public MainMenuPageEvent(MainMenuPage mainMenuPage){
        this.mainMenuPage=mainMenuPage;
    }
    @Override
    public Response visit(EventVisitor eventVisitor) {
       return eventVisitor.mainMenuPageEvent(mainMenuPage);
    }
}
