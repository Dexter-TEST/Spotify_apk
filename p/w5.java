package p.w5;
import p.c74;
import android.content.Context;
import java.lang.Object;
import android.view.LayoutInflater;
import android.util.SparseBooleanArray;
import p.u44;
import p.l64;
import android.view.View;
import android.view.ViewGroup;
import p.e74;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.view.menu.ActionMenuItemView;
import p.d64;
import p.s5;
import p.q5;
import android.view.ViewGroup$LayoutParams;
import p.y5;
import p.e64;
import p.v64;
import p.if6;
import p.b74;
import java.lang.Runnable;
import java.util.ArrayList;
import android.view.ViewParent;
import p.v5;
import java.lang.Class;
import android.widget.LinearLayout$LayoutParams;
import p.ev6;
import android.view.MenuItem;
import android.graphics.drawable.Drawable;
import p.r5;
import p.s64;
import java.lang.IllegalStateException;
import java.lang.String;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.content.res.Configuration;
import androidx.appcompat.widget.AppCompatImageView;
import android.view.View$MeasureSpec;
import p.t5;

public final class w5 implements c74	// class@002ad1 from classes.dex
{
    public Drawable A;
    public boolean B;
    public boolean C;
    public boolean D;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public final SparseBooleanArray I;
    public r5 J;
    public r5 K;
    public t5 L;
    public s5 M;
    public final u44 N;
    public final Context a;
    public Context b;
    public e64 c;
    public final LayoutInflater t;
    public b74 v;
    public final int w;
    public final int x;
    public f74 y;
    public v5 z;

