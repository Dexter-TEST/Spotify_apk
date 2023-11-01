package p.w7;
import p.vi7;
import p.dn3;
import p.mp;
import p.m12;
import p.yg5;
import com.spotify.connectivity.connectiontype.InternetMonitor;
import p.ah5;
import p.bh5;
import p.bo3;
import java.lang.Object;
import java.util.ArrayList;
import p.t67;
import p.t00;
import java.util.concurrent.atomic.AtomicReference;
import p.yj4;
import p.ak4;
import p.l51;
import p.z4;
import p.v7;
import p.j65;

public final class w7 extends vi7	// class@002ae3 from classes.dex
{
    public final bh5 A;
    public t67 B;
    public final dn3 t;
    public final mp v;
    public final m12 w;
    public final yg5 x;
    public final InternetMonitor y;
    public final ah5 z;

    public void w7(dn3 p0,mp p1,m12 p2,yg5 p3,InternetMonitor p4,ah5 p5,bh5 p6){
       super();
       this.t = p0;
       this.v = p1;
       this.w = p2;
       this.x = p3;
       this.y = p4;
       this.z = p5;
       this.A = p6;
       bo3 h = p2.h;
       _monitor_enter(h);
       p2.h.add(this);
       _monitor_exit(h);
    }
    public final void b(){
       this.B = null;
       w7 tw = this.w;
       bo3 h = tw.h;
       _monitor_enter(h);
       tw.h.remove(this);
       _monitor_exit(h);
    }
    public final t67 e(){
       w7 tB;
       if ((tB = this.B) != null) {
          int i = 1;
          if (!tB.w.a.get() instanceof yj4 && !ak4.c(tB.w.a.get())) {
             Object obj = ((obj = tB.w.a.get()) != null && (!ak4.c(obj) && !obj instanceof yj4))? 1: 0;
             if (!obj || tB.w.c().b == null) {
                i = 0;
             }
          }
          if (!i) {
          label_0063 :
             return tB;
          }
       }
       tB = new t67(new v7(this.t, this.v), this.y);
       this.B = tB;
       goto label_0063 ;
    }
}
