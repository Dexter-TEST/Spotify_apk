package p.av;
import p.hj5;
import p.r45;
import p.m73;
import java.lang.Object;
import java.lang.Class;
import java.util.Map;
import p.w51;
import java.lang.String;
import java.lang.StringBuilder;

public final class av extends hj5	// class@001001 from classes.dex
{
    public final r45 b;
    public final r45 c;
    public final r45 d;
    public final r45 e;
    public final r45 f;
    public final r45 g;
    public final r45 h;
    public final r45 i;
    public final r45 j;
    public final r45 k;
    public final r45 l;
    public final r45 m;
    public final m73 n;

    public void av(r45 p0,r45 p1,r45 p2,r45 p3,r45 p4,r45 p5,r45 p6,r45 p7,r45 p8,r45 p9,r45 p10,r45 p11,m73 p12){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
       this.i = p7;
       this.j = p8;
       this.k = p9;
       this.l = p10;
       this.m = p11;
       this.n = p12;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof hj5) {
          return false;
       }
       if (this.b.equals(p0.b) && (this.c.equals(p0.c) && (this.d.equals(p0.d) && (this.e.equals(p0.e) && (this.f.equals(p0.f) && (this.g.equals(p0.g) && (this.h.equals(p0.h) && (this.i.equals(p0.i) && (this.j.equals(p0.j) && (this.k.equals(p0.k) && (this.l.equals(p0.l) && this.m.equals(p0.m)))))))))))) {
          av tn = this.n;
          tn.getClass();
          if (w51.q(tn, p0.n)) {
          label_0097 :
             return b;
          }
       }
       b = false;
       goto label_0097 ;
    }
    public final int hashCode(){
       return (((((((((((((((((((((((((this.b.hashCode() ^ 0xf4243) * 0xf4243) ^ this.c.hashCode()) * 0xf4243) ^ this.d.hashCode()) * 0xf4243) ^ this.e.hashCode()) * 0xf4243) ^ this.f.hashCode()) * 0xf4243) ^ this.g.hashCode()) * 0xf4243) ^ this.h.hashCode()) * 0xf4243) ^ this.i.hashCode()) * 0xf4243) ^ this.j.hashCode()) * 0xf4243) ^ this.k.hashCode()) * 0xf4243) ^ this.l.hashCode()) * 0xf4243) ^ this.m.hashCode()) * 0xf4243) ^ this.n.hashCode());
    }
    public final String toString(){
       return "PreparePlayOptions{playbackId="+this.b+", alwaysPlaySomething="+this.c+", skipTo="+this.d+", seekTo="+this.e+", initiallyPaused="+this.f+", systemInitiated="+this.g+", playerOptionsOverride="+this.h+", suppressions="+this.i+", prefetchLevel="+this.j+", audioStream="+this.k+", sessionId="+this.l+", license="+this.m+", configurationOverride="+this.n+"}";
    }
}
