package p.fs;
import p.vy0;
import java.lang.String;
import java.lang.Object;
import java.lang.StringBuilder;
import p.en6;

public final class fs extends vy0	// class@00162f from classes.dex
{
    public final int a;
    public final String b;
    public final int c;
    public final long d;
    public final long e;
    public final boolean f;
    public final int g;
    public final String h;
    public final String i;

    public void fs(int p0,String p1,int p2,long p3,long p4,boolean p5,int p6,String p7,String p8){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       this.h = p7;
       this.i = p8;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof vy0) {
          return false;
       }
       if (this.a != p0.a || (!this.b.equals(p0.b) || (this.c != p0.c || ((this.d - p0.d) || ((this.e - p0.e) || (this.f != p0.f || (this.g != p0.g || (!this.h.equals(p0.h) || !this.i.equals(p0.i))))))))) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       int i = 0xf4243;
       fs td = this.d;
       td = this.e;
       int i1 = (((((((((this.a ^ i) * i) ^ this.b.hashCode()) * i) ^ this.c) * i) ^ (int)(td ^ (td >> 32))) * i) ^ (int)(td ^ (td >> 32))) * i;
       int i2 = (this.f != null)? 1231: 1237;
       return (((((((i1 ^ i2) * i) ^ this.g) * i) ^ this.h.hashCode()) * i) ^ this.i.hashCode());
    }
    public final String toString(){
       return en6.p("Device{arch="+this.a+", model="+this.b+", cores="+this.c+", ram="+this.d+", diskSpace="+this.e+", simulator="+this.f+", state="+this.g+", manufacturer="+this.h+", modelClass=", this.i, "}");
    }
}
