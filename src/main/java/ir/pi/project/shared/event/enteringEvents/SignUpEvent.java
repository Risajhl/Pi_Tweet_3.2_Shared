package ir.pi.project.shared.event.enteringEvents;


import ir.pi.project.shared.event.Event;
import ir.pi.project.shared.event.EventVisitor;
import ir.pi.project.shared.response.Response;

public class SignUpEvent extends Event {
    String firstName,lastName,userName,password,email,phoneNumber,birthDate;
    boolean EPBCanSee;

    public SignUpEvent(String firstName, String lastName, String userName, String password, String email, String phoneNumber, String birthDate, boolean EPBCanSee){
        this.firstName=firstName;
        this.lastName=lastName;
        this.userName=userName;
        this.password=password;
        this.email=email;
        this.phoneNumber=phoneNumber;
        this.birthDate=birthDate;
        this.EPBCanSee=EPBCanSee;
    }

    @Override
    public Response visit(EventVisitor eventVisitor) {
        return eventVisitor.signUp(firstName,lastName,userName,password,email,password,birthDate,EPBCanSee);
    }
}
