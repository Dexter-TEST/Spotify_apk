package p.jg;
import p.c64;
import android.view.LayoutInflater$Factory2;
import p.rf;
import p.wh6;
import android.os.Build;
import java.lang.Object;
import java.lang.String;
import android.content.Context;
import android.view.Window;
import p.kf;
import p.tf;
import android.app.Dialog;
import androidx.appcompat.app.a;
import android.content.ContextWrapper;
import java.lang.Class;
import java.lang.Integer;
import p.ng;
import p.br3;
import android.os.Build$VERSION;
import android.content.res.Resources;
import android.content.res.Configuration;
import p.dr3;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import p.ag;
import p.yf;
import p.zf;
import p.ig;
import java.lang.System;
import android.view.Window$Callback;
import android.app.Activity;
import p.ip7;
import p.do5;
import p.eg;
import java.lang.IllegalStateException;
import android.app.UiModeManager;
import p.gg;
import p.b6;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.WindowManager;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.util.TypedValue;
import android.content.res.Resources$Theme;
import p.mt0;
import p.ej4;
import android.content.res.TypedArray;
import p.hg;
import android.view.ViewGroup;
import p.g54;
import p.ol3;
import p.e64;
import p.c74;
import android.view.LayoutInflater;
import androidx.appcompat.view.menu.ExpandedMenuView;
import p.nl3;
import android.widget.ListAdapter;
import android.widget.AbsListView;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.AdapterView;
import android.view.ViewParent;
import android.view.WindowManager$LayoutParams;
import android.view.ViewManager;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import p.p67;
import p.f67;
import p.u44;
import android.os.Bundle;
import android.view.KeyCharacterMap;
import android.util.AndroidRuntimeException;
import android.window.OnBackInvokedCallback;
import p.cg;
import p.xp7;
import android.graphics.Rect;
import android.view.ViewGroup$MarginLayoutParams;
import p.bl7;
import java.lang.reflect.Method;
import p.wh7;
import p.kh7;
import p.jh7;
import android.widget.FrameLayout$LayoutParams;
import p.dh7;
import p.n6;
import p.dg;
import java.lang.Runnable;
import android.content.ComponentName;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import java.lang.ref.WeakReference;
import p.sk;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ActionMenuView;
import android.view.ViewConfiguration;
import p.w5;
import android.view.MenuItem;
import java.lang.CharSequence;
import p.b61;
import android.widget.TextView;
import android.content.pm.PackageManager;
import android.content.pm.ActivityInfo;
import android.os.Handler;
import android.os.Looper;
import p.g6;
import android.util.DisplayMetrics;
import p.ry7;
import java.lang.reflect.Field;
import java.lang.reflect.AccessibleObject;
import android.util.Log;
import java.util.Map;
import p.ek3;
import p.vj3;
import p.uj3;
import java.lang.Enum;
import android.util.AttributeSet;
import android.graphics.drawable.Drawable;
import p.mw5;
import android.window.OnBackInvokedDispatcher;
import p.ii;
import java.lang.ClassLoader;
import java.lang.reflect.Constructor;
import p.pg7;
import p.v64;
import p.if6;
import p.kh3;
import p.lg;
import p.mi;
import android.media.AudioManager;
import android.os.BaseBundle;
import p.uf;
import p.j15;
import androidx.appcompat.widget.ContentFrameLayout;
import android.widget.FrameLayout;
import p.uv1;
import p.pr0;
import android.text.TextUtils;
import p.gh7;
import java.lang.StringBuilder;
import p.en6;
import p.qo5;
import android.location.LocationManager;

public final class jg extends rf implements c64, LayoutInflater$Factory2	// class@001ad3 from classes.dex
{
    public final Object A;
    public final Context B;
    public Window C;
    public dg D;
    public final kf E;
    public do5 F;
    public lw6 G;
    public CharSequence H;
    public b61 I;
    public u44 J;
    public g54 K;
    public b6 L;
    public ActionBarContextView M;
    public PopupWindow N;
    public tf O;
    public fk7 P;
    public final boolean Q;
    public boolean R;
    public ViewGroup S;
    public TextView T;
    public View U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public boolean a0;
    public boolean b0;
    public boolean c0;
    public ig[] d0;
    public ig e0;
    public boolean f0;
    public boolean g0;
    public boolean h0;
    public boolean i0;
    public Configuration j0;
    public final int k0;
    public int l0;
    public int m0;
    public boolean n0;
    public eg o0;
    public eg p0;
    public boolean q0;
    public int r0;
    public final tf s0;
    public boolean t0;
    public Rect u0;
    public Rect v0;
    public ii w0;
    public OnBackInvokedDispatcher x0;
    public OnBackInvokedCallback y0;
    public static final int[] A0;
    public static final boolean B0;
    public static final boolean C0;
    public static final wh6 z0;

