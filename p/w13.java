package p.w13;
import p.zf2;
import p.gh2;
import java.lang.Number;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import p.co5;
import java.lang.Integer;

public final class w13 extends gh2 implements zf2	// class@002aa7 from classes.dex
{
    public static final w13 z;

    static {
       w13.z = new w13();
    }
    public void w13(){
       super(1, Number.class, "toInt", "intValue\(\)I");
    }
    public final Object invoke(Object p0){
       co5.o(p0, "p0");
       return Integer.valueOf(p0.intValue());
    }
}
