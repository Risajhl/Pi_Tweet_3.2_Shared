package ir.pi.project.shared.event.otherEvents;

import ir.pi.project.shared.enums.Pages.ExplorerPage;
import ir.pi.project.shared.event.Event;
import ir.pi.project.shared.event.EventVisitor;
import ir.pi.project.shared.response.Response;

public class ExplorerPageEvent extends Event {
    ExplorerPage explorerPage;
    String username;
    public ExplorerPageEvent(ExplorerPage explorerPage,String username){
        this.explorerPage=explorerPage;
        this.username=username;
    }

    @Override
    public Response visit(EventVisitor eventVisitor) {
        return eventVisitor.explorerPageEvent(username,explorerPage);
    }
}
