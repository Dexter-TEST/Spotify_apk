package p.af0;
import android.view.ViewOutlineProvider;
import java.lang.Object;
import android.view.View;
import android.graphics.Outline;
import com.google.android.material.chip.Chip;
import p.ef0;
import java.lang.String;
import p.co5;
import p.wf2;
import java.lang.Number;

public final class af0 extends ViewOutlineProvider	// class@000f6c from classes.dex
{
    public final int a;
    public final Object b;

    public void af0(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void getOutline(View p0,Outline p1){
       Chip v;
       af0 tb = this.b;
       switch (this.a){
           case 0:
             if ((v = tb.v) != null) {
                v.getOutline(p1);
             }else {
                p1.setAlpha(0);
             }
             break;
           default:
             co5.o(p0, "view");
             co5.o(p1, "outline");
             int i = p0.getWidth() - (p0.getPaddingRight() + p0.getPaddingLeft());
             float f = tb.invoke().floatValue();
             i = (i == (p0.getHeight() - (p0.getPaddingBottom() + p0.getPaddingTop())) && ((float)i - (f * (float)2)) <= 0)? 1: 0;
             if (i) {
                p1.setOval(p0.getPaddingLeft(), p0.getPaddingTop(), (p0.getWidth() - p0.getPaddingRight()), (p0.getHeight() - p0.getPaddingBottom()));
             }else {
                p1.setRoundRect(p0.getPaddingLeft(), p0.getPaddingTop(), (p0.getWidth() - p0.getPaddingRight()), (p0.getHeight() - p0.getPaddingBottom()), tb.invoke().floatValue());
             }
             p1.setAlpha(0);
             return;
       }
       return;
    }
}
