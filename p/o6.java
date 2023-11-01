package p.o6;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class o6 extends Enum	// class@0020bf from classes.dex
{
    public static final o6 a;
    public static final o6 b;
    public static final o6 c;
    public static final o6 t;
    public static final o6 v;
    public static final o6 w;
    public static final o6 x;
    public static final o6[] y;

    static {
       o6 oo6 = new o6("ACTIVITY_CREATED", 0);
       o6.a = oo6;
       o6 oo61 = new o6("ACTIVITY_STARTED", 1);
       o6.b = oo61;
       o6 oo62 = new o6("ACTIVITY_RESUMED", 2);
       o6.c = oo62;
       o6 oo63 = new o6("ACTIVITY_PAUSED", 3);
       o6.t = oo63;
       o6 oo64 = new o6("ACTIVITY_STOPPED", 4);
       o6.v = oo64;
       o6 oo65 = new o6("ACTIVITY_INSTANCE_SAVED", 5);
       o6.w = oo65;
       o6 oo66 = new o6("ACTIVITY_DESTROYED", 6);
       o6.x = oo66;
       o6[] oo6Array = new o6[]{oo6,oo61,oo62,oo63,oo64,oo65,oo66};
       o6.y = oo6Array;
    }
    public void o6(String p0,int p1){
       super(p0, p1);
    }
    public static o6 valueOf(String p0){
       return Enum.valueOf(o6.class, p0);
    }
    public static o6[] values(){
       return o6.y.clone();
    }
}
