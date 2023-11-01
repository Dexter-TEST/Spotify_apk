package p.a06;
import p.xz5;
import p.sz5;
import p.o85;
import android.view.View;
import android.widget.TextView;
import p.do5;
import p.mj5;
import p.oj5;
import java.util.Collection;
import java.lang.Object;
import java.util.Collections;
import android.content.Context;
import p.uw5;
import android.util.TypedValue;
import android.content.res.Resources$Theme;
import p.n6;
import java.lang.CharSequence;
import android.text.method.TransformationMethod;

public class a06 extends sz5 implements xz5	// class@000eeb from classes.dex
{
    public final TextView c;
    public final TextView t;

    public void a06(o85 p0){
       super(p0);
       TextView textView = p0.findViewById(0x1020014);
       this.c = textView;
       TextView textView1 = p0.findViewById(0x1020015);
       this.t = textView1;
       if (!p0.isInEditMode()) {
          TextView[] textViewArra = new TextView[]{textView};
          do5.y0(textViewArra);
          textViewArra = new TextView[]{textView1};
          do5.z0(textViewArra);
          do5.x0(p0);
       }
       mj5 omj5 = oj5.c(p0.findViewById(R.id.row_view));
       View[] viewArray = new View[]{textView,textView1};
       Collections.addAll(omj5.c, viewArray);
       omj5.a();
       return;
    }
    public final void a(boolean p0){
       Context context = this.a.getContext();
       int i = (p0)? 0x7f0304e0: 0x7f0304e4;
       int i1 = (p0)? 0x7f03009f: 0x7f0302b0;
       a06 tt = this.t;
       uw5.t(context, tt, i);
       TypedValue typedValue = new TypedValue();
       context.getTheme().resolveAttribute(i1, typedValue, true);
       tt.setTextColor(n6.b(context, typedValue.resourceId));
       return;
    }
    public final void e(CharSequence p0){
       this.a(true);
       this.t.setText(p0);
    }
    public final TextView getSubtitleView(){
       return this.t;
    }
    public final void setSubtitle(CharSequence p0){
       this.a(false);
       a06 tt = this.t;
       tt.setTransformationMethod(null);
       tt.setText(p0);
    }
    public final void setTitle(CharSequence p0){
       this.c.setText(p0);
    }
}
