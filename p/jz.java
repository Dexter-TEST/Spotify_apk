package p.jz;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import p.rz;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Integer;
import android.view.View;

public final class jz implements ValueAnimator$AnimatorUpdateListener	// class@001b79 from classes.dex
{
    public final rz a;

    public void jz(rz p0){
       this.a = p0;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       this.a.c.setTranslationY((float)p0.getAnimatedValue().intValue());
    }
}
