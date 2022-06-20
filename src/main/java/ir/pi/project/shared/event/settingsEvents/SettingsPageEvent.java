package ir.pi.project.shared.event.settingsEvents;

import ir.pi.project.shared.enums.Pages.SettingsPage;
import ir.pi.project.shared.event.Event;
import ir.pi.project.shared.event.EventVisitor;
import ir.pi.project.shared.response.Response;

public class SettingsPageEvent extends Event {
    SettingsPage settings;
    public SettingsPageEvent(SettingsPage settings){
        this.settings=settings;
    }

    @Override
    public Response visit(EventVisitor eventVisitor) {
        return eventVisitor.settingsPageEvent(settings);
    }
}
