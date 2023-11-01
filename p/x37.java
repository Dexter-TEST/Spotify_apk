package p.x37;
import p.zg0;
import p.un2;
import p.yl6;
import java.lang.Object;
import java.lang.Boolean;
import p.t00;
import p.fn0;
import java.lang.Runnable;
import android.os.Handler;

public final class x37	// class@002c01 from classes.dex
{
    public final zg0 a;
    public final un2 b;
    public final yl6 c;
    public am0 d;
    public long e;
    public long f;
    public final t00 g;
    public final fn0 h;

    public void x37(zg0 p0,un2 p1,yl6 p2){
       super();
       boolean b = (this.d != null)? true: false;
       this.g = t00.b(Boolean.valueOf(b));
       this.h = new fn0();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       return;
    }
    public final void a(){
       x37 td;
       un2 a;
       if ((td = this.d) != null) {
          if ((a = this.b.a) != null) {
             a.removeCallbacks(td);
          }
          this.d = null;
          this.f = 0;
          this.e = 0;
          this.h.e();
          this.c.b(2);
          this.g.onNext(Boolean.FALSE);
       }
       return;
    }
}
