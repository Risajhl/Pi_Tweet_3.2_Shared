package ir.pi.project.shared.response.messages.groupChat;

import ir.pi.project.shared.response.Response;
import ir.pi.project.shared.response.ResponseVisitor;

import java.util.List;

public class LoadNewGroupChatPage extends Response {
    List<String > usernames;
    public LoadNewGroupChatPage(List<String > usernames){
        this.usernames=usernames;
    }
    @Override
    public void visit(ResponseVisitor responseVisitor) {
        responseVisitor.loadNewGroupChatPage(usernames);
    }
}
