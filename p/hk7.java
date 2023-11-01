package p.hk7;
import java.lang.Object;
import p.gk7;
import java.util.ArrayList;
import java.util.Iterator;
import p.fk7;
import java.lang.ref.Reference;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.animation.TimeInterpolator;
import p.ik7;

public final class hk7	// class@00186f from classes.dex
{
    public final ArrayList a;
    public long b;
    public Interpolator c;
    public ik7 d;
    public boolean e;
    public final gk7 f;

    public void hk7(){
       super();
       this.b = -1;
       this.f = new gk7(this);
       this.a = new ArrayList();
    }
    public final void a(){
       if (this.e == null) {
          return;
       }
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().b();
       }
       this.e = false;
       return;
    }
    public final void b(){
       View view;
       View view1;
       if (this.e != null) {
          return;
       }
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          fk7 uofk7 = iterator.next();
          hk7 tb = this.b;
          if ((tb) >= 0) {
             uofk7.c(tb);
          }
          if ((tb = this.c) != null && (view = uofk7.a.get()) != null) {
             view.animate().setInterpolator(tb);
          }
          if (this.d != null) {
             uofk7.d(this.f);
          }
          if ((view1 = uofk7.a.get()) != null) {
             view1.animate().start();
          }
       }
       this.e = true;
       return;
    }
}
