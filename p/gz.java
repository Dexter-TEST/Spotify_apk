package p.gz;
import android.animation.AnimatorListenerAdapter;
import java.lang.Object;
import android.animation.Animator;
import p.rz;
import p.bz6;
import com.google.android.material.snackbar.SnackbarContentLayout;
import android.view.View;
import android.view.ViewPropertyAnimator;

public final class gz extends AnimatorListenerAdapter	// class@0017b0 from classes.dex
{
    public final int a;
    public final int b;
    public final Object c;

    public void gz(int p0,int p1,Object p2){
       this.a = p1;
       this.c = p2;
       this.b = p0;
       super();
    }
    public final void onAnimationEnd(Animator p0){
       gz tc = this.c;
       switch (this.a){
           case 0:
             tc.b();
             return;
           case 1:
             tc.b();
             return;
           default:
             tc.b = this.b;
             return;
       }
    }
    public final void onAnimationStart(Animator p0){
       gz tc = this.c;
       switch (this.a){
           case 1:
             rz d = tc.d;
             d.a.setAlpha(0x3f800000);
             long l = (long)180;
             long l1 = (long)0;
             d.a.animate().alpha(0).setDuration(l).setStartDelay(l1).start();
             if (!d.b.getVisibility()) {
                d.b.setAlpha(0x3f800000);
                d.b.animate().alpha(0).setDuration(l).setStartDelay(l1).start();
             }
             return;
             break;
           case 2:
           default:
             super.onAnimationStart(p0);
             return;
       }
       tc.b = this.b;
       return;
    }
}
