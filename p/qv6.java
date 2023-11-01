package p.qv6;
import p.p63;
import android.graphics.drawable.Drawable;
import p.n63;
import p.x54;
import java.lang.String;
import java.lang.Object;
import p.co5;
import p.en6;

public final class qv6 extends p63	// class@002423 from classes.dex
{
    public final Drawable a;
    public final n63 b;
    public final int c;
    public final x54 d;
    public final String e;
    public final boolean f;
    public final boolean g;

    public void qv6(Drawable p0,n63 p1,int p2,x54 p3,String p4,boolean p5,boolean p6){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
    }
    public final n63 a(){
       return this.b;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof qv6 || (!co5.c(this.a, p0.a) || (!co5.c(this.b, p0.b) || (this.c != p0.c || (!co5.c(this.d, p0.d) || (!co5.c(this.e, p0.e) || (this.f != p0.f || this.g != p0.g))))))) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       qv6 td;
       int i = (en6.A(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
       int i1 = 0;
       int i2 = ((td = this.d) != null)? td.hashCode(): 0;
       i = (i + i2) * 31;
       if ((td = this.e) != null) {
          i1 = td.hashCode();
       }
       i = (i + i1) * 31;
       i2 = 1237;
       i1 = (this.f != null)? 1231: 1237;
       i = (i + i1) * 31;
       if (this.g != null) {
          i2 = 1231;
       }
       return (i + i2);
    }
}
