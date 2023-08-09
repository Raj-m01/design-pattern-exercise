package net.media.training.designpattern.abstractfactory;

public class Iphone implements Phone{
    @Override
    public MotherBoard getMotherBoard() {
        MotherBoard motherBoard;
        motherBoard = new IphoneMotherBoard();
        motherBoard.attachBattery(new Battery());
        motherBoard.attachProcessor(new IphoneProcessor());
        return motherBoard;
    }

    @Override
    public Screen getScreen() {
        Screen screen;
        screen = new IphoneScreen();
        return screen;
    }

    @Override
    public Case getCase(MotherBoard motherBoard, Screen screen) {
        Case phoneCase;
        phoneCase = new IphoneCase();
        phoneCase.attachMotherBoard(motherBoard);
        phoneCase.attachScreen(screen);
        return phoneCase;
    }
}
