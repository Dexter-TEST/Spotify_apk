package p.jx2;
import p.uy2;
import java.lang.Enum;
import p.ex2;
import p.fx2;
import p.gx2;
import p.hx2;
import p.ix2;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public abstract class jx2 extends Enum implements uy2	// class@001b61 from classes.dex
{
    public final int a;
    public static final jx2[] b;
    public static final jx2[] c;

    static {
       jx2[] ojx2Array = new jx2[]{new ex2(),new fx2(),new gx2(),new hx2(),new ix2()};
       jx2.c = ojx2Array;
       jx2.b = jx2.values();
    }
    public void jx2(String p0,int p1,int p2){
       super(p0, p1);
       this.a = p2;
    }
    public static jx2 valueOf(String p0){
       return Enum.valueOf(jx2.class, p0);
    }
    public static jx2[] values(){
       return jx2.c.clone();
    }
    public final int getId(){
       return this.a;
    }
}
