package net.media.training.designpattern.command;

import java.util.Stack;

public class FileOperation {
    private Command command;
    private static Stack<Command> executedCommands = new Stack<>();
    public void setCommand(Command command) {
        this.command = command;
    }
    public void operate(){
        executedCommands.push(command);
        command.execute();
    }
    public void undo(){
        if(!executedCommands.isEmpty())
            executedCommands.pop().undo();
    }
}
