package com.spotify.connectivity.platformconnectiontype.ConnectivityListenerImpl$2;
import android.net.ConnectivityManager$NetworkCallback;
import com.spotify.connectivity.platformconnectiontype.ConnectivityListenerImpl;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.util.Map;
import com.spotify.connectivity.connectiontype.ConnectivityUtil;
import com.spotify.connectivity.connectiontype.ConnectionType;
import java.lang.Object;
import com.spotify.connectivity.platformconnectiontype.PlatformConnectionTypeProperties;
import android.os.Handler;
import android.os.Looper;
import com.spotify.connectivity.platformconnectiontype.a;
import java.lang.Runnable;
import android.os.Build$VERSION;
import android.content.Context;
import com.spotify.connectivity.platformconnectiontype.b;

class ConnectivityListenerImpl$2 extends ConnectivityManager$NetworkCallback	// class@000784 from classes.dex
{
    final ConnectivityListenerImpl this$0;

    public void ConnectivityListenerImpl$2(ConnectivityListenerImpl p0){
       this.this$0 = p0;
       super();
    }
    public static void a(ConnectivityListenerImpl$2 p0,Network p1){
       p0.lambda$onAvailable$0(p1);
    }
    public static void b(ConnectivityListenerImpl$2 p0,Network p1,NetworkCapabilities p2){
       p0.lambda$onCapabilitiesChanged$1(p1, p2);
    }
    private void lambda$onAvailable$0(Network p0){
       this.onAvailableInternal(p0);
    }
    private void lambda$onCapabilitiesChanged$1(Network p0,NetworkCapabilities p1){
       this.onCapabilitiesChangedInternal(p0, p1);
    }
    private void onCapabilitiesChangedInternal(Network p0,NetworkCapabilities p1){
       Map map = ConnectivityListenerImpl.access$000(this.this$0);
       _monitor_enter(map);
       ConnectivityListenerImpl.access$000(this.this$0).put(p0, ConnectivityListenerImpl.access$200(this.this$0).getConnectionType(p1));
       _monitor_exit(map);
       this.this$0.notifyObservers();
    }
    public void onAvailable(Network p0){
       if (ConnectivityListenerImpl.access$300(this.this$0).shouldUseSingleThread()) {
          new Handler(Looper.getMainLooper()).post(new a(this, p0));
       }else {
          this.onAvailableInternal(p0);
       }
       return;
    }
    public void onAvailableInternal(Network p0){
       Map map;
       if (Build$VERSION.SDK_INT >= 26) {
          map = ConnectivityListenerImpl.access$000(this.this$0);
          _monitor_enter(map);
          ConnectivityListenerImpl.access$000(this.this$0).put(p0, ConnectionType.CONNECTION_TYPE_NONE);
          _monitor_exit(map);
       }else {
          map = ConnectivityListenerImpl.access$000(this.this$0);
          _monitor_enter(map);
          ConnectivityListenerImpl.access$000(this.this$0).put(p0, ConnectivityListenerImpl.access$200(this.this$0).getConnectionType(ConnectivityListenerImpl.access$100(this.this$0), p0));
          _monitor_exit(map);
          this.this$0.notifyObservers();
       }
       return;
    }
    public void onCapabilitiesChanged(Network p0,NetworkCapabilities p1){
       if (ConnectivityListenerImpl.access$300(this.this$0).shouldUseSingleThread()) {
          new Handler(Looper.getMainLooper()).post(new b(this, p0, p1));
       }else {
          this.onCapabilitiesChangedInternal(p0, p1);
       }
       return;
    }
    public void onLost(Network p0){
       Map map = ConnectivityListenerImpl.access$000(this.this$0);
       _monitor_enter(map);
       ConnectivityListenerImpl.access$000(this.this$0).remove(p0);
       _monitor_exit(map);
       this.this$0.notifyObservers();
    }
}
