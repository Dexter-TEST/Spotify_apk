package p.xx2;
import p.uy2;
import java.lang.Enum;
import p.tx2;
import p.ux2;
import p.vx2;
import p.wx2;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public abstract class xx2 extends Enum implements uy2	// class@002d06 from classes.dex
{
    public final int a;
    public static final tx2 b;
    public static final ux2 c;
    public static final vx2 t;
    public static final wx2 v;
    public static final xx2[] w;
    public static final xx2[] x;

    static {
       tx2 otx2 = new tx2();
       xx2.b = otx2;
       ux2 oux2 = new ux2();
       xx2.c = oux2;
       vx2 ovx2 = new vx2();
       xx2.t = ovx2;
       wx2 owx2 = new wx2();
       xx2.v = owx2;
       xx2[] oxx2Array = new xx2[]{otx2,oux2,ovx2,owx2};
       xx2.x = oxx2Array;
       xx2.w = xx2.values();
    }
    public void xx2(String p0,int p1,int p2){
       super(p0, p1);
       this.a = p2;
    }
    public static xx2 valueOf(String p0){
       return Enum.valueOf(xx2.class, p0);
    }
    public static xx2[] values(){
       return xx2.x.clone();
    }
    public final int getId(){
       return this.a;
    }
}
