package ir.pi.project.shared.response.myPage.lists;

import ir.pi.project.shared.response.Response;
import ir.pi.project.shared.response.ResponseVisitor;

import java.util.List;
import java.util.Map;

public class LoadFollowingsList extends Response {
    Map<String,String> followings;
    public LoadFollowingsList(Map<String,String> followings){
        this.followings=followings;
    }

    @Override
    public void visit(ResponseVisitor responseVisitor) {
        responseVisitor.loadFollowingsList(followings);
    }
}
