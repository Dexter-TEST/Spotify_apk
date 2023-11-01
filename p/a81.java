package p.a81;
import p.zw0;
import p.f87;
import android.graphics.Bitmap$Config;
import android.graphics.drawable.Drawable;
import java.lang.Object;
import java.lang.Class;
import p.co5;
import p.en6;

public final class a81	// class@000f2f from classes.dex
{
    public final zw0 a;
    public final zw0 b;
    public final zw0 c;
    public final zw0 d;
    public final f87 e;
    public final int f;
    public final Bitmap$Config g;
    public final boolean h;
    public final boolean i;
    public final Drawable j;
    public final Drawable k;
    public final Drawable l;
    public final int m;
    public final int n;
    public final int o;

    public void a81(zw0 p0,zw0 p1,zw0 p2,zw0 p3,f87 p4,int p5,Bitmap$Config p6,boolean p7,boolean p8,Drawable p9,Drawable p10,Drawable p11,int p12,int p13,int p14){
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
    public static a81 a(a81 p0,int p1,boolean p2,int p3){
       a81 uoa81 = p0;
       int i = p3;
       int i1 = 0;
       a81 uoa811 = ((i & 0x01))? uoa81.a: i1;
       a81 uoa812 = ((i & 0x02))? uoa81.b: i1;
       a81 uoa813 = ((i & 0x04))? uoa81.c: i1;
       a81 uoa814 = ((i & 0x08))? uoa81.d: i1;
       a81 uoa815 = ((i & 0x10))? uoa81.e: i1;
       a81 uoa816 = ((i & 0x20))? uoa81.f: p1;
       a81 uoa817 = ((i & 0x40))? uoa81.g: i1;
       a81 uoa818 = ((i & 0x0080))? uoa81.h: p2;
       a81 uoa819 = ((i & 0x0100))? uoa81.i: false;
       a81 uoa8110 = ((i & 0x0200))? uoa81.j: i1;
       a81 uoa8111 = ((i & 0x0400))? uoa81.k: i1;
       if ((i & 0x0800)) {
          i1 = uoa81.l;
       }
       a81 uoa8112 = i1;
       a81 uoa8113 = ((i & 0x1000))? uoa81.m: 0;
       a81 uoa8114 = ((i & 0x2000))? uoa81.n: 0;
       a81 uoa8115 = ((i & 0x4000))? uoa81.o: 0;
       p0.getClass();
       uoa81 = new a81(uoa811, uoa812, uoa813, uoa814, uoa815, uoa816, uoa817, uoa818, uoa819, uoa8110, uoa8111, uoa8112, uoa8113, uoa8114, uoa8115);
       return uoa81;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof a81 || (!co5.c(this.a, p0.a) || (!co5.c(this.b, p0.b) || (!co5.c(this.c, p0.c) || (!co5.c(this.d, p0.d) || (!co5.c(this.e, p0.e) || (this.f != p0.f || (this.g != p0.g || (this.h != p0.h || (this.i != p0.i || (!co5.c(this.j, p0.j) || (!co5.c(this.k, p0.k) || (!co5.c(this.l, p0.l) || (this.m != p0.m || (this.n != p0.n || this.o != p0.o))))))))))))))) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       a81 tj;
       int i = (this.g.hashCode() + ((en6.A(this.f) + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
       int i1 = 1237;
       int i2 = (this.h != null)? 1231: 1237;
       i = (i + i2) * 31;
       if (this.i != null) {
          i1 = 1231;
       }
       i = (i + i1) * 31;
       i2 = 0;
       i1 = ((tj = this.j) != null)? tj.hashCode(): 0;
       i = (i + i1) * 31;
       i1 = ((tj = this.k) != null)? tj.hashCode(): 0;
       i = (i + i1) * 31;
       if ((tj = this.l) != null) {
          i2 = tj.hashCode();
       }
       return (en6.A(this.o) + ((en6.A(this.n) + ((en6.A(this.m) + ((i + i2) * 31)) * 31)) * 31));
    }
}
