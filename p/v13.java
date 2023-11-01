package p.v13;
import p.zf2;
import p.gh2;
import java.lang.Number;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import p.co5;
import java.lang.Float;

public final class v13 extends gh2 implements zf2	// class@002960 from classes.dex
{
    public static final v13 z;

    static {
       v13.z = new v13();
    }
    public void v13(){
       super(1, Number.class, "toFloat", "floatValue\(\)F");
    }
    public final Object invoke(Object p0){
       co5.o(p0, "p0");
       return Float.valueOf(p0.floatValue());
    }
}
