package p.o56;
import p.fl3;
import p.a07;
import p.r61;
import p.q77;
import p.p76;
import p.zr5;
import p.kn;
import java.lang.Object;
import java.util.List;
import p.b86;
import p.y76;
import java.lang.String;
import p.co5;
import java.lang.Integer;
import p.ng2;
import java.lang.CharSequence;
import android.widget.TextView;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import p.iq6;
import android.content.Context;
import p.sp6;
import android.content.res.Resources;
import p.xj0;
import android.graphics.drawable.Drawable;
import p.ox7;
import android.widget.ImageView;
import android.net.Uri;
import p.li0;
import p.vk;
import p.l63;
import p.f5;
import android.view.View$OnClickListener;
import java.lang.NullPointerException;
import androidx.recyclerview.widget.RecyclerView;
import p.ap5;

public final class o56 extends fl3	// class@0020b4 from classes.dex
{
    public final r61 v;
    public final q77 w;
    public final ng2 x;
    public final ng2 y;
    public static final a07 z;

    static {
       o56.z = new a07(3);
    }
    public void o56(r61 p0,q77 p1,p76 p2,p76 p3){
       super(o56.z);
       this.v = p0;
       this.w = p1;
       this.x = p2;
       this.y = p3;
    }
    public final void n(zr5 p0,int p1){
       y76 y;
       ViewGroup$LayoutParams layoutParams;
       Context context;
       Drawable uDrawable;
       b86 uob86 = this.t.f.get(p1);
       if (p0 instanceof y76) {
          co5.l(uob86, "searchResult");
          if ((y = p0.y) != null) {
             y.b(Integer.valueOf(p0.d()), uob86);
          }
          p0.A.setText(uob86.d);
          y = p0.B;
          co5.l(y, "subTitle");
          b86 e = uob86.e;
          int i = 0;
          int i1 = (e.length() > 0)? 1: 0;
          i1 = (i1)? 0: 8;
          y.setVisibility(i1);
          y.setText(e);
          if ((layoutParams = y.getLayoutParams()) != null) {
             layoutParams.topMargin = i;
             y.setLayoutParams(layoutParams);
             b86 b = uob86.b;
             float f = Float.NaN;
             float f1 = 32.00f;
             y76 u = p0.u;
             if (b instanceof iq6) {
                context = u.getContext();
                uDrawable = ox7.a(context, sp6.b0, f, (float)xj0.e0(f1, context.getResources()));
             }else {
                context = u.getContext();
                uDrawable = ox7.a(context, sp6.z, f, (float)xj0.e0(f1, context.getResources()));
             }
             b86 f2 = uob86.f;
             if (!f2.length()) {
                i = 1;
             }
             y76 z = p0.z;
             if (i) {
                z.setImageDrawable(uDrawable);
             }else {
                li0 oli0 = p0.v.a(Uri.parse(f2));
                oli0.c(uDrawable);
                oli0.a(uDrawable);
                int i2 = 2;
                li0 b1 = oli0.b;
                if (b instanceof vk) {
                   b1.L = i2;
                   b1.L = 1;
                   oli0.d(p0.w);
                }else {
                   b1.L = i2;
                   b1.L = 1;
                }
                co5.l(z, "icon");
                oli0.b(z);
             }
             u.setOnClickListener(new f5(9, p0, uob86));
          }else {
             throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
          }
       }
       return;
    }
    public final zr5 o(int p0,RecyclerView p1){
       co5.o(p1, "parent");
       Context context = p1.getContext();
       co5.l(context, "parent.context");
       View view = ap5.s(context, R.layout.glue_listtile_2_image, p1, 4);
       co5.l(view, "view");
       y76 context1 = new y76(view, this.v, this.w, this.x, this.y);
       return context;
    }
}
