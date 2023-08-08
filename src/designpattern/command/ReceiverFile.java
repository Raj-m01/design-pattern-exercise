package net.media.training.designpattern.command;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;

public class ReceiverFile {

//    public File(String fileName) {
//        super(fileName);
//    }

    public void create(String fileName, String content) {
        File file = new File(fileName);
        if (file.exists())
            throw new RuntimeException("File already exist");
        try {
            file.createNewFile();
            PrintWriter writer = new PrintWriter(file);
            writer.write(content);
            writer.close();
            System.out.println("File created :"+fileName+" "+content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void update(String fileName, String content){
        File file = new File(fileName);
        if (!file.exists())
            throw new RuntimeException("File: " + fileName + " does not exist");
        try {
            String data = Files.readString(file.toPath());
            PrintWriter writer = new PrintWriter(file);
            writer.write(content);
            writer.close();
            System.out.println("file update: "+fileName+"\n old:"+data+" new:"+content);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void delete(String fileName) {
        File file = new File(fileName);
        file.delete();
        System.out.println("file deleted: "+fileName);
    }

    public void move(String source, String destination) {
        File file = new File(source);
        if (!file.exists())
            throw new RuntimeException("File does not exist");
        if (!file.renameTo(new File(destination)))
            throw new RuntimeException("Rename failed");
        System.out.println("file moved: "+source+" to "+destination);
    }

    public String getFileContent(String fileName){
        File file = new File(fileName);
        if (!file.exists())
            throw new RuntimeException("File: " + fileName + " does not exist");
        String data="";
        try {
            data = Files.readString(file.toPath());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return data;
    }
}
