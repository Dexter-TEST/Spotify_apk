package p.hp1;
import p.tb3;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class hp1 extends Enum implements tb3	// class@001896 from classes.dex
{
    public final int a;
    public static final hp1 b;
    public static final hp1 c;
    public static final hp1 t;
    public static final hp1 v;
    public static final hp1 w;
    public static final hp1 x;
    public static final hp1 y;
    public static final hp1[] z;

    static {
       hp1 ohp1 = new hp1("UNKNOWN_STRATEGY", 0, 0);
       hp1.b = ohp1;
       hp1 ohp11 = new hp1("BEST_MATCHING", 1, 1);
       hp1.c = ohp11;
       hp1 ohp12 = new hp1("BACKEND_ADVISED", 2, 2);
       hp1.t = ohp12;
       hp1 ohp13 = new hp1("OFFLINED_FILE", 3, 3);
       hp1.v = ohp13;
       hp1 ohp14 = new hp1("CACHED_FILE", 4, 4);
       hp1.w = ohp14;
       hp1 ohp15 = new hp1("LOCAL_FILE", 5, 5);
       hp1.x = ohp15;
       hp1 ohp16 = new hp1("UNRECOGNIZED", 6, -1);
       hp1.y = ohp16;
       hp1[] ohp1Array = new hp1[]{ohp1,ohp11,ohp12,ohp13,ohp14,ohp15,ohp16};
       hp1.z = ohp1Array;
    }
    public void hp1(String p0,int p1,int p2){
       super(p0, p1);
       this.a = p2;
    }
    public static hp1 a(int p0){
       if (!p0) {
          return hp1.b;
       }
       if (p0 == 1) {
          return hp1.c;
       }
       if (p0 == 2) {
          return hp1.t;
       }
       if (p0 == 3) {
          return hp1.v;
       }
       if (p0 == 4) {
          return hp1.w;
       }
       if (p0 != 5) {
          return null;
       }
       return hp1.x;
    }
    public static hp1 valueOf(String p0){
       return Enum.valueOf(hp1.class, p0);
    }
    public static hp1[] values(){
       return hp1.z.clone();
    }
    public final int getNumber(){
       if (this != hp1.y) {
          return this.a;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
