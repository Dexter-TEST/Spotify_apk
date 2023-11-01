package p.q24;
import p.c57;
import p.ce6;
import android.graphics.drawable.Drawable;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Xfermode;
import p.bd6;
import android.content.Context;
import android.util.AttributeSet;
import p.ad6;
import p.p24;
import p.ud6;
import java.util.BitSet;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import p.zc6;
import android.os.Looper;
import java.lang.Thread;
import p.cd6;
import p.ed6;
import android.graphics.Paint$Style;
import p.b7;
import java.lang.Object;
import android.content.res.ColorStateList;
import android.graphics.PorterDuffColorFilter;
import p.ci1;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import p.py;
import java.lang.Class;
import p.uw0;
import android.os.Build$VERSION;
import java.lang.Math;
import android.graphics.Rect;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;
import java.lang.IllegalStateException;
import java.lang.String;
import android.graphics.drawable.Drawable$ConstantState;
import android.graphics.Outline;
import android.graphics.Region$Op;
import p.yo4;

public class q24 extends Drawable implements c57, ce6	// class@00231b from classes.dex
{
    public final RectF A;
    public final Region B;
    public final Region C;
    public bd6 D;
    public final Paint E;
    public final Paint F;
    public final zc6 G;
    public final b7 H;
    public final ed6 I;
    public PorterDuffColorFilter J;
    public PorterDuffColorFilter K;
    public final RectF L;
    public final boolean M;
    public p24 a;
    public final ud6[] b;
    public final ud6[] c;
    public final BitSet t;
    public boolean v;
    public final Matrix w;
    public final Path x;
    public final Path y;
    public final RectF z;
    public static final Paint N;

