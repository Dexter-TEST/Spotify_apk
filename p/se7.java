package p.se7;
import p.gd7;
import p.fc;
import p.qe7;
import java.lang.AssertionError;
import java.lang.CharSequence;
import java.lang.Character;
import p.re7;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;

public abstract class se7	// class@002614 from classes.dex
{
    public static final qe7 a;

    static {
       int i = (gd7.e && gd7.d)? 1: 0;
       qe7 oqe7 = (i && !fc.a())? new qe7(1): new qe7(0);
       se7.a = oqe7;
    }
    public static int a(byte[] p0,int p1,int p2){
       int i;
       byte b = p0[(p1 - 1)];
       if (p2 = p2 - p1) {
          if (p2 != 1) {
             if (p2 == 2) {
                i = se7.d(b, p0[p1], p0[(p1 + 1)]);
             }else {
                throw new AssertionError();
             }
          }else {
             i = se7.c(b, p0[p1]);
          }
       }else if(b > -12){
          b = -1;
       }
       i = b;
       return i;
    }
    public static int b(CharSequence p0){
       char c;
       int i4;
       char c1;
       int i = p0.length();
       int i1 = 0;
       int i2 = 0;
       while (i2 < i && p0.charAt(i2) < 128) {
          i2 = i2 + 1;
       }
       int i3 = i;
       while (true) {
          if (i2 < i) {
             if ((c = p0.charAt(i2)) < 2048) {
                i4 = c - 127;
                i4 = i4 >> 31;
                i3 = i3 + i4;
                i2 = i2 + 1;
             }else {
                i4 = p0.length();
                while (true) {
                   if (i2 < i4) {
                      if ((c1 = p0.charAt(i2)) < 2048) {
                         int i5 = c1 - 127;
                         i5 = i5 >> 31;
                         i1 = i1 + i5;
                      }else {
                         i1 = i1 + 2;
                         if (0xd800 <= c1 && c1 <= 0xdfff) {
                            if (Character.codePointAt(p0, i2) >= 0x10000) {
                               i2 = i2 + 1;
                            }else {
                            }
                         }
                      }
                      i2 = i2 + 1;
                   }else {
                      i3 = i3 + i1;
                   label_0059 :
                      if (i3 >= i) {
                         return i3;
                      }
                   }
                }
                throw new re7(i2, i4);
             }
          }else {
             goto label_0059 ;
          }
       }
       throw new IllegalArgumentException("UTF-8 length does not fit in int: "+((long)i3 + 0x100000000));
    }
    public static int c(int p0,int p1){
       p0 = (p0 <= -12 && p1 <= -65)? p0 ^ (p1 << 8): -1;
       return p0;
    }
    public static int d(int p0,int p1,int p2){
       p0 = (p0 <= -12 && (p1 <= -65 && p2 <= -65))? (p0 ^ (p1 << 8)) ^ (p2 << 16): -1;
       return p0;
    }
    public static boolean e(byte[] p0,int p1,int p2){
       boolean b = (!se7.a.q0(p1, p2, p0))? true: false;
       return b;
    }
}
