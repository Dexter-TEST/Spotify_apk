package p.d22;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class d22 extends Enum	// class@0012c3 from classes.dex
{
    public static final d22 a;
    public static final d22 b;
    public static final d22 c;
    public static final d22 t;
    public static final d22 v;
    public static final d22 w;
    public static final d22 x;
    public static final d22[] y;

    static {
       d22 uod22 = new d22("UNKNOWN", 0, 0);
       d22.a = uod22;
       d22 uod221 = new d22("BACKGROUND_SYNC", 1, 1);
       d22.b = uod221;
       d22 uod222 = new d22("BLOCKING", 2, 2);
       d22.c = uod222;
       d22 uod223 = new d22("ASYNC", 3, 3);
       d22.t = uod223;
       d22 uod224 = new d22("PUSH_INITIATED", 4, 4);
       d22.v = uod224;
       d22 uod225 = new d22("RECONNECT", 5, 5);
       d22.w = uod225;
       d22 uod226 = new d22("UNRECOGNIZED", 6, -1);
       d22.x = uod226;
       d22[] uod22Array = new d22[]{uod22,uod221,uod222,uod223,uod224,uod225,uod226};
       d22.y = uod22Array;
    }
    public void d22(String p0,int p1,int p2){
       super(p0, p1);
    }
    public static d22 valueOf(String p0){
       return Enum.valueOf(d22.class, p0);
    }
    public static d22[] values(){
       return d22.y.clone();
    }
}
