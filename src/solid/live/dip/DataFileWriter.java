package solid.live.dip;

import net.iharder.Base64;

import java.io.*;

public class DataFileWriter implements Writer<String>{
    @Override
    public void write(String text, String filePath) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
            writer.write(text);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
