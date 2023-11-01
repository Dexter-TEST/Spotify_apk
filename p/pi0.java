package p.pi0;
import android.view.View;
import java.lang.Object;
import p.wr6;
import android.text.TextPaint;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import p.et0;
import android.graphics.Color;
import android.animation.TimeInterpolator;
import p.je;
import java.lang.CharSequence;
import p.wh7;
import p.eh7;
import p.c27;
import p.a27;
import java.lang.Math;
import android.graphics.Typeface;
import android.text.TextUtils$TruncateAt;
import android.text.Layout$Alignment;
import android.text.StaticLayout;
import java.lang.Throwable;
import java.lang.String;
import android.util.Log;
import java.lang.Class;
import android.text.Layout;
import android.graphics.Canvas;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.view.Gravity;
import android.graphics.Bitmap;
import p.dh7;
import p.y17;
import android.content.Context;
import p.sb0;
import p.u44;
import p.rb0;
import p.ty0;
import p.g54;

public final class pi0	// class@002266 from classes.dex
{
    public sb0 A;
    public sb0 B;
    public CharSequence C;
    public CharSequence D;
    public boolean E;
    public boolean F;
    public Bitmap G;
    public float H;
    public float I;
    public int[] J;
    public boolean K;
    public final TextPaint L;
    public final TextPaint M;
    public TimeInterpolator N;
    public TimeInterpolator O;
    public float P;
    public float Q;
    public float R;
    public ColorStateList S;
    public float T;
    public float U;
    public float V;
    public ColorStateList W;
    public float X;
    public float Y;
    public StaticLayout Z;
    public final View a;
    public float a0;
    public boolean b;
    public float b0;
    public float c;
    public float c0;
    public boolean d;
    public float d0;
    public float e;
    public CharSequence e0;
    public float f;
    public int f0;
    public int g;
    public float g0;
    public final Rect h;
    public float h0;
    public final Rect i;
    public int i0;
    public final RectF j;
    public int k;
    public int l;
    public float m;
    public float n;
    public ColorStateList o;
    public ColorStateList p;
    public int q;
    public float r;
    public float s;
    public float t;
    public float u;
    public float v;
    public float w;
    public Typeface x;
    public Typeface y;
    public Typeface z;

