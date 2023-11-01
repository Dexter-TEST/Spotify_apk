package p.z13;
import p.zf2;
import p.gh2;
import java.lang.Number;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import p.co5;
import java.lang.Long;

public final class z13 extends gh2 implements zf2	// class@002e6a from classes.dex
{
    public static final z13 z;

    static {
       z13.z = new z13();
    }
    public void z13(){
       super(1, Number.class, "toLong", "longValue\(\)J");
    }
    public final Object invoke(Object p0){
       co5.o(p0, "p0");
       return Long.valueOf(p0.longValue());
    }
}
