package p.x13;
import p.zf2;
import p.gh2;
import java.lang.Number;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import p.co5;
import java.lang.Integer;

public final class x13 extends gh2 implements zf2	// class@002bea from classes.dex
{
    public static final x13 z;

    static {
       x13.z = new x13();
    }
    public void x13(){
       super(1, Number.class, "toInt", "intValue\(\)I");
    }
    public final Object invoke(Object p0){
       co5.o(p0, "p0");
       return Integer.valueOf(p0.intValue());
    }
}
