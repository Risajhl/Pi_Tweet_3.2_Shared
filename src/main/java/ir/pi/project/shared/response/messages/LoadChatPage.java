package ir.pi.project.shared.response.messages;

import ir.pi.project.shared.model.Message;
import ir.pi.project.shared.model.help.HelpMessage;
import ir.pi.project.shared.response.Response;
import ir.pi.project.shared.response.ResponseVisitor;

import java.util.List;

public class LoadChatPage extends Response {
    List<HelpMessage> helpMessageList;
    String name;
    boolean isDirect;
    int myId;
    public LoadChatPage(List<HelpMessage> helpMessageList,String name,boolean isDirect, int myId){
        this.helpMessageList=helpMessageList;
        this.name=name;
        this.isDirect=isDirect;
        this.myId=myId;
    }
    @Override
    public void visit(ResponseVisitor responseVisitor) {
        responseVisitor.loadChatPage(helpMessageList,name,isDirect,myId);
    }
}
