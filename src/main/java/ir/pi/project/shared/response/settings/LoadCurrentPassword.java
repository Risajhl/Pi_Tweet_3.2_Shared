package ir.pi.project.shared.response.settings;

import ir.pi.project.shared.response.Response;
import ir.pi.project.shared.response.ResponseVisitor;

public class LoadCurrentPassword extends Response {
    @Override
    public void visit(ResponseVisitor responseVisitor) {
        responseVisitor.loadCurrentPassword();
    }
}
