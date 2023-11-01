package p.pv3;
import java.lang.Enum;
import p.nv3;
import p.ov3;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public abstract class pv3 extends Enum	// class@0022da from classes.dex
{
    public static final nv3 a;
    public static final pv3[] b;

    static {
       nv3 onv3 = new nv3();
       pv3.a = onv3;
       pv3[] opv3Array = new pv3[]{onv3,new ov3()};
       pv3.b = opv3Array;
    }
    public void pv3(String p0,int p1){
       super(p0, p1);
    }
    public static pv3 valueOf(String p0){
       return Enum.valueOf(pv3.class, p0);
    }
    public static pv3[] values(){
       return pv3.b.clone();
    }
}
