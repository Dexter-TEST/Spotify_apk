package p.nh0;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import p.co5;
import java.lang.Class;
import java.util.Arrays;

public final class nh0 extends Enum	// class@001fd7 from classes.dex
{
    public static final nh0 a;
    public static final nh0 b;
    public static final nh0[] c;

    static {
       nh0 onh0 = new nh0("S256", 0);
       nh0.a = onh0;
       nh0 onh01 = new nh0("PLAIN", 1);
       nh0.b = onh01;
       nh0[] onh0Array = new nh0[]{onh0,onh01};
       nh0.c = onh0Array;
    }
    public void nh0(String p0,int p1){
       super(p0, p1);
    }
    public static nh0 valueOf(String p0){
       co5.o(p0, "value");
       return Enum.valueOf(nh0.class, p0);
    }
    public static nh0[] values(){
       return Arrays.copyOf(nh0.c, 2);
    }
}
