package p.oi7;
import android.view.animation.Animation$AnimationListener;
import android.view.ViewGroup;
import java.lang.Object;
import android.view.animation.Animation;
import android.view.View;

public final class oi7 implements Animation$AnimationListener	// class@00212b from classes.dex
{
    public final View a;

    public void oi7(ViewGroup p0){
       this.a = p0;
       super();
    }
    public final void onAnimationEnd(Animation p0){
       this.a.setVisibility(8);
    }
    public final void onAnimationRepeat(Animation p0){
    }
    public final void onAnimationStart(Animation p0){
    }
}
