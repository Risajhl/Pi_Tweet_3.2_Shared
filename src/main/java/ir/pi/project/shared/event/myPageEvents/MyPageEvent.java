package ir.pi.project.shared.event.myPageEvents;

import ir.pi.project.shared.enums.Pages.MyPage;
import ir.pi.project.shared.event.Event;
import ir.pi.project.shared.event.EventVisitor;
import ir.pi.project.shared.response.Response;

public class MyPageEvent extends Event {
    MyPage myPage;
    public MyPageEvent(MyPage myPage){
        this.myPage=myPage;
    }
    @Override
    public Response visit(EventVisitor eventVisitor) {
        return eventVisitor.myPageEvent(myPage);
    }
}
