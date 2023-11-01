package p.ks0;
import java.lang.Object;
import java.lang.String;
import p.o11;
import java.util.Map;
import java.util.Collections;
import p.m73;
import java.lang.NullPointerException;

public abstract class ks0	// class@001c70 from classes.dex
{

    public void ks0(){
       super();
    }
    public static o11 a(String p0){
       o11 oo11 = new o11(27);
       if (p0 == null) {
          throw new NullPointerException("Null uri");
       }
       oo11.b = p0;
       oo11.s("");
       oo11.t = m73.b(Collections.emptyMap());
       return oo11;
    }
}
