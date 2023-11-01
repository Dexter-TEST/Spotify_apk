package p.y17;
import android.content.Context;
import java.lang.Object;
import p.lv1;
import android.content.res.TypedArray;
import android.content.res.ColorStateList;
import p.ry7;
import java.lang.String;
import android.graphics.Typeface;
import p.xw5;
import p.ty0;
import p.w17;
import p.uw5;
import android.util.TypedValue;
import android.text.TextPaint;
import android.graphics.Paint;
import p.x17;

public final class y17	// class@002d30 from classes.dex
{
    public final ColorStateList a;
    public final String b;
    public final int c;
    public final int d;
    public final float e;
    public final float f;
    public final float g;
    public final boolean h;
    public final float i;
    public ColorStateList j;
    public float k;
    public final int l;
    public boolean m;
    public Typeface n;

    public void y17(Context p0,int p1){
       super();
       this.m = false;
       TypedArray typedArray = p0.obtainStyledAttributes(p1, lv1.I);
       this.k = typedArray.getDimension(false, 0);
       this.j = ry7.x(p0, typedArray, 3);
       ry7.x(p0, typedArray, 4);
       ry7.x(p0, typedArray, 5);
       this.c = typedArray.getInt(2, false);
       this.d = typedArray.getInt(1, 1);
       int i = 12;
       if (typedArray.hasValue(i)) {
       }else {
          i = 10;
       }
       this.l = typedArray.getResourceId(i, false);
       this.b = typedArray.getString(i);
       typedArray.getBoolean(14, false);
       this.a = ry7.x(p0, typedArray, 6);
       this.e = typedArray.getFloat(7, 0);
       this.f = typedArray.getFloat(8, 0);
       this.g = typedArray.getFloat(9, 0);
       typedArray.recycle();
       TypedArray typedArray1 = p0.obtainStyledAttributes(p1, lv1.A);
       this.h = typedArray1.hasValue(false);
       this.i = typedArray1.getFloat(false, 0);
       typedArray1.recycle();
       return;
    }
    public final void a(){
       y17 tb;
       y17 td;
       y17 tc = this.c;
       if (this.n == null && (tb = this.b) != null) {
          this.n = Typeface.create(tb, tc);
       }
       if (this.n == null) {
          if ((td = this.d) != 1) {
             if (td != 2) {
                this.n = (td != 3)? Typeface.DEFAULT: Typeface.MONOSPACE;
             }else {
                this.n = Typeface.SERIF;
             }
          }else {
             this.n = Typeface.SANS_SERIF;
          }
          this.n = Typeface.create(this.n, tc);
       }
       return;
    }
    public final Typeface b(Context p0){
       if (this.m != null) {
          return this.n;
       }
       try{
          if (!p0.isRestricted()) {
             Typeface typeface = xw5.c(p0, this.l);
             this.n = typeface;
             if (typeface != null) {
                this.n = Typeface.create(typeface, this.c);
             }
          }
          this.a();
          this.m = true;
          return this.n;
       }catch(java.lang.UnsupportedOperationException e0){
       }catch(android.content.res.Resources$NotFoundException e0){
       }catch(java.lang.Exception e0){
       }
    }
    public final void c(Context p0,ty0 p1){
       y17 tl;
       if (this.d(p0)) {
          this.b(p0);
       }else {
          this.a();
       }
       if ((tl = this.l) == null) {
          this.m = true;
       }
       if (this.m != null) {
          p1.s(this.n, true);
          return;
       }else {
          try{
             w17 ow17 = new w17(this, p1);
             if (p0.isRestricted()) {
                ow17.c(-4);
             }else {
                xw5.d(p0, tl, new TypedValue(), 0, ow17, false, false);
             }
          }catch(android.content.res.Resources$NotFoundException e0){
             this.m = e0;
             p1.r(e0);
          }catch(java.lang.Exception e0){
             this.m = e0;
             p1.r(-3);
          }
          return;
       }
    }
    public final boolean d(Context p0){
       y17 tl;
       Typeface typeface = ((tl = this.l) != null && !p0.isRestricted())? xw5.d(p0, tl, new TypedValue(), 0, null, false, true): null;
       boolean b = (typeface != null)? true: false;
       return b;
    }
    public final void e(Context p0,TextPaint p1,ty0 p2){
       y17 tj;
       this.f(p0, p1, p2);
       int colorForStat = ((tj = this.j) != null)? tj.getColorForState(p1.drawableState, tj.getDefaultColor()): 0xff000000;
       p1.setColor(colorForStat);
       colorForStat = ((tj = this.a) != null)? tj.getColorForState(p1.drawableState, tj.getDefaultColor()): 0;
       p1.setShadowLayer(this.g, this.e, this.f, colorForStat);
       return;
    }
    public final void f(Context p0,TextPaint p1,ty0 p2){
       if (this.d(p0)) {
          this.g(p1, this.b(p0));
       }else {
          this.a();
          this.g(p1, this.n);
          this.c(p0, new x17(this, p1, p2));
       }
       return;
    }
    public final void g(TextPaint p0,Typeface p1){
       p0.setTypeface(p1);
       int i = (~ p1.getStyle()) & this.c;
       boolean b = ((i & 0x01))? true: false;
       p0.setFakeBoldText(b);
       float f = ((i & 0x02))? -0.25f: 0;
       p0.setTextSkewX(f);
       p0.setTextSize(this.k);
       if (this.h != null) {
          p0.setLetterSpacing(this.i);
       }
       return;
    }
}
