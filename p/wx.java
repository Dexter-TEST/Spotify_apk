package p.wx;
import java.lang.String;
import java.util.Arrays;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Character;
import p.xe7;
import java.lang.Class;
import java.math.RoundingMode;
import p.ye7;
import java.lang.Integer;
import java.lang.StringBuilder;
import java.lang.Throwable;
import p.zx;

public final class wx	// class@002bca from classes.dex
{
    public final String a;
    public final char[] b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final byte[] g;
    public final boolean[] h;
    public final boolean i;

    public void wx(String p0,char[] p1){
       char c;
       int i2;
       Object[] objArray;
       int i = 128;
       byte[] uobyteArray = new byte[i];
       Arrays.fill(uobyteArray, -1);
       int i1 = 0;
       while (true) {
          if (i1 < p1.length) {
             c = p1[i1];
             i2 = 1;
             int i3 = (c < i)? 1: 0;
             if (i3) {
                i3 = (uobyteArray[c] == -1)? 1: 0;
                if (i3) {
                   uobyteArray[c] = (byte)i1;
                   i1 = i1 + 1;
                }else {
                   break ;
                }
             }else {
                objArray = new Object[i2];
                objArray[0] = Character.valueOf(c);
                throw new IllegalArgumentException(xe7.E("Non-ASCII character: %s", objArray));
             }
          }else {
             super(p0, p1, uobyteArray, 0);
             return;
          }
       }
       objArray = new Object[i2];
       objArray[0] = Character.valueOf(c);
       throw new IllegalArgumentException(xe7.E("Duplicate character: %s", objArray));
    }
    public void wx(String p0,char[] p1,byte[] p2,boolean p3){
       int i3;
       super();
       p0.getClass();
       this.a = p0;
       p1.getClass();
       try{
          this.b = p1;
          int i = ye7.L(p1.length, RoundingMode.UNNECESSARY);
          this.d = i;
          int i1 = Integer.numberOfTrailingZeros(i);
          int i2 = 1 << (i1 - 3);
          this.e = i2;
          this.f = i >> i1;
          this.c = p1.length - 1;
          this.g = p2;
          boolean[] uobooleanArr = new boolean[i2];
          for (i3 = 0; i3 < this.f; i3++) {
             int i4 = i3 * 8;
             uobooleanArr[ye7.s(i4, this.d, RoundingMode.CEILING)] = 1;
          }
          this.h = uobooleanArr;
          this.i = p3;
          return;
       }catch(java.lang.ArithmeticException e4){
          throw new IllegalArgumentException("Illegal alphabet length "+i3.length, e4);
       }
    }
    public final int a(char p0){
       byte b;
       String str = "Unrecognized character: 0x";
       char c = 127;
       if (p0 > c) {
          throw new zx(str+Integer.toHexString(p0));
       }
       if ((b = this.g[p0]) != -1) {
          return b;
       }
       if (p0 > ' ' && p0 != c) {
          throw new zx("Unrecognized character: "+p0);
       }
       throw new zx(str+Integer.toHexString(p0));
    }
    public final boolean equals(Object p0){
       boolean b = false;
       if (p0 instanceof wx && (this.i == p0.i && Arrays.equals(this.b, p0.b))) {
          b = true;
       }
       return b;
    }
    public final int hashCode(){
       int i = Arrays.hashCode(this.b);
       int i1 = (this.i != null)? 1231: 1237;
       return (i + i1);
    }
    public final String toString(){
       return this.a;
    }
}
