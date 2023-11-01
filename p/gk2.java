package p.gk2;
import p.vm5;
import p.ak2;
import p.mj2;
import p.y2;
import android.view.ViewGroup;
import p.ek2;
import android.content.Context;
import p.fp2;
import p.bk2;
import android.util.AttributeSet;
import android.graphics.Rect;
import android.view.View;
import p.ry7;
import p.ye7;
import android.content.res.TypedArray;
import p.vf;
import java.lang.Object;
import p.ck2;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import p.gp2;
import p.ik2;
import p.zk2;
import p.jk7;
import android.view.ViewGroup$LayoutParams;
import p.fk2;
import p.jp2;
import p.ip2;
import p.wh7;
import p.dh7;
import p.y77;
import p.xl2;
import android.graphics.Paint;
import p.y46;
import android.widget.ImageView;
import p.hk2;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbar;
import java.lang.IllegalArgumentException;
import java.util.Locale;
import java.lang.Integer;
import java.lang.String;
import p.nj2;
import p.oj2;
import android.view.View$MeasureSpec;
import java.lang.Class;
import android.view.ViewGroup$MarginLayoutParams;
import p.ap5;
import p.b17;
import java.lang.Math;
import p.uw5;
import p.py;

public final class gk2 extends ViewGroup implements vm5, ak2, mj2, y2	// class@001724 from classes.dex
{
    public y46 a;
    public ik2 b;
    public ck2 c;
    public final Rect t;
    public int v;
    public static final ek2 w;

