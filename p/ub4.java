package p.ub4;
import p.vi7;
import p.tb;
import p.wa;
import p.xz3;
import p.zu4;
import java.util.concurrent.atomic.AtomicBoolean;
import com.spotify.mobius.android.a;
import p.tb4;
import java.lang.Object;
import p.sg2;
import p.ob4;
import java.lang.String;
import p.co5;
import p.jt;
import java.util.Set;
import java.util.Collections;
import p.lb4;
import p.rb4;
import p.hr0;
import java.lang.IllegalArgumentException;
import p.ma;

public abstract class ub4 extends vi7	// class@00287b from classes.dex
{
    public final zu4 t;
    public final a v;
    public final rb4 w;
    public final Object x;
    public final AtomicBoolean y;

    public void ub4(tb p0,wa p1,xz3 p2){
       jt a;
       super();
       this.t = new zu4();
       this.y = new AtomicBoolean(true);
       this.v = new a(p2);
       ob4 oob4 = p0.apply(new tb4(0, this));
       co5.l(p1, "model");
       jt ojt = new jt(p1, Collections.emptySet());
       if (oob4.c != null) {
          throw new IllegalArgumentException("cannot pass in start effects when a loop has init defined");
       }
       a = ojt.a;
       rb4 orb4 = oob4.g(a, ojt.b);
       this.w = orb4;
       this.x = a;
       orb4.b(new tb4(true, this));
       return;
    }
    public final void b(){
       this.y.set(false);
       this.w.dispose();
    }
    public final void e(ma p0){
       if (this.y.get()) {
          this.w.a(p0);
       }
       return;
    }
}
