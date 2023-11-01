package p.ez2;
import java.lang.Enum;
import java.lang.String;
import p.zt2;
import p.ty0;
import java.io.Serializable;
import p.a23;
import java.lang.Class;
import java.lang.Object;

public final class ez2 extends Enum	// class@001527 from classes.dex
{
    public final au2 a;
    public static final ez2 b;
    public static final ez2 c;
    public static final ez2 t;
    public static final ez2 v;
    public static final ez2[] w;

    static {
       ez2 uoez2 = new ez2("DEFAULT", 0);
       ez2.b = uoez2;
       ez2 uoez21 = new ez2("CIRCULAR", 1);
       ez2.c = uoez21;
       ez2 uoez22 = new ez2("CIRCULAR_WITH_RIPPLE", 2);
       ez2.t = uoez22;
       ez2 uoez23 = new ez2("SQUARE_WITH_RIPPLE", 3);
       ez2.v = uoez23;
       ez2[] uoez2Array = new ez2[]{uoez2,uoez21,uoez22,uoez23};
       ez2.w = uoez2Array;
    }
    public void ez2(String p0,int p1){
       super(p0, p1);
       this.a = ty0.b().q("style", this).d();
    }
    public static ez2 valueOf(String p0){
       return Enum.valueOf(ez2.class, p0);
    }
    public static ez2[] values(){
       return ez2.w.clone();
    }
}
