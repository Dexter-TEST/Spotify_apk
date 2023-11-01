package p.o02;
import p.lr5;
import p.er5;
import androidx.recyclerview.widget.RecyclerView;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.Drawable;
import android.animation.ValueAnimator;
import p.l02;
import java.lang.Object;
import p.m02;
import java.lang.Math;
import p.c02;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import p.n02;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import java.util.ArrayList;
import java.lang.Runnable;
import android.view.View;
import p.mr5;
import android.view.MotionEvent;
import android.graphics.Canvas;
import p.wh7;
import p.eh7;
import java.lang.Float;

public final class o02 extends er5 implements lr5	// class@002082 from classes.dex
{
    public int A;
    public final l02 B;
    public final int a;
    public final int b;
    public final StateListDrawable c;
    public final Drawable d;
    public final int e;
    public final int f;
    public final StateListDrawable g;
    public final Drawable h;
    public final int i;
    public final int j;
    public int k;
    public int l;
    public float m;
    public int n;
    public int o;
    public float p;
    public int q;
    public int r;
    public RecyclerView s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public final int[] x;
    public final int[] y;
    public final ValueAnimator z;
    public static final int[] C;
    public static final int[] D;

    static {
       int[] ointArray = new int[]{0x10100a7};
       o02.C = ointArray;
       ointArray = new int[0];
       o02.D = ointArray;
    }
    public void o02(RecyclerView p0,StateListDrawable p1,Drawable p2,StateListDrawable p3,Drawable p4,int p5,int p6,int p7){
       o02 ts;
       RecyclerView a0;
       super();
       this.q = 0;
       this.r = 0;
       this.t = false;
       this.u = false;
       this.v = 0;
       this.w = 0;
       int[] ointArray = new int[2];
       this.x = ointArray;
       ointArray = new int[2];
       this.y = ointArray;
       ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
       this.z = valueAnimato;
       this.A = 0;
       l02 ol02 = new l02(0, this);
       this.B = ol02;
       m02 om02 = new m02(0, this);
       this.c = p1;
       this.d = p2;
       this.g = p3;
       this.h = p4;
       this.e = Math.max(p5, p1.getIntrinsicWidth());
       this.f = Math.max(p5, p2.getIntrinsicWidth());
       this.i = Math.max(p5, p3.getIntrinsicWidth());
       this.j = Math.max(p5, p4.getIntrinsicWidth());
       this.a = p6;
       this.b = p7;
       p1.setAlpha(255);
       p2.setAlpha(255);
       valueAnimato.addListener(new c02(this));
       valueAnimato.addUpdateListener(new n02(0, this));
       if ((ts = this.s) == p0) {
       }else if(ts != null){
          ts.b0(this);
          ts = this.s;
          ts.H.remove(this);
          if (ts.I == this) {
             ts.I = null;
          }
          if ((a0 = this.s.A0) != null) {
             a0.remove(om02);
          }
          this.s.removeCallbacks(ol02);
       }
       this.s = p0;
       if (p0 != null) {
          p0.h(this, -1);
          this.s.H.add(this);
          this.s.i(om02);
       }
       return;
    }
    public final void b(MotionEvent p0){
       int b;
       o02 ty;
       int i7;
       int i8;
       if (this.v == null) {
          return;
       }
       int i = 1;
       int i1 = 2;
       if (!p0.getAction()) {
          b = this.j(p0.getX(), p0.getY());
          boolean b1 = this.i(p0.getX(), p0.getY());
          if (b || b1) {
             if (b1) {
                this.w = i;
                this.p = (float)(int)p0.getX();
             }else if(b){
                this.w = i1;
                this.m = (float)(int)p0.getY();
             }
             this.k(i1);
          }
       }else if(p0.getAction() == i && this.v == i1){
          this.m = 0;
          this.p = 0;
          this.k(i);
          this.w = 0;
       }else if(p0.getAction() == i1 && this.v == i1){
          this.l();
          int i2 = 0x40000000;
          o02 tb = this.b;
          if (this.w == i) {
             ty = this.y;
             ty[0] = tb;
             int i3 = this.q - tb;
             ty[i] = i3;
             float f = Math.max((float)tb, Math.min((float)i3, p0.getX()));
             if ((Math.abs(((float)this.o - f)) - i2) >= 0) {
                o02 tp = this.p;
                int i5 = this.s.computeHorizontalScrollRange();
                int i6 = this.s.computeHorizontalScrollOffset();
                o02 tq = this.q;
                if (i7 = ty[i] - ty[0]) {
                   i5 = i5 - tq;
                   i8 = (int)(((f - tp) / (float)i7) * (float)i5);
                   if ((i6 = i6 + i8) < i5 && i6 >= 0) {
                   label_00be :
                      if (i8) {
                         this.s.scrollBy(i8, 0);
                      }
                      this.p = f;
                   }
                }
                i8 = 0;
                goto label_00be ;
             }
          }
          if (this.w == i1) {
             o02 tx = this.x;
             tx[0] = tb;
             i1 = this.r - tb;
             tx[i] = i1;
             float f1 = Math.max((float)tb, Math.min((float)i1, p0.getY()));
             if ((Math.abs(((float)this.l - f1)) - i2) >= 0) {
                o02 tm = this.m;
                i2 = this.s.computeVerticalScrollRange();
                int i4 = this.s.computeVerticalScrollOffset();
                ty = this.r;
                if (i = tx[i] - tx[0]) {
                   i2 = i2 - ty;
                   b = (int)(((f1 - tm) / (float)i) * (float)i2);
                   if ((i4 = i4 + b) < i2 && i4 >= 0) {
                   label_0116 :
                      if (b) {
                         this.s.scrollBy(0, b);
                      }
                      this.m = f1;
                   }
                }
                b = 0;
                goto label_0116 ;
             }
          }
       }
       return;
    }
    public final boolean c(MotionEvent p0){
       o02 tv = this.v;
       int i = 1;
       if (tv == i) {
          boolean b = this.j(p0.getX(), p0.getY());
          boolean b1 = this.i(p0.getX(), p0.getY());
          if (!p0.getAction() && (b && !b1)) {
             if (b1) {
                this.w = i;
                this.p = (float)(int)p0.getX();
             }else if(b){
                this.w = 2;
                this.m = (float)(int)p0.getY();
             }
             this.k(2);
          }else {
             i = false;
          }
       }else if(tv == 2){
       }
       return i;
    }
    public final void e(boolean p0){
    }
    public final void h(Canvas p0,RecyclerView p1){
       o02 te;
       int i1;
       o02 tk;
       int i2;
       o02 tc;
       o02 th;
       int i = 0;
       if (this.q == this.s.getWidth() && this.r == this.s.getHeight()) {
          if (this.A != null) {
             float f = 0;
             if (this.t != null) {
                te = this.e;
                i1 = this.q - te;
                tk = this.k;
                i2 = this.l - (tk / 2);
                tc = this.c;
                tc.setBounds(i, i, te, tk);
                o02 td = this.d;
                td.setBounds(i, i, this.f, this.r);
                int i3 = 1;
                if (eh7.d(this.s) != i3) {
                   th = 0;
                }
                if (i3) {
                   td.draw(p0);
                   p0.translate((float)te, (float)i2);
                   float f1 = 0x3f800000;
                   p0.scale(0xbf800000, f1);
                   tc.draw(p0);
                   p0.scale(0xbf800000, f1);
                   p0.translate((float)(- te), (float)(- i2));
                }else {
                   p0.translate((float)i1, f);
                   td.draw(p0);
                   p0.translate(f, (float)i2);
                   tc.draw(p0);
                   p0.translate((float)(- i1), (float)(- i2));
                }
             }
             if (this.u != null) {
                te = this.i;
                i1 = this.r - te;
                tk = this.n;
                i2 = this.o - (tk / 2);
                tc = this.g;
                tc.setBounds(i, i, tk, te);
                th = this.h;
                th.setBounds(i, i, this.q, this.j);
                p0.translate(f, (float)i1);
                th.draw(p0);
                p0.translate((float)i2, f);
                tc.draw(p0);
                p0.translate((float)(- i2), (float)(- i1));
             }
          }
          return;
       }else {
          this.q = this.s.getWidth();
          this.r = this.s.getHeight();
          this.k(i);
          return;
       }
    }
    public final boolean i(float p0,float p1){
       boolean b;
       if (((float)(this.r - this.i) - p1) >= 0) {
          o02 to = this.o;
          o02 tn = this.n;
          if (((float)(to - (tn / 2)) - p0) >= 0 && (p0 - (float)((tn / 2) + to)) <= 0) {
             b = true;
          label_0022 :
             return b;
          }
       }
       b = false;
       goto label_0022 ;
    }
    public final boolean j(float p0,float p1){
       boolean b = false;
       int i = (eh7.d(this.s) == 1)? 1: 0;
       o02 te = this.e;
       if (i) {
          if ((p0 - (float)te) <= 0) {
          label_0021 :
             o02 tl = this.l;
             i = this.k / 2;
             if (((float)(tl - i) - p1) >= 0 && (p1 - (float)(i + tl)) <= 0) {
                b = true;
             }
          }
       }else if(((float)(this.q - te) - p0) >= 0){
          goto label_0021 ;
       }
       return b;
    }
    public final void k(int p0){
       o02 tB = this.B;
       o02 tc = this.c;
       int i = 2;
       if (p0 == i && this.v != i) {
          tc.setState(o02.C);
          this.s.removeCallbacks(tB);
       }
       if (!p0) {
          this.s.invalidate();
       }else {
          this.l();
       }
       if (this.v == i && p0 != i) {
          tc.setState(o02.D);
          this.s.removeCallbacks(tB);
          this.s.postDelayed(tB, (long)1200);
       }else if(p0 == 1){
          this.s.removeCallbacks(tB);
          this.s.postDelayed(tB, (long)1500);
       }
       this.v = p0;
       return;
    }
    public final void l(){
       o02 tA = this.A;
       o02 tz = this.z;
       if (tA != null) {
          if (tA != 3) {
          label_0034 :
             return;
          }else {
             tz.cancel();
          }
       }
       this.A = 1;
       float[] uofloatArray = new float[]{tz.getAnimatedValue().floatValue(),0x3f800000};
       tz.setFloatValues(uofloatArray);
       tz.setDuration(500);
       tz.setStartDelay(0);
       tz.start();
       goto label_0034 ;
    }
}
