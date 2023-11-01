package p.o65;
import android.view.View$OnTouchListener;
import p.p06;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import p.wz3;
import p.ev;
import io.reactivex.rxjava3.core.Observer;

public final class o65 implements View$OnTouchListener	// class@0020bc from classes.dex
{
    public final p06 a;
    public final int b;
    public final Object c;

    public void o65(p06 p0,int p1,Object p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final boolean onTouch(View p0,MotionEvent p1){
       o65 ta = this.a;
       if (!ta.isDisposed()) {
          ta.c.onNext(new ev(p1, this.b));
       }
       return false;
    }
}
