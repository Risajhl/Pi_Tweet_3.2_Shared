package ir.pi.project.shared.response.settings;

import ir.pi.project.shared.response.Response;
import ir.pi.project.shared.response.ResponseVisitor;

public class LoadDeleteAccountPage extends Response {
    @Override
    public void visit(ResponseVisitor responseVisitor) {
        responseVisitor.loadDeleteAccountPage();
    }
}
