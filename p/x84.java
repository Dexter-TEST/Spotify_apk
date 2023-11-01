package p.x84;
import p.tb3;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class x84 extends Enum implements tb3	// class@002c2b from classes.dex
{
    public final int a;
    public static final x84 b;
    public static final x84 c;
    public static final x84 t;
    public static final x84[] v;

    static {
       x84 ox84 = new x84("MIXED", 0, 0);
       x84.b = ox84;
       x84 ox841 = new x84("AUDIO", 1, 1);
       x84.c = ox841;
       x84 ox842 = new x84("VIDEO", 2, 2);
       x84.t = ox842;
       x84[] ox84Array = new x84[]{ox84,ox841,ox842};
       x84.v = ox84Array;
    }
    public void x84(String p0,int p1,int p2){
       super(p0, p1);
       this.a = p2;
    }
    public static x84 valueOf(String p0){
       return Enum.valueOf(x84.class, p0);
    }
    public static x84[] values(){
       return x84.v.clone();
    }
    public final int getNumber(){
       return this.a;
    }
}
