package ir.pi.project.shared.response.messages.groups;

import ir.pi.project.shared.response.Response;
import ir.pi.project.shared.response.ResponseVisitor;

import java.util.List;

public class LoadGroupsPage extends Response {
    List<String> groupNames;
    public LoadGroupsPage(List<String> groupNames){
        this.groupNames=groupNames;
    }
    @Override
    public void visit(ResponseVisitor responseVisitor) {
        responseVisitor.loadGroupsPage(groupNames);
    }
}
