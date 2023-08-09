package net.media.training.designpattern.abstractfactory;

public interface Phone{

//    It shd include Android and Iphone ke features
    public MotherBoard getMotherBoard();
    public Screen getScreen();
    public Case getCase(MotherBoard motherBoard, Screen screen);


}