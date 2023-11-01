package com.spotify.connectivity.connectivityservice.ServiceConnectivityObserver;
import com.spotify.connectivity.auth.LoginController;
import com.spotify.clientfoundations.connectivity.connectivitysdkpolicy.ConnectivityManager;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import p.co5;
import android.telephony.TelephonyManager;
import com.spotify.connectivity.connectiontype.ConnectionType;
import com.spotify.connectivity.ConnectionType;
import com.spotify.connectivity.ConnectionType$Companion;

public final class ServiceConnectivityObserver	// class@0006e8 from classes.dex
{
    private final ConnectivityManager connectivityManager;
    private final Context context;
    private boolean destroyed;
    private final LoginController loginController;
    private ConnectionType previousConnectionType;
    private final TelephonyManager telephonyManager;

    public void ServiceConnectivityObserver(LoginController p0,ConnectivityManager p1,Context p2){
       co5.o(p0, "loginController");
       co5.o(p1, "connectivityManager");
       co5.o(p2, "context");
       super();
       this.loginController = p0;
       this.connectivityManager = p1;
       this.context = p2;
       p0 = p2.getSystemService("phone");
       co5.j(p0, "null cannot be cast to non-null type android.telephony.TelephonyManager");
       this.telephonyManager = p0;
       this.previousConnectionType = ConnectionType.CONNECTION_TYPE_UNKNOWN;
    }
    private final ConnectionType mapConnectionType(ConnectionType p0){
       if ((p0 = ConnectionType.Companion.connectionTypeOfValue(p0.getNativeConstant())) == null) {
          p0 = ConnectionType.UNKNOWN;
       }
       return p0;
    }
    public synchronized final void destroy(){
       this.destroyed = true;
    }
    public final Context getContext(){
       return this.context;
    }
    public synchronized final void setConnectivityType(ConnectionType p0){
       co5.o(p0, "newType");
       if (this.destroyed != null) {
          return;
       }
       this.connectivityManager.setConnectionType(this.mapConnectionType(p0), this.telephonyManager.isNetworkRoaming());
       ServiceConnectivityObserver tpreviousCon = this.previousConnectionType;
       if (p0 == tpreviousCon) {
          return;
       }
       this.previousConnectionType = p0;
       if (p0.isOffline()) {
          return;
       }
       boolean b = (!tpreviousCon.isOffline() && tpreviousCon.isCellularNetwork() != p0.isCellularNetwork())? true: false;
       this.loginController.tryReconnectNow(b);
       return;
    }
}
