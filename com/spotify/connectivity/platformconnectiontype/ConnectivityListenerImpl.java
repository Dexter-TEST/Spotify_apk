package com.spotify.connectivity.platformconnectiontype.ConnectivityListenerImpl;
import com.spotify.connectivity.connectiontype.ConnectivityListener;
import android.content.Context;
import com.spotify.connectivity.connectiontype.ConnectivityUtil;
import com.spotify.connectivity.platformconnectiontype.PlatformConnectionTypeProperties;
import com.spotify.connectivity.platformconnectiontype.ConnectivityListenerImpl$1;
import java.util.HashMap;
import com.spotify.connectivity.platformconnectiontype.ConnectivityListenerImpl$2;
import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import android.telephony.TelephonyManager;
import android.net.ConnectivityManager;
import android.os.PowerManager;
import java.util.Map;
import p.eh;
import android.net.NetworkRequest;
import android.net.NetworkRequest$Builder;
import java.util.List;
import android.content.BroadcastReceiver;
import android.telephony.PhoneStateListener;
import android.net.ConnectivityManager$NetworkCallback;
import com.spotify.connectivity.connectiontype.ConnectionType;
import com.spotify.base.java.logging.Logger;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import com.spotify.connectivity.connectiontype.ConnectivityObserver;
import com.spotify.connectivity.platformconnectiontype.ConnectivityListenerImpl$3;
import android.content.IntentFilter;
import android.content.Intent;

class ConnectivityListenerImpl extends ConnectivityListener	// class@000786 from classes.dex
{
    private final ConnectivityManager mConnectivityManager;
    private final ConnectivityUtil mConnectivityUtil;
    private final Context mContext;
    private final BroadcastReceiver mIdleReceiver;
    private boolean mListening;
    private final ConnectivityManager$NetworkCallback mNetworkCallback;
    private final Map mNetworkToConnectionTypeMap;
    private final PowerManager mPowerManager;
    private final PlatformConnectionTypeProperties mProperties;
    private PhoneStateListener mTelephonyListener;
    private final TelephonyManager mTelephonyManager;

    public void ConnectivityListenerImpl(Context p0,ConnectivityUtil p1,PlatformConnectionTypeProperties p2){
       super();
       this.mIdleReceiver = new ConnectivityListenerImpl$1(this);
       this.mNetworkToConnectionTypeMap = new HashMap();
       this.mNetworkCallback = new ConnectivityListenerImpl$2(this);
       p0.getClass();
       p0 = p0.getApplicationContext();
       this.mContext = p0;
       this.mProperties = p2;
       this.mTelephonyManager = p0.getSystemService("phone");
       this.mConnectivityManager = p0.getSystemService("connectivity");
       this.mPowerManager = p0.getSystemService("power");
       this.mConnectivityUtil = p1;
    }
    public static Map access$000(ConnectivityListenerImpl p0){
       return p0.mNetworkToConnectionTypeMap;
    }
    public static Context access$100(ConnectivityListenerImpl p0){
       return p0.mContext;
    }
    public static ConnectivityUtil access$200(ConnectivityListenerImpl p0){
       return p0.mConnectivityUtil;
    }
    public static PlatformConnectionTypeProperties access$300(ConnectivityListenerImpl p0){
       return p0.mProperties;
    }
    private boolean isIdle(){
       String packageName = this.mContext.getPackageName();
       boolean b = (eh.z(this.mPowerManager) && !eh.A(this.mPowerManager, packageName))? true: false;
       return b;
    }
    private boolean isRoaming(){
       return this.mTelephonyManager.isNetworkRoaming();
    }
    public NetworkRequest buildNetworkRequest(){
       NetworkRequest$Builder uBuilder = new NetworkRequest$Builder().addCapability(12).addCapability(13);
       if (!this.mProperties.netCapabilitiesValidatedDisregardedEnabled()) {
          uBuilder.addCapability(16);
       }
       return uBuilder.build();
    }
    public void destroy(){
       ConnectivityListenerImpl tmTelephonyM;
       ConnectivityListenerImpl tmTelephonyL;
       if (this.mListening == null) {
          return;
       }
       ConnectivityListener tmConnectivi = this.mConnectivityObservers;
       _monitor_enter(tmConnectivi);
       this.mConnectivityObservers.clear();
       _monitor_exit(tmConnectivi);
       this.mContext.unregisterReceiver(this.mIdleReceiver);
       if ((tmTelephonyM = this.mTelephonyManager) != null && (tmTelephonyL = this.mTelephonyListener) != null) {
          tmTelephonyM.listen(tmTelephonyL, 0);
       }
       this.mConnectivityManager.unregisterNetworkCallback(this.mNetworkCallback);
       tmTelephonyL = this.mNetworkToConnectionTypeMap;
       _monitor_enter(tmTelephonyL);
       this.mNetworkToConnectionTypeMap.clear();
       _monitor_exit(tmTelephonyL);
       this.mListening = false;
       return;
    }
    public ConnectionType getConnectionType(){
       if (this.isIdle()) {
          Object[] objArray = new Object[0];
          Logger.e("Connectivity status: \(idle\)", objArray);
       }
       ConnectionType cONNECTION_T = ConnectionType.CONNECTION_TYPE_NONE;
       ConnectivityListenerImpl tmNetworkToC = this.mNetworkToConnectionTypeMap;
       _monitor_enter(tmNetworkToC);
       if (!this.mNetworkToConnectionTypeMap.isEmpty()) {
          cONNECTION_T = Collections.max(this.mNetworkToConnectionTypeMap.values());
       }
       _monitor_exit(tmNetworkToC);
       return cONNECTION_T;
    }
    public void notifyObservers(){
       ConnectionType connectionTy = this.getConnectionType();
       boolean b = this.isRoaming();
       ConnectivityListener tmConnectivi = this.mConnectivityObservers;
       _monitor_enter(tmConnectivi);
       Iterator iterator = this.mConnectivityObservers.iterator();
       while (iterator.hasNext()) {
          iterator.next().setConnectivityType(connectionTy, b);
       }
       _monitor_exit(tmConnectivi);
       return;
    }
    public void setup(){
       if (this.mConnectivityManager != null) {
          this.mConnectivityManager.registerNetworkCallback(this.buildNetworkRequest(), this.mNetworkCallback);
       }
       if (this.mTelephonyManager != null) {
          ConnectivityListenerImpl$3 u3 = new ConnectivityListenerImpl$3(this);
          this.mTelephonyListener = u3;
          this.mTelephonyManager.listen(u3, 64);
       }
       this.mContext.registerReceiver(this.mIdleReceiver, new IntentFilter("android.os.action.DEVICE_IDLE_MODE_CHANGED"));
       this.mListening = true;
       return;
    }
}
