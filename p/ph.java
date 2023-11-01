package p.ph;
import p.uw5;
import p.wh;
import java.lang.ref.WeakReference;
import android.graphics.Typeface;
import android.os.Build$VERSION;
import p.vh;
import java.lang.Object;
import java.lang.ref.Reference;
import android.widget.TextView;
import p.wh7;
import android.view.View;
import p.gh7;
import p.qh;
import java.lang.Runnable;

public final class ph extends uw5	// class@002265 from classes.dex
{
    public final int A;
    public final int B;
    public final WeakReference C;
    public final wh D;

    public void ph(wh p0,int p1,int p2,WeakReference p3){
       this.D = p0;
       this.A = p1;
       this.B = p2;
       this.C = p3;
       super();
    }
    public final void p(int p0){
    }
    public final void q(Typeface p0){
       ph tA;
       TextView textView;
       if (Build$VERSION.SDK_INT >= 28 && (tA = this.A) != -1) {
          boolean b = ((this.B & 0x02))? true: false;
          p0 = vh.a(p0, tA, b);
       }
       ph tD = this.D;
       if (tD.m != null) {
          tD.l = p0;
          if ((textView = this.C.get()) != null) {
             if (gh7.b(textView)) {
                textView.post(new qh(tD, textView, p0, tD.j));
             }else {
                textView.setTypeface(p0, tD.j);
             }
          }
       }
       return;
    }
}
