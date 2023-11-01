package p.bb2;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import p.co5;
import java.lang.Class;
import java.util.Arrays;

public final class bb2 extends Enum	// class@00108e from classes.dex
{
    public static final bb2 a;
    public static final bb2 b;
    public static final bb2 c;
    public static final bb2 t;
    public static final bb2[] v;

    static {
       bb2 uobb2 = new bb2("EXPLICIT", 0);
       bb2.a = uobb2;
       bb2 uobb21 = new bb2("TIMER", 1);
       bb2.b = uobb21;
       bb2 uobb22 = new bb2("EVENT_THRESHOLD", 4);
       bb2.c = uobb22;
       bb2 uobb23 = new bb2("EAGER_FLUSHING_EVENT", 5);
       bb2.t = uobb23;
       bb2[] uobb2Array = new bb2[]{uobb2,uobb21,new bb2("SESSION_CHANGE", 2),new bb2("PERSISTED_EVENTS", 3),uobb22,uobb23};
       bb2.v = uobb2Array;
    }
    public void bb2(String p0,int p1){
       super(p0, p1);
    }
    public static bb2 valueOf(String p0){
       co5.o(p0, "value");
       return Enum.valueOf(bb2.class, p0);
    }
    public static bb2[] values(){
       return Arrays.copyOf(bb2.v, 6);
    }
}
