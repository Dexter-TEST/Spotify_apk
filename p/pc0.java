package p.pc0;
import android.view.View$OnKeyListener;
import android.widget.PopupWindow$OnDismissListener;
import p.s64;
import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import p.lc0;
import java.lang.Object;
import p.mc0;
import p.vf;
import p.wh7;
import p.eh7;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import java.lang.Math;
import android.os.Handler;
import p.oc0;
import p.wl3;
import p.e64;
import p.c74;
import android.os.Build$VERSION;
import android.widget.PopupWindow;
import android.transition.Transition;
import p.w64;
import java.lang.Class;
import p.b74;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.View$OnAttachStateChangeListener;
import java.util.Iterator;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.HeaderViewListAdapter;
import p.b64;
import p.ue1;
import p.ev6;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import p.a74;
import android.view.MenuItem;
import android.view.SubMenu;
import p.l64;
import android.widget.AdapterView;
import android.view.ViewGroup;
import java.lang.Boolean;
import java.lang.reflect.Method;
import p.x64;
import android.graphics.Rect;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.lang.CharSequence;

public final class pc0 extends s64 implements View$OnKeyListener, PopupWindow$OnDismissListener	// class@002231 from classes.dex
{
    public final lc0 A;
    public final mc0 B;
    public final vf C;
    public int D;
    public int E;
    public View F;
    public View G;
    public int H;
    public boolean I;
    public boolean J;
    public int K;
    public int L;
    public boolean M;
    public boolean N;
    public b74 O;
    public ViewTreeObserver P;
    public PopupWindow$OnDismissListener Q;
    public boolean R;
    public final Context b;
    public final int c;
    public final int t;
    public final int v;
    public final boolean w;
    public final Handler x;
    public final ArrayList y;
    public final ArrayList z;

