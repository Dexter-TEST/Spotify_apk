package p.hg0;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import p.ig0;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Float;
import p.im1;
import android.view.View;

public final class hg0 implements ValueAnimator$AnimatorUpdateListener	// class@001844 from classes.dex
{
    public final int a;
    public final ig0 b;

    public void hg0(ig0 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       hg0 tb = this.b;
       switch (this.a){
           case 0:
           default:
             float f = p0.getAnimatedValue().floatValue();
             tb.c.setScaleX(f);
             tb.c.setScaleY(f);
             return;
       }
       tb.c.setAlpha(p0.getAnimatedValue().floatValue());
       return;
    }
}
