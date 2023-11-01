package com.spotify.connectivity.platformconnectiontype.ConnectivityUtilImpl;
import com.spotify.connectivity.connectiontype.ConnectivityUtil;
import com.spotify.connectivity.platformconnectiontype.PlatformConnectionTypeProperties;
import java.lang.Object;
import android.net.ConnectivityManager;
import java.util.List;
import java.util.ArrayList;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.content.Context;
import com.spotify.connectivity.connectiontype.ConnectionType;
import java.lang.String;
import java.util.Iterator;
import java.util.Comparator;
import java.util.Collections;
import android.telephony.TelephonyManager;

public final class ConnectivityUtilImpl implements ConnectivityUtil	// class@00078d from classes.dex
{
    private final PlatformConnectionTypeProperties mProperties;

    public void ConnectivityUtilImpl(PlatformConnectionTypeProperties p0){
       super();
       this.mProperties = p0;
    }
    private List getAllInternetCapabilites(ConnectivityManager p0){
       ArrayList uArrayList = new ArrayList();
       Network[] allNetworks = p0.getAllNetworks();
       int len = allNetworks.length;
       int i = 0;
       while (i < len) {
          NetworkCapabilities networkCapab = p0.getNetworkCapabilities(allNetworks[i]);
          if (this.hasUnrestrictedInternetCapabilities(networkCapab)) {
             uArrayList.add(networkCapab);
          }
          i = i + 1;
       }
       return uArrayList;
    }
    private boolean hasUnrestrictedInternetCapabilities(NetworkCapabilities p0){
       int i = 0;
       if (p0 != null && (p0.hasCapability(12) && (p0.hasCapability(13) && (this.mProperties.netCapabilitiesValidatedDisregardedEnabled() && (p0.hasTransport(i) || p0.hasCapability(16)))))) {
          i = true;
       }
       return i;
    }
    public ConnectionType getConnectionType(Context p0){
       return this.getConnectionType(p0.getSystemService("connectivity"));
    }
    public ConnectionType getConnectionType(Context p0,Network p1){
       return this.getConnectionType(p0.getSystemService("connectivity").getNetworkCapabilities(p1));
    }
    public ConnectionType getConnectionType(ConnectivityManager p0){
       if (p0 == null) {
          return ConnectionType.CONNECTION_TYPE_NONE;
       }
       List allInternetC = this.getAllInternetCapabilites(p0);
       if (allInternetC.isEmpty()) {
          return ConnectionType.CONNECTION_TYPE_NONE;
       }
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = allInternetC.iterator();
       while (iterator.hasNext()) {
          uArrayList.add(this.getConnectionType(iterator.next()));
       }
       Collections.sort(uArrayList, Collections.reverseOrder());
       return uArrayList.get(0);
    }
    public ConnectionType getConnectionType(ConnectivityManager p0,TelephonyManager p1){
       return this.getConnectionType(p0);
    }
    public ConnectionType getConnectionType(NetworkCapabilities p0){
       int linkDownstre;
       if (!this.hasUnrestrictedInternetCapabilities(p0)) {
          return ConnectionType.CONNECTION_TYPE_NONE;
       }
       if (p0.hasTransport(3)) {
          return ConnectionType.CONNECTION_TYPE_ETHERNET;
       }
       if (p0.hasTransport(1)) {
          return ConnectionType.CONNECTION_TYPE_WLAN;
       }
       if (p0.hasTransport(2)) {
          if (p0.hasCapability(11)) {
             return ConnectionType.CONNECTION_TYPE_WLAN;
          }
          return ConnectionType.CONNECTION_TYPE_3G;
       }else if(p0.hasTransport(0)){
          if ((linkDownstre = p0.getLinkDownstreamBandwidthKbps()) > 0x2710) {
             return ConnectionType.CONNECTION_TYPE_4G;
          }
          if (linkDownstre > 100) {
             return ConnectionType.CONNECTION_TYPE_3G;
          }
          if (linkDownstre > 50) {
             return ConnectionType.CONNECTION_TYPE_EDGE;
          }
          return ConnectionType.CONNECTION_TYPE_GPRS;
       }else {
          p0.toString();
          return ConnectionType.CONNECTION_TYPE_3G;
       }
    }
}
