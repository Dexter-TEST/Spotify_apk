package p.x77;
import java.lang.Enum;
import p.v77;
import p.w77;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import java.util.List;

public abstract class x77 extends Enum	// class@002c25 from classes.dex
{
    public static final v77 a;
    public static final w77 b;
    public static final x77[] c;

    static {
       v77 ov77 = new v77();
       x77.a = ov77;
       w77 ow77 = new w77();
       x77.b = ow77;
       x77[] ox77Array = new x77[]{ov77,ow77};
       x77.c = ox77Array;
    }
    public void x77(String p0,int p1){
       super(p0, p1);
    }
    public static x77 valueOf(String p0){
       return Enum.valueOf(x77.class, p0);
    }
    public static x77[] values(){
       return x77.c.clone();
    }
    public abstract float a(List p0,float p1);
}
