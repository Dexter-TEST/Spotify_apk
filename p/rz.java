package p.rz;
import android.os.Handler;
import android.os.Looper;
import p.kz;
import android.os.Handler$Callback;
import android.content.Context;
import android.view.ViewGroup;
import com.google.android.material.snackbar.SnackbarContentLayout;
import java.lang.Object;
import p.lz;
import p.mz;
import p.ty0;
import java.lang.String;
import android.view.LayoutInflater;
import android.content.res.TypedArray;
import android.view.View;
import p.qz;
import android.widget.TextView;
import p.ry7;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.graphics.Rect;
import p.wh7;
import p.gh7;
import p.dh7;
import p.uf;
import p.j15;
import p.jh7;
import p.e50;
import p.n3;
import android.view.accessibility.AccessibilityManager;
import java.lang.IllegalArgumentException;
import p.qm6;
import p.om6;
import java.lang.ref.Reference;
import java.util.ArrayList;
import p.wm6;
import java.lang.Class;
import p.mm6;
import p.ym6;
import java.lang.Iterable;
import java.util.List;
import p.dj0;
import java.util.Iterator;
import p.tp2;
import android.view.ViewParent;
import java.lang.Runnable;
import android.os.Build$VERSION;
import p.av0;
import com.google.android.material.behavior.SwipeDismissBehavior;

public abstract class rz	// class@00258e from classes.dex
{
    public final ViewGroup a;
    public final Context b;
    public final qz c;
    public final js0 d;
    public int e;
    public final lz f;
    public final Rect g;
    public int h;
    public int i;
    public int j;
    public int k;
    public ArrayList l;
    public final AccessibilityManager m;
    public final mz n;
    public static final Handler o;
    public static final int[] p;

