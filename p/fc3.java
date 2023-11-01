package p.fc3;
import p.zv6;
import com.spotify.connectivity.platformconnectiontype.InternetMonitorImpl;
import com.spotify.connectivity.connectiontype.FlightModeEnabledMonitor;
import com.spotify.connectivity.connectiontype.MobileDataDisabledMonitor;
import java.lang.Object;
import io.reactivex.rxjava3.core.ObservableSource;

public final class fc3 implements zv6	// class@00159e from classes.dex
{
    public final InternetMonitorImpl a;
    public final FlightModeEnabledMonitor b;
    public final MobileDataDisabledMonitor c;

    public void fc3(InternetMonitorImpl p0,FlightModeEnabledMonitor p1,MobileDataDisabledMonitor p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final Object get(){
       return InternetMonitorImpl.c(this.a, this.b, this.c);
    }
}
