package ir.pi.project.shared.response.others;

import ir.pi.project.shared.enums.others.Buttons;
import ir.pi.project.shared.response.Response;
import ir.pi.project.shared.response.ResponseVisitor;

public class LoadButton extends Response {
    Buttons buttons;
    public LoadButton(Buttons buttons){
        this.buttons=buttons;
    }

    @Override
    public void visit(ResponseVisitor responseVisitor) {
        responseVisitor.loadButton(buttons);
    }
}
