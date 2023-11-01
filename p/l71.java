package p.l71;
import android.animation.AnimatorListenerAdapter;
import p.q71;
import p.zr5;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.animation.Animator;
import android.animation.Animator$AnimatorListener;
import p.dr5;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Class;

public final class l71 extends AnimatorListenerAdapter	// class@001cf7 from classes.dex
{
    public final int a;
    public final zr5 b;
    public final View c;
    public final ViewPropertyAnimator d;
    public final q71 e;

    public void l71(q71 p0,zr5 p1,View p2,ViewPropertyAnimator p3){
       this.a = 1;
       this.e = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void l71(q71 p0,zr5 p1,ViewPropertyAnimator p2,View p3){
       this.a = 0;
       this.e = p0;
       this.b = p1;
       this.d = p2;
       this.c = p3;
       super();
    }
    public final void onAnimationCancel(Animator p0){
       switch (this.a){
           case 1:
           default:
             super.onAnimationCancel(p0);
             return;
       }
       this.c.setAlpha(0x3f800000);
       return;
    }
    public final void onAnimationEnd(Animator p0){
       l71 tb = this.b;
       l71 te = this.e;
       Animator$AnimatorListener uAnimatorLis = null;
       l71 td = this.d;
       switch (this.a){
           case 0:
           default:
             td.setListener(uAnimatorLis);
             te.c(tb);
             te.o.remove(tb);
             te.j();
             return;
       }
       td.setListener(uAnimatorLis);
       this.c.setAlpha(0x3f800000);
       te.c(tb);
       te.q.remove(tb);
       te.j();
       return;
    }
    public final void onAnimationStart(Animator p0){
       l71 te = this.e;
       switch (this.a){
           case 0:
           default:
             te.getClass();
             return;
       }
       te.getClass();
       return;
    }
}
