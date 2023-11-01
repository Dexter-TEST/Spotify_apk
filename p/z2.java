package p.z2;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class z2 extends Enum	// class@002e78 from classes.dex
{
    public static final z2 a;
    public static final z2 b;
    public static final z2 c;
    public static final z2[] t;

    static {
       z2 oz2 = new z2("ALWAYS_NULL", 0);
       z2.a = oz2;
       z2 oz21 = new z2("CONSTANT", 1);
       z2.b = oz21;
       z2 oz22 = new z2("DYNAMIC", 2);
       z2.c = oz22;
       z2[] oz2Array = new z2[]{oz2,oz21,oz22};
       z2.t = oz2Array;
    }
    public void z2(String p0,int p1){
       super(p0, p1);
    }
    public static z2 valueOf(String p0){
       return Enum.valueOf(z2.class, p0);
    }
    public static z2[] values(){
       return z2.t.clone();
    }
}
