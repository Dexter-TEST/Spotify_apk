package p.tp0;
import p.tb0;
import java.lang.Object;
import p.sp0;
import com.spotify.connectivity.platformconnectiontype.ConnectivityMonitorImpl;
import com.spotify.connectivity.connectiontype.ConnectivityObserver;
import com.spotify.connectivity.platformconnectiontype.InternetConnectivityObservableImpl;

public final class tp0 implements tb0	// class@0027b3 from classes.dex
{
    public final int a;
    public final ConnectivityObserver b;
    public final Object c;

    public void tp0(Object p0,sp0 p1,int p2){
       this.a = p2;
       this.c = p0;
       this.b = p1;
       super();
    }
    public final void cancel(){
       tp0 tb = this.b;
       tp0 tc = this.c;
       switch (this.a){
           case 0:
           default:
             InternetConnectivityObservableImpl.d(tc, tb);
             return;
       }
       ConnectivityMonitorImpl.b(tc, tb);
       return;
    }
}
