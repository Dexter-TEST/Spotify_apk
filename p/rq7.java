package p.rq7;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class rq7 extends Enum	// class@00253e from classes.dex
{
    public static final rq7 a;
    public static final rq7 b;
    public static final rq7 c;
    public static final rq7 t;
    public static final rq7 v;
    public static final rq7 w;
    public static final rq7[] x;

    static {
       rq7 orq7 = new rq7("ENQUEUED", 0);
       rq7.a = orq7;
       rq7 orq71 = new rq7("RUNNING", 1);
       rq7.b = orq71;
       rq7 orq72 = new rq7("SUCCEEDED", 2);
       rq7.c = orq72;
       rq7 orq73 = new rq7("FAILED", 3);
       rq7.t = orq73;
       rq7 orq74 = new rq7("BLOCKED", 4);
       rq7.v = orq74;
       rq7 orq75 = new rq7("CANCELLED", 5);
       rq7.w = orq75;
       rq7[] orq7Array = new rq7[]{orq7,orq71,orq72,orq73,orq74,orq75};
       rq7.x = orq7Array;
    }
    public void rq7(String p0,int p1){
       super(p0, p1);
    }
    public static rq7 valueOf(String p0){
       return Enum.valueOf(rq7.class, p0);
    }
    public static rq7[] values(){
       return rq7.x.clone();
    }
    public final boolean a(){
       boolean b = (this != rq7.c && (this != rq7.t && this != rq7.w))? false: true;
       return b;
    }
}
