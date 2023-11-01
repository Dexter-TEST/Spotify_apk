package p.dq7;
import java.lang.Enum;
import java.lang.Integer;
import java.io.Serializable;
import java.lang.String;
import java.lang.Long;
import java.lang.Float;
import java.lang.Double;
import java.lang.Boolean;
import p.i80;
import java.lang.Class;
import java.lang.Object;

public final class dq7 extends Enum	// class@00139b from classes.dex
{
    public final Object a;
    public static final dq7 A;
    public static final dq7[] B;
    public static final dq7 b;
    public static final dq7 c;
    public static final dq7 t;
    public static final dq7 v;
    public static final dq7 w;
    public static final dq7 x;
    public static final dq7 y;
    public static final dq7 z;

    static {
       dq7 uodq7 = new dq7(0, Integer.valueOf(0), "INT");
       dq7.b = uodq7;
       dq7 uodq71 = new dq7(1, Long.valueOf(0), "LONG");
       dq7.c = uodq71;
       dq7 uodq72 = new dq7(2, Float.valueOf(0), "FLOAT");
       dq7.t = uodq72;
       dq7 uodq73 = new dq7(3, Double.valueOf(0), "DOUBLE");
       dq7.v = uodq73;
       dq7 uodq74 = new dq7(4, Boolean.FALSE, "BOOLEAN");
       dq7.w = uodq74;
       dq7 uodq75 = new dq7(5, "", "STRING");
       dq7.x = uodq75;
       dq7 uodq76 = new dq7(6, i80.b, "BYTE_STRING");
       dq7.y = uodq76;
       dq7 uodq77 = new dq7(7, null, "ENUM");
       dq7.z = uodq77;
       dq7 uodq78 = new dq7(8, null, "MESSAGE");
       dq7.A = uodq78;
       dq7[] uodq7Array = new dq7[9];
       uodq7Array[0] = uodq7;
       uodq7Array[1] = uodq71;
       uodq7Array[2] = uodq72;
       uodq7Array[3] = uodq73;
       uodq7Array[4] = uodq74;
       uodq7Array[5] = uodq75;
       uodq7Array[6] = uodq76;
       uodq7Array[7] = uodq77;
       uodq7Array[8] = uodq78;
       dq7.B = uodq7Array;
    }
    public void dq7(int p0,Serializable p1,String p2){
       super(p2, p0);
       this.a = p1;
    }
    public static dq7 valueOf(String p0){
       return Enum.valueOf(dq7.class, p0);
    }
    public static dq7[] values(){
       return dq7.B.clone();
    }
}
