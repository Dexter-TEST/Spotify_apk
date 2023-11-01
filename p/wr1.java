package p.wr1;
import p.yf2;
import java.lang.Object;
import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import com.spotify.playerlimited.player.models.GaiaState;
import p.bc3;
import java.lang.String;
import p.co5;
import java.util.ArrayList;
import java.lang.Iterable;
import p.aj0;
import java.util.Iterator;
import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse$Device;
import com.spotify.playerlimited.player.models.ConnectDevice;

public final class wr1 implements yf2	// class@002b8e from classes.dex
{
    public static final wr1 a;

    static {
       wr1.a = new wr1();
    }
    public void wr1(){
       super();
    }
    public final Object apply(Object p0){
       GaiaState gaiaState = new GaiaState();
       gaiaState.a = p0.g();
       gaiaState.c = p0.h();
       gaiaState.b = p0.i();
       gaiaState.d = p0.j();
       p0 = p0.f();
       co5.l(p0, "it.devicesList");
       ArrayList uArrayList = new ArrayList(aj0.b0(p0));
       p0 = p0.iterator();
       while (p0.hasNext()) {
          ConnectMessages$StateResponse$Device stateRespons = p0.next();
          ConnectDevice uConnectDevi = new ConnectDevice();
          uConnectDevi.a = stateRespons.g();
          uConnectDevi.b = stateRespons.h();
          uConnectDevi.c = stateRespons.getName();
          uConnectDevi.d = stateRespons.f();
          uConnectDevi.e = stateRespons.i();
          uArrayList.add(uConnectDevi);
       }
       p0 = new ConnectDevice[0];
       gaiaState.e = uArrayList.toArray(p0);
       return gaiaState;
    }
}
