package ir.pi.project.shared.event.messages;

import ir.pi.project.shared.enums.others.NewGroupChat;
import ir.pi.project.shared.event.Event;
import ir.pi.project.shared.event.EventVisitor;
import ir.pi.project.shared.response.Response;

public class NewGroupChatEvent extends Event {
    NewGroupChat newGroupChat;
    String string;
    public NewGroupChatEvent(NewGroupChat newGroupChat,String string){
        this.newGroupChat=newGroupChat;
        this.string=string;
    }
    @Override
    public Response visit(EventVisitor eventVisitor) {
        return eventVisitor.newGroupChatEvent(newGroupChat,string);
    }
}
