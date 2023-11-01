package p.pv2;
import p.uy2;
import java.lang.Enum;
import p.iv2;
import p.jv2;
import p.kv2;
import p.lv2;
import p.mv2;
import p.nv2;
import p.ov2;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public abstract class pv2 extends Enum implements uy2	// class@0022d9 from classes.dex
{
    public final int a;
    public static final iv2 b;
    public static final lv2 c;
    public static final mv2 t;
    public static final nv2 v;
    public static final ov2 w;
    public static final pv2[] x;
    public static final pv2[] y;

    static {
       iv2 oiv2 = new iv2();
       pv2.b = oiv2;
       lv2 olv2 = new lv2();
       pv2.c = olv2;
       mv2 omv2 = new mv2();
       pv2.t = omv2;
       nv2 onv2 = new nv2();
       pv2.v = onv2;
       ov2 oov2 = new ov2();
       pv2.w = oov2;
       pv2[] opv2Array = new pv2[]{oiv2,new jv2(),new kv2(),olv2,omv2,onv2,oov2};
       pv2.y = opv2Array;
       pv2.x = pv2.values();
    }
    public void pv2(String p0,int p1,int p2){
       super(p0, p1);
       this.a = p2;
    }
    public static pv2 valueOf(String p0){
       return Enum.valueOf(pv2.class, p0);
    }
    public static pv2[] values(){
       return pv2.y.clone();
    }
    public final int getId(){
       return this.a;
    }
}
