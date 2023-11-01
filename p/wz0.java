package p.wz0;
import android.os.FileObserver;
import io.reactivex.rxjava3.core.ObservableEmitter;
import java.io.File;
import java.lang.String;
import java.lang.Object;

public final class wz0 extends FileObserver	// class@002bd4 from classes.dex
{
    public final ObservableEmitter a;
    public final File b;

    public void wz0(ObservableEmitter p0,File p1,File p2){
       this.a = p0;
       this.b = p2;
       super(p1);
    }
    public final void onEvent(int p0,String p1){
       this.a.onNext(this.b.getPath());
    }
}
