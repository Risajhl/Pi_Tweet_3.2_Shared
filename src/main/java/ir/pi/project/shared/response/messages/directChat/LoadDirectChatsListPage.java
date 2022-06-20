package ir.pi.project.shared.response.messages.directChat;

import ir.pi.project.shared.response.Response;
import ir.pi.project.shared.response.ResponseVisitor;

import java.util.List;
import java.util.Map;

public class LoadDirectChatsListPage extends Response {
    Map<String,Integer> unreadUsernames;
    List<String> alreadyReadUsernames;
    public LoadDirectChatsListPage(Map<String,Integer> unreadUsernames, List<String> alreadyReadUsernames){
        this.unreadUsernames=unreadUsernames;
        this.alreadyReadUsernames=alreadyReadUsernames;
    }
    @Override
    public void visit(ResponseVisitor responseVisitor) {
        responseVisitor.loadDirectChatsListPage(unreadUsernames,alreadyReadUsernames);
    }
}
