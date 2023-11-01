package p.fo2;
import java.lang.String;
import java.lang.Object;
import java.lang.StringBuilder;

public abstract class fo2	// class@001606 from classes.dex
{
    public static final char[] a;

    static {
       fo2.a = "0123456789abcdef".toCharArray();
    }
    public void fo2(){
       super();
    }
    public abstract byte[] a();
    public abstract int b();
    public abstract long c();
    public abstract int d();
    public abstract boolean e(fo2 p0);
    public final boolean equals(Object p0){
       boolean b = false;
       if (p0 instanceof fo2 && (this.d() == p0.d() && this.e(p0))) {
          b = true;
       }
       return b;
    }
    public byte[] f(){
       return this.a();
    }
    public final int hashCode(){
       if (this.d() >= 32) {
          return this.b();
       }
       byte[] uobyteArray = this.f();
       int i = uobyteArray[0] & 0x00ff;
       for (int i1 = 1; i1 < uobyteArray.length; i1 = i1 + 1) {
          int i2 = uobyteArray[i1] & 0x00ff;
          int i3 = i1 * 8;
          i2 = i2 << i3;
          i = i | i2;
       }
       return i;
    }
    public final String toString(){
       byte[] uobyteArray = this.f();
       StringBuilder str = new StringBuilder((uobyteArray.length * 2));
       int len = uobyteArray.length;
       for (int i = 0; i < len; i = i + 1) {
          int b = uobyteArray[i];
          int i1 = b >> 4;
          i1 = i1 & 0x0f;
          char[] a = fo2.a;
          b = b & 0x0f;
          str = str.append(a[i1]).append(a[b]);
       }
       return str;
    }
}
