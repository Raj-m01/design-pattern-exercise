package solid.live.dip;

import java.io.*;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 13, 2011
 * Time: 10:20:57 AM
 * To change this template use File | Settings | File Templates.
 */
public class EncodingModuleClient {
    public static void main(String[] args) throws IOException {
        EncodingModule encodingModule  = new EncodingModule();
        BufferedReader reader = new BufferedReader(new FileReader("/Users/raj.maj/Desktop/design pattern tasks/Solid all five/src/solid/live/dip/beforeEncryption.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/raj.maj/Desktop/design pattern tasks/Solid all five/src/solid/live/dip/afterEncryption.txt"));
        encodingModule.encodeWithFiles(reader, writer);
        encodingModule.encodeBasedOnNetworkAndDatabase();
    }
}
