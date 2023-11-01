package p.hz;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import p.rz;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Float;
import android.view.View;

public final class hz implements ValueAnimator$AnimatorUpdateListener	// class@0018f5 from classes.dex
{
    public final int a;
    public final rz b;

    public void hz(rz p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       hz tb = this.b;
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
