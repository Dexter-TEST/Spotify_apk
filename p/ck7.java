package p.ck7;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import p.g54;
import android.view.View;
import java.lang.Object;
import android.animation.ValueAnimator;
import p.ip7;
import android.view.ViewParent;

public final class ck7 implements ValueAnimator$AnimatorUpdateListener	// class@001227 from classes.dex
{
    public final g54 a;

    public void ck7(g54 p0,View p1){
       this.a = p0;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       this.a.a.I.getParent().invalidate();
    }
}
