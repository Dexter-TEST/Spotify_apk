package p.bw3;
import android.graphics.drawable.Drawable$Callback;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.LinkedBlockingQueue;
import p.ew3;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import p.fw3;
import java.util.ArrayList;
import android.graphics.Matrix;
import p.wv3;
import java.util.concurrent.Semaphore;
import p.am0;
import java.lang.Object;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.graphics.RectF;
import android.graphics.Rect;
import java.lang.Math;
import android.os.Build$VERSION;
import p.sv3;
import p.en6;
import p.yv3;
import android.animation.ValueAnimator;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import android.animation.Animator$AnimatorListener;
import p.p3;
import android.animation.Animator;
import android.view.Choreographer;
import android.view.Choreographer$FrameCallback;
import android.animation.Animator$AnimatorPauseListener;
import android.graphics.Canvas;
import p.zh3;
import p.jn0;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewGroup;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import p.sy;
import android.graphics.Paint;
import java.lang.Runnable;
import p.zv3;
import p.xv3;
import p.wa4;
import android.graphics.ColorFilter;
import java.lang.String;
import p.js3;

public final class bw3 extends Drawable implements Drawable$Callback, Animatable	// class@00114a from classes.dex
{
    public int A;
    public final int B;
    public boolean C;
    public final Matrix D;
    public Bitmap E;
    public Canvas F;
    public Rect G;
    public RectF H;
    public zh3 I;
    public Rect J;
    public Rect K;
    public RectF L;
    public RectF M;
    public Matrix N;
    public Matrix O;
    public final int P;
    public final Semaphore Q;
    public final am0 R;
    public float S;
    public boolean T;
    public sv3 a;
    public final fw3 b;
    public boolean c;
    public int t;
    public final ArrayList v;
    public a63 w;
    public i77 x;
    public final boolean y;
    public jn0 z;
    public static final ThreadPoolExecutor U;

