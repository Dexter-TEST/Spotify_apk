package p.ij7;
import p.xu0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.view.View;
import p.kj7;

public abstract class ij7 extends xu0	// class@0019a9 from classes.dex
{
    public kj7 a;
    public int b;

    public void ij7(){
       super();
       this.b = 0;
    }
    public void ij7(int p0){
       super(0);
       this.b = 0;
    }
    public boolean h(CoordinatorLayout p0,View p1,int p2){
       this.v(p0, p1, p2);
       if (this.a == null) {
          this.a = new kj7(p1);
       }
       ij7 ta = this.a;
       kj7 a = ta.a;
       ta.b = a.getTop();
       ta.c = a.getLeft();
       this.a.a();
       if ((ta = this.b) != null) {
          this.a.b(ta);
          this.b = 0;
       }
       return true;
    }
    public final int u(){
       ij7 ta;
       kj7 d = ((ta = this.a) != null)? ta.d: 0;
       return d;
    }
    public void v(CoordinatorLayout p0,View p1,int p2){
       p0.t(p1, p2);
    }
}
