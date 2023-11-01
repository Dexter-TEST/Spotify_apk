package p.hv5;
import java.util.concurrent.atomic.AtomicInteger;
import p.wd5;
import android.net.Uri;
import java.lang.Object;
import java.lang.Class;
import p.av5;
import android.graphics.Bitmap$Config;
import p.cv5;
import java.lang.String;
import p.lf7;
import p.vd5;
import java.lang.StringBuilder;
import java.lang.IllegalStateException;
import android.graphics.drawable.Drawable;
import java.lang.IllegalArgumentException;
import android.graphics.Bitmap;
import java.lang.System;
import android.os.Looper;
import java.lang.Thread;
import p.wi2;
import p.lc1;
import p.iw3;
import p.xr6;
import p.a5;
import p.e20;
import android.content.Context;
import android.widget.ImageView;
import p.xd5;
import android.graphics.drawable.Animatable;
import p.ud5;
import p.r63;
import p.e07;
import java.util.ArrayList;
import p.p77;

public final class hv5	// class@0018ce from classes.dex
{
    public final wd5 a;
    public final av5 b;
    public boolean c;
    public int d;
    public int e;
    public Drawable f;
    public Drawable g;
    public Object h;
    public static final AtomicInteger i;

    static {
       hv5.i = new AtomicInteger();
    }
    public void hv5(wd5 p0,Uri p1){
       super();
       this.c = true;
       p0.getClass();
       this.a = p0;
       this.b = new av5(p1, p0.j);
    }
    public final cv5 a(long p0){
       wd5 l;
       cv5 uocv51;
       int andIncrement = hv5.i.getAndIncrement();
       cv5 uocv5 = this.b.a();
       uocv5.a = andIncrement;
       uocv5.b = p0;
       if ((l = this.a.l) != null) {
          lf7.f("Main", "created", uocv5.d(), uocv5.toString());
       }
       wd5 a = this.a.a;
       if ((uocv51 = a.l(uocv5)) != null) {
          if (uocv51 != uocv5) {
             uocv51.a = andIncrement;
             uocv51.b = p0;
             if (l != null) {
                lf7.f("Main", "changed", uocv51.b(), "into "+uocv51);
             }
          }
          return uocv51;
       }else {
          throw new IllegalStateException("Request transformer "+a.getClass().getCanonicalName()+" returned null for "+uocv5);
       }
    }
    public final void b(Drawable p0){
       if (p0 == null) {
          throw new IllegalArgumentException("Error image may not be null.");
       }
       if (this.e != null) {
          throw new IllegalStateException("Error image already set.");
       }
       this.g = p0;
       return;
    }
    public final Bitmap c(){
       hv5 ta;
       long l = System.nanoTime();
       int i = 1;
       int i1 = (Looper.getMainLooper().getThread() == Thread.currentThread())? 1: 0;
       if (!i1) {
          hv5 tb = this.b;
          if (tb.a == null && tb.b == null) {
             ta = 0;
          }
          if (!i) {
             return null;
          }else {
             cv5 uocv5 = this.a(l);
             ta = this.a;
             wi2 owi2 = new wi2(ta, uocv5, this.h, lf7.b(uocv5, ""));
             return e20.e(ta, ta.d, ta.e, ta.f, owi2).f();
          }
       }else {
          throw new IllegalStateException("Method call should not happen from the main thread.");
       }
    }
    public final Drawable d(){
       hv5 td;
       if ((td = this.d) != null) {
          return this.a.c.getDrawable(td);
       }
       return this.f;
    }
    public final void e(ImageView p0){
       Bitmap uBitmap;
       long l = System.nanoTime();
       lf7.a();
       if (p0 == null) {
          throw new IllegalArgumentException("Target must not be null.");
       }
       hv5 tb = this.b;
       int i = 0;
       tb = (tb.a == null && tb.b == null)? 0: 1;
       if (!tb) {
          this.a.b(p0);
          if (this.c != null) {
             p0.setImageDrawable(this.d());
             if (p0.getDrawable() instanceof Animatable) {
                p0.getDrawable().start();
             }
          }
          return;
       }else {
          cv5 uocv5 = this.a(l);
          StringBuilder a = lf7.a;
          String str = lf7.b(uocv5, a);
          a.setLength(i);
          if ((uBitmap = this.a.h(str)) != null) {
             this.a.b(p0);
             hv5 ta = this.a;
             ud5 b = ud5.b;
             xd5.a(p0, ta.c, uBitmap, b, false, ta.k);
             if (this.a.l != null) {
                lf7.f("Main", "completed", uocv5.d(), "from "+b);
             }
             return;
          }else if(this.c != null){
             p0.setImageDrawable(this.d());
             if (p0.getDrawable() instanceof Animatable) {
                p0.getDrawable().start();
             }
          }
          r63 v8 = new r63(this.a, p0, uocv5, this.e, this.g, str, this.h);
          this.a.f(v8);
          return;
       }
    }
    public final void f(e07 p0){
       Bitmap uBitmap;
       long l = System.nanoTime();
       lf7.a();
       hv5 tb = this.b;
       tb = (tb.a == null && tb.b == null)? 0: 1;
       Drawable uDrawable = null;
       hv5 ta = this.a;
       if (!tb) {
          ta.c(p0);
          if (this.c != null) {
             uDrawable = this.d();
          }
          p0.b(uDrawable);
          return;
       }else {
          cv5 uocv5 = this.a(l);
          StringBuilder a = lf7.a;
          String str = lf7.b(uocv5, a);
          a.setLength(0);
          if ((uBitmap = ta.h(str)) != null) {
             ta.c(p0);
             p0.c(uBitmap, ud5.b);
             return;
          }else if(this.c != null){
             uDrawable = this.d();
          }
          p0.b(uDrawable);
          wi2 uBitmap1 = new wi2(this.a, p0, uocv5, this.g, str, this.h, this.e);
          ta.f(uBitmap);
          return;
       }
    }
    public final void g(){
       if (this.d != null) {
          throw new IllegalStateException("Placeholder resource already set.");
       }
       if (this.f != null) {
          throw new IllegalStateException("Placeholder image already set.");
       }
       this.c = false;
       return;
    }
    public final void h(Drawable p0){
       if (this.c == null) {
          throw new IllegalStateException("Already explicitly declared as no placeholder.");
       }
       if (this.d != null) {
          throw new IllegalStateException("Placeholder image already set.");
       }
       this.f = p0;
       return;
    }
    public final void i(Object p0){
       if (p0 == null) {
          throw new IllegalArgumentException("Tag invalid.");
       }
       if (this.h != null) {
          throw new IllegalStateException("Tag already set.");
       }
       this.h = p0;
       return;
    }
    public final void j(ArrayList p0){
       hv5 tb = this.b;
       tb.getClass();
       int i = p0.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          tb.c(p0.get(i1));
       }
       return;
    }
}
