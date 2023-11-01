package p.w03;
import p.uy2;
import java.lang.Enum;
import p.s03;
import p.t03;
import p.u03;
import p.v03;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public abstract class w03 extends Enum implements uy2	// class@002a9d from classes.dex
{
    public final int a;
    public static final w03[] b;
    public static final w03[] c;

    static {
       w03[] ow03Array = new w03[]{new s03(),new t03(),new u03(),new v03()};
       w03.c = ow03Array;
       w03.b = w03.values();
    }
    public void w03(String p0,int p1,int p2){
       super(p0, p1);
       this.a = p2;
    }
    public static w03 valueOf(String p0){
       return Enum.valueOf(w03.class, p0);
    }
    public static w03[] values(){
       return w03.c.clone();
    }
    public final int getId(){
       return this.a;
    }
}
