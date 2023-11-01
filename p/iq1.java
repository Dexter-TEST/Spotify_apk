package p.iq1;
import p.tb3;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class iq1 extends Enum implements tb3	// class@0019e2 from classes.dex
{
    public final int a;
    public static final iq1 b;
    public static final iq1 c;
    public static final iq1 t;
    public static final iq1 v;
    public static final iq1 w;
    public static final iq1 x;
    public static final iq1 y;
    public static final iq1[] z;

    static {
       iq1 oiq1 = new iq1("NOT_DOWNLOADED", 0, 0);
       iq1.b = oiq1;
       iq1 oiq11 = new iq1("ERROR", 1, 1);
       iq1.c = oiq11;
       iq1 oiq12 = new iq1("REQUESTED", 2, 2);
       iq1.t = oiq12;
       iq1 oiq13 = new iq1("DOWNLOADED", 3, 3);
       iq1.v = oiq13;
       iq1 oiq14 = new iq1("DOWNLOADING", 4, 4);
       iq1.w = oiq14;
       iq1 oiq15 = new iq1("WAITING", 5, 5);
       iq1.x = oiq15;
       iq1 oiq16 = new iq1("UNRECOGNIZED", 6, -1);
       iq1.y = oiq16;
       iq1[] oiq1Array = new iq1[]{oiq1,oiq11,oiq12,oiq13,oiq14,oiq15,oiq16};
       iq1.z = oiq1Array;
    }
    public void iq1(String p0,int p1,int p2){
       super(p0, p1);
       this.a = p2;
    }
    public static iq1 a(int p0){
       if (!p0) {
          return iq1.b;
       }
       if (p0 == 1) {
          return iq1.c;
       }
       if (p0 == 2) {
          return iq1.t;
       }
       if (p0 == 3) {
          return iq1.v;
       }
       if (p0 == 4) {
          return iq1.w;
       }
       if (p0 != 5) {
          return null;
       }
       return iq1.x;
    }
    public static iq1 valueOf(String p0){
       return Enum.valueOf(iq1.class, p0);
    }
    public static iq1[] values(){
       return iq1.z.clone();
    }
    public final int getNumber(){
       if (this != iq1.y) {
          return this.a;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
