package ir.pi.project.shared.response.messages.multipleMessaging;

import ir.pi.project.shared.response.Response;
import ir.pi.project.shared.response.ResponseVisitor;

import java.util.List;

public class LoadMultipleToGroupsPage extends Response {
    List<String> groupNames;
    public LoadMultipleToGroupsPage(List<String> groupNames){
        this.groupNames=groupNames;
    }
    @Override
    public void visit(ResponseVisitor responseVisitor) {
        responseVisitor.loadMultipleToGroupsPage(groupNames);
    }
}
