package ir.pi.project.shared.event.otherEvents;

import ir.pi.project.shared.enums.others.TweetComponent;
import ir.pi.project.shared.event.Event;
import ir.pi.project.shared.event.EventVisitor;
import ir.pi.project.shared.response.Response;

public class TweetComponentEvent extends Event {
    TweetComponent tweetComponent;
    public TweetComponentEvent(TweetComponent tweetComponent){
        this.tweetComponent=tweetComponent;
    }
    @Override
    public Response visit(EventVisitor eventVisitor) {
        return eventVisitor.tweetComponentEvent(tweetComponent);
    }
}
