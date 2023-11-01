package p.ay;
import p.yx;
import java.lang.Character;
import java.lang.String;
import p.xx;
import p.wx;
import java.lang.Object;
import java.lang.IllegalArgumentException;
import p.xe7;
import java.lang.CharSequence;
import java.lang.System;
import java.lang.Throwable;
import p.zx;
import java.lang.StringBuilder;
import p.ap5;
import java.math.RoundingMode;
import p.ye7;
import java.lang.AssertionError;
import java.lang.Appendable;
import java.lang.Math;
import java.util.Objects;
import java.lang.Class;

public class ay	// class@00101c from classes.dex
{
    public final wx a;
    public final Character b;
    public ay c;
    public static final yx d;
    public static final xx e;

    static {
       Character uCharacter = Character.valueOf('=');
       ay.d = new yx("base64\(\)", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", uCharacter);
       yx oyx = new yx("base64Url\(\)", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", uCharacter);
       ay oyx1 = new ay("base32\(\)", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", uCharacter);
       oyx1 = new ay("base32Hex\(\)", "0123456789ABCDEFGHIJKLMNOPQRSTUV", uCharacter);
       ay.e = new xx(new wx("base16\(\)", "0123456789ABCDEF".toCharArray()));
    }
    public void ay(String p0,String p1,Character p2){
       super(new wx(p0, p1.toCharArray()), p2);
    }
    public void ay(wx p0,Character p1){
       int i1;
       super();
       this.a = p0;
       int i = 1;
       if (p1 != null) {
          char c = p1.charValue();
          p0 = p0.g;
          i1 = (c < p0.length && p0[c] != -1)? 1: 0;
          if (i1) {
             i1 = 0;
          label_0020 :
             if (i1) {
                this.b = p1;
                return;
             }else {
                Object[] objArray = new Object[i];
                objArray[0] = p1;
                throw new IllegalArgumentException(xe7.E("Padding character %s was already in alphabet", objArray));
             }
          }
       }
       i1 = 1;
       goto label_0020 ;
    }
    public final byte[] a(String p0){
       int i1;
       try{
          CharSequence uCharSequenc = this.f(p0);
          int i = (int)((((long)this.a.d * (long)uCharSequenc.length()) + 7) / 8);
          byte[] uobyteArray = new byte[i];
          if ((i1 = this.b(uobyteArray, uCharSequenc)) == i) {
          }else {
             byte[] uobyteArray1 = new byte[i1];
             System.arraycopy(uobyteArray, 0, uobyteArray1, 0, i1);
             uobyteArray = uobyteArray1;
          }
          return uobyteArray;
       }catch(p.zx e6){
          throw new IllegalArgumentException(e6);
       }
    }
    public int b(byte[] p0,CharSequence p1){
       wx d;
       wx e;
       int i4;
       ay uoay = this;
       CharSequence uCharSequenc = uoay.f(p1);
       ay a = uoay.a;
       if (!a.h[(uCharSequenc.length() % a.e)]) {
          throw new zx("Invalid input length "+uCharSequenc.length());
       }
       int i = 0;
       int i1 = 0;
       while (i < uCharSequenc.length()) {
          long l = 0;
          int i2 = 0;
          int i3 = 0;
          while (true) {
             d = a.d;
             e = a.e;
             if (i2 < e) {
                l = l << d;
                if ((i4 = i + i2) < uCharSequenc.length()) {
                   i4 = i3 + 1;
                   i3 = i3 + i;
                   l = l | (long)a.a(uCharSequenc.charAt(i3));
                   i3 = i4;
                }
                i2 = i2 + 1;
             }else {
                break ;
             }
          }
          wx f = a.f;
          int i5 = f * 8;
          i3 = i3 * d;
          i5 = i5 - i3;
          i2 = f - 1;
          i2 = i2 * 8;
          while (i2 >= i5) {
             i3 = i1 + 1;
             long l1 = l >> i2;
             l1 = l1 & 255;
             p0[i1] = (byte)(int)l1;
             i2 = i2 - 8;
             i1 = i3;
          }
          i = i + e;
       }
       return i1;
    }
    public final String c(byte[] p0){
       int len = p0.length;
       ap5.i(0, (len + 0), p0.length);
       ay ta = this.a;
       int i = ye7.s(len, ta.f, RoundingMode.CEILING) * ta.e;
       try{
          StringBuilder str = new StringBuilder(i);
          this.e(str, p0, len);
          return str;
       }catch(java.io.IOException e6){
          throw new AssertionError(e6);
       }
    }
    public final void d(StringBuilder p0,byte[] p1,int p2,int p3){
       ay tb;
       ap5.i(p2, (p2 + p3), p1.length);
       ay ta = this.a;
       int i = 0;
       int b = (p3 <= ta.f)? true: false;
       ap5.e(b);
       long l = 0;
       for (b = 0; b < p3; b = b + 1) {
          int i1 = p2 + b;
          i1 = p1[i1] & 0x00ff;
          l = l | (long)i1;
          l = l << 8;
       }
       wx d = ta.d;
       int i2 = ((p3 + 1) * 8) - d;
       while (true) {
          b = p3 * 8;
          if (i < b) {
             b = i2 - i;
             long l1 = l >> b;
             b = (int)l1;
             b = b & ta.c;
             Appendable uAppendable = p0.append(ta.b[b]);
             i = i + d;
          }else if((tb = this.b) != null){
             while (true) {
                p3 = ta.f * 8;
                if (i < p3) {
                   p0.append(tb.charValue());
                   i = i + d;
                }
             }
          }
          return;
       }
    }
    public void e(StringBuilder p0,byte[] p1,int p2){
       ap5.i(0, (0 + p2), p1.length);
       for (int i = 0; i < p2; i = i + ta.f) {
          int i1 = 0 + i;
          ay ta = this.a;
          int i2 = p2 - i;
          this.d(p0, p1, i1, Math.min(ta.f, i2));
       }
       return;
    }
    public final boolean equals(Object p0){
       boolean b = false;
       if (p0 instanceof ay && (this.a.equals(p0.a) && Objects.equals(this.b, p0.b))) {
          b = true;
       }
       return b;
    }
    public final CharSequence f(CharSequence p0){
       ay tb;
       p0.getClass();
       if ((tb = this.b) == null) {
          return p0;
       }
       char c = tb.charValue();
       int i = p0.length() - 1;
       while (i >= 0 && p0.charAt(i) == c) {
          i = i - 1;
       }
       return p0.subSequence(0, (i + 1));
    }
    public final int hashCode(){
       return (this.a.hashCode() ^ Objects.hashCode(this.b));
    }
    public final String toString(){
       ay ta = this.a;
       StringBuilder str = "BaseEncoding."+ta;
       if ((8 % ta.d)) {
          str = ((ta = this.b) == null)? str+".omitPadding\(\)": str+".withPadChar\(\'"+ta+"\'\)";
       }
       return str;
    }
}
