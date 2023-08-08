package net.media.training.designpattern.command;

public class MoveFileCommand implements Command{

    private ReceiverFile receiverFile;
    private String source, destination;

    public MoveFileCommand(ReceiverFile receiverFile, String source, String destination) {
        this.receiverFile = receiverFile;
        this.source = source;
        this.destination = destination;
    }

    @Override
    public void execute() {
        receiverFile.move(source, destination);
    }

    @Override
    public void undo() {
        receiverFile.move(destination, source);
    }
}
