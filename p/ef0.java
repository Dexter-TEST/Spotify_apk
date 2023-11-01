package p.ef0;
import android.graphics.drawable.Drawable$Callback;
import p.d27;
import p.q24;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.Shape;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Paint;
import android.graphics.Paint$FontMetrics;
import android.graphics.RectF;
import android.graphics.PointF;
import android.graphics.Path;
import android.graphics.PorterDuff$Mode;
import java.lang.ref.WeakReference;
import java.lang.Object;
import p.e27;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.text.TextPaint;
import android.graphics.drawable.Drawable;
import java.util.Arrays;
import android.content.res.ColorStateList;
import p.p24;
import p.bd6;
import p.vr7;
import p.wr7;
import p.eb3;
import p.ce1;
import android.graphics.drawable.RippleDrawable;
import p.tu6;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build$VERSION;
import android.graphics.Paint$Style;
import android.graphics.ColorFilter;
import p.b7;
import p.ed6;
import android.graphics.Paint$Align;
import p.ty0;
import p.y17;
import java.lang.String;
import java.lang.CharSequence;
import java.lang.Math;
import android.text.TextUtils$TruncateAt;
import android.text.TextUtils;
import android.graphics.Outline;
import p.xe7;
import p.uw0;
import java.lang.Runnable;
import android.graphics.PorterDuffColorFilter;
import java.lang.ref.Reference;
import p.df0;
import com.google.android.material.chip.Chip;
import android.view.View;
import p.lj0;
import java.lang.System;

public final class ef0 extends q24 implements Drawable$Callback, d27	// class@001473 from classes.dex
{
    public final Path A0;
    public final e27 B0;
    public int C0;
    public int D0;
    public int E0;
    public int F0;
    public int G0;
    public int H0;
    public boolean I0;
    public int J0;
    public int K0;
    public ColorFilter L0;
    public PorterDuffColorFilter M0;
    public ColorStateList N0;
    public ColorStateList O;
    public PorterDuff$Mode O0;
    public ColorStateList P;
    public int[] P0;
    public float Q;
    public boolean Q0;
    public float R;
    public ColorStateList R0;
    public ColorStateList S;
    public WeakReference S0;
    public float T;
    public TextUtils$TruncateAt T0;
    public ColorStateList U;
    public boolean U0;
    public CharSequence V;
    public int V0;
    public boolean W;
    public boolean W0;
    public Drawable X;
    public ColorStateList Y;
    public float Z;
    public boolean a0;
    public boolean b0;
    public Drawable c0;
    public RippleDrawable d0;
    public ColorStateList e0;
    public float f0;
    public SpannableStringBuilder g0;
    public boolean h0;
    public boolean i0;
    public Drawable j0;
    public ColorStateList k0;
    public jd4 l0;
    public jd4 m0;
    public float n0;
    public float o0;
    public float p0;
    public float q0;
    public float r0;
    public float s0;
    public float t0;
    public float u0;
    public final Context v0;
    public final Paint w0;
    public final Paint$FontMetrics x0;
    public final RectF y0;
    public final PointF z0;
    public static final int[] X0;
    public static final ShapeDrawable Y0;

