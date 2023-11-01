package p.z22;
import java.lang.Enum;
import p.ge3;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class z22 extends Enum	// class@002e73 from classes.dex
{
    public final int a;
    public static final z22 b;
    public static final z22 c;
    public static final z22[] t;
    public static final z22[] v;

    static {
       ge3 w = ge3.w;
       z22 v6 = new z22("DOUBLE", 0, 0, 1, w);
       ge3 v = ge3.v;
       v6 = new z22("FLOAT", 1, 1, 1, v);
       ge3 t = ge3.t;
       z22 v2 = new z22("INT64", 2, 2, 1, t);
       ge3 oge3 = t;
       z22 v4 = new z22("UINT64", 3, 3, 1, oge3);
       ge3 c = ge3.c;
       v2 = new z22("INT32", 4, 4, 1, c);
       v4 = new z22("FIXED64", 5, 5, 1, oge3);
       v4 = new z22("FIXED32", 6, 6, 1, c);
       ge3 x = ge3.x;
       v2 = new z22("BOOL", 7, 7, 1, x);
       ge3 y = ge3.y;
       v4 = new z22("STRING", 8, 8, 1, y);
       ge3 b = ge3.B;
       v2 = new z22("MESSAGE", 9, 9, 1, b);
       ge3 z = ge3.z;
       v4 = new z22("BYTES", 10, 10, 1, z);
       oge3 = c;
       v4 = new z22("UINT32", 11, 11, 1, oge3);
       ge3 a = ge3.A;
       v2 = new z22("ENUM", 12, 12, 1, a);
       v4 = new z22("SFIXED32", 13, 13, 1, oge3);
       v4 = new z22("SFIXED64", 14, 14, 1, t);
       v4 = new z22("SINT32", 15, 15, 1, c);
       v4 = new z22("SINT64", 16, 16, 1, t);
       z22 v43 = new z22("GROUP", 17, 17, 1, b);
       v4 = new z22("DOUBLE_LIST", 18, 18, 2, w);
       v2 = new z22("FLOAT_LIST", 19, 19, 2, v);
       oge3 = t;
       v4 = new z22("INT64_LIST", 20, 20, 2, oge3);
       v4 = new z22("UINT64_LIST", 21, 21, 2, oge3);
       v4 = new z22("INT32_LIST", 22, 22, 2, c);
       v4 = new z22("FIXED64_LIST", 23, 23, 2, t);
       v4 = new z22("FIXED32_LIST", 24, 24, 2, c);
       v4 = new z22("BOOL_LIST", 25, 25, 2, x);
       v2 = new z22("STRING_LIST", 26, 26, 2, y);
       v4 = new z22("MESSAGE_LIST", 27, 27, 2, b);
       v2 = new z22("BYTES_LIST", 28, 28, 2, z);
       v4 = new z22("UINT32_LIST", 29, 29, 2, c);
       v4 = new z22("ENUM_LIST", 30, 30, 2, a);
       v4 = new z22("SFIXED32_LIST", 31, 31, 2, c);
       v4 = new z22("SFIXED64_LIST", 32, 32, 2, t);
       v4 = new z22("SINT32_LIST", 33, 33, 2, c);
       v4 = new z22("SINT64_LIST", 34, 34, 2, t);
       v4 = new z22("DOUBLE_LIST_PACKED", 35, 35, 3, w);
       z22.b = v55;
       v2 = new z22("FLOAT_LIST_PACKED", 36, 36, 3, v);
       oge3 = t;
       v4 = new z22("INT64_LIST_PACKED", 37, 37, 3, oge3);
       v4 = new z22("UINT64_LIST_PACKED", 38, 38, 3, oge3);
       v4 = new z22("INT32_LIST_PACKED", 39, 39, 3, c);
       v4 = new z22("FIXED64_LIST_PACKED", 40, 40, 3, t);
       v4 = new z22("FIXED32_LIST_PACKED", 41, 41, 3, c);
       v4 = new z22("BOOL_LIST_PACKED", 42, 42, 3, x);
       v4 = new z22("UINT32_LIST_PACKED", 43, 43, 3, c);
       v4 = new z22("ENUM_LIST_PACKED", 44, 44, 3, a);
       v4 = new z22("SFIXED32_LIST_PACKED", 45, 45, 3, c);
       v4 = new z22("SFIXED64_LIST_PACKED", 46, 46, 3, t);
       v4 = new z22("SINT32_LIST_PACKED", 47, 47, 3, c);
       v4 = new z22("SINT64_LIST_PACKED", 48, 48, 3, t);
       z22.c = c;
       v4 = new z22("GROUP_LIST", 49, 49, 2, b);
       z22 v8 = new z22("MAP", 50, 50, 4, ge3.b);
       z22[] oz22Array = new z22[51];
       int i = 0;
       oz22Array[i] = v6;
       oz22Array[1] = v6;
       oz22Array[2] = v2;
       oz22Array[3] = v4;
       oz22Array[4] = v5;
       oz22Array[5] = v26;
       oz22Array[6] = v27;
       oz22Array[7] = v28;
       oz22Array[8] = v30;
       oz22Array[9] = v32;
       oz22Array[10] = v34;
       oz22Array[11] = v36;
       oz22Array[12] = v37;
       oz22Array[13] = v39;
       oz22Array[14] = v40;
       oz22Array[15] = v41;
       oz22Array[16] = v42;
       oz22Array[17] = v43;
       oz22Array[18] = v43;
       oz22Array[19] = v9;
       oz22Array[20] = v10;
       oz22Array[21] = v11;
       oz22Array[22] = v44;
       oz22Array[23] = v45;
       oz22Array[24] = v46;
       oz22Array[25] = v47;
       oz22Array[26] = v48;
       oz22Array[27] = y;
       oz22Array[28] = v49;
       oz22Array[29] = z;
       oz22Array[30] = v50;
       oz22Array[31] = v51;
       oz22Array[32] = v52;
       oz22Array[33] = v53;
       oz22Array[34] = v54;
       oz22Array[35] = v55;
       oz22Array[36] = w;
       oz22Array[37] = v;
       oz22Array[38] = v2;
       oz22Array[39] = v20;
       oz22Array[40] = v21;
       oz22Array[41] = v22;
       oz22Array[42] = v23;
       oz22Array[43] = v24;
       oz22Array[44] = x;
       oz22Array[45] = a;
       oz22Array[46] = v57;
       oz22Array[47] = v58;
       oz22Array[48] = c;
       oz22Array[49] = t;
       oz22Array[50] = v8;
       z22.v = oz22Array;
       z22[] oz22Array1 = z22.values();
       z22[] oz22Array2 = new z22[oz22Array1.length];
       z22.t = oz22Array2;
       int len = oz22Array1.length;
       for (; i < len; i = i + 1) {
          object oobject = oz22Array1[i];
          z22.t[oobject.a] = oobject;
       }
    }
    public void z22(String p0,int p1,int p2,int p3,ge3 p4){
       int i;
       super(p0, p1);
       this.a = p2;
       if (!p3) {
          throw null;
       }
       if ((i = p3 - 1) != 1) {
          if (i == 3) {
             p4.getClass();
          }
       }else {
          p4.getClass();
       }
       if (p3 == 1) {
          p4.ordinal();
       }
       return;
    }
    public static z22 valueOf(String p0){
       return Enum.valueOf(z22.class, p0);
    }
    public static z22[] values(){
       return z22.v.clone();
    }
    public final int a(){
       return this.a;
    }
}
