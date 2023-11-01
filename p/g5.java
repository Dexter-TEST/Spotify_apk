package p.g5;
import android.animation.AnimatorListenerAdapter;
import java.lang.Object;
import android.animation.Animator;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.spotify.legacyglue.recyclerview.RecyclerViewFastScroller;
import android.view.View;
import com.google.android.material.transformation.ExpandableTransformationBehavior;
import java.lang.Class;
import p.df1;
import p.im1;
import com.google.android.material.internal.CheckableImageButton;
import android.animation.ValueAnimator;
import p.tp2;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import p.h87;
import android.animation.Animator$AnimatorListener;

public final class g5 extends AnimatorListenerAdapter	// class@0016a6 from classes.dex
{
    public final int a;
    public final Object b;

    public void g5(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void onAnimationCancel(Animator p0){
       switch (this.a){
           case 0:
           default:
             super.onAnimationCancel(p0);
             return;
       }
       g5 tb = this.b;
       tb.N = null;
       tb.B = false;
       return;
    }
    public final void onAnimationEnd(Animator p0){
       g5 tb = this.b;
       switch (this.a){
           case 0:
             tb.N = null;
             tb.B = false;
             return;
           case 1:
             tb.n();
             p0.removeListener(this);
             return;
           case 2:
             tb.c = null;
             return;
           case 4:
             tp2.v(tb);
             throw null;
           case 5:
             tb.c.setChecked(tb.k);
             tb.q.start();
             return;
           case 6:
             tb.getClass();
             return;
           default:
             tb.setVisibility(4);
             tb.setTranslationX(0);
             tb.setAlpha(0x3f800000);
             tb.G = null;
             return;
       }
    }
    public final void onAnimationStart(Animator p0){
       switch (this.a){
           case 4:
           default:
             super.onAnimationStart(p0);
             return;
       }
       tp2.v(this.b);
       throw null;
    }
}
