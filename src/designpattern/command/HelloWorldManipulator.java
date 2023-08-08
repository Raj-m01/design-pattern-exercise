package net.media.training.designpattern.command;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 20, 2011
 * Time: 4:55:07 PM
 * To change this template use File | Settings | File Templates.
 */
public class HelloWorldManipulator {

    public void fixManipulate(final String fileName, final String newPath) {
//        Invoker
        FileOperation fileOperation = new FileOperation();
//        Receiver
        ReceiverFile receiverFile = new ReceiverFile();
        Command createCommand = new CreateFileCommand(receiverFile, fileName, "hello world");
        Command updateCommand = new UpdateFileCommand(receiverFile, fileName, "new hello world");
        Command moveCommand = new MoveFileCommand(receiverFile, fileName, newPath);

        try {
            fileOperation.setCommand(createCommand);
            fileOperation.operate();

            fileOperation.setCommand(updateCommand);
            fileOperation.operate();

            fileOperation.setCommand(moveCommand);
            fileOperation.operate();
        } catch (Exception e) {
            fileOperation.undo();
        }
    }

    public void brokenManipulate(String fileName, String newPath) {
        FileOperation fileOperation = new FileOperation();
        ReceiverFile receiverFile = new ReceiverFile();
        Command createCommand = new CreateFileCommand(receiverFile, fileName, "hello world");
        Command updateCommand = new UpdateFileCommand(receiverFile, fileName, "new hello world");
        Command moveCommand = new MoveFileCommand(receiverFile, fileName, newPath);


        try {
            fileOperation.setCommand(createCommand);
            fileOperation.operate();

            fileOperation.setCommand(updateCommand);
            fileOperation.operate();

            fileOperation.setCommand(moveCommand);
            fileOperation.operate();

            fileOperation.setCommand(createCommand);
            fileOperation.operate();

            fileOperation.setCommand(createCommand);
            fileOperation.operate();
        } catch (Exception e) {
            fileOperation.undo();
        }


    }

    public static void main(String[] args) {

        HelloWorldManipulator a = new HelloWorldManipulator();
        a.brokenManipulate("asd","dsa");
    }

}