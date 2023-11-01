package p.ve2;
import android.transition.Transition$TransitionListener;
import android.view.View;
import java.util.ArrayList;
import java.lang.Object;
import android.transition.Transition;

public final class ve2 implements Transition$TransitionListener	// class@0029d6 from classes.dex
{
    public final View a;
    public final ArrayList b;

    public void ve2(View p0,ArrayList p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void onTransitionCancel(Transition p0){
    }
    public final void onTransitionEnd(Transition p0){
       p0.removeListener(this);
       this.a.setVisibility(8);
       ve2 tb = this.b;
       int i = tb.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          tb.get(i1).setVisibility(0);
       }
       return;
    }
    public final void onTransitionPause(Transition p0){
    }
    public final void onTransitionResume(Transition p0){
    }
    public final void onTransitionStart(Transition p0){
       p0.removeListener(this);
       p0.addListener(this);
    }
}
