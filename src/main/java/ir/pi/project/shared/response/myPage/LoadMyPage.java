package ir.pi.project.shared.response.myPage;

import ir.pi.project.shared.model.User;
import ir.pi.project.shared.model.help.HelpUser;
import ir.pi.project.shared.response.Response;
import ir.pi.project.shared.response.ResponseVisitor;

public class LoadMyPage extends Response {
    HelpUser helpUser;
    public LoadMyPage(HelpUser helpUser){
        this.helpUser=helpUser;
    }
    @Override
    public void visit(ResponseVisitor responseVisitor) {
        responseVisitor.loadMyPage(helpUser);
    }
}
