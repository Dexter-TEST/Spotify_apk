package com.spotify.connectivity.platformconnectiontype.NetworkCallbackEventToConnectionTypeTransformer;
import io.reactivex.rxjava3.core.ObservableTransformer;
import android.content.Context;
import com.spotify.connectivity.connectiontype.ConnectivityUtil;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.spotify.connectivity.connectiontype.ConnectionType;
import com.spotify.connectivity.connectiontype.NetworkCallbackEvent;
import com.spotify.connectivity.connectiontype.NetworkAvailable;
import android.os.Build$VERSION;
import android.net.Network;
import com.spotify.connectivity.connectiontype.NetworkCapabilitiesChanged;
import android.net.NetworkCapabilities;
import com.spotify.connectivity.connectiontype.NetworkLost;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import com.spotify.connectivity.platformconnectiontype.NetworkCallbackEventToConnectionTypeTransformer$apply$1;
import p.yf2;

public final class NetworkCallbackEventToConnectionTypeTransformer implements ObservableTransformer	// class@00079a from classes.dex
{
    private final ConnectivityUtil connectivityUtil;
    private final Context context;
    private ConnectionType currentConnectionType;

    public void NetworkCallbackEventToConnectionTypeTransformer(Context p0,ConnectivityUtil p1){
       co5.o(p0, "context");
       co5.o(p1, "connectivityUtil");
       super();
       this.context = p0;
       this.connectivityUtil = p1;
       this.currentConnectionType = ConnectionType.CONNECTION_TYPE_NONE;
    }
    public static final ConnectionType access$toConnectionType(NetworkCallbackEventToConnectionTypeTransformer p0,NetworkCallbackEvent p1){
       return p0.toConnectionType(p1);
    }
    private final ConnectionType toConnectionType(NetworkCallbackEvent p0){
       int sDK_INT;
       ConnectionType connectionTy;
       int i = 23;
       if (p0 instanceof NetworkAvailable) {
          if ((sDK_INT = Build$VERSION.SDK_INT) >= i && sDK_INT < 26) {
             connectionTy = this.connectivityUtil.getConnectionType(this.context, p0.getNetwork());
             co5.l(connectionTy, "connectivityUtil.getConn…e\(context, event.network\)");
             this.currentConnectionType = connectionTy;
          }
       }else if(p0 instanceof NetworkCapabilitiesChanged){
          if (Build$VERSION.SDK_INT >= i) {
             connectionTy = this.connectivityUtil.getConnectionType(p0.getCapabilities());
             co5.l(connectionTy, "connectivityUtil.getConn…nType\(event.capabilities\)");
             this.currentConnectionType = connectionTy;
          }
       }else if(p0 instanceof NetworkLost){
          this.currentConnectionType = ConnectionType.CONNECTION_TYPE_NONE;
       }
       return this.currentConnectionType;
    }
    public ObservableSource apply(Observable p0){
       co5.o(p0, "upstream");
       p0 = p0.map(new NetworkCallbackEventToConnectionTypeTransformer$apply$1(this));
       co5.l(p0, "upstream.map\(::toConnectionType\)");
       return p0;
    }
    public final ConnectivityUtil getConnectivityUtil(){
       return this.connectivityUtil;
    }
    public final Context getContext(){
       return this.context;
    }
    public final ConnectionType getCurrentConnectionType(){
       return this.currentConnectionType;
    }
}
