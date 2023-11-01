package p.ht6;
import p.qz5;
import p.o85;
import java.lang.Object;
import android.view.View;
import android.view.ViewGroup;
import p.ze;
import android.widget.TextView;
import p.do5;
import p.mj5;
import p.oj5;
import java.util.Collection;
import java.util.Collections;
import p.f6;
import p.lb0;

public final class ht6 implements qz5	// class@0018bd from classes.dex
{
    public final View a;
    public final ze b;
    public final TextView c;
    public final TextView t;
    public final TextView v;

    public void ht6(o85 p0){
       super();
       this.a = p0;
       this.b = new ze(p0.findViewById(R.id.accessory));
       TextView textView = p0.findViewById(0x1020014);
       this.c = textView;
       TextView textView1 = p0.findViewById(R.id.text2);
       this.t = textView1;
       TextView textView2 = p0.findViewById(R.id.text3);
       this.v = textView2;
       TextView[] textViewArra = new TextView[]{textView};
       do5.y0(textViewArra);
       textViewArra = new TextView[]{textView1};
       do5.y0(textViewArra);
       textViewArra = new TextView[]{textView1};
       do5.z0(textViewArra);
       textViewArra = new TextView[]{textView2};
       do5.z0(textViewArra);
       do5.x0(p0);
       mj5 omj5 = oj5.c(p0.findViewById(R.id.row_view));
       View[] viewArray = new View[]{textView,textView1,textView2};
       Collections.addAll(omj5.c, viewArray);
       omj5.a();
    }
    public final void d(View p0){
       ht6 tb = this.b;
       tb.b(p0);
       tb.c();
    }
    public final View getView(){
       return this.a;
    }
    public final void setActive(boolean p0){
       ht6 ta = this.a;
       if (ta instanceof f6) {
          ta.setActive(p0);
       }
       return;
    }
    public final void setAppearsDisabled(boolean p0){
       ht6 ta = this.a;
       if (ta instanceof lb0) {
          ta.setAppearsDisabled(p0);
       }
       return;
    }
}
