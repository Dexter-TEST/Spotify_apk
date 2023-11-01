package p.wu;
import p.qk4;
import java.lang.String;
import p.qx5;
import p.kf5;
import p.r45;
import p.uu;
import p.vw6;
import com.google.common.collect.c;
import p.m73;
import p.to;
import java.lang.Object;
import java.lang.Long;
import p.ej5;
import p.qu;
import java.lang.Boolean;
import java.util.List;
import java.util.Collections;
import java.util.Collection;
import java.util.Map;
import java.lang.NullPointerException;
import java.lang.Class;
import p.w51;
import java.lang.StringBuilder;

public final class wu	// class@002baf from classes.dex
{
    public final c A;
    public final long a;
    public final String b;
    public final String c;
    public final qx5 d;
    public final kf5 e;
    public final r45 f;
    public final r45 g;
    public final r45 h;
    public final r45 i;
    public final r45 j;
    public final r45 k;
    public final r45 l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final uu q;
    public final qx5 r;
    public final vw6 s;
    public final c t;
    public final c u;
    public final m73 v;
    public final m73 w;
    public final String x;
    public final String y;
    public final to z;

    static {
       wu.a().a();
    }
    public void wu(long p0,String p1,String p2,qx5 p3,kf5 p4,r45 p5,r45 p6,r45 p7,r45 p8,r45 p9,r45 p10,r45 p11,boolean p12,boolean p13,boolean p14,boolean p15,uu p16,qx5 p17,vw6 p18,c p19,c p20,m73 p21,m73 p22,String p23,String p24,to p25,c p26){
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
       i.n = p13;
       i.o = p14;
       i.p = p15;
       i.q = p16;
       i.r = p17;
       i.s = p18;
       i.t = p19;
       i.u = p20;
       i.v = p21;
       i.w = p22;
       i.x = p23;
       i.y = p24;
       i.z = p25;
       i.A = p26;
    }
    public static qk4 a(){
       dv a;
       uu e;
       uv a1;
       qk4 oqk4 = new qk4();
       oqk4.a = Long.valueOf(0);
       String str = "";
       oqk4.b = str;
       oqk4.c = str;
       if ((a = qx5.a) == null) {
          throw new NullPointerException("Null contextRestrictions");
       }
       oqk4.d = a;
       if ((e = uu.e) == null) {
          throw new NullPointerException("Null options");
       }
       oqk4.q = e;
       if (a == null) {
          throw new NullPointerException("Null restrictions");
       }
       oqk4.r = a;
       oqk4.e = kf5.a(str).c();
       Boolean fALSE = Boolean.FALSE;
       oqk4.m = fALSE;
       oqk4.n = fALSE;
       oqk4.o = fALSE;
       oqk4.p = fALSE;
       if ((a1 = vw6.a) == null) {
          throw new NullPointerException("Null suppressions");
       }
       oqk4.s = a1;
       oqk4.t = c.o(Collections.emptyList());
       oqk4.u = c.o(Collections.emptyList());
       oqk4.v = m73.b(Collections.emptyMap());
       oqk4.w = m73.b(Collections.emptyMap());
       oqk4.x = str;
       oqk4.y = "0";
       oqk4.A = c.o(Collections.emptyList());
       oqk4.z = to.a;
       return oqk4;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof wu) {
          return false;
       }
       if (!(this.a - p0.a) && (this.b.equals(p0.b) && (this.c.equals(p0.c) && (this.d.equals(p0.d) && (this.e.equals(p0.e) && (this.f.equals(p0.f) && (this.g.equals(p0.g) && (this.h.equals(p0.h) && (this.i.equals(p0.i) && (this.j.equals(p0.j) && (this.k.equals(p0.k) && (this.l.equals(p0.l) && (this.m == p0.m && (this.n == p0.n && (this.o == p0.o && (this.p == p0.p && (this.q.equals(p0.q) && (this.r.equals(p0.r) && (this.s.equals(p0.s) && (this.t.equals(p0.t) && this.u.equals(p0.u))))))))))))))))))))) {
          wu tv = this.v;
          tv.getClass();
          if (w51.q(tv, p0.v)) {
             tv = this.w;
             tv.getClass();
             if (w51.q(tv, p0.w) && (this.x.equals(p0.x) && (this.y.equals(p0.y) && (this.z.equals(p0.z) && this.A.equals(p0.A))))) {
             label_010f :
                return b;
             }
          }
       }
       b = false;
       goto label_010f ;
    }
    public final int hashCode(){
       wu ta = this.a;
       int i = 0xf4243;
       int i1 = ((((((((((((((((((((((((int)((ta >> 32) ^ ta) ^ i) * i) ^ this.b.hashCode()) * i) ^ this.c.hashCode()) * i) ^ this.d.hashCode()) * i) ^ this.e.hashCode()) * i) ^ this.f.hashCode()) * i) ^ this.g.hashCode()) * i) ^ this.h.hashCode()) * i) ^ this.i.hashCode()) * i) ^ this.j.hashCode()) * i) ^ this.k.hashCode()) * i) ^ this.l.hashCode()) * i;
       int i2 = 1231;
       int i3 = (this.m != null)? 1231: 1237;
       i1 = (i1 ^ i3) * i;
       i3 = (this.n != null)? 1231: 1237;
       i1 = (i1 ^ i3) * i;
       i3 = (this.o != null)? 1231: 1237;
       i1 = (i1 ^ i3) * i;
       if (this.p == null) {
          i2 = 1237;
       }
       return (this.A.hashCode() ^ ((((((((((((((((((((((i1 ^ i2) * i) ^ this.q.hashCode()) * i) ^ this.r.hashCode()) * i) ^ this.s.hashCode()) * i) ^ this.t.hashCode()) * i) ^ this.u.hashCode()) * i) ^ this.v.hashCode()) * i) ^ this.w.hashCode()) * i) ^ this.x.hashCode()) * i) ^ this.y.hashCode()) * i) ^ this.z.hashCode()) * i));
    }
    public final String toString(){
       return "PlayerState{timestamp="+this.a+", contextUri="+this.b+", contextUrl="+this.c+", contextRestrictions="+this.d+", playOrigin="+this.e+", index="+this.f+", track="+this.g+", playbackId="+this.h+", playbackQuality="+this.i+", playbackSpeed="+this.j+", positionAsOfTimestamp="+this.k+", duration="+this.l+", isPlaying="+this.m+", isPaused="+this.n+", isBuffering="+this.o+", isSystemInitiated="+this.p+", options="+this.q+", restrictions="+this.r+", suppressions="+this.s+", prevTracks="+this.t+", nextTracks="+this.u+", contextMetadata="+this.v+", pageMetadata="+this.w+", sessionId="+this.x+", queueRevision="+this.y+", audioStream="+this.z+", signals="+this.A+"}";
    }
}
