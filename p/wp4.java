package p.wp4;
import java.lang.Runnable;
import p.yp4;
import java.util.Collection;
import java.lang.Object;
import java.util.LinkedList;
import io.reactivex.rxjava3.disposables.Disposable;
import p.pn5;

public final class wp4 implements Runnable	// class@002b80 from classes.dex
{
    public final Collection a;
    public final yp4 b;

    public void wp4(yp4 p0,Collection p1){
       this.b = p0;
       super();
       this.a = p1;
    }
    public final void run(){
       wp4 tb = this.b;
       _monitor_enter(tb);
       this.b.C.remove(this.a);
       _monitor_exit(tb);
       tb = this.b;
       tb.m(this.a, tb.B);
    }
}
