package p.n02;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Float;
import p.o02;
import android.graphics.drawable.Drawable;
import android.view.View;
import p.jd3;

public final class n02 implements ValueAnimator$AnimatorUpdateListener	// class@001f3d from classes.dex
{
    public final int a;
    public final Object b;

    public void n02(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       n02 tb = this.b;
       switch (this.a){
           case 0:
           default:
             tb.m = p0.getAnimatedFraction();
             return;
       }
       int i = (int)(p0.getAnimatedValue().floatValue() * 0x437f0000);
       tb.c.setAlpha(i);
       tb.d.setAlpha(i);
       tb.s.invalidate();
       return;
    }
}
