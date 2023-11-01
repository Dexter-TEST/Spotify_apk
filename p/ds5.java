package p.ds5;
import p.mr5;
import p.es5;
import io.reactivex.rxjava3.core.Observer;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.wz3;
import java.lang.Integer;

public final class ds5 extends mr5	// class@0013aa from classes.dex
{
    public final es5 a;
    public final Observer b;

    public void ds5(es5 p0,Observer p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void a(RecyclerView p0,int p1){
       co5.q(p0, "recyclerView");
       if (!this.a.isDisposed()) {
          this.b.onNext(Integer.valueOf(p1));
       }
       return;
    }
}
