package p.nx1;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class nx1 extends Enum	// class@002067 from classes.dex
{
    public static final nx1 a;
    public static final nx1 b;
    public static final nx1 c;
    public static final nx1 t;
    public static final nx1[] v;

    static {
       nx1 onx1 = new nx1("REPLACE", 0);
       nx1.a = onx1;
       nx1 onx11 = new nx1("KEEP", 1);
       nx1.b = onx11;
       nx1 onx12 = new nx1("APPEND", 2);
       nx1.c = onx12;
       nx1 onx13 = new nx1("APPEND_OR_REPLACE", 3);
       nx1.t = onx13;
       nx1[] onx1Array = new nx1[]{onx1,onx11,onx12,onx13};
       nx1.v = onx1Array;
    }
    public void nx1(String p0,int p1){
       super(p0, p1);
    }
    public static nx1 valueOf(String p0){
       return Enum.valueOf(nx1.class, p0);
    }
    public static nx1[] values(){
       return nx1.v.clone();
    }
}
