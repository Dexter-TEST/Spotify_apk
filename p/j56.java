package p.j56;
import p.g56;
import com.spotify.lite.database.room.MetadataRoomDatabase;
import p.h56;
import p.xy5;
import p.i56;
import java.lang.String;
import p.hv;
import java.lang.Object;
import com.spotify.base.java.logging.Logger;
import p.uw6;
import p.uy;
import p.sw6;
import java.lang.Integer;

public final class j56 extends g56	// class@001a6f from classes.dex
{
    public final h56 A;
    public final h56 B;
    public final h56 C;
    public final h56 D;
    public final h56 E;
    public final h56 F;
    public final h56 G;
    public final h56 H;
    public final h56 I;
    public final h56 J;
    public final h56 K;
    public final h56 L;
    public final h56 M;
    public final MetadataRoomDatabase c;
    public final h56 d;
    public final h56 e;
    public final h56 f;
    public final i56 g;
    public final i56 h;
    public final i56 i;
    public final i56 j;
    public final i56 k;
    public final i56 l;
    public final h56 m;
    public final h56 n;
    public final h56 o;
    public final h56 p;
    public final h56 q;
    public final h56 r;
    public final h56 s;
    public final h56 t;
    public final h56 u;
    public final h56 v;
    public final h56 w;
    public final h56 x;
    public final h56 y;
    public final h56 z;

