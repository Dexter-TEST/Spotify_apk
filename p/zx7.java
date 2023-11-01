package p.zx7;
import p.ly7;
import p.wx7;
import java.lang.Object;
import p.hy7;
import p.jy7;
import p.yx7;
import p.dx7;
import p.iy7;
import p.lz7;
import p.rz7;
import p.xy7;

public final class zx7 implements ly7	// class@002f88 from classes.dex
{
    public final int a;
    public final ly7 b;
    public final ly7 c;
    public final ly7 t;
    public final ly7 v;
    public final ly7 w;

    public void zx7(ly7 p0,wx7 p1,ly7 p2,ly7 p3,ly7 p4,int p5){
       this.a = p5;
       this.b = p0;
       this.c = p1;
       this.t = p2;
       this.v = p3;
       this.w = p4;
       super();
    }
    public final Object c(){
       zx7 tw = this.w;
       zx7 tv = this.v;
       zx7 tt = this.t;
       zx7 tc = this.c;
       zx7 tb = this.b;
       switch (this.a){
           case 0:
           default:
             rz7 tv1 = new rz7(tb.c(), jy7.a(tc), tt.c(), jy7.a(tv), tw.c());
             return tv;
       }
       yx7 tt1 = new yx7(tb.c(), jy7.a(tc), jy7.a(tt), tv.c(), tw.c());
       return tt;
    }
}
