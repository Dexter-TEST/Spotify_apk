package p.we2;
import android.transition.Transition$TransitionListener;
import p.ye2;
import java.lang.Object;
import java.util.ArrayList;
import android.transition.Transition;

public final class we2 implements Transition$TransitionListener	// class@002b1c from classes.dex
{
    public final Object a;
    public final ArrayList b;
    public final Object c;
    public final ArrayList d;
    public final Object e;
    public final ArrayList f;
    public final ye2 g;

    public void we2(ye2 p0,Object p1,ArrayList p2,Object p3,ArrayList p4){
       this.g = p0;
       this.a = p1;
       this.b = p2;
       this.c = null;
       this.d = null;
       this.e = p3;
       this.f = p4;
       super();
    }
    public final void onTransitionCancel(Transition p0){
    }
    public final void onTransitionEnd(Transition p0){
       p0.removeListener(this);
    }
    public final void onTransitionPause(Transition p0){
    }
    public final void onTransitionResume(Transition p0){
    }
    public final void onTransitionStart(Transition p0){
       we2 ta;
       we2 tg = this.g;
       if ((ta = this.a) != null) {
          tg.t(ta, this.b, null);
       }
       if ((ta = this.c) != null) {
          tg.t(ta, this.d, null);
       }
       if ((ta = this.e) != null) {
          tg.t(ta, this.f, null);
       }
       return;
    }
}
