package p.m71;
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

public final class m71 extends AnimatorListenerAdapter	// class@001e3a from classes.dex
{
    public final zr5 a;
    public final int b;
    public final View c;
    public final int d;
    public final ViewPropertyAnimator e;
    public final q71 f;

    public void m71(q71 p0,zr5 p1,int p2,View p3,int p4,ViewPropertyAnimator p5){
       this.f = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       this.e = p5;
       super();
    }
    public final void onAnimationCancel(Animator p0){
       m71 tc = this.c;
       if (this.b != null) {
          tc.setTranslationX(0);
       }
       if (this.d != null) {
          tc.setTranslationY(0);
       }
       return;
    }
    public final void onAnimationEnd(Animator p0){
       this.e.setListener(null);
       m71 tf = this.f;
       m71 ta = this.a;
       tf.c(ta);
       tf.p.remove(ta);
       tf.j();
    }
    public final void onAnimationStart(Animator p0){
       this.f.getClass();
    }
}
