package p.cu;
import java.lang.String;
import p.r45;
import p.mo;
import java.lang.Object;
import java.lang.Float;
import java.lang.StringBuilder;

public final class cu	// class@001280 from classes.dex
{
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final boolean D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final int H;
    public final mo I;
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final long j;
    public final long k;
    public final float l;
    public final long m;
    public final r45 n;
    public final r45 o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    public void cu(String p0,String p1,int p2,String p3,String p4,String p5,String p6,String p7,String p8,long p9,long p10,float p11,long p12,r45 p13,r45 p14,boolean p15,boolean p16,boolean p17,boolean p18,boolean p19,boolean p20,boolean p21,boolean p22,boolean p23,boolean p24,boolean p25,boolean p26,boolean p27,boolean p28,boolean p29,boolean p30,boolean p31,boolean p32,int p33,mo p34){
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
       i.B = p27;
       i.C = p28;
       i.D = p29;
       i.E = p30;
       i.F = p31;
       i.G = p32;
       i.H = p33;
       i.I = p34;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof cu) {
          return false;
       }
       if (!this.a.equals(p0.a) || (!this.b.equals(p0.b) || (this.c != p0.c || (!this.d.equals(p0.d) || (!this.e.equals(p0.e) || (!this.f.equals(p0.f) || (!this.g.equals(p0.g) || (!this.h.equals(p0.h) || (!this.i.equals(p0.i) || ((this.j - p0.j) || ((this.k - p0.k) || (Float.floatToIntBits(this.l) != Float.floatToIntBits(p0.l) || ((this.m - p0.m) || (!this.n.equals(p0.n) || (!this.o.equals(p0.o) || (this.p != p0.p || (this.q != p0.q || (this.r != p0.r || (this.s != p0.s || (this.t != p0.t || (this.u != p0.u || (this.v != p0.v || (this.w != p0.w || (this.x != p0.x || (this.y != p0.y || (this.z != p0.z || (this.A != p0.A || (this.B != p0.B || (this.C != p0.C || (this.D != p0.D || (this.E != p0.E || (this.F != p0.F || (this.G != p0.G || (this.H != p0.H || !this.I.equals(p0.I))))))))))))))))))))))))))))))))))) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       int i = 0xf4243;
       cu tj = this.j;
       tj = this.k;
       tj = this.m;
       int i1 = (((((((((((((((((((((((((((((this.a.hashCode() ^ i) * i) ^ this.b.hashCode()) * i) ^ this.c) * i) ^ this.d.hashCode()) * i) ^ this.e.hashCode()) * i) ^ this.f.hashCode()) * i) ^ this.g.hashCode()) * i) ^ this.h.hashCode()) * i) ^ this.i.hashCode()) * i) ^ (int)(tj ^ (tj >> 32))) * i) ^ (int)(tj ^ (tj >> 32))) * i) ^ Float.floatToIntBits(this.l)) * i) ^ (int)(tj ^ (tj >> 32))) * i) ^ this.n.hashCode()) * i) ^ this.o.hashCode()) * i;
       int i2 = 1231;
       int i3 = (this.p != null)? 1231: 1237;
       i1 = (i1 ^ i3) * i;
       i3 = (this.q != null)? 1231: 1237;
       i1 = (i1 ^ i3) * i;
       i3 = (this.r != null)? 1231: 1237;
       i1 = (i1 ^ i3) * i;
       i3 = (this.s != null)? 1231: 1237;
       i1 = (i1 ^ i3) * i;
       i3 = (this.t != null)? 1231: 1237;
       i1 = (i1 ^ i3) * i;
       i3 = (this.u != null)? 1231: 1237;
       i1 = (i1 ^ i3) * i;
       i3 = (this.v != null)? 1231: 1237;
       i1 = (i1 ^ i3) * i;
       i3 = (this.w != null)? 1231: 1237;
       i1 = (i1 ^ i3) * i;
       i3 = (this.x != null)? 1231: 1237;
       i1 = (i1 ^ i3) * i;
       i3 = (this.y != null)? 1231: 1237;
       i1 = (i1 ^ i3) * i;
       i3 = (this.z != null)? 1231: 1237;
       i1 = (i1 ^ i3) * i;
       i3 = (this.A != null)? 1231: 1237;
       i1 = (i1 ^ i3) * i;
       i3 = (this.B != null)? 1231: 1237;
       i1 = (i1 ^ i3) * i;
       i3 = (this.C != null)? 1231: 1237;
       i1 = (i1 ^ i3) * i;
       i3 = (this.D != null)? 1231: 1237;
       i1 = (i1 ^ i3) * i;
       i3 = (this.E != null)? 1231: 1237;
       i1 = (i1 ^ i3) * i;
       i3 = (this.F != null)? 1231: 1237;
       i1 = (i1 ^ i3) * i;
       if (this.G == null) {
          i2 = 1237;
       }
       return (((((i1 ^ i2) * i) ^ this.H) * i) ^ this.I.hashCode());
    }
    public final String toString(){
       return "NowPlayingMobiusModel{contextUri="+this.a+", contextName="+this.b+", contextTypeTitleRes="+this.c+", trackUri="+this.d+", trackTitle="+this.e+", trackArtistUri="+this.f+", trackArtist="+this.g+", trackAlbumUri="+this.h+", clickUri="+this.i+", trackDurationMs="+this.j+", trackPositionMs="+this.k+", trackPlaybackSpeed="+this.l+", trackPositionTimestamp="+this.m+", cover="+this.n+", colors="+this.o+", isSeeking="+this.p+", isPlaying="+this.q+", isShuffling="+this.r+", isRepeating="+this.s+", isBuffering="+this.t+", isFavorite="+this.u+", isAd="+this.v+", isPodcast="+this.w+", isPlayPauseEnabled="+this.x+", isSeekEnabled="+this.y+", isSkipPrevEnabled="+this.z+", isSkipNextEnabled="+this.A+", isSkipLimitReached="+this.B+", isSetShuffleModeEnabled="+this.C+", isSetRepeatAllEnabled="+this.D+", isSetRepeatOneEnabled="+this.E+", isFavoritingEnabled="+this.F+", canChangeAudioQuality="+this.G+", repeatMode="+this.H+", audioQuality="+this.I+"}";
    }
}
