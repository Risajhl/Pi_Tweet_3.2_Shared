package ir.pi.project.shared.response.messages.groups;

import ir.pi.project.shared.response.Response;
import ir.pi.project.shared.response.ResponseVisitor;

import java.util.List;

public class LoadEditGroupPage extends Response {
    List<String> usernames;
    public LoadEditGroupPage(List<String> usernames){
        this.usernames=usernames;
    }
    @Override
    public void visit(ResponseVisitor responseVisitor) {
        responseVisitor.loadEditGroupPage(usernames);
    }
}
