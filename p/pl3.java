package p.pl3;
import java.lang.Runnable;
import p.wl3;
import java.lang.Object;
import p.ue1;
import android.view.View;
import p.wh7;
import p.gh7;
import android.widget.AdapterView;
import android.view.ViewGroup;
import android.widget.PopupWindow;

public final class pl3 implements Runnable	// class@002284 from classes.dex
{
    public final int a;
    public final wl3 b;

    public void pl3(wl3 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void run(){
       wl3 c;
       pl3 tb = this.b;
       switch (this.a){
           case 1:
             if ((c = tb.c) != null) {
                c.setListSelectionHidden(true);
                c.requestLayout();
             }
             break;
           default:
             if ((c = tb.c) != null && (gh7.b(c) && (tb.c.getCount() > tb.c.getChildCount() && tb.c.getChildCount() <= tb.D))) {
                tb.P.setInputMethodMode(2);
                tb.c();
             }
             return;
       }
       return;
    }
}
