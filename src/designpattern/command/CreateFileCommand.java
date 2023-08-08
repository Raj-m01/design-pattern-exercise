package net.media.training.designpattern.command;


//import java.io.File;
public class CreateFileCommand implements Command{

    private ReceiverFile receiverFile;
    private String fileName, content;

    public CreateFileCommand(ReceiverFile receiverFile, String fileName, String content) {
        this.receiverFile = receiverFile;
        this.fileName = fileName;
        this.content = content;
    }

    @Override
    public void execute() {
        receiverFile.create(fileName,content);
    }

    @Override
    public void undo() {
        receiverFile.delete(fileName);
    }
}
