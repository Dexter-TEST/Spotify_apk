package p.qd1;
import java.lang.Runnable;
import android.graphics.drawable.Drawable;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.lp6;
import p.sp6;
import android.content.res.Resources;
import p.xj0;
import android.util.TypedValue;
import android.content.res.Resources$Theme;
import p.xe7;
import android.content.res.TypedArray;
import p.jl;
import android.graphics.drawable.ColorDrawable;
import p.kg4;
import android.os.SystemClock;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable$Callback;
import android.graphics.Rect;
import p.en6;
import java.lang.Integer;
import android.graphics.ColorFilter;

public final class qd1 extends Drawable implements Runnable	// class@00237a from classes.dex
{
    public final lp6 a;
    public final Drawable b;
    public final int c;
    public final int t;
    public long v;
    public int w;

    public void qd1(Context p0){
       co5.o(p0, "context");
       super();
       int i = -16711936;
       this.c = i;
       this.t = -7829368;
       lp6 olp6 = new lp6(p0, sp6.J, (float)xj0.e0(16.00f, p0.getResources()));
       this.a = olp6;
       int i1 = xj0.e0(16.00f, p0.getResources());
       TypedValue typedValue = new TypedValue();
       if (p0.getTheme().resolveAttribute(R.attr.pasteDownloadIndicatorStyle, typedValue, true)) {
          TypedArray typedArray = p0.obtainStyledAttributes(typedValue.resourceId, xe7.y);
          co5.l(typedArray, "obtainStyledAttributes\(resourceId, attrs\)");
          i1 = typedArray.getDimensionPixelSize(3, i1);
          this.b = typedArray.getDrawable(2);
          this.c = typedArray.getColor(0, i);
          this.t = typedArray.getColor(true, -7829368);
          typedArray.recycle();
       }else {
          jl.d("Is the theme missing?");
          this.b = new ColorDrawable();
          int i2 = 0xff000000;
          this.c = i2;
          this.t = i2;
       }
       olp6.d((float)i1);
       this.w = 1;
       return;
    }
    public final void a(int p0){
       kg4.t(p0, "state");
       if (this.w == p0) {
          return;
       }
       this.w = p0;
       if (p0 == 2) {
          long l = SystemClock.uptimeMillis();
          this.v = l;
          this.scheduleSelf(this, l);
       }else {
          this.unscheduleSelf(this);
       }
       this.invalidateSelf();
       return;
    }
    public final void draw(Canvas p0){
       qd1 tb;
       int i;
       co5.o(p0, "canvas");
       if ((tb = this.b) == null) {
       }else {
          tb.setCallback(this.getCallback());
       }
       qd1 ta = this.a;
       ta.setBounds(this.getBounds());
       if (tb != null) {
          tb.setBounds(this.getBounds());
       }
       if (i = en6.A(this.w)) {
          if (i != 1) {
             if (i == 2) {
                ta.b(this.c);
                ta.draw(p0);
             }
          }else if(tb != null){
             tb.draw(p0);
          }
       }else {
          ta.b(this.t);
          ta.draw(p0);
       }
       return;
    }
    public final int getIntrinsicHeight(){
       return this.a.getIntrinsicHeight();
    }
    public final int getIntrinsicWidth(){
       return this.a.getIntrinsicWidth();
    }
    public final int getOpacity(){
       qd1 tb;
       Integer integer = ((tb = this.b) != null)? Integer.valueOf(tb.getOpacity()): null;
       int i = (this.w == 2 && integer != null)? integer.intValue(): this.a.getOpacity();
       return i;
    }
    public final void onBoundsChange(Rect p0){
       qd1 tb;
       co5.o(p0, "bounds");
       super.onBoundsChange(p0);
       this.a.setBounds(p0);
       if ((tb = this.b) == null) {
       }else {
          tb.setBounds(p0);
       }
       return;
    }
    public final void run(){
       qd1 tb;
       long l = SystemClock.uptimeMillis();
       float f = (float)((l - this.v) % (long)3500) / 3500.00f;
       if ((tb = this.b) == null) {
       }else {
          tb.setLevel((int)(f * (float)0x2710));
       }
       this.invalidateSelf();
       this.scheduleSelf(this, (l + (long)16));
       return;
    }
    public final void setAlpha(int p0){
       qd1 tb;
       this.a.setAlpha(p0);
       if ((tb = this.b) == null) {
       }else {
          tb.setAlpha(p0);
       }
       return;
    }
    public final void setColorFilter(ColorFilter p0){
       qd1 tb;
       this.a.setColorFilter(p0);
       if ((tb = this.b) == null) {
       }else {
          tb.setColorFilter(p0);
       }
       return;
    }
}
