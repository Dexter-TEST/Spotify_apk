package p.u13;
import p.zf2;
import p.gh2;
import java.lang.Number;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import p.co5;
import java.lang.Float;

public final class u13 extends gh2 implements zf2	// class@002822 from classes.dex
{
    public static final u13 z;

    static {
       u13.z = new u13();
    }
    public void u13(){
       super(1, Number.class, "toFloat", "floatValue\(\)F");
    }
    public final Object invoke(Object p0){
       co5.o(p0, "p0");
       return Float.valueOf(p0.floatValue());
    }
}
