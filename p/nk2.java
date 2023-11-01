package p.nk2;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class nk2 extends Enum	// class@001ff4 from classes.dex
{
    public static final nk2 A;
    public static final nk2 B;
    public static final nk2[] C;
    public static final nk2 a;
    public static final nk2 b;
    public static final nk2 c;
    public static final nk2 t;
    public static final nk2 v;
    public static final nk2 w;
    public static final nk2 x;
    public static final nk2 y;
    public static final nk2 z;

    static {
       nk2 onk2 = new nk2("BIG_CARD", 0);
       nk2.a = onk2;
       nk2 onk21 = new nk2("CARD", 1);
       nk2.b = onk21;
       nk2 onk22 = new nk2("HEADER", 2);
       nk2.c = onk22;
       nk2 onk23 = new nk2("ONE_COLUMN", 3);
       nk2.t = onk23;
       nk2 onk24 = new nk2("OUTSIDE_CONTENT_AREA", 4);
       nk2.v = onk24;
       nk2 onk25 = new nk2("SPACED_VERTICALLY", 5);
       nk2.w = onk25;
       nk2 onk26 = new nk2("SPINNER", 6);
       nk2.x = onk26;
       nk2 onk27 = new nk2("STACKABLE", 7);
       nk2.y = onk27;
       nk2 onk28 = new nk2("THREE_COLUMN", 8);
       nk2.z = onk28;
       nk2 onk29 = new nk2("TOP_ITEM", 9);
       nk2.A = onk29;
       nk2 onk210 = new nk2("TWO_COLUMN", 10);
       nk2.B = onk210;
       nk2[] onk2Array = new nk2[11];
       onk2Array[0] = onk2;
       onk2Array[1] = onk21;
       onk2Array[2] = onk22;
       onk2Array[3] = onk23;
       onk2Array[4] = onk24;
       onk2Array[5] = onk25;
       onk2Array[6] = onk26;
       onk2Array[7] = onk27;
       onk2Array[8] = onk28;
       onk2Array[9] = onk29;
       onk2Array[10] = onk210;
       nk2.C = onk2Array;
    }
    public void nk2(String p0,int p1){
       super(p0, p1);
    }
    public static nk2 valueOf(String p0){
       return Enum.valueOf(nk2.class, p0);
    }
    public static nk2[] values(){
       return nk2.C.clone();
    }
}
