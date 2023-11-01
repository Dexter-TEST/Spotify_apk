package p.t24;
import java.lang.Object;
import java.nio.ByteBuffer;
import p.do5;
import p.vv7;
import java.lang.Class;
import java.lang.Double;
import java.lang.String;
import java.lang.StringBuilder;

public final class t24	// class@0026e8 from classes.dex
{
    public final double a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;
    public final double f;
    public final double g;
    public final double h;
    public final double i;
    public static final t24 j;
    public static final t24 k;
    public static final t24 l;
    public static final t24 m;

    static {
       t24 v19 = new t24(0x3ff0000000000000, 0, 0, 0x3ff0000000000000, 0, 0, 0x3ff0000000000000, 0, 0);
       t24.j = v19;
       v19 = new t24(0, 0x3ff0000000000000, 0xbff0000000000000, 0, 0, 0, 0x3ff0000000000000, 0, 0);
       t24.k = v19;
       v19 = new t24(0xbff0000000000000, 0, 0, 0xbff0000000000000, 0, 0, 0x3ff0000000000000, 0, 0);
       t24.l = v19;
       v19 = new t24(0, 0xbff0000000000000, 0x3ff0000000000000, 0, 0, 0, 0x3ff0000000000000, 0, 0);
       t24.m = v19;
    }
    public void t24(double p0,double p1,double p2,double p3,double p4,double p5,double p6,double p7,double p8){
       int i = this;
       super();
       i.a = p4;
       i.b = p5;
       i.c = p6;
       i.d = p0;
       i.e = p1;
       i.f = p2;
       i.g = p3;
       i.h = p7;
       i.i = p8;
    }
    public static t24 a(ByteBuffer p0){
       t24 v19 = new t24(do5.b0(p0), do5.b0(p0), do5.b0(p0), do5.b0(p0), do5.a0(p0), do5.a0(p0), do5.a0(p0), do5.b0(p0), do5.b0(p0));
       return v19;
    }
    public final void b(ByteBuffer p0){
       vv7.b0(p0, this.d);
       vv7.b0(p0, this.e);
       vv7.a0(p0, this.a);
       vv7.b0(p0, this.f);
       vv7.b0(p0, this.g);
       vv7.a0(p0, this.b);
       vv7.b0(p0, this.h);
       vv7.b0(p0, this.i);
       vv7.a0(p0, this.c);
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (p0 == null || t24.class != p0.getClass()) {
          return false;
       }
       if (Double.compare(p0.d, this.d)) {
          return false;
       }
       if (Double.compare(p0.e, this.e)) {
          return false;
       }
       if (Double.compare(p0.f, this.f)) {
          return false;
       }
       if (Double.compare(p0.g, this.g)) {
          return false;
       }
       if (Double.compare(p0.h, this.h)) {
          return false;
       }
       if (Double.compare(p0.i, this.i)) {
          return false;
       }
       if (Double.compare(p0.a, this.a)) {
          return false;
       }
       if (Double.compare(p0.b, this.b)) {
          return false;
       }
       if (Double.compare(p0.c, this.c)) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       long l = Double.doubleToLongBits(this.a);
       long l1 = Double.doubleToLongBits(this.b);
       l1 = Double.doubleToLongBits(this.c);
       l1 = Double.doubleToLongBits(this.d);
       l1 = Double.doubleToLongBits(this.e);
       l1 = Double.doubleToLongBits(this.f);
       l1 = Double.doubleToLongBits(this.g);
       l1 = Double.doubleToLongBits(this.h);
       l1 = Double.doubleToLongBits(this.i);
       return (((((((((((((((((int)(l ^ (l >> 32)) * 31) + (int)(l1 ^ (l1 >> 32))) * 31) + (int)(l1 ^ (l1 >> 32))) * 31) + (int)(l1 ^ (l1 >> 32))) * 31) + (int)(l1 ^ (l1 >> 32))) * 31) + (int)(l1 ^ (l1 >> 32))) * 31) + (int)(l1 ^ (l1 >> 32))) * 31) + (int)(l1 ^ (l1 >> 32))) * 31) + (int)(l1 ^ (l1 >> 32)));
    }
    public final String toString(){
       if (this.equals(t24.j)) {
          return "Rotate 0\xb0";
       }
       if (this.equals(t24.k)) {
          return "Rotate 90\xb0";
       }
       if (this.equals(t24.l)) {
          return "Rotate 180\xb0";
       }
       if (this.equals(t24.m)) {
          return "Rotate 270\xb0";
       }
       return "Matrix{u="+this.a+", v="+this.b+", w="+this.c+", a="+this.d+", b="+this.e+", c="+this.f+", d="+this.g+", tx="+this.h+", ty="+this.i+'}';
    }
}
