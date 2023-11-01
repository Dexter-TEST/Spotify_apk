package p.bp0;
import com.spotify.connectivity.platformconnectiontype.ConnectionApisModule;
import com.spotify.connectivity.connectiontype.ConnectivityListener;
import com.spotify.connectivity.connectiontype.FlightModeEnabledMonitor;
import com.spotify.connectivity.connectiontype.MobileDataDisabledMonitor;
import com.spotify.connectivity.connectiontype.InternetMonitor;
import p.r45;
import com.spotify.connectivity.connectiontype.ConnectionApis;
import com.spotify.connectivity.platformconnectiontype.ConnectionApisModule$Companion;
import io.reactivex.rxjava3.core.Observable;

public abstract class bp0	// class@001109 from classes.dex
{

    static {
    }
    public static ConnectionApis a(ConnectivityListener p0,FlightModeEnabledMonitor p1,MobileDataDisabledMonitor p2,InternetMonitor p3,r45 p4){
       return ConnectionApisModule.Companion.provideConnectionApis(p0, p1, p2, p3, p4);
    }
    public static Observable b(ConnectionApis p0){
       return ConnectionApisModule.Companion.provideConnectionTypeObservable(p0);
    }
}
