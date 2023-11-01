package p.ye;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import java.lang.Object;
import android.view.View;
import android.animation.ValueAnimator;
import p.bz6;
import com.google.android.material.appbar.AppBarLayout$BaseBehavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p.ef;
import java.lang.Integer;
import p.so2;
import android.view.ViewGroup$MarginLayoutParams;

public final class ye implements ValueAnimator$AnimatorUpdateListener	// class@002da4 from classes.dex
{
    public final int a;
    public final Object b;
    public final View c;
    public final Object d;

    public void ye(Object p0,Object p1,View p2,int p3){
       this.a = p3;
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       ye td = this.d;
       ye tc = this.c;
       ye tb = this.b;
       switch (this.a){
           case 0:
             td.y(tb, tc, p0.getAnimatedValue().intValue());
             return;
           case 1:
             td.c(tb, tc, p0.getAnimatedFraction());
             return;
           default:
             tb.topMargin = p0.getAnimatedValue().intValue();
             tc.requestLayout();
             return;
       }
    }
}
