package p.nt0;
import java.lang.String;
import java.lang.Object;
import java.util.List;
import java.util.Arrays;
import p.lq5;
import java.util.Map;
import java.util.Collections;
import p.m73;
import java.lang.NullPointerException;

public abstract class nt0	// class@002042 from classes.dex
{

    static {
       String[] stringArray = new String[]{"spotify:meta:delimiter","spotify:delimiter"};
       Arrays.asList(stringArray);
    }
    public void nt0(){
       super();
    }
    public static lq5 a(String p0){
       lq5 olq5 = new lq5(11);
       if (p0 == null) {
          throw new NullPointerException("Null uri");
       }
       olq5.b = p0;
       olq5.l("");
       olq5.t = m73.b(Collections.emptyMap());
       olq5.v = "";
       return olq5;
    }
}
