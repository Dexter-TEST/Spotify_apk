package p.cy0;
import p.jy0;
import java.lang.String;
import java.lang.Object;
import p.wh0;
import p.bc6;
import p.k80;

public final class cy0 implements jy0	// class@00129c from classes.dex
{
    public final int a;
    public final String b;
    public final int c;
    public final long t;
    public final long v;
    public final boolean w;
    public final int x;
    public final String y;
    public final String z;

    public void cy0(int p0,String p1,int p2,long p3,long p4,boolean p5,int p6,String p7,String p8){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
       this.v = p4;
       this.w = p5;
       this.x = p6;
       this.y = p7;
       this.z = p8;
       super();
    }
    public final void h(wh0 p0){
       cy0 b;
       cy0 z;
       cy0 y;
       cy0 a;
       cy0 uocy0 = this;
       wh0 owh0 = p0;
       k80 ok80 = null;
       k80 ok801 = ((b = uocy0.b) == null)? ok80: k80.a(b);
       k80 ok802 = ((z = uocy0.z) == null)? ok80: k80.a(z);
       if ((y = uocy0.y) != null) {
          ok80 = k80.a(y);
       }
       owh0.o(9, 2);
       int i = 3;
       int i1 = wh0.d(i);
       int i2 = 10;
       int i3 = ((a = uocy0.a) >= null)? wh0.b(a): 10;
       i1 = (i1 + i3) + 0;
       int i4 = (ok801 == null)? 0: wh0.a(4, ok801);
       cy0 c = uocy0.c;
       cy0 t = uocy0.t;
       cy0 uocy01 = c;
       cy0 v = uocy0.v;
       cy0 x = uocy0.x;
       int i5 = wh0.f(12, x) + ((wh0.d(i2) + 1) + (wh0.g(7, v) + (wh0.g(6, t) + (wh0.f(5, c) + (i1 + i4)))));
       i2 = 13;
       int i6 = (ok80 == null)? 0: wh0.a(i2, ok80);
       i5 = i5 + i6;
       i2 = 14;
       int i7 = (ok802 == null)? 0: wh0.a(i2, ok802);
       owh0.n((i5 + i7));
       owh0.j(i, a);
       owh0.i(4, ok801);
       owh0.p(5, uocy01);
       owh0.q(6, t);
       owh0.q(7, v);
       owh0.o(10, 0);
       owh0.l(uocy0.w);
       owh0.p(12, x);
       if (ok80 != null) {
          owh0.i(13, ok80);
       }
       if (ok802 != null) {
          owh0.i(14, ok802);
       }
       return;
    }
}
