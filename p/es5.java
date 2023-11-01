package p.es5;
import p.wz3;
import androidx.recyclerview.widget.RecyclerView;
import io.reactivex.rxjava3.core.Observer;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.ds5;
import p.gn;
import p.fn;
import p.mr5;
import java.util.ArrayList;
import p.e07;
import p.wd5;

public final class es5 extends wz3	// class@0014ec from classes.dex
{
    public final int b;
    public final Object c;
    public final Object t;

    public void es5(RecyclerView p0,Observer p1){
       this.b = 0;
       co5.q(p0, "recyclerView");
       co5.q(p1, "observer");
       super();
       this.t = p0;
       this.c = new ds5(this, p1);
    }
    public void es5(gn p0,fn p1){
       this.b = 1;
       this.t = p0;
       this.c = p1;
       super();
    }
    public final void f(){
       RecyclerView a0;
       es5 tc = this.c;
       es5 tt = this.t;
       switch (this.b){
           case 0:
             break;
           default:
             tt.a.c(tc);
             return;
       }
       if ((a0 = tt.A0) != null) {
          a0.remove(tc);
       }
       return;
    }
}
