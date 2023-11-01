package p.ge3;
import java.lang.Enum;
import java.lang.Void;
import java.lang.String;
import java.lang.Class;
import java.io.Serializable;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Float;
import java.lang.Double;
import java.lang.Boolean;
import p.i80;
import java.lang.Object;

public final class ge3 extends Enum	// class@0016f0 from classes.dex
{
    public final Object a;
    public static final ge3 A;
    public static final ge3 B;
    public static final ge3[] C;
    public static final ge3 b;
    public static final ge3 c;
    public static final ge3 t;
    public static final ge3 v;
    public static final ge3 w;
    public static final ge3 x;
    public static final ge3 y;
    public static final ge3 z;

    static {
       ge3 oge3 = new ge3("VOID", 0, Void.class, null);
       ge3.b = oge3;
       ge3 oge31 = new ge3("INT", 1, Integer.class, Integer.valueOf(0));
       ge3.c = oge31;
       ge3 oge32 = new ge3("LONG", 2, Long.class, Long.valueOf(0));
       ge3.t = oge32;
       ge3 oge33 = new ge3("FLOAT", 3, Float.class, Float.valueOf(0));
       ge3.v = oge33;
       ge3 oge34 = new ge3("DOUBLE", 4, Double.class, Double.valueOf(0));
       ge3.w = oge34;
       ge3 oge35 = new ge3("BOOLEAN", 5, Boolean.class, Boolean.FALSE);
       ge3.x = oge35;
       ge3 oge36 = new ge3("STRING", 6, String.class, "");
       ge3.y = oge36;
       ge3 oge37 = new ge3("BYTE_STRING", 7, i80.class, i80.b);
       ge3.z = oge37;
       ge3 oge38 = new ge3("ENUM", 8, Integer.class, null);
       ge3.A = oge38;
       ge3 oge39 = new ge3("MESSAGE", 9, Object.class, null);
       ge3.B = oge39;
       ge3[] oge3Array = new ge3[10];
       oge3Array[0] = oge3;
       oge3Array[1] = oge31;
       oge3Array[2] = oge32;
       oge3Array[3] = oge33;
       oge3Array[4] = oge34;
       oge3Array[5] = oge35;
       oge3Array[6] = oge36;
       oge3Array[7] = oge37;
       oge3Array[8] = oge38;
       oge3Array[9] = oge39;
       ge3.C = oge3Array;
    }
    public void ge3(String p0,int p1,Class p2,Serializable p3){
       super(p0, p1);
       this.a = p3;
    }
    public static ge3 valueOf(String p0){
       return Enum.valueOf(ge3.class, p0);
    }
    public static ge3[] values(){
       return ge3.C.clone();
    }
}
