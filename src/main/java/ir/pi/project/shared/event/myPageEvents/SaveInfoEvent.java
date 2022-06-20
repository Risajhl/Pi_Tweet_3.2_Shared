package ir.pi.project.shared.event.myPageEvents;

import ir.pi.project.shared.event.Event;
import ir.pi.project.shared.event.EventVisitor;
import ir.pi.project.shared.response.Response;

public class SaveInfoEvent extends Event {
     String firstName;
     String lastName;
     String userName;
     String email;
     String phoneNumber;
     String birthDate;
     String biography;
     boolean canSee;
     String imageInString;

    public SaveInfoEvent(String firstName,String lastName,String userName,String email,String phoneNumber,String birthDate,String biography,boolean canSee,String imageInString){
        this.firstName=firstName;
        this.lastName=lastName;
        this.userName=userName;
        this.email=email;
        this.phoneNumber=phoneNumber;
        this.birthDate=birthDate;
        this.biography=biography;
        this.canSee=canSee;
        this.imageInString=imageInString;
    }


    @Override
    public Response visit(EventVisitor eventVisitor) {
        return eventVisitor.saveInfoEvent(firstName,lastName,userName,email,phoneNumber,birthDate,biography,canSee,imageInString);
    }
}
