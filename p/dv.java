package p.dv;
import p.qx5;
import com.google.common.collect.d;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class dv extends qx5	// class@0013c8 from classes.dex
{
    public final d b;
    public final d c;
    public final d d;
    public final d e;
    public final d f;
    public final d g;
    public final d h;
    public final d i;
    public final d j;
    public final d k;
    public final d l;
    public final d m;
    public final d n;
    public final d o;
    public final d p;
    public final d q;
    public final d r;
    public final d s;
    public final d t;
    public final d u;
    public final d v;
    public final d w;
    public final d x;

    public void dv(d p0,d p1,d p2,d p3,d p4,d p5,d p6,d p7,d p8,d p9,d p10,d p11,d p12,d p13,d p14,d p15,d p16,d p17,d p18,d p19,d p20,d p21,d p22){
       int i = this;
       super();
       i.b = p0;
       i.c = p1;
       i.d = p2;
       i.e = p3;
       i.f = p4;
       i.g = p5;
       i.h = p6;
       i.i = p7;
       i.j = p8;
       i.k = p9;
       i.l = p10;
       i.m = p11;
       i.n = p12;
       i.o = p13;
       i.p = p14;
       i.q = p15;
       i.r = p16;
       i.s = p17;
       i.t = p18;
       i.u = p19;
       i.v = p20;
       i.w = p21;
       i.x = p22;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof qx5) {
          return false;
       }
       if (!this.b.equals(p0.b) || (!this.c.equals(p0.c) || (!this.d.equals(p0.d) || (!this.e.equals(p0.e) || (!this.f.equals(p0.f) || (!this.g.equals(p0.g) || (!this.h.equals(p0.h) || (!this.i.equals(p0.i) || (!this.j.equals(p0.j) || (!this.k.equals(p0.k) || (!this.l.equals(p0.l) || (!this.m.equals(p0.m) || (!this.n.equals(p0.n) || (!this.o.equals(p0.o) || (!this.p.equals(p0.p) || (!this.q.equals(p0.q) || (!this.r.equals(p0.r) || (!this.s.equals(p0.s) || (!this.t.equals(p0.t) || (!this.u.equals(p0.u) || (!this.v.equals(p0.v) || (!this.w.equals(p0.w) || !this.x.equals(p0.x))))))))))))))))))))))) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return (((((((((((((((((((((((((((((((((((((((((((((this.b.hashCode() ^ 0xf4243) * 0xf4243) ^ this.c.hashCode()) * 0xf4243) ^ this.d.hashCode()) * 0xf4243) ^ this.e.hashCode()) * 0xf4243) ^ this.f.hashCode()) * 0xf4243) ^ this.g.hashCode()) * 0xf4243) ^ this.h.hashCode()) * 0xf4243) ^ this.i.hashCode()) * 0xf4243) ^ this.j.hashCode()) * 0xf4243) ^ this.k.hashCode()) * 0xf4243) ^ this.l.hashCode()) * 0xf4243) ^ this.m.hashCode()) * 0xf4243) ^ this.n.hashCode()) * 0xf4243) ^ this.o.hashCode()) * 0xf4243) ^ this.p.hashCode()) * 0xf4243) ^ this.q.hashCode()) * 0xf4243) ^ this.r.hashCode()) * 0xf4243) ^ this.s.hashCode()) * 0xf4243) ^ this.t.hashCode()) * 0xf4243) ^ this.u.hashCode()) * 0xf4243) ^ this.v.hashCode()) * 0xf4243) ^ this.w.hashCode()) * 0xf4243) ^ this.x.hashCode());
    }
    public final String toString(){
       return "Restrictions{disallowPausingReasons="+this.b+", disallowResumingReasons="+this.c+", disallowSeekingReasons="+this.d+", disallowPeekingPrevReasons="+this.e+", disallowPeekingNextReasons="+this.f+", disallowSkippingPrevReasons="+this.g+", disallowSkippingNextReasons="+this.h+", disallowTogglingRepeatContextReasons="+this.i+", disallowTogglingRepeatTrackReasons="+this.j+", disallowTogglingShuffleReasons="+this.k+", disallowSetQueueReasons="+this.l+", disallowAddToQueueReasons="+this.m+", disallowInterruptingPlaybackReasons="+this.n+", disallowTransferringPlaybackReasons="+this.o+", disallowRemoteControlReasons="+this.p+", disallowInsertingIntoNextTracksReasons="+this.q+", disallowInsertingIntoContextTracksReasons="+this.r+", disallowReorderingInNextTracksReasons="+this.s+", disallowReorderingInContextTracksReasons="+this.t+", disallowRemovingFromNextTracksReasons="+this.u+", disallowRemovingFromContextTracksReasons="+this.v+", disallowUpdatingContextReasons="+this.w+", disallowSettingPlaybackSpeedReasons="+this.x+"}";
    }
}
