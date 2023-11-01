package p.a20;
import p.y51;
import p.q63;
import p.u45;
import kotlinx.coroutines.sync.a;
import java.lang.Object;
import p.au0;
import p.z10;
import p.dx0;
import p.da6;
import p.eb3;
import java.lang.IllegalStateException;
import java.lang.String;
import p.o26;
import p.il1;
import p.gc3;
import p.wf2;
import p.xw0;
import p.ng2;
import p.du0;
import p.io2;
import p.x51;

public final class a20 implements y51	// class@000ef9 from classes.dex
{
    public final q63 a;
    public final u45 b;
    public final da6 c;
    public final int d;

    public void a20(q63 p0,u45 p1,a p2,int p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public final Object a(au0 p0){
       z10 oz10;
       z10 t;
       if (p0 instanceof z10) {
          oz10 = p0;
          z10 y = oz10.y;
          int i = Integer.MIN_VALUE;
          if ((y & i)) {
             oz10.y = y - i;
          label_0018 :
             z10 w = oz10.w;
             dx0 a = dx0.a;
             z10 y1 = oz10.y;
             int i1 = 2;
             int i2 = 1;
             if (y1 != null) {
                if (y1 != i2) {
                   if (y1 == i1) {
                      oz10 = oz10.t;
                      eb3.G(w);
                   label_0074 :
                      oz10.b();
                      return w;
                   }else {
                      throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                   }
                }else {
                   y1 = oz10.v;
                   t = oz10.t;
                   eb3.G(w);
                }
             }else {
                eb3.G(w);
                oz10.t = this;
                a20 tc = this.c;
                oz10.v = tc;
                oz10.y = i2;
                a20 uoa20 = tc;
                if (uoa20.a(oz10) == a) {
                   return a;
                }else {
                   t = this;
                }
             }
             oz10.t = y1;
             oz10.v = null;
             oz10.y = i1;
             if ((w = io2.B(il1.a, new gc3(new o26(4, t), null), oz10)) == a) {
                return a;
             }else {
                oz10 = y1;
                goto label_0074 ;
             }
          }
       }
       oz10 = new z10(this, p0);
       goto label_0018 ;
    }
}
