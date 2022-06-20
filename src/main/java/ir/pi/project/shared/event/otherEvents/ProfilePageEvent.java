package ir.pi.project.shared.event.otherEvents;

import ir.pi.project.shared.enums.Pages.ProfilePage;
import ir.pi.project.shared.event.Event;
import ir.pi.project.shared.event.EventVisitor;
import ir.pi.project.shared.response.Response;

public class ProfilePageEvent extends Event {

    ProfilePage profilePage;

    public ProfilePageEvent(ProfilePage profilePage){
        this.profilePage=profilePage;
    }

    @Override
    public Response visit(EventVisitor eventVisitor) {
        return eventVisitor.profilePageEvent(profilePage);
    }
}
