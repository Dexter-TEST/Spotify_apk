package p.xe2;
import android.transition.Transition$TransitionListener;
import p.ka0;
import java.lang.Object;
import android.transition.Transition;
import java.lang.Runnable;

public final class xe2 implements Transition$TransitionListener	// class@002c5d from classes.dex
{
    public final Runnable a;

    public void xe2(ka0 p0){
       this.a = p0;
       super();
    }
    public final void onTransitionCancel(Transition p0){
    }
    public final void onTransitionEnd(Transition p0){
       this.a.run();
    }
    public final void onTransitionPause(Transition p0){
    }
    public final void onTransitionResume(Transition p0){
    }
    public final void onTransitionStart(Transition p0){
    }
}
