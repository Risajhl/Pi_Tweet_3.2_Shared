package ir.pi.project.shared.response.myPage.lists;

import ir.pi.project.shared.response.Response;
import ir.pi.project.shared.response.ResponseVisitor;

import java.util.List;
import java.util.Map;

public class LoadRequestsList extends Response {
    Map<String,String> requests;
    public LoadRequestsList(Map<String,String> requests){
        this.requests=requests;
    }
    @Override
    public void visit(ResponseVisitor responseVisitor) {
        responseVisitor.loadRequestsList(requests);
    }
}
