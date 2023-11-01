package p.n63;
import android.content.Context;
import java.lang.Object;
import p.d07;
import p.m63;
import p.x54;
import java.lang.String;
import android.graphics.Bitmap$Config;
import android.graphics.ColorSpace;
import p.t65;
import p.y10;
import java.util.List;
import p.f87;
import p.mp2;
import p.zz6;
import p.zw0;
import p.vj3;
import p.gl6;
import p.n75;
import java.lang.Integer;
import android.graphics.drawable.Drawable;
import p.a91;
import p.a81;
import p.co5;
import android.os.Build$VERSION;
import p.en6;
import p.kg4;

public final class n63	// class@001f76 from classes.dex
{
    public final vj3 A;
    public final gl6 B;
    public final int C;
    public final n75 D;
    public final x54 E;
    public final Integer F;
    public final Drawable G;
    public final Integer H;
    public final Drawable I;
    public final Integer J;
    public final Drawable K;
    public final a91 L;
    public final a81 M;
    public final Context a;
    public final Object b;
    public final d07 c;
    public final m63 d;
    public final x54 e;
    public final String f;
    public final Bitmap$Config g;
    public final ColorSpace h;
    public final int i;
    public final t65 j;
    public final y10 k;
    public final List l;
    public final f87 m;
    public final mp2 n;
    public final zz6 o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final int t;
    public final int u;
    public final int v;
    public final zw0 w;
    public final zw0 x;
    public final zw0 y;
    public final zw0 z;

    public void n63(Context p0,Object p1,d07 p2,m63 p3,x54 p4,String p5,Bitmap$Config p6,ColorSpace p7,int p8,t65 p9,y10 p10,List p11,f87 p12,mp2 p13,zz6 p14,boolean p15,boolean p16,boolean p17,boolean p18,int p19,int p20,int p21,zw0 p22,zw0 p23,zw0 p24,zw0 p25,vj3 p26,gl6 p27,int p28,n75 p29,x54 p30,Integer p31,Drawable p32,Integer p33,Drawable p34,Integer p35,Drawable p36,a91 p37,a81 p38){
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
       i.J = p35;
       i.K = p36;
       i.L = p37;
       i.M = p38;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof n63 || (!co5.c(this.a, p0.a) || (!co5.c(this.b, p0.b) || (!co5.c(this.c, p0.c) || (!co5.c(this.d, p0.d) || (!co5.c(this.e, p0.e) || (!co5.c(this.f, p0.f) || (this.g != p0.g || (Build$VERSION.SDK_INT >= 26 || (co5.c(this.h, p0.h) && (this.i == p0.i && (co5.c(this.j, p0.j) && (co5.c(this.k, p0.k) && (co5.c(this.l, p0.l) && (co5.c(this.m, p0.m) && (co5.c(this.n, p0.n) && (co5.c(this.o, p0.o) && (this.p == p0.p && (this.q == p0.q && (this.r == p0.r && (this.s == p0.s && (this.t == p0.t && (this.u == p0.u && (this.v == p0.v && (co5.c(this.w, p0.w) && (co5.c(this.x, p0.x) && (co5.c(this.y, p0.y) && (co5.c(this.z, p0.z) && (co5.c(this.E, p0.E) && (co5.c(this.F, p0.F) && (co5.c(this.G, p0.G) && (co5.c(this.H, p0.H) && (co5.c(this.I, p0.I) && (co5.c(this.J, p0.J) && (co5.c(this.K, p0.K) && (co5.c(this.A, p0.A) && (co5.c(this.B, p0.B) && (this.C == p0.C && (co5.c(this.D, p0.D) && (co5.c(this.L, p0.L) && co5.c(this.M, p0.M))))))))))))))))))))))))))))))))))))))))) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       n63 tc;
       n63 th;
       int i = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
       int i1 = 0;
       int i2 = ((tc = this.c) != null)? tc.hashCode(): 0;
       i = (i + i2) * 31;
       i2 = ((tc = this.d) != null)? tc.hashCode(): 0;
       i = (i + i2) * 31;
       i2 = ((tc = this.e) != null)? tc.hashCode(): 0;
       i = (i + i2) * 31;
       i2 = ((tc = this.f) != null)? tc.hashCode(): 0;
       i2 = (this.g.hashCode() + ((i + i2) * 31)) * 31;
       i = ((th = this.h) != null)? th.hashCode(): 0;
       i = (en6.A(this.i) + ((i2 + i) * 31)) * 31;
       i2 = ((tc = this.j) != null)? tc.hashCode(): 0;
       i = (i + i2) * 31;
       i2 = ((tc = this.k) != null)? tc.hashCode(): 0;
       i2 = (this.o.hashCode() + ((this.n.hashCode() + ((this.m.hashCode() + kg4.j(this.l, ((i + i2) * 31), 31)) * 31)) * 31)) * 31;
       int i3 = 1237;
       i = (this.p != null)? 1231: 1237;
       i2 = (i2 + i) * 31;
       i = (this.q != null)? 1231: 1237;
       i2 = (i2 + i) * 31;
       i = (this.r != null)? 1231: 1237;
       i2 = (i2 + i) * 31;
       if (this.s != null) {
          i3 = 1231;
       }
       i = (this.D.hashCode() + ((en6.A(this.C) + ((this.B.hashCode() + ((this.A.hashCode() + ((this.z.hashCode() + ((this.y.hashCode() + ((this.x.hashCode() + ((this.w.hashCode() + ((en6.A(this.v) + ((en6.A(this.u) + ((en6.A(this.t) + ((i2 + i3) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
       i2 = ((tc = this.E) != null)? tc.hashCode(): 0;
       i = (i + i2) * 31;
       i2 = ((tc = this.F) != null)? tc.hashCode(): 0;
       i = (i + i2) * 31;
       i2 = ((tc = this.G) != null)? tc.hashCode(): 0;
       i = (i + i2) * 31;
       i2 = ((tc = this.H) != null)? tc.hashCode(): 0;
       i = (i + i2) * 31;
       i2 = ((tc = this.I) != null)? tc.hashCode(): 0;
       i = (i + i2) * 31;
       i2 = ((tc = this.J) != null)? tc.hashCode(): 0;
       i = (i + i2) * 31;
       if ((tc = this.K) != null) {
          i1 = tc.hashCode();
       }
       return (this.M.hashCode() + ((this.L.hashCode() + ((i + i1) * 31)) * 31));
    }
}
