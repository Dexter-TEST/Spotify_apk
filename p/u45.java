package p.u45;
import android.content.Context;
import android.graphics.Bitmap$Config;
import android.graphics.ColorSpace;
import p.fl6;
import java.lang.String;
import p.mp2;
import p.zz6;
import p.n75;
import java.lang.Object;
import java.lang.Class;
import p.co5;
import android.os.Build$VERSION;
import p.en6;

public final class u45	// class@00283f from classes.dex
{
    public final Context a;
    public final Bitmap$Config b;
    public final ColorSpace c;
    public final fl6 d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final String i;
    public final mp2 j;
    public final zz6 k;
    public final n75 l;
    public final int m;
    public final int n;
    public final int o;

    public void u45(Context p0,Bitmap$Config p1,ColorSpace p2,fl6 p3,int p4,boolean p5,boolean p6,boolean p7,String p8,mp2 p9,zz6 p10,n75 p11,int p12,int p13,int p14){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       this.h = p7;
       this.i = p8;
       this.j = p9;
       this.k = p10;
       this.l = p11;
       this.m = p12;
       this.n = p13;
       this.o = p14;
    }
    public static u45 a(u45 p0,Bitmap$Config p1){
       u45 ou45 = p0;
       p0.getClass();
       ou45 = new u45(ou45.a, p1, ou45.c, ou45.d, ou45.e, ou45.f, ou45.g, ou45.h, ou45.i, ou45.j, ou45.k, ou45.l, ou45.m, ou45.n, ou45.o);
       return v16;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof u45 || (!co5.c(this.a, p0.a) || (this.b != p0.b || (Build$VERSION.SDK_INT >= 26 || (co5.c(this.c, p0.c) && (co5.c(this.d, p0.d) && (this.e == p0.e && (this.f == p0.f && (this.g == p0.g && (this.h == p0.h && (co5.c(this.i, p0.i) && (co5.c(this.j, p0.j) && (co5.c(this.k, p0.k) && (co5.c(this.l, p0.l) && (this.m == p0.m && (this.n == p0.n && this.o == p0.o)))))))))))))))) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       u45 tc;
       int i = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
       int i1 = 0;
       int i2 = ((tc = this.c) != null)? tc.hashCode(): 0;
       i = (en6.A(this.e) + ((this.d.hashCode() + ((i + i2) * 31)) * 31)) * 31;
       int i3 = 1237;
       i2 = (this.f != null)? 1231: 1237;
       i = (i + i2) * 31;
       i2 = (this.g != null)? 1231: 1237;
       i = (i + i2) * 31;
       if (this.h != null) {
          i3 = 1231;
       }
       i = (i + i3) * 31;
       if ((tc = this.i) != null) {
          i1 = tc.hashCode();
       }
       return (en6.A(this.o) + ((en6.A(this.n) + ((en6.A(this.m) + ((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((i + i1) * 31)) * 31)) * 31)) * 31)) * 31)) * 31));
    }
}
