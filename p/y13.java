package p.y13;
import p.zf2;
import p.gh2;
import java.lang.Number;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import p.co5;
import java.lang.Long;

public final class y13 extends gh2 implements zf2	// class@002d2c from classes.dex
{
    public static final y13 z;

    static {
       y13.z = new y13();
    }
    public void y13(){
       super(1, Number.class, "toLong", "longValue\(\)J");
    }
    public final Object invoke(Object p0){
       co5.o(p0, "p0");
       return Long.valueOf(p0.longValue());
    }
}
