package p.fw3;
import android.view.Choreographer$FrameCallback;
import android.animation.ValueAnimator;
import java.util.concurrent.CopyOnWriteArraySet;
import android.animation.Animator$AnimatorListener;
import java.lang.Object;
import android.animation.Animator$AnimatorPauseListener;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import java.util.Iterator;
import android.animation.Animator;
import android.view.Choreographer;
import p.sv3;
import java.lang.Math;
import p.wa4;
import java.lang.IllegalStateException;
import java.lang.Float;
import java.lang.String;
import java.lang.UnsupportedOperationException;
import android.os.Build$VERSION;
import p.p3;
import android.animation.TimeInterpolator;
import java.lang.IllegalArgumentException;

public final class fw3 extends ValueAnimator implements Choreographer$FrameCallback	// class@00164e from classes.dex
{
    public float A;
    public float B;
    public sv3 C;
    public boolean D;
    public final CopyOnWriteArraySet a;
    public final CopyOnWriteArraySet b;
    public final CopyOnWriteArraySet c;
    public float t;
    public boolean v;
    public long w;
    public float x;
    public float y;
    public int z;

    public void fw3(){
       super();
       this.a = new CopyOnWriteArraySet();
       this.b = new CopyOnWriteArraySet();
       this.c = new CopyOnWriteArraySet();
       this.t = 0x3f800000;
       this.v = false;
       this.w = 0;
       this.x = 0;
       this.y = 0;
       this.z = 0;
       this.A = 0xcf000000;
       this.B = 0x4f000000;
       this.D = false;
    }
    public final void a(Animator$AnimatorListener p0){
       this.b.add(p0);
    }
    public final void addListener(Animator$AnimatorListener p0){
       this.a(p0);
    }
    public final void addPauseListener(Animator$AnimatorPauseListener p0){
       this.c(p0);
    }
    public final void addUpdateListener(ValueAnimator$AnimatorUpdateListener p0){
       this.d(p0);
    }
    public final void c(Animator$AnimatorPauseListener p0){
       this.c.add(p0);
    }
    public final void cancel(){
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          iterator.next().onAnimationCancel(this);
       }
       this.j(this.i());
       this.n(true);
       return;
    }
    public final void d(ValueAnimator$AnimatorUpdateListener p0){
       this.a.add(p0);
    }
    public final void doFrame(long p0){
       fw3 tC;
       if (this.D != null) {
          this.n(false);
          Choreographer.getInstance().postFrameCallback(this);
       }
       if ((tC = this.C) != null && this.D != null) {
          fw3 tw = this.w;
          long l = 0;
          if (tw - l) {
             l = p0 - tw;
          }
          float f = (float)l / ((1000000000.00f / tC.l) / Math.abs(this.t));
          tw = this.x;
          if (this.i()) {
             f = - f;
          }
          float f1 = tw + f;
          float f2 = this.f();
          int i = ((this.g() - f1) >= 0 && (f1 - f2) <= 0)? 1: 0;
          f1 = wa4.b(f1, this.g(), this.f());
          this.x = f1;
          this.y = f1;
          this.w = p0;
          this.k();
          if ((i ^ 1)) {
             if (this.getRepeatCount() != -1 && this.z >= this.getRepeatCount()) {
                float f3 = ((this.t) < 0)? this.g(): this.f();
                this.x = f3;
                this.y = f3;
                this.n(1);
                this.j(this.i());
             }else {
                Iterator iterator = this.b.iterator();
                while (iterator.hasNext()) {
                   iterator.next().onAnimationRepeat(this);
                }
                this.z = this.z + 1;
                if (this.getRepeatMode() == 2) {
                   this.v = this.v ^ 1;
                   this.t = - this.t;
                }else if(this.i()){
                   f = this.f();
                }else {
                   f = this.g();
                }
                this.x = f;
                this.y = f;
                this.w = p0;
             }
          }
          if (this.C != null) {
             fw3 ty = this.y;
             if ((ty - this.A) < 0 || (this.B - ty) > 0) {
                Object[] objArray = new Object[]{Float.valueOf(this.A),Float.valueOf(this.B),Float.valueOf(this.y)};
                throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", objArray));
             }
          }
          return;
       }else {
          return;
       }
    }
    public final float e(){
       fw3 tC;
       if ((tC = this.C) == null) {
          return 0;
       }
       sv3 j = tC.j;
       return ((this.y - j) / (tC.k - j));
    }
    public final float f(){
       fw3 tC;
       if ((tC = this.C) == null) {
          return 0;
       }
       fw3 tB = this.B;
       if (!(0x4f000000 - tB)) {
          tB = tC.k;
       }
       return tB;
    }
    public final float g(){
       fw3 tC;
       if ((tC = this.C) == null) {
          return 0;
       }
       fw3 tA = this.A;
       if (!(0xcf000000 - tA)) {
          tA = tC.j;
       }
       return tA;
    }
    public final float getAnimatedFraction(){
       float f;
       float f1;
       float f2;
       if (this.C == null) {
          return 0;
       }
       if (this.i()) {
          f = this.f() - this.y;
          f1 = this.f();
          f2 = this.g();
       }else {
          f = this.y - this.g();
          f1 = this.f();
          f2 = this.g();
       }
       return (f / (f1 - f2));
    }
    public final Object getAnimatedValue(){
       return Float.valueOf(this.e());
    }
    public final long getDuration(){
       fw3 tC;
       long l = ((tC = this.C) == null)? 0: (long)tC.b();
       return l;
    }
    public final long getStartDelay(){
       this.h();
       throw 0;
    }
    public final long h(){
       throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }
    public final boolean i(){
       boolean b = ((this.t) < 0)? true: false;
       return b;
    }
    public final boolean isRunning(){
       return this.D;
    }
    public final void j(boolean p0){
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          Animator$AnimatorListener uAnimatorLis = iterator.next();
          if (Build$VERSION.SDK_INT >= 26) {
             p3.q(uAnimatorLis, this, p0);
          }else {
             uAnimatorLis.onAnimationEnd(this);
          }
       }
       return;
    }
    public final void k(){
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().onAnimationUpdate(this);
       }
       return;
    }
    public final void l(){
       this.b.clear();
    }
    public final void m(){
       this.a.clear();
    }
    public final void n(boolean p0){
       Choreographer.getInstance().removeFrameCallback(this);
       if (p0) {
          this.D = false;
       }
       return;
    }
    public final void o(Animator$AnimatorListener p0){
       this.b.remove(p0);
    }
    public final void p(Animator$AnimatorPauseListener p0){
       this.c.remove(p0);
    }
    public final void q(ValueAnimator$AnimatorUpdateListener p0){
       this.a.remove(p0);
    }
    public final ValueAnimator r(long p0){
       throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }
    public final void removeAllListeners(){
       this.l();
    }
    public final void removeAllUpdateListeners(){
       this.m();
    }
    public final void removeListener(Animator$AnimatorListener p0){
       this.o(p0);
    }
    public final void removePauseListener(Animator$AnimatorPauseListener p0){
       this.p(p0);
    }
    public final void removeUpdateListener(ValueAnimator$AnimatorUpdateListener p0){
       this.q(p0);
    }
    public final void s(float p0){
       if (!(p0 - this.x)) {
          return;
       }
       p0 = wa4.b(p0, this.g(), this.f());
       this.x = p0;
       this.y = p0;
       this.w = 0;
       this.k();
       return;
    }
    public final Animator setDuration(long p0){
       this.r(p0);
       throw null;
    }
    public final ValueAnimator setDuration(long p0){
       this.r(p0);
       throw null;
    }
    public final void setInterpolator(TimeInterpolator p0){
       this.t(p0);
       throw null;
    }
    public final void setRepeatMode(int p0){
       super.setRepeatMode(p0);
       if (p0 != 2 && this.v != null) {
          this.v = false;
          this.t = - this.t;
       }
       return;
    }
    public final void setStartDelay(long p0){
       this.v(p0);
       throw null;
    }
    public final void t(TimeInterpolator p0){
       throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }
    public final void u(float p0,float p1){
       fw3 tC;
       if ((p1 - p0) <= 0) {
          float f = ((tC = this.C) == null)? -340282346638528860000000000000000000000.00f: tC.j;
          float f1 = (tC == null)? Float.MAX_VALUE: tC.k;
          p0 = wa4.b(p0, f, f1);
          p1 = wa4.b(p1, f, f1);
          if ((this.A - p0) || (this.B - p1)) {
             this.A = p0;
             this.B = p1;
             this.s((float)(int)wa4.b(this.y, p0, p1));
          }
          return;
       }else {
          Object[] objArray = new Object[]{Float.valueOf(p0),Float.valueOf(p1)};
          throw new IllegalArgumentException(String.format("minFrame \(%s\) must be <= maxFrame \(%s\)", objArray));
       }
    }
    public final void v(long p0){
       throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }
}