    static {
       ThreadPoolExecutor v8 = new ThreadPoolExecutor(0, 2, 35, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ew3());
       bw3.U = v8;
    }
    public void bw3(){
       super();
       fw3 uofw3 = new fw3();
       this.b = uofw3;
       this.c = true;
       this.t = 1;
       this.v = new ArrayList();
       this.y = true;
       this.A = 255;
       this.B = 1;
       this.C = false;
       this.D = new Matrix();
       this.P = 1;
       wv3 owv3 = new wv3(this);
       this.Q = new Semaphore(true);
       this.R = new am0(7, this);
       this.S = -340282346638528860000000000000000000000.00f;
       this.T = false;
       uofw3.d(owv3);
    }
    public static void b(RectF p0,Rect p1){
       p1.set((int)Math.floor((double)p0.left), (int)Math.floor((double)p0.top), (int)Math.ceil((double)p0.right), (int)Math.ceil((double)p0.bottom));
    }
    public final void a(){
       bw3 ta;
       if ((ta = this.a) == null) {
          return;
       }
       int sDK_INT = Build$VERSION.SDK_INT;
       sv3 m = ta.m;
       sv3 n = ta.n;
       int i = en6.A(this.B);
       boolean b = false;
       if (i != 1 && (i == 2 && (m == null && (sDK_INT < 28 || (n > 4 || sDK_INT <= 25))))) {
          b = true;
       }
       this.C = b;
       return;
    }
    public final void c(){
       float f;
       if (this.z == null) {
          this.v.add(new yv3(this, 1));
          return;
       }else {
          this.a();
          bw3 tb = this.b;
          if (this.c != null || !tb.getRepeatCount()) {
             if (this.isVisible()) {
                tb.D = true;
                int b = tb.i();
                Iterator iterator = tb.b.iterator();
                while (iterator.hasNext()) {
                   Animator$AnimatorListener uAnimatorLis = iterator.next();
                   if (Build$VERSION.SDK_INT >= 26) {
                      p3.r(uAnimatorLis, tb, b);
                   }else {
                      uAnimatorLis.onAnimationStart(tb);
                   }
                }
                f = (tb.i())? tb.f(): tb.g();
                tb.s((float)(int)f);
                tb.w = 0;
                b = 0;
                tb.z = b;
                if (tb.D != null) {
                   tb.n(b);
                   Choreographer.getInstance().postFrameCallback(tb);
                }
                this.t = 1;
             }else {
                this.t = 2;
             }
          }
          if (this.c == null) {
             f = ((tb.t) < 0)? tb.g(): tb.f();
             this.e((int)f);
             tb.n(1);
             tb.j(tb.i());
             if (!this.isVisible()) {
                this.t = 1;
             }
          }
          return;
       }
    }
    public final void d(){
       int i = 0;
       if (this.z == null) {
          this.v.add(new yv3(this, i));
          return;
       }else {
          this.a();
          bw3 tb = this.b;
          if (this.c != null || !tb.getRepeatCount()) {
             if (this.isVisible()) {
                tb.D = true;
                tb.n(i);
                Choreographer.getInstance().postFrameCallback(tb);
                tb.w = 0;
                if (tb.i() && !(tb.g() - tb.y)) {
                   tb.s(tb.f());
                }else if(!tb.i() && !(tb.f() - tb.y)){
                   tb.s(tb.g());
                }
                Iterator iterator = tb.c.iterator();
                while (iterator.hasNext()) {
                   iterator.next().onAnimationResume(tb);
                }
                this.t = 1;
             }else {
                this.t = 3;
             }
          }
          if (this.c == null) {
             float f = ((tb.t) < 0)? tb.g(): tb.f();
             this.e((int)f);
             tb.n(true);
             tb.j(tb.i());
             if (!this.isVisible()) {
                this.t = 1;
             }
          }
          return;
       }
    }
    public final void draw(Canvas p0){
       bw3 z;
       ThreadPoolExecutor u;
       bw3 q;
       bw3 r;
       bw3 b1;
       bw3 a;
       bw3 d;
       Rect bounds;
       float f;
       float f1;
       int i1;
       bw3 g;
       Bitmap uBitmap;
       bw3 uobw3 = this;
       Canvas uCanvas = p0;
       if ((z = uobw3.z) == null) {
          return;
       }
       int b = false;
       int i = (uobw3.P == 2)? 1: 0;
       try{
          u = bw3.U;
          q = uobw3.Q;
          r = uobw3.R;
          b1 = uobw3.b;
          if (i) {
             q.acquire();
          label_001f :
             if (i) {
                if ((a = uobw3.a) != null) {
                   d = uobw3.S;
                   f = b1.e();
                   uobw3.S = f;
                   if ((0x42480000 - (Math.abs((f - d)) * a.b())) >= 0) {
                      f1 = 1;
                   label_0042 :
                      if (a) {
                         uobw3.f(b1.e());
                      }
                   }
                }
                a = 0;
                goto label_0042 ;
             }
             d = uobw3.D;
             if (uobw3.C != null) {
                if (uobw3.a != null) {
                   if (uobw3.F == null) {
                      uobw3.F = new Canvas();
                      uobw3.M = new RectF();
                      uobw3.N = new Matrix();
                      uobw3.O = new Matrix();
                      uobw3.G = new Rect();
                      uobw3.H = new RectF();
                      uobw3.I = new zh3();
                      uobw3.J = new Rect();
                      uobw3.K = new Rect();
                      uobw3.L = new RectF();
                   }
                   uCanvas.getMatrix(uobw3.N);
                   uCanvas.getClipBounds(uobw3.G);
                   a = uobw3.G;
                   uobw3.H.set((float)a.left, (float)a.top, (float)a.right, (float)a.bottom);
                   uobw3.N.mapRect(uobw3.H);
                   bw3.b(uobw3.H, uobw3.G);
                   if (uobw3.y != null) {
                      uobw3.M.set(0, 0, (float)this.getIntrinsicWidth(), (float)this.getIntrinsicHeight());
                   }else {
                      z.a(uobw3.M, null, b);
                   }
                   uobw3.N.mapRect(uobw3.M);
                   bounds = this.getBounds();
                   f = (float)bounds.width() / (float)this.getIntrinsicWidth();
                   f1 = (float)bounds.height() / (float)this.getIntrinsicHeight();
                   bw3 m = uobw3.M;
                   m.set((m.left * f), (m.top * f1), (m.right * f), (m.bottom * f1));
                   Drawable$Callback callback = this.getCallback();
                   if (callback instanceof View) {
                      ViewParent parent = callback.getParent();
                      if (parent instanceof ViewGroup) {
                         i1 = parent.getClipChildren() ^ 1;
                      label_0139 :
                         if (!i1) {
                            g = uobw3.G;
                            uobw3.M.intersect((float)g.left, (float)g.top, (float)g.right, (float)g.bottom);
                         }
                         i1 = (int)Math.ceil((double)uobw3.M.width());
                         b = (int)Math.ceil((double)uobw3.M.height());
                         if (i1 && b) {
                            if ((m = uobw3.E) != null && (m.getWidth() >= i1 && uobw3.E.getHeight() >= b)) {
                               if (uobw3.E.getWidth() > i1 || uobw3.E.getHeight() > b) {
                                  uBitmap = Bitmap.createBitmap(uobw3.E, 0, 0, i1, b);
                                  uobw3.E = uBitmap;
                                  uobw3.F.setBitmap(uBitmap);
                                  uobw3.T = true;
                               }
                            }else {
                               uBitmap = Bitmap.createBitmap(i1, b, Bitmap$Config.ARGB_8888);
                               uobw3.E = uBitmap;
                               uobw3.F.setBitmap(uBitmap);
                               uobw3.T = true;
                            }
                            if (uobw3.T != null) {
                               d.set(uobw3.N);
                               d.preScale(f, f1);
                               a = uobw3.M;
                               d.postTranslate((- a.left), (- a.top));
                               uobw3.E.eraseColor(0);
                               z.e(uobw3.F, d, uobw3.A);
                               uobw3.N.invert(uobw3.O);
                               uobw3.O.mapRect(uobw3.L, uobw3.M);
                               bw3.b(uobw3.L, uobw3.K);
                            }
                            uobw3.J.set(0, 0, i1, b);
                            uCanvas.drawBitmap(uobw3.E, uobw3.J, uobw3.K, uobw3.I);
                         }
                      }
                   }
                   i1 = 0;
                   goto label_0139 ;
                }
             }else {
                bw3 z1 = uobw3.z;
                g = uobw3.a;
                if (z1 != null && g != null) {
                   d.reset();
                   bounds = this.getBounds();
                   if (!bounds.isEmpty()) {
                      d.preScale(((float)bounds.width() / (float)g.i.width()), ((float)bounds.height() / (float)g.i.height()));
                      d.preTranslate((float)bounds.left, (float)bounds.top);
                   }
                   z1.e(uCanvas, d, uobw3.A);
                }
             }
             uobw3.T = false;
             if (i) {
                q.release();
                if (b1.e() - z.E) {
                }
             }
          }else {
             goto label_001f ;
          }
       label_027b :
          return;
       }catch(java.lang.InterruptedException e0){
          if (i) {
             q.release();
             if (b1.e() - z.E) {
             }else {
                goto label_027b ;
             }
          }else {
             goto label_027b ;
          }
       }
       u.execute(r);
       goto label_027b ;
    }
    public final void e(int p0){
       if (this.a == null) {
          this.v.add(new zv3(this, p0));
          return;
       }else {
          this.b.s((float)p0);
          return;
       }
    }
    public final void f(float p0){
       bw3 ta;
       if ((ta = this.a) == null) {
          this.v.add(new xv3(this, p0));
          return;
       }else {
          sv3 j = ta.j;
          this.b.s((((ta.k - j) * p0) + j));
          return;
       }
    }
    public final int getAlpha(){
       return this.A;
    }
    public final int getIntrinsicHeight(){
       bw3 ta;
       int i = ((ta = this.a) == null)? -1: ta.i.height();
       return i;
    }
    public final int getIntrinsicWidth(){
       bw3 ta;
       int i = ((ta = this.a) == null)? -1: ta.i.width();
       return i;
    }
    public final int getOpacity(){
       return -3;
    }
    public final void invalidateDrawable(Drawable p0){
       Drawable$Callback callback;
       if ((callback = this.getCallback()) == null) {
          return;
       }
       callback.invalidateDrawable(this);
       return;
    }
    public final void invalidateSelf(){
       Drawable$Callback callback;
       if (this.T != null) {
          return;
       }
       this.T = true;
       if ((callback = this.getCallback()) != null) {
          callback.invalidateDrawable(this);
       }
       return;
    }
    public final boolean isRunning(){
       bw3 tb;
       boolean b = ((tb = this.b) == null)? false: tb.D;
       return b;
    }
    public final void scheduleDrawable(Drawable p0,Runnable p1,long p2){
       Drawable$Callback callback;
       if ((callback = this.getCallback()) == null) {
          return;
       }
       callback.scheduleDrawable(this, p1, p2);
       return;
    }
    public final void setAlpha(int p0){
       this.A = p0;
       this.invalidateSelf();
    }
    public final void setColorFilter(ColorFilter p0){
       js3.a("Use addColorFilter instead.");
    }
    public final boolean setVisible(boolean p0,boolean p1){
       bw3 tt;
       int i = this.isVisible() ^ 1;
       p1 = super.setVisible(p0, p1);
       if (p0) {
          if ((tt = this.t) == 2) {
             this.c();
          }else if(tt == 3){
             this.d();
          }
       }else {
          tt = this.b;
          if (tt.D != null) {
             this.v.clear();
             tt.n(1);
             Iterator iterator = tt.c.iterator();
             while (iterator.hasNext()) {
                iterator.next().onAnimationPause(tt);
             }
             if (!this.isVisible()) {
                this.t = 1;
             }
             this.t = 3;
          }else if(!i){
             this.t = 1;
          }
       }
       return p1;
    }
    public final void start(){
       Drawable$Callback callback = this.getCallback();
       if (callback instanceof View && callback.isInEditMode()) {
          return;
       }
       this.c();
       return;
    }
    public final void stop(){
       this.v.clear();
       bw3 tb = this.b;
       tb.n(true);
       tb.j(tb.i());
       if (!this.isVisible()) {
          this.t = 1;
       }
       return;
    }
    public final void unscheduleDrawable(Drawable p0,Runnable p1){
       Drawable$Callback callback;
       if ((callback = this.getCallback()) == null) {
          return;
       }
       callback.unscheduleDrawable(this, p1);
       return;
    }
}
