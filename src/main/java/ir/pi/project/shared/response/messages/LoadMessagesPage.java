package ir.pi.project.shared.response.messages;

import ir.pi.project.shared.response.Response;
import ir.pi.project.shared.response.ResponseVisitor;

public class LoadMessagesPage extends Response {
    @Override
    public void visit(ResponseVisitor responseVisitor) {
        responseVisitor.loadMessagesPage();
    }
}
