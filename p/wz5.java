package p.wz5;
import p.uz5;
import p.sz5;
import p.o85;
import android.view.View;
import android.widget.TextView;
import p.mj5;
import p.oj5;
import java.util.Collection;
import java.lang.Object;
import java.util.Collections;
import java.lang.CharSequence;

public class wz5 extends sz5 implements uz5	// class@002bd9 from classes.dex
{
    public final TextView c;

    public void wz5(o85 p0){
       super(p0);
       TextView textView = p0.findViewById(0x1020014);
       this.c = textView;
       mj5 omj5 = oj5.c(p0.findViewById(R.id.row_view));
       View[] viewArray = new View[]{textView};
       Collections.addAll(omj5.c, viewArray);
       omj5.a();
    }
    public final void setText(CharSequence p0){
       this.c.setText(p0);
    }
}
