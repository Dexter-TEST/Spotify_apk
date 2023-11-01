package p.zu0;
import android.view.ViewGroup$OnHierarchyChangeListener;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.Object;
import android.view.View;

public final class zu0 implements ViewGroup$OnHierarchyChangeListener	// class@002f66 from classes.dex
{
    public final CoordinatorLayout a;

    public void zu0(CoordinatorLayout p0){
       this.a = p0;
       super();
    }
    public final void onChildViewAdded(View p0,View p1){
       CoordinatorLayout h;
       if ((h = this.a.H) != null) {
          h.onChildViewAdded(p0, p1);
       }
       return;
    }
    public final void onChildViewRemoved(View p0,View p1){
       CoordinatorLayout h;
       zu0 ta = this.a;
       ta.s(2);
       if ((h = ta.H) != null) {
          h.onChildViewRemoved(p0, p1);
       }
       return;
    }
}
