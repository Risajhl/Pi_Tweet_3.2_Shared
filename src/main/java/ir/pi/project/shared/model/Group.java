package ir.pi.project.shared.model;

import java.util.ArrayList;
import java.util.List;

public class Group {
//    static private final Logger logger= LogManager.getLogger(Group.class);

    int id;
    private int owner;
    private String name;
    private List<Integer> members;

    public Group(int id, String name, int ownerId) {
        this.id = id;
        this.name = name;
        this.owner = ownerId;
        this.members = new ArrayList<>();
    }


    public int getId() {
        return id;
    }

    public int getOwner() {
        return owner;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getMembers() {
        return members;
    }


}
