package ir.pi.project.shared.response.others;

import ir.pi.project.shared.response.Response;
import ir.pi.project.shared.response.ResponseVisitor;

public class LoadMainMenu extends Response {
    int authToken;

    public LoadMainMenu(int authToken){ this.authToken=authToken; }

    @Override
    public void visit(ResponseVisitor responseVisitor) {
        responseVisitor.loadMainMenu(authToken);
    }
}
