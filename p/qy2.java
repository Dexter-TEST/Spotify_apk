package p.qy2;
import p.uy2;
import java.lang.Enum;
import p.ky2;
import p.ly2;
import p.my2;
import p.ny2;
import p.oy2;
import p.py2;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public abstract class qy2 extends Enum implements uy2	// class@00243a from classes.dex
{
    public final int a;
    public static final ny2 b;
    public static final oy2 c;
    public static final qy2[] t;
    public static final qy2[] v;

    static {
       ny2 ony2 = new ny2();
       qy2.b = ony2;
       oy2 ooy2 = new oy2();
       qy2.c = ooy2;
       qy2[] oqy2Array = new qy2[]{new ky2(),new ly2(),new my2(),ony2,ooy2,new py2()};
       qy2.v = oqy2Array;
       qy2.t = qy2.values();
    }
    public void qy2(String p0,int p1,int p2){
       super(p0, p1);
       this.a = p2;
    }
    public static qy2 valueOf(String p0){
       return Enum.valueOf(qy2.class, p0);
    }
    public static qy2[] values(){
       return qy2.v.clone();
    }
    public final int getId(){
       return this.a;
    }
}
