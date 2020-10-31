package usantatecla.mastermind;

import usantatecla.mastermind.views.AbstractView;
import usantatecla.mastermind.views.graphics.View;

public class GraphicsMastermind extends Mastermind {

    protected AbstractView createView() {
        return new View();
    }

    @Override
    protected boolean isStandalone() {
        return true;
    }

    public static void main(String[] args) {
        new GraphicsMastermind().play();
    }

}
