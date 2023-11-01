package p.ul3;
import android.widget.AbsListView$OnScrollListener;
import p.wl3;
import java.lang.Object;
import android.widget.AbsListView;
import android.widget.PopupWindow;
import android.view.View;
import java.lang.Runnable;
import android.os.Handler;
import p.pl3;

public final class ul3 implements AbsListView$OnScrollListener	// class@0028d1 from classes.dex
{
    public final wl3 a;

    public void ul3(wl3 p0){
       this.a = p0;
       super();
    }
    public final void onScroll(AbsListView p0,int p1,int p2,int p3){
    }
    public final void onScrollStateChanged(AbsListView p0,int p1){
       int i = 1;
       if (p1 == i) {
          ul3 ta = this.a;
          if (ta.P.getInputMethodMode() != 2) {
             i = 0;
          }
          if (!i && ta.P.getContentView() != null) {
             wl3 h = ta.H;
             ta.L.removeCallbacks(h);
             h.run();
          }
       }
       return;
    }
}