    static {
       gk2.w = new ek2(0);
    }
    public void gk2(Context p0,int p1,int p2,fp2 p3,bk2 p4){
       int integer;
       fp2 v;
       gp2 ogp2;
       super(p0, null, p1);
       this.a = gk2.w;
       this.t = new Rect();
       int i = ry7.F(this.getContext());
       TypedArray typedArray = this.getContext().obtainStyledAttributes(null, ye7.q, p1, p2);
       int i1 = 1;
       float fraction = typedArray.getFraction(3, i1, i1, 0xbf800000);
       if ((integer = typedArray.getInteger(4, 3)) != i1) {
          v = (integer != 2)? fp2.v: fp2.t;
       }else {
          v = fp2.c;
       }
       typedArray.recycle();
       this.c = new ck2(new vf(26, this), fraction, i, this.getResources().getDisplayMetrics().heightPixels);
       if (p4 == null) {
          ogp2 = new gp2(p0, ry7.r(p3, v));
       }
       this.addView(ogp2.getView(), 0);
       this.b = new ik2(this, ogp2);
       return;
    }
    public static void b(int p0,zk2 p1){
       if (p1 != null) {
          fk2 layoutParams = ((layoutParams = p1.getView().getLayoutParams()) != null)? layoutParams.a: null;
          if (layoutParams == null) {
             View view = p1.getView();
             view.offsetTopAndBottom((p0 - view.getTop()));
          }
       }
       return;
    }
    public final void a(float p0,int p1){
       gp2 t;
       gk2 tc = this.c;
       int i = (tc.a != null)? 0: tc.c;
       ck2 h = tc.h;
       gk2.b((((tc.e + i) + p1) + tc.i), h.b.b.b);
       gk2.b((tc.e + p1), h.b.b.c);
       tc = this.b;
       ik2.a(p0, tc.c);
       ik2.a(p0, tc.b);
       ik2 b = tc.b;
       if (b instanceof jp2) {
          b.a(p0);
       }
       ik2 d = tc.d;
       if ((t = d.t) != null) {
          t.c = p1;
          p1 = t.a(p1);
          ip2 a = t.a;
          a.offsetTopAndBottom((p1 - a.getTop()));
          dh7.k(a);
          d.v.a(p0);
       }
       d.a.g.setAlpha(255);
       d.invalidate();
       this.a.a(p0);
       return;
    }
    public final ViewGroup$LayoutParams generateDefaultLayoutParams(){
       return new fk2(-1);
    }
    public final ViewGroup$LayoutParams generateLayoutParams(AttributeSet p0){
       return new fk2(this.getContext(), p0);
    }
    public ImageView getBackgroundImageView(){
       return this.b.d.getBackgroundImageView();
    }
    public hk2 getContentViewBinder(){
       return this.b.b;
    }
    public GlueToolbar getGlueToolbar(){
       return this.b.c;
    }
    public float getHeightFraction(){
       return this.c.f;
    }
    public int getTotalScrollRange(){
       gk2 tc = this.c;
       return (tc.b - ((tc.c + tc.d) + tc.e));
    }
    public View getView(){
       return this;
    }
    public final void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       View view;
       ik2 b;
       fk2 b1;
       gk2 tt = this.t;
       this.b.d.getView().layout(tt.left, tt.top, (this.getMeasuredWidth() - (tt.left + tt.right)), (this.getMeasuredHeight() - (tt.top + tt.bottom)));
       tt = this.c;
       ck2 e = tt.e;
       ik2 c = this.b.c;
       p3 = 0;
       if (c != null) {
          view = c.getView();
          view.layout(p3, e, view.getMeasuredWidth(), (view.getMeasuredHeight() + e));
          if (this.c.a == null) {
             e = e + view.getMeasuredHeight();
          }
       }else if(tt.a == null){
          e = e + this.v;
       }
       if ((b = this.b.b) != null) {
          view = b.getView();
          c = (this.getMeasuredHeight() - e) - this.c.d;
          if ((b1 = view.getLayoutParams().b) != null) {
             if (b1 != 1) {
                if (b1 == 2) {
                   c = ((c - view.getMeasuredHeight()) / 2) + e;
                }else {
                   Object[] objArray = new Object[]{Integer.valueOf(b1)};
                   throw new IllegalArgumentException(String.format(Locale.getDefault(), "Invalid gravity value: %d", objArray));
                }
             }else {
                c = (c + e) - view.getMeasuredHeight();
             }
          }else {
             ck2 uock2 = e;
          }
          b1.i = c - e;
          view.layout(p3, c, view.getMeasuredWidth(), (view.getMeasuredHeight() + c));
       }
       b = this.b.b;
       if (b instanceof nj2) {
          b.i();
       }
       return;
    }
    public final void onMeasure(int p0,int p1){
       View view;
       fk2 layoutParams;
       ViewGroup$MarginLayoutParams height;
       int b;
       gk2 tc1;
       ik2 b1;
       ViewGroup$MarginLayoutParams height1;
       p0 = View$MeasureSpec.getSize(p0);
       gk2 tc = this.c;
       int i = tc.d + tc.e;
       ik2 c = this.b.c;
       int i1 = -1;
       if (c != null) {
          view = c.getView();
          layoutParams = view.getLayoutParams();
          layoutParams.getClass();
          b = ((height = layoutParams.height) != -2 && height != i1)? true: false;
          ap5.e(b);
          view.measure(b17.s(p0), b17.s(layoutParams.height));
          view = view.getMeasuredHeight();
          tc1 = this.c;
          if (tc1.a == null) {
             i = i + view;
          }
          tc1.c = view;
       }else {
          tc1 = this.v;
          if ((tc.c = tc1) == null) {
             i = i + tc1;
          }
       }
       if ((b1 = this.b.b) != null) {
          tc1 = this.c;
          ck2 f = tc1.f;
          if (0xbf800000 - f) {
             b = (int)((float)tc1.g * f);
             int i2 = (tc1.a != null)? 0: tc1.c;
             b = b - (tc1.e + i2);
          }else {
             b = 0;
          }
          view = b1.getView();
          if ((layoutParams = view.getLayoutParams()) == null) {
             view.setMinimumHeight(b);
             view.measure(b17.s(p0), View$MeasureSpec.makeMeasureSpec(0, 0));
          }else if((height1 = layoutParams.height) == i1){
             view.setMinimumHeight(b);
             view.measure(b17.s(p0), View$MeasureSpec.makeMeasureSpec(0, 0));
          }else if(height1 == -2){
             view.measure(b17.s(p0), View$MeasureSpec.makeMeasureSpec(0, 0));
          }else {
             view.measure(b17.s(p0), b17.s(layoutParams.height));
          }
          i = i + Math.max(view.getMeasuredHeight(), b);
       }
       tc = this.t;
       this.b.d.getView().measure(b17.s(((p0 - tc.left) - tc.right)), b17.s(((i - tc.top) - tc.bottom)));
       this.setMeasuredDimension(p0, i);
       p0.b = i;
       return;
    }
    public void setAccessoryMargin(int p0){
       this.c.d = p0;
    }
    public void setAvoidCroppingImageWithParallax(boolean p0){
       this.b.d.setAvoidCroppingImageWithParallax(p0);
    }
    public void setChildHelper(ik2 p0){
       this.b = p0;
    }
    public void setColor(int p0){
       this.b.d.setSolidColor(p0);
    }
    public void setContentViewBinder(hk2 p0){
       gk2 tb = this.b;
       tb.getClass();
       fk2 uofk2 = new fk2(-1);
       ik2 b = tb.b;
       ik2 a = tb.a;
       if (b != null) {
          a.removeView(b.getView());
       }
       tb.b = p0;
       if (p0 != null) {
          a.addView(p0.getView(), 1, uofk2);
       }
       return;
    }
    public void setCoordinatorAccessoryOffset(int p0){
       this.setAccessoryMargin(p0);
    }
    public void setCustomBackground(bk2 p0){
       p0.getClass();
       this.removeView(this.b.d.getView());
       this.addView(p0.getView(), 0);
       this.b.d = p0;
    }
    public void setExternalToolbarHeight(int p0){
       this.v = p0;
       this.requestLayout();
    }
    public void setGlueToolbar(GlueToolbar p0){
       gk2 tb = this.b;
       tb.getClass();
       fk2 uofk2 = new fk2(uw5.n(this.getContext(), R.attr.actionBarSize));
       if (p0 != null) {
          uofk2.c = new py(p0);
       }
       ik2 c = tb.c;
       ik2 a = tb.a;
       if (c != null) {
          a.removeView(c.getView());
       }
       tb.c = p0;
       if (p0 != null) {
          View view = p0.getView();
          int i = (tb.b != null)? 2: 1;
          a.addView(view, i, uofk2);
       }
       return;
    }
    public void setHasFixedSize(boolean p0){
       this.b.d.setHasFixedSize(p0);
    }
    public void setHeaderInnerState(ck2 p0){
       this.c = p0;
    }
    public void setHeightFraction(float p0){
       this.c.f = p0;
       this.requestLayout();
    }
    public void setScrollObserver(y46 p0){
       this.a = ry7.r(p0, this.a);
    }
    public void setToolbarOverlaysContent(boolean p0){
       this.c.a = p0;
       this.requestLayout();
    }
    public void setTopOffset(int p0){
    }
}
