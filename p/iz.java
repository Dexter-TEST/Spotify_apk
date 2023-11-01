package p.iz;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import p.rz;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Integer;
import android.view.View;

public final class iz implements ValueAnimator$AnimatorUpdateListener	// class@001a38 from classes.dex
{
    public final rz a;

    public void iz(rz p0,int p1){
       this.a = p0;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       this.a.c.setTranslationY((float)p0.getAnimatedValue().intValue());
    }
}
