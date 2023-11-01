package p.wt6;
import p.zk2;
import android.view.View;
import java.lang.Object;
import android.widget.TextView;
import android.widget.ProgressBar;
import p.eo5;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.content.res.Resources;
import p.xj0;
import android.graphics.drawable.ClipDrawable;
import android.content.Context;
import p.n6;
import android.graphics.drawable.LayerDrawable;
import android.content.res.Resources$Theme;
import p.xw5;
import p.v27;

public final class wt6 implements zk2	// class@002ba4 from classes.dex
{
    public final View a;
    public final TextView b;
    public final TextView c;
    public final ProgressBar t;
    public final TextView v;
    public final TextView w;
    public final TextView x;

    public void wt6(View p0){
       super();
       this.a = p0;
       this.b = p0.findViewById(R.id.storage_title);
       this.c = p0.findViewById(R.id.storage_total);
       this.t = p0.findViewById(R.id.storage_progress);
       this.v = p0.findViewById(R.id.storage_others);
       this.w = p0.findViewById(R.id.storage_app);
       this.x = p0.findViewById(R.id.storage_free);
       eo5.P(this);
    }
    public final Drawable a(int p0,boolean p1){
       GradientDrawable gradientDraw = new GradientDrawable();
       gradientDraw.setColor(p0);
       gradientDraw.setCornerRadius((float)xj0.e0(4.00f, this.a.getResources()));
       if (p1) {
          gradientDraw = new ClipDrawable(gradientDraw, 0x800003, 1);
       }
       return gradientDraw;
    }
    public final View getView(){
       return this.a;
    }
    public final void i(int p0){
       wt6 ta = this.a;
       int i = n6.b(ta.getContext(), R.color.green_light);
       p0 = n6.b(ta.getContext(), p0);
       Drawable[] uDrawableArr = new Drawable[]{this.a(xw5.b(ta.getResources(), R.color.gray_30, null), false),this.a(i, true),this.a(p0, true)};
       LayerDrawable layerDrawabl = new LayerDrawable(uDrawableArr);
       layerDrawabl.setId(false, 0x1020000);
       layerDrawabl.setId(true, 0x102000f);
       layerDrawabl.setId(2, 0x102000d);
       this.t.setProgressDrawable(layerDrawabl);
       GradientDrawable gradientDraw = new GradientDrawable();
       gradientDraw.setShape(true);
       gradientDraw.setColor(p0);
       gradientDraw.setSize(xj0.e0(12.00f, ta.getResources()), xj0.e0(12.00f, ta.getResources()));
       v27.g(this.v, gradientDraw, null, null, null);
       GradientDrawable gradientDraw1 = new GradientDrawable();
       gradientDraw1.setShape(true);
       gradientDraw1.setColor(i);
       gradientDraw1.setSize(xj0.e0(12.00f, ta.getResources()), xj0.e0(12.00f, ta.getResources()));
       v27.g(this.w, gradientDraw1, null, null, null);
    }
}
