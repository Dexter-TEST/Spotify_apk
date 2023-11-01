package p.uj3;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class uj3 extends Enum	// class@0028bf from classes.dex
{
    public static final uj3 a;
    public static final uj3 b;
    public static final uj3 c;
    public static final uj3 t;
    public static final uj3 v;
    public static final uj3[] w;

    static {
       uj3 ouj3 = new uj3("DESTROYED", 0);
       uj3.a = ouj3;
       uj3 ouj31 = new uj3("INITIALIZED", 1);
       uj3.b = ouj31;
       uj3 ouj32 = new uj3("CREATED", 2);
       uj3.c = ouj32;
       uj3 ouj33 = new uj3("STARTED", 3);
       uj3.t = ouj33;
       uj3 ouj34 = new uj3("RESUMED", 4);
       uj3.v = ouj34;
       uj3[] ouj3Array = new uj3[]{ouj3,ouj31,ouj32,ouj33,ouj34};
       uj3.w = ouj3Array;
    }
    public void uj3(String p0,int p1){
       super(p0, p1);
    }
    public static uj3 valueOf(String p0){
       return Enum.valueOf(uj3.class, p0);
    }
    public static uj3[] values(){
       return uj3.w.clone();
    }
    public final boolean a(uj3 p0){
       boolean b = (this.compareTo(p0) >= 0)? true: false;
       return b;
    }
}
