package net.media.training.designpattern.command;

public class UpdateFileCommand implements Command{

    private ReceiverFile receiverFile;
    private String fileName, newContent, oldContent;

    public UpdateFileCommand(ReceiverFile receiverFile, String fileName, String newContent) {
        this.receiverFile = receiverFile;
        this.fileName = fileName;
        this.newContent = newContent;
        this.oldContent="";
    }

    @Override
    public void execute() {
        oldContent=receiverFile.getFileContent(fileName);
        try {
            receiverFile.update(fileName, newContent);
        }catch (Exception e){
            throw new RuntimeException("ehe");
        }

    }

    @Override
    public void undo() {
        System.out.println("called undo");
        receiverFile.update(fileName, oldContent);
    }
}
