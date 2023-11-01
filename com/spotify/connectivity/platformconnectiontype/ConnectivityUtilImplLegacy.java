package com.spotify.connectivity.platformconnectiontype.ConnectivityUtilImplLegacy;
import com.spotify.connectivity.connectiontype.ConnectivityUtil;
import java.lang.Object;
import android.net.ConnectivityManager;
import java.util.List;
import java.util.ArrayList;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.spotify.connectivity.connectiontype.ConnectionType;
import java.lang.String;
import android.content.Context;
import java.util.Iterator;
import java.util.Comparator;
import java.util.Collections;

public final class ConnectivityUtilImplLegacy implements ConnectivityUtil	// class@00078e from classes.dex
{
    private static final int TYPE_COMPANION_PROXY = 16;
    private static final int TYPE_MOBILE_IMS = 11;
    private static final int TYPE_WIFI_P2P = 13;

    public void ConnectivityUtilImplLegacy(){
       super();
    }
    private static List getAllInternetCapabilites(ConnectivityManager p0){
       ArrayList uArrayList = new ArrayList();
       Network[] allNetworks = p0.getAllNetworks();
       int len = allNetworks.length;
       int i = 0;
       while (i < len) {
          NetworkCapabilities networkCapab = p0.getNetworkCapabilities(allNetworks[i]);
          if (ConnectivityUtilImplLegacy.hasUnrestrictedInternetCapabilities(networkCapab)) {
             uArrayList.add(networkCapab);
          }
          i = i + 1;
       }
       return uArrayList;
    }
    private static List getConnectedNetworkInfos(ConnectivityManager p0){
       NetworkInfo networkInfo;
       ArrayList uArrayList = new ArrayList();
       Network[] allNetworks = p0.getAllNetworks();
       int len = allNetworks.length;
       int i = 0;
       while (i < len) {
          if ((networkInfo = p0.getNetworkInfo(allNetworks[i])) != null && networkInfo.isConnected()) {
             uArrayList.add(networkInfo);
          }
          i = i + 1;
       }
       return uArrayList;
    }
    private ConnectionType getConnectionType(NetworkCapabilities p0,TelephonyManager p1){
       if (!ConnectivityUtilImplLegacy.hasUnrestrictedInternetCapabilities(p0)) {
          return ConnectionType.CONNECTION_TYPE_NONE;
       }
       if (p0.hasTransport(3)) {
          return ConnectionType.CONNECTION_TYPE_ETHERNET;
       }
       if (p0.hasTransport(1)) {
          return ConnectionType.CONNECTION_TYPE_WLAN;
       }
       if (p0.hasTransport(0)) {
          ConnectionType mobileConnec = (p1 != null)? this.getMobileConnectionType(p1.getNetworkType()): ConnectionType.CONNECTION_TYPE_3G;
          return mobileConnec;
       }else {
          p0.toString();
          return ConnectionType.CONNECTION_TYPE_3G;
       }
    }
    private ConnectionType getConnectionType(NetworkInfo p0,TelephonyManager p1){
       int type = p0.getType();
       switch (type){
           case 0:
           case 2:
           case 3:
           case 4:
           case 5:
             ConnectionType mobileConnec = (p1 != null)? this.getMobileConnectionType(p1.getNetworkType()): ConnectionType.CONNECTION_TYPE_3G;
             return mobileConnec;
             break;
           case 1:
           case 13:
             return ConnectionType.CONNECTION_TYPE_WLAN;
           case 6:
           case 17:
           case 7:
           case 9:
             return ConnectionType.CONNECTION_TYPE_ETHERNET;
           case 11:
             return ConnectionType.CONNECTION_TYPE_GPRS;
           case 16:
             return ConnectionType.CONNECTION_TYPE_COMPANION_PROXY;
           default:
             if (ConnectivityManager.isNetworkTypeValid(type)) {
                p0.getTypeName();
             }
             return ConnectionType.CONNECTION_TYPE_UNKNOWN;
       }
       return ConnectionType.CONNECTION_TYPE_3G;
    }
    private ConnectionType getMobileConnectionType(int p0){
       switch (p0){
           case 0:
             return ConnectionType.CONNECTION_TYPE_UNKNOWN;
           case 1:
           case 4:
           case 11:
             return ConnectionType.CONNECTION_TYPE_GPRS;
           case 2:
             return ConnectionType.CONNECTION_TYPE_EDGE;
           case 3:
           case 6:
           case 7:
           case 8:
           case 9:
           case 10:
           case 12:
           case 14:
           case 15:
           case 5:
             return ConnectionType.CONNECTION_TYPE_3G;
           case 13:
             return ConnectionType.CONNECTION_TYPE_4G;
           default:
             return ConnectionType.CONNECTION_TYPE_3G;
       }
    }
    private static boolean hasUnrestrictedInternetCapabilities(NetworkCapabilities p0){
       boolean b = (p0 != null && (p0.hasCapability(12) && p0.hasCapability(13)))? true: false;
       return b;
    }
    public ConnectionType getConnectionType(Context p0){
       return this.getConnectionType(p0.getSystemService("connectivity"), p0.getSystemService("phone"));
    }
    public ConnectionType getConnectionType(Context p0,Network p1){
       return ConnectionType.CONNECTION_TYPE_NONE;
    }
    public ConnectionType getConnectionType(ConnectivityManager p0){
       return this.getConnectionType(p0, null);
    }
    public ConnectionType getConnectionType(ConnectivityManager p0,TelephonyManager p1){
       NetworkInfo activeNetwor;
       if (p0 == null) {
          return ConnectionType.CONNECTION_TYPE_NONE;
       }
       if ((activeNetwor = p0.getActiveNetworkInfo()) != null && activeNetwor.isConnected()) {
          return this.getConnectionType(activeNetwor, p1);
       }
       List connectedNet = ConnectivityUtilImplLegacy.getConnectedNetworkInfos(p0);
       if (!connectedNet.isEmpty()) {
          ArrayList uArrayList = new ArrayList();
          Iterator iterator = connectedNet.iterator();
          while (iterator.hasNext()) {
             uArrayList.add(this.getConnectionType(iterator.next(), p1));
          }
          Collections.sort(uArrayList, Collections.reverseOrder());
          return uArrayList.get(0);
       }else {
          List allInternetC = ConnectivityUtilImplLegacy.getAllInternetCapabilites(p0);
          if (allInternetC.isEmpty()) {
             return ConnectionType.CONNECTION_TYPE_NONE;
          }
          ArrayList uArrayList1 = new ArrayList();
          Iterator iterator1 = allInternetC.iterator();
          while (iterator1.hasNext()) {
             uArrayList1.add(this.getConnectionType(iterator1.next(), p1));
          }
          Collections.sort(uArrayList1, Collections.reverseOrder());
          return uArrayList1.get(0);
       }
    }
    public ConnectionType getConnectionType(NetworkCapabilities p0){
       return ConnectionType.CONNECTION_TYPE_NONE;
    }
}
