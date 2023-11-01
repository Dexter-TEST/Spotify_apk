package p.ek7;
import android.view.ViewPropertyAnimator;
import android.animation.ValueAnimator$AnimatorUpdateListener;

public abstract class ek7	// class@0014a7 from classes.dex
{

    public static ViewPropertyAnimator a(ViewPropertyAnimator p0,ValueAnimator$AnimatorUpdateListener p1){
       return p0.setUpdateListener(p1);
    }
}
