package ir.pi.project.shared.response.messages.groupChat;

import ir.pi.project.shared.model.GroupChat;
import ir.pi.project.shared.response.Response;
import ir.pi.project.shared.response.ResponseVisitor;

import java.util.List;
import java.util.Map;

public class LoadGroupChatsListPage extends Response {
    Map<String,Integer>  unreadGroupChats;
    List<String> alreadyReadGroupChats;

    public LoadGroupChatsListPage(Map<String,Integer> unreadGroupChats, List<String> alreadyReadGroupChats){
        this.unreadGroupChats=unreadGroupChats;
        this.alreadyReadGroupChats=alreadyReadGroupChats;
    }
    @Override
    public void visit(ResponseVisitor responseVisitor) {
        responseVisitor.loadGroupChatsListPage(unreadGroupChats,alreadyReadGroupChats);
    }
}
