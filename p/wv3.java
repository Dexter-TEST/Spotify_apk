package p.wv3;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import p.bw3;
import java.lang.Object;
import android.animation.ValueAnimator;
import p.fw3;
import p.jn0;

public final class wv3 implements ValueAnimator$AnimatorUpdateListener	// class@002bb3 from classes.dex
{
    public final bw3 a;

    public void wv3(bw3 p0){
       this.a = p0;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       bw3 z;
       wv3 ta = this.a;
       int i = (ta.P == 2)? 1: 0;
       if (i) {
          ta.invalidateSelf();
       }else if((z = ta.z) != null){
          z.n(ta.b.e());
       }
       return;
    }
}
