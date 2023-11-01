package p.i81;
import java.lang.Runnable;
import androidx.fragment.app.v;
import p.pk;
import java.lang.Object;
import p.te2;
import p.te6;
import androidx.fragment.app.Fragment;

public final class i81 implements Runnable	// class@001941 from classes.dex
{
    public final v a;
    public final v b;
    public final boolean c;

    public void i81(v p0,v p1,boolean p2,pk p3){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public final void run(){
       v c = this.a.c;
       v c1 = this.b.c;
       if (this.c != null) {
          c1.getEnterTransitionCallback();
       }else {
          c.getEnterTransitionCallback();
       }
       return;
    }
}
