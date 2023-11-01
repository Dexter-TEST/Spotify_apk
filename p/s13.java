package p.s13;
import p.zf2;
import p.gh2;
import java.lang.Number;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import p.co5;
import java.lang.Double;

public final class s13 extends gh2 implements zf2	// class@00259b from classes.dex
{
    public static final s13 z;

    static {
       s13.z = new s13();
    }
    public void s13(){
       super(1, Number.class, "toDouble", "doubleValue\(\)D");
    }
    public final Object invoke(Object p0){
       co5.o(p0, "p0");
       return Double.valueOf(p0.doubleValue());
    }
}
