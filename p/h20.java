package p.h20;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class h20 extends Enum	// class@0017c5 from classes.dex
{
    public static final h20 a;
    public static final h20 b;
    public static final h20 c;
    public static final h20 t;
    public static final h20 v;
    public static final h20 w;
    public static final h20[] x;

    static {
       h20 oh20 = new h20("UNKNOWN", 0);
       h20.a = oh20;
       h20 oh201 = new h20("BEST_MATCHING", 1);
       h20.b = oh201;
       h20 oh202 = new h20("BACKEND_ADVISED", 2);
       h20.c = oh202;
       h20 oh203 = new h20("OFFLINED_FILE", 3);
       h20.t = oh203;
       h20 oh204 = new h20("CACHED_FILE", 4);
       h20.v = oh204;
       h20 oh205 = new h20("LOCAL_FILE", 5);
       h20.w = oh205;
       h20[] oh20Array = new h20[]{oh20,oh201,oh202,oh203,oh204,oh205};
       h20.x = oh20Array;
    }
    public void h20(String p0,int p1){
       super(p0, p1);
    }
    public static h20 valueOf(String p0){
       return Enum.valueOf(h20.class, p0);
    }
    public static h20[] values(){
       return h20.x.clone();
    }
}
