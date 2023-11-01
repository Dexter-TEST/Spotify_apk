package p.hv;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import p.en6;

public final class hv	// class@0018d1 from classes.dex
{
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public void hv(int p0,int p1,int p2,int p3,int p4,int p5){
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
       if (!p0 instanceof hv) {
          return false;
       }
       if (this.a != p0.a || (this.b != p0.b || (this.c != p0.c || (this.d != p0.d || (this.e != p0.e || this.f != p0.f))))) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return (((((((((((this.a ^ 0xf4243) * 0xf4243) ^ this.b) * 0xf4243) ^ this.c) * 0xf4243) ^ this.d) * 0xf4243) ^ this.e) * 0xf4243) ^ this.f);
    }
    public final String toString(){
       return en6.o("Scrubbed{albums="+this.a+", artists="+this.b+", episodes="+this.c+", playlists="+this.d+", shows="+this.e+", tracks=", this.f, "}");
    }
}
