package p.cp0;
import com.spotify.connectivity.platformconnectiontype.ConnectionApisServiceScopeModule;
import com.spotify.connectivity.connectiontype.ConnectionApis;
import io.reactivex.rxjava3.core.Observable;
import com.spotify.connectivity.platformconnectiontype.ConnectionApisServiceScopeModule$Companion;
import android.content.Context;
import com.spotify.connectivity.connectiontype.FlightModeEnabledMonitor;

public abstract class cp0	// class@00124d from classes.dex
{

    static {
    }
    public static Observable a(ConnectionApis p0){
       return ConnectionApisServiceScopeModule.Companion.provideConnectionTypeObservable(p0);
    }
    public static FlightModeEnabledMonitor b(Context p0){
       return ConnectionApisServiceScopeModule.Companion.provideFlightModeEnabledMonitor(p0);
    }
}
