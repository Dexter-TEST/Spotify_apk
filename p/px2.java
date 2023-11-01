package p.px2;
import p.uy2;
import java.lang.Enum;
import p.ox2;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public abstract class px2 extends Enum implements uy2	// class@0022eb from classes.dex
{
    public final int a;
    public static final px2[] b;
    public static final px2[] c;

    static {
       px2[] opx2Array = new px2[]{new ox2()};
       px2.c = opx2Array;
       px2.b = px2.values();
    }
    public void px2(){
       super("TRACK_CLOUD", 0);
       this.a = 0x7f0a023b;
    }
    public static px2 valueOf(String p0){
       return Enum.valueOf(px2.class, p0);
    }
    public static px2[] values(){
       return px2.c.clone();
    }
    public final int getId(){
       return this.a;
    }
}
