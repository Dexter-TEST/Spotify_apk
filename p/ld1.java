package p.ld1;
import p.or6;
import p.sp6;
import android.content.Context;
import android.util.AttributeSet;
import android.content.res.Resources;
import p.lp6;
import android.content.res.ColorStateList;
import p.n6;
import android.graphics.drawable.Drawable;
import p.os0;
import android.graphics.drawable.LayerDrawable;
import android.content.res.Resources$NotFoundException;
import p.sg;

public abstract class ld1 extends or6	// class@001d2e from classes.dex
{
    public final lp6 t;
    public final LayerDrawable v;

    public void ld1(sp6 p0,Context p1,AttributeSet p2){
       Drawable uDrawable;
       super(p1, p2, 0);
       lp6 olp6 = new lp6(p1, p0, (float)p1.getResources().getDimensionPixelSize(R.dimen.npv_primary_button_icon_size));
       this.t = olp6;
       olp6.c(n6.c(p1, R.color.action_npv));
       if ((uDrawable = os0.b(p1, R.drawable.npv_selected_dot)) == null) {
          throw new Resources$NotFoundException();
       }
       int i = (olp6.getIntrinsicWidth() - uDrawable.getIntrinsicWidth()) / 2;
       Drawable[] uDrawableArr = new Drawable[]{olp6,uDrawable};
       LayerDrawable layerDrawabl = new LayerDrawable(uDrawableArr);
       this.v = layerDrawabl;
       layerDrawabl.setLayerInset(1, i, (olp6.getIntrinsicHeight() + p1.getResources().getDimensionPixelSize(R.dimen.npv_selected_dot_top_margin)), i, 0);
       return;
    }
    public final void a(sp6 p0,boolean p1){
       ld1 tt = this.t;
       tt.a = p0;
       tt.f();
       tt.g();
       tt.invalidateSelf();
       if (p1) {
          tt = this.v;
       }
       super.setImageDrawable(tt);
       return;
    }
}
