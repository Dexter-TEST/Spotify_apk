package p.tv;
import java.io.File;
import java.lang.String;
import java.lang.Object;
import java.lang.StringBuilder;
import p.en6;

public final class tv	// class@0027f1 from classes.dex
{
    public final String a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final File i;
    public final File j;
    public final File k;
    public final boolean l;
    public final boolean m;
    public static final File n;

    static {
       tv.n = new File("");
    }
    public void tv(String p0,long p1,long p2,long p3,long p4,boolean p5,boolean p6,boolean p7,File p8,File p9,File p10,boolean p11,boolean p12){
       int i = this;
       super();
       i.a = p0;
       i.b = p1;
       i.c = p2;
       i.d = p3;
       i.e = p4;
       i.f = p5;
       i.g = p6;
       i.h = p7;
       i.i = p8;
       i.j = p9;
       i.k = p10;
       i.l = p11;
       i.m = p12;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof tv) {
          return false;
       }
       if (!this.a.equals(p0.a) || ((this.b - p0.b) || ((this.c - p0.c) || ((this.d - p0.d) || ((this.e - p0.e) || (this.f != p0.f || (this.g != p0.g || (this.h != p0.h || (!this.i.equals(p0.i) || (!this.j.equals(p0.j) || (!this.k.equals(p0.k) || (this.l != p0.l || this.m != p0.m)))))))))))) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       int i = 0xf4243;
       tv tb = this.b;
       tb = this.c;
       tb = this.d;
       tb = this.e;
       int i1 = (((((((((this.a.hashCode() ^ i) * i) ^ (int)(tb ^ (tb >> 32))) * i) ^ (int)(tb ^ (tb >> 32))) * i) ^ (int)(tb ^ (tb >> 32))) * i) ^ (int)(tb ^ (tb >> 32))) * i;
       int i2 = 1231;
       int i3 = (this.f != null)? 1231: 1237;
       i1 = (i1 ^ i3) * i;
       i3 = (this.g != null)? 1231: 1237;
       i1 = (i1 ^ i3) * i;
       i3 = (this.h != null)? 1231: 1237;
       i1 = (((((((i1 ^ i3) * i) ^ this.i.hashCode()) * i) ^ this.j.hashCode()) * i) ^ this.k.hashCode()) * i;
       i3 = (this.l != null)? 1231: 1237;
       i1 = (i1 ^ i3) * i;
       if (this.m == null) {
          i2 = 1237;
       }
       return (i1 ^ i2);
    }
    public final String toString(){
       return en6.q("StorageLocation{name="+this.a+", estimatedUsedSpace="+this.b+", estimatedFreeSpace="+this.c+", estimatedAppSize="+this.d+", estimatedCacheSize="+this.e+", selected="+this.f+", mounted="+this.g+", appInternal="+this.h+", cache="+this.i+", volatileCache="+this.j+", volume="+this.k+", emulated="+this.l+", removable=", this.m, "}");
    }
}
