package p.sp0;
import com.spotify.connectivity.connectiontype.ConnectivityObserver;
import io.reactivex.rxjava3.core.ObservableEmitter;
import java.lang.Object;
import com.spotify.connectivity.connectiontype.ConnectionType;
import com.spotify.connectivity.platformconnectiontype.ConnectivityMonitorImpl;
import com.spotify.connectivity.platformconnectiontype.InternetConnectivityObservableImpl;

public final class sp0 implements ConnectivityObserver	// class@002670 from classes.dex
{
    public final int a;
    public final ObservableEmitter b;

    public void sp0(ObservableEmitter p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void setConnectivityType(ConnectionType p0,boolean p1){
       sp0 tb = this.b;
       switch (this.a){
           case 0:
           default:
             InternetConnectivityObservableImpl.c(tb, p0, p1);
             return;
       }
       ConnectivityMonitorImpl.a(tb, p0, p1);
       return;
    }
}
