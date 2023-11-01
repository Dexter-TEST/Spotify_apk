package p.gp1;
import p.tb3;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class gp1 extends Enum implements tb3	// class@001750 from classes.dex
{
    public final int a;
    public static final gp1[] A;
    public static final gp1 b;
    public static final gp1 c;
    public static final gp1 t;
    public static final gp1 v;
    public static final gp1 w;
    public static final gp1 x;
    public static final gp1 y;
    public static final gp1 z;

    static {
       gp1 ogp1 = new gp1("UNKNOWN", 0, 0);
       gp1.b = ogp1;
       gp1 ogp11 = new gp1("LOW", 1, 1);
       gp1.c = ogp11;
       gp1 ogp12 = new gp1("NORMAL", 2, 2);
       gp1.t = ogp12;
       gp1 ogp13 = new gp1("HIGH", 3, 3);
       gp1.v = ogp13;
       gp1 ogp14 = new gp1("VERY_HIGH", 4, 4);
       gp1.w = ogp14;
       gp1 ogp15 = new gp1("HIFI", 5, 5);
       gp1.x = ogp15;
       gp1 ogp16 = new gp1("HIFI24", 6, 6);
       gp1.y = ogp16;
       gp1 ogp17 = new gp1("UNRECOGNIZED", 7, -1);
       gp1.z = ogp17;
       gp1[] ogp1Array = new gp1[]{ogp1,ogp11,ogp12,ogp13,ogp14,ogp15,ogp16,ogp17};
       gp1.A = ogp1Array;
    }
    public void gp1(String p0,int p1,int p2){
       super(p0, p1);
       this.a = p2;
    }
    public static gp1 a(int p0){
       switch (p0){
           case 0:
             return gp1.b;
           case 1:
             return gp1.c;
           case 2:
             return gp1.t;
           case 3:
             return gp1.v;
           case 4:
             return gp1.w;
           case 5:
             return gp1.x;
           case 6:
             return gp1.y;
           default:
             return null;
       }
    }
    public static gp1 valueOf(String p0){
       return Enum.valueOf(gp1.class, p0);
    }
    public static gp1[] values(){
       return gp1.A.clone();
    }
    public final int getNumber(){
       if (this != gp1.z) {
          return this.a;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
