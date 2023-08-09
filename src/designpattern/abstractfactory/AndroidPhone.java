package net.media.training.designpattern.abstractfactory;

public class AndroidPhone implements Phone{

    @Override
    public MotherBoard getMotherBoard() {
        MotherBoard motherBoard;
        motherBoard = new AndroidMotherBoard();
        motherBoard.attachBattery(new Battery());
        motherBoard.attachProcessor(new AndroidProcessor());
        return motherBoard;
    }

    @Override
    public Screen getScreen() {
        Screen screen;
        screen = new AndroidScreen();
        return screen;
    }

    @Override
    public Case getCase(MotherBoard motherBoard, Screen screen) {
        Case phoneCase;
        phoneCase = new AndroidCase();
        phoneCase.attachMotherBoard(motherBoard);
        phoneCase.attachScreen(screen);
        phoneCase.attachScreen(screen);
        return phoneCase;
    }
}
