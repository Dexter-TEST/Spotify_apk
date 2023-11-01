package p.lo6;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class lo6 extends Enum	// class@001d93 from classes.dex
{
    public static final lo6 a;
    public static final lo6 b;
    public static final lo6 c;
    public static final lo6[] t;

    static {
       lo6 olo6 = new lo6("NONE", 0);
       lo6.a = olo6;
       lo6 olo61 = new lo6("ADDING", 1);
       lo6.b = olo61;
       lo6 olo62 = new lo6("REMOVING", 2);
       lo6.c = olo62;
       lo6[] olo6Array = new lo6[]{olo6,olo61,olo62};
       lo6.t = olo6Array;
    }
    public void lo6(String p0,int p1){
       super(p0, p1);
    }
    public static lo6 valueOf(String p0){
       return Enum.valueOf(lo6.class, p0);
    }
    public static lo6[] values(){
       return lo6.t.clone();
    }
}
