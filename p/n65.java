package p.n65;
import android.view.View$OnClickListener;
import p.n06;
import java.lang.Object;
import android.view.View;
import p.wz3;
import java.lang.Integer;
import io.reactivex.rxjava3.core.Observer;

public final class n65 implements View$OnClickListener	// class@001f78 from classes.dex
{
    public final n06 a;
    public final int b;
    public final Object c;

    public void n65(n06 p0,int p1,Object p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final void onClick(View p0){
       n65 ta = this.a;
       if (!ta.isDisposed()) {
          ta.c.onNext(Integer.valueOf(this.b));
       }
       return;
    }
}
