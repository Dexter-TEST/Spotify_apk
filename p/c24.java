package p.c24;
import android.os.Build$VERSION;
import com.google.android.material.button.MaterialButton;
import p.bd6;
import java.lang.Object;
import p.ce6;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.Drawable;
import p.q24;
import android.graphics.drawable.InsetDrawable;
import p.wh7;
import android.view.View;
import p.eh7;
import android.content.Context;
import android.content.res.ColorStateList;
import p.ce1;
import android.graphics.PorterDuff$Mode;
import p.p24;
import p.ry7;
import android.graphics.drawable.RippleDrawable;
import p.tu6;
import p.sy5;
import p.ry5;

public final class c24	// class@001182 from classes.dex
{
    public final MaterialButton a;
    public bd6 b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public PorterDuff$Mode i;
    public ColorStateList j;
    public ColorStateList k;
    public ColorStateList l;
    public Drawable m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public LayerDrawable r;
    public int s;
    public static final boolean t;
    public static final boolean u;

    static {
       boolean b = true;
       c24.t = b;
       if (Build$VERSION.SDK_INT <= 22) {
       }else {
          b = false;
       }
       c24.u = b;
    }
    public void c24(MaterialButton p0,bd6 p1){
       super();
       this.n = false;
       this.o = false;
       this.p = false;
       this.a = p0;
       this.b = p1;
    }
    public final ce6 a(){
       c24 tr;
       if ((tr = this.r) == null || tr.getNumberOfLayers() <= 1) {
          return null;
       }
       if (this.r.getNumberOfLayers() > 2) {
          return this.r.getDrawable(2);
       }
       return this.r.getDrawable(1);
    }
    public final q24 b(boolean p0){
       c24 tr;
       if ((tr = this.r) == null || tr.getNumberOfLayers() <= 0) {
          return null;
       }
       if (c24.t) {
          return this.r.getDrawable(0).getDrawable().getDrawable((p0 ^ 0x01));
       }
       return this.r.getDrawable((p0 ^ 0x01));
    }
    public final void c(bd6 p0){
       this.b = p0;
       if (c24.u && this.o == null) {
          c24 ta = this.a;
          this.e();
          eh7.k(ta, eh7.f(ta), ta.getPaddingTop(), eh7.e(ta), ta.getPaddingBottom());
       }else {
          boolean b = false;
          if (this.b(b) != null) {
             this.b(b).setShapeAppearanceModel(p0);
          }
          b = true;
          if (this.b(b) != null) {
             this.b(b).setShapeAppearanceModel(p0);
          }
          if (this.a() != null) {
             this.a().setShapeAppearanceModel(p0);
          }
       }
       return;
    }
    public final void d(int p0,int p1){
       c24 ta = this.a;
       int i = eh7.f(ta);
       int paddingTop = ta.getPaddingTop();
       int i1 = eh7.e(ta);
       int paddingBotto = ta.getPaddingBottom();
       c24 te = this.e;
       c24 tf = this.f;
       this.f = p1;
       this.e = p0;
       if (this.o == null) {
          this.e();
       }
       eh7.k(ta, i, ((paddingTop + p0) - te), i1, ((paddingBotto + p1) - tf));
       return;
    }
    public final void e(){
       c24 ti;
       InsetDrawable oq241;
       RippleDrawable rippleDrawab;
       q24 oq24 = new q24(this.b);
       c24 ta = this.a;
       oq24.i(ta.getContext());
       ce1.h(oq24, this.j);
       if ((ti = this.i) != null) {
          ce1.i(oq24, ti);
       }
       c24 tk = this.k;
       oq24.a.k = (float)this.h;
       oq24.invalidateSelf();
       q24 a = oq24.a;
       if (a.d != tk) {
          a.d = tk;
          oq24.onStateChange(oq24.getState());
       }
       a = new q24(this.b);
       a.setTint(0);
       float f = (float)this.h;
       int i = (this.n != null)? ry7.w(ta, R.attr.colorSurface): 0;
       a.a.k = f;
       a.invalidateSelf();
       ColorStateList uColorStateL = ColorStateList.valueOf(i);
       q24 a1 = a.a;
       if (a1.d != uColorStateL) {
          a1.d = uColorStateL;
          a.onStateChange(a.getState());
       }
       i = 2;
       if (c24.t) {
          q24 uColorStateL1 = new q24(this.b);
          this.m = uColorStateL1;
          ce1.g(uColorStateL1, -1);
          Drawable[] uDrawableArr = new Drawable[i];
          uDrawableArr[0] = a;
          uDrawableArr[1] = oq24;
          oq241 = new InsetDrawable(new LayerDrawable(uDrawableArr), this.c, this.e, this.d, this.f);
          rippleDrawab = new RippleDrawable(tu6.A(this.l), oq24, this.m);
          this.r = rippleDrawab;
       }else {
          sy5 uColorStateL2 = new sy5(new ry5(new q24(this.b)));
          this.m = uColorStateL2;
          ce1.h(uColorStateL2, tu6.A(this.l));
          Drawable[] uDrawableArr1 = new Drawable[]{a,oq24,this.m};
          LayerDrawable layerDrawabl = new LayerDrawable(uDrawableArr1);
          this.r = layerDrawabl;
          oq241 = new InsetDrawable(layerDrawabl, this.c, this.e, this.d, this.f);
       }
       ta.setInternalBackground(rippleDrawab);
       if ((oq24 = this.b(0)) != null) {
          oq24.j((float)this.s);
       }
       return;
    }
    public final void f(){
       boolean b = false;
       q24 oq24 = this.b(b);
       q24 oq241 = this.b(true);
       if (oq24 != null) {
          c24 tk = this.k;
          oq24.a.k = (float)this.h;
          oq24.invalidateSelf();
          q24 a = oq24.a;
          if (a.d != tk) {
             a.d = tk;
             oq24.onStateChange(oq24.getState());
          }
          if (oq241 != null) {
             float f = (float)this.h;
             if (this.n != null) {
                b = ry7.w(this.a, R.attr.colorSurface);
             }
             oq241.a.k = f;
             oq241.invalidateSelf();
             ColorStateList uColorStateL = ColorStateList.valueOf(b);
             oq24 = oq241.a;
             if (oq24.d != uColorStateL) {
                oq24.d = uColorStateL;
                oq241.onStateChange(oq241.getState());
             }
          }
       }
       return;
    }
}
