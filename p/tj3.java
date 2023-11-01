package p.tj3;
import p.fr0;
import java.lang.Enum;
import p.nj3;
import p.oj3;
import p.pj3;
import p.qj3;
import p.rj3;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import java.lang.StringBuilder;

public abstract class tj3 extends Enum implements fr0	// class@002781 from classes.dex
{
    public static final nj3 a;
    public static final oj3 b;
    public static final pj3 c;
    public static final qj3 t;
    public static final rj3 v;
    public static final tj3[] w;

    static {
       nj3 onj3 = new nj3();
       tj3.a = onj3;
       oj3 ooj3 = new oj3();
       tj3.b = ooj3;
       pj3 opj3 = new pj3();
       tj3.c = opj3;
       qj3 oqj3 = new qj3();
       tj3.t = oqj3;
       rj3 orj3 = new rj3();
       tj3.v = orj3;
       tj3[] otj3Array = new tj3[]{onj3,ooj3,opj3,oqj3,orj3};
       tj3.w = otj3Array;
    }
    public void tj3(String p0,int p1){
       super(p0, p1);
    }
    public static tj3 valueOf(String p0){
       return Enum.valueOf(tj3.class, p0);
    }
    public static tj3[] values(){
       return tj3.w.clone();
    }
    public final String toString(){
       return "Event."+this.name();
    }
}
