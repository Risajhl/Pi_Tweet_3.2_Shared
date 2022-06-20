package ir.pi.project.shared.response.myPage;

import ir.pi.project.shared.response.Response;
import ir.pi.project.shared.response.ResponseVisitor;

import java.util.List;

public class LoadNotificationsPage extends Response {
    List<String> notifications;
    public LoadNotificationsPage(List<String> notifications){
        this.notifications=notifications;
    }
    @Override
    public void visit(ResponseVisitor responseVisitor) {
        responseVisitor.loadNotificationsPage(notifications);
    }
}
