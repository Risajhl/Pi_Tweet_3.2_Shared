package ir.pi.project.shared.response.settings;

import ir.pi.project.shared.model.User;
import ir.pi.project.shared.model.help.HelpUser;
import ir.pi.project.shared.response.Response;
import ir.pi.project.shared.response.ResponseVisitor;

public class LoadPrivacySettingsPage extends Response {
    HelpUser helpUser;
    public LoadPrivacySettingsPage(HelpUser helpUser){
        this.helpUser=helpUser;
    }
    @Override
    public void visit(ResponseVisitor responseVisitor) {
        responseVisitor.loadPrivacySettingsPage(helpUser);
    }
}
