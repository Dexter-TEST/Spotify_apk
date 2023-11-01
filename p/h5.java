package p.h5;
import java.lang.Runnable;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.lang.Object;
import android.view.ViewPropertyAnimator;
import android.view.View;
import android.animation.Animator$AnimatorListener;

public final class h5 implements Runnable	// class@0017e9 from classes.dex
{
    public final int a;
    public final ActionBarOverlayLayout b;

    public void h5(ActionBarOverlayLayout p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void run(){
       h5 tb = this.b;
       switch (this.a){
           case 0:
           default:
             tb.e();
             tb.N = tb.t.animate().translationY((float)(- tb.t.getHeight())).setListener(tb.O);
             return;
       }
       tb.e();
       tb.N = tb.t.animate().translationY(0).setListener(tb.O);
       return;
    }
}
