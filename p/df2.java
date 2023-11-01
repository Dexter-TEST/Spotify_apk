package p.df2;
import p.i87;
import p.ff2;
import java.lang.Object;
import java.util.ArrayList;
import p.h87;
import p.g87;

public final class df2 extends i87	// class@001335 from classes.dex
{
    public final Object a;
    public final ArrayList b;
    public final Object c;
    public final ArrayList d;
    public final Object e;
    public final ArrayList f;
    public final ff2 g;

    public void df2(ff2 p0,Object p1,ArrayList p2,Object p3,ArrayList p4){
       this.g = p0;
       this.a = p1;
       this.b = p2;
       this.c = null;
       this.d = null;
       this.e = p3;
       this.f = p4;
       super();
    }
    public final void a(h87 p0){
       p0.w(this);
    }
    public final void e(h87 p0){
       df2 ta;
       df2 tg = this.g;
       if ((ta = this.a) != null) {
          tg.s(ta, this.b, null);
       }
       if ((ta = this.c) != null) {
          tg.s(ta, this.d, null);
       }
       if ((ta = this.e) != null) {
          tg.s(ta, this.f, null);
       }
       return;
    }
}
