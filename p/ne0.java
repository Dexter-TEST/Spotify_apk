package p.ne0;
import java.lang.Enum;
import java.lang.String;
import java.util.HashMap;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Class;

public final class ne0 extends Enum	// class@001fbc from classes.dex
{
    public final int[] a;
    public final String[] b;
    public static final HashMap c;
    public static final HashMap t;
    public static final ne0[] v;

    static {
       String[] stringArray = new String[0];
       String[] stringArray1 = new String[]{"ISO-8859-1"};
       stringArray1 = new String[]{"ISO-8859-2"};
       String[] stringArray2 = new String[]{"ISO-8859-3"};
       String[] stringArray3 = new String[]{"ISO-8859-4"};
       String[] stringArray4 = new String[]{"ISO-8859-5"};
       String[] stringArray5 = new String[]{"ISO-8859-6"};
       stringArray5 = new String[]{"ISO-8859-7"};
       stringArray5 = new String[]{"ISO-8859-8"};
       String[] stringArray6 = new String[]{"ISO-8859-9"};
       String[] stringArray7 = new String[]{"ISO-8859-10"};
       stringArray7 = new String[]{"ISO-8859-11"};
       stringArray7 = new String[]{"ISO-8859-13"};
       stringArray7 = new String[]{"ISO-8859-14"};
       stringArray7 = new String[]{"ISO-8859-15"};
       stringArray7 = new String[]{"ISO-8859-16"};
       stringArray7 = new String[]{"Shift_JIS"};
       stringArray7 = new String[]{"windows-1250"};
       stringArray7 = new String[]{"windows-1251"};
       stringArray7 = new String[]{"windows-1252"};
       stringArray7 = new String[]{"windows-1256"};
       stringArray7 = new String[]{"UTF-16BE","UnicodeBig"};
       stringArray7 = new String[]{"UTF-8"};
       stringArray7 = new String[]{"US-ASCII"};
       int[] ointArray = new int[]{28};
       String[] stringArray8 = new String[0];
       stringArray8 = new String[]{"GB2312","EUC_CN","GBK"};
       stringArray8 = new String[]{"EUC-KR"};
       ne0[] one0Array = new ne0[27];
       one0Array[0] = new ne0("Cp437", 0, new int[2]{0,2}, stringArray);
       one0Array[1] = new ne0("ISO8859_1", 1, new int[2]{1,3}, stringArray1);
       one0Array[2] = new ne0("ISO8859_2", 2, 4, stringArray1);
       one0Array[3] = new ne0("ISO8859_3", 3, 5, stringArray2);
       one0Array[4] = new ne0("ISO8859_4", 4, 6, stringArray3);
       one0Array[5] = new ne0("ISO8859_5", 5, 7, stringArray4);
       one0Array[6] = new ne0("ISO8859_6", 6, 8, stringArray5);
       one0Array[7] = new ne0("ISO8859_7", 7, 9, stringArray5);
       one0Array[8] = new ne0("ISO8859_8", 8, 10, stringArray5);
       one0Array[9] = new ne0("ISO8859_9", 9, 11, stringArray6);
       one0Array[10] = new ne0("ISO8859_10", 10, 12, stringArray7);
       one0Array[11] = new ne0("ISO8859_11", 11, 13, stringArray7);
       one0Array[12] = new ne0("ISO8859_13", 12, 15, stringArray7);
       one0Array[13] = new ne0("ISO8859_14", 13, 16, stringArray7);
       one0Array[14] = new ne0("ISO8859_15", 14, 17, stringArray7);
       one0Array[15] = new ne0("ISO8859_16", 15, 18, stringArray7);
       one0Array[16] = new ne0("SJIS", 16, 20, stringArray7);
       one0Array[17] = new ne0("Cp1250", 17, 21, stringArray7);
       one0Array[18] = new ne0("Cp1251", 18, 22, stringArray7);
       one0Array[19] = new ne0("Cp1252", 19, 23, stringArray7);
       one0Array[20] = new ne0("Cp1256", 20, 24, stringArray7);
       one0Array[21] = new ne0("UnicodeBigUnmarked", 21, 25, stringArray7);
       one0Array[22] = new ne0("UTF8", 22, 26, stringArray7);
       one0Array[23] = new ne0("ASCII", 23, new int[2]{27,170}, stringArray7);
       one0Array[24] = new ne0("Big5", 24, ointArray, stringArray8);
       one0Array[25] = new ne0("GB18030", 25, 29, stringArray8);
       one0Array[26] = new ne0("EUC_KR", 26, 30, stringArray8);
       ne0.v = one0Array;
       ne0.c = new HashMap();
       ne0.t = new HashMap();
       ne0[] one0Array1 = ne0.values();
       int len = one0Array1.length;
       int i = 0;
       while (i < len) {
          object oobject = one0Array1[i];
          ne0 a = oobject.a;
          int len1 = a.length;
          for (int i1 = 0; i1 < len1; i1 = i1 + 1) {
             ne0.c.put(Integer.valueOf(a[i1]), oobject);
          }
          ne0.t.put(oobject.name(), oobject);
          a = oobject.b;
          len1 = a.length;
          for (i1 = 0; i1 < len1; i1 = i1 + 1) {
             ne0.t.put(a[i1], oobject);
          }
          i = i + 1;
       }
    }
    public void ne0(String p0,int p1,int p2,String[] p3){
       super(p0, p1);
       int[] ointArray = new int[]{p2};
       this.a = ointArray;
       this.b = p3;
    }
    public void ne0(String p0,int p1,int[] p2,String[] p3){
       super(p0, p1);
       this.a = p2;
       this.b = p3;
    }
    public static ne0 valueOf(String p0){
       return Enum.valueOf(ne0.class, p0);
    }
    public static ne0[] values(){
       return ne0.v.clone();
    }
}
