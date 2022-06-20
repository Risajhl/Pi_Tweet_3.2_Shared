package ir.pi.project.shared.response.myPage.lists;

import ir.pi.project.shared.response.Response;
import ir.pi.project.shared.response.ResponseVisitor;

import java.util.List;
import java.util.Map;

public class LoadFollowersList extends Response {
    public Map<String,String> followers;
    public LoadFollowersList(Map<String,String> followers){
        this.followers=followers;
    }

    @Override
    public void visit(ResponseVisitor responseVisitor) {
        responseVisitor.loadFollowersList(followers);
    }
}
