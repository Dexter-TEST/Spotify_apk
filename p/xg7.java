package p.xg7;
import android.view.View$OnClickListener;
import p.wz3;
import android.view.View;
import io.reactivex.rxjava3.core.Observer;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.jc7;

public final class xg7 extends wz3 implements View$OnClickListener	// class@002c74 from classes.dex
{
    public final View b;
    public final Observer c;

    public void xg7(View p0,Observer p1){
       co5.q(p0, "view");
       co5.q(p1, "observer");
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void f(){
       this.b.setOnClickListener(null);
    }
    public final void onClick(View p0){
       co5.q(p0, "v");
       if (!this.isDisposed()) {
          this.c.onNext(jc7.a);
       }
       return;
    }
}
