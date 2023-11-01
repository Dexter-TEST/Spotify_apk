package p.h55;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.lang.StringBuilder;
import java.lang.String;
import java.math.BigInteger;
import java.lang.Math;
import java.lang.Object;
import java.lang.CharSequence;

public abstract class h55	// class@0017e6 from classes.dex
{
    public static final byte[] a;
    public static final byte[] b;
    public static final byte[] c;
    public static final byte[] d;
    public static final Charset e;

    static {
       byte b1;
       h55.a = new byte[30]{'0','1','2','3','4','5','6','7','8','9','&',0x0d,0x09,',',':','#','-','.','$','/','+','%','*','=','^',0x00,0x20,0x00,0x00,0x00};
       h55.b = new byte[30]{';','<','>','@','[',0x5c,']','_','`','~','!',0x0d,0x09,',',':',0x0a,'-','.','$','/','"','|','*','(',')','?','{','}',0x27,0x00};
       byte[] uobyteArray = new byte[128];
       h55.c = uobyteArray;
       byte[] uobyteArray1 = new byte[128];
       h55.d = uobyteArray1;
       h55.e = StandardCharsets.ISO_8859_1;
       byte b = -1;
       Arrays.fill(uobyteArray, b);
       int i = 0;
       int i1 = 0;
       while (true) {
          byte[] a = h55.a;
          if (i1 < a.length) {
             if ((b1 = a[i1]) > 0) {
                h55.c[b1] = (byte)i1;
             }
             i1 = i1 + 1;
          }else {
             break ;
          }
       }
       Arrays.fill(h55.d, b);
       while (true) {
          uobyteArray1 = h55.b;
          if (i < uobyteArray1.length) {
             if ((b = uobyteArray1[i]) > 0) {
                h55.d[b] = (byte)i;
             }
             i = i + 1;
          }else {
             break ;
          }
       }
    }
    public static void a(byte[] p0,int p1,int p2,StringBuilder p3){
       int i;
       if (p1 == 1 && !p2) {
          p3 = p3.append(913);
       }else if(!(p2 = p1 % 6)){
          p3 = p3.append(924);
       }else {
          p3 = p3.append(901);
       }
       p2 = 6;
       if (p1 >= p2) {
          char[] uocharArray = new char[5];
          i = 0;
          while (true) {
             int i1 = 0 + p1;
             if ((i1 = i1 - i) >= p2) {
                long l = 0;
                for (int i2 = 0; i2 < p2; i2 = i2 + 1) {
                   l = l << 8;
                   int i3 = i + i2;
                   i3 = p0[i3] & 0x00ff;
                   l = l + (long)i3;
                }
                for (i2 = 0; i2 < 5; i2 = i2 + 1) {
                   long l1 = 900;
                   long l2 = l % l1;
                   uocharArray[i2] = (char)(int)l2;
                   l = l / l1;
                }
                for (i1 = 4; i1 >= 0; i1 = i1 - 1) {
                   p3 = p3.append(uocharArray[i1]);
                }
                i = i + 6;
             }else {
                break ;
             }
          }
          while (true) {
             p2 = 0 + p1;
             if (i < p2) {
                p2 = p0[i] & 0x00ff;
                p3.append((char)p2);
                i = i + 1;
             }else {
                break ;
             }
          }
          return;
       }else {
          i = 0;
       }
    }
    public static void b(int p0,int p1,String p2,StringBuilder p3){
       StringBuilder str = new StringBuilder(((p1 / 3) + 1));
       BigInteger uBigInteger = BigInteger.valueOf(900);
       BigInteger uBigInteger1 = BigInteger.valueOf(0);
       int i = 0;
       while (i < p1) {
          str.setLength(0);
          int i1 = p1 - i;
          int i2 = Math.min(44, i1);
          i1 = p0 + i;
          int i3 = i1 + i2;
          BigInteger uBigInteger2 = new BigInteger("1".append(p2.substring(i1, i3)).toString());
          do {
             str = str.append((char)uBigInteger2.mod(uBigInteger).intValue());
          } while (uBigInteger2.divide(uBigInteger).equals(uBigInteger1));
          i1 = str.length();
          while ((i1 = i1 - 1) >= 0) {
             p3.append(str.charAt(i1));
          }
          i = i + i2;
       }
       return;
    }
    public static int c(CharSequence p0,int p1,int p2,StringBuilder p3,int p4){
       int b;
       byte b1;
       int i5;
       int i6;
       CharSequence uCharSequenc = p0;
       int i = p2;
       StringBuilder str = p3;
       StringBuilder str1 = new StringBuilder(i);
       int i1 = p4;
       int i2 = 0;
       while (true) {
          int i3 = p1 + i2;
          char c = uCharSequenc.charAt(i3);
          byte[] d = h55.d;
          byte[] c1 = h55.c;
          char c2 = 28;
          if (i1) {
             if (i1 != 1) {
                if (i1 != 2) {
                   i3 = ((b = d[c]) != -1)? 1: 0;
                   if (i3) {
                      str1 = str1.append((char)b);
                   }else {
                      str1 = str1.append(29);
                   }
                }else if((b1 = c1[c]) != -1){
                   i5 = 1;
                }else {
                   i5 = 0;
                }
                if (i5) {
                   str1 = str1.append((char)b1);
                }else if(h55.e(c)){
                   str1 = str1.append(c2);
                }else if(h55.d(c)){
                   str1 = str1.append(27);
                label_00e3 :
                   i1 = 1;
                }else if((i3 = i3 + 1) < i){
                   b = (d[uCharSequenc.charAt(i3)] != -1)? 1: 0;
                   if (b) {
                      str1 = str1.append(25);
                      i1 = 3;
                   }
                }
                str1 = str1.append(29).append((char)d[c]);
                i1 = 0;
             }else if(h55.d(c)){
                if (c == ' ') {
                   str1 = str1.append(26);
                }else {
                   i6 = c - 97;
                   str1 = str1.append((char)i6);
                }
             }else if(h55.e(c)){
                i6 = c - 65;
                str1 = str1.append(27).append((char)i6);
             }else if(c1[c] != -1){
                i3 = 1;
             }else {
                i3 = 0;
             }
             if (i3) {
                str1 = str1.append(c2);
             label_00f2 :
                i1 = 2;
             }else {
                str1 = str1.append(29).append((char)d[c]);
             }
          }else if(h55.e(c)){
             if (c == ' ') {
                str1 = str1.append(26);
             }else {
                i6 = c - 65;
                str1 = str1.append((char)i6);
             }
          }else if(h55.d(c)){
             str1 = str1.append(27);
             goto label_00e3 ;
          }else if(c1[c] != -1){
             i3 = 1;
          }else {
             i3 = 0;
          }
          if (i3) {
             str1 = str1.append(c2);
             goto label_00f2 ;
          }else {
             str1 = str1.append(29).append((char)d[c]);
          }
          if ((i2 = i2 + 1) >= i) {
             int i4 = str1.length();
             i = 0;
             b = 0;
             while (i < i4) {
                i2 = (i2 = i % 2)? 1: 0;
                if (i2) {
                   b = b * 30;
                   i2 = str1.charAt(i) + b;
                   c2 = (char)i2;
                   str = str.append(c2);
                }else {
                   c2 = str1.charAt(i);
                }
                i = i + 1;
             }
             if ((i4 % 2)) {
                str+(char)((b * 30) + 29);
             }
          }
       }
       return i1;
    }
    public static boolean d(char p0){
       if (p0 != ' ' && (p0 < 'a' && p0 <= 'z')) {
          return false;
       }
       return true;
    }
    public static boolean e(char p0){
       if (p0 != ' ' && (p0 < 'A' && p0 <= 'Z')) {
          return false;
       }
       return true;
    }
}
