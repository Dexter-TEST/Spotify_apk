package p.xz0;
import android.os.FileObserver;
import java.lang.String;
import io.reactivex.rxjava3.core.ObservableEmitter;
import java.io.File;
import java.lang.Object;

public final class xz0 extends FileObserver	// class@002d16 from classes.dex
{
    public final ObservableEmitter a;
    public final File b;

    public void xz0(String p0,ObservableEmitter p1,File p2){
       this.a = p1;
       this.b = p2;
       super(p0);
    }
    public final void onEvent(int p0,String p1){
       this.a.onNext(this.b.getPath());
    }
}
