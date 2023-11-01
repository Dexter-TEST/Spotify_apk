package p.rj2;
import androidx.fragment.app.k;
import p.up0;
import p.wd5;
import p.gr7;
import p.qj2;
import java.lang.Object;
import p.rk2;
import p.ae4;
import java.lang.String;
import android.content.Context;
import p.i77;
import android.app.Dialog;
import android.view.View;
import android.view.Window;
import p.n6;
import p.ft0;
import java.lang.Class;
import p.ok2;
import android.widget.TextView;
import p.vs0;
import java.lang.CharSequence;
import android.text.TextUtils;
import p.uw5;
import android.widget.ImageView;
import android.view.ViewGroup$LayoutParams;
import android.content.res.Resources;
import android.view.View$MeasureSpec;
import p.xj0;
import p.lp6;
import p.sp6;
import java.lang.Enum;
import java.lang.Float;
import p.e5;
import android.graphics.drawable.Drawable;
import p.nf0;
import android.net.Uri;
import p.hv5;
import p.mf0;
import p.dy1;
import p.lf0;
import p.he1;
import p.wp6;
import p.ox7;
import p.e07;
import p.do5;
import android.widget.FrameLayout$LayoutParams;
import p.am0;
import java.lang.Runnable;
import android.view.ViewGroup;
import com.spotify.legacyglue.contextmenu.glue.GlueContextMenuLayout;
import android.view.ViewTreeObserver;
import p.lc0;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import java.util.List;
import p.dt0;
import p.ct0;
import android.view.LayoutInflater;
import p.en6;
import p.co5;
import com.spotify.legacyglue.textview.CheckableTextView;
import p.xs0;
import p.zf2;
import java.lang.Integer;
import java.lang.Boolean;
import p.bt0;
import p.ys0;
import android.widget.LinearLayout$LayoutParams;
import p.xe7;
import p.zs0;
import p.eo5;
import p.v27;
import p.mj5;
import p.oj5;
import p.x3;
import java.util.Collection;
import java.util.Collections;
import p.pj2;
import android.view.View$OnClickListener;
import java.util.ArrayList;
import p.cd2;
import p.bv0;
import android.view.ViewTreeObserver$OnPreDrawListener;
import p.qk2;
import android.animation.Animator;
import p.kd4;
import android.animation.Animator$AnimatorListener;

public final class rj2	// class@0024fa from classes.dex
{
    public final i77 a;
    public final rk2 b;
    public final Context c;

