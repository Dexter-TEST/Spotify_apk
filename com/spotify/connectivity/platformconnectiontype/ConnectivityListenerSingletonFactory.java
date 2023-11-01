package com.spotify.connectivity.platformconnectiontype.ConnectivityListenerSingletonFactory;
import java.lang.Object;
import android.content.Context;
import com.spotify.connectivity.connectiontype.ConnectivityUtil;
import com.spotify.connectivity.platformconnectiontype.PlatformConnectionTypeProperties;
import com.spotify.connectivity.connectiontype.ConnectivityListener;
import android.os.Build$VERSION;
import com.spotify.connectivity.platformconnectiontype.ConnectivityListenerImpl;
import com.spotify.connectivity.platformconnectiontype.ConnectivityListenerImplLegacy;

public final class ConnectivityListenerSingletonFactory	// class@00078a from classes.dex
{
    private static ConnectivityListener sConnectivityListener;

    private void ConnectivityListenerSingletonFactory(){
       super();
    }
    public static ConnectivityListener createConnectivityListener(Context p0,ConnectivityUtil p1,PlatformConnectionTypeProperties p2){
       if (ConnectivityListenerSingletonFactory.sConnectivityListener == null) {
          _monitor_enter(ConnectivityListener.class);
          if (ConnectivityListenerSingletonFactory.sConnectivityListener == null) {
             ConnectivityListenerSingletonFactory.sConnectivityListener = (Build$VERSION.SDK_INT >= 23)? new ConnectivityListenerImpl(p0, p1, p2): new ConnectivityListenerImplLegacy(p0, p1);
          }
          _monitor_exit(ConnectivityListener.class);
       }
       return ConnectivityListenerSingletonFactory.sConnectivityListener;
    }
}
