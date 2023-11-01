package p.ge1;
import android.graphics.drawable.Drawable$Callback;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import p.fe1;
import java.lang.Runnable;
import android.content.res.Resources$Theme;
import p.ce1;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import java.lang.Class;
import java.lang.Object;
import p.ee1;
import android.graphics.ColorFilter;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff$Mode;
import android.graphics.Rect;
import android.os.Build$VERSION;
import p.eb3;
import p.be1;
import p.em0;
import p.be;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable$ConstantState;
import android.graphics.Outline;
import p.ee;

public abstract class ge1 extends Drawable implements Drawable$Callback	// class@0016ee from classes.dex
{
    public long A;
    public long B;
    public ee1 C;
    public fe1 a;
    public Rect b;
    public Drawable c;
    public Drawable t;
    public int v;
    public boolean w;
    public int x;
    public boolean y;
    public em0 z;
    public static final int D;

    public void ge1(){
       super();
       this.v = 255;
       this.x = -1;
    }
    public final void a(boolean p0){
       boolean b = true;
       this.w = b;
       long l = SystemClock.uptimeMillis();
       ge1 tc = this.c;
       long l1 = 255;
       if (tc != null) {
          ge1 tA = this.A;
          if (tA) {
             if ((tA - l) <= 0) {
                tc.setAlpha(this.v);
                this.A = 0;
             }else {
                tc.setAlpha((((((int)((tA - l) * l1) / this.a.y) - 255) * this.v) / 255));
                tc = 1;
             label_003b :
                if ((tA = this.t) != null) {
                   ge1 tB = this.B;
                   if (tB) {
                      if ((tB - l) <= 0) {
                         tA.setVisible(false, false);
                         this.t = null;
                         this.B = 0;
                      }else {
                         tA.setAlpha(((((int)((tB - l) * l1) / this.a.z) * this.v) / 255));
                      label_0068 :
                         if (p0 && b) {
                            this.scheduleSelf(this.z, (l + 16));
                         }
                         return;
                      }
                   }
                }else {
                   this.B = 0;
                }
                b = tc;
                goto label_0068 ;
             }
          }
       }else {
          this.A = 0;
       }
       tc = 0;
       goto label_003b ;
    }
    public void applyTheme(Resources$Theme p0){
       object oobject;
       Resources resources;
       DisplayMetrics densityDpi;
       ge1 ta = this.a;
       if (p0 != null) {
          ta.c();
          fe1 h = ta.h;
          fe1 g = ta.g;
          int i = 0;
          while (i < h) {
             if ((oobject = g[i]) != null && ce1.b(oobject)) {
                ce1.a(g[i], p0);
                int i1 = ta.e | g[i].getChangingConfigurations();
                ta.e = i1;
             }
             i = i + 1;
          }
          if ((resources = p0.getResources()) != null) {
             ta.b = resources;
             if ((densityDpi = resources.getDisplayMetrics().densityDpi) == null) {
                densityDpi = 160;
             }
             h = ta.c;
             ta.c = densityDpi;
             if (h != densityDpi) {
                ta.m = false;
                ta.j = false;
             }
          }
       }else {
          ta.getClass();
       }
       return;
    }
    public final void b(Drawable p0){
       if (this.C == null) {
          this.C = new ee1();
       }
       ge1 tC = this.C;
       tC.b = p0.getCallback();
       p0.setCallback(tC);
       if (this.a.y <= null && this.w != null) {
          p0.setAlpha(this.v);
       }
       ge1 ta = this.a;
       if (ta.C != null) {
          p0.setColorFilter(ta.B);
       }else if(ta.F != null){
          ce1.h(p0, ta.D);
       }
       ta = this.a;
       if (ta.G != null) {
          ce1.i(p0, ta.E);
       }
       p0.setVisible(this.isVisible(), true);
       p0.setDither(this.a.w);
       p0.setState(this.getState());
       p0.setLevel(this.getLevel());
       p0.setBounds(this.getBounds());
       if (Build$VERSION.SDK_INT >= 23) {
          eb3.z(p0, eb3.o(this));
       }
       be1.e(p0, this.a.A);
       if ((ta = this.b) != null) {
          ce1.f(p0, ta.left, ta.top, ta.right, ta.bottom);
       }
       ta = this.C;
       ee1 b = ta.b;
       ta.b = null;
       p0.setCallback(b);
       return;
    }
    public final boolean c(int p0){
       ge1 tt;
       fe1 y;
       boolean b = false;
       if (p0 == this.x) {
          return b;
       }
       long l = SystemClock.uptimeMillis();
       if (this.a.z > null) {
          if ((tt = this.t) != null) {
             tt.setVisible(b, b);
          }
          if ((tt = this.c) != null) {
             this.t = tt;
             this.B = (long)this.a.z + l;
          }else {
             this.t = null;
             this.B = 0;
          }
       }else if((tt = this.c) != null){
          tt.setVisible(b, b);
       }
       if (p0 >= 0) {
          tt = this.a;
          if (p0 < tt.h) {
             Drawable uDrawable = tt.d(p0);
             this.c = uDrawable;
             this.x = p0;
             if (uDrawable != null) {
                if ((y = this.a.y) > null) {
                   this.A = l + (long)y;
                }
                this.b(uDrawable);
             }
          }else {
          label_0055 :
             this.c = null;
             this.x = -1;
          }
       }else {
          goto label_0055 ;
       }
       if ((this.A) || (this.B)) {
          if ((tt = this.z) == null) {
             this.z = new em0(2, this);
          }else {
             this.unscheduleSelf(tt);
          }
          this.a(true);
       }
       this.invalidateSelf();
       return true;
    }
    public final boolean canApplyTheme(){
       return this.a.canApplyTheme();
    }
    public abstract void d(be p0);
    public final void draw(Canvas p0){
       ge1 tc;
       if ((tc = this.c) != null) {
          tc.draw(p0);
       }
       if ((tc = this.t) != null) {
          tc.draw(p0);
       }
       return;
    }
    public final int getAlpha(){
       return this.v;
    }
    public final int getChangingConfigurations(){
       ge1 ta = this.a;
       return (super.getChangingConfigurations() | (ta.e | ta.d));
    }
    public final Drawable$ConstantState getConstantState(){
       fe1 v;
       ge1 ta = this.a;
       if (ta.u != null) {
          v = ta.v;
       }else {
          ta.c();
          boolean b = true;
          ta.u = b;
          fe1 h = ta.h;
          fe1 g = ta.g;
          int i = 0;
          while (true) {
             if (i < h) {
                if (g[i].getConstantState() == null) {
                   ta.v = false;
                   v = null;
                }else {
                   i = i + 1;
                }
             }else {
                ta.v = b;
                v = 1;
             }
          }
          this.a.d = this.getChangingConfigurations();
          return this.a;
       }
       if (v != null) {
       }else {
          return null;
       }
    }
    public final Drawable getCurrent(){
       return this.c;
    }
    public final void getHotspotBounds(Rect p0){
       ge1 tb;
       if ((tb = this.b) != null) {
          p0.set(tb);
       }else {
          super.getHotspotBounds(p0);
       }
       return;
    }
    public final int getIntrinsicHeight(){
       int intrinsicHei;
       ge1 ta = this.a;
       if (ta.l != null) {
          if (ta.m == null) {
             ta.b();
          }
          return ta.o;
       }else if((ta = this.c) != null){
          intrinsicHei = ta.getIntrinsicHeight();
       }else {
          intrinsicHei = -1;
       }
       return intrinsicHei;
    }
    public final int getIntrinsicWidth(){
       int intrinsicWid;
       ge1 ta = this.a;
       if (ta.l != null) {
          if (ta.m == null) {
             ta.b();
          }
          return ta.n;
       }else if((ta = this.c) != null){
          intrinsicWid = ta.getIntrinsicWidth();
       }else {
          intrinsicWid = -1;
       }
       return intrinsicWid;
    }
    public final int getMinimumHeight(){
       int minimumHeigh;
       ge1 ta = this.a;
       if (ta.l != null) {
          if (ta.m == null) {
             ta.b();
          }
          return ta.q;
       }else if((ta = this.c) != null){
          minimumHeigh = ta.getMinimumHeight();
       }else {
          minimumHeigh = 0;
       }
       return minimumHeigh;
    }
    public final int getMinimumWidth(){
       int minimumWidth;
       ge1 ta = this.a;
       if (ta.l != null) {
          if (ta.m == null) {
             ta.b();
          }
          return ta.p;
       }else if((ta = this.c) != null){
          minimumWidth = ta.getMinimumWidth();
       }else {
          minimumWidth = 0;
       }
       return minimumWidth;
    }
    public final int getOpacity(){
       ge1 tc = this.c;
       int i = -2;
       if (tc != null && tc.isVisible()) {
          tc = this.a;
          if (tc.r != null) {
             i = tc.s;
          }else {
             tc.c();
             fe1 h = tc.h;
             fe1 g = tc.g;
             if (h > null) {
                i = g[0].getOpacity();
             }
             for (int i1 = 1; i1 < h; i1 = i1 + 1) {
                i = Drawable.resolveOpacity(i, g[i1].getOpacity());
             }
             tc.s = i;
             tc.r = true;
          }
       }
       return i;
    }
    public final void getOutline(Outline p0){
       ge1 tc;
       if ((tc = this.c) != null) {
          tc.getOutline(p0);
       }
       return;
    }
    public final boolean getPadding(Rect p0){
       boolean b1;
       Rect left;
       fe1 k;
       Rect left1;
       ge1 ta = this.a;
       boolean b = true;
       Rect rect = null;
       if (ta.i != null) {
       }else if((k = ta.k) == null && ta.j == null){
          ta.c();
          left = new Rect();
          fe1 h = ta.h;
          fe1 g = ta.g;
          int i = 0;
          while (i < h) {
             if (g[i].getPadding(left)) {
                if (!rect) {
                   rect = new Rect(0, 0, 0, 0);
                }
                if ((left1 = left.left) > rect.left) {
                   rect.left = left1;
                }
                if ((left1 = left.top) > rect.top) {
                   rect.top = left1;
                }
                if ((left1 = left.right) > rect.right) {
                   rect.right = left1;
                }
                if ((left1 = left.bottom) > rect.bottom) {
                   rect.bottom = left1;
                }
             }
             i = i + 1;
          }
          ta.j = b;
          ta.k = rect;
       }else {
          rect = k;
       }
       if (rect != null) {
          p0.set(rect);
          b1 = ((((rect.left | rect.top) | rect.bottom) | rect.right))? true: false;
       }else if((ta = this.c) != null){
          b1 = ta.getPadding(p0);
       }else {
          b1 = super.getPadding(p0);
       }
       if (this.a.A == null || eb3.o(this) != b) {
          b = 0;
       }
       if (b) {
          left = p0.left;
          p0.left = p0.right;
          p0.right = left;
       }
       return b1;
    }
    public final void invalidateDrawable(Drawable p0){
       ge1 ta;
       if ((ta = this.a) != null) {
          ta.r = false;
          ta.t = false;
       }
       if (p0 == this.c && this.getCallback() != null) {
          this.getCallback().invalidateDrawable(this);
       }
       return;
    }
    public final boolean isAutoMirrored(){
       return this.a.A;
    }
    public void jumpToCurrentState(){
       ge1 tc;
       ge1 tt = this.t;
       int i = 1;
       if (tt != null) {
          tt.jumpToCurrentState();
          this.t = null;
          tt = 1;
       }else {
          tt = 0;
       }
       if ((tc = this.c) != null) {
          tc.jumpToCurrentState();
          if (this.w != null) {
             this.c.setAlpha(this.v);
          }
       }
       if (this.B) {
          this.B = 0;
          tt = 1;
       }
       if (this.A) {
          this.A = 0;
       }else {
          i = tt;
       }
       if (i) {
          this.invalidateSelf();
       }
       return;
    }
    public Drawable mutate(){
       if (this.y == null && super.mutate() == this) {
          ee uoee = this;
          be uobe = new be(uoee.G, uoee, null);
          uobe.e();
          this.d(uobe);
          this.y = true;
       }
       return this;
    }
    public final void onBoundsChange(Rect p0){
       ge1 tt;
       if ((tt = this.t) != null) {
          tt.setBounds(p0);
       }
       if ((tt = this.c) != null) {
          tt.setBounds(p0);
       }
       return;
    }
    public final boolean onLayoutDirectionChanged(int p0){
       object oobject;
       ge1 ta = this.a;
       ge1 tx = this.x;
       fe1 h = ta.h;
       fe1 g = ta.g;
       int i = 0;
       boolean b = false;
       while (i < h) {
          if ((oobject = g[i]) != null) {
             boolean b1 = (Build$VERSION.SDK_INT >= 23)? eb3.z(oobject, p0): 0;
             if (i == tx) {
                b = b1;
             }
          }
          i = i + 1;
       }
       ta.x = p0;
       return b;
    }
    public final boolean onLevelChange(int p0){
       ge1 tt;
       if ((tt = this.t) != null) {
          return tt.setLevel(p0);
       }
       if ((tt = this.c) != null) {
          return tt.setLevel(p0);
       }
       return false;
    }
    public final void scheduleDrawable(Drawable p0,Runnable p1,long p2){
       if (p0 == this.c && this.getCallback() != null) {
          this.getCallback().scheduleDrawable(this, p1, p2);
       }
       return;
    }
    public final void setAlpha(int p0){
       ge1 tc;
       if (this.w == null || this.v != p0) {
          this.w = true;
          this.v = p0;
          if ((tc = this.c) != null) {
             if (!(this.A)) {
                tc.setAlpha(p0);
             }else {
                this.a(false);
             }
          }
       }
       return;
    }
    public final void setAutoMirrored(boolean p0){
       ge1 ta = this.a;
       if (ta.A != p0) {
          ta.A = p0;
          if ((ta = this.c) != null) {
             be1.e(ta, p0);
          }
       }
       return;
    }
    public final void setColorFilter(ColorFilter p0){
       ge1 ta = this.a;
       ta.C = true;
       if (ta.B != p0) {
          ta.B = p0;
          if ((ta = this.c) != null) {
             ta.setColorFilter(p0);
          }
       }
       return;
    }
    public final void setDither(boolean p0){
       ge1 ta = this.a;
       if (ta.w != p0) {
          ta.w = p0;
          if ((ta = this.c) != null) {
             ta.setDither(p0);
          }
       }
       return;
    }
    public final void setHotspot(float p0,float p1){
       ge1 tc;
       if ((tc = this.c) != null) {
          ce1.e(tc, p0, p1);
       }
       return;
    }
    public final void setHotspotBounds(int p0,int p1,int p2,int p3){
       ge1 tb;
       if ((tb = this.b) == null) {
          this.b = new Rect(p0, p1, p2, p3);
       }else {
          tb.set(p0, p1, p2, p3);
       }
       if ((tb = this.c) != null) {
          ce1.f(tb, p0, p1, p2, p3);
       }
       return;
    }
    public final void setTint(int p0){
       this.setTintList(ColorStateList.valueOf(p0));
    }
    public final void setTintList(ColorStateList p0){
       ge1 ta = this.a;
       ta.F = true;
       if (ta.D != p0) {
          ta.D = p0;
          eb3.B(this.c, p0);
       }
       return;
    }
    public final void setTintMode(PorterDuff$Mode p0){
       ge1 ta = this.a;
       ta.G = true;
       if (ta.E != p0) {
          ta.E = p0;
          eb3.C(this.c, p0);
       }
       return;
    }
    public boolean setVisible(boolean p0,boolean p1){
       ge1 tt;
       boolean b = super.setVisible(p0, p1);
       if ((tt = this.t) != null) {
          tt.setVisible(p0, p1);
       }
       if ((tt = this.c) != null) {
          tt.setVisible(p0, p1);
       }
       return b;
    }
    public final void unscheduleDrawable(Drawable p0,Runnable p1){
       if (p0 == this.c && this.getCallback() != null) {
          this.getCallback().unscheduleDrawable(this, p1);
       }
       return;
    }
}
