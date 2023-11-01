package p.td4;
import p.by6;
import io.reactivex.rxjava3.core.ObservableEmitter;
import java.lang.Object;
import java.io.File;
import java.lang.Long;

public final class td4 implements by6	// class@00274c from classes.dex
{
    public final ObservableEmitter a;
    public boolean b;

    public void td4(ObservableEmitter p0){
       super();
       this.a = p0;
    }
    public final void d(File p0){
       if (this.b == null) {
          td4 ta = this.a;
          if (!ta.isDisposed()) {
             ta.onNext(Long.valueOf(p0.length()));
          }
       }
       return;
    }
}