    static {
       int[] ointArray = new int[]{0x7f030599};
       rz.p = ointArray;
       rz.o = new Handler(Looper.getMainLooper(), new kz());
    }
    public void rz(Context p0,ViewGroup p1,SnackbarContentLayout p2,SnackbarContentLayout p3){
       super();
       int i = 0;
       this.f = new lz(this, i);
       this.n = new mz(this);
       if (p2 == null) {
          throw new IllegalArgumentException("Transient bottom bar must have non-null content");
       }
       if (p3 == null) {
          throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
       }
       this.a = p1;
       this.d = p3;
       this.b = p0;
       ty0.i(p0, ty0.k, "Theme.AppCompat");
       LayoutInflater layoutInflat = LayoutInflater.from(p0);
       TypedArray typedArray = p0.obtainStyledAttributes(rz.p);
       int i1 = -1;
       int resourceId = typedArray.getResourceId(i, i1);
       typedArray.recycle();
       i1 = (resourceId != i1)? 1: 0;
       i1 = (i1)? 0x7f0d010a: 0x7f0d006a;
       qz oqz = layoutInflat.inflate(i1, p1, i);
       this.c = oqz;
       float actionTextCo = oqz.getActionTextColorAlpha();
       if (0x3f800000 - actionTextCo) {
          p2.b.setTextColor(ry7.M(ry7.w(p2, R.attr.colorSurface), actionTextCo, p2.b.getCurrentTextColor()));
       }
       p2.setMaxInlineActionWidth(oqz.getMaxInlineActionWidth());
       oqz.addView(p2);
       ViewGroup$LayoutParams layoutParams = oqz.getLayoutParams();
       if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
          this.g = new Rect(layoutParams.leftMargin, layoutParams.topMargin, layoutParams.rightMargin, layoutParams.bottomMargin);
       }
       gh7.f(oqz, 1);
       dh7.s(oqz, 1);
       oqz.setFitsSystemWindows(1);
       jh7.u(oqz, new uf(5, this));
       wh7.o(oqz, new e50(4, this));
       this.m = p0.getSystemService("accessibility");
       return;
    }
    public final void a(int p0){
       qm6 oqm6 = qm6.b();
       rz tn = this.n;
       qm6 a = oqm6.a;
       _monitor_enter(a);
       if (oqm6.c(tn)) {
          oqm6.a(oqm6.c, p0);
       }else {
          qm6 d = oqm6.d;
          int i = 0;
          if (d != null) {
             tn = (tn != null && d.a.get() == tn)? 1: 0;
             if (tn) {
                i = 1;
             }
          }
          if (i) {
             oqm6.a(oqm6.d, p0);
          }
       }
       _monitor_exit(a);
       return;
    }
    public final void b(){
       rz tl;
       ym6 f;
       rz l;
       qm6 oqm6 = qm6.b();
       qm6 a = oqm6.a;
       _monitor_enter(a);
       if (oqm6.c(this.n)) {
          oqm6.c = null;
          if (oqm6.d != null) {
             oqm6.g();
          }
       }
       _monitor_exit(a);
       if ((tl = this.l) != null) {
          int i = tl.size();
          while (true) {
             if ((i = i - 1) >= 0) {
                wm6 owm6 = this.l.get(i);
                owm6.getClass();
                wm6 a1 = owm6.a;
                Iterator iterator = dj0.B0(a1.d).iterator();
                if (!iterator.hasNext()) {
                   owm6.b.getClass();
                   if ((f = a1.f) != null && (l = f.l) != null) {
                      l.remove(owm6);
                   }
                   a1.f = null;
                }else {
                   tp2.v(iterator.next());
                   throw null;
                }
             }
          }
       }
       ViewParent parent = this.c.getParent();
       if (parent instanceof ViewGroup) {
          parent.removeView(this.c);
       }
       return;
    }
    public final void c(){
       rz tl;
       qm6 oqm6 = qm6.b();
       qm6 a = oqm6.a;
       _monitor_enter(a);
       if (oqm6.c(this.n)) {
          oqm6.f(oqm6.c);
       }
       _monitor_exit(a);
       if ((tl = this.l) != null) {
          int i = tl.size();
          while ((i = i - 1) >= 0) {
             wm6 owm6 = this.l.get(i);
             owm6.getClass();
             Iterator iterator = dj0.B0(owm6.a.d).iterator();
             if (!iterator.hasNext()) {
                owm6.b.getClass();
             }else {
                tp2.v(iterator.next());
                throw null;
             }
          }
       }
       return;
    }
    public final void d(){
       rz tm;
       List enabledAcces;
       int i = 0;
       int i1 = 1;
       if ((tm = this.m) == null) {
       }else if((enabledAcces = tm.getEnabledAccessibilityServiceList(i1)) != null && enabledAcces.isEmpty()){
          enabledAcces = 0;
       label_0016 :
          rz tc = this.c;
          if (tm) {
             tc.post(new lz(this, i1));
          }else if(tc.getParent() != null){
             tc.setVisibility(i);
          }
          this.c();
          return;
       }
       tm = 1;
       goto label_0016 ;
    }
    public final void e(){
       rz tg;
       rz tc = this.c;
       ViewGroup$LayoutParams layoutParams = tc.getLayoutParams();
       if (layoutParams instanceof ViewGroup$MarginLayoutParams && (tg = this.g) != null) {
          layoutParams.bottomMargin = tg.bottom + this.h;
          layoutParams.leftMargin = tg.left + this.i;
          layoutParams.rightMargin = tg.right + this.j;
          tc.requestLayout();
          if (Build$VERSION.SDK_INT >= 29) {
             tg = 0;
             if (this.k > null) {
                layoutParams = tc.getLayoutParams();
                layoutParams = (layoutParams instanceof av0 && layoutParams.a instanceof SwipeDismissBehavior)? 1: 0;
                if (layoutParams) {
                   tg = 1;
                }
             }
             if (tg) {
                rz tf = this.f;
                tc.removeCallbacks(tf);
                tc.post(tf);
             }
          }
       }
       return;
    }
}