    public void rj2(k p0,up0 p1,wd5 p2){
       super();
       this.c = p0;
       this.b = new rk2(p0, p1);
       i77 p2 = new i77(p0, p1, new ae4(p0, p2, p0.getString(R.string.context_menu_show_more)), new gr7(23), new qj2(0));
       this.a = p2;
    }
    public final Dialog a(){
       rj2 tc = this.c;
       Dialog uDialog = new Dialog(tc, 0x7f1302b9);
       uDialog.setContentView(this.b.b);
       if (uDialog.getWindow() != null) {
          Window window = uDialog.getWindow();
          window.addFlags(Integer.MIN_VALUE);
          window.setStatusBarColor(n6.b(tc, 0x106000d));
          window.getDecorView().setSystemUiVisibility(1280);
       }
       return uDialog;
    }
    public final void b(ft0 p0){
       vs0 g;
       lf0 olf0;
       int i4;
       int dimensionPix;
       ct0 c3;
       Integer integer;
       Drawable uDrawable1;
       rk2 f1;
       qk2 oqk2;
       rj2 orj2 = this;
       ft0 uoft0 = p0;
       rj2 b = orj2.b;
       if (uoft0.e != null) {
          if (b.i == null && b.h == null) {
             b.c();
             b.d();
          }
       }else {
          rj2 a = orj2.a;
          a.getClass();
          a.f = uoft0;
          i77 c = a.c;
          ft0 a1 = uoft0.a;
          c.f.setText(a1.a);
          int i = 8;
          LinearLayout$LayoutParams boolean i1 = 0;
          ae4 a2 = c.a;
          if (TextUtils.isEmpty(uoft0.b) && TextUtils.isEmpty(a1.b)) {
             c.g.setVisibility(i);
          }else {
             dimensionPix = 0x7f0507d8;
             if (TextUtils.isEmpty(uoft0.b)) {
                uw5.t(a2, c.g, R.attr.pasteTextAppearanceBodySmall);
                c.g.setTextColor(n6.b(a2, dimensionPix));
                c.g.setAllCaps(i1);
                c.g.setText(a1.b);
                c.g.setVisibility(i1);
             }else {
                uw5.t(a2, c.g, R.attr.pasteTextAppearanceMetadata);
                c.g.setAllCaps(true);
                c.g.setTextColor(n6.b(a2, dimensionPix));
                c.g.setText(uoft0.b);
                c.g.setVisibility(i1);
             }
          }
          ae4 e = c.e;
          ViewGroup$LayoutParams layoutParams = e.getLayoutParams();
          int i2 = ((uoft0 = uoft0.c) == 3)? 1: 0;
          int i3 = 2;
          if (i2) {
             layoutParams.width = View$MeasureSpec.makeMeasureSpec(a2.getResources().getDimensionPixelSize(R.dimen.context_menu_header_large_image_width), Integer.MIN_VALUE);
             layoutParams.height = View$MeasureSpec.makeMeasureSpec(a2.getResources().getDimensionPixelSize(R.dimen.context_menu_header_large_image_height), 0x40000000);
             e.setAdjustViewBounds(true);
          }else if(uoft0 == i3){
             oqk2 = 1;
          }else {
             oqk2 = 0;
          }
          if (oqk2) {
             layoutParams.width = (int)(((float)layoutParams.height * 16.00f) / 9.00f);
          }else {
             layoutParams.width = layoutParams.height;
          }
          e.setLayoutParams(layoutParams);
          vs0 e1 = a1.e;
          if ((g = a1.g) == null) {
             if ((g = a1.f) != null) {
                lp6 olp6 = new lp6(a2, g, (float)xj0.e0(32.00f, a2.getResources()));
                olp6.b(uw5.k(a2, R.attr.pasteColorPlaceholder));
                i4 = uw5.k(a2, R.attr.pasteColorPlaceholderBackground);
                float f2 = Float.NaN;
                switch (g.ordinal()){
                    case 10:
                    case 31:
                    case '-':
                    case 'l':
                    case 'u':
                    case 188:
                    case 256:
                    case 263:
                    case 338:
                      if (Float.isNaN(f2)) {
                         f2 = 0x3f400000;
                      }
                      g = new e5(f2, i4, olp6);
                      break;
                    case 27:
                    case 347:
                      if (Float.isNaN(f2)) {
                         f2 = 0x3f19999a;
                      }
                      g = new nf0(olp6, f2);
                      g.a(i4);
                      break;
                    case 134:
                    case 355:
                      if (Float.isNaN(f2)) {
                         f2 = 0x3ea8f5c3;
                      }
                      g = new e5(f2, i4, olp6);
                      break;
                    case 249:
                    case 311:
                    case 335:
                    case 250:
                      if (Float.isNaN(f2)) {
                         f2 = 0x3f28f5c3;
                      }
                      g = new e5(f2, i4, olp6);
                      break;
                    default:
                      g = (Float.isNaN(f2))? olp6: new e5(f2, i4, olp6);
                }
             }else {
                g = null;
             }
          }
          if (e1 == null || TextUtils.isEmpty(e1.toString())) {
             e1 = null;
          }
          a2 = c.c;
          a2.getClass();
          hv5 ohv5 = new hv5(a2, e1);
          if (g != null) {
             ohv5.h(g);
          }else {
             ohv5.g();
          }
          if (g != null) {
             ohv5.b(g);
          }
          if (a1.h != null) {
             float f = 0x3f800000;
             switch (mf0.f.a){
                 case 23:
                   olf0 = new lf0(f, i1);
                   break;
                 default:
                   olf0 = new lf0(f, true);
             }
             ohv5.f(ox7.M(e, olf0));
          }else {
             ohv5.e(e);
          }
          ae4 h = c.h;
          vs0 d = a1.d;
          i4 = (TextUtils.isEmpty(d))? 8: 0;
          h.setVisibility(i4);
          h.setText(d);
          if (!TextUtils.isEmpty(a1.c)) {
             TextView[] textViewArra = new TextView[true];
             textViewArra[i1] = h;
             do5.y0(textViewArra);
             do5.x0(c.d);
          }
          h = c.i;
          int i5 = (TextUtils.isEmpty(a1.c))? 8: 0;
          h.setVisibility(i5);
          h.setText(a1.c);
          c.a();
          if (b.i == null) {
             i77 c1 = a.c;
             c1.getClass();
             ae4 d1 = c1.d;
             ViewGroup$LayoutParams layoutParams1 = d1.getLayoutParams();
             int i6 = -1;
             FrameLayout$LayoutParams layoutParams2 = (layoutParams1 != null)? new FrameLayout$LayoutParams(layoutParams1): new FrameLayout$LayoutParams(i6, -2);
             rk2 c2 = b.c;
             if (!c2.getVisibility()) {
                c2.post(new am0(19, b));
             }
             d1.setLayoutParams(layoutParams2);
             if (b.h == null) {
                i = 0;
             }
             d1.setVisibility(i);
             if ((c2 = b.f) != d1) {
                rk2 e2 = b.e;
                if (c2 != null) {
                   e2.removeView(c2);
                }
                b.f = d1;
                e2.addView(d1);
             }
             rk2 d2 = b.d;
             d2.setHeader(c1);
             b.f.getViewTreeObserver().addOnGlobalLayoutListener(new lc0(5, b));
             b.c();
             int i7 = 0;
             while (true) {
                if (i7 < a.f.f.size()) {
                   dt0 uodt0 = a.f.f.get(i7);
                   i = (uodt0.a().f != null)? 2: 1;
                   View view = LayoutInflater.from(a.a).inflate(en6.d(i), d2, i1);
                   co5.j(view, "null cannot be cast to non-null type com.spotify.legacyglue.textview.CheckableTextView");
                   ct0 uoct0 = uodt0.a();
                   ct0 b1 = uoct0.b;
                   String str = "<this>";
                   co5.o(b1, str);
                   String str1 = "context";
                   co5.o(a.a, str1);
                   if (b1 instanceof xs0) {
                      view.setText(b1.G);
                      boolean b2 = (uoct0.e != null && (a.f.d != null && !a.e.invoke(Integer.valueOf(uoct0.a)).booleanValue()))? true: false;
                      view.setEnabled(b2);
                      ct0 d3 = uoct0.d;
                      boolean b3 = d3 instanceof bt0;
                      view.setChecked(b3);
                      i1 = (!d3 instanceof ys0 && !b3)? false: true;
                      view.setActivated(i1);
                      if ((dimensionPix = a.a.getResources().getDimensionPixelSize(R.dimen.context_menu_item_width)) < 0) {
                         dimensionPix = -1;
                      }
                      i1 = new LinearLayout$LayoutParams(dimensionPix, -2);
                      i1.gravity = 1;
                      view.setLayoutParams(i1);
                      i77 a3 = a.a;
                      co5.o(d3, str);
                      co5.o(a3, str1);
                      if (co5.c(d3, ys0.A)) {
                         i6 = xe7.x(a3, R.attr.brightAccentBackgroundBase);
                      }else if(co5.c(d3, zs0.B)){
                         i6 = xe7.x(a3, R.attr.negativeBackgroundBase);
                      }else {
                         i6 = xe7.x(a3, R.attr.baseTextSubdued);
                      }
                      Drawable uDrawable = ((c3 = uoct0.c) != null)? xe7.h0(c3, a.a, Integer.valueOf(i6)): null;
                      if ((c3 = uoct0.f) != null) {
                         integer = null;
                         uDrawable1 = xe7.h0(c3, a.a, integer);
                      }else {
                         integer = null;
                         uDrawable1 = integer;
                      }
                      v27.g(view, uDrawable, integer, uDrawable1, integer);
                      mj5 uDrawable2 = new mj5(view, oj5.d.a.floatValue());
                      View[] viewArray = new View[true];
                      viewArray[0] = view;
                      Collections.addAll(uDrawable2.c, viewArray);
                      uDrawable2.a();
                      view.setOnClickListener(new pj2(uodt0, uoct0, a));
                      d2.c.add(view);
                      d2.addView(view);
                      b.g.add(view);
                      i7 = i7 + 1;
                      i1 = false;
                      integer = 2;
                   }else {
                      throw new cd2(10);
                   }
                }else {
                   d2.setNumberOfVisibleItems(a.a.getResources().getInteger(R.integer.context_menu_initial_visible_items));
                   if (b.h != null) {
                      b.b.getViewTreeObserver().addOnPreDrawListener(new bv0(true, b));
                   }
                   if ((f1 = b.f) != null) {
                      f1.setVisibility(0);
                   }
                   oqk2 = new qk2(b, true);
                   rk2 p = b.p;
                   if (p.isRunning()) {
                      p.cancel();
                   }
                   p = b.q;
                   p.start();
                   p.addListener(oqk2);
                   b.h = false;
                   break ;
                }
             }
          }
       }
       return;
    }
}
