package p.wl;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import p.xl;
import java.lang.Object;
import androidx.fragment.app.Fragment;
import p.v55;
import p.w53;
import p.vk7;
import p.ab3;

public final class wl implements ViewTreeObserver$OnGlobalLayoutListener	// class@002b61 from classes.dex
{
    public boolean a;
    public final xl b;

    public void wl(xl p0){
       this.b = p0;
       super();
    }
    public final void onGlobalLayout(){
       wl ta;
       wl tb = this.b;
       boolean userVisibleH = tb.getUserVisibleHint();
       if ((ta = this.a) != userVisibleH) {
          if (ta != null) {
             tb.b.c(tb.h(), tb.b());
          }else {
             tb.b.b(tb.h(), tb.b());
          }
       }
       this.a = userVisibleH;
       return;
    }
}
