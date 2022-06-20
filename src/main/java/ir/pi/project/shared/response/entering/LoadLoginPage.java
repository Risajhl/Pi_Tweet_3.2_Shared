package ir.pi.project.shared.response.entering;

import ir.pi.project.shared.response.Response;
import ir.pi.project.shared.response.ResponseVisitor;

public class LoadLoginPage extends Response {
    @Override
    public void visit(ResponseVisitor responseVisitor) {
        responseVisitor.loadLoginPage();
    }
}
