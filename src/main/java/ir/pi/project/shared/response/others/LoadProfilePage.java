package ir.pi.project.shared.response.others;

import ir.pi.project.shared.model.User;
import ir.pi.project.shared.model.help.HelpUser;
import ir.pi.project.shared.response.Response;
import ir.pi.project.shared.response.ResponseVisitor;

public class LoadProfilePage extends Response {
    HelpUser user;
    String followButtonText,muteButtonText,blockButtonText,
            followingStateText,blockStateText,lastSeenText;

    public LoadProfilePage(HelpUser user,String followButtonText,String blockButtonText,String muteButtonText,String blockStateText,String followingStateText,String lastSeenText){
        this.user=user;
        this.followButtonText=followButtonText;
        this.muteButtonText=muteButtonText;
        this.blockButtonText=blockButtonText;
        this.followingStateText=followingStateText;
        this.blockStateText=blockStateText;
        this.lastSeenText=lastSeenText;
    }

    @Override
    public void visit(ResponseVisitor responseVisitor) {
        responseVisitor.loadProfilePage(user,followButtonText,blockButtonText,muteButtonText,blockStateText,followingStateText,lastSeenText);
    }
}