    public void j56(MetadataRoomDatabase p0){
       super(p0);
       this.c = p0;
       this.d = new h56(p0, 10);
       this.e = new h56(p0, 21);
       this.f = new h56(p0, 29);
       this.g = new i56(p0, 0);
       this.h = new i56(p0, 1);
       this.i = new i56(p0, 2);
       this.j = new i56(p0, 3);
       this.k = new i56(p0, 4);
       this.l = new i56(p0, 5);
       this.m = new h56(p0, 0);
       this.n = new h56(p0, 1);
       this.o = new h56(p0, 2);
       this.p = new h56(p0, 3);
       this.q = new h56(p0, 4);
       this.r = new h56(p0, 5);
       this.s = new h56(p0, 6);
       this.t = new h56(p0, 7);
       this.u = new h56(p0, 8);
       this.v = new h56(p0, 9);
       this.w = new h56(p0, 11);
       this.x = new h56(p0, 12);
       this.y = new h56(p0, 13);
       this.z = new h56(p0, 14);
       this.A = new h56(p0, 15);
       this.B = new h56(p0, 16);
       this.C = new h56(p0, 17);
       this.D = new h56(p0, 18);
       this.E = new h56(p0, 19);
       this.F = new h56(p0, 20);
       this.G = new h56(p0, 22);
       this.H = new h56(p0, 23);
       this.I = new h56(p0, 24);
       this.J = new h56(p0, 25);
       this.K = new h56(p0, 26);
       this.L = new h56(p0, 27);
       this.M = new h56(p0, 28);
    }
    public static hv d(j56 p0,String p1,long p2){
       int i1;
       int i2;
       int i3;
       int i4;
       int i5;
       int i6;
       int i7;
       int i8;
       int i9;
       int i10;
       int i11;
       int i13;
       j56 h;
       uw6 ouw6;
       int i14;
       int i15;
       int i16;
       j56 u;
       uw6 ouw61;
       j56 o;
       uw6 ouw62;
       j56 oj56 = p0;
       String str = p1;
       long l = p2;
       hv ohv = p0.c(p1);
       hv a = ohv.a;
       hv b = ohv.b;
       hv c = ohv.c;
       hv d = ohv.d;
       hv e = ohv.e;
       hv f = ohv.f;
       int i = 0;
       if (!((((((a + b) + c) + d) + e) + f))) {
          Object[] objArray = new Object[i];
          Logger.e("No entities tagged, no work to do", objArray);
          p0.b();
       }else {
          j56 hv c1 = oj56.c;
          if (a == null) {
             i1 = 0;
          }else {
             c1.b();
             o = oj56.j;
             ouw62 = o.c();
             if (str == null) {
                ouw62.z(1);
             }else {
                ouw62.s(1, str);
             }
             c1.c();
             i1 = ouw62.u();
             c1.r();
             c1.m();
             o.f(ouw62);
          }
          if (b == null) {
             i2 = 0;
          }else {
             c1.b();
             o = oj56.k;
             ouw62 = o.c();
             if (str == null) {
                ouw62.z(1);
             }else {
                ouw62.s(1, str);
             }
             c1.c();
             i2 = ouw62.u();
             c1.r();
             c1.m();
             o.f(ouw62);
          }
          if (c == null) {
             i3 = 0;
          }else {
             c1.b();
             o = oj56.l;
             ouw62 = o.c();
             if (str == null) {
                ouw62.z(1);
             }else {
                ouw62.s(1, str);
             }
             c1.c();
             i3 = ouw62.u();
             c1.r();
             c1.m();
             o.f(ouw62);
          }
          if (d == null) {
             i4 = 0;
          }else {
             c1.b();
             o = oj56.m;
             ouw62 = o.c();
             if (str == null) {
                ouw62.z(1);
             }else {
                ouw62.s(1, str);
             }
             c1.c();
             i4 = ouw62.u();
             c1.r();
             c1.m();
             o.f(ouw62);
          }
          if (e == null) {
             i5 = 0;
          }else {
             c1.b();
             o = oj56.n;
             ouw62 = o.c();
             if (str == null) {
                ouw62.z(1);
             }else {
                ouw62.s(1, str);
             }
             c1.c();
             i5 = ouw62.u();
             c1.r();
             c1.m();
             o.f(ouw62);
          }
          if (f == null) {
             i6 = 0;
          }else {
             c1.b();
             o = oj56.o;
             ouw62 = o.c();
             if (str == null) {
                ouw62.z(1);
             }else {
                ouw62.s(1, str);
             }
             c1.c();
             i6 = ouw62.u();
             c1.r();
             c1.m();
             o.f(ouw62);
          }
          Object[] objArray1 = new Object[]{Integer.valueOf(i1),Integer.valueOf(i2),Integer.valueOf(i3),Integer.valueOf(i4),Integer.valueOf(i5),Integer.valueOf(i6)};
          Logger.e("Kept %d favorite albums, %d favorite artists, %d favorite episodes, %d favorite playlists, %d favorite shows and %d favorite tracks", objArray1);
          if (a == null) {
             i6 = 0;
          }else {
             c1.b();
             u = oj56.p;
             ouw61 = u.c();
             if (str == null) {
                ouw61.z(1);
             }else {
                ouw61.s(1, str);
             }
             ouw61.P(2, l);
             c1.c();
             i6 = ouw61.u();
             c1.r();
             c1.m();
             u.f(ouw61);
          }
          if (b == null) {
             i7 = 0;
          }else {
             c1.b();
             u = oj56.q;
             ouw61 = u.c();
             if (str == null) {
                ouw61.z(1);
             }else {
                ouw61.s(1, str);
             }
             ouw61.P(2, l);
             c1.c();
             i7 = ouw61.u();
             c1.r();
             c1.m();
             u.f(ouw61);
          }
          if (c == null) {
             i8 = 0;
          }else {
             c1.b();
             u = oj56.r;
             ouw61 = u.c();
             if (str == null) {
                ouw61.z(1);
             }else {
                ouw61.s(1, str);
             }
             ouw61.P(2, l);
             c1.c();
             i8 = ouw61.u();
             c1.r();
             c1.m();
             u.f(ouw61);
          }
          if (d == null) {
             i9 = 0;
          }else {
             c1.b();
             u = oj56.s;
             ouw61 = u.c();
             if (str == null) {
                ouw61.z(1);
             }else {
                ouw61.s(1, str);
             }
             ouw61.P(2, l);
             c1.c();
             i9 = ouw61.u();
             c1.r();
             c1.m();
             u.f(ouw61);
          }
          if (e == null) {
             i10 = 0;
          }else {
             c1.b();
             u = oj56.t;
             ouw61 = u.c();
             if (str == null) {
                ouw61.z(1);
             }else {
                ouw61.s(1, str);
             }
             ouw61.P(2, l);
             c1.c();
             i10 = ouw61.u();
             c1.r();
             c1.m();
             u.f(ouw61);
          }
          if (f == null) {
             i11 = 0;
          }else {
             c1.b();
             u = oj56.u;
             ouw61 = u.c();
             if (str == null) {
                ouw61.z(1);
             }else {
                ouw61.s(1, str);
             }
             ouw61.P(2, l);
             c1.c();
             i11 = ouw61.u();
             c1.r();
             c1.m();
             u.f(ouw61);
          }
          int i12 = 6;
          objArray1 = new Object[i12];
          objArray1[0] = Integer.valueOf(i6);
          objArray1[1] = Integer.valueOf(i7);
          objArray1[2] = Integer.valueOf(i8);
          objArray1[3] = Integer.valueOf(i9);
          objArray1[4] = Integer.valueOf(i10);
          objArray1[5] = Integer.valueOf(i11);
          Logger.e("Kept %d recent albums, %d recent artists, %d recent episodes, %d recent playlists, %d recent shows and %d recent tracks", objArray1);
          if (a == null) {
             i13 = 0;
          }else {
             c1.b();
             h = oj56.v;
             ouw6 = h.c();
             c1.c();
             i13 = ouw6.u();
             c1.r();
             c1.m();
             h.f(ouw6);
          }
          if (a == null) {
             i1 = 0;
          }else {
             c1.b();
             h = oj56.w;
             ouw6 = h.c();
             c1.c();
             i1 = ouw6.u();
             c1.r();
             c1.m();
             h.f(ouw6);
          }
          if (b == null) {
             i6 = 0;
          }else {
             c1.b();
             h = oj56.x;
             ouw6 = h.c();
             c1.c();
             i6 = ouw6.u();
             c1.r();
             c1.m();
             h.f(ouw6);
          }
          if (d == null) {
             i7 = 0;
          }else {
             c1.b();
             h = oj56.y;
             ouw6 = h.c();
             c1.c();
             i7 = ouw6.u();
             c1.r();
             c1.m();
             h.f(ouw6);
          }
          if (d == null) {
             i8 = 0;
          }else {
             c1.b();
             h = oj56.z;
             ouw6 = h.c();
             c1.c();
             i8 = ouw6.u();
             c1.r();
             c1.m();
             h.f(ouw6);
          }
          if (e == null) {
             i11 = 6;
             i9 = 0;
          }else {
             c1.b();
             h = oj56.A;
             ouw6 = h.c();
             c1.c();
             i9 = ouw6.u();
             c1.r();
             c1.m();
             h.f(ouw6);
             i11 = 6;
          }
          Object[] objArray2 = new Object[i11];
          objArray2[0] = Integer.valueOf(i13);
          objArray2[1] = Integer.valueOf(i1);
          objArray2[2] = Integer.valueOf(i6);
          objArray2[3] = Integer.valueOf(i7);
          objArray2[4] = Integer.valueOf(i8);
          objArray2[5] = Integer.valueOf(i9);
          Logger.e("Kept %d album tracks, %d album artists, %d artist tracks, %d playlist tracks, %d playlist episodes and %d show episodes", objArray2);
          if (a != null) {
             c1.b();
             h = oj56.H;
             ouw6 = h.c();
             if (!str) {
                ouw6.z(1);
             }else {
                ouw6.s(1, str);
             }
             c1.c();
             i14 = ouw6.u();
             c1.r();
             c1.m();
             h.f(ouw6);
             c1.b();
             h = oj56.B;
             ouw6 = h.c();
             if (!str) {
                ouw6.z(1);
             }else {
                ouw6.s(1, str);
             }
             c1.c();
             c1.r();
             c1.m();
             h.f(ouw6);
             i1 = i14;
             i7 = ouw6.u();
          }else {
             i1 = 0;
             i7 = 0;
          }
          if (b != null) {
             c1.b();
             h = oj56.I;
             ouw6 = h.c();
             if (!str) {
                ouw6.z(1);
             }else {
                ouw6.s(1, str);
             }
             c1.c();
             i14 = ouw6.u();
             c1.r();
             c1.m();
             h.f(ouw6);
             c1.b();
             h = oj56.C;
             ouw6 = h.c();
             if (!str) {
                ouw6.z(1);
             }else {
                ouw6.s(1, str);
             }
             c1.c();
             c1.r();
             c1.m();
             h.f(ouw6);
             i8 = ouw6.u();
          }else {
             i14 = 0;
             i8 = 0;
          }
          if (c != null) {
             c1.b();
             h = oj56.J;
             ouw6 = h.c();
             if (!str) {
                ouw6.z(1);
             }else {
                ouw6.s(1, str);
             }
             c1.c();
             i13 = ouw6.u();
             c1.r();
             c1.m();
             h.f(ouw6);
             c1.b();
             h = oj56.D;
             ouw6 = h.c();
             if (!str) {
                ouw6.z(1);
             }else {
                ouw6.s(1, str);
             }
             c1.c();
             c1.r();
             c1.m();
             h.f(ouw6);
             i9 = ouw6.u();
          }else {
             i13 = 0;
             i9 = 0;
          }
          if (d != null) {
             c1.b();
             h = oj56.K;
             ouw6 = h.c();
             if (!str) {
                ouw6.z(1);
             }else {
                ouw6.s(1, str);
             }
             c1.c();
             i13 = ouw6.u();
             c1.r();
             c1.m();
             h.f(ouw6);
             c1.b();
             h = oj56.E;
             ouw6 = h.c();
             if (!str) {
                ouw6.z(1);
             }else {
                ouw6.s(1, str);
             }
             c1.c();
             c1.r();
             c1.m();
             h.f(ouw6);
             i10 = ouw6.u();
          }else {
             i13 = 0;
             i10 = 0;
          }
          if (e != null) {
             c1.b();
             h = oj56.L;
             ouw6 = h.c();
             if (!str) {
                ouw6.z(1);
             }else {
                ouw6.s(1, str);
             }
             c1.c();
             i13 = ouw6.u();
             c1.r();
             c1.m();
             h.f(ouw6);
             c1.b();
             h = oj56.F;
             ouw6 = h.c();
             if (!str) {
                ouw6.z(1);
             }else {
                ouw6.s(1, str);
             }
             c1.c();
             c1.r();
             c1.m();
             h.f(ouw6);
             i15 = ouw6.u();
          }else {
             i13 = 0;
             i15 = 0;
          }
          if (f != null) {
             c1.b();
             h = oj56.G;
             ouw6 = h.c();
             if (!str) {
                ouw6.z(1);
             }else {
                ouw6.s(1, str);
             }
             c1.c();
             c1.r();
             c1.m();
             h.f(ouw6);
             i16 = ouw6.u();
             i13 = 6;
          }else {
             int i17 = 6;
             i16 = 0;
          }
          Object[] objArray3 = new Object[i13];
          objArray3[0] = Integer.valueOf(i7);
          objArray3[1] = Integer.valueOf(i8);
          objArray3[2] = Integer.valueOf(i9);
          objArray3[3] = Integer.valueOf(i10);
          objArray3[4] = Integer.valueOf(i15);
          objArray3[5] = Integer.valueOf(i16);
          Logger.e("Scrubbed %d albums, %d artists, %d episodes, %d playlists, %d shows and %d tracks", objArray3);
          objArray3 = new Object[]{Integer.valueOf(i1),Integer.valueOf(i14),Integer.valueOf(i13),Integer.valueOf(i13),Integer.valueOf(i13)};
          Logger.e("Scrubbed %d album, %d artist, %d episode, %d playlist and %d show image\(s\)", objArray3);
          c1 = new hv(i7, i8, i9, i10, i15, i16);
          p0.b();
          oj56.c(null);
       }
       return ohv;
    }
}
