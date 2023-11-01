package p.xx;
import p.ay;
import p.wx;
import java.lang.Character;
import p.ap5;
import java.lang.CharSequence;
import p.zx;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Appendable;

public final class xx extends ay	// class@002d0c from classes.dex
{
    public final char[] f;

    public void xx(wx p0){
       super(p0, null);
       char[] uocharArray = new char[512];
       this.f = uocharArray;
       p0 = p0.b;
       int i = 0;
       boolean b = (p0.length == 16)? true: false;
       ap5.e(b);
       for (; i < 256; i = i + 1) {
          xx tf = this.f;
          int i1 = i >> 4;
          tf[i] = p0[i1];
          i1 = i | 0x0100;
          int i2 = i & 0x0f;
          tf[i1] = p0[i2];
       }
       return;
    }
    public final int b(byte[] p0,CharSequence p1){
       if (((p1.length() % 2)) == 1) {
          throw new zx("Invalid input length "+p1.length());
       }
       int i = 0;
       int i1 = 0;
       while (i < p1.length()) {
          ay ta = this.a;
          int i2 = ta.a(p1.charAt(i)) << 4;
          int i3 = i + 1;
          i2 = i2 | ta.a(p1.charAt(i3));
          int i4 = i1 + 1;
          p0[i1] = (byte)i2;
          i = i + 2;
          i1 = i4;
       }
       return i1;
    }
    public final void e(StringBuilder p0,byte[] p1,int p2){
       ap5.i(0, (0 + p2), p1.length);
       for (int i = 0; i < p2; i = i + 1) {
          int i1 = 0 + i;
          i1 = p1[i1] & 0x00ff;
          xx tf = this.f;
          i1 = i1 | 0x0100;
          p0.append(tf[i1]).append(tf[i1]);
       }
       return;
    }
}
