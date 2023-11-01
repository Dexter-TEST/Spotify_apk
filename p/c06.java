package p.c06;
import p.a06;
import p.o85;
import android.view.View;
import android.widget.TextView;
import android.text.TextPaint;
import java.lang.String;
import android.graphics.Paint;
import android.view.ViewGroup$LayoutParams;
import p.sz5;
import p.mj5;
import p.oj5;
import java.util.Collection;
import java.lang.Object;
import java.util.Collections;

public final class c06 extends a06	// class@001170 from classes.dex
{
    public final TextView v;

    public void c06(o85 p0){
       super(p0);
       TextView textView = p0.findViewById(R.id.paste_listtile_number);
       this.v = textView;
       int i = 10;
       float[] uofloatArray = new float[i];
       textView.getPaint().getTextWidths("0123456789", uofloatArray);
       int i1 = 0;
       float f = 0;
       int i2 = 0;
       while (i2 < i) {
          int i3 = uofloatArray[i2];
          if ((f - i3) > 0) {
             f = i3;
          }
          i2 = i2 + 1;
       }
       this.v.getLayoutParams().width = (int)((f * (float)2) + 0x3f000000);
       mj5 omj5 = oj5.c(this.a.findViewById(R.id.row_view));
       View[] viewArray = new View[]{this.c,this.t,this.v};
       Collections.addAll(omj5.c, viewArray);
       omj5.a();
       return;
    }
}
