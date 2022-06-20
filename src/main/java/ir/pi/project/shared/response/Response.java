package ir.pi.project.shared.response;

import ir.pi.project.shared.response.ResponseVisitor;

public abstract class Response {

    public abstract void visit(ResponseVisitor responseVisitor);
}
