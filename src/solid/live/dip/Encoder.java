package solid.live.dip;

import net.iharder.Base64;

public class Encoder {

    public String encode(String inputString){
        return Base64.encodeBytes(inputString.getBytes());
    }
}
