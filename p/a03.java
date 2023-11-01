package p.a03;
import p.uy2;
import java.lang.Enum;
import p.rz2;
import p.sz2;
import p.tz2;
import p.uz2;
import p.vz2;
import p.wz2;
import p.xz2;
import p.yz2;
import p.zz2;
import p.nz2;
import p.oz2;
import p.pz2;
import p.qz2;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public abstract class a03 extends Enum implements uy2	// class@000ee8 from classes.dex
{
    public final int a;
    public static final oz2 A;
    public static final pz2 B;
    public static final qz2 C;
    public static final a03[] D;
    public static final a03[] E;
    public static final rz2 b;
    public static final tz2 c;
    public static final uz2 t;
    public static final vz2 v;
    public static final wz2 w;
    public static final xz2 x;
    public static final yz2 y;
    public static final zz2 z;

    static {
       rz2 orz2 = new rz2();
       a03.b = orz2;
       tz2 otz2 = new tz2();
       a03.c = otz2;
       uz2 ouz2 = new uz2();
       a03.t = ouz2;
       vz2 ovz2 = new vz2();
       a03.v = ovz2;
       wz2 owz2 = new wz2();
       a03.w = owz2;
       xz2 oxz2 = new xz2();
       a03.x = oxz2;
       yz2 oyz2 = new yz2();
       a03.y = oyz2;
       zz2 ozz2 = new zz2();
       a03.z = ozz2;
       oz2 ooz2 = new oz2();
       a03.A = ooz2;
       pz2 opz2 = new pz2();
       a03.B = opz2;
       qz2 oqz2 = new qz2();
       a03.C = oqz2;
       a03[] uoa03Array = new a03[13];
       uoa03Array[0] = orz2;
       uoa03Array[1] = new sz2();
       uoa03Array[2] = otz2;
       uoa03Array[3] = ouz2;
       uoa03Array[4] = ovz2;
       uoa03Array[5] = owz2;
       uoa03Array[6] = oxz2;
       uoa03Array[7] = oyz2;
       uoa03Array[8] = ozz2;
       uoa03Array[9] = new nz2();
       uoa03Array[10] = ooz2;
       uoa03Array[11] = opz2;
       uoa03Array[12] = oqz2;
       a03.E = uoa03Array;
       a03.D = a03.values();
    }
    public void a03(String p0,int p1,int p2){
       super(p0, p1);
       this.a = p2;
    }
    public static a03 valueOf(String p0){
       return Enum.valueOf(a03.class, p0);
    }
    public static a03[] values(){
       return a03.E.clone();
    }
    public final int getId(){
       return this.a;
    }
}
