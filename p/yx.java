package p.yx;
import p.ay;
import java.lang.String;
import java.lang.Character;
import p.wx;
import p.ap5;
import java.lang.CharSequence;
import p.zx;
import java.lang.StringBuilder;
import java.lang.Appendable;

public final class yx extends ay	// class@002e4b from classes.dex
{

    public void yx(String p0,String p1,Character p2){
       super(new wx(p0, p1.toCharArray()), p2);
    }
    public void yx(wx p0,Character p1){
       super(p0, p1);
       boolean b = (p0.b.length == 64)? true: false;
       ap5.e(b);
       return;
    }
    public final int b(byte[] p0,CharSequence p1){
       p1 = this.f(p1);
       ay ta = this.a;
       if (!ta.h[(p1.length() % ta.e)]) {
          throw new zx("Invalid input length "+p1.length());
       }
       int i = 0;
       int i1 = 0;
       while (i < p1.length()) {
          int i2 = i + 1;
          i = ta.a(p1.charAt(i)) << 18;
          int i3 = i2 + 1;
          i2 = ta.a(p1.charAt(i2)) << 12;
          i = i | i2;
          i2 = i1 + 1;
          int i4 = i >> 16;
          p0[i1] = (byte)i4;
          if (i3 < p1.length()) {
             i1 = i3 + 1;
             i3 = ta.a(p1.charAt(i3)) << 6;
             i = i | i3;
             i3 = i2 + 1;
             i4 = i >> 8;
             i4 = i4 & 0x00ff;
             p0[i2] = (byte)i4;
             if (i1 < p1.length()) {
                i2 = i1 + 1;
                i = i | ta.a(p1.charAt(i1));
                i1 = i3 + 1;
                i = i & 0x00ff;
                p0[i3] = (byte)i;
                i = i2;
             }else {
                i = i1;
                i1 = i3;
             }
          }else {
             i1 = i2;
             i = i3;
          }
       }
       return i1;
    }
    public final void e(StringBuilder p0,byte[] p1,int p2){
       int i = 0;
       int i1 = i + p2;
       ap5.i(i, i1, p1.length);
       while (p2 >= 3) {
          int i2 = i + 1;
          i = p1[i] & 0x00ff;
          i = i << 16;
          int i3 = i2 + 1;
          i2 = p1[i2] & 0x00ff;
          i2 = i2 << 8;
          i = i | i2;
          i2 = i3 + 1;
          i3 = p1[i3] & 0x00ff;
          i = i | i3;
          i3 = i >> 18;
          ay ta = this.a;
          i3 = i >> 12;
          i3 = i3 & 0x3f;
          wx b = ta.b;
          i3 = i >> 6;
          i3 = i3 & 0x3f;
          i = i & 0x3f;
          Appendable uAppendable = p0.append(ta.b[i3]).append(b[i3]).append(b[i3]).append(b[i]);
          p2 = p2 - 3;
          i = i2;
       }
       if (i < i1) {
          this.d(p0, p1, i, (i1 - i));
       }
       return;
    }
}
