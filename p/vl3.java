package p.vl3;
import android.view.View$OnTouchListener;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import p.wl3;
import android.widget.PopupWindow;
import java.lang.Runnable;
import android.os.Handler;
import p.b56;

public final class vl3 implements View$OnTouchListener	// class@002a19 from classes.dex
{
    public final int a;
    public final Object b;

    public void vl3(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final boolean onTouch(View p0,MotionEvent p1){
       int action;
       wl3 p;
       vl3 tb = this.b;
       boolean b = true;
       switch (this.a){
           case 0:
             action = p1.getAction();
             int i = (int)p1.getX();
             int i1 = (int)p1.getY();
             if (!action) {
                vl3 ovl3 = tb;
                if ((p = ovl3.P) != null && (p.isShowing() && i >= 0)) {
                   p = ovl3.P;
                   if (i < p.getWidth() && (i1 >= 0 && i1 < p.getHeight())) {
                      ovl3.L.postDelayed(ovl3.H, 250);
                   label_004f :
                      return false;
                   }
                }
             }
             if (action == b) {
                tb.L.removeCallbacks(tb.H);
                goto label_004f ;
             }else {
                goto label_004f ;
             }
             break;
           case 1:
           default:
             if (action = p1.getAction()) {
                if (action == b) {
                   tb.f = false;
                }
             }else {
                tb.f = b;
             }
             return false;
       }
       return b;
    }
}
