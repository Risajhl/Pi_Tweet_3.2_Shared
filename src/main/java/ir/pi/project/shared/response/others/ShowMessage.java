package ir.pi.project.shared.response.others;

import ir.pi.project.shared.response.Response;
import ir.pi.project.shared.response.ResponseVisitor;

public class ShowMessage extends Response {
    private String message;

    public ShowMessage(String message) {
        this.message = message;
    }

    @Override
    public void visit(ResponseVisitor responseVisitor) {
        responseVisitor.showMessage(message);
    }
}
