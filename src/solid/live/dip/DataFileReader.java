package solid.live.dip;

import net.iharder.Base64;

import java.io.*;

public class DataFileReader implements Reader<String>{
    @Override
    public String read(String stuff) {
        String aLine;
        StringBuilder inputString = new StringBuilder();
        try {
            BufferedReader fileReader = new BufferedReader(new FileReader(stuff));
            while ((aLine = fileReader.readLine()) != null) {
                inputString.append(aLine);
            }
            fileReader.close();
        } catch (IOException e){
            e.printStackTrace();
        }
        return inputString.toString();
    }
}
