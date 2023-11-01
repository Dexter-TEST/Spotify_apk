package p.bu;
import java.lang.Object;
import p.c0;
import p.cu;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Float;
import java.lang.Boolean;
import java.lang.String;
import p.kg4;
import p.r45;
import p.mo;
import java.lang.IllegalStateException;

public final class bu	// class@00113d from classes.dex
{
    public Boolean A;
    public Boolean B;
    public Boolean C;
    public Boolean D;
    public Boolean E;
    public Boolean F;
    public Boolean G;
    public Integer H;
    public mo I;
    public String a;
    public String b;
    public Integer c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public Long j;
    public Long k;
    public Float l;
    public Long m;
    public r45 n;
    public r45 o;
    public Boolean p;
    public Boolean q;
    public Boolean r;
    public Boolean s;
    public Boolean t;
    public Boolean u;
    public Boolean v;
    public Boolean w;
    public Boolean x;
    public Boolean y;
    public Boolean z;

    public void bu(){
       super();
       c0 a = c0.a;
       this.n = a;
       this.o = a;
    }
    public void bu(cu p0){
       super();
       c0 a = c0.a;
       this.n = a;
       this.o = a;
       this.a = p0.a;
       this.b = p0.b;
       this.c = Integer.valueOf(p0.c);
       this.d = p0.d;
       this.e = p0.e;
       this.f = p0.f;
       this.g = p0.g;
       this.h = p0.h;
       this.i = p0.i;
       this.j = Long.valueOf(p0.j);
       this.k = Long.valueOf(p0.k);
       this.l = Float.valueOf(p0.l);
       this.m = Long.valueOf(p0.m);
       this.n = p0.n;
       this.o = p0.o;
       this.p = Boolean.valueOf(p0.p);
       this.q = Boolean.valueOf(p0.q);
       this.r = Boolean.valueOf(p0.r);
       this.s = Boolean.valueOf(p0.s);
       this.t = Boolean.valueOf(p0.t);
       this.u = Boolean.valueOf(p0.u);
       this.v = Boolean.valueOf(p0.v);
       this.w = Boolean.valueOf(p0.w);
       this.x = Boolean.valueOf(p0.x);
       this.y = Boolean.valueOf(p0.y);
       this.z = Boolean.valueOf(p0.z);
       this.A = Boolean.valueOf(p0.A);
       this.B = Boolean.valueOf(p0.B);
       this.C = Boolean.valueOf(p0.C);
       this.D = Boolean.valueOf(p0.D);
       this.E = Boolean.valueOf(p0.E);
       this.F = Boolean.valueOf(p0.F);
       this.G = Boolean.valueOf(p0.G);
       this.H = Integer.valueOf(p0.H);
       this.I = p0.I;
    }
    public final cu a(){
       bu uobu = this;
       String str = (uobu.a == null)? " contextUri": "";
       if (uobu.b == null) {
          str = str.concat(" contextName");
       }
       if (uobu.c == null) {
          str = kg4.l(str, " contextTypeTitleRes");
       }
       if (uobu.d == null) {
          str = kg4.l(str, " trackUri");
       }
       if (uobu.e == null) {
          str = kg4.l(str, " trackTitle");
       }
       if (uobu.f == null) {
          str = kg4.l(str, " trackArtistUri");
       }
       if (uobu.g == null) {
          str = kg4.l(str, " trackArtist");
       }
       if (uobu.h == null) {
          str = kg4.l(str, " trackAlbumUri");
       }
       if (uobu.i == null) {
          str = kg4.l(str, " clickUri");
       }
       if (uobu.j == null) {
          str = kg4.l(str, " trackDurationMs");
       }
       if (uobu.k == null) {
          str = kg4.l(str, " trackPositionMs");
       }
       if (uobu.l == null) {
          str = kg4.l(str, " trackPlaybackSpeed");
       }
       if (uobu.m == null) {
          str = kg4.l(str, " trackPositionTimestamp");
       }
       if (uobu.p == null) {
          str = kg4.l(str, " isSeeking");
       }
       if (uobu.q == null) {
          str = kg4.l(str, " isPlaying");
       }
       if (uobu.r == null) {
          str = kg4.l(str, " isShuffling");
       }
       if (uobu.s == null) {
          str = kg4.l(str, " isRepeating");
       }
       if (uobu.t == null) {
          str = kg4.l(str, " isBuffering");
       }
       if (uobu.u == null) {
          str = kg4.l(str, " isFavorite");
       }
       if (uobu.v == null) {
          str = kg4.l(str, " isAd");
       }
       if (uobu.w == null) {
          str = kg4.l(str, " isPodcast");
       }
       if (uobu.x == null) {
          str = kg4.l(str, " isPlayPauseEnabled");
       }
       if (uobu.y == null) {
          str = kg4.l(str, " isSeekEnabled");
       }
       if (uobu.z == null) {
          str = kg4.l(str, " isSkipPrevEnabled");
       }
       if (uobu.A == null) {
          str = kg4.l(str, " isSkipNextEnabled");
       }
       if (uobu.B == null) {
          str = kg4.l(str, " isSkipLimitReached");
       }
       if (uobu.C == null) {
          str = kg4.l(str, " isSetShuffleModeEnabled");
       }
       if (uobu.D == null) {
          str = kg4.l(str, " isSetRepeatAllEnabled");
       }
       if (uobu.E == null) {
          str = kg4.l(str, " isSetRepeatOneEnabled");
       }
       if (uobu.F == null) {
          str = kg4.l(str, " isFavoritingEnabled");
       }
       if (uobu.G == null) {
          str = kg4.l(str, " canChangeAudioQuality");
       }
       if (uobu.H == null) {
          str = kg4.l(str, " repeatMode");
       }
       if (uobu.I == null) {
          str = kg4.l(str, " audioQuality");
       }
       if (str.isEmpty()) {
          cu str1 = new cu(uobu.a, uobu.b, uobu.c.intValue(), uobu.d, uobu.e, uobu.f, uobu.g, uobu.h, uobu.i, uobu.j.longValue(), uobu.k.longValue(), uobu.l.floatValue(), uobu.m.longValue(), uobu.n, uobu.o, uobu.p.booleanValue(), uobu.q.booleanValue(), uobu.r.booleanValue(), uobu.s.booleanValue(), uobu.t.booleanValue(), uobu.u.booleanValue(), uobu.v.booleanValue(), uobu.w.booleanValue(), uobu.x.booleanValue(), uobu.y.booleanValue(), uobu.z.booleanValue(), uobu.A.booleanValue(), uobu.B.booleanValue(), uobu.C.booleanValue(), uobu.D.booleanValue(), uobu.E.booleanValue(), uobu.F.booleanValue(), uobu.G.booleanValue(), uobu.H.intValue(), uobu.I);
          return str;
       }else {
          throw new IllegalStateException("Missing required properties:".concat(str));
       }
    }
}
