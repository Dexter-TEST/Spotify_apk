package p.vw2;
import p.uy2;
import java.lang.Enum;
import p.pw2;
import p.qw2;
import p.rw2;
import p.sw2;
import p.tw2;
import p.uw2;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public abstract class vw2 extends Enum implements uy2	// class@002a79 from classes.dex
{
    public final int a;
    public final String b;
    public static final vw2[] c;
    public static final vw2[] t;

    static {
       vw2[] ovw2Array = new vw2[]{new pw2(),new qw2(),new rw2(),new sw2(),new tw2(),new uw2()};
       vw2.t = ovw2Array;
       vw2.c = vw2.values();
    }
    public void vw2(String p0,int p1,int p2,String p3){
       super(p0, p1);
       this.a = p2;
       this.b = p3;
    }
    public static vw2 valueOf(String p0){
       return Enum.valueOf(vw2.class, p0);
    }
    public static vw2[] values(){
       return vw2.t.clone();
    }
    public final int getId(){
       return this.a;
    }
}
