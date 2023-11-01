package p.g20;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.util.List;
import p.uk;
import java.lang.Class;

public final class g20 extends Enum	// class@001683 from classes.dex
{
    public final int a;
    public static final g20 b;
    public static final g20 c;
    public static final g20 t;
    public static final g20 v;
    public static final g20[] w;

    static {
       g20 og20 = new g20("LOW", 1, 1);
       g20.b = og20;
       g20 og201 = new g20("MEDIUM", 2, 2);
       g20.c = og201;
       g20 og202 = new g20("HIGH", 3, 3);
       g20.t = og202;
       g20 og203 = new g20("VERY_HIGH", 4, 4);
       g20.v = og203;
       g20[] og20Array = new g20[]{new g20("AUTO", 0, 0),og20,og201,og202,og203};
       g20.w = og20Array;
       uk.t0(g20.values());
    }
    public void g20(String p0,int p1,int p2){
       this.a = p2;
    }
    public static g20 valueOf(String p0){
       return Enum.valueOf(g20.class, p0);
    }
    public static g20[] values(){
       return g20.w.clone();
    }
}
