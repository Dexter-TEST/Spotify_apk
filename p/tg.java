package p.tg;
import android.widget.ImageView;
import java.lang.Object;
import android.graphics.drawable.Drawable;
import p.ne1;
import android.os.Build$VERSION;
import p.e57;
import android.content.res.ColorStateList;
import p.s63;
import android.graphics.PorterDuff$Mode;
import android.view.View;
import p.ng;
import android.util.AttributeSet;
import android.content.Context;
import p.ej4;
import p.p86;
import android.content.res.TypedArray;
import p.wh7;
import p.eb3;

public final class tg	// class@00276b from classes.dex
{
    public final ImageView a;
    public e57 b;
    public e57 c;
    public int d;

    public void tg(ImageView p0){
       super();
       this.d = 0;
       this.a = p0;
    }
    public final void a(){
       Drawable drawable;
       tg tc;
       ColorStateList uColorStateL;
       PorterDuff$Mode mode;
       tg ta = this.a;
       if ((drawable = ta.getDrawable()) != null) {
          ne1.a(drawable);
       }
       if (drawable != null) {
          int sDK_INT = Build$VERSION.SDK_INT;
          boolean b = true;
          boolean b1 = false;
          int i = 21;
          sDK_INT = (sDK_INT > i || sDK_INT != i)? 0: 1;
          if (sDK_INT) {
             if (this.c == null) {
                this.c = new e57();
             }
             tc = this.c;
             tc.c = null;
             tc.b = b1;
             tc.d = null;
             tc.a = b1;
             if ((uColorStateL = s63.a(ta)) != null) {
                tc.b = b;
                tc.c = uColorStateL;
             }
             if ((mode = s63.b(ta)) != null) {
                tc.a = b;
                tc.d = mode;
             }
             if (tc.b == null && tc.a == null) {
                b = false;
             }else {
                ng.e(drawable, tc, ta.getDrawableState());
             }
             if (b) {
                return;
             }
          }
          if ((tc = this.b) != null) {
             ng.e(drawable, tc, ta.getDrawableState());
          }
       }
       return;
    }
    public final void b(AttributeSet p0,int p1){
       int i1;
       tg ta = this.a;
       int[] i = ej4.I;
       p86 op86 = p86.m(ta.getContext(), p0, i, p1);
       wh7.n(ta, ta.getContext(), i, p0, op86.b, p1);
       Drawable drawable = ta.getDrawable();
       p1 = -1;
       if (drawable == null && ((i1 = op86.i(1, p1)) != p1 && (drawable = eb3.m(ta.getContext(), i1)) != null)) {
          ta.setImageDrawable(drawable);
       }
       if (drawable != null) {
          ne1.a(drawable);
       }
       int i2 = 2;
       if (op86.l(i2)) {
          s63.c(ta, op86.b(i2));
          if (Build$VERSION.SDK_INT == 21 && ((drawable = ta.getDrawable()) != null && s63.a(ta) != null)) {
             if (drawable.isStateful()) {
                drawable.setState(ta.getDrawableState());
             }
             ta.setImageDrawable(drawable);
          }
       }
       i2 = 3;
       if (op86.l(i2)) {
          s63.d(ta, ne1.c(op86.h(i2, p1), null));
          if (Build$VERSION.SDK_INT == 21 && ((drawable = ta.getDrawable()) != null && s63.a(ta) != null)) {
             if (drawable.isStateful()) {
                drawable.setState(ta.getDrawableState());
             }
             ta.setImageDrawable(drawable);
          }
       }
       op86.o();
       return;
    }
    public final void c(int p0){
       Drawable uDrawable;
       tg ta = this.a;
       if (p0) {
          if ((uDrawable = eb3.m(ta.getContext(), p0)) != null) {
             ne1.a(uDrawable);
          }
          ta.setImageDrawable(uDrawable);
       }else {
          ta.setImageDrawable(null);
       }
       this.a();
       return;
    }
}