    static {
       Paint paint = new Paint(1);
       q24.N = paint;
       paint.setColor(-1);
       paint.setXfermode(new PorterDuffXfermode(PorterDuff$Mode.DST_OUT));
    }
    public void q24(){
       super(new bd6());
    }
    public void q24(Context p0,AttributeSet p1,int p2,int p3){
       super(bd6.b(p0, p1, p2, p3).c());
    }
    public void q24(bd6 p0){
       super(new p24(p0));
    }
    public void q24(p24 p0){
       super();
       ud6[] oud6Array = new ud6[4];
       this.b = oud6Array;
       ud6[] oud6Array1 = new ud6[4];
       this.c = oud6Array1;
       this.t = new BitSet(8);
       this.w = new Matrix();
       this.x = new Path();
       this.y = new Path();
       this.z = new RectF();
       this.A = new RectF();
       this.B = new Region();
       this.C = new Region();
       Paint paint = new Paint(1);
       this.E = paint;
       Paint paint1 = new Paint(1);
       this.F = paint1;
       this.G = new zc6();
       ed6 a = (Looper.getMainLooper().getThread() == Thread.currentThread())? cd6.a: new ed6();
       this.I = a;
       this.L = new RectF();
       this.M = true;
       this.a = p0;
       paint1.setStyle(Paint$Style.STROKE);
       paint.setStyle(Paint$Style.FILL);
       this.m();
       this.l(this.getState());
       this.H = new b7(13, this);
       return;
    }
    public final void b(RectF p0,Path p1){
       q24 ta = this.a;
       this.I.a(ta.a, ta.j, p0, this.H, p1);
       if (0x3f800000 - this.a.i) {
          q24 tw = this.w;
          tw.reset();
          tw.setScale(this.a.i, this.a.i, (p0.width() / 2.00f), (p0.height() / 2.00f));
          p1.transform(tw);
       }
       p1.computeBounds(this.L, true);
       return;
    }
    public final PorterDuffColorFilter c(ColorStateList p0,PorterDuff$Mode p1,Paint p2,boolean p3){
       int color;
       int i;
       PorterDuffColorFilter porterDuffCo;
       PorterDuffColorFilter porterDuffCo1;
       if (p0 != null && p1 != null) {
          color = p0.getColorForState(this.getState(), 0);
          if (p3) {
             color = this.d(color);
          }
          porterDuffCo1 = new PorterDuffColorFilter(color, p1);
       }else if(p3){
          color = p2.getColor();
          if ((i = this.d(color)) != color) {
             porterDuffCo = new PorterDuffColorFilter(i, PorterDuff$Mode.SRC_IN);
          label_002f :
             porterDuffCo1 = porterDuffCo;
          }
       }
       porterDuffCo = 0;
       goto label_002f ;
       return porterDuffCo1;
    }
    public final int d(int p0){
       p24 b;
       q24 ta = this.a;
       float f = (ta.n + ta.o) + ta.m;
       if ((b = ta.b) != null) {
          p0 = b.a(f, p0);
       }
       return p0;
    }
    public void draw(Canvas p0){
       float f1;
       p24 a;
       bd6 uobd6;
       p24 u;
       Bitmap uBitmap;
       q24 oq24 = this;
       Canvas uCanvas = p0;
       q24 e = oq24.E;
       e.setColorFilter(oq24.J);
       int alpha = e.getAlpha();
       p24 l = oq24.a.l;
       e.setAlpha((((l + (l >> 7)) * alpha) >> 8));
       q24 f = oq24.F;
       f.setColorFilter(oq24.K);
       f.setStrokeWidth(oq24.a.k);
       int alpha1 = f.getAlpha();
       l = oq24.a.l;
       f.setAlpha((((l + (l >> 7)) * alpha1) >> 8));
       q24 x = oq24.x;
       boolean b = false;
       if (oq24.v != null) {
          uBitmap = ((l = oq24.a.u) != Paint$Style.FILL_AND_STROKE && (l != Paint$Style.STROKE || (0 - f.getStrokeWidth()) <= 0))? 0: 1;
          f1 = 2.00f;
          float ad6 f2 = (l)? f.getStrokeWidth() / f1: 0;
          a = oq24.a.a;
          py opy = new py(oq24, (- f2));
          a.getClass();
          f2 = new ad6(a);
          f2.e = opy.a(a.e);
          f2.f = opy.a(a.f);
          f2.h = opy.a(a.h);
          f2.g = opy.a(a.g);
          uobd6 = new bd6(f2);
          oq24.D = uobd6;
          q24 i = oq24.I;
          l = oq24.a.j;
          q24 a1 = oq24.A;
          a1.set(this.h());
          float f3 = ((u = oq24.a.u) != Paint$Style.FILL_AND_STROKE && (u != Paint$Style.STROKE || (0 - f.getStrokeWidth()) <= 0))? 0: 1;
          f3 = (u)? f.getStrokeWidth() / f1: 0;
          a1.inset(f3, f3);
          i.a(uobd6, l, a1, null, oq24.y);
          oq24.b(this.h(), x);
          oq24.v = b;
       }
       q24 a2 = oq24.a;
       p24 p = a2.p;
       uobd6 = 2;
       if (p != 1 && a2.q > null) {
          if (p != uobd6) {
             int sDK_INT = Build$VERSION.SDK_INT;
             a2 = (!a2.a.d(this.h()) && (!x.isConvex() && sDK_INT < 29))? 1: 0;
             if (!a2) {
             label_0117 :
                uBitmap = 0;
             label_0118 :
                if (a2) {
                   p0.save();
                   a2 = oq24.a;
                   q24 a3 = oq24.a;
                   uCanvas.translate((float)(int)(Math.sin(Math.toRadians((double)a2.s)) * (double)a2.r), (float)(int)(Math.cos(Math.toRadians((double)a3.s)) * (double)a3.r));
                   if (oq24.M == null) {
                      this.e(p0);
                      p0.restore();
                   }else {
                      a2 = oq24.L;
                      sDK_INT = (int)(a2.width() - (float)this.getBounds().width());
                      int i1 = (int)(a2.height() - (float)this.getBounds().height());
                      if (sDK_INT >= 0 && i1 >= 0) {
                         uBitmap = Bitmap.createBitmap((((oq24.a.q * 2) + (int)a2.width()) + sDK_INT), (((oq24.a.q * 2) + (int)a2.height()) + i1), Bitmap$Config.ARGB_8888);
                         Canvas uobd61 = new Canvas(uBitmap);
                         f1 = (float)((this.getBounds().left - oq24.a.q) - sDK_INT);
                         float f4 = (float)((this.getBounds().top - oq24.a.q) - i1);
                         uobd61.translate((- f1), (- f4));
                         oq24.e(uobd61);
                         uCanvas.drawBitmap(uBitmap, f1, f4, null);
                         uBitmap.recycle();
                         p0.restore();
                      }else {
                         throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                      }
                   }
                }
                a2 = oq24.a;
                sDK_INT = ((p = a2.u) != Paint$Style.FILL_AND_STROKE && p != Paint$Style.FILL)? 0: 1;
                if (sDK_INT) {
                   this.f(p0, e, x, a2.a, this.h());
                }
                b = ((l = oq24.a.u) != Paint$Style.FILL_AND_STROKE && (l != Paint$Style.STROKE || (0 - f.getStrokeWidth()) <= 0))? 0: 1;
                if (b) {
                   this.g(p0);
                }
                e.setAlpha(alpha);
                f.setAlpha(alpha1);
                return;
             }
          }
          a2 = 1;
          goto label_0118 ;
       }else {
          goto label_0117 ;
       }
    }
    public final void e(Canvas p0){
       this.t.cardinality();
       q24 tx = this.x;
       q24 tG = this.G;
       if (this.a.r != null) {
          p0.drawPath(tx, tG.a);
       }
       for (int i = 0; i < 4; i = i + 1) {
          Matrix a = ud6.a;
          this.b[i].a(a, tG, this.a.q, p0);
          this.c[i].a(a, tG, this.a.q, p0);
       }
       if (this.M != null) {
          q24 ta = this.a;
          i = (int)(Math.sin(Math.toRadians((double)ta.s)) * (double)ta.r);
          tG = this.a;
          int i1 = (int)(Math.cos(Math.toRadians((double)tG.s)) * (double)tG.r);
          p0.translate((float)(- i), (float)(- i1));
          p0.drawPath(tx, q24.N);
          p0.translate((float)i, (float)i1);
       }
       return;
    }
    public final void f(Canvas p0,Paint p1,Path p2,bd6 p3,RectF p4){
       if (p3.d(p4)) {
          p0.drawRoundRect(p4, (p3.f.a(p4) * this.a.j), (p3.f.a(p4) * this.a.j), p1);
       }else {
          p0.drawPath(p2, p1);
       }
       return;
    }
    public void g(Canvas p0){
       q24 tF = this.F;
       q24 ty = this.y;
       q24 tD = this.D;
       q24 tA = this.A;
       tA.set(this.h());
       p24 u = this.a.u;
       float f = 0;
       u = (u != Paint$Style.FILL_AND_STROKE && (u != Paint$Style.STROKE || (f - tF.getStrokeWidth()) <= 0))? 0: 1;
       if (u) {
          f = tF.getStrokeWidth() / 2.00f;
       }
       tA.inset(f, f);
       this.f(p0, tF, ty, tD, tA);
       return;
    }
    public final Drawable$ConstantState getConstantState(){
       return this.a;
    }
    public int getOpacity(){
       return -3;
    }
    public void getOutline(Outline p0){
       q24 ta = this.a;
       if (ta.p == 2) {
          return;
       }
       if (ta.a.d(this.h())) {
          p0.setRoundRect(this.getBounds(), (this.a.a.e.a(this.h()) * this.a.j));
          return;
       }else {
          try{
             q24 tx = this.x;
             this.b(this.h(), tx);
             if (tx.isConvex() || Build$VERSION.SDK_INT >= 29) {
                p0.setConvexPath(tx);
             }
             return;
          }catch(java.lang.IllegalArgumentException e0){
          }
       }
    }
    public final boolean getPadding(Rect p0){
       p24 h;
       if ((h = this.a.h) == null) {
          return super.getPadding(p0);
       }
       p0.set(h);
       return true;
    }
    public final Region getTransparentRegion(){
       q24 tB = this.B;
       tB.set(this.getBounds());
       q24 tx = this.x;
       this.b(this.h(), tx);
       q24 tC = this.C;
       tC.setPath(tx, tB);
       tB.op(tC, Region$Op.DIFFERENCE);
       return tB;
    }
    public final RectF h(){
       q24 tz = this.z;
       tz.set(this.getBounds());
       return tz;
    }
    public final void i(Context p0){
       this.a.b = new ci1(p0);
       this.n();
    }
    public final void invalidateSelf(){
       this.v = true;
       super.invalidateSelf();
    }
    public boolean isStateful(){
       p24 f;
       boolean b = (!super.isStateful() && ((f = this.a.f) == null && (f.isStateful() && ((f = this.a.e) == null && (f.isStateful() && ((f = this.a.d) == null && (f.isStateful() && ((f = this.a.c) == null && f.isStateful()))))))))? false: true;
       return b;
    }
    public final void j(float p0){
       q24 ta = this.a;
       if (p0 - ta.n) {
          ta.n = p0;
          this.n();
       }
       return;
    }
    public final void k(ColorStateList p0){
       q24 ta = this.a;
       if (ta.c != p0) {
          ta.c = p0;
          this.onStateChange(this.getState());
       }
       return;
    }
    public final boolean l(int[] p0){
       q24 tE;
       boolean b = true;
       if (this.a.c != null) {
          tE = this.E;
          int color = tE.getColor();
          int colorForStat = this.a.c.getColorForState(p0, color);
          if (color != colorForStat) {
             tE.setColor(colorForStat);
             tE = 1;
          label_001d :
             if (this.a.d != null) {
                q24 tF = this.F;
                colorForStat = tF.getColor();
                int colorForStat1 = this.a.d.getColorForState(p0, colorForStat);
                if (colorForStat != colorForStat1) {
                   tF.setColor(colorForStat1);
                label_0038 :
                   return b;
                }
             }
             b = tE;
             goto label_0038 ;
          }
       }
       tE = 0;
       goto label_001d ;
    }
    public final boolean m(){
       q24 tJ = this.J;
       q24 tK = this.K;
       q24 ta = this.a;
       boolean b = true;
       this.J = this.c(ta.f, ta.g, this.E, b);
       ta = this.a;
       this.K = this.c(ta.e, ta.g, this.F, false);
       ta = this.a;
       if (ta.t != null) {
          this.G.a(ta.f.getColorForState(this.getState(), false));
       }
       if (yo4.a(tJ, this.J) && yo4.a(tK, this.K)) {
          b = false;
       }
       return b;
    }
    public final Drawable mutate(){
       this.a = new p24(this.a);
       return this;
    }
    public final void n(){
       q24 ta = this.a;
       float f = ta.n + ta.o;
       ta.q = (int)Math.ceil((double)(0x3f400000 * f));
       this.a.r = (int)Math.ceil((double)(f * 0.25f));
       this.m();
       super.invalidateSelf();
    }
    public final void onBoundsChange(Rect p0){
       this.v = true;
       super.onBoundsChange(p0);
    }
    public boolean onStateChange(int[] p0){
       boolean b = this.m();
       boolean b1 = (!this.l(p0) && !b)? false: true;
       if (b1) {
          this.invalidateSelf();
       }
       return b1;
    }
    public void setAlpha(int p0){
       q24 ta = this.a;
       if (ta.l != p0) {
          ta.l = p0;
          super.invalidateSelf();
       }
       return;
    }
    public void setColorFilter(ColorFilter p0){
       this.a.getClass();
       super.invalidateSelf();
    }
    public final void setShapeAppearanceModel(bd6 p0){
       this.a.a = p0;
       this.invalidateSelf();
    }
    public final void setTint(int p0){
       this.setTintList(ColorStateList.valueOf(p0));
    }
    public void setTintList(ColorStateList p0){
       this.a.f = p0;
       this.m();
       super.invalidateSelf();
    }
    public void setTintMode(PorterDuff$Mode p0){
       q24 ta = this.a;
       if (ta.g != p0) {
          ta.g = p0;
          this.m();
          super.invalidateSelf();
       }
       return;
    }
}