    public void pc0(Context p0,View p1,int p2,int p3,boolean p4){
       super();
       this.y = new ArrayList();
       this.z = new ArrayList();
       int i = 0;
       this.A = new lc0(i, this);
       this.B = new mc0(i, this);
       this.C = new vf(2, this);
       this.D = i;
       this.E = i;
       this.b = p0;
       this.F = p1;
       this.t = p2;
       this.v = p3;
       this.w = p4;
       this.M = i;
       if (eh7.d(p1) == 1) {
       }else {
          i = 1;
       }
       this.H = i;
       Resources resources = p0.getResources();
       this.c = Math.max((resources.getDisplayMetrics().widthPixels / 2), resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
       this.x = new Handler();
       return;
    }
    public final boolean a(){
       pc0 tz = this.z;
       int i = 0;
       if (tz.size() > 0 && tz.get(i).a.a()) {
          i = true;
       }
       return i;
    }
    public final void b(e64 p0,boolean p1){
       pc0 tO;
       pc0 tP;
       int i2;
       pc0 tz = this.z;
       int i = tz.size();
       int i1 = 0;
       while (true) {
          if (i1 < i) {
             if (p0 == tz.get(i1).b) {
             label_0019 :
                if (i1 < 0) {
                   return;
                }
                if ((i = i1 + 1) < tz.size()) {
                   tz.get(i).b.c(false);
                }
                oc0 ooc0 = tz.remove(i1);
                ooc0.b.r(this);
                ooc0 = ooc0.a;
                if (this.R != null) {
                   if (Build$VERSION.SDK_INT >= 23) {
                      w64.b(ooc0.P, null);
                   }else {
                      ooc0.getClass();
                   }
                   ooc0.P.setAnimationStyle(false);
                }
                ooc0.dismiss();
                if ((i = tz.size()) > 0) {
                   this.H = tz.get((i - 1)).c;
                }else if(eh7.d(this.F) == 1){
                   i2 = 0;
                }else {
                   i2 = 1;
                }
                this.H = i2;
                if (!i) {
                   this.dismiss();
                   if ((tO = this.O) != null) {
                      tO.b(p0, true);
                   }
                   if ((tP = this.P) != null) {
                      if (tP.isAlive()) {
                         this.P.removeGlobalOnLayoutListener(this.A);
                      }
                      this.P = null;
                   }
                   this.G.removeOnAttachStateChangeListener(this.B);
                   this.Q.onDismiss();
                   break ;
                }else if(p1){
                   tz.get(false).b.c(false);
                   break ;
                }
                break ;
             }else {
                i1 = i1 + 1;
             }
          }else {
             i1 = -1;
             goto label_0019 ;
          }
       }
       return;
    }
    public final void c(){
       if (this.a()) {
          return;
       }
       pc0 ty = this.y;
       Iterator iterator = ty.iterator();
       while (iterator.hasNext()) {
          this.v(iterator.next());
       }
       ty.clear();
       ty = this.F;
       this.G = ty;
       if (ty != null) {
          iterator = (this.P == null)? 1: 0;
          ViewTreeObserver viewTreeObse = ty.getViewTreeObserver();
          this.P = viewTreeObse;
          if (iterator) {
             viewTreeObse.addOnGlobalLayoutListener(this.A);
          }
          this.G.addOnAttachStateChangeListener(this.B);
       }
       return;
    }
    public final void d(){
       Iterator iterator = this.z.iterator();
       while (iterator.hasNext()) {
          ListAdapter adapter = iterator.next().a.c.getAdapter();
          if (adapter instanceof HeaderViewListAdapter) {
             adapter = adapter.getWrappedAdapter();
          }else {
          }
          adapter.notifyDataSetChanged();
       }
       return;
    }
    public final void dismiss(){
       int i;
       pc0 tz = this.z;
       if ((i = tz.size()) > 0) {
          oc0[] ooc0Array = new oc0[i];
          oc0[] ooc0Array1 = tz.toArray(ooc0Array);
          while ((i = i - 1) >= 0) {
             object oobject = ooc0Array1[i];
             if (oobject.a.a()) {
                oobject.a.dismiss();
             }
          }
       }
       return;
    }
    public final ue1 e(){
       pc0 tz = this.z;
       ue1 oue1 = (tz.isEmpty())? null: tz.get((tz.size() - 1)).a.c;
       return oue1;
    }
    public final boolean f(ev6 p0){
       pc0 tO;
       Iterator iterator = this.z.iterator();
       while (true) {
          if (iterator.hasNext()) {
             oc0 ooc0 = iterator.next();
             if (p0 == ooc0.b) {
                ooc0.a.c.requestFocus();
                return true;
             }
          }else if(p0.hasVisibleItems()){
             this.l(p0);
             if ((tO = this.O) != null) {
                tO.p(p0);
                break ;
             }
             break ;
          }else {
             return false;
          }
       }
       return true;
    }
    public final boolean i(){
       return false;
    }
    public final void j(b74 p0){
       this.O = p0;
    }
    public final void l(e64 p0){
       p0.b(this, this.b);
       if (this.a()) {
          this.v(p0);
       }else {
          this.y.add(p0);
       }
       return;
    }
    public final void n(View p0){
       if (this.F != p0) {
          this.F = p0;
          this.E = Gravity.getAbsoluteGravity(this.D, eh7.d(p0));
       }
       return;
    }
    public final void o(boolean p0){
       this.M = p0;
    }
    public final void onDismiss(){
       oc0 ooc0;
       pc0 tz = this.z;
       int i = tz.size();
       int i1 = 0;
       while (true) {
          if (i1 < i) {
             ooc0 = tz.get(i1);
             if (!ooc0.a.a()) {
             label_001d :
                if (ooc0 != null) {
                   ooc0.b.c(false);
                   break ;
                }
                break ;
             }else {
                i1 = i1 + 1;
             }
          }else {
             ooc0 = null;
             goto label_001d ;
          }
       }
       return;
    }
    public final boolean onKey(View p0,int p1,KeyEvent p2){
       if (p2.getAction() != 1 || p1 != 82) {
          return false;
       }
       this.dismiss();
       return true;
    }
    public final void p(int p0){
       if (this.D != p0) {
          this.D = p0;
          this.E = Gravity.getAbsoluteGravity(p0, eh7.d(this.F));
       }
       return;
    }
    public final void q(int p0){
       this.I = true;
       this.K = p0;
    }
    public final void r(PopupWindow$OnDismissListener p0){
       this.Q = p0;
    }
    public final void s(boolean p0){
       this.N = p0;
    }
    public final void t(int p0){
       this.J = true;
       this.L = p0;
    }
    public final void v(e64 p0){
       oc0 ooc0;
       MenuItem item;
       View view;
       Method u;
       int i3;
       int sDK_INT;
       int[] ointArray;
       Rect rect;
       int i4;
       int i5;
       s64 a;
       wl3 c;
       pc0 opc0 = this;
       e64 uoe64 = p0;
       pc0 b = opc0.b;
       LayoutInflater layoutInflat = LayoutInflater.from(b);
       b64 uob64 = new b64(uoe64, layoutInflat, opc0.w, 0x7f0d000b);
       boolean b1 = true;
       if (!this.a() && opc0.M != null) {
          uob64.c = b1;
       }else if(this.a()){
          uob64.c = s64.u(p0);
       }
       boolean i = s64.m(uob64, b, opc0.c);
       a74 uoa74 = new a74(b, opc0.t, opc0.v);
       uoa74.T = opc0.C;
       uoa74.G = opc0;
       wl3 p = uoa74.P;
       p.setOnDismissListener(opc0);
       uoa74.F = opc0.F;
       uoa74.C = opc0.E;
       uoa74.O = b1;
       p.setFocusable(b1);
       p.setInputMethodMode(2);
       uoa74.p(uob64);
       uoa74.r(i);
       uoa74.C = opc0.E;
       pc0 z = opc0.z;
       if (z.size() > 0) {
          ooc0 = z.get((z.size() - b1));
          oc0 b2 = ooc0.b;
          int i1 = b2.size();
          int i2 = 0;
          while (true) {
             if (i2 < i1) {
                item = b2.getItem(i2);
                if (item.hasSubMenu() && uoe64 == item.getSubMenu()) {
                label_0095 :
                   if (item != null) {
                      c = ooc0.a.c;
                      ListAdapter adapter = c.getAdapter();
                      if (adapter instanceof HeaderViewListAdapter) {
                         i1 = adapter.getHeadersCount();
                         adapter = adapter.getWrappedAdapter();
                      }else {
                         i1 = 0;
                      }
                      i2 = adapter.getCount();
                      i3 = 0;
                      while (true) {
                         ointArray = -1;
                         if (i3 < i2) {
                            if (item == adapter.b(i3)) {
                            label_00c9 :
                               if (i3 != ointArray && ((i3 = (i3 + i1) - c.getFirstVisiblePosition()) >= 0 && i3 < c.getChildCount())) {
                                  view = c.getChildAt(i3);
                               }
                            }else {
                               i3 = i3 + 1;
                               view = 1;
                            }
                         }else {
                            i3 = -1;
                            goto label_00c9 ;
                         }
                      }
                   }
                   view = null;
                }else {
                   i2 = i2 + 1;
                   c = 2;
                }
             }else {
                item = null;
                goto label_0095 ;
             }
          }
       }else {
          view = null;
          ooc0 = null;
       }
       if (view != null) {
          if (Build$VERSION.SDK_INT <= 28) {
             if ((u = a74.U) != null) {
                i3 = 1;
                try{
                   Object[] objArray = new Object[i3];
                   objArray[0] = Boolean.FALSE;
                   u.invoke(p, objArray);
                }catch(java.lang.Exception e0){
                }
             }
          }else {
             x64.a(p, false);
          }
          if ((sDK_INT = Build$VERSION.SDK_INT) >= 23) {
             w64.a(p, null);
          }
          p = z.get((z.size() - 1)).a.c;
          ointArray = new int[2];
          p.getLocationOnScreen(ointArray);
          rect = new Rect();
          e0.G.getWindowVisibleDisplayFrame(rect);
          if (e0.H == 1) {
             if ((((p.getWidth() + ointArray[0]) + i)) > rect.right) {
                i4 = 0;
             label_0144 :
                rect = 1;
                rect = (i4 == rect)? 1: 0;
                e0.H = i4;
                if (sDK_INT >= 26) {
                   uoa74.F = view;
                   i4 = 0;
                   i5 = 0;
                }else {
                   int[] ointArray1 = new int[2];
                   e0.F.getLocationOnScreen(ointArray1);
                   int[] ointArray2 = new int[2];
                   view.getLocationOnScreen(ointArray2);
                   if (((e0.E & 0x07)) == 5) {
                      i5 = 0;
                      ointArray1[i5] = e0.F.getWidth() + ointArray1[i5];
                      ointArray2[i5] = view.getWidth() + ointArray2[i5];
                   }else {
                      i5 = 0;
                   }
                   i5 = ointArray2[i5] - ointArray1[i5];
                   i4 = ointArray2[1] - ointArray1[1];
                }
                if (((e0.E & 5)) == 5) {
                   if (rect) {
                      i5 = i5 + i;
                   }else {
                      i = view.getWidth();
                   label_01a5 :
                      i5 = i5 - i;
                   }
                }else if(rect){
                   i5 = i5 + view.getWidth();
                }else {
                   goto label_01a5 ;
                }
                uoa74.w = i5;
                i = true;
                uoa74.B = i;
                uoa74.A = i;
                uoa74.h(i4);
             }
          }else if(((ointArray[0] - i)) < 0){
          }
          i4 = 1;
          goto label_0144 ;
       }else if(opc0.I != null){
          uoa74.w = opc0.K;
       }
       if (opc0.J != null) {
          uoa74.h(opc0.L);
       }
       rect = ((a = opc0.a) != null)? new Rect(a): null;
       uoa74.N = rect;
       z.add(new oc0(uoa74, uoe64, e0.H));
       uoa74.c();
       p = uoa74.c;
       p.setOnKeyListener(e0);
       if (ooc0 == null && (e0.N != null && uoe64.m != null)) {
          FrameLayout uFrameLayout = layoutInflat.inflate(R.layout.abc_popup_menu_header_item_layout, p, false);
          uFrameLayout.setEnabled(false);
          uFrameLayout.findViewById(0x1020016).setText(uoe64.m);
          p.addHeaderView(uFrameLayout, null, false);
          uoa74.c();
       }
       return;
    }
}
