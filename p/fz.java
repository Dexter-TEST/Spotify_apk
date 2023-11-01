package p.fz;
import android.animation.AnimatorListenerAdapter;
import p.rz;
import android.animation.Animator;
import com.google.android.material.snackbar.SnackbarContentLayout;
import android.view.View;
import android.view.ViewPropertyAnimator;

public final class fz extends AnimatorListenerAdapter	// class@00166e from classes.dex
{
    public final int a;
    public final rz b;

    public void fz(rz p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void onAnimationEnd(Animator p0){
       fz tb = this.b;
       switch (this.a){
           case 0:
           default:
             tb.c();
             return;
       }
       tb.c();
       return;
    }
    public final void onAnimationStart(Animator p0){
       switch (this.a){
           case 1:
             rz d = this.b.d;
             d.a.setAlpha(0);
             long l = (long)180;
             long l1 = (long)70;
             d.a.animate().alpha(0x3f800000).setDuration(l).setStartDelay(l1).start();
             if (!d.b.getVisibility()) {
                d.b.setAlpha(0);
                d.b.animate().alpha(0x3f800000).setDuration(l).setStartDelay(l1).start();
             }
             break;
           default:
             super.onAnimationStart(p0);
             return;
       }
       return;
    }
}
