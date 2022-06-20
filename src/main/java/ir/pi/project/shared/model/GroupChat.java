package ir.pi.project.shared.model;

import java.util.ArrayList;
import java.util.List;

public class GroupChat{
    int id;
    String groupName;
    List<Integer> members;
    List<Integer> messages;
    public GroupChat(int id,String groupName,User groupMaker){
        this.id=id;
        this.groupName=groupName;
        this.members=new ArrayList<>();
        this.messages=new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getGroupName() {
        return groupName;
    }

    public List<Integer> getMembers() {
        return members;
    }

    public List<Integer> getMessages() {
        return messages;
    }
}