    static {
       jg.z0 = new wh6();
       int[] ointArray = new int[]{0x1010054};
       jg.A0 = ointArray;
       jg.B0 = "robolectric".equals(Build.FINGERPRINT) ^ 1;
       jg.C0 = true;
    }
    public void jg(Context p0,Window p1,kf p2,Object p3){
       Integer orDefault;
       super();
       this.P = null;
       this.Q = true;
       this.k0 = -100;
       this.s0 = new tf(this, 0);
       this.B = p0;
       this.E = p2;
       this.A = p3;
       if (p3 instanceof Dialog) {
          while (true) {
             if (p0 != null) {
                if (p0 instanceof a) {
                   break ;
                }else if(p0 instanceof ContextWrapper){
                   p0 = p0.getBaseContext();
                }else {
                label_0033 :
                   fk7 uofk7 = null;
                   break ;
                }
             }else {
                goto label_0033 ;
             }
          }
          if (p0 != null) {
             this.k0 = p0.A().k0;
          }
       }
       if (this.k0 == -100) {
          wh6 z0 = jg.z0;
          if ((orDefault = z0.getOrDefault(this.A.getClass().getName(), null)) != null) {
             this.k0 = orDefault.intValue();
             z0.remove(this.A.getClass().getName());
          }
       }
       if (p1 != null) {
          this.o(p1);
       }
       ng.d();
       return;
    }
    public static br3 p(Context p0){
       br3 c;
       br3 b;
       Locale locale;
       int sDK_INT = Build$VERSION.SDK_INT;
       br3 uobr3 = null;
       if (sDK_INT >= 33) {
          return uobr3;
       }
       if ((c = rf.c) == null) {
          return uobr3;
       }
       br3 uobr31 = jg.z(p0.getApplicationContext().getResources().getConfiguration());
       uobr3 = c.a;
       int i = 0;
       if (sDK_INT >= 24) {
          if (uobr3.isEmpty()) {
             b = br3.b;
          }else {
             LinkedHashSet linkedHashSe = new LinkedHashSet();
             while (true) {
                int i1 = uobr31.a.size() + uobr3.size();
                if (i < i1) {
                   if (i < uobr3.size()) {
                      locale = c.c(i);
                   }else {
                      int i2 = i - uobr3.size();
                      locale = uobr31.c(i2);
                   }
                   if (locale != null) {
                      linkedHashSe.add(locale);
                   }
                   i = i + 1;
                }else {
                   break ;
                }
             }
             Locale[] localeArray = new Locale[linkedHashSe.size()];
             b = br3.a(linkedHashSe.toArray(localeArray));
          }
       }else if(uobr3.isEmpty()){
          b = br3.b;
       }else {
          b = br3.b(c.c(i).toString());
       }
       if (!b.a.isEmpty()) {
          uobr31 = b;
       }
       return uobr31;
    }
    public static Configuration t(Context p0,int p1,br3 p2,Configuration p3,boolean p4){
       int i;
       if (p1 != 1) {
          if (p1 != 2) {
             i = (p4)? 0: p0.getApplicationContext().getResources().getConfiguration().uiMode & 0x30;
          }else {
             i = 32;
          }
       }else {
          i = 16;
       }
       Configuration uConfigurati = new Configuration();
       uConfigurati.fontScale = 0;
       if (p3 != null) {
          uConfigurati.setTo(p3);
       }
       uConfigurati.uiMode = i | (uConfigurati.uiMode & 0xcf);
       if (p2 != null) {
          if (Build$VERSION.SDK_INT >= 24) {
             ag.d(uConfigurati, p2);
          }else {
             yf.b(uConfigurati, p2.c(0));
             yf.a(uConfigurati, p2.c(0));
          }
       }
       return uConfigurati;
    }
    public static br3 z(Configuration p0){
       if (Build$VERSION.SDK_INT >= 24) {
          return ag.b(p0);
       }
       return br3.b(zf.a(p0.locale));
    }
    public final ig A(int p0){
       jg td0;
       object oobject;
       if ((td0 = this.d0) == null || td0.length <= p0) {
          ig[] oigArray = new ig[(p0 + 1)];
          if (td0 != null) {
             System.arraycopy(td0, 0, oigArray, 0, td0.length);
          }
          this.d0 = oigArray;
          td0 = oigArray;
       }
       if ((oobject = td0[p0]) == null) {
          oobject = new ig(p0);
          td0[p0] = oobject;
       }
       return oobject;
    }
    public final Window$Callback B(){
       return this.C.getCallback();
    }
    public final void C(){
       this.w();
       if (this.X != null && this.F == null) {
          jg tA = this.A;
          if (tA instanceof Activity) {
             this.F = new ip7(tA, this.Y);
          }else if(tA instanceof Dialog){
             this.F = new ip7(tA);
          }
          if ((tA = this.F) != null) {
             tA.p0(this.t0);
          }
       }
       return;
    }
    public final int D(Context p0,int p1){
       if (p1 == -100) {
          return -1;
       }
       if (p1 != -1) {
          if (p1) {
             if (p1 != 1 && p1 != 2) {
                if (p1 == 3) {
                   if (this.p0 == null) {
                      this.p0 = new eg(this, p0);
                   }
                   return this.p0.f();
                }else {
                   throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
             }
          }else if(Build$VERSION.SDK_INT >= 23 && !p0.getApplicationContext().getSystemService("uimode").getNightMode()){
             return -1;
          }else {
             return this.y(p0).f();
          }
       }
       return p1;
    }
    public final boolean E(){
       jg tojg = this.f0;
       this.f0 = false;
       ig oig = this.A(false);
       if (oig.m != null) {
          if (tojg == null) {
             this.s(oig, true);
          }
          return true;
       }else if((tojg = this.L) != null){
          tojg.a();
          return true;
       }else {
          this.C();
          if ((tojg = this.F) != null && tojg.j()) {
             return true;
          }
          return false;
       }
    }
    public final void F(ig p0,KeyEvent p1){
       ig a;
       Window$Callback uCallback;
       WindowManager systemServic;
       ig e;
       jg f;
       TypedValue resourceId;
       ig g;
       ViewGroup$LayoutParams layoutParams;
       int i2;
       jg ojg = this;
       ig oig = p0;
       if (oig.m == null && ojg.i0 == null) {
          jg b = ojg.B;
          int i = 0;
          if ((a = oig.a) == null) {
             int i1 = (((b.getResources().getConfiguration().screenLayout & 0x0f)) == 4)? 1: 0;
             if (i1) {
                return;
             }
          }
          if ((uCallback = this.B()) != null && !uCallback.onMenuOpened(a, oig.h)) {
             ojg.s(oig, true);
             return;
          }else if((systemServic = b.getSystemService("window")) == null){
             return;
          }else if(!this.H(p0, p1)){
             return;
          }else if((e = oig.e) != null && oig.n == null){
             if ((g = oig.g) != null && ((layoutParams = g.getLayoutParams()) != null && layoutParams.width == -1)) {
                i2 = -1;
             label_01ba :
                oig.l = i;
                WindowManager$LayoutParams layoutParams1 = new WindowManager$LayoutParams(i2, -2, 0, 0, 1002, 0x820000, -3);
                layoutParams.gravity = oig.c;
                layoutParams.windowAnimations = oig.d;
                systemServic.addView(oig.e, layoutParams);
                oig.m = true;
                if (a == null) {
                   this.J();
                }
                return;
             }
          }else if(e == null){
             this.C();
             Context uContext = ((f = ojg.F) != null)? f.F(): null;
             if (uContext != null) {
                b = uContext;
             }
             TypedValue typedValue = new TypedValue();
             Resources$Theme theme = b.getResources().newTheme();
             theme.setTo(b.getTheme());
             theme.resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true);
             if ((resourceId = typedValue.resourceId) != null) {
                theme.applyStyle(resourceId, true);
             }
             theme.resolveAttribute(R.attr.panelMenuListTheme, typedValue, true);
             if ((typedValue = typedValue.resourceId) != null) {
                theme.applyStyle(typedValue, true);
             }else {
                theme.applyStyle(R.style.Theme.AppCompat.CompactMenu, true);
             }
             mt0 typedValue1 = new mt0(b, i);
             typedValue1.getTheme().setTo(theme);
             oig.j = typedValue1;
             TypedArray typedArray = typedValue1.obtainStyledAttributes(ej4.M);
             oig.b = typedArray.getResourceId(86, i);
             oig.d = typedArray.getResourceId(true, i);
             typedArray.recycle();
             oig.e = new hg(ojg, oig.j);
             oig.c = 81;
          }else if(oig.n != null && e.getChildCount() > 0){
             oig.e.removeAllViews();
          }
          if ((g = oig.g) != null) {
             oig.f = g;
          }else if(oig.h == null){
             if (ojg.K == null) {
                ojg.K = new g54(ojg);
             }
             b = ojg.K;
             if (oig.i == null) {
                ol3 ool3 = new ol3(oig.j);
                oig.i = ool3;
                ool3.v = b;
                g = oig.h;
                g.b(ool3, g.a);
             }
             g = oig.i;
             e = oig.e;
             if (g.t == null) {
                g.t = g.b.inflate(R.layout.abc_expanded_menu_layout, e, i);
                if (g.w == null) {
                   g.w = new nl3(g);
                }
                g.t.setAdapter(g.w);
                g.t.setOnItemClickListener(g);
             }
             ol3 t = g.t;
             oig.f = t;
             if (t == null) {
                layoutParams = 0;
             label_0159 :
                if (g) {
                   if (oig.f != null) {
                      if (oig.g == null) {
                         g = oig.i;
                         if (g.w == null) {
                            g.w = new nl3(g);
                         }
                         if (g.w.getCount() <= 0) {
                            g = 0;
                         label_017d :
                            if (g) {
                               if ((layoutParams = oig.f.getLayoutParams()) == null) {
                                  layoutParams = new ViewGroup$LayoutParams(-2, -2);
                               }
                               oig.e.setBackgroundResource(oig.b);
                               ViewParent parent = oig.f.getParent();
                               if (parent instanceof ViewGroup) {
                                  parent.removeView(oig.f);
                               }
                               oig.e.addView(oig.f, layoutParams);
                               if (!oig.f.hasFocus()) {
                                  oig.f.requestFocus();
                               }
                            }
                         }
                      }
                      layoutParams = 1;
                      goto label_017d ;
                   }
                }
                oig.n = true;
             }
          }
          g = 1;
          goto label_0159 ;
          i2 = -2;
          goto label_01ba ;
       }
       return;
    }
    public final boolean G(ig p0,int p1,KeyEvent p2){
       boolean b = false;
       if (p2.isSystem()) {
          return b;
       }
       if (p0.k != null || (this.H(p0, p2) && (p0 = p0.h) != null)) {
          b = p0.performShortcut(p1, p2, 1);
       }
       return b;
    }
    public final boolean H(ig p0,KeyEvent p1){
       jg te0;
       jg tI;
       ig h;
       Resources$Theme theme1;
       mt0 omt01;
       jg tI1;
       ig h1;
       jg tI2;
       jg tI3;
       boolean deviceId;
       if (this.i0 != null) {
          return false;
       }
       if (p0.k != null) {
          return true;
       }
       if ((te0 = this.e0) != null && te0 != p0) {
          this.s(te0, false);
       }
       Window$Callback uCallback = this.B();
       ig a = p0.a;
       if (uCallback != null) {
          p0.g = uCallback.onCreatePanelView(a);
       }
       int i = 108;
       int i1 = (a != null && a != i)? 0: 1;
       if (i1 && (tI = this.I) != null) {
          tI.k();
          tI.v.l = true;
       }
       if (p0.g == null && (!i1 && this.F instanceof f67)) {
          if ((h = p0.h) == null || p0.o != null) {
             if (h == null) {
                tI = this.B;
                if (a == null || (a == i && this.I != null)) {
                   TypedValue typedValue = new TypedValue();
                   Resources$Theme theme = tI.getTheme();
                   theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                   int i2 = 0x7f03000d;
                   if (typedValue.resourceId != null) {
                      theme1 = tI.getResources().newTheme();
                      theme1.setTo(theme);
                      theme1.applyStyle(typedValue.resourceId, true);
                      theme1.resolveAttribute(i2, typedValue, true);
                   }else {
                      theme.resolveAttribute(i2, typedValue, true);
                      theme1 = null;
                   }
                   if (typedValue.resourceId != null) {
                      if (theme1 == null) {
                         theme1 = tI.getResources().newTheme();
                         theme1.setTo(theme);
                      }
                      theme1.applyStyle(typedValue.resourceId, true);
                   }
                   if (theme1 != null) {
                      mt0 omt0 = new mt0(tI, false);
                      omt0.getTheme().setTo(theme1);
                      omt01 = omt0;
                   }
                }
                e64 uoe64 = new e64(omt01);
                uoe64.e = this;
                h = p0.h;
                if (uoe64 != h) {
                   if (h != null) {
                      h.r(p0.i);
                   }
                   p0.h = uoe64;
                   if ((h = p0.i) != null) {
                      uoe64.b(h, uoe64.a);
                   }
                }
                if (p0.h == null) {
                   return false;
                }
             }
             if (i1 && (tI1 = this.I) != null) {
                if (this.J == null) {
                   this.J = new u44(true, this);
                }
                tI1.l(p0.h, this.J);
             }
             p0.h.w();
             if (!uCallback.onCreatePanelMenu(a, p0.h)) {
                if ((h1 = p0.h) != null) {
                   if (h1 != null) {
                      h1.r(p0.i);
                   }
                   p0.h = null;
                }
                if (i1 && (tI2 = this.I) != null) {
                   tI2.l(null, this.J);
                }
                return false;
             }else {
                p0.o = false;
             }
          }
          p0.h.w();
          if ((a = p0.p) != null) {
             p0.h.s(a);
             p0.p = null;
          }
          if (!uCallback.onPreparePanel(false, p0.g, p0.h)) {
             if (i1 && (tI3 = this.I) != null) {
                tI3.l(null, this.J);
             }
             p0.h.v();
             return false;
          }else if(p1 != null){
             deviceId = p1.getDeviceId();
          }else {
             deviceId = -1;
          }
          deviceId = (KeyCharacterMap.load(deviceId).getKeyboardType() != 1)? true: false;
          p0.h.setQwertyMode(deviceId);
          p0.h.v();
       }
       p0.k = true;
       p0.l = false;
       this.e0 = p0;
       return true;
    }
    public final void I(){
       if (this.R == null) {
          return;
       }
       throw new AndroidRuntimeException("Window feature must be requested before adding content");
    }
    public final void J(){
       jg ty0;
       if (Build$VERSION.SDK_INT >= 33) {
          int i = 0;
          if (this.x0 != null && (this.A(i).m != null && this.L == null)) {
             i = 1;
          }
          if (i && this.y0 == null) {
             this.y0 = cg.b(this.x0, this);
          }else if(!i && (ty0 = this.y0) != null){
             cg.c(this.x0, ty0);
          }
       }
       return;
    }
    public final int K(xp7 p0,Rect p1){
       int i1;
       jg tM;
       jg tS;
       Method a;
       int i3;
       int i4;
       int i = 0;
       if (p0 != null) {
          i1 = p0.d();
       }else if(p1 != null){
          i1 = p1.top;
       }else {
          i1 = 0;
       }
       if ((tM = this.M) != null && tM.getLayoutParams() instanceof ViewGroup$MarginLayoutParams) {
          ViewGroup$MarginLayoutParams layoutParams = this.M.getLayoutParams();
          int i2 = 1;
          if (this.M.isShown()) {
             if (this.u0 == null) {
                this.u0 = new Rect();
                this.v0 = new Rect();
             }
             jg tu0 = this.u0;
             jg tv0 = this.v0;
             if (p0 == null) {
                tu0.set(p1);
             }else {
                tu0.set(p0.b(), p0.d(), p0.c(), p0.a());
             }
             try{
                tS = this.S;
                if ((a = bl7.a) != null) {
                   i3 = 2;
                   Object[] objArray = new Object[i3];
                   objArray[i] = tu0;
                   objArray[i2] = tv0;
                   a.invoke(tS, objArray);
                }
                Rect top = tu0.top;
                a = tu0.left;
                Rect right = tu0.right;
                tv0 = this.S;
                xp7 oxp7 = (Build$VERSION.SDK_INT >= 23)? kh7.a(tv0): jh7.j(tv0);
                i3 = (oxp7 == null)? 0: oxp7.b();
                i4 = (oxp7 == null)? 0: oxp7.c();
                if (layoutParams.topMargin == top && (layoutParams.leftMargin == a && layoutParams.rightMargin == right)) {
                   a = 0;
                }else {
                   layoutParams.topMargin = top;
                   layoutParams.leftMargin = a;
                   layoutParams.rightMargin = right;
                   a = 1;
                }
                tu0 = this.B;
                if (top > null && this.U == null) {
                   View view = new View(tu0);
                   this.U = view;
                   view.setVisibility(8);
                   FrameLayout$LayoutParams layoutParams1 = new FrameLayout$LayoutParams(-1, layoutParams.topMargin, 51);
                   layoutParams1.leftMargin = i3;
                   layoutParams1.rightMargin = i4;
                   this.S.addView(this.U, -1, layoutParams1);
                }else if((tS = this.U) != null){
                   ViewGroup$MarginLayoutParams layoutParams2 = tS.getLayoutParams();
                   ViewGroup$MarginLayoutParams topMargin = layoutParams.topMargin;
                   if (layoutParams2.height != topMargin || (layoutParams2.leftMargin != i3 || layoutParams2.rightMargin != i4)) {
                      layoutParams2.height = topMargin;
                      layoutParams2.leftMargin = i3;
                      layoutParams2.rightMargin = i4;
                      this.U.setLayoutParams(layoutParams2);
                   }
                }
                i4 = ((tS = this.U) != null)? 1: 0;
                if (i4 && tS.getVisibility()) {
                   tS = this.U;
                   if (!((dh7.g(tS) & 0x2000))) {
                      i2 = 0;
                   }
                   int i5 = (i2)? n6.b(tu0, R.color.abc_decor_view_status_guard_light): n6.b(tu0, R.color.abc_decor_view_status_guard);
                   tS.setBackgroundColor(i5);
                }
                if (this.Z == null && i4) {
                   i1 = 0;
                }
             }catch(java.lang.Exception e0){
             }
          }else if(layoutParams.topMargin != null){
             layoutParams.topMargin = i;
          }else {
             i2 = 0;
          }
          int i6 = i2;
          i4 = 0;
          if (a) {
             this.M.setLayoutParams(layoutParams);
          }
       }else {
          i4 = 0;
       }
       if ((tS = this.U) != null) {
          if (!i4) {
             i = 8;
          }
          tS.setVisibility(e0);
       }
       return i1;
    }
    public final void a(View p0,ViewGroup$LayoutParams p1){
       this.w();
       this.S.findViewById(0x1020002).addView(p0, p1);
       this.D.a(this.C.getCallback());
    }
    public final void b(){
       if (this.F != null) {
          this.C();
          if (!this.F.H()) {
             this.r0 = this.r0 | 1;
             if (this.q0 == null) {
                dh7.m(this.C.getDecorView(), this.s0);
                this.q0 = true;
             }
          }
       }
       return;
    }
    public final void d(){
       String str;
       this.g0 = true;
       this.n(false, true);
       this.x();
       jg tA = this.A;
       if (tA instanceof Activity) {
          try{
             try{
                str = ej4.P(tA, tA.getComponentName());
             }catch(android.content.pm.PackageManager$NameNotFoundException e1){
                throw new IllegalArgumentException(e1);
             }
          }catch(java.lang.IllegalArgumentException e0){
             str = null;
          }
          if (str != null) {
             if ((tA = this.F) == null) {
                this.t0 = e0;
             }else {
                tA.p0(e0);
             }
          }
          Object y = rf.y;
          _monitor_enter(y);
          rf.f(this);
          rf.x.add(new WeakReference(this));
          _monitor_exit(y);
       }
       this.j0 = new Configuration(this.B.getResources().getConfiguration());
       this.h0 = e0;
       return;
    }
    public final void e(){
       jg y;
       if (this.A instanceof Activity) {
          y = rf.y;
          _monitor_enter(y);
          rf.f(this);
          _monitor_exit(y);
       }
       if (this.q0 != null) {
          this.C.getDecorView().removeCallbacks(this.s0);
       }
       this.i0 = true;
       if (this.k0 != -100) {
          y = this.A;
          if (y instanceof Activity && y.isChangingConfigurations()) {
             jg.z0.put(this.A.getClass().getName(), Integer.valueOf(this.k0));
          label_005c :
             if ((y = this.F) != null) {
                y.R();
             }
             if ((y = this.o0) != null) {
                y.b();
             }
             if ((y = this.p0) != null) {
                y.b();
             }
             return;
          }
       }
       jg.z0.remove(this.A.getClass().getName());
       goto label_005c ;
    }
    public final boolean g(int p0){
       if (p0 == 8) {
          p0 = 108;
       }else if(p0 == 9){
          p0 = 109;
       }
       if (this.b0 != null && p0 == 108) {
          return false;
       }else if(this.X != null && p0 == 1){
          this.X = false;
       }
       if (p0 != 1) {
          if (p0 != 2) {
             if (p0 != 5) {
                if (p0 != 10) {
                   if (p0 != 108) {
                      if (p0 != 109) {
                         return this.C.requestFeature(p0);
                      }else {
                         this.I();
                         this.Y = true;
                         return 1;
                      }
                   }else {
                      this.I();
                      this.X = true;
                      return 1;
                   }
                }else {
                   this.I();
                   this.Z = true;
                   return 1;
                }
             }else {
                this.I();
                this.W = true;
                return 1;
             }
          }else {
             this.I();
             this.V = true;
             return 1;
          }
       }else {
          this.I();
          this.b0 = true;
          return 1;
       }
    }
    public final void h(int p0){
       this.w();
       ViewGroup viewGroup = this.S.findViewById(0x1020002);
       viewGroup.removeAllViews();
       LayoutInflater.from(this.B).inflate(p0, viewGroup);
       this.D.a(this.C.getCallback());
    }
    public final void i(View p0){
       this.w();
       ViewGroup viewGroup = this.S.findViewById(0x1020002);
       viewGroup.removeAllViews();
       viewGroup.addView(p0);
       this.D.a(this.C.getCallback());
    }
    public final void j(View p0,ViewGroup$LayoutParams p1){
       this.w();
       ViewGroup viewGroup = this.S.findViewById(0x1020002);
       viewGroup.removeAllViews();
       viewGroup.addView(p0, p1);
       this.D.a(this.C.getCallback());
    }
    public final void k(e64 p0){
       ActionMenuView k;
       Toolbar a2;
       ig h;
       ig oig1;
       jg tI = this.I;
       int i = 0;
       int i1 = 1;
       if (tI != null) {
          tI.k();
          p67 a = tI.v.a;
          Toolbar a1 = (!a.getVisibility() && ((a1 = a.a) != null && a1.J != null))? 1: 0;
          if (a1) {
             if (ViewConfiguration.get(this.B).hasPermanentMenuKey()) {
                tI = this.I;
                tI.k();
                if ((a1 = tI.v.a.a) != null) {
                   if ((k = a1.K) != null) {
                      oig1 = (k.L == null && !k.e())? 0: 1;
                      if (k) {
                         k = 1;
                      label_0058 :
                         if (k) {
                            k = 1;
                         label_005d :
                            if (!k) {
                            label_0104 :
                               oig1 = this.A(i);
                               oig1.n = i1;
                               this.s(oig1, i);
                               this.F(oig1, null);
                            }
                         }
                      }
                   }
                   oig1 = 0;
                   goto label_0058 ;
                }
                oig1 = 0;
                goto label_005d ;
             }
             Window$Callback uCallback = this.B();
             jg tI1 = this.I;
             tI1.k();
             if ((a2 = tI1.v.a.a) != null) {
                ActionMenuView k1 = ((k1 = a2.K) != null && k1.e())? 1: 0;
                if (k1) {
                   k1 = 1;
                label_0086 :
                   if (k1) {
                      tI1 = this.I;
                      tI1.k();
                      if ((a2 = tI1.v.a.a) != null && ((k1 = a2.K) == null && k1.c())) {
                         i1 = 0;
                      }
                      if (this.i0 == null) {
                         uCallback.onPanelClosed(108, this.A(i).h);
                      }
                   }else if(uCallback != null && this.i0 == null){
                      if (this.q0 != null && ((i1 & this.r0))) {
                         tI1 = this.s0;
                         this.C.getDecorView().removeCallbacks(tI1);
                         tI1.run();
                      }
                      ig oig = this.A(i);
                      if ((h = oig.h) != null && (oig.o == null && uCallback.onPreparePanel(i, oig.g, h))) {
                         uCallback.onMenuOpened(108, oig.h);
                         tI = this.I;
                         tI.k();
                         if ((a1 = tI.v.a.a) != null && (k = a1.K) != null) {
                            k.l();
                         }
                      }
                   }
                }
             }
             h = 0;
             goto label_0086 ;
          }else {
             goto label_0104 ;
          }
       }else {
          goto label_0104 ;
       }
       return;
    }
    public final boolean l(e64 p0,MenuItem p1){
       Window$Callback uCallback;
       jg td0;
       object oobject;
       if ((uCallback = this.B()) != null && this.i0 == null) {
          p0 = p0.k();
          int len = ((td0 = this.d0) != null)? td0.length: 0;
          int i = 0;
          while (true) {
             if (i < len) {
                if ((oobject = td0[i]) != null && oobject.h == p0) {
                label_0026 :
                   if (oobject != null) {
                      return uCallback.onMenuItemSelected(oobject.a, p1);
                   }
                }else {
                   i = i + 1;
                }
             }else {
                oobject = null;
                goto label_0026 ;
             }
          }
       }
       return false;
    }
    public final void m(CharSequence p0){
       jg tI;
       this.H = p0;
       if ((tI = this.I) != null) {
          tI.setWindowTitle(p0);
       }else if((tI = this.F) != null){
          tI.r0(p0);
       }else if((tI = this.T) != null){
          tI.setText(p0);
       }
       return;
    }
    public final boolean n(boolean p0,boolean p1){
       jg k0;
       PackageManager packageManag;
       jg j0;
       Field declaredFiel;
       Object obj;
       Map obj1;
       ActivityInfo activityInfo;
       jg ojg = this;
       boolean b = false;
       if (ojg.i0 != null) {
          return b;
       }
       if ((k0 = ojg.k0) == -100) {
          k0 = rf.b;
       }
       jg b1 = ojg.B;
       int i = ojg.D(b1, k0);
       int sDK_INT = Build$VERSION.SDK_INT;
       Configuration uConfigurati = null;
       br3 uobr3 = (sDK_INT < 33)? jg.p(b1): uConfigurati;
       if (!p1 && uobr3 != null) {
          uobr3 = jg.z(b1.getResources().getConfiguration());
       }
       Configuration uConfigurati1 = jg.t(b1, i, uobr3, uConfigurati, b);
       int i1 = 24;
       boolean b2 = true;
       jg a = ojg.A;
       if (ojg.n0 == null && a instanceof Activity) {
          if ((packageManag = b1.getPackageManager()) == null) {
             sDK_INT = 0;
          label_0074 :
             if ((j0 = ojg.j0) == null) {
                j0 = b1.getResources().getConfiguration();
             }
             int i2 = j0.uiMode & 0x30;
             int i3 = uConfigurati1.uiMode & 0x30;
             br3 uobr31 = jg.z(j0);
             Configuration uConfigurati2 = (uobr3 == null)? uConfigurati: jg.z(uConfigurati1);
             i = (i2 != i3)? 512: 0;
             if (uConfigurati2 != null && !uobr31.equals(uConfigurati2)) {
                i = (i | 0x04) | 0x2000;
             }
             int i4 = i;
             i2 = 28;
             if ((((~ sDK_INT) & i4)) && (p0 && (ojg.g0 != null && (jg.B0 && (ojg.h0 == null || !a instanceof Activity))))) {
                jg ojg1 = a;
                if (!ojg1.isChild()) {
                   if (Build$VERSION.SDK_INT >= i2) {
                      ojg1.recreate();
                   }else {
                      new Handler(ojg1.getMainLooper()).post(new g6(ojg1, b));
                   }
                   ojg1 = 1;
                label_00e7 :
                   if (!ojg1 && i4) {
                      sDK_INT = (((sDK_INT & i4)) == i4)? 1: 0;
                      Resources resources = b1.getResources();
                      Configuration uConfigurati3 = new Configuration(resources.getConfiguration());
                      uConfigurati3.uiMode = (resources.getConfiguration().uiMode & 0xcf) | i3;
                      if (uConfigurati2 != null) {
                         if (Build$VERSION.SDK_INT >= i1) {
                            ag.d(uConfigurati3, uConfigurati2);
                         }else {
                            yf.b(uConfigurati3, uConfigurati2.c(b));
                            yf.a(uConfigurati3, uConfigurati2.c(b));
                         }
                      }
                      resources.updateConfiguration(uConfigurati3, uConfigurati);
                      if ((i = Build$VERSION.SDK_INT) < 26 && i < i2) {
                         String str = "mDrawableCache";
                         Resources resources1 = Resources.class;
                         if (i >= i1) {
                            if (!ry7.z) {
                               try{
                                  declaredFiel = resources1.getDeclaredField("mResourcesImpl");
                                  ry7.y = declaredFiel;
                                  declaredFiel.setAccessible(b2);
                               }catch(java.lang.NoSuchFieldException e0){
                                  Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e0);
                               }
                               ry7.z = b2;
                            }
                            if ((declaredFiel = ry7.y) != null) {
                               try{
                                  obj = declaredFiel.get(resources);
                               }catch(java.lang.IllegalAccessException e0){
                                  Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e0);
                                  obj = null;
                               }
                               if (obj != null) {
                                  if (!ry7.c) {
                                     try{
                                        declaredFiel = obj.getClass().getDeclaredField(str);
                                        ry7.b = declaredFiel;
                                        declaredFiel.setAccessible(b2);
                                     }catch(java.lang.NoSuchFieldException e0){
                                        Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e0);
                                     }
                                     ry7.c = b2;
                                  }
                                  if ((declaredFiel = ry7.b) != null) {
                                     try{
                                        obj1 = declaredFiel.get(obj);
                                     label_0197 :
                                        if (obj1 != null) {
                                           ry7.s(obj1);
                                        }
                                     }catch(java.lang.IllegalAccessException e0){
                                        Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e0);
                                     }
                                     obj1 = null;
                                     goto label_0197 ;
                                  }else {
                                  }
                               }
                            }
                         }else if(i >= 23){
                            if (!ry7.c) {
                               try{
                                  declaredFiel = resources1.getDeclaredField(str);
                                  ry7.b = declaredFiel;
                                  declaredFiel.setAccessible(true);
                               }catch(java.lang.NoSuchFieldException e0){
                                  Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e0);
                               }
                               ry7.c = true;
                            }
                            if ((declaredFiel = ry7.b) != null) {
                               try{
                                  obj1 = declaredFiel.get(resources);
                               label_01cb :
                                  if (obj1 != null) {
                                     ry7.s(obj1);
                                  }
                               }catch(java.lang.IllegalAccessException e0){
                                  Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e0);
                               }
                               obj1 = null;
                               goto label_01cb ;
                            }else {
                            }
                         }else if(!ry7.c){
                            try{
                               declaredFiel = resources1.getDeclaredField(str);
                               ry7.b = declaredFiel;
                               declaredFiel.setAccessible(true);
                            }catch(java.lang.NoSuchFieldException e0){
                               Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e0);
                            }
                            ry7.c = true;
                         }
                         if ((declaredFiel = ry7.b) != null) {
                            try{
                               obj1 = declaredFiel.get(resources);
                            }catch(java.lang.IllegalAccessException e0){
                               Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e0);
                               obj1 = null;
                            }
                            if (obj1 != null) {
                               obj1.clear();
                            }
                         }
                      }
                      if ((ojg1 = ojg.l0) != null) {
                         b1.setTheme(ojg1);
                         if (Build$VERSION.SDK_INT >= 23) {
                            b1.getTheme().applyStyle(ojg.l0, true);
                         label_0217 :
                            if (sDK_INT && a instanceof Activity) {
                               ojg1 = a;
                               if (ojg1 instanceof ek3) {
                                  b = (ojg1.getLifecycle().b().compareTo(uj3.c) >= 0)? 1: 0;
                                  if (b) {
                                     ojg1.onConfigurationChanged(uConfigurati3);
                                  }
                               }else if(ojg.h0 != null && ojg.i0 == null){
                                  ojg1.onConfigurationChanged(uConfigurati3);
                               }
                            }
                            b2 = true;
                         }
                      }
                      i2 = 1;
                      goto label_0217 ;
                   }else {
                      b2 = ojg1;
                   }
                   if (b2 && a instanceof a) {
                      if ((i4 & 0x0200)) {
                         a.getClass();
                      }
                      if ((i4 & 0x04)) {
                         a.getClass();
                      }
                   }
                   if (b2 && uConfigurati2 != null) {
                      br3 uobr32 = jg.z(b1.getResources().getConfiguration());
                      if (Build$VERSION.SDK_INT >= 24) {
                         ag.c(uobr32);
                      }else {
                         Locale.setDefault(uobr32.c(0));
                      }
                   }
                   if (!k0) {
                      ojg.y(b1).h();
                   }else if((ojg1 = ojg.o0) != null){
                      ojg1.b();
                   }
                   if (k0 == 3) {
                      if (ojg.p0 == null) {
                         ojg.p0 = new eg(ojg, b1);
                      }
                      ojg.p0.h();
                   }else if((ojg1 = ojg.p0) != null){
                      ojg1.b();
                   }
                   return b2;
                }
             }
             declaredFiel = 0;
             goto label_00e7 ;
          }else if(sDK_INT >= 29){
             sDK_INT = 0x100c0000;
          }else if(sDK_INT >= i1){
             sDK_INT = 0xc0000;
          }else {
             sDK_INT = 0;
          }
          try{
             if ((activityInfo = packageManag.getActivityInfo(new ComponentName(b1, a.getClass()), sDK_INT)) != null) {
                ojg.m0 = activityInfo.configChanges;
             }
          }catch(android.content.pm.PackageManager$NameNotFoundException e0){
             ojg.m0 = b;
          }
       }
       ojg.n0 = b2;
       jg m0 = ojg.m0;
       goto label_0074 ;
    }
    public final void o(Window p0){
       Drawable uDrawable;
       jg tx0;
       jg ty0;
       String str = "AppCompat has already installed itself into the Window";
       if (this.C != null) {
          throw new IllegalStateException(str);
       }
       Window$Callback callback = p0.getCallback();
       if (callback instanceof dg) {
          throw new IllegalStateException(str);
       }
       dg str1 = new dg(this, callback);
       this.D = str1;
       p0.setCallback(str1);
       jg tB = this.B;
       TypedArray typedArray = tB.obtainStyledAttributes(null, jg.A0);
       int i = 0;
       if (typedArray.hasValue(i) && (i = typedArray.getResourceId(i, i))) {
          ng ong = ng.a();
          _monitor_enter(ong);
          uDrawable = ong.a.f(i, tB, true);
          _monitor_exit(ong);
       }else {
          uDrawable = null;
       }
       if (uDrawable != null) {
          p0.setBackgroundDrawable(uDrawable);
       }
       typedArray.recycle();
       this.C = p0;
       if (Build$VERSION.SDK_INT >= 33 && (tx0 = this.x0) == null) {
          if (tx0 != null && (ty0 = this.y0) != null) {
             cg.c(tx0, ty0);
             this.y0 = null;
          }
          tx0 = this.A;
          this.x0 = (tx0 instanceof Activity && tx0.getWindow() != null)? cg.a(tx0): null;
          this.J();
       }
       return;
    }
    public final View onCreateView(View p0,String p1,Context p2,AttributeSet p3){
       String str;
       if (this.w0 == null) {
          jg tB = this.B;
          if ((str = tB.obtainStyledAttributes(ej4.M).getString(116)) == null) {
             this.w0 = new ii();
          }else {
             Class[] uClassArray = new Class[0];
             Object[] objArray = new Object[0];
             this.w0 = tB.getClassLoader().loadClass(str).getDeclaredConstructor(uClassArray).newInstance(objArray);
          }
       }
       return this.w0.createView(p0, p1, p2, p3, false, false, true, false);
    }
    public final View onCreateView(String p0,Context p1,AttributeSet p2){
       return this.onCreateView(null, p0, p1, p2);
    }
    public final void q(int p0,ig p1,e64 p2){
       object oobject;
       ig h;
       if (p2 == null) {
          if (p1 == null && p0 >= 0) {
             jg td0 = this.d0;
             if (p0 < td0.length) {
                oobject = td0[p0];
             }
          }
          if (oobject != null) {
             h = oobject.h;
          }
       }
       if (oobject != null && oobject.m == null) {
          return;
       }else if(this.i0 == null){
          jg tD = this.D;
          tD.getClass();
          tD.v = true;
          this.C.getCallback().onPanelClosed(p0, h);
          tD.v = false;
       }
       return;
    }
    public final void r(e64 p0){
       Toolbar a;
       ActionMenuView k;
       w5 k1;
       Window$Callback uCallback;
       if (this.c0 != null) {
          return;
       }
       this.c0 = true;
       jg tI = this.I;
       tI.k();
       if ((a = tI.v.a.a) != null && (k = a.K) != null) {
          k.c();
          if ((k1 = k.K) != null && k1.b()) {
             k1.j.dismiss();
          }
       }
       if ((uCallback = this.B()) != null && this.i0 == null) {
          uCallback.onPanelClosed(108, p0);
       }
       this.c0 = false;
       return;
    }
    public final void s(ig p0,boolean p1){
       jg tI;
       Toolbar a;
       WindowManager systemServic;
       ig e;
       if (p1 && (p0.a == null && (tI = this.I) != null)) {
          tI.k();
          if ((a = tI.v.a.a) != null) {
             ActionMenuView k = ((k = a.K) != null && k.e())? 1: 0;
             if (k) {
                k = 1;
             label_002d :
                if (k) {
                   this.r(p0.h);
                   return;
                }
             }
          }
          systemServic = 0;
          goto label_002d ;
       }
       if ((systemServic = this.B.getSystemService("window")) != null && (p0.m != null && (e = p0.e) != null)) {
          systemServic.removeView(e);
          if (p1) {
             this.q(p0.a, p0, null);
          }
       }
       p0.k = false;
       p0.l = false;
       p0.m = false;
       p0.f = null;
       p0.n = true;
       if (this.e0 == p0) {
          this.e0 = null;
       }
       if (p0.a == null) {
          this.J();
       }
       return;
    }
    public final boolean u(KeyEvent p0){
       View decorView;
       ig oig;
       ActionMenuView k;
       jg tI1;
       Toolbar a2;
       ActionMenuView k1;
       AudioManager systemServic;
       ig m;
       jg tA = this.A;
       boolean b = true;
       if (tA instanceof kh3 || (tA instanceof lg && ((decorView = this.C.getDecorView()) != null && mi.l(decorView, p0)))) {
          return b;
       }
       boolean b1 = false;
       boolean i = 82;
       if (p0.getKeyCode() == i) {
          tA = this.D;
          tA.getClass();
          tA.t = b;
          tA.t = b1;
          if (this.C.getCallback().dispatchKeyEvent(p0)) {
             return b;
          }
       }
       int keyCode = p0.getKeyCode();
       int i1 = (!p0.getAction())? 1: 0;
       int i2 = 4;
       if (i1) {
          if (keyCode != i2) {
             if (keyCode != i) {
             label_0164 :
                b = false;
             }else if(!p0.getRepeatCount()){
                oig = this.A(b1);
                if (oig.m == null) {
                   this.H(oig, p0);
                }
             }
          }else if((p0.getFlags() & 0x0080)){
             b = false;
          }
          this.f0 = b;
          goto label_0164 ;
       }else if(keyCode != i2){
          if (keyCode != i) {
             goto label_0164 ;
          }else if(this.L != null){
             oig = this.A(b1);
             jg tI = this.I;
             jg tB = this.B;
             if (tI != null) {
                tI.k();
                p67 a = tI.v.a;
                Toolbar a1 = (!a.getVisibility() && ((a1 = a.a) != null && a1.J != null))? 1: 0;
                if (a1 && !ViewConfiguration.get(tB).hasPermanentMenuKey()) {
                   tI = this.I;
                   tI.k();
                   if ((a1 = tI.v.a.a) != null) {
                      k = ((k = a1.K) != null && k.e())? 1: 0;
                      if (k) {
                         k = 1;
                      label_00d5 :
                         if (!k) {
                            if (this.i0 == null && this.H(oig, p0)) {
                               tI1 = this.I;
                               tI1.k();
                               if ((a2 = tI1.v.a.a) != null) {
                                  k1 = ((k1 = a2.K) != null && k1.l())? 1: 0;
                                  if (k1) {
                                  label_0141 :
                                     k1 = 1;
                                  label_0149 :
                                     if (k1 != null && (systemServic = tB.getApplicationContext().getSystemService("audio")) != null) {
                                        systemServic.playSoundEffect(b1);
                                     }
                                  }
                               }
                            }
                         }else {
                            tI1 = this.I;
                            tI1.k();
                            if ((a2 = tI1.v.a.a) != null) {
                               systemServic = ((k1 = a2.K) != null && k1.c())? 1: 0;
                               if (systemServic) {
                                  goto label_0141 ;
                               }
                            }
                         }
                      }
                   }
                   k = 0;
                   goto label_00d5 ;
                }else if((m = oig.m) == null && oig.l == null){
                   if (oig.k != null) {
                      if (oig.o != null) {
                         oig.k = b1;
                         i = this.H(oig, p0);
                      }else {
                         i = true;
                      }
                      if (i) {
                         this.F(oig, p0);
                         goto label_0141 ;
                      }
                   }
                }else {
                   this.s(oig, b);
                   ig oig1 = m;
                   goto label_0149 ;
                }
             }else {
             }
             systemServic = 0;
             goto label_0149 ;
          }
       }else if(this.E()){
       }
       return b;
    }
    public final void v(int p0){
       ig oig = this.A(p0);
       if (oig.h != null) {
          Bundle uBundle = new Bundle();
          oig.h.t(uBundle);
          if (uBundle.size() > 0) {
             oig.p = uBundle;
          }
          oig.h.w();
          oig.h.clear();
       }
       oig.o = true;
       oig.n = true;
       if (p0 == 108 || (!p0 && this.I != null)) {
          oig = this.A(0);
          oig.k = false;
          this.H(oig, null);
       }
       return;
    }
    public final void w(){
       ViewGroup viewGroup1;
       Method a;
       ViewGroup viewGroup2;
       CharSequence title;
       jg tI;
       if (this.R == null) {
          int[] m = ej4.M;
          jg tB = this.B;
          TypedArray typedArray = tB.obtainStyledAttributes(m);
          int i = 117;
          if (typedArray.hasValue(i)) {
             if (typedArray.getBoolean(126, false)) {
                this.g(1);
             }else if(typedArray.getBoolean(i, false)){
                this.g(108);
             }
             int i1 = 109;
             if (typedArray.getBoolean(118, false)) {
                this.g(i1);
             }
             if (typedArray.getBoolean(119, false)) {
                this.g(10);
             }
             this.a0 = typedArray.getBoolean(false, false);
             typedArray.recycle();
             this.x();
             this.C.getDecorView();
             LayoutInflater layoutInflat = LayoutInflater.from(tB);
             ViewGroup viewGroup = null;
             if (this.b0 == null) {
                if (this.a0 != null) {
                   viewGroup1 = layoutInflat.inflate(R.layout.abc_dialog_title_material, viewGroup);
                   this.Y = false;
                   this.X = false;
                }else if(this.X != null){
                   TypedValue typedValue = new TypedValue();
                   tB.getTheme().resolveAttribute(R.attr.actionBarTheme, typedValue, 1);
                   mt0 omt0 = (typedValue.resourceId != null)? new mt0(tB, typedValue.resourceId): tB;
                   viewGroup1 = LayoutInflater.from(omt0).inflate(R.layout.abc_screen_toolbar, viewGroup);
                   b61 uob61 = viewGroup1.findViewById(R.id.decor_content_parent);
                   this.I = uob61;
                   uob61.setWindowCallback(this.B());
                   if (this.Y != null) {
                      this.I.j(i1);
                   }
                   if (this.V != null) {
                      this.I.j(2);
                   }
                   if (this.W != null) {
                      this.I.j(5);
                   }
                }else {
                   viewGroup1 = viewGroup;
                }
             }else if(this.Z != null){
                viewGroup1 = layoutInflat.inflate(R.layout.abc_screen_simple_overlay_action_mode, viewGroup);
             }else {
                viewGroup1 = layoutInflat.inflate(R.layout.abc_screen_simple, viewGroup);
             }
             if (viewGroup1 != null) {
                jh7.u(viewGroup1, new uf(false, this));
                if (this.I == null) {
                   this.T = viewGroup1.findViewById(R.id.title);
                }
                a = bl7.a;
                try{
                   Class[] uClassArray = new Class[false];
                   a = viewGroup1.getClass().getMethod("makeOptionalFitsSystemWindows", uClassArray);
                   if (!a.isAccessible()) {
                      a.setAccessible(1);
                   }
                   Object[] objArray = new Object[false];
                   a.invoke(viewGroup1, objArray);
                }catch(java.lang.NoSuchMethodException e0){
                }catch(java.lang.reflect.InvocationTargetException e0){
                }catch(java.lang.IllegalAccessException e0){
                }
                ContentFrameLayout uContentFram = viewGroup1.findViewById(R.id.action_bar_activity_content);
                int i2 = 0x1020002;
                if ((viewGroup2 = this.C.findViewById(i2)) != null) {
                   while (viewGroup2.getChildCount() > 0) {
                      viewGroup2.removeViewAt(false);
                      uContentFram.addView(viewGroup2.getChildAt(false));
                   }
                   viewGroup2.setId(-1);
                   uContentFram.setId(i2);
                   if (viewGroup2 instanceof FrameLayout) {
                      viewGroup2.setForeground(viewGroup);
                   }
                }
                this.C.setContentView(viewGroup1);
                uContentFram.setAttachListener(new uv1(1, this));
                this.S = viewGroup1;
                jg tA = this.A;
                title = (tA instanceof Activity)? tA.getTitle(): this.H;
                if (!TextUtils.isEmpty(title)) {
                   if ((tI = this.I) != null) {
                      tI.setWindowTitle(title);
                   }else if((tI = this.F) != null){
                      tI.r0(title);
                   }else if((tI = this.T) != null){
                      tI.setText(title);
                   }
                }
                ContentFrameLayout uContentFram1 = this.S.findViewById(i2);
                View decorView = this.C.getDecorView();
                i1 = decorView.getPaddingLeft();
                int paddingTop = decorView.getPaddingTop();
                i2 = decorView.getPaddingRight();
                uContentFram1.x.set(i1, paddingTop, i2, decorView.getPaddingBottom());
                if (gh7.c(uContentFram1)) {
                   uContentFram1.requestLayout();
                }
                TypedArray typedArray1 = tB.obtainStyledAttributes(e0);
                typedArray1.getValue(124, uContentFram1.getMinWidthMajor());
                typedArray1.getValue(125, uContentFram1.getMinWidthMinor());
                int i3 = 122;
                if (typedArray1.hasValue(i3)) {
                   typedArray1.getValue(i3, uContentFram1.getFixedWidthMajor());
                }
                i3 = 123;
                if (typedArray1.hasValue(i3)) {
                   typedArray1.getValue(i3, uContentFram1.getFixedWidthMinor());
                }
                i3 = 120;
                if (typedArray1.hasValue(i3)) {
                   typedArray1.getValue(i3, uContentFram1.getFixedHeightMajor());
                }
                i3 = 121;
                if (typedArray1.hasValue(i3)) {
                   typedArray1.getValue(i3, uContentFram1.getFixedHeightMinor());
                }
                typedArray1.recycle();
                uContentFram1.requestLayout();
                this.R = true;
                ig oig = this.A(false);
                if (this.i0 == null && oig.h == null) {
                   this.r0 = this.r0 | 0x1000;
                   if (this.q0 == null) {
                      dh7.m(this.C.getDecorView(), this.s0);
                      this.q0 = true;
                   }
                }
             }else {
                throw new IllegalArgumentException(en6.q("AppCompat does not support the current theme features: { windowActionBar: "+this.X+", windowActionBarOverlay: "+this.Y+", android:windowIsFloating: "+this.a0+", windowActionModeOverlay: "+this.Z+", windowNoTitle: ", this.b0, " }"));
             }
          }else {
             typedArray.recycle();
             throw new IllegalStateException("You need to use a Theme.AppCompat theme \(or descendant\) with this activity.");
          }
       }
       return;
    }
    public final void x(){
       if (this.C == null) {
          jg tA = this.A;
          if (tA instanceof Activity) {
             this.o(tA.getWindow());
          }
       }
       if (this.C != null) {
          return;
       }else {
          throw new IllegalStateException("We have not been given a Window");
       }
    }
    public final gg y(Context p0){
       if (this.o0 == null) {
          if (qo5.t == null) {
             p0 = p0.getApplicationContext();
             qo5.t = new qo5(p0, p0.getSystemService("location"));
          }
          this.o0 = new eg(this, qo5.t);
       }
       return this.o0;
    }
}
