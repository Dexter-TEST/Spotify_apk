package p.pj7;
import p.tj7;
import androidx.viewpager2.widget.ViewPager2;
import p.uj7;
import android.view.View;

public final class pj7 extends tj7	// class@002276 from classes.dex
{
    public final int a;
    public final ViewPager2 b;

    public void pj7(ViewPager2 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void a(int p0){
       switch (this.a){
           case 0:
             if (!p0) {
                this.b.d();
             }
             break;
           default:
             return;
       }
       return;
    }
    public final void c(int p0){
       pj7 tb = this.b;
       switch (this.a){
           case 0:
             if (tb.t != p0) {
                tb.t = p0;
                tb.K.p();
             }
             break;
           default:
             tb.clearFocus();
             if (tb.hasFocus()) {
                tb.A.requestFocus(2);
             }
             return;
       }
       return;
    }
}
