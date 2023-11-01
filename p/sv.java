package p.sv;
import java.lang.String;
import java.lang.Object;
import java.lang.StringBuilder;
import p.en6;

public final class sv	// class@0026ac from classes.dex
{
    public final boolean a;
    public final boolean b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;

    public void sv(boolean p0,boolean p1,String p2,String p3,boolean p4,boolean p5){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof sv) {
          return false;
       }
       if (this.a != p0.a || (this.b != p0.b || (!this.c.equals(p0.c) || (!this.d.equals(p0.d) || (this.e != p0.e || this.f != p0.f))))) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       int i = 1231;
       int i1 = (this.a != null)? 1231: 1237;
       int i2 = 0xf4243;
       i1 = (i1 ^ i2) * i2;
       int i3 = (this.b != null)? 1231: 1237;
       i1 = (((((i1 ^ i3) * i2) ^ this.c.hashCode()) * i2) ^ this.d.hashCode()) * i2;
       i3 = (this.e != null)? 1231: 1237;
       i1 = (i1 ^ i3) * i2;
       if (this.f == null) {
          i = 1237;
       }
       return (i1 ^ i);
    }
    public final String toString(){
       return en6.q("State{canPlayOnDemand="+this.a+", canPlayOffline="+this.b+", country="+this.c+", catalogue="+this.d+", filterExplicitContent="+this.e+", shouldShowPodcasts=", this.f, "}");
    }
}
