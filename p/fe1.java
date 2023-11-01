package p.fe1;
import android.graphics.drawable.Drawable$ConstantState;
import p.ge1;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import java.lang.Object;
import p.rr6;
import java.lang.System;
import android.graphics.drawable.Drawable$Callback;
import android.os.Build$VERSION;
import p.eb3;
import p.ce1;

public abstract class fe1 extends Drawable$ConstantState	// class@0015ad from classes.dex
{
    public boolean A;
    public ColorFilter B;
    public boolean C;
    public ColorStateList D;
    public PorterDuff$Mode E;
    public boolean F;
    public boolean G;
    public final ge1 a;
    public Resources b;
    public int c;
    public int d;
    public int e;
    public SparseArray f;
    public Drawable[] g;
    public int h;
    public boolean i;
    public boolean j;
    public Rect k;
    public boolean l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public int q;
    public boolean r;
    public int s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public int x;
    public int y;
    public int z;

    public void fe1(fe1 p0,ge1 p1,Resources p2){
       Resources resources;
       fe1 c;
       object oobject;
       Drawable$ConstantState constantStat;
       super();
       boolean b = false;
       this.i = b;
       this.l = b;
       boolean b1 = true;
       this.w = b1;
       this.y = b;
       this.z = b;
       this.a = p1;
       Rect rect = null;
       if (p2 != null) {
          resources = p2;
       }else if(p0 != null){
          c = p0.b;
       }else {
          resources = rect;
       }
       this.b = resources;
       c = (p0 != null)? p0.c: null;
       if (p2 != null) {
          c = p2.getDisplayMetrics().densityDpi;
       }
       if (c == null) {
          c = 160;
       }
       this.c = c;
       if (p0 != null) {
          this.d = p0.d;
          this.e = p0.e;
          this.u = b1;
          this.v = b1;
          this.i = p0.i;
          this.l = p0.l;
          this.w = p0.w;
          this.x = p0.x;
          this.y = p0.y;
          this.z = p0.z;
          this.A = p0.A;
          this.B = p0.B;
          this.C = p0.C;
          this.D = p0.D;
          this.E = p0.E;
          this.F = p0.F;
          this.G = p0.G;
          if (p0.c == c) {
             if (p0.j != null) {
                if (p0.k != null) {
                   rect = new Rect(p0.k);
                }
                this.k = rect;
                this.j = b1;
             }
             if (p0.m != null) {
                this.n = p0.n;
                this.o = p0.o;
                this.p = p0.p;
                this.q = p0.q;
                this.m = b1;
             }
          }
          if (p0.r != null) {
             this.s = p0.s;
             this.r = b1;
          }
          if (p0.t != null) {
             this.t = b1;
          }
          fe1 g = p0.g;
          Drawable[] uDrawableArr = new Drawable[g.length];
          this.g = uDrawableArr;
          this.h = p0.h;
          this.f = ((p0 = p0.f) != null)? p0.clone(): new SparseArray(this.h);
          p0 = this.h;
          while (b < p0) {
             if ((oobject = g[b]) != null) {
                if ((constantStat = oobject.getConstantState()) != null) {
                   this.f.put(b, constantStat);
                }else {
                   constantStat[b] = g[b];
                }
             }
             b = b + 1;
          }
       }else {
          Drawable[] uDrawableArr1 = new Drawable[10];
          this.g = uDrawableArr1;
          this.h = b;
       }
       return;
    }
    public final int a(Drawable p0){
       fe1 th;
       fe1 g;
       if ((th = this.h) >= this.g.length) {
          int i = th + 10;
          fe1 uofe1 = this;
          Drawable[] uDrawableArr = new Drawable[i];
          if ((g = uofe1.g) != null) {
             System.arraycopy(g, 0, uDrawableArr, 0, th);
          }
          uofe1.g = uDrawableArr;
          int[][] ointArray = new int[][i];
          System.arraycopy(uofe1.H, 0, ointArray, 0, th);
          uofe1.H = ointArray;
       }
       p0.mutate();
       p0.setVisible(0, true);
       p0.setCallback(this.a);
       this.g[th] = p0;
       this.h = this.h + true;
       this.e = p0.getChangingConfigurations() | this.e;
       this.r = false;
       this.t = false;
       this.k = null;
       this.j = false;
       this.m = false;
       this.u = false;
       return th;
    }
    public final void b(){
       int intrinsicWid;
       int minimumHeigh;
       this.m = true;
       this.c();
       fe1 th = this.h;
       fe1 tg = this.g;
       this.o = -1;
       this.n = -1;
       int i = 0;
       this.q = i;
       this.p = i;
       while (i < th) {
          object oobject = tg[i];
          if ((intrinsicWid = oobject.getIntrinsicWidth()) > this.n) {
             this.n = intrinsicWid;
          }
          if ((intrinsicWid = oobject.getIntrinsicHeight()) > this.o) {
             this.o = intrinsicWid;
          }
          if ((intrinsicWid = oobject.getMinimumWidth()) > this.p) {
             this.p = intrinsicWid;
          }
          if ((minimumHeigh = oobject.getMinimumHeight()) > this.q) {
             this.q = minimumHeigh;
          }
          i = i + 1;
       }
       return;
    }
    public final void c(){
       fe1 tf;
       if ((tf = this.f) != null) {
          int i = tf.size();
          for (int i1 = 0; i1 < i; i1 = i1 + 1) {
             int i2 = this.f.keyAt(i1);
             fe1 tg = this.g;
             Drawable uDrawable = this.f.valueAt(i1).newDrawable(this.b);
             if (Build$VERSION.SDK_INT >= 23) {
                eb3.z(uDrawable, this.x);
             }
             uDrawable = uDrawable.mutate();
             uDrawable.setCallback(this.a);
             tg[i2] = uDrawable;
          }
          this.f = null;
       }
       return;
    }
    public final boolean canApplyTheme(){
       object oobject;
       Drawable$ConstantState uConstantSta;
       fe1 th = this.h;
       fe1 tg = this.g;
       int i = 0;
       while (true) {
          if (i >= th) {
             return false;
          }
          if ((oobject = tg[i]) != null) {
             if (ce1.b(oobject)) {
                break ;
             }
          }else if((uConstantSta = this.f.get(i)) != null && uConstantSta.canApplyTheme()){
             return true;
          }
          i = i + 1;
       }
       return true;
    }
    public final Drawable d(int p0){
       object oobject;
       fe1 tf;
       int i;
       if ((oobject = this.g[p0]) != null) {
          return oobject;
       }
       if ((tf = this.f) == null || (i = tf.indexOfKey(p0)) < 0) {
          return null;
       }
       Drawable uDrawable = this.f.valueAt(i).newDrawable(this.b);
       if (Build$VERSION.SDK_INT >= 23) {
          eb3.z(uDrawable, this.x);
       }
       uDrawable = uDrawable.mutate();
       uDrawable.setCallback(this.a);
       this.g[p0] = uDrawable;
       this.f.removeAt(i);
       if (!this.f.size()) {
          this.f = null;
       }
       return uDrawable;
    }
    public abstract void e();
    public final int getChangingConfigurations(){
       return (this.d | this.e);
    }
}
