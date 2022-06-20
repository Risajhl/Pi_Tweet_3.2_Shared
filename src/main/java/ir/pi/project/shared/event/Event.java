package ir.pi.project.shared.event;

import ir.pi.project.shared.response.Response;
import ir.pi.project.shared.event.EventVisitor;

public abstract class Event {
    protected int authToken;

    public void setAuthToken(int authToken) {
        this.authToken = authToken;
    }

    public int getAuthToken() { return authToken; }

    public abstract Response visit(EventVisitor eventVisitor);
}
