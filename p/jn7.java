package p.jn7;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import android.animation.Animator;
import android.view.View;

public final class jn7 extends AnimatorListenerAdapter	// class@001b11 from classes.dex
{
    public final int a;
    public final View b;

    public void jn7(ViewGroup p0,int p1){
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
       this.b.setVisibility(8);
       return;
    }
    public final void onAnimationStart(Animator p0){
       jn7 tb = this.b;
       switch (this.a){
           case 0:
           default:
             tb.setVisibility(0);
             return;
       }
       tb.setVisibility(0);
       return;
    }
}
