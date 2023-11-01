package p.rt3;
import p.tb3;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class rt3 extends Enum implements tb3	// class@002554 from classes.dex
{
    public final int a;
    public static final rt3 A;
    public static final rt3 B;
    public static final rt3[] C;
    public static final rt3 b;
    public static final rt3 c;
    public static final rt3 t;
    public static final rt3 v;
    public static final rt3 w;
    public static final rt3 x;
    public static final rt3 y;
    public static final rt3 z;

    static {
       rt3 ort3 = new rt3("UNKNOWN_ERROR", 0, 0);
       rt3.b = ort3;
       rt3 ort31 = new rt3("INVALID_CREDENTIALS", 1, 1);
       rt3.c = ort31;
       rt3 ort32 = new rt3("BAD_REQUEST", 2, 2);
       rt3.t = ort32;
       rt3 ort33 = new rt3("UNSUPPORTED_LOGIN_PROTOCOL", 3, 3);
       rt3.v = ort33;
       rt3 ort34 = new rt3("TIMEOUT", 4, 4);
       rt3.w = ort34;
       rt3 ort35 = new rt3("UNKNOWN_IDENTIFIER", 5, 5);
       rt3.x = ort35;
       rt3 ort36 = new rt3("TOO_MANY_ATTEMPTS", 6, 6);
       rt3.y = ort36;
       rt3 ort37 = new rt3("INVALID_PHONENUMBER", 7, 7);
       rt3.z = ort37;
       rt3 ort38 = new rt3("TRY_AGAIN_LATER", 8, 8);
       rt3.A = ort38;
       rt3 ort39 = new rt3("UNRECOGNIZED", 9, -1);
       rt3.B = ort39;
       rt3[] ort3Array = new rt3[10];
       ort3Array[0] = ort3;
       ort3Array[1] = ort31;
       ort3Array[2] = ort32;
       ort3Array[3] = ort33;
       ort3Array[4] = ort34;
       ort3Array[5] = ort35;
       ort3Array[6] = ort36;
       ort3Array[7] = ort37;
       ort3Array[8] = ort38;
       ort3Array[9] = ort39;
       rt3.C = ort3Array;
    }
    public void rt3(String p0,int p1,int p2){
       super(p0, p1);
       this.a = p2;
    }
    public static rt3 a(int p0){
       switch (p0){
           case 0:
             return rt3.b;
           case 1:
             return rt3.c;
           case 2:
             return rt3.t;
           case 3:
             return rt3.v;
           case 4:
             return rt3.w;
           case 5:
             return rt3.x;
           case 6:
             return rt3.y;
           case 7:
             return rt3.z;
           case 8:
             return rt3.A;
           default:
             return null;
       }
    }
    public static rt3 valueOf(String p0){
       return Enum.valueOf(rt3.class, p0);
    }
    public static rt3[] values(){
       return rt3.C.clone();
    }
    public final int getNumber(){
       if (this != rt3.B) {
          return this.a;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
