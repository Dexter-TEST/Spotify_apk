package p.is;
import p.bz0;
import p.i73;
import p.xy0;
import p.yy0;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class is extends bz0	// class@0019fa from classes.dex
{
    public final i73 a;
    public final xy0 b;
    public final yy0 c;
    public final i73 d;

    public void is(i73 p0,xy0 p1,yy0 p2,i73 p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof bz0) {
          return false;
       }
       if (!this.a.equals(p0.a) || (!this.b.equals(p0.b) || (!this.c.equals(p0.c) || !this.d.equals(p0.d)))) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return (((((((this.a.hashCode() ^ 0xf4243) * 0xf4243) ^ this.b.hashCode()) * 0xf4243) ^ this.c.hashCode()) * 0xf4243) ^ this.d.hashCode());
    }
    public final String toString(){
       return "Execution{threads="+this.a+", exception="+this.b+", signal="+this.c+", binaries="+this.d+"}";
    }
}
