package p.cq7;
import java.lang.Enum;
import p.dq7;
import java.lang.String;
import p.yp7;
import p.zp7;
import p.aq7;
import p.bq7;
import java.lang.Class;
import java.lang.Object;

public class cq7 extends Enum	// class@00125d from classes.dex
{
    public final dq7 a;
    public final int b;
    public static final cq7 c;
    public static final yp7 t;
    public static final zp7 v;
    public static final aq7 w;
    public static final cq7[] x;

    static {
       dq7 c = dq7.c;
       cq7 uocq7 = new cq7("INT64", 2, c, 0);
       cq7.c = uocq7;
       cq7 uocq71 = new cq7("UINT64", 3, c, 0);
       dq7 b = dq7.b;
       cq7 uocq72 = new cq7("INT32", 4, b, 0);
       cq7 uocq73 = new cq7("FIXED64", 5, c, 1);
       cq7 uocq74 = new cq7("FIXED32", 6, b, 5);
       yp7 oyp7 = new yp7();
       cq7.t = oyp7;
       dq7 a = dq7.A;
       zp7 ozp7 = new zp7(a);
       cq7.v = ozp7;
       aq7 uoaq7 = new aq7(a);
       cq7.w = uoaq7;
       aq7 uoaq71 = uoaq7;
       zp7 ozp71 = ozp7;
       cq7 uocq75 = new cq7("SINT32", 16, b, 0);
       cq7 uocq76 = new cq7("SINT64", 17, c, 0);
       cq7[] uocq7Array = new cq7[18];
       uocq7Array[0] = new cq7("DOUBLE", 0, dq7.v, 1);
       uocq7Array[1] = new cq7("FLOAT", 1, dq7.t, 5);
       uocq7Array[2] = uocq7;
       uocq7Array[3] = uocq71;
       uocq7Array[4] = uocq72;
       uocq7Array[5] = uocq73;
       uocq7Array[6] = uocq74;
       uocq7Array[7] = new cq7("BOOL", 7, dq7.w, 0);
       uocq7Array[8] = oyp7;
       uocq7Array[9] = ozp71;
       uocq7Array[10] = uoaq71;
       uocq7Array[11] = new bq7(dq7.y);
       uocq7Array[12] = new cq7("UINT32", 12, b, 0);
       uocq7Array[13] = new cq7("ENUM", 13, dq7.z, 0);
       uocq7Array[14] = new cq7("SFIXED32", 14, b, 5);
       uocq7Array[15] = new cq7("SFIXED64", 15, c, 1);
       uocq7Array[16] = uocq75;
       uocq7Array[17] = uocq76;
       cq7.x = uocq7Array;
    }
    public void cq7(String p0,int p1,dq7 p2,int p3){
       super(p0, p1);
       this.a = p2;
       this.b = p3;
    }
    public static cq7 valueOf(String p0){
       return Enum.valueOf(cq7.class, p0);
    }
    public static cq7[] values(){
       return cq7.x.clone();
    }
}
