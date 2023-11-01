package p.bh;
import p.wg;
import android.widget.SeekBar;
import android.widget.ProgressBar;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;
import p.ej4;
import p.p86;
import android.content.res.TypedArray;
import p.wh7;
import android.graphics.drawable.Drawable;
import android.widget.AbsSeekBar;
import android.graphics.drawable.Drawable$Callback;
import p.eh7;
import p.eb3;
import android.graphics.PorterDuff$Mode;
import p.ne1;
import android.content.res.ColorStateList;
import p.ce1;
import android.graphics.Canvas;

public final class bh extends wg	// class@0010c9 from classes.dex
{
    public final SeekBar d;
    public Drawable e;
    public ColorStateList f;
    public PorterDuff$Mode g;
    public boolean h;
    public boolean i;

    public void bh(SeekBar p0){
       super(p0);
       this.f = null;
       this.g = null;
       this.h = false;
       this.i = false;
       this.d = p0;
    }
    public final void a(AttributeSet p0,int p1){
       Drawable uDrawable;
       bh te;
       super.a(p0, R.attr.seekBarStyle);
       bh td = this.d;
       int[] j = ej4.J;
       p86 op86 = p86.m(td.getContext(), p0, j, R.attr.seekBarStyle);
       wh7.n(td, td.getContext(), j, p0, op86.b, R.attr.seekBarStyle);
       if ((uDrawable = op86.f(0)) != null) {
          td.setThumb(uDrawable);
       }
       Drawable uDrawable1 = op86.e(1);
       if ((te = this.e) != null) {
          te.setCallback(null);
       }
       this.e = uDrawable1;
       if (uDrawable1 != null) {
          uDrawable1.setCallback(td);
          eb3.z(uDrawable1, eh7.d(td));
          if (uDrawable1.isStateful()) {
             uDrawable1.setState(td.getDrawableState());
          }
          this.c();
       }
       td.invalidate();
       int i = 3;
       if (op86.l(i)) {
          this.g = ne1.c(op86.h(i, -1), this.g);
          this.i = true;
       }
       i = 2;
       if (op86.l(i)) {
          this.f = op86.b(i);
          this.h = true;
       }
       op86.o();
       this.c();
       return;
    }
    public final void c(){
       bh te;
       if ((te = this.e) != null && (this.h != null && this.i == null)) {
          Drawable uDrawable = eb3.L(te.mutate());
          this.e = uDrawable;
          if (this.h != null) {
             ce1.h(uDrawable, this.f);
          }
          if (this.i != null) {
             ce1.i(this.e, this.g);
          }
          if (this.e.isStateful()) {
             this.e.setState(this.d.getDrawableState());
          }
       }
       return;
    }
    public final void d(Canvas p0){
       if (this.e != null) {
          bh td = this.d;
          int max = td.getMax();
          int i = 1;
          if (max > i) {
             int intrinsicWid = this.e.getIntrinsicWidth();
             int intrinsicHei = this.e.getIntrinsicHeight();
             intrinsicWid = (intrinsicWid >= 0)? intrinsicWid / 2: 1;
             if (intrinsicHei >= 0) {
                i = intrinsicHei / 2;
             }
             this.e.setBounds((- intrinsicWid), (- i), intrinsicWid, i);
             float f = (float)((td.getWidth() - td.getPaddingLeft()) - td.getPaddingRight()) / (float)max;
             intrinsicWid = p0.save();
             p0.translate((float)td.getPaddingLeft(), (float)(td.getHeight() / 2));
             for (int i1 = 0; i1 <= max; i1 = i1 + 1) {
                this.e.draw(p0);
                p0.translate(f, 0);
             }
             p0.restoreToCount(intrinsicWid);
          }
       }
       return;
    }
}
