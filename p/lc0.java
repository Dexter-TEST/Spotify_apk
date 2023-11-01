package p.lc0;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import java.lang.Object;
import p.ae4;
import p.jh;
import p.wh7;
import android.view.View;
import p.gh7;
import android.graphics.Rect;
import p.wl3;
import p.mh;
import p.lh;
import p.dh;
import android.view.ViewTreeObserver;
import p.ch;
import p.wq6;
import p.pc0;
import java.util.ArrayList;
import p.oc0;
import java.util.Iterator;
import p.rk2;

public final class lc0 implements ViewTreeObserver$OnGlobalLayoutListener	// class@001d24 from classes.dex
{
    public final int a;
    public final Object b;

    public void lc0(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void onGlobalLayout(){
       pc0 g;
       wq6 e;
       ViewTreeObserver viewTreeObse;
       int i = 0;
       lc0 tb = this.b;
       switch (this.a){
           case 0:
             if (tb.a()) {
                pc0 z = tb.z;
                if (z.size() > 0 && z.get(i).a.O == null) {
                   if ((g = tb.G) != null && g.isShown()) {
                      Iterator iterator = z.iterator();
                      while (iterator.hasNext()) {
                         iterator.next().a.c();
                      }
                   }else {
                      tb.dismiss();
                   }
                }
             }
             return;
             break;
           case 1:
             if (tb.a()) {
                wq6 z1 = tb.z;
                if (z1.O == null) {
                   if ((e = tb.E) != null && e.isShown()) {
                      z1.c();
                   }else {
                      tb.dismiss();
                   }
                }
             }
             return;
             break;
           case 2:
             if (!tb.getInternalPopup().a()) {
                tb.w.k(dh.b(tb), dh.a(tb));
             }
             if ((viewTreeObse = tb.getViewTreeObserver()) != null) {
                ch.a(viewTreeObse, this);
             }
             return;
             break;
           case 3:
             jh x = tb.X;
             if (gh7.b(x) && x.getGlobalVisibleRect(tb.V)) {
                i = 1;
             }
             if (!i) {
                tb.dismiss();
             }else {
                tb.s();
                tb.c();
             }
             return;
             break;
           case 4:
           default:
             tb.f.getTop();
             tb.f.getViewTreeObserver().removeOnGlobalLayoutListener(this);
             return;
       }
       tb.a();
       return;
    }
}
