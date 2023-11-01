package p.c05;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class c05 extends Enum	// class@00116f from classes.dex
{
    public static final c05 a;
    public static final c05 b;
    public static final c05 c;
    public static final c05 t;
    public static final c05 v;
    public static final c05[] w;

    static {
       c05 uoc05 = new c05("DISK_FULL", 0);
       c05.a = uoc05;
       c05 uoc051 = new c05("EXPIRED", 1);
       c05.b = uoc051;
       c05 uoc052 = new c05("TOO_MANY_TRACKS", 2);
       c05.c = uoc052;
       c05 uoc053 = new c05("DEVICE_LIMIT_REACHED", 3);
       c05.t = uoc053;
       c05 uoc054 = new c05("UNKNOWN", 4);
       c05.v = uoc054;
       c05[] uoc05Array = new c05[]{uoc05,uoc051,uoc052,uoc053,uoc054};
       c05.w = uoc05Array;
    }
    public void c05(String p0,int p1){
       super(p0, p1);
    }
    public static c05 valueOf(String p0){
       return Enum.valueOf(c05.class, p0);
    }
    public static c05[] values(){
       return c05.w.clone();
    }
}
