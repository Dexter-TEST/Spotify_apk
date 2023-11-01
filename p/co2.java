package p.co2;
import java.io.Serializable;
import p.fo2;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalStateException;
import java.lang.Integer;
import java.lang.String;
import p.xe7;
import java.lang.Math;

public final class co2 extends fo2 implements Serializable	// class@001246 from classes.dex
{
    public final byte[] b;

    public void co2(byte[] p0){
       super();
       p0.getClass();
       this.b = p0;
    }
    public final byte[] a(){
       return this.b.clone();
    }
    public final int b(){
       co2 tb = this.b;
       int i = (tb.length >= 4)? 1: 0;
       int len = tb.length;
       if (i) {
          return (((tb[3] & 0x00ff) << 24) | (((tb[0] & 0x00ff) | ((tb[1] & 0x00ff) << 8)) | ((tb[2] & 0x00ff) << 16)));
       }else {
          Object[] objArray = new Object[]{Integer.valueOf(len)};
          throw new IllegalStateException(xe7.E("HashCode#asInt\(\) requires >= 4 bytes \(it only has %s bytes\).", objArray));
       }
    }
    public final long c(){
       co2 tb = this.b;
       int i = 0;
       int i1 = 1;
       int i2 = (tb.length >= 8)? 1: 0;
       int len = tb.length;
       if (i2) {
          long l = (long)(tb[i] & 0x00ff);
          for (; i1 < Math.min(tb.length, 8); i1 = i1 + 1) {
             long l1 = (long)tb[i1] & 255;
             int i3 = i1 * 8;
             l1 = l1 << i3;
             l = l | l1;
          }
          return l;
       }else {
          Object[] objArray = new Object[i1];
          objArray[i] = Integer.valueOf(len);
          throw new IllegalStateException(xe7.E("HashCode#asLong\(\) requires >= 8 bytes \(it only has %s bytes\).", objArray));
       }
    }
    public final int d(){
       return (this.b.length * 8);
    }
    public final boolean e(fo2 p0){
       co2 tb = this.b;
       if (tb.length != p0.f().length) {
          return false;
       }
       int i1 = 1;
       for (int i = 0; i < tb.length; i = i + 1) {
          int i2 = (tb[i] == p0.f()[i])? 1: 0;
          i1 = i1 & i2;
       }
       return i1;
    }
    public final byte[] f(){
       return this.b;
    }
}
