package p.zt;
import java.lang.String;
import java.lang.Object;
import java.lang.Float;
import java.lang.StringBuilder;
import p.en6;

public final class zt	// class@002f65 from classes.dex
{
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final float f;
    public final long g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;

    public void zt(String p0,String p1,String p2,long p3,long p4,float p5,long p6,boolean p7,boolean p8,boolean p9,boolean p10,boolean p11,boolean p12,boolean p13,boolean p14,boolean p15,boolean p16){
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
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof zt) {
          return false;
       }
       if (!this.a.equals(p0.a) || (!this.b.equals(p0.b) || (!this.c.equals(p0.c) || ((this.d - p0.d) || ((this.e - p0.e) || (Float.floatToIntBits(this.f) != Float.floatToIntBits(p0.f) || ((this.g - p0.g) || (this.h != p0.h || (this.i != p0.i || (this.j != p0.j || (this.k != p0.k || (this.l != p0.l || (this.m != p0.m || (this.n != p0.n || (this.o != p0.o || (this.p != p0.p || this.q != p0.q)))))))))))))))) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       int i = 0xf4243;
       zt td = this.d;
       td = this.e;
       td = this.g;
       int i1 = (((((((((((((this.a.hashCode() ^ i) * i) ^ this.b.hashCode()) * i) ^ this.c.hashCode()) * i) ^ (int)(td ^ (td >> 32))) * i) ^ (int)(td ^ (td >> 32))) * i) ^ Float.floatToIntBits(this.f)) * i) ^ (int)(td ^ (td >> 32))) * i;
       int i2 = 1231;
       int i3 = (this.h != null)? 1231: 1237;
       i1 = (i1 ^ i3) * i;
       i3 = (this.i != null)? 1231: 1237;
       i1 = (i1 ^ i3) * i;
       i3 = (this.j != null)? 1231: 1237;
       i1 = (i1 ^ i3) * i;
       i3 = (this.k != null)? 1231: 1237;
       i1 = (i1 ^ i3) * i;
       i3 = (this.l != null)? 1231: 1237;
       i1 = (i1 ^ i3) * i;
       i3 = (this.m != null)? 1231: 1237;
       i1 = (i1 ^ i3) * i;
       i3 = (this.n != null)? 1231: 1237;
       i1 = (i1 ^ i3) * i;
       i3 = (this.o != null)? 1231: 1237;
       i1 = (i1 ^ i3) * i;
       i3 = (this.p != null)? 1231: 1237;
       i1 = (i1 ^ i3) * i;
       if (this.q == null) {
          i2 = 1237;
       }
       return (i1 ^ i2);
    }
    public final String toString(){
       return en6.q("Model{trackUri="+this.a+", title="+this.b+", artist="+this.c+", trackDurationMs="+this.d+", trackPositionMs="+this.e+", trackPlaybackSpeed="+this.f+", trackPositionTimestamp="+this.g+", isFavorite="+this.h+", isVisible="+this.i+", isPlaying="+this.j+", isBuffering="+this.k+", isWaiting="+this.l+", isWaitingForPlaying="+this.m+", isPlayPauseEnabled="+this.n+", isFavoritingEnabled="+this.o+", isSkipNextEnabled="+this.p+", isSkipLimitReached=", this.q, "}");
    }
}
