package p.o64;
import p.oi0;
import android.widget.FrameLayout;
import android.view.View;
import android.content.Context;
import android.view.CollapsibleActionView;
import android.view.ViewGroup;

public final class o64 extends FrameLayout implements oi0	// class@0020bb from classes.dex
{
    public final CollapsibleActionView a;

    public void o64(View p0){
       super(p0.getContext());
       this.a = p0;
       this.addView(p0);
    }
    public final void onActionViewCollapsed(){
       this.a.onActionViewCollapsed();
    }
    public final void onActionViewExpanded(){
       this.a.onActionViewExpanded();
    }
}
