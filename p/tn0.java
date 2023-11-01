package p.tn0;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class tn0 extends Enum	// class@0027a2 from classes.dex
{
    public static final tn0 a;
    public static final tn0[] b;

    static {
       tn0 otn0 = new tn0("NO_STABLE_IDS", 0);
       tn0.a = otn0;
       tn0[] otn0Array = new tn0[]{otn0,new tn0("ISOLATED_STABLE_IDS", 1),new tn0("SHARED_STABLE_IDS", 2)};
       tn0.b = otn0Array;
    }
    public void tn0(String p0,int p1){
       super(p0, p1);
    }
    public static tn0 valueOf(String p0){
       return Enum.valueOf(tn0.class, p0);
    }
    public static tn0[] values(){
       return tn0.b.clone();
    }
}
