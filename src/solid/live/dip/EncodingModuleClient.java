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
        EncodingModule encodingModule  = new EncodingModule(new DataFileReader()
                                        , new DataFileWriter()
                                        , new NetworkReader()
                                        , new DatabaseWriter());
        encodingModule.encodeWithFiles();
        encodingModule.encodeBasedOnNetworkAndDatabase();

    }
}
