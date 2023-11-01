package p.ol7;
import p.g87;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewGroup;
import p.h87;
import p.al7;
import p.qf2;
import p.uw5;
import android.animation.Animator;

public final class ol7 extends AnimatorListenerAdapter implements g87	// class@002146 from classes.dex
{
    public final View a;
    public final int b;
    public final ViewGroup c;
    public final boolean d;
    public boolean e;
    public boolean f;

    public void ol7(int p0,View p1){
       super();
       this.f = false;
       this.a = p1;
       this.b = p0;
       this.c = p1.getParent();
       this.d = true;
       this.f(true);
    }
    public final void a(h87 p0){
       ol7 tc;
       if (this.f == null) {
          al7.a.f(this.a, this.b);
          if ((tc = this.c) != null) {
             tc.invalidate();
          }
       }
       this.f(false);
       p0.w(this);
       return;
    }
    public final void b(){
       this.f(false);
    }
    public final void c(){
       this.f(true);
    }
    public final void d(){
    }
    public final void e(h87 p0){
    }
    public final void f(boolean p0){
       ol7 tc;
       if (this.d != null && (this.e != p0 && (tc = this.c) != null)) {
          this.e = p0;
          uw5.u(tc, p0);
       }
       return;
    }
    public final void onAnimationCancel(Animator p0){
       this.f = true;
    }
    public final void onAnimationEnd(Animator p0){
       ol7 tc;
       if (this.f == null) {
          al7.a.f(this.a, this.b);
          if ((tc = this.c) != null) {
             tc.invalidate();
          }
       }
       this.f(false);
       return;
    }
    public final void onAnimationPause(Animator p0){
       if (this.f == null) {
          al7.a.f(this.a, this.b);
       }
       return;
    }
    public final void onAnimationRepeat(Animator p0){
    }
    public final void onAnimationResume(Animator p0){
       if (this.f == null) {
          al7.a.f(this.a, 0);
       }
       return;
    }
    public final void onAnimationStart(Animator p0){
    }
}
