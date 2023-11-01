package p.af6;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import java.lang.Object;
import android.animation.ValueAnimator;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.Float;
import p.pi0;
import p.df1;
import p.im1;
import android.view.View;
import com.google.android.material.tabs.TabLayout;
import java.lang.Integer;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import p.q24;
import p.p24;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import p.bf6;
import android.graphics.drawable.Drawable;
import p.kd4;
import p.id4;

public final class af6 implements ValueAnimator$AnimatorUpdateListener	// class@000f72 from classes.dex
{
    public final int a;
    public final Object b;

    public void af6(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       BottomSheetBehavior i;
       af6 tb = this.b;
       switch (this.a){
           case 0:
             tb.invalidateSelf();
             return;
           case 1:
             tb.setScrimAlpha(p0.getAnimatedValue().intValue());
             return;
           case 2:
             BottomSheetBehavior uBottomSheet = p0.getAnimatedValue().floatValue();
             if ((i = tb.i) != null) {
                q24 a = i.a;
                if (uBottomSheet - a.j) {
                   a.j = uBottomSheet;
                   i.v = true;
                   i.invalidateSelf();
                }
             }
             return;
             break;
           case 3:
             tb.scrollTo(p0.getAnimatedValue().intValue(), 0);
             return;
           case 4:
             tb.c.setAlpha(p0.getAnimatedValue().floatValue());
             return;
           case 5:
             tb.Y0.n(p0.getAnimatedValue().floatValue());
             return;
           default:
             tb.a.a(p0.getAnimatedValue().floatValue());
             return;
       }
    }
}
