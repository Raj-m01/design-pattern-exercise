package solid.live.dip;


import net.iharder.Base64;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 13, 2011
 * Time: 10:05:38 AM
 * To change this template use File | Settings | File Templates.
 */
public class EncodingModule {

    private final DataFileReader dataFileReader;
    private final DataFileWriter dataFileWriter;
    private final NetworkReader networkReader;
    private final DatabaseWriter databaseWriter;

    public EncodingModule(DataFileReader dataFileReader, DataFileWriter dataFileWriter, NetworkReader networkReader, DatabaseWriter databaseWriter) {
        this.dataFileReader = dataFileReader;
        this.dataFileWriter = dataFileWriter;
        this.networkReader = networkReader;
        this.databaseWriter = databaseWriter;
    }

    public String encode(String inputString) {
        return Base64.encodeBytes(inputString.getBytes());
    }

    public void encodeWithFiles() {
        String inputString = dataFileReader.read("/Users/goyalamit/Sandbox/training/src/solid_2011/live/dip/beforeEncryption.txt");
        dataFileWriter.write(encode(inputString), "/Users/goyalamit/Sandbox/training/src/solid_2011/live/dip/afterEncryption.txt");
    }


    public void encodeBasedOnNetworkAndDatabase() {
        URL url = null;
        try {
            url = new URL("http", "myfirstappwith.appspot.com", "index.html");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        String inputString = networkReader.read(url);
        MyDatabase database = new MyDatabase();
        databaseWriter.write(encode(inputString), database);
    }
}


//    public void encodeWithFiles() {
//        try {
//            BufferedReader reader = new BufferedReader(new FileReader("/Users/goyalamit/Sandbox/training/src/solid_2011/live/dip/beforeEncryption.txt"));
//            BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/goyalamit/Sandbox/training/src/solid_2011/live/dip/afterEncryption.txt"));
//            String aLine;
//            while ((aLine = reader.readLine()) != null) {
//                String encodedLine = Base64.encodeBytes(aLine.getBytes());
//                writer.write(encodedLine);
//            }
//            writer.flush();
//            writer.close();
//            reader.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

//    public void encodeBasedOnNetworkAndDatabase() {
//        URL url = null;
//        try {
//            url = new URL("http", "myfirstappwith.appspot.com", "index.html");
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        }
//        InputStream in = null;
//        try {
//            in = url.openStream();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        InputStreamReader reader = new InputStreamReader(in);
//        StringBuilder inputString1 = new StringBuilder();
//        try {
//            int c;
//            c = reader.read();
//            while (c != -1) {
//                inputString1.append((char) c);
//                c = reader.read();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        String inputString = inputString1.toString();
//        String encodedString = Base64.encodeBytes(inputString.getBytes());
//        MyDatabase database = new MyDatabase();
//        database.write(encodedString);
//    }

