package ir.pi.project.shared.response.myPage.lists;

import ir.pi.project.shared.response.Response;
import ir.pi.project.shared.response.ResponseVisitor;

import java.util.List;
import java.util.Map;

public class LoadBlackList extends Response {
    Map<String,String> blackList;
    public LoadBlackList(Map<String,String> blackList){
        this.blackList=blackList;
    }
    @Override
    public void visit(ResponseVisitor responseVisitor) {
        responseVisitor.loadBlackList(blackList);
    }
}
