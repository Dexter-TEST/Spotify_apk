package p.mc0;
import android.view.View$OnAttachStateChangeListener;
import java.lang.Object;
import android.view.View;
import p.us2;
import p.ss2;
import android.view.ViewTreeObserver;
import p.ut2;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewTreeObserver$OnScrollChangedListener;
import p.wq6;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import p.pc0;

public final class mc0 implements View$OnAttachStateChangeListener	// class@001e66 from classes.dex
{
    public final int a;
    public final Object b;

    public void mc0(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void onViewAttachedToWindow(View p0){
       ss2 b;
       switch (this.a){
           case 0:
           case 1:
           default:
             us2 d = this.b.d;
             if ((b = d.b) == null || !b.isAlive()) {
                ViewTreeObserver viewTreeObse = d.c.a.getViewTreeObserver();
                d.b = viewTreeObse;
                viewTreeObse.addOnScrollChangedListener(d);
             }
             return;
       }
       return;
    }
    public final void onViewDetachedFromWindow(View p0){
       pc0 p;
       wq6 g;
       ss2 b;
       mc0 tb = this.b;
       switch (this.a){
           case 0:
             if ((p = tb.P) != null) {
                if (!p.isAlive()) {
                   tb.P = p0.getViewTreeObserver();
                }
                tb.P.removeGlobalOnLayoutListener(tb.A);
             }
             break;
           case 1:
             if ((g = tb.G) != null) {
                if (!g.isAlive()) {
                   tb.G = p0.getViewTreeObserver();
                }
                tb.G.removeGlobalOnLayoutListener(tb.A);
             }
             p0.removeOnAttachStateChangeListener(this);
             return;
             break;
           default:
             us2 d = tb.d;
             if ((b = d.b) != null && b.isAlive()) {
                d.b.removeOnScrollChangedListener(d);
             }
             d.b = null;
             return;
       }
       p0.removeOnAttachStateChangeListener(this);
       return;
    }
}
