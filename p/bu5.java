package p.bu5;
import p.i16;
import p.zn5;
import android.os.Handler;
import java.lang.Object;
import com.spotify.clientfoundations.cosmos.cosmos.Request;
import io.reactivex.rxjava3.core.Observable;
import java.lang.String;
import p.co5;
import p.au5;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;

public final class bu5 implements i16	// class@00113a from classes.dex
{
    public final yt5 a;
    public final Handler b;

    public void bu5(zn5 p0,Handler p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final Observable resolve(Request p0){
       co5.o(p0, "request");
       Observable observable = Observable.create(new au5(this, p0));
       co5.l(observable, "override fun resolve\(req…)\n            }\n        \)");
       return observable;
    }
}