    static {
       int[] ointArray = new int[]{0x101009e};
       ef0.X0 = ointArray;
       ef0.Y0 = new ShapeDrawable(new OvalShape());
    }
    public void ef0(Context p0,AttributeSet p1){
       super(p0, p1, 0x7f030116, 0x7f130527);
       this.R = 0xbf800000;
       this.w0 = new Paint(1);
       this.x0 = new Paint$FontMetrics();
       this.y0 = new RectF();
       this.z0 = new PointF();
       this.A0 = new Path();
       this.K0 = 255;
       this.O0 = PorterDuff$Mode.SRC_IN;
       this.S0 = new WeakReference(null);
       this.i(p0);
       this.v0 = p0;
       e27 uoe27 = new e27(this);
       this.B0 = uoe27;
       this.V = "";
       uoe27.density = p0.getResources().getDisplayMetrics().density;
       int[] x0 = ef0.X0;
       this.setState(x0);
       if (!Arrays.equals(this.P0, x0)) {
          this.P0 = x0;
          if (this.T()) {
             this.w(this.getState(), x0);
          }
       }
       this.U0 = true;
       ef0.Y0.setTint(-1);
       return;
    }
    public static void U(Drawable p0){
       if (p0 != null) {
          p0.setCallback(null);
       }
       return;
    }
    public static boolean t(ColorStateList p0){
       boolean b = (p0 != null && p0.isStateful())? true: false;
       return b;
    }
    public static boolean u(Drawable p0){
       boolean b = (p0 != null && p0.isStateful())? true: false;
       return b;
    }
    public final void A(boolean p0){
       if (this.i0 != p0) {
          this.i0 = p0;
          p0 = this.R();
          int i = (this.R() != p0)? 1: 0;
          if (i) {
             if (p0) {
                this.o(this.j0);
             }else {
                ef0.U(this.j0);
             }
             this.invalidateSelf();
             this.v();
          }
       }
       return;
    }
    public final void B(float p0){
       if (p0 - this.R) {
          this.R = p0;
          this.setShapeAppearanceModel(this.a.a.e(p0));
       }
       return;
    }
    public final void C(Drawable p0){
       ef0 tX = this.X;
       Drawable uDrawable = null;
       if (tX != null) {
          if (tX instanceof vr7) {
             tX = tX.w;
          }
       }else {
          tX = uDrawable;
       }
       if (tX != p0) {
          float f = this.q();
          if (p0 != null) {
             uDrawable = eb3.L(p0).mutate();
          }
          this.X = uDrawable;
          float f1 = this.q();
          ef0.U(tX);
          if (this.S()) {
             this.o(this.X);
          }
          this.invalidateSelf();
          if (f1 - f) {
             this.v();
          }
       }
       return;
    }
    public final void D(float p0){
       if (p0 - this.Z) {
          this.Z = p0;
          this.invalidateSelf();
          if (this.q() - this.q()) {
             this.v();
          }
       }
       return;
    }
    public final void E(ColorStateList p0){
       this.a0 = true;
       if (this.Y != p0) {
          this.Y = p0;
          if (this.S()) {
             ce1.h(this.X, p0);
          }
          this.onStateChange(this.getState());
       }
       return;
    }
    public final void F(boolean p0){
       if (this.W != p0) {
          this.W = p0;
          p0 = this.S();
          int i = (this.S() != p0)? 1: 0;
          if (i) {
             if (p0) {
                this.o(this.X);
             }else {
                ef0.U(this.X);
             }
             this.invalidateSelf();
             this.v();
          }
       }
       return;
    }
    public final void G(ColorStateList p0){
       if (this.S != p0) {
          this.S = p0;
          if (this.W0 != null) {
             q24 ta = this.a;
             if (ta.d != p0) {
                ta.d = p0;
                this.onStateChange(this.getState());
             }
          }
          this.onStateChange(this.getState());
       }
       return;
    }
    public final void H(float p0){
       if (p0 - this.T) {
          this.T = p0;
          this.w0.setStrokeWidth(p0);
          if (this.W0 != null) {
             this.a.k = p0;
             this.invalidateSelf();
          }
          this.invalidateSelf();
       }
       return;
    }
    public final void I(Drawable p0){
       ef0 tc0 = this.c0;
       Drawable uDrawable = null;
       if (tc0 != null) {
          if (tc0 instanceof vr7) {
             tc0 = tc0.w;
          }
       }else {
          tc0 = uDrawable;
       }
       if (tc0 != p0) {
          float f = this.r();
          if (p0 != null) {
             uDrawable = eb3.L(p0).mutate();
          }
          this.c0 = uDrawable;
          this.d0 = new RippleDrawable(tu6.A(this.U), this.c0, ef0.Y0);
          float f1 = this.r();
          ef0.U(tc0);
          if (this.T()) {
             this.o(this.c0);
          }
          this.invalidateSelf();
          if (f1 - f) {
             this.v();
          }
       }
       return;
    }
    public final void J(float p0){
       if (p0 - this.t0) {
          this.t0 = p0;
          this.invalidateSelf();
          if (this.T()) {
             this.v();
          }
       }
       return;
    }
    public final void K(float p0){
       if (p0 - this.f0) {
          this.f0 = p0;
          this.invalidateSelf();
          if (this.T()) {
             this.v();
          }
       }
       return;
    }
    public final void L(float p0){
       if (p0 - this.s0) {
          this.s0 = p0;
          this.invalidateSelf();
          if (this.T()) {
             this.v();
          }
       }
       return;
    }
    public final void M(ColorStateList p0){
       if (this.e0 != p0) {
          this.e0 = p0;
          if (this.T()) {
             ce1.h(this.c0, p0);
          }
          this.onStateChange(this.getState());
       }
       return;
    }
    public final void N(boolean p0){
       if (this.b0 != p0) {
          this.b0 = p0;
          p0 = this.T();
          int i = (this.T() != p0)? 1: 0;
          if (i) {
             if (p0) {
                this.o(this.c0);
             }else {
                ef0.U(this.c0);
             }
             this.invalidateSelf();
             this.v();
          }
       }
       return;
    }
    public final void O(float p0){
       if (p0 - this.p0) {
          this.p0 = p0;
          this.invalidateSelf();
          if (this.q() - this.q()) {
             this.v();
          }
       }
       return;
    }
    public final void P(float p0){
       if (p0 - this.o0) {
          this.o0 = p0;
          this.invalidateSelf();
          if (this.q() - this.q()) {
             this.v();
          }
       }
       return;
    }
    public final void Q(ColorStateList p0){
       if (this.U != p0) {
          this.U = p0;
          p0 = (this.Q0 != null)? tu6.A(p0): null;
          this.R0 = p0;
          this.onStateChange(this.getState());
       }
       return;
    }
    public final boolean R(){
       boolean b = (this.i0 != null && (this.j0 != null && this.I0 != null))? true: false;
       return b;
    }
    public final boolean S(){
       boolean b = (this.W != null && this.X != null)? true: false;
       return b;
    }
    public final boolean T(){
       boolean b = (this.b0 != null && this.c0 != null)? true: false;
       return b;
    }
    public final void a(){
       this.v();
       this.invalidateSelf();
    }
    public final void draw(Canvas p0){
       ef0 k0;
       float f3;
       int i;
       int i2;
       ef0 l0;
       float f5;
       int i3;
       RectF left;
       RectF top;
       ef0 b0;
       float f6;
       ef0 x0;
       int i4;
       CharSequence uCharSequenc;
       int i5;
       ef0 uoef0 = this;
       Canvas uCanvas = p0;
       Rect bounds = this.getBounds();
       if (!bounds.isEmpty() && (k0 = uoef0.K0) != null) {
          if (k0 < 255) {
             float f = (float)bounds.left;
             float f1 = (float)bounds.top;
             float f2 = (float)bounds.right;
             f3 = (float)bounds.bottom;
             if (Build$VERSION.SDK_INT > 21) {
                i = p0.saveLayerAlpha(f, f1, f2, f3, k0);
                int i1 = 0;
             }else {
                i = p0.saveLayerAlpha(f, f1, f2, f3, k0, 31);
             }
             i2 = i;
          }else {
             i2 = 0;
          }
          ef0 w0 = uoef0.w0;
          k0 = uoef0.y0;
          if (uoef0.W0 == null) {
             w0.setColor(uoef0.C0);
             w0.setStyle(Paint$Style.FILL);
             k0.set(bounds);
             uCanvas.drawRoundRect(k0, this.s(), this.s(), w0);
          }
          if (uoef0.W0 == null) {
             w0.setColor(uoef0.D0);
             w0.setStyle(Paint$Style.FILL);
             if ((l0 = uoef0.L0) == null) {
                l0 = uoef0.M0;
             }
             w0.setColorFilter(l0);
             k0.set(bounds);
             uCanvas.drawRoundRect(k0, this.s(), this.s(), w0);
          }
          if (uoef0.W0 != null) {
             super.draw(p0);
          }
          float f4 = 0;
          if ((f4 - uoef0.T) > 0 && uoef0.W0 == null) {
             w0.setColor(uoef0.F0);
             w0.setStyle(Paint$Style.STROKE);
             if (uoef0.W0 == null) {
                if ((l0 = uoef0.L0) == null) {
                   l0 = uoef0.M0;
                }
                w0.setColorFilter(l0);
             }
             f5 = uoef0.T / 2.00f;
             k0.set(((float)bounds.left + f5), ((float)bounds.top + f5), ((float)bounds.right - f5), ((float)bounds.bottom - f5));
             uCanvas.drawRoundRect(k0, (uoef0.R - (uoef0.T / 2.00f)), (uoef0.R - (uoef0.T / 2.00f)), w0);
          }
          w0.setColor(uoef0.G0);
          w0.setStyle(Paint$Style.FILL);
          k0.set(bounds);
          if (uoef0.W0 == null) {
             uCanvas.drawRoundRect(k0, this.s(), this.s(), w0);
             i3 = 0;
             i = 255;
          }else {
             b0 = uoef0.A0;
             q24 a1 = uoef0.a;
             uoef0.I.a(a1.a, a1.j, new RectF(bounds), uoef0.H, b0);
             i3 = 0;
             this.f(p0, w0, b0, uoef0.a.a, this.h());
          }
          if (this.S()) {
             uoef0.p(bounds, k0);
             left = k0.left;
             top = k0.top;
             uCanvas.translate(left, top);
             uoef0.X.setBounds(i3, i3, (int)k0.width(), (int)k0.height());
             uoef0.X.draw(uCanvas);
             uCanvas.translate((- left), (- top));
          }
          if (this.R()) {
             uoef0.p(bounds, k0);
             left = k0.left;
             top = k0.top;
             uCanvas.translate(left, top);
             uoef0.j0.setBounds(i3, i3, (int)k0.width(), (int)k0.height());
             uoef0.j0.draw(uCanvas);
             uCanvas.translate((- left), (- top));
          }
          if (uoef0.U0 != null && uoef0.V != null) {
             l0 = uoef0.z0;
             l0.set(f4, f4);
             Paint$Align lEFT = Paint$Align.LEFT;
             b0 = uoef0.B0;
             if (uoef0.V != null) {
                f6 = (this.q() + uoef0.n0) + uoef0.q0;
                if (!eb3.o(this)) {
                   l0.x = (float)bounds.left + f6;
                   lEFT = Paint$Align.LEFT;
                }else {
                   l0.x = (float)bounds.right - f6;
                   lEFT = Paint$Align.RIGHT;
                }
                x0 = uoef0.x0;
                b0.a.getFontMetrics(x0);
                l0.y = (float)bounds.centerY() - ((x0.descent + x0.ascent) / 2.00f);
             }
             k0.setEmpty();
             if (uoef0.V != null) {
                f3 = (this.q() + uoef0.n0) + uoef0.q0;
                float f7 = (this.r() + uoef0.u0) + uoef0.r0;
                if (!eb3.o(this)) {
                   k0.left = (float)bounds.left + f3;
                   k0.right = (float)bounds.right - f7;
                }else {
                   k0.left = (float)bounds.left + f7;
                   k0.right = (float)bounds.right - f3;
                }
                k0.top = (float)bounds.top;
                k0.bottom = (float)bounds.bottom;
             }
             e27 a = b0.a;
             if (b0.f != null) {
                a.drawableState = this.getState();
                b0.f.e(uoef0.v0, a, b0.b);
             }
             a.setTextAlign(lEFT);
             lEFT = (Math.round(b0.a(uoef0.V.toString())) > Math.round(k0.width()))? 1: 0;
             if (lEFT) {
                i4 = p0.save();
                uCanvas.clipRect(k0);
             }else {
                i4 = 0;
             }
             b0 = uoef0.V;
             if (lEFT && uoef0.T0 != null) {
                uCharSequenc = TextUtils.ellipsize(b0, a, k0.width(), uoef0.T0);
             }
             ef0 uoef01 = uCharSequenc;
             x0 = k0;
             i5 = i2;
             p0.drawText(uoef01, 0, uoef01.length(), l0.x, l0.y, a);
             if (lEFT) {
                uCanvas.restoreToCount(i4);
             }
          }else {
             x0 = k0;
             i5 = i2;
             uCharSequenc = 255;
          }
          if (this.T()) {
             x0.setEmpty();
             if (this.T()) {
                f5 = uoef0.u0 + uoef0.t0;
                if (!eb3.o(this)) {
                   f6 = (float)bounds.right - f5;
                   x0.right = f6;
                   x0.left = f6 - uoef0.f0;
                }else {
                   f6 = (float)bounds.left + f5;
                   x0.left = f6;
                   x0.right = f6 + uoef0.f0;
                }
                w0 = uoef0.f0;
                f5 = bounds.exactCenterY() - (w0 / 2.00f);
                x0.top = f5;
                x0.bottom = f5 + w0;
             }
             top = x0.left;
             RectF top1 = x0.top;
             uCanvas.translate(top, top1);
             uoef0.c0.setBounds(0, 0, (int)x0.width(), (int)x0.height());
             uoef0.d0.setBounds(uoef0.c0.getBounds());
             uoef0.d0.jumpToCurrentState();
             uoef0.d0.draw(uCanvas);
             uCanvas.translate((- top), (- top1));
          }
          if (uoef0.K0 < 255) {
             uCanvas.restoreToCount(i5);
          }
       }
       return;
    }
    public final int getAlpha(){
       return this.K0;
    }
    public final ColorFilter getColorFilter(){
       return this.L0;
    }
    public final int getIntrinsicHeight(){
       return (int)this.Q;
    }
    public final int getIntrinsicWidth(){
       return Math.min(Math.round(((this.r() + ((this.B0.a(this.V.toString()) + ((this.q() + this.n0) + this.q0)) + this.r0)) + this.u0)), this.V0);
    }
    public final int getOpacity(){
       return -3;
    }
    public final void getOutline(Outline p0){
       if (this.W0 != null) {
          super.getOutline(p0);
          return;
       }else {
          Rect bounds = this.getBounds();
          if (!bounds.isEmpty()) {
             p0.setRoundRect(bounds, this.R);
          }else {
             p0.setRoundRect(0, 0, this.getIntrinsicWidth(), (int)this.Q, this.R);
          }
          p0.setAlpha(((float)this.K0 / 0x437f0000));
          return;
       }
    }
    public final void invalidateDrawable(Drawable p0){
       Drawable$Callback callback;
       if ((callback = this.getCallback()) != null) {
          callback.invalidateDrawable(this);
       }
       return;
    }
    public final boolean isStateful(){
       e27 f;
       boolean b = true;
       if (!ef0.t(this.O) && (!ef0.t(this.P) && (!ef0.t(this.S) && (this.Q0 == null && ef0.t(this.R0))))) {
          y17 j = ((f = this.B0.f) != null && ((j = f.j) != null && j.isStateful()))? 1: 0;
          if (!j) {
             j = (this.i0 != null && (this.j0 != null && this.h0 != null))? 1: 0;
             if (!j && (!ef0.u(this.X) && (!ef0.u(this.j0) && !ef0.t(this.N0)))) {
                b = false;
             }
          }
       }
       return b;
    }
    public final void o(Drawable p0){
       if (p0 == null) {
          return;
       }
       p0.setCallback(this);
       eb3.z(p0, eb3.o(this));
       p0.setLevel(this.getLevel());
       p0.setVisible(this.isVisible(), false);
       if (p0 == this.c0) {
          if (p0.isStateful()) {
             p0.setState(this.P0);
          }
          ce1.h(p0, this.e0);
          return;
       }else {
          ef0 tX = this.X;
          if (p0 == tX && this.a0 != null) {
             ce1.h(tX, this.Y);
          }
          if (p0.isStateful()) {
             p0.setState(this.getState());
          }
          return;
       }
    }
    public final boolean onLayoutDirectionChanged(int p0){
       boolean b = super.onLayoutDirectionChanged(p0);
       if (this.S()) {
          b = b | eb3.z(this.X, p0);
       }
       if (this.R()) {
          b = b | eb3.z(this.j0, p0);
       }
       if (this.T()) {
          b = b | eb3.z(this.c0, p0);
       }
       if (b) {
          this.invalidateSelf();
       }
       return true;
    }
    public final boolean onLevelChange(int p0){
       boolean b = super.onLevelChange(p0);
       if (this.S()) {
          b = b | this.X.setLevel(p0);
       }
       if (this.R()) {
          b = b | this.j0.setLevel(p0);
       }
       if (this.T()) {
          b = b | this.c0.setLevel(p0);
       }
       if (b) {
          this.invalidateSelf();
       }
       return b;
    }
    public final boolean onStateChange(int[] p0){
       if (this.W0 != null) {
          super.onStateChange(p0);
       }
       return this.w(p0, this.P0);
    }
    public final void p(Rect p0,RectF p1){
       float f1;
       p1.setEmpty();
       if (this.S() || this.R()) {
          float f = this.n0 + this.o0;
          ef0 tj0 = (this.I0 != null)? this.j0: this.X;
          ef0 tZ = this.Z;
          if ((tZ) <= 0 && tj0 != null) {
             tZ = (float)tj0.getIntrinsicWidth();
          }
          if (!eb3.o(this)) {
             f1 = (float)p0.left + f;
             p1.left = f1;
             p1.right = f1 + tZ;
          }else {
             f1 = (float)p0.right - f;
             p1.right = f1;
             p1.left = f1 - tZ;
          }
          ef0 tj01 = (this.I0 != null)? this.j0: this.X;
          tj0 = this.Z;
          if ((tj0) <= 0 && tj01 != null) {
             f1 = (float)Math.ceil((double)xe7.q(this.v0, 24));
             if (((float)tj01.getIntrinsicHeight() - f1) <= 0) {
                f = (float)tj01.getIntrinsicHeight();
             label_0073 :
                float f2 = p0.exactCenterY() - (f / 2.00f);
                p1.top = f2;
                p1.bottom = f2 + f;
             }
          }
          tj01 = f1;
          goto label_0073 ;
       }
       return;
    }
    public final float q(){
       float f = 0;
       if (!this.S() && !this.R()) {
          return f;
       }
       ef0 to0 = this.o0;
       ef0 tj0 = (this.I0 != null)? this.j0: this.X;
       ef0 tZ = this.Z;
       if ((tZ - f) <= 0 && tj0 != null) {
          tZ = (float)tj0.getIntrinsicWidth();
       }
       return ((tZ + to0) + this.p0);
    }
    public final float r(){
       if (this.T()) {
          return ((this.s0 + this.f0) + this.t0);
       }
       return 0;
    }
    public final float s(){
       float f = (this.W0 != null)? this.a.a.e.a(this.h()): this.R;
       return f;
    }
    public final void scheduleDrawable(Drawable p0,Runnable p1,long p2){
       Drawable$Callback callback;
       if ((callback = this.getCallback()) != null) {
          callback.scheduleDrawable(this, p1, p2);
       }
       return;
    }
    public final void setAlpha(int p0){
       if (this.K0 != p0) {
          this.K0 = p0;
          this.invalidateSelf();
       }
       return;
    }
    public final void setColorFilter(ColorFilter p0){
       if (this.L0 != p0) {
          this.L0 = p0;
          this.invalidateSelf();
       }
       return;
    }
    public final void setTintList(ColorStateList p0){
       if (this.N0 != p0) {
          this.N0 = p0;
          this.onStateChange(this.getState());
       }
       return;
    }
    public final void setTintMode(PorterDuff$Mode p0){
       ef0 tN0;
       if (this.O0 != p0) {
          this.O0 = p0;
          PorterDuffColorFilter porterDuffCo = ((tN0 = this.N0) != null && p0 != null)? new PorterDuffColorFilter(tN0.getColorForState(this.getState(), 0), p0): null;
          this.M0 = porterDuffCo;
          this.invalidateSelf();
       }
       return;
    }
    public final boolean setVisible(boolean p0,boolean p1){
       boolean b = super.setVisible(p0, p1);
       if (this.S()) {
          b = b | this.X.setVisible(p0, p1);
       }
       if (this.R()) {
          b = b | this.j0.setVisible(p0, p1);
       }
       if (this.T()) {
          b = b | this.c0.setVisible(p0, p1);
       }
       if (b) {
          this.invalidateSelf();
       }
       return b;
    }
    public final void unscheduleDrawable(Drawable p0,Runnable p1){
       Drawable$Callback callback;
       if ((callback = this.getCallback()) != null) {
          callback.unscheduleDrawable(this, p1);
       }
       return;
    }
    public final void v(){
       df0 uodf0;
       if ((uodf0 = this.S0.get()) != null) {
          uodf0.b(uodf0.G);
          uodf0.requestLayout();
          uodf0.invalidateOutline();
       }
       return;
    }
    public final boolean w(int[] p0,int[] p1){
       ef0 tO;
       ef0 tP;
       e27 f;
       y17 j;
       int[] state;
       int[] ointArray;
       boolean b = super.onStateChange(p0);
       int colorForStat = ((tO = this.O) != null)? tO.getColorForState(p0, this.C0): 0;
       colorForStat = this.d(colorForStat);
       int i = 1;
       if (this.C0 != colorForStat) {
          this.C0 = colorForStat;
          b = 1;
       }
       int colorForStat1 = ((tP = this.P) != null)? tP.getColorForState(p0, this.D0): 0;
       colorForStat1 = this.d(colorForStat1);
       if (this.D0 != colorForStat1) {
          this.D0 = colorForStat1;
          b = 1;
       }
       colorForStat = lj0.f(colorForStat1, colorForStat);
       colorForStat1 = (this.E0 != colorForStat)? 1: 0;
       int i1 = (this.a.c == null)? 1: 0;
       if ((colorForStat1 | i1)) {
          this.E0 = colorForStat;
          this.k(ColorStateList.valueOf(colorForStat));
          b = 1;
       }
       colorForStat = ((tO = this.S) != null)? tO.getColorForState(p0, this.F0): 0;
       if (this.F0 != colorForStat) {
          this.F0 = colorForStat;
          b = 1;
       }
       colorForStat = (this.R0 != null && tu6.B(p0))? this.R0.getColorForState(p0, this.G0): 0;
       if (this.G0 != colorForStat) {
          this.G0 = colorForStat;
          if (this.Q0 != null) {
             b = 1;
          }
       }
       colorForStat = ((f = this.B0.f) != null && (j = f.j) != null)? j.getColorForState(p0, this.H0): 0;
       if (this.H0 != colorForStat) {
          this.H0 = colorForStat;
          b = 1;
       }
       if ((state = this.getState()) != null) {
          colorForStat1 = state.length;
          i1 = 0;
          while (true) {
             if (i1 < colorForStat1) {
                if (state[i1] == 0x10100a0) {
                   state = 1;
                   break ;
                }else {
                   i1 = i1 + 1;
                }
             }
          }
          colorForStat = (state && this.h0 != null)? true: false;
          if (this.I0 != colorForStat && this.j0 != null) {
             this.I0 = colorForStat;
             if (this.q() - this.q()) {
                b = 1;
                state = 1;
             label_00dc :
                colorForStat1 = ((tP = this.N0) != null)? tP.getColorForState(p0, this.J0): 0;
                if (this.J0 != colorForStat1) {
                   this.J0 = colorForStat1;
                   ef0 tN0 = this.N0;
                   tP = this.O0;
                   PorterDuffColorFilter porterDuffCo = (tN0 != null && tP != null)? new PorterDuffColorFilter(tN0.getColorForState(this.getState(), 0), tP): null;
                   this.M0 = porterDuffCo;
                }else {
                   i = b;
                }
                if (ef0.u(this.X)) {
                   i = i | this.X.setState(p0);
                }
                if (ef0.u(this.j0)) {
                   i = i | this.j0.setState(p0);
                }
                if (ef0.u(this.c0)) {
                   ointArray = new int[(p0.length + p1.length)];
                   System.arraycopy(p0, 0, ointArray, 0, p0.length);
                   System.arraycopy(p1, 0, ointArray, p0.length, p1.length);
                   i = i | this.c0.setState(ointArray);
                }
                if (ef0.u(this.d0)) {
                   i = i | this.d0.setState(p1);
                }
                if (i) {
                   this.invalidateSelf();
                }
                if (state) {
                   this.v();
                }
                return i;
             }else {
                ointArray = 1;
             }
          }
          state = 0;
          goto label_00dc ;
       }
       state = 0;
    }
    public final void x(boolean p0){
       if (this.h0 != p0) {
          this.h0 = p0;
          float f = this.q();
          if (!p0 && this.I0 != null) {
             this.I0 = false;
          }
          this.invalidateSelf();
          if (this.q() - f) {
             this.v();
          }
       }
       return;
    }
    public final void y(Drawable p0){
       if (this.j0 != p0) {
          this.j0 = p0;
          ef0.U(this.j0);
          this.o(this.j0);
          this.invalidateSelf();
          if (this.q() - this.q()) {
             this.v();
          }
       }
       return;
    }
    public final void z(ColorStateList p0){
       if (this.k0 != p0) {
          this.k0 = p0;
          int i = (this.i0 != null && (this.j0 != null && this.h0 != null))? 1: 0;
          if (i) {
             ce1.h(this.j0, p0);
          }
          this.onStateChange(this.getState());
       }
       return;
    }
}
