package p.kz;
import android.os.Handler$Callback;
import java.lang.Object;
import android.os.Message;
import p.rz;
import java.util.List;
import android.view.accessibility.AccessibilityManager;
import android.view.View;
import p.qz;
import android.animation.ValueAnimator;
import p.je;
import android.animation.TimeInterpolator;
import p.hz;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import p.gz;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import p.jz;
import java.lang.Class;
import p.vf;
import p.nz;
import android.view.ViewParent;
import p.av0;
import com.google.android.material.snackbar.BaseTransientBottomBar$Behavior;
import p.g54;
import p.u44;
import com.google.android.material.behavior.SwipeDismissBehavior;
import p.xu0;
import android.view.ViewGroup;
import p.wh7;
import p.gh7;
import p.uv1;
import p.oz;

public final class kz implements Handler$Callback	// class@001cb5 from classes.dex
{

    public void kz(){
       super();
    }
    public final boolean handleMessage(Message p0){
       Message what;
       List enabledAcces;
       if ((what = p0.what) != null) {
          int b = false;
          if (what != true) {
             return b;
          }else {
             what = p0.obj;
             p0 = p0.arg1;
             rz m = ((m = what.m) == null || ((enabledAcces = m.getEnabledAccessibilityServiceList(true)) != null && enabledAcces.isEmpty()))? 1: 0;
             if (m) {
                m = what.c;
                if (!m.getVisibility()) {
                   int i = 2;
                   if (m.getAnimationMode() == 1) {
                      ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[i]{0x3f800000,0});
                      valueAnimato.setInterpolator(je.a);
                      valueAnimato.addUpdateListener(new hz(what, b));
                      valueAnimato.setDuration(75);
                      valueAnimato.addListener(new gz(p0, b, what));
                      valueAnimato.start();
                   }else {
                      ValueAnimator valueAnimato1 = new ValueAnimator();
                      int[] ointArray = new int[i];
                      ointArray[b] = b;
                      b = m.getHeight();
                      ViewGroup$LayoutParams layoutParams = m.getLayoutParams();
                      if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
                         b = b + layoutParams.bottomMargin;
                      }
                      ointArray[1] = b;
                      valueAnimato1.setIntValues(ointArray);
                      valueAnimato1.setInterpolator(je.b);
                      valueAnimato1.setDuration(250);
                      valueAnimato1.addListener(new gz(p0, true, what));
                      valueAnimato1.addUpdateListener(new jz(what));
                      valueAnimato1.start();
                   }
                }else {
                label_0098 :
                   what.b();
                }
             }else {
                goto label_0098 ;
             }
             return true;
          }
       }else {
          p0 = p0.obj;
          p0.getClass();
          rz c = p0.c;
          c.setOnAttachStateChangeListener(new vf(14, p0));
          if (c.getParent() == null) {
             ViewGroup$LayoutParams layoutParams1 = c.getLayoutParams();
             if (layoutParams1 instanceof av0) {
                BaseTransientBottomBar$Behavior uBehavior = new BaseTransientBottomBar$Behavior();
                BaseTransientBottomBar$Behavior i1 = uBehavior.i;
                i1.getClass();
                i1.a = p0.n;
                uBehavior.b = new u44(17, p0);
                layoutParams1.b(uBehavior);
                layoutParams1.g = 80;
             }
             p0.e();
             c.setVisibility(4);
             p0.a.addView(c);
          }
          if (gh7.c(c)) {
             p0.d();
          }else {
             c.setOnLayoutChangeListener(new uv1(16, p0));
          }
          return true;
       }
    }
}
