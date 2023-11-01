package p.qg3;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class qg3 extends Enum	// class@002397 from classes.dex
{
    public final char[] a;
    public final byte[] b;
    public final int c;
    public final boolean t;
    public final boolean v;
    public final boolean w;
    public static final qg3 A;
    public static final qg3 B;
    public static final qg3 C;
    public static final qg3 D;
    public static final qg3 E;
    public static final qg3 F;
    public static final qg3 G;
    public static final qg3 H;
    public static final qg3[] I;
    public static final qg3 x;
    public static final qg3 y;
    public static final qg3 z;

    static {
       qg3 oqg3 = new qg3(1, "START_OBJECT", 1, "{");
       qg3.x = oqg3;
       qg3 oqg31 = new qg3(2, "END_OBJECT", 2, "}");
       qg3.y = oqg31;
       qg3 oqg32 = new qg3(3, "START_ARRAY", 3, "[");
       qg3.z = oqg32;
       qg3 oqg33 = new qg3(4, "END_ARRAY", 4, "]");
       qg3.A = oqg33;
       qg3 oqg34 = new qg3(5, "FIELD_NAME", 5, null);
       qg3.B = oqg34;
       qg3 oqg35 = new qg3(6, "VALUE_EMBEDDED_OBJECT", 12, null);
       qg3.C = oqg35;
       qg3 oqg36 = new qg3(7, "VALUE_STRING", 6, null);
       qg3.D = oqg36;
       qg3 oqg37 = new qg3(9, "VALUE_NUMBER_FLOAT", 8, null);
       qg3.E = oqg37;
       qg3 oqg38 = new qg3(10, "VALUE_TRUE", 9, "true");
       qg3.F = oqg38;
       qg3 oqg39 = new qg3(11, "VALUE_FALSE", 10, "false");
       qg3.G = oqg39;
       qg3 oqg310 = oqg39;
       qg3 oqg311 = new qg3(12, "VALUE_NULL", 11, "null");
       qg3.H = oqg311;
       qg3[] oqg3Array = new qg3[13];
       oqg3Array[0] = new qg3(0, "NOT_AVAILABLE", -1, null);
       oqg3Array[1] = oqg3;
       oqg3Array[2] = oqg31;
       oqg3Array[3] = oqg32;
       oqg3Array[4] = oqg33;
       oqg3Array[5] = oqg34;
       oqg3Array[6] = oqg35;
       oqg3Array[7] = oqg36;
       oqg3Array[8] = new qg3(8, "VALUE_NUMBER_INT", 7, null);
       oqg3Array[9] = oqg37;
       oqg3Array[10] = oqg38;
       oqg3Array[11] = oqg310;
       oqg3Array[12] = oqg311;
       qg3.I = oqg3Array;
    }
    public void qg3(int p0,String p1,int p2,String p3){
       char[] uocharArray;
       int i;
       int b1;
       super(p1, p0);
       boolean b = false;
       if (p3 == null) {
          uocharArray = null;
          this.a = uocharArray;
          this.b = uocharArray;
       }else {
          uocharArray = p3.toCharArray();
          this.a = uocharArray;
          b1 = uocharArray.length;
          byte[] uobyteArray = new byte[b1];
          this.b = uobyteArray;
          for (i = 0; i < b1; i++) {
             this.b[i] = (byte)this.a[i];
          }
       }
       this.c = p2;
       i = 1;
       if (p2 != 7) {
          uocharArray = 8;
       }
       b1 = (p2 != i && p2 != 3)? false: true;
       this.t = b1;
       i = (p2 != 2 && p2 != 4)? false: true;
       this.v = i;
       if (!b1 && (!i && (p2 != 5 && p2 != -1))) {
          b = true;
       }
       this.w = b;
       return;
    }
    public static qg3 valueOf(String p0){
       return Enum.valueOf(qg3.class, p0);
    }
    public static qg3[] values(){
       return qg3.I.clone();
    }
}
