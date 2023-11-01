package com.spotify.allboarding.uiusecases.contentstack.ContentStackView;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import p.co5;
import android.content.res.Resources;
import java.util.LinkedHashMap;
import p.ll1;
import p.u44;
import android.graphics.Paint;
import p.n6;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Xfermode;
import android.graphics.RectF;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Iterable;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import p.gs0;
import p.en6;
import p.cd2;
import p.r61;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.List;
import p.dj0;
import android.net.Uri;
import p.li0;
import p.hi0;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import io.reactivex.rxjava3.core.Single;
import p.s9;
import p.hs0;
import p.ir0;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Math;

public final class ContentStackView extends View	// class@000534 from classes.dex
{
    public final RectF A;
    public final Paint B;
    public final Paint C;
    public final Paint D;
    public final Paint E;
    public final Paint F;
    public final LinkedHashMap G;
    public List H;
    public final u44 I;
    public final int a;
    public final float b;
    public final float c;
    public final int t;
    public final float v;
    public final float w;
    public final int x;
    public final float y;
    public final RectF z;

    public void ContentStackView(Context p0,AttributeSet p1){
       co5.o(p0, "context");
       super(p0, p1, 0);
       this.a = p0.getResources().getDimensionPixelSize(R.dimen.padding);
       this.b = (float)p0.getResources().getDimensionPixelSize(R.dimen.corner_radius);
       this.c = (float)p0.getResources().getDimensionPixelSize(R.dimen.inner_corner_radius);
       int dimensionPix = p0.getResources().getDimensionPixelSize(R.dimen.circle_diameter);
       this.t = dimensionPix;
       float f = (float)p0.getResources().getDimensionPixelSize(R.dimen.border_size) * 2.00f;
       float f1 = (float)dimensionPix - f;
       this.v = f1;
       this.w = f1 / 2.00f;
       dimensionPix = p0.getResources().getDimensionPixelSize(R.dimen.square_size);
       this.x = dimensionPix;
       float f2 = (float)dimensionPix;
       f = f2 - f;
       this.y = f;
       this.G = new LinkedHashMap();
       this.H = ll1.a;
       this.I = new u44(24);
       this.setLayerType(1, null);
       Paint paint = new Paint(7);
       this.B = paint;
       Paint paint1 = new Paint(1);
       this.C = paint1;
       paint1.setColor(n6.b(p0, R.color.content_stack_empty));
       Paint paint2 = new Paint(1);
       this.D = paint2;
       paint2.setColor(-1);
       paint2 = new Paint(1);
       this.E = paint2;
       paint2.setXfermode(new PorterDuffXfermode(PorterDuff$Mode.DST_OUT));
       paint2 = new Paint(paint);
       this.F = paint2;
       paint2.setXfermode(new PorterDuffXfermode(PorterDuff$Mode.SRC_IN));
       RectF rectF = new RectF(0, 0, f2, f2);
       this.z = rectF;
       rectF.offset(((float)(- dimensionPix) / 2.00f), ((float)(- dimensionPix) / 2.00f));
       rectF = new RectF(0, 0, f, f);
       this.A = rectF;
       rectF.offset(((- f) / 2.00f), ((- f) / 2.00f));
    }
    public final void a(){
       this.I.t();
       Iterator iterator = this.G.values().iterator();
       while (iterator.hasNext()) {
          iterator.next().recycle();
       }
       return;
    }
    public final void b(Canvas p0,gs0 p1,float p2,float p3){
       p0.save();
       p0.translate(p2, p3);
       Bitmap uBitmap = this.G.get(p1);
       int i = en6.A(p1.b);
       ContentStackView tB = this.B;
       ContentStackView tC = this.C;
       ContentStackView tE = this.E;
       if (i) {
          if (i == 1) {
             p0.rotate(10.00f);
             p0.drawRoundRect(this.z, this.b, this.b, tE);
             if (uBitmap != null) {
                p0.drawBitmap(uBitmap, ((float)(- uBitmap.getWidth()) / 2.00f), ((float)(- uBitmap.getHeight()) / 2.00f), tB);
             }else {
                p0.drawRoundRect(this.A, this.c, this.c, tC);
             }
          }
       }else {
          p0.drawCircle(0, 0, ((float)this.t / 2.00f), tE);
          if (uBitmap != null) {
             p0.drawBitmap(uBitmap, ((float)(- uBitmap.getWidth()) / 2.00f), ((float)(- uBitmap.getHeight()) / 2.00f), tB);
          }else {
             p0.drawCircle(0, 0, this.w, tC);
          }
       }
       p0.restore();
       return;
    }
    public final int c(gs0 p0){
       int i;
       ContentStackView tx;
       if (i = en6.A(p0.b)) {
          if (i == 1) {
             tx = this.x;
          }else {
             throw new cd2(10);
          }
       }else {
          tx = this.t;
       }
       return tx;
    }
    public final void d(r61 p0,Scheduler p1,List p2){
       co5.o(p2, "elements");
       ContentStackView tI = this.I;
       tI.t();
       this.H = dj0.y0(p2, 5);
       this.invalidate();
       this.requestLayout();
       Iterator iterator = this.H.iterator();
       while (iterator.hasNext()) {
          gs0 ogs0 = iterator.next();
          li0 oli0 = p0.a(Uri.parse(ogs0.a));
          oli0.f = false;
          Single single = Single.create(new hi0(oli0));
          co5.l(single, "override fun getBitmap\(\)…eRequest\)\n        }\n    }");
          Disposable uDisposable = single.observeOn(p1).subscribeOn(p1).subscribe(new s9(this, 1, ogs0), new hs0(false, ogs0));
          co5.l(uDisposable, "fun render\(\n        imag…        \)\n        }\n    }");
          tI.s(uDisposable);
       }
       return;
    }
    public final void onDraw(Canvas p0){
       co5.o(p0, "canvas");
       super.onDraw(p0);
       int i = 1;
       if ((this.H.isEmpty() ^ i)) {
          float f = (float)this.getHeight() / 2.00f;
          gs0 ogs0 = dj0.k0(this.H);
          float f1 = ((float)this.c(ogs0) / 2.00f) + (float)this.a;
          this.b(p0, ogs0, f1, f);
          ContentStackView tH = this.H;
          Iterator iterator = tH.subList(i, tH.size()).iterator();
          while (iterator.hasNext()) {
             gs0 ogs01 = iterator.next();
             float f2 = (float)this.c(ogs01) * 0x3f333333;
             f1 = f1 + f2;
             this.b(p0, ogs01, f1, f);
          }
       }
       return;
    }
    public final void onMeasure(int p0,int p1){
       super.onMeasure(p0, p1);
       ContentStackView ta = this.a;
       int i = (ta * 2) + Math.max(this.x, this.t);
       int i1 = 1;
       if (this.H.size() == i1) {
          p0 = this.c(dj0.k0(this.H));
       }else {
          int i2 = 0;
          if (this.H.size() > i1) {
             ContentStackView tH = this.H;
             Iterator iterator = tH.subList(i1, tH.size()).iterator();
             while (iterator.hasNext()) {
                float f = (float)this.c(iterator.next()) * 0x3f333333;
                i2 = i2 + (int)f;
             }
             iterator = this.c(dj0.k0(this.H)) + i2;
          }else {
             p0 = 0;
          }
       }
       this.setMeasuredDimension(((ta * 2) + p0), i);
       return;
    }
}
