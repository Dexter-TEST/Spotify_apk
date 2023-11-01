package p.x76;
import p.tb3;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class x76 extends Enum implements tb3	// class@002c24 from classes.dex
{
    public final int a;
    public static final x76 b;
    public static final x76 c;
    public static final x76 t;
    public static final x76 v;
    public static final x76[] w;

    static {
       x76 ox76 = new x76("DEFAULT", 0, 0);
       x76.b = ox76;
       x76 ox761 = new x76("ARTIST", 1, 1);
       x76.c = ox761;
       x76 ox762 = new x76("SHOW", 2, 2);
       x76.t = ox762;
       x76 ox763 = new x76("UNRECOGNIZED", 3, -1);
       x76.v = ox763;
       x76[] ox76Array = new x76[]{ox76,ox761,ox762,ox763};
       x76.w = ox76Array;
    }
    public void x76(String p0,int p1,int p2){
       super(p0, p1);
       this.a = p2;
    }
    public static x76 valueOf(String p0){
       return Enum.valueOf(x76.class, p0);
    }
    public static x76[] values(){
       return x76.w.clone();
    }
    public final int getNumber(){
       if (this != x76.v) {
          return this.a;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
