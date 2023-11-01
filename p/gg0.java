package p.gg0;
import android.animation.AnimatorListenerAdapter;
import p.ig0;
import android.animation.Animator;
import p.im1;
import com.google.android.material.textfield.TextInputLayout;

public final class gg0 extends AnimatorListenerAdapter	// class@0016fe from classes.dex
{
    public final int a;
    public final ig0 b;

    public void gg0(ig0 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void onAnimationEnd(Animator p0){
       switch (this.a){
           case 1:
           default:
             super.onAnimationEnd(p0);
             return;
       }
       this.b.a.setEndIconVisible(false);
       return;
    }
    public final void onAnimationStart(Animator p0){
       switch (this.a){
           case 0:
           default:
             super.onAnimationStart(p0);
             return;
       }
       this.b.a.setEndIconVisible(true);
       return;
    }
}
