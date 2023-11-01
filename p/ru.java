package p.ru;
import p.o11;
import p.f20;
import p.h20;
import p.xp2;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.String;
import java.lang.StringBuilder;

public final class ru	// class@002562 from classes.dex
{
    public final f20 a;
    public final h20 b;
    public final f20 c;
    public final boolean d;
    public final xp2 e;

    static {
       ru.a().k();
    }
    public void ru(f20 p0,h20 p1,f20 p2,boolean p3,xp2 p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public static o11 a(){
       o11 oo11 = new o11(28);
       f20 a = f20.a;
       oo11.b = a;
       oo11.c = h20.a;
       oo11.t = a;
       oo11.v = Boolean.FALSE;
       oo11.w = xp2.a;
       return oo11;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof ru) {
          return false;
       }
       if (!this.a.equals(p0.a) || (!this.b.equals(p0.b) || (!this.c.equals(p0.c) || (this.d != p0.d || !this.e.equals(p0.e))))) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       int i = 0xf4243;
       int i1 = (((((this.a.hashCode() ^ i) * i) ^ this.b.hashCode()) * i) ^ this.c.hashCode()) * i;
       int i2 = (this.d != null)? 1231: 1237;
       return (((i1 ^ i2) * i) ^ this.e.hashCode());
    }
    public final String toString(){
       return "PlaybackQuality{bitrateLevel="+this.a+", strategy="+this.b+", targetBitrateLevel="+this.c+", targetBitrateAvailable="+this.d+", hifiStatus="+this.e+"}";
    }
}
