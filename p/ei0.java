package p.ei0;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class ei0 extends Enum	// class@00148e from classes.dex
{
    public static final ei0 a;
    public static final ei0 b;
    public static final ei0 c;
    public static final ei0 t;
    public static final ei0[] v;

    static {
       ei0 uoei0 = new ei0("Fail", 0);
       ei0.a = uoei0;
       ei0 uoei01 = new ei0("TryConvert", 1);
       ei0.b = uoei01;
       ei0 uoei02 = new ei0("AsNull", 2);
       ei0.c = uoei02;
       ei0 uoei03 = new ei0("AsEmpty", 3);
       ei0.t = uoei03;
       ei0[] uoei0Array = new ei0[]{uoei0,uoei01,uoei02,uoei03};
       ei0.v = uoei0Array;
    }
    public void ei0(String p0,int p1){
       super(p0, p1);
    }
    public static ei0 valueOf(String p0){
       return Enum.valueOf(ei0.class, p0);
    }
    public static ei0[] values(){
       return ei0.v.clone();
    }
}
