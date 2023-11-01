package p.e97;
import io.reactivex.rxjava3.core.ObservableTransformer;
import com.spotify.messaging.inappmessagingsdk.networking.a;
import io.reactivex.rxjava3.core.Single;
import java.lang.String;
import java.lang.Object;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import p.h97;
import p.yf2;

public final class e97 implements ObservableTransformer	// class@001445 from classes.dex
{
    public final Single a;
    public final a b;
    public final String c;
    public final boolean d;

    public void e97(a p0,Single p1,String p2,boolean p3){
       super();
       this.a = p1;
       this.b = p0;
       this.c = p2;
       this.d = p3;
    }
    public final ObservableSource apply(Observable p0){
       return this.a.flatMapObservable(new h97(p0, this.b, this.c, this.d));
    }
}
