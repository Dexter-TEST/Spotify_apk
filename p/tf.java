package p.tf;
import java.lang.Runnable;
import p.jg;
import java.lang.Object;
import android.view.View;
import android.widget.PopupWindow;
import p.fk7;
import p.wh7;
import p.gh7;
import p.wf;
import p.ik7;
import androidx.appcompat.widget.ActionBarContextView;

public final class tf implements Runnable	// class@002762 from classes.dex
{
    public final int a;
    public final jg b;

    public void tf(jg p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void run(){
       jg p;
       int i = 1;
       tf tb = this.b;
       switch (this.a){
           case 0:
             if ((i & tb.r0)) {
                tb.v(0);
             }
             if ((tb.r0 & 0x1000)) {
                tb.v(108);
             }
             break;
           default:
             tb.N.showAtLocation(tb.M, 55, 0, 0);
             if ((p = tb.P) != null) {
                p.b();
             }
             if (tb.R == null || ((p = tb.S) == null || !gh7.c(p))) {
                i = 0;
             }
             float f = 0x3f800000;
             if (i) {
                tb.M.setAlpha(0);
                fk7 uofk7 = wh7.a(tb.M);
                uofk7.a(f);
                tb.P = uofk7;
                uofk7.d(new wf(0, this));
             }else {
                tb.M.setAlpha(f);
                tb.M.setVisibility(0);
             }
             return;
       }
       tb.q0 = false;
       tb.r0 = 0;
       return;
    }
}