    public void pi0(View p0){
       super();
       this.k = 16;
       this.l = 16;
       this.m = 15.00f;
       this.n = 15.00f;
       this.F = true;
       this.f0 = 1;
       this.g0 = 0;
       this.h0 = 0x3f800000;
       this.i0 = wr6.m;
       this.a = p0;
       TextPaint textPaint = new TextPaint(129);
       this.L = textPaint;
       this.M = new TextPaint(textPaint);
       this.i = new Rect();
       this.h = new Rect();
       this.j = new RectF();
       this.f = et0.l(0x3f800000, this.e, 0x3f000000, this.e);
    }
    public static int a(int p0,float p1,int p2){
       float f = 0x3f800000 - p1;
       return Color.argb((int)(((float)Color.alpha(p2) * p1) + ((float)Color.alpha(p0) * f)), (int)(((float)Color.red(p2) * p1) + ((float)Color.red(p0) * f)), (int)(((float)Color.green(p2) * p1) + ((float)Color.green(p0) * f)), (int)(((float)Color.blue(p2) * p1) + ((float)Color.blue(p0) * f)));
    }
    public static float g(float p0,float p1,float p2,TimeInterpolator p3){
       if (p3 != null) {
          p2 = p3.getInterpolation(p2);
       }
       return et0.l(p1, p0, p2, p0);
    }
    public final boolean b(CharSequence p0){
       boolean b = true;
       if (eh7.d(this.a) == b) {
       }else {
          b = false;
       }
       if (this.F != null) {
          b27 d = (b)? c27.d: c27.c;
          b = d.i(p0, p0.length());
       }
       return b;
    }
    public final void c(float p0,boolean p1){
       pi0 tn;
       pi0 tx;
       int i3;
       StaticLayout staticLayout;
       if (this.C == null) {
          return;
       }
       float f = (float)this.i.width();
       float f1 = (float)this.h.width();
       int i = 0x3a83126f;
       int i1 = 1;
       int i2 = ((Math.abs((p0 - this.n)) - i) < 0)? 1: 0;
       if (i2) {
          tn = this.n;
          this.H = 0x3f800000;
          tx = this.x;
          if (this.z != tx) {
             this.z = tx;
             i3 = 1;
          }else {
             i3 = 0;
          }
       }else {
          pi0 tm = this.m;
          pi0 ty = this.y;
          if (this.z != ty) {
             this.z = ty;
             i3 = 1;
          }else {
             i3 = 0;
          }
          i = ((Math.abs((p0 - tm)) - i) < 0)? 1: 0;
          this.H = (i)? 0x3f800000: p0 / this.m;
          p0 = this.n / this.m;
          float f2 = f1 * p0;
          f = (p1 || (f - f2) <= 0)? f1: Math.min((f / p0), f1);
          tn = tm;
       }
       if ((0 - f) > 0) {
          i3 = (!(tn - this.I) && (this.K == null && !i3))? 0: 1;
          this.I = tn;
          this.K = false;
       }
       if (this.D == null || i3) {
          tn = this.L;
          tn.setTextSize(this.I);
          tn.setTypeface(this.z);
          p1 = (0x3f800000 - this.H)? true: false;
          tn.setLinearText(p1);
          p1 = this.b(this.C);
          this.E = p1;
          i2 = ((tx = this.f0) > i1 && (!p1 && this.d == null))? 1: 0;
          if (i2) {
             i1 = tx;
          }
          try{
             wr6 owr6 = new wr6(this.C, tn, (int)f);
             owr6.l = TextUtils$TruncateAt.END;
             owr6.k = p1;
             owr6.e = Layout$Alignment.ALIGN_NORMAL;
             owr6.j = false;
             owr6.f = i1;
             owr6.g = this.g0;
             owr6.h = this.h0;
             owr6.i = this.i0;
             staticLayout = owr6.a();
          }catch(p.vr6 e10){
             Log.e("CollapsingTextHelper", e10.getCause().getMessage(), e10);
             staticLayout = null;
          }
          staticLayout.getClass();
          this.Z = staticLayout;
          this.D = staticLayout.getText();
       }
       return;
    }
    public final void d(Canvas p0){
       int i = p0.save();
       if (this.D != null && this.b != null) {
          int i1 = 0;
          int i2 = 1;
          float f = (this.f0 > i2)? (float)this.Z.getLineStart(i1): this.Z.getLineLeft(i1);
          float f1 = (this.v + f) - (this.d0 * 2.00f);
          pi0 tL = this.L;
          tL.setTextSize(this.I);
          pi0 tv = this.v;
          pi0 tw = this.w;
          pi0 tH = this.H;
          if ((0x3f800000 - tH) && this.d == null) {
             p0.scale(tH, tH, tv, tw);
          }
          if (this.f0 <= i2 || (this.E != null || this.d != null)) {
             i2 = 0;
          }
          if (i2 && (this.d == null && (this.f - this.c) <= 0)) {
             i2 = tL.getAlpha();
             p0.translate(f1, tw);
             float f2 = (float)i2;
             tL.setAlpha((int)(this.c0 * f2));
             this.Z.draw(p0);
             tL.setAlpha((int)(this.b0 * f2));
             tw = this.e0;
             f1 = (float)this.Z.getLineBaseline(i1);
             p0.drawText(tw, 0, tw.length(), 0, f1, tL);
             if (this.d == null) {
                String str = this.e0.toString().trim();
                if (str.endsWith("\x85")) {
                   str = str.substring(i1, (str.length() - 1));
                }
                String str1 = str;
                tL.setAlpha(i2);
                p0.drawText(str1, 0, Math.min(this.Z.getLineEnd(i1), str1.length()), 0, f1, tL);
             }
          }else {
             p0.translate(tv, tw);
             this.Z.draw(p0);
          }
          p0.restoreToCount(i);
       }
       return;
    }
    public final float e(){
       pi0 tM = this.M;
       tM.setTextSize(this.n);
       tM.setTypeface(this.x);
       tM.setLetterSpacing(this.X);
       return (- tM.ascent());
    }
    public final int f(ColorStateList p0){
       pi0 tJ;
       if (p0 == null) {
          return 0;
       }
       if ((tJ = this.J) != null) {
          return p0.getColorForState(tJ, 0);
       }
       return p0.getDefaultColor();
    }
    public final void h(){
       boolean b;
       pi0 ti = this.i;
       if (ti.width() > 0 && ti.height() > 0) {
          ti = this.h;
          if (ti.width() > 0 && ti.height() > 0) {
             b = true;
          label_001f :
             this.b = b;
             return;
          }
       }
       b = false;
       goto label_001f ;
    }
    public final void i(boolean p0){
       pi0 z;
       pi0 z1;
       pi0 z2;
       pi0 z3;
       float f3;
       pi0 opi0 = this;
       int b = p0;
       pi0 a = opi0.a;
       if (a.getHeight() > 0 && (a.getWidth() > 0 || b)) {
          pi0 i = opi0.I;
          opi0.c(opi0.n, b);
          pi0 d = opi0.D;
          pi0 l = opi0.L;
          if (d != null && (z = opi0.Z) != null) {
             opi0.e0 = TextUtils.ellipsize(d, l, (float)z.getWidth(), TextUtils$TruncateAt.END);
          }
          int i1 = 0;
          float f = 0;
          if (opi0.e0 != null) {
             TextPaint d1 = new TextPaint(l);
             d1.setLetterSpacing(opi0.X);
             pi0 e0 = opi0.e0;
             opi0.a0 = d1.measureText(e0, i1, e0.length());
          }else {
             opi0.a0 = f;
          }
          int absoluteGrav = Gravity.getAbsoluteGravity(opi0.l, opi0.E);
          int i2 = absoluteGrav & 0x70;
          pi0 i3 = opi0.i;
          int i4 = 80;
          if (i2 != 48) {
             opi0.s = (i2 != i4)? (float)i3.centerY() - ((l.descent() - l.ascent()) / 2.00f): l.ascent() + (float)i3.bottom;
          }else {
             opi0.s = (float)i3.top;
          }
          i2 = 0x800007;
          if ((absoluteGrav = absoluteGrav & i2) != 1) {
             opi0.u = (absoluteGrav != 5)? (float)i3.left: (float)i3.right - opi0.a0;
          }else {
             opi0.u = (float)i3.centerX() - (opi0.a0 / 2.00f);
          }
          opi0.c(opi0.m, b);
          float f1 = ((z1 = opi0.Z) != null)? (float)z1.getHeight(): 0;
          absoluteGrav = ((d = opi0.Z) != null)? d.getLineCount(): 0;
          opi0.q = absoluteGrav;
          float f2 = ((d = opi0.D) != null)? l.measureText(d, i1, d.length()): 0;
          if ((z2 = opi0.Z) != null && opi0.f0 > 1) {
             f2 = (float)z2.getWidth();
          }
          if ((z3 = opi0.Z) != null) {
             f = (opi0.f0 > 1)? (float)z3.getLineStart(i1): z3.getLineLeft(i1);
          }else {
             f = 0;
          }
          opi0.d0 = f;
          int absoluteGrav1 = Gravity.getAbsoluteGravity(opi0.k, opi0.E);
          int i5 = absoluteGrav1 & 0x70;
          z = opi0.h;
          if (i5 != 48) {
             opi0.r = (i5 != i4)? (float)z.centerY() - (f1 / 2.00f): l.descent() + ((float)z.bottom - f1);
          }else {
             opi0.r = (float)z.top;
          }
          if ((b = absoluteGrav1 & i2) != 1) {
             opi0.t = (b != 5)? (float)z.left: (float)z.right - f2;
          }else {
             opi0.t = (float)z.centerX() - (f2 / 2.00f);
          }
          z1 = opi0.G;
          Bitmap uBitmap = null;
          if (z1 != null) {
             z1.recycle();
             opi0.G = uBitmap;
          }
          opi0.o(i);
          z1 = opi0.c;
          z3 = opi0.j;
          if (opi0.d != null) {
             if ((z1 - opi0.f) < 0) {
                i3 = z;
             }
             z3.set(i3);
          }else {
             z3.left = pi0.g((float)z.left, (float)i3.left, z1, opi0.N);
             z3.top = pi0.g(opi0.r, opi0.s, z1, opi0.N);
             z3.right = pi0.g((float)z.right, (float)i3.right, z1, opi0.N);
             z3.bottom = pi0.g((float)z.bottom, (float)i3.bottom, z1, opi0.N);
          }
          if (opi0.d != null) {
             if ((z1 - opi0.f) < 0) {
                opi0.v = opi0.t;
                opi0.w = opi0.r;
                opi0.o(opi0.m);
                f3 = 0;
             }else {
                opi0.v = opi0.u;
                opi0.w = opi0.s - (float)Math.max(0, opi0.g);
                opi0.o(opi0.n);
                f3 = 0x3f800000;
             }
          }else {
             opi0.v = pi0.g(opi0.t, opi0.u, z1, opi0.N);
             opi0.w = pi0.g(opi0.r, opi0.s, z1, opi0.N);
             opi0.o(pi0.g(opi0.m, opi0.n, z1, opi0.O));
             f3 = z1;
          }
          j02 b1 = je.b;
          opi0.b0 = 0x3f800000 - pi0.g(0, 0x3f800000, (0x3f800000 - z1), b1);
          dh7.k(a);
          opi0.c0 = pi0.g(0x3f800000, 0, z1, b1);
          dh7.k(a);
          z3 = opi0.p;
          i3 = opi0.o;
          if (z3 != i3) {
             l.setColor(pi0.a(opi0.f(i3), f3, opi0.f(opi0.p)));
          }else {
             l.setColor(opi0.f(z3));
          }
          i = opi0.X;
          z3 = opi0.Y;
          if (z3 - i) {
             l.setLetterSpacing(pi0.g(z3, i, z1, b1));
          }else {
             l.setLetterSpacing(i);
          }
          l.setShadowLayer(pi0.g(opi0.T, opi0.P, z1, uBitmap), pi0.g(opi0.U, opi0.Q, z1, uBitmap), pi0.g(opi0.V, opi0.R, z1, uBitmap), pi0.a(opi0.f(opi0.W), z1, opi0.f(opi0.S)));
          if (opi0.d != null) {
             int alpha = l.getAlpha();
             d = opi0.f;
             if ((v7 = z1 - d) <= 0) {
                z3 = opi0.e;
                if ((z1 - z3) < 0) {
                label_0296 :
                   f = 0x3f800000;
                }else if((d - z1) > 0){
                label_0290 :
                   f = 0;
                }else {
                   f = (((z1 - z3) / (d - z3)) * 0xbf800000) + 0x3f800000;
                }
             }else if(z3 < 0){
                goto label_0290 ;
             }else if((0x3f800000 - z1) > 0){
                goto label_0296 ;
             }else {
                f = (((z1 - d) / (0x3f800000 - d)) * 0x3f800000) + 0;
             }
             l.setAlpha((int)(f * (float)alpha));
          }
          dh7.k(a);
       }
       return;
    }
    public final void j(int p0){
       y17 j;
       pi0 tB;
       pi0 ta = this.a;
       y17 oy17 = new y17(ta.getContext(), p0);
       if ((j = oy17.j) != null) {
          this.p = j;
       }
       j = oy17.k;
       if (0 - j) {
          this.n = j;
       }
       if ((j = oy17.a) != null) {
          this.S = j;
       }
       this.Q = oy17.e;
       this.R = oy17.f;
       this.P = oy17.g;
       this.X = oy17.i;
       if ((tB = this.B) != null) {
          tB.o = true;
       }
       oy17.a();
       this.B = new sb0(new u44(16, this), oy17.n);
       oy17.c(ta.getContext(), this.B);
       this.i(false);
       return;
    }
    public final void k(ColorStateList p0){
       if (this.p != p0) {
          this.p = p0;
          this.i(false);
       }
       return;
    }
    public final void l(int p0){
       if (this.l != p0) {
          this.l = p0;
          this.i(false);
       }
       return;
    }
    public final void m(int p0){
       y17 j;
       pi0 tA;
       pi0 ta = this.a;
       y17 oy17 = new y17(ta.getContext(), p0);
       if ((j = oy17.j) != null) {
          this.o = j;
       }
       j = oy17.k;
       if (0 - j) {
          this.m = j;
       }
       if ((j = oy17.a) != null) {
          this.W = j;
       }
       this.U = oy17.e;
       this.V = oy17.f;
       this.T = oy17.g;
       this.Y = oy17.i;
       if ((tA = this.A) != null) {
          tA.o = true;
       }
       oy17.a();
       this.A = new sb0(new g54(this), oy17.n);
       oy17.c(ta.getContext(), this.A);
       this.i(false);
       return;
    }
    public final void n(float p0){
       float f1;
       float f = 0;
       if ((p0 - f) < 0) {
          p0 = 0;
       }else if((0x3f800000 - p0) > 0){
          p0 = 0x3f800000;
       }
       if (this.c - p0) {
          this.c = p0;
          pi0 tj = this.j;
          pi0 ti = this.i;
          pi0 th = this.h;
          if (this.d != null) {
             if ((p0 - this.f) < 0) {
                ti = th;
             }
             tj.set(ti);
          }else {
             tj.left = pi0.g((float)th.left, (float)ti.left, p0, this.N);
             tj.top = pi0.g(this.r, this.s, p0, this.N);
             tj.right = pi0.g((float)th.right, (float)ti.right, p0, this.N);
             tj.bottom = pi0.g((float)th.bottom, (float)ti.bottom, p0, this.N);
          }
          if (this.d != null) {
             if ((p0 - this.f) < 0) {
                this.v = this.t;
                this.w = this.r;
                this.o(this.m);
                f1 = 0;
             }else {
                this.v = this.u;
                this.w = this.s - (float)Math.max(0, this.g);
                this.o(this.n);
                f1 = 0x3f800000;
             }
          }else {
             this.v = pi0.g(this.t, this.u, p0, this.N);
             this.w = pi0.g(this.r, this.s, p0, this.N);
             this.o(pi0.g(this.m, this.n, p0, this.O));
             f1 = p0;
          }
          j02 b = je.b;
          this.b0 = 0x3f800000 - pi0.g(f, 0x3f800000, (0x3f800000 - p0), b);
          tj = this.a;
          dh7.k(tj);
          this.c0 = pi0.g(0x3f800000, f, p0, b);
          dh7.k(tj);
          th = this.p;
          pi0 to = this.o;
          pi0 tL = this.L;
          if (th != to) {
             tL.setColor(pi0.a(this.f(to), f1, this.f(this.p)));
          }else {
             tL.setColor(this.f(th));
          }
          pi0 tX = this.X;
          th = this.Y;
          if (th - tX) {
             tL.setLetterSpacing(pi0.g(th, tX, p0, b));
          }else {
             tL.setLetterSpacing(tX);
          }
          tL.setShadowLayer(pi0.g(this.T, this.P, p0, null), pi0.g(this.U, this.Q, p0, null), pi0.g(this.V, this.R, p0, null), pi0.a(this.f(this.W), p0, this.f(this.S)));
          if (this.d != null) {
             int alpha = tL.getAlpha();
             ti = this.f;
             if ((v5 = p0 - ti) <= 0) {
                th = this.e;
                if ((p0 - th) < 0) {
                label_0161 :
                   f = 0x3f800000;
                }else if((ti - p0) > 0){
                   f = (((p0 - th) / (ti - th)) * 0xbf800000) + 0x3f800000;
                }
             }else if(th < 0){
                if ((0x3f800000 - p0) > 0) {
                   goto label_0161 ;
                }else {
                   f = f + (((p0 - ti) / (0x3f800000 - ti)) * 0x3f800000);
                }
             }
             tL.setAlpha((int)(f * (float)alpha));
          }
          dh7.k(tj);
       }
       return;
    }
    public final void o(float p0){
       this.c(p0, false);
       dh7.k(this.a);
    }
    public final boolean p(int[] p0){
       this.J = p0;
       pi0 tp = ((tp = this.p) != null && (tp.isStateful() || ((tp = this.o) != null && tp.isStateful())))? 1: 0;
       if (tp) {
          this.i(false);
          return true;
       }else {
          return false;
       }
    }
}
