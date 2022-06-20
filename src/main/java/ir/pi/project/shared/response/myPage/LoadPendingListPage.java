package ir.pi.project.shared.response.myPage;

import ir.pi.project.shared.response.Response;
import ir.pi.project.shared.response.ResponseVisitor;

import java.util.List;

public class LoadPendingListPage extends Response {
    List<String> pendingList;
    public LoadPendingListPage(List<String> pendingList){
        this.pendingList=pendingList;
    }
    @Override
    public void visit(ResponseVisitor responseVisitor) {
        responseVisitor.loadPendingListPage(pendingList);
    }
}
