package ir.pi.project.shared.response.others;

import ir.pi.project.shared.response.Response;
import ir.pi.project.shared.response.ResponseVisitor;

public class LoadExplorerPage extends Response {
    @Override
    public void visit(ResponseVisitor responseVisitor) {
        responseVisitor.loadExplorerPage();
    }
}
