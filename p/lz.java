package p.lz;
import java.lang.Runnable;
import p.rz;
import java.lang.Object;
import java.lang.String;
import android.content.Context;
import android.view.WindowManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewParent;
import p.qz;
import android.animation.ValueAnimator;
import p.je;
import android.animation.TimeInterpolator;
import p.hz;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.AnimatorSet;
import android.animation.Animator;
import p.fz;
import android.animation.Animator$AnimatorListener;
import p.iz;

public final class lz implements Runnable	// class@001df7 from classes.dex
{
    public final int a;
    public final rz b;

    public void lz(rz p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void run(){
       rz b;
       int[] ointArray;
       int i2;
       ValueAnimator valueAnimato1;
       int i = 1;
       int i1 = 2;
       lz tb = this.b;
       switch (this.a){
           case 0:
             if (tb.c != null && (b = tb.b) != null) {
                DisplayMetrics uDisplayMetr = new DisplayMetrics();
                b.getSystemService("window").getDefaultDisplay().getRealMetrics(uDisplayMetr);
                ointArray = new int[i1];
                rz c = tb.c;
                c.getLocationOnScreen(ointArray);
                if ((i2 = (uDisplayMetr.heightPixels - (c.getHeight() + ointArray[i])) + (int)c.getTranslationY()) < tb.k) {
                   ViewGroup$LayoutParams layoutParams = c.getLayoutParams();
                   if (!layoutParams instanceof ViewGroup$MarginLayoutParams) {
                      Handler o = rz.o;
                   }else {
                      layoutParams.bottomMargin = (tb.k - i2) + layoutParams.bottomMargin;
                      c.requestLayout();
                   }
                }
             }
             break;
           default:
             if ((b = tb.c) != null) {
                rz c1 = tb.c;
                if (b.getParent() != null) {
                   c1.setVisibility(0);
                }
                if (c1.getAnimationMode() == i) {
                   ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[i1]{0,0x3f800000});
                   valueAnimato.setInterpolator(je.a);
                   valueAnimato.addUpdateListener(new hz(tb, 0));
                   valueAnimato1 = ValueAnimator.ofFloat(new float[i1]{0x3f4ccccd,0x3f800000});
                   valueAnimato1.setInterpolator(je.d);
                   valueAnimato1.addUpdateListener(new hz(tb, i));
                   AnimatorSet uAnimatorSet = new AnimatorSet();
                   Animator[] uAnimatorArr = new Animator[i1];
                   uAnimatorArr[0] = valueAnimato;
                   uAnimatorArr[i] = valueAnimato1;
                   uAnimatorSet.playTogether(uAnimatorArr);
                   uAnimatorSet.setDuration(150);
                   uAnimatorSet.addListener(new fz(tb, 0));
                   uAnimatorSet.start();
                }else {
                   i2 = c1.getHeight();
                   ViewGroup$LayoutParams layoutParams1 = c1.getLayoutParams();
                   if (layoutParams1 instanceof ViewGroup$MarginLayoutParams) {
                      i2 = i2 + layoutParams1.bottomMargin;
                   }
                   c1.setTranslationY((float)i2);
                   valueAnimato1 = new ValueAnimator();
                   ointArray = new int[i1];
                   ointArray[0] = i2;
                   ointArray[i] = 0;
                   valueAnimato1.setIntValues(ointArray);
                   valueAnimato1.setInterpolator(je.b);
                   valueAnimato1.setDuration(250);
                   valueAnimato1.addListener(new fz(tb, i));
                   valueAnimato1.addUpdateListener(new iz(tb, i2));
                   valueAnimato1.start();
                }
             }
             return;
       }
       return;
    }
}
