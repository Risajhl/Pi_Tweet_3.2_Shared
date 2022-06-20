package ir.pi.project.shared.event.settingsEvents;

import ir.pi.project.shared.event.Event;
import ir.pi.project.shared.event.EventVisitor;
import ir.pi.project.shared.response.Response;

public class SavePrivacySettingsEvent extends Event {

    boolean isActive,isPublic;
    String lastSeen,password;

    public SavePrivacySettingsEvent(boolean isActive,boolean isPublic,String lastSeen,String password){
        this.isActive=isActive;
        this.isPublic=isPublic;
        this.lastSeen=lastSeen;
        this.password=password;
    }

    @Override
    public Response visit(EventVisitor eventVisitor) {
        return eventVisitor.savePrivacySettingsEvent(isActive,isPublic,lastSeen,password);
    }
}
