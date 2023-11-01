package p.le2;
import p.ej4;
import androidx.viewpager2.adapter.a;
import androidx.fragment.app.Fragment;
import android.widget.FrameLayout;
import androidx.fragment.app.o;
import android.view.View;
import java.lang.Class;
import java.lang.Object;

public final class le2 extends ej4	// class@001d38 from classes.dex
{
    public final Fragment o0;
    public final FrameLayout p0;
    public final a q0;

    public void le2(a p0,Fragment p1,FrameLayout p2){
       this.q0 = p0;
       this.o0 = p1;
       this.p0 = p2;
       super();
    }
    public final void v0(o p0,Fragment p1,View p2){
       if (p1 == this.o0) {
          p0.g0(this);
          this.q0.getClass();
          a.w(p2, this.p0);
       }
       return;
    }
}
