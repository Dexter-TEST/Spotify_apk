package p.ie1;
import android.graphics.drawable.Drawable$Callback;
import android.graphics.drawable.Drawable;
import p.hh3;
import p.qe4;
import java.lang.Class;
import java.lang.String;
import p.ns5;
import java.lang.Object;
import p.dy1;
import android.content.Context;
import p.co5;
import android.util.SparseArray;
import android.content.res.Resources;
import java.lang.Integer;
import p.xz1;
import p.ox7;
import android.widget.TextView;
import p.w05;
import p.v27;
import p.gv4;
import java.lang.Number;
import java.lang.Math;
import android.graphics.Canvas;
import p.gb3;
import p.ib3;
import p.eb3;
import android.graphics.Rect;
import java.lang.Runnable;
import android.graphics.ColorFilter;

public final class ie1 extends Drawable implements Drawable$Callback	// class@001976 from classes.dex
{
    public final SparseArray a;
    public final xz1 b;
    public int c;
    public int t;
    public final boolean v;
    public static final dy1 w;
    public static final hh3[] x;

    static {
       hh3[] ohh3Array = new hh3[]{new qe4(ie1.class, "spacing", "getSpacing\(\)I")};
       ns5.a.getClass();
       ie1.x = ohh3Array;
       ie1.w = new dy1(24, 0);
    }
    public void ie1(Context p0){
       co5.o(p0, "context");
       super();
       this.a = new SparseArray();
       this.b = new xz1(Integer.valueOf(p0.getResources().getDimensionPixelSize(R.dimen.drawable_group_spacing)), this, 1);
       this.v = ox7.x(p0);
    }
    public static final Drawable a(Context p0,TextView p1,w05 p2){
       Drawable uDrawable;
       Drawable uDrawable1;
       ie1.w.getClass();
       co5.o(p0, "context");
       co5.o(p1, "textView");
       co5.o(p2, "supplier");
       Drawable[] uDrawableArr = v27.a(p1);
       co5.l(uDrawableArr, "getCompoundDrawablesRelative\(textView\)");
       int i = 0;
       object oobject = uDrawableArr[i];
       if (oobject instanceof ie1) {
       }else {
          oobject = new ie1(p0);
       }
       if ((uDrawable = oobject.a.get(R.id.offlined_available_label)) == null) {
          uDrawable = p2.get();
          uDrawable.setBounds(i, i, uDrawable.getIntrinsicWidth(), uDrawable.getIntrinsicHeight());
          ie1 a = oobject.a;
          if ((uDrawable1 = a.get(R.id.offlined_available_label)) != null) {
             a.remove(R.id.offlined_available_label);
             uDrawable1.setCallback(null);
             oobject.d();
          }
          a.append(R.id.offlined_available_label, uDrawable);
          uDrawable.setCallback(oobject);
          oobject.d();
       }
       dy1.d(p1, oobject);
       return uDrawable;
    }
    public static final void c(TextView p0){
       Drawable uDrawable;
       ie1.w.getClass();
       co5.o(p0, "textView");
       Drawable[] uDrawableArr = v27.a(p0);
       co5.l(uDrawableArr, "getCompoundDrawablesRelative\(textView\)");
       object oobject = uDrawableArr[0];
       Drawable$Callback uCallback = null;
       if (oobject instanceof ie1) {
          ie1 a = oobject.a;
          if ((uDrawable = a.get(R.id.offlined_available_label)) != null) {
             a.remove(R.id.offlined_available_label);
             uDrawable.setCallback(uCallback);
             oobject.d();
          }
          if (oobject.a.size()) {
             uCallback = oobject;
          }
       }
       dy1.d(p0, uCallback);
       return;
    }
    public final int b(){
       ie1 tb = this.b;
       tb.getClass();
       co5.o(ie1.x[0], "property");
       return tb.a.intValue();
    }
    public final void d(){
       this.t = 0;
       this.c = 0;
       ie1 ta = this.a;
       int i = ta.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          ta.keyAt(i1);
          Drawable uDrawable = ta.valueAt(i1);
          this.t = Math.max(this.t, uDrawable.getIntrinsicHeight());
          int i2 = uDrawable.getIntrinsicWidth() + this.c;
          this.c = i2;
       }
       if (this.b() > 0) {
          i = (ta.size())? 1: 0;
          if (i) {
             this.c = ((ta.size() - 1) * this.b()) + this.c;
          }
       }
       this.setBounds(0, 0, this.c, this.t);
       this.invalidateSelf();
       return;
    }
    public final void draw(Canvas p0){
       gb3 ogb3;
       gb3 c;
       co5.o(p0, "canvas");
       ie1 ta = this.a;
       int i = 0;
       if (this.v != null) {
          int i1 = -1;
          ogb3 = new gb3((ta.size() + i1), i, i1);
       }else {
          ogb3 = eb3.J(i, ta.size());
       }
       gb3 a = ogb3.a;
       gb3 b = ogb3.b;
       if ((c = ogb3.c) > null && (a <= b || (c < null && b <= a))) {
          float f = 0;
          while (true) {
             Drawable uDrawable = ta.valueAt(a);
             float f1 = this.getBounds().exactCenterY() - uDrawable.getBounds().exactCenterY();
             p0.translate(f, f1);
             uDrawable.draw(p0);
             int i2 = uDrawable.getIntrinsicWidth() + this.b();
             f = f + (float)i2;
             p0.restoreToCount(p0.save());
             if (a != b) {
                a = a + c;
             }
          }
       }
       return;
    }
    public final int getIntrinsicHeight(){
       return this.t;
    }
    public final int getIntrinsicWidth(){
       return this.c;
    }
    public final int getOpacity(){
       return 0;
    }
    public final void invalidateDrawable(Drawable p0){
       co5.o(p0, "who");
       this.invalidateSelf();
    }
    public final void scheduleDrawable(Drawable p0,Runnable p1,long p2){
       co5.o(p0, "who");
       co5.o(p1, "what");
       this.scheduleSelf(p1, p2);
    }
    public final void setAlpha(int p0){
       ie1 ta = this.a;
       int i = ta.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          ta.keyAt(i1);
          ta.valueAt(i1).setAlpha(p0);
       }
       return;
    }
    public final void setColorFilter(ColorFilter p0){
       ie1 ta = this.a;
       int i = ta.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          ta.keyAt(i1);
          ta.valueAt(i1).setColorFilter(p0);
       }
       return;
    }
    public final void unscheduleDrawable(Drawable p0,Runnable p1){
       co5.o(p0, "who");
       co5.o(p1, "what");
       this.unscheduleSelf(p1);
    }
}
