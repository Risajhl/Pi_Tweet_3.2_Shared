package ir.pi.project.shared.response.messages.multipleMessaging;

import ir.pi.project.shared.response.Response;
import ir.pi.project.shared.response.ResponseVisitor;

import java.util.List;

public class LoadMultipleToUsersPage extends Response {
    List<String> usernames;
    public LoadMultipleToUsersPage(List<String> usernames){
        this.usernames=usernames;
    }
    @Override
    public void visit(ResponseVisitor responseVisitor) {
        responseVisitor.loadMultipleToUsersPage(usernames);
    }
}
