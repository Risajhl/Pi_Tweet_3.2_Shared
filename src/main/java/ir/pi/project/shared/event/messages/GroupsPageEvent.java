package ir.pi.project.shared.event.messages;

import ir.pi.project.shared.enums.Pages.GroupsPage;
import ir.pi.project.shared.event.Event;
import ir.pi.project.shared.event.EventVisitor;
import ir.pi.project.shared.response.Response;

public class GroupsPageEvent extends Event {
    GroupsPage groupsPage;
    String string;
    public GroupsPageEvent(GroupsPage groupsPage,String string){
        this.groupsPage=groupsPage;
        this.string=string;
    }
    @Override
    public Response visit(EventVisitor eventVisitor) {
        return eventVisitor.groupsPageEvent(groupsPage,string);
    }
}
