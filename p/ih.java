package p.ih;
import android.widget.PopupWindow$OnDismissListener;
import p.jh;
import p.lc0;
import java.lang.Object;
import android.view.ViewTreeObserver;
import android.view.View;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

public final class ih implements PopupWindow$OnDismissListener	// class@001998 from classes.dex
{
    public final ViewTreeObserver$OnGlobalLayoutListener a;
    public final jh b;

    public void ih(jh p0,lc0 p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public final void onDismiss(){
       ViewTreeObserver viewTreeObse;
       if ((viewTreeObse = this.b.X.getViewTreeObserver()) != null) {
          viewTreeObse.removeGlobalOnLayoutListener(this.a);
       }
       return;
    }
}
