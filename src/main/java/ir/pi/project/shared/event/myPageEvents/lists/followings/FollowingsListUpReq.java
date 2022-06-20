package ir.pi.project.shared.event.myPageEvents.lists.followings;

import ir.pi.project.shared.event.Event;
import ir.pi.project.shared.event.EventVisitor;
import ir.pi.project.shared.response.Response;

public class FollowingsListUpReq extends Event {
    @Override
    public Response visit(EventVisitor eventVisitor) {
        return eventVisitor.followingsListUpReq();
    }
}
