package net.media.training.designpattern.command;

public class DeleteFileCommand implements Command{

    ReceiverFile receiverFile;
    String fileName;

    public DeleteFileCommand(ReceiverFile receiverFile, String fileName) {
        this.receiverFile = receiverFile;
        this.fileName = fileName;
    }

    @Override
    public void execute() {
        receiverFile.delete(fileName);
    }

    @Override
    public void undo() {
        receiverFile.create(fileName,"");
    }
}