    public void w5(Context p0){
       super();
       this.a = p0;
       this.t = LayoutInflater.from(p0);
       this.w = 0x7f0d0003;
       this.x = 0x7f0d0002;
       this.I = new SparseBooleanArray();
       this.N = new u44(3, this);
    }
    public final View a(l64 p0,View p1,ViewGroup p2){
       View actionView = p0.getActionView();
       int i = 0;
       if (actionView == null || p0.e()) {
          if (p1 instanceof e74) {
          }else {
             e74 uoe741 = this.t.inflate(this.x, p2, i);
          }
          p1.b(p0);
          e74 uoe74 = p1;
          uoe74.setItemInvoker(this.y);
          if (this.M == null) {
             this.M = new s5(this);
          }
          uoe74.setPopupCallback(this.M);
          actionView = p1;
       }
       if (p0.C != null) {
          i = 8;
       }
       actionView.setVisibility(i);
       ViewGroup$LayoutParams layoutParams = actionView.getLayoutParams();
       if (!p2.checkLayoutParams(layoutParams)) {
          actionView.setLayoutParams(ActionMenuView.j(layoutParams));
       }
       return actionView;
    }
    public final void b(e64 p0,boolean p1){
       w5 tK;
       this.c();
       if ((tK = this.K) != null && tK.b()) {
          tK.j.dismiss();
       }
       if ((tK = this.v) != null) {
          tK.b(p0, p1);
       }
       return;
    }
    public final boolean c(){
       w5 tL;
       w5 ty;
       if ((tL = this.L) != null && (ty = this.y) != null) {
          ty.removeCallbacks(tL);
          this.L = null;
          return true;
       }else if((tL = this.J) != null){
          if (tL.b()) {
             tL.j.dismiss();
          }
          return true;
       }else {
          return false;
       }
    }
    public final void d(){
       int i3;
       int i4;
       ViewGroup parent;
       w5 tc;
       ArrayList uArrayList1;
       int i6;
       ViewGroup parent1;
       w5 ty = this.y;
       ArrayList uArrayList = null;
       int i = 0;
       if (ty == null) {
       }else if((tc = this.c) != null){
          tc.i();
          uArrayList1 = this.c.l();
          i3 = uArrayList1.size();
          int i5 = 0;
          i6 = 0;
          while (i5 < i3) {
             l64 ol64 = uArrayList1.get(i5);
             if (ol64.g()) {
                View childAt = ty.getChildAt(i6);
                l64 itemData = (childAt instanceof e74)? childAt.getItemData(): uArrayList;
                View view = this.a(ol64, childAt, ty);
                if (ol64 != itemData) {
                   view.setPressed(i);
                   view.jumpDrawablesToCurrentState();
                }
                if (view != childAt) {
                   if ((parent1 = view.getParent()) != null) {
                      parent1.removeView(view);
                   }
                   this.y.addView(view, i6);
                }
                i6 = i6 + 1;
             }
             i5 = i5 + 1;
          }
       }else {
          i6 = 0;
       }
       while (i6 < ty.getChildCount()) {
          if (ty.getChildAt(i6) == this.z) {
             uArrayList1 = 0;
          }else {
             ty.removeViewAt(i6);
             uArrayList1 = 1;
          }
          if (!uArrayList1) {
             i6 = i6 + 1;
          }
       }
       this.y.requestLayout();
       if ((ty = this.c) != null) {
          ty.i();
          e64 i1 = ty.i;
          int i2 = i1.size();
          for (i3 = 0; i3 < i2; i3 = i3 + 1) {
          }
       }
       if ((ty = this.c) != null) {
          ty.i();
          uArrayList = ty.j;
       }
       if (this.C != null && uArrayList != null) {
          if ((i4 = uArrayList.size()) == 1) {
             i = uArrayList.get(i).C ^ 0x01;
          }else if(i4 > 0){
             i = 1;
          }
       }
       if (i) {
          if (this.z == null) {
             this.z = new v5(this, this.a);
          }
          if ((parent = this.z.getParent()) != this.y) {
             if (parent != null) {
                parent.removeView(this.z);
             }
             ty = this.y;
             ty.getClass();
             y5 oy5 = new y5();
             oy5.gravity = 16;
             oy5.a = true;
             ty.addView(this.z, oy5);
          }
       }else if((ty = this.z) != null){
          w5 ty1 = this.y;
          if (ty.getParent() == ty1) {
             ty1.removeView(this.z);
          }
       }
       this.y.setOverflowReserved(this.C);
       return;
    }
    public final boolean e(){
       w5 tJ;
       boolean b = ((tJ = this.J) != null && tJ.b())? true: false;
       return b;
    }
    public final boolean f(ev6 p0){
       ev6 z;
       w5 ty;
       View view;
       v64 j;
       boolean b = false;
       if (!p0.hasVisibleItems()) {
          return b;
       }
       ev6 uoev6 = p0;
       while ((z = uoev6.z) != this.c) {
          uoev6 = z;
       }
       if ((ty = this.y) != null) {
          int childCount = ty.getChildCount();
          int i2 = 0;
          while (true) {
             if (i2 < childCount) {
                view = ty.getChildAt(i2);
                if (view instanceof e74 && view.getItemData() == uoev6.A) {
                   break ;
                }else {
                   i2 = i2 + 1;
                }
             }
          }
          if (view == null) {
             return b;
          }else {
             p0.A.getClass();
             boolean i = p0.size();
             r5 int i1 = 0;
             while (true) {
                if (i1 < i) {
                   MenuItem item = p0.getItem(i1);
                   if (item.isVisible() && item.getIcon() != null) {
                      i = true;
                   label_005f :
                      i1 = new r5(this, this.b, p0, view);
                      this.K = i1;
                      i1.h = i;
                      if ((j = i1.j) != null) {
                         j.o(i);
                      }
                      w5 tK = this.K;
                      if (!tK.b()) {
                         if (tK.f == null) {
                         label_0084 :
                            if (b) {
                               if ((tK = this.v) != null) {
                                  tK.p(p0);
                                  break ;
                               }
                               break ;
                            }else {
                               throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                            }
                         }else {
                            tK.d(b, b, b, b);
                         }
                      }
                      b = true;
                      goto label_0084 ;
                   }else {
                      i1 = i1 + 1;
                   }
                }else {
                   i = false;
                   goto label_005f ;
                }
             }
             return true;
          }
       }
       view = null;
    }
    public final void g(Context p0,e64 p1){
       w5 tE;
       this.b = p0;
       LayoutInflater.from(p0);
       this.c = p1;
       Resources resources = p0.getResources();
       if (this.D == null) {
          this.C = true;
       }
       int i = 2;
       this.E = p0.getResources().getDisplayMetrics().widthPixels / i;
       Configuration configuratio = p0.getResources().getConfiguration();
       Configuration screenWidthD = configuratio.screenWidthDp;
       Configuration screenHeight = configuratio.screenHeightDp;
       int i1 = 600;
       if (configuratio.smallestScreenWidthDp <= i1 && screenWidthD <= i1) {
          configuratio = 720;
          i1 = 960;
          if (screenWidthD > i1 && (screenHeight > configuratio || (screenWidthD > configuratio && screenHeight > i1))) {
          label_005a :
             i = 5;
          }else if(screenWidthD < 500){
             tE = 480;
             i1 = 640;
             if (screenWidthD <= i1 || (screenHeight <= tE && (screenWidthD <= tE || screenHeight <= i1))) {
                if (screenWidthD >= 360) {
                   i = 3;
                }
             }
          }
          i = 4;
       }else {
          goto label_005a ;
       }
       this.G = i;
       tE = this.E;
       Drawable uDrawable = null;
       if (this.C != null) {
          if (this.z == null) {
             v5 ov5 = new v5(this, this.a);
             this.z = ov5;
             if (this.B != null) {
                ov5.setImageDrawable(this.A);
                this.A = uDrawable;
                this.B = false;
             }
             this.z.measure(View$MeasureSpec.makeMeasureSpec(false, false), View$MeasureSpec.makeMeasureSpec(false, false));
          }
          tE = tE - this.z.getMeasuredWidth();
       }else {
          this.z = uDrawable;
       }
       this.F = tE;
       return;
    }
    public final boolean h(l64 p0){
       return false;
    }
    public final boolean i(){
       ArrayList uArrayList;
       int i1;
       l64 ol64;
       View view;
       w5 ow5 = this;
       w5 c = ow5.c;
       int i = 0;
       if (c != null) {
          uArrayList = c.l();
          i1 = uArrayList.size();
       }else {
          uArrayList = null;
          i1 = 0;
       }
       w5 g = ow5.G;
       w5 f = ow5.F;
       int i2 = View$MeasureSpec.makeMeasureSpec(i, i);
       w5 y = ow5.y;
       int i3 = 0;
       int i4 = 0;
       int i5 = 0;
       int i6 = 0;
       while (true) {
          int i7 = 2;
          int b = true;
          if (i3 < i1) {
             ol64 = uArrayList.get(i3);
             l64 y1 = ol64.y;
             int i8 = ((i8 = y1 & 0x02) == i7)? 1: 0;
             if (i8) {
                i5 = i5 + 1;
             }else if((i8 = y1 & 0x01) == b){
                i8 = 1;
             }else {
                i8 = 0;
             }
             if (i8) {
                i6 = i6 + 1;
             }else {
                i4 = 1;
             }
             if (ow5.H != null && ol64.C != null) {
                g = null;
             }
             i3 = i3 + 1;
             y1 = 0;
          }else if(ow5.C != null && (i4 && ((i6 + i5)) <= g)){
             g = g - 1;
          }
          int i9 = g - i5;
          w5 i10 = ow5.I;
          i10.clear();
          i = 0;
          i3 = 0;
          while (i < i1) {
             l64 ol641 = uArrayList.get(i);
             l64 y2 = ol641.y;
             i6 = ((i6 = y2 & 0x02) == i7)? 1: 0;
             ol64 = ol641.b;
             if (i6) {
                view = ow5.a(ol641, null, y);
                view.measure(i2, i2);
                i5 = view.getMeasuredWidth();
                f = f - i5;
                if (!i3) {
                   i3 = i5;
                }
                if (ol64 != null) {
                   i10.put(ol64, b);
                }
                ol641.h(b);
             }else if((i5 = y2 & 0x01) == b){
                view = 1;
             }else {
                view = 0;
             }
             if (view) {
                i5 = i10.get(ol64);
                i6 = (i9 <= 0 && (!i5 || f <= 0))? 0: 1;
                View view1 = null;
                if (i6) {
                   View view2 = ow5.a(ol641, view1, y);
                   view2.measure(i2, i2);
                   b = view2.getMeasuredWidth();
                   f = f - b;
                   if (!i3) {
                      i3 = b;
                   }
                   b = ((b = f + i3) > 0)? 1: 0;
                   i6 = i6 & b;
                }
                if (i6 && ol64 != null) {
                   i10.put(ol64, true);
                }else if(i5){
                   i10.put(ol64, false);
                   i5 = 0;
                   while (i5 < i) {
                      l64 ol642 = uArrayList.get(i5);
                      if (ol642.b == ol64) {
                         if (ol642.g()) {
                            i9 = i9 + 1;
                         }
                         ol642.h(false);
                      }
                      i5 = i5 + 1;
                      view1 = 0;
                   }
                }
                if (i6) {
                   i9 = i9 - 1;
                }
                ol641.h(i6);
             }else {
                ol641.h(false);
             label_00ff :
                i = i + 1;
                i7 = 2;
                b = true;
             }
             view = 0;
             goto label_00ff ;
          }
          return true;
       }
    }
    public final void j(b74 p0){
       this.v = p0;
    }
    public final boolean k(l64 p0){
       return false;
    }
    public final boolean l(){
       w5 tc;
       if (this.C != null && (!this.e() && ((tc = this.c) != null && (this.y != null && this.L == null)))) {
          tc.i();
          if (!tc.j.isEmpty()) {
             t5 ot5 = new t5(this, 0, new r5(this, this.b, this.c, this.z));
             this.L = ot5;
             this.y.post(ot5);
             return true;
          }
       }
       return 0;
    }
}
