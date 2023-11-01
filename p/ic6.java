package p.ic6;
import p.tb3;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class ic6 extends Enum implements tb3	// class@00196a from classes.dex
{
    public final int a;
    public static final ic6 b;
    public static final ic6 c;
    public static final ic6 t;
    public static final ic6 v;
    public static final ic6[] w;

    static {
       ic6 oic6 = new ic6("SUCCESS", 0, 0);
       ic6.b = oic6;
       ic6 oic61 = new ic6("BAD_REQUEST", 1, 1);
       ic6.c = oic61;
       ic6 oic62 = new ic6("INTERNAL_ERROR", 2, 2);
       ic6.t = oic62;
       ic6 oic63 = new ic6("UNRECOGNIZED", 3, -1);
       ic6.v = oic63;
       ic6[] oic6Array = new ic6[]{oic6,oic61,oic62,oic63};
       ic6.w = oic6Array;
    }
    public void ic6(String p0,int p1,int p2){
       super(p0, p1);
       this.a = p2;
    }
    public static ic6 valueOf(String p0){
       return Enum.valueOf(ic6.class, p0);
    }
    public static ic6[] values(){
       return ic6.w.clone();
    }
    public final int getNumber(){
       if (this != ic6.v) {
          return this.a;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
