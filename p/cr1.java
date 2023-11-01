package p.cr1;
import p.tb3;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class cr1 extends Enum implements tb3	// class@001260 from classes.dex
{
    public final int a;
    public static final cr1 b;
    public static final cr1 c;
    public static final cr1 t;
    public static final cr1[] v;

    static {
       cr1 uocr1 = new cr1("NONE", 0, 0);
       cr1.b = uocr1;
       cr1 uocr11 = new cr1("MEDIA", 1, 1);
       cr1.c = uocr11;
       cr1 uocr12 = new cr1("UNRECOGNIZED", 2, -1);
       cr1.t = uocr12;
       cr1[] uocr1Array = new cr1[]{uocr1,uocr11,uocr12};
       cr1.v = uocr1Array;
    }
    public void cr1(String p0,int p1,int p2){
       super(p0, p1);
       this.a = p2;
    }
    public static cr1 valueOf(String p0){
       return Enum.valueOf(cr1.class, p0);
    }
    public static cr1[] values(){
       return cr1.v.clone();
    }
    public final int getNumber(){
       if (this != cr1.t) {
          return this.a;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
