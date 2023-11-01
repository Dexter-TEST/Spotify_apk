package p.n71;
import android.animation.AnimatorListenerAdapter;
import p.q71;
import p.o71;
import android.view.ViewPropertyAnimator;
import android.view.View;
import android.animation.Animator;
import android.animation.Animator$AnimatorListener;
import p.zr5;
import p.dr5;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Class;

public final class n71 extends AnimatorListenerAdapter	// class@001f7d from classes.dex
{
    public final int a;
    public final o71 b;
    public final ViewPropertyAnimator c;
    public final View d;
    public final q71 e;

    public void n71(q71 p0,o71 p1,ViewPropertyAnimator p2,View p3,int p4){
       this.a = p4;
       this.e = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public final void onAnimationEnd(Animator p0){
       n71 te = this.e;
       n71 tb = this.b;
       n71 td = this.d;
       n71 tc = this.c;
       switch (this.a){
           case 0:
           default:
             tc.setListener(null);
             td.setAlpha(0x3f800000);
             td.setTranslationX(0);
             td.setTranslationY(0);
             te.c(tb.b);
             te.r.remove(tb.b);
             te.j();
             return;
       }
       tc.setListener(null);
       td.setAlpha(0x3f800000);
       td.setTranslationX(0);
       td.setTranslationY(0);
       te.c(tb.a);
       te.r.remove(tb.a);
       te.j();
       return;
    }
    public final void onAnimationStart(Animator p0){
       n71 te = this.e;
       n71 tb = this.b;
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
