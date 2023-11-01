package p.ke2;
import android.view.View$OnLayoutChangeListener;
import androidx.viewpager2.adapter.a;
import android.widget.FrameLayout;
import p.gf2;
import java.lang.Object;
import android.view.View;
import android.view.ViewParent;

public final class ke2 implements View$OnLayoutChangeListener	// class@001bf7 from classes.dex
{
    public final FrameLayout a;
    public final gf2 b;
    public final a c;

    public void ke2(a p0,FrameLayout p1,gf2 p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public final void onLayoutChange(View p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8){
       ke2 ta = this.a;
       if (ta.getParent() != null) {
          ta.removeOnLayoutChangeListener(this);
          this.c.B(this.b);
       }
       return;
    }
}
