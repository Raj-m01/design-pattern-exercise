package net.media.training.designpattern.abstractfactory;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 6:34:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class PhoneMaker {

    public Case buildPhone(String phoneType) {
        MotherBoard motherBoard;
        Screen screen;
        Case phoneCase;
        if (phoneType.equals("Android")) {
            AndroidPhone android=new AndroidPhone();
            motherBoard=android.MotherBoard();
            screen = android.Screen();
            phoneCase=android.Case(motherBoard,screen);

        } else {
            Iphone iphone=new Iphone();
            motherBoard=iphone.MotherBoard();
            screen = iphone.Screen();
            phoneCase=iphone.Case(motherBoard,screen);


        }
        return phoneCase;


    }
}
