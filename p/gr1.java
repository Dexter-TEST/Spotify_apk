package p.gr1;
import p.tb3;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class gr1 extends Enum implements tb3	// class@001762 from classes.dex
{
    public final int a;
    public static final gr1 b;
    public static final gr1 c;
    public static final gr1 t;
    public static final gr1 v;
    public static final gr1 w;
    public static final gr1[] x;

    static {
       gr1 ogr1 = new gr1("OK", 0, 0);
       gr1.b = ogr1;
       gr1 ogr11 = new gr1("FORBIDDEN", 1, 1);
       gr1.c = ogr11;
       gr1 ogr12 = new gr1("NOT_FOUND", 2, 2);
       gr1.t = ogr12;
       gr1 ogr13 = new gr1("CONFLICT", 3, 3);
       gr1.v = ogr13;
       gr1 ogr14 = new gr1("UNRECOGNIZED", 4, -1);
       gr1.w = ogr14;
       gr1[] ogr1Array = new gr1[]{ogr1,ogr11,ogr12,ogr13,ogr14};
       gr1.x = ogr1Array;
    }
    public void gr1(String p0,int p1,int p2){
       super(p0, p1);
       this.a = p2;
    }
    public static gr1 valueOf(String p0){
       return Enum.valueOf(gr1.class, p0);
    }
    public static gr1[] values(){
       return gr1.x.clone();
    }
    public final int getNumber(){
       if (this != gr1.w) {
          return this.a;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
