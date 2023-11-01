package p.g97;
import io.reactivex.rxjava3.core.ObservableTransformer;
import com.spotify.messaging.inappmessagingsdk.networking.a;
import java.lang.Object;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import p.nu4;
import p.yf2;

public final class g97 implements ObservableTransformer	// class@0016c8 from classes.dex
{
    public final a a;
    public final boolean b;

    public void g97(a p0,boolean p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final ObservableSource apply(Observable p0){
       return p0.flatMap(new nu4(1, this.a, this.b));
    }
}
