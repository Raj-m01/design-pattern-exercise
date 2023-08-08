package net.media.training.designpattern.decorator;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 10:28:33 AM
 * To change this template use File | Settings | File Templates.
 */
public class GREEval extends GPAEval {
    Criteria exam;

    public GREEval(Criteria exam) {
        this.exam = exam;
    }

    @Override
    public boolean evaluate(Application theApp) {
        System.out.println("GREEval called");
        return this.exam.evaluate(theApp) && theApp.getGre() > 1450;
    }
}
