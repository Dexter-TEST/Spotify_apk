package p.vu3;
import p.tb3;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class vu3 extends Enum implements tb3	// class@002a68 from classes.dex
{
    public final int a;
    public static final vu3 b;
    public static final vu3 c;
    public static final vu3 t;
    public static final vu3[] v;

    static {
       vu3 ovu3 = new vu3("UNKNOWN_WARNING", 0, 0);
       vu3.b = ovu3;
       vu3 ovu31 = new vu3("DEPRECATED_PROTOCOL_VERSION", 1, 1);
       vu3.c = ovu31;
       vu3 ovu32 = new vu3("UNRECOGNIZED", 2, -1);
       vu3.t = ovu32;
       vu3[] ovu3Array = new vu3[]{ovu3,ovu31,ovu32};
       vu3.v = ovu3Array;
    }
    public void vu3(String p0,int p1,int p2){
       super(p0, p1);
       this.a = p2;
    }
    public static vu3 valueOf(String p0){
       return Enum.valueOf(vu3.class, p0);
    }
    public static vu3[] values(){
       return vu3.v.clone();
    }
    public final int getNumber(){
       if (this != vu3.t) {
          return this.a;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
