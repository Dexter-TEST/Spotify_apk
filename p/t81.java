package p.t81;
import p.yf2;
import io.reactivex.rxjava3.core.Observable;
import java.lang.Object;
import java.lang.Boolean;
import p.ow0;
import io.reactivex.rxjava3.core.ObservableSource;
import com.spotify.connectivity.sessionstate.DeferUntilConnected;
import java.util.Map;
import com.spotify.connectivity.connectiontype.DeferUntilConnected;
import p.p54;

public final class t81 implements yf2	// class@00271b from classes.dex
{
    public final int a;
    public final Observable b;

    public void t81(Observable p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object apply(Object p0){
       t81 tb = this.b;
       switch (this.a){
           case 0:
             return DeferUntilConnected.a(tb, p0);
           case 1:
             return tb.startWithItem(p0);
           case 2:
             return DeferUntilConnected.b(tb, p0);
           case 3:
          label_000a :
             return tb;
             break;
           case 4:
             goto label_000a ;
             break;
           default:
             return tb;
       }
    }
}
