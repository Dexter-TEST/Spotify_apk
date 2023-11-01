package p.dg3;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class dg3 extends Enum	// class@00133f from classes.dex
{
    public static final dg3 a;
    public static final dg3 b;
    public static final dg3 c;
    public static final dg3 t;
    public static final dg3 v;
    public static final dg3[] w;

    static {
       dg3 uodg3 = new dg3("INT", 0);
       dg3.a = uodg3;
       dg3 uodg31 = new dg3("LONG", 1);
       dg3.b = uodg31;
       dg3 uodg32 = new dg3("BIG_INTEGER", 2);
       dg3.c = uodg32;
       dg3 uodg33 = new dg3("FLOAT", 3);
       dg3.t = uodg33;
       dg3 uodg34 = new dg3("DOUBLE", 4);
       dg3.v = uodg34;
       dg3[] uodg3Array = new dg3[]{uodg3,uodg31,uodg32,uodg33,uodg34,new dg3("BIG_DECIMAL", 5)};
       dg3.w = uodg3Array;
    }
    public void dg3(String p0,int p1){
       super(p0, p1);
    }
    public static dg3 valueOf(String p0){
       return Enum.valueOf(dg3.class, p0);
    }
    public static dg3[] values(){
       return dg3.w.clone();
    }
}
