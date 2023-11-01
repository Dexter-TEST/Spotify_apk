package p.a91;
import p.vj3;
import p.gl6;
import p.zw0;
import p.f87;
import android.graphics.Bitmap$Config;
import java.lang.Boolean;
import java.lang.Object;
import p.co5;
import p.en6;

public final class a91	// class@000f38 from classes.dex
{
    public final vj3 a;
    public final gl6 b;
    public final int c;
    public final zw0 d;
    public final zw0 e;
    public final zw0 f;
    public final zw0 g;
    public final f87 h;
    public final int i;
    public final Bitmap$Config j;
    public final Boolean k;
    public final Boolean l;
    public final int m;
    public final int n;
    public final int o;

    public void a91(vj3 p0,gl6 p1,int p2,zw0 p3,zw0 p4,zw0 p5,zw0 p6,f87 p7,int p8,Bitmap$Config p9,Boolean p10,Boolean p11,int p12,int p13,int p14){
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
    public final boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof a91 || (!co5.c(this.a, p0.a) || (!co5.c(this.b, p0.b) || (this.c != p0.c || (!co5.c(this.d, p0.d) || (!co5.c(this.e, p0.e) || (!co5.c(this.f, p0.f) || (!co5.c(this.g, p0.g) || (!co5.c(this.h, p0.h) || (this.i != p0.i || (this.j != p0.j || (!co5.c(this.k, p0.k) || (!co5.c(this.l, p0.l) || (this.m != p0.m || (this.n != p0.n || this.o != p0.o))))))))))))))) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       a91 ta;
       a91 tb;
       int i = 0;
       int i1 = ((ta = this.a) != null)? ta.hashCode(): 0;
       i1 = i1 * 31;
       int i2 = ((tb = this.b) != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       i2 = ((tb = this.c) != null)? en6.A(tb): 0;
       i1 = (i1 + i2) * 31;
       i2 = ((tb = this.d) != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       i2 = ((tb = this.e) != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       i2 = ((tb = this.f) != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       i2 = ((tb = this.g) != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       i2 = ((tb = this.h) != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       i2 = ((tb = this.i) != null)? en6.A(tb): 0;
       i1 = (i1 + i2) * 31;
       i2 = ((tb = this.j) != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       i2 = ((tb = this.k) != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       i2 = ((tb = this.l) != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       i2 = ((tb = this.m) != null)? en6.A(tb): 0;
       i1 = (i1 + i2) * 31;
       i2 = ((tb = this.n) != null)? en6.A(tb): 0;
       i1 = (i1 + i2) * 31;
       if ((tb = this.o) != null) {
          i = en6.A(tb);
       }
       return (i1 + i);
    }
}
