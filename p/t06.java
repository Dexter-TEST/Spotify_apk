package p.t06;
import p.vc1;
import java.util.concurrent.atomic.AtomicBoolean;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Object;

public final class t06 implements vc1	// class@0026d7 from classes.dex
{
    public final AtomicBoolean a;
    public final Disposable b;

    public void t06(AtomicBoolean p0,Disposable p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void dispose(){
       t06 ta = this.a;
       _monitor_enter(ta);
       this.b.dispose();
       ta.set(true);
       _monitor_exit(ta);
    }
}
