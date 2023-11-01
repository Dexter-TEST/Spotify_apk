package p.nf;
import android.widget.CompoundButton;
import java.lang.Object;
import android.graphics.drawable.Drawable;
import p.w51;
import p.eb3;
import android.content.res.ColorStateList;
import p.ce1;
import android.graphics.PorterDuff$Mode;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import p.ej4;
import p.p86;
import android.content.res.TypedArray;
import p.wh7;
import p.ln0;
import p.ne1;

public final class nf	// class@001fcd from classes.dex
{
    public final CompoundButton a;
    public ColorStateList b;
    public PorterDuff$Mode c;
    public boolean d;
    public boolean e;
    public boolean f;

    public void nf(CompoundButton p0){
       super();
       this.b = null;
       this.c = null;
       this.d = false;
       this.e = false;
       this.a = p0;
    }
    public final void a(){
       Drawable uDrawable;
       nf ta = this.a;
       if ((uDrawable = w51.u(ta)) != null && (this.d != null && this.e == null)) {
          uDrawable = eb3.L(uDrawable).mutate();
          if (this.d != null) {
             ce1.h(uDrawable, this.b);
          }
          if (this.e != null) {
             ce1.i(uDrawable, this.c);
          }
          if (uDrawable.isStateful()) {
             uDrawable.setState(ta.getDrawableState());
          }
          ta.setButtonDrawable(uDrawable);
       }
       return;
    }
    public final void b(AttributeSet p0,int p1){
       nf ta = this.a;
       int[] p = ej4.P;
       p86 op86 = p86.m(ta.getContext(), p0, p, p1);
       wh7.n(ta, ta.getContext(), p, p0, op86.b, p1);
       int i = 1;
       if (op86.l(i) && (p1 = op86.i(i, 0))) {
          try{
             ta.setButtonDrawable(eb3.m(ta.getContext(), p1));
          label_0037 :
             if (!i && (op86.l(e0) && (i = op86.i(e0, e0)))) {
                ta.setButtonDrawable(eb3.m(ta.getContext(), i));
             }
             i = 2;
             if (op86.l(i)) {
                ln0.c(ta, op86.b(i));
             }
             i = 3;
             if (op86.l(i)) {
                ln0.d(ta, ne1.c(op86.h(i, -1), null));
             }
             op86.o();
             return;
          }catch(android.content.res.Resources$NotFoundException e0){
          }
       label_0036 :
          i = 0;
          goto label_0037 ;
       }else {
          goto label_0036 ;
       }
    }
}
