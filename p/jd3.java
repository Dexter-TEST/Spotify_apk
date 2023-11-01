package p.jd3;
import android.animation.Animator$AnimatorListener;
import p.md3;
import p.zr5;
import java.lang.Object;
import android.animation.ValueAnimator;
import p.n02;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.Animator;
import p.kd3;
import java.util.ArrayList;
import p.yx5;
import java.lang.Runnable;
import android.view.View;

public final class jd3 implements Animator$AnimatorListener	// class@001ab4 from classes.dex
{
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final zr5 e;
    public final int f;
    public final ValueAnimator g;
    public boolean h;
    public float i;
    public float j;
    public boolean k;
    public boolean l;
    public float m;
    public final int n;
    public final zr5 o;
    public final md3 p;

    public void jd3(md3 p0,zr5 p1,int p2,float p3,float p4,float p5,float p6,int p7,zr5 p8){
       this.p = p0;
       this.n = p7;
       this.o = p8;
       super();
       this.k = false;
       this.l = false;
       this.f = p2;
       this.e = p1;
       this.a = p3;
       this.b = p4;
       this.c = p5;
       this.d = p6;
       ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
       this.g = valueAnimato;
       valueAnimato.addUpdateListener(new n02(1, this));
       valueAnimato.setTarget(p1.a);
       valueAnimato.addListener(this);
       this.m = 0;
    }
    public final void a(Animator p0){
       if (this.l == null) {
          this.e.p(true);
       }
       this.l = true;
       return;
    }
    public final void onAnimationCancel(Animator p0){
       this.m = 0x3f800000;
    }
    public final void onAnimationEnd(Animator p0){
       jd3 tn;
       this.a(p0);
       if (this.k != null) {
          return;
       }
       jd3 to = this.o;
       jd3 tp = this.p;
       if (this.n <= null) {
          tp.m.a(to);
       }else {
          tp.a.add(to.a);
          this.h = true;
          if ((tn = this.n) > null) {
             yx5 v8 = new yx5(tp, this, tn, 7, 0);
             tp.q.post(v8);
          }
       }
       zr5 a = to.a;
       if (tp.v == a) {
          tp.p(a);
       }
       return;
    }
    public final void onAnimationRepeat(Animator p0){
    }
    public final void onAnimationStart(Animator p0){
    }
}
