package p.xf1;
import java.lang.Enum;
import java.util.concurrent.TimeUnit;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class xf1 extends Enum	// class@002c65 from classes.dex
{
    public final TimeUnit a;
    public static final xf1 b;
    public static final xf1 c;
    public static final xf1 t;
    public static final xf1 v;
    public static final xf1[] w;

    static {
       xf1 oxf1 = new xf1("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
       xf1.b = oxf1;
       xf1 oxf11 = new xf1("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
       xf1.c = oxf11;
       xf1 oxf12 = new xf1("SECONDS", 3, TimeUnit.SECONDS);
       xf1.t = oxf12;
       xf1 oxf13 = new xf1("DAYS", 6, TimeUnit.DAYS);
       xf1.v = oxf13;
       xf1[] oxf1Array = new xf1[]{oxf1,new xf1("MICROSECONDS", 1, TimeUnit.MICROSECONDS),oxf11,oxf12,new xf1("MINUTES", 4, TimeUnit.MINUTES),new xf1("HOURS", 5, TimeUnit.HOURS),oxf13};
       xf1.w = oxf1Array;
    }
    public void xf1(String p0,int p1,TimeUnit p2){
       super(p0, p1);
       this.a = p2;
    }
    public static xf1 valueOf(String p0){
       return Enum.valueOf(xf1.class, p0);
    }
    public static xf1[] values(){
       return xf1.w.clone();
    }
}
