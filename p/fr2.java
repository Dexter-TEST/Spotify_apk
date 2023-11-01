package p.fr2;
import p.j80;
import java.lang.String;
import p.ir2;
import java.lang.Object;
import java.lang.Integer;
import p.co5;
import p.we7;
import java.lang.StringBuilder;
import p.av6;

public abstract class fr2	// class@0001f8 from classes2.dex
{
    public static final j80 a;
    public static final String[] b;
    public static final String[] c;
    public static final String[] d;

    static {
       char c;
       int i3;
       fr2.a = ir2.t("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
       String[] stringArray = new String[]{"DATA","HEADERS","PRIORITY","RST_STREAM","SETTINGS","PUSH_PROMISE","PING","GOAWAY","WINDOW_UPDATE","CONTINUATION"};
       fr2.b = stringArray;
       stringArray = new String[64];
       fr2.c = stringArray;
       int i = 256;
       String[] stringArray1 = new String[i];
       int i1 = 0;
       int i2 = 0;
       while (true) {
          c = ' ';
          i3 = 1;
          if (i2 < i) {
             Object[] objArray = new Object[i3];
             String str = Integer.toBinaryString(i2);
             co5.l(str, "toBinaryString\(it\)");
             objArray[i1] = str;
             String str1 = we7.i("%8s", objArray).replace(c, '0');
             co5.l(str1, "this as java.lang.String…replace\(oldChar, newChar\)");
             stringArray1[i2] = str1;
             i2 = i2 + 1;
          }else {
             break ;
          }
       }
       fr2.d = stringArray1;
       stringArray = fr2.c;
       stringArray[i1] = "";
       stringArray[i3] = "END_STREAM";
       int[] ointArray = new int[i3];
       ointArray[i1] = i3;
       stringArray[8] = "PADDED";
       stringArray[9] = co5.K("|PADDED", "END_STREAM");
       stringArray[4] = "END_HEADERS";
       stringArray[c] = "PRIORITY";
       stringArray[36] = "END_HEADERS|PRIORITY";
       i = 3;
       int[] ointArray1 = new int[i]{4,32,'$'};
       int i4 = 0;
       while (i4 < i) {
          int i5 = ointArray1[i4];
          i4 = i4 + 1;
          int i6 = ointArray[i1];
          String[] c1 = fr2.c;
          int i7 = i6 | i5;
          c1[i7] = "".append(c1[i6]).append('|').append(c1[i5]).toString();
          i7 = i7 | 8;
          c1[i7] = "".append(c1[i6]).append('|').append(c1[i5]).append("|PADDED").toString();
       }
       i = fr2.c.length;
       while (i1 < i) {
          int i8 = i1 + 1;
          String[] c2 = fr2.c;
          if (c2[i1] == null) {
             c2[i1] = fr2.d[i1];
          }
          i1 = i8;
       }
    }
    public static String a(boolean p0,int p1,int p2,int p3,int p4){
       object oobject;
       String str;
       object oobject1;
       String[] b = fr2.b;
       if (p3 < b.length) {
          oobject = b[p3];
       }else {
          Object[] objArray1 = new Object[]{Integer.valueOf(p3)};
          oobject = we7.i("0x%02x", objArray1);
       }
       if (!p4) {
          str = "";
       }else {
          String[] d = fr2.d;
          if (p3 != 2 && p3 != 3) {
             if (p3 != 4 && p3 != 6) {
                if (p3 != 7 && p3 != 8) {
                   String[] c = fr2.c;
                   if (p4 < c.length) {
                      oobject1 = c[p4];
                      co5.i(oobject1);
                   }else {
                      oobject1 = d[p4];
                   }
                   if (p3 == 5 && ((p4 & 0x04))) {
                      str = av6.x0(oobject1, "HEADERS", "PUSH_PROMISE");
                   }else if(!p3 && ((p4 & 0x20))){
                      str = av6.x0(oobject1, "PRIORITY", "COMPRESSED");
                   }else {
                      str = oobject1;
                   }
                }
             }else if(p4 == 1){
                str = "ACK";
             }else {
                str = d[p4];
             }
          }
          str = d[p4];
       }
       String str1 = (p0)? "<<": ">>";
       Object[] objArray = new Object[]{str1,Integer.valueOf(p1),Integer.valueOf(p2),oobject,str};
       return we7.i("%s 0x%08x %5d %-13s %s", objArray);
    }
}
