package p.g22;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import p.co5;
import java.lang.Class;
import java.util.Arrays;

public final class g22 extends Enum	// class@001685 from classes.dex
{
    public static final g22 a;
    public static final g22 b;
    public static final g22 c;
    public static final g22 t;
    public static final g22[] v;

    static {
       g22 og22 = new g22("NOT_LOADED", 0);
       g22.a = og22;
       g22 og221 = new g22("LOADING", 1);
       g22.b = og221;
       g22 og222 = new g22("SUCCESS", 2);
       g22.c = og222;
       g22 og223 = new g22("ERROR", 3);
       g22.t = og223;
       g22[] og22Array = new g22[]{og22,og221,og222,og223};
       g22.v = og22Array;
    }
    public void g22(String p0,int p1){
       super(p0, p1);
    }
    public static g22 valueOf(String p0){
       co5.o(p0, "value");
       return Enum.valueOf(g22.class, p0);
    }
    public static g22[] values(){
       return Arrays.copyOf(g22.v, 4);
    }
}
