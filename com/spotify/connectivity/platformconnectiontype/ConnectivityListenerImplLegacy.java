package com.spotify.connectivity.platformconnectiontype.ConnectivityListenerImplLegacy;
import com.spotify.connectivity.connectiontype.ConnectivityListener;
import java.util.concurrent.CopyOnWriteArraySet;
import android.content.Context;
import com.spotify.connectivity.connectiontype.ConnectivityUtil;
import com.spotify.connectivity.platformconnectiontype.ConnectivityListenerImplLegacy$1;
import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import android.telephony.TelephonyManager;
import android.net.ConnectivityManager;
import java.util.Set;
import java.util.List;
import android.content.BroadcastReceiver;
import java.lang.Throwable;
import p.jl;
import android.telephony.PhoneStateListener;
import com.spotify.connectivity.connectiontype.ConnectionType;
import java.util.Iterator;
import com.spotify.connectivity.connectiontype.ConnectivityObserver;
import android.content.IntentFilter;
import android.content.Intent;
import com.spotify.connectivity.platformconnectiontype.ConnectivityListenerImplLegacy$2;

class ConnectivityListenerImplLegacy extends ConnectivityListener	// class@000789 from classes.dex
{
    private final ConnectivityManager mConnectivityManager;
    private final BroadcastReceiver mConnectivityReceiver;
    private final ConnectivityUtil mConnectivityUtil;
    private final Context mContext;
    private boolean mListening;
    private PhoneStateListener mTelephonyListener;
    private final TelephonyManager mTelephonyManager;
    private static final Set LISTENERS;
    private static ConnectionType sOverrideConnectionType;
    private static boolean sOverrideRoaming;

    static {
       ConnectivityListenerImplLegacy.LISTENERS = new CopyOnWriteArraySet();
    }
    public void ConnectivityListenerImplLegacy(Context p0,ConnectivityUtil p1){
       super();
       this.mConnectivityReceiver = new ConnectivityListenerImplLegacy$1(this);
       p0.getClass();
       p0 = p0.getApplicationContext();
       this.mContext = p0;
       this.mTelephonyManager = p0.getSystemService("phone");
       this.mConnectivityManager = p0.getSystemService("connectivity");
       this.mConnectivityUtil = p1;
    }
    private synchronized void hangUp(){
       ConnectivityListenerImplLegacy tmTelephonyM;
       ConnectivityListenerImplLegacy tmTelephonyL;
       if (this.mListening == null) {
          return;
       }
       ConnectivityListenerImplLegacy.LISTENERS.remove(this);
       ConnectivityListener tmConnectivi = this.mConnectivityObservers;
       try{
          tmConnectivi.clear();
          this.mContext.unregisterReceiver(this.mConnectivityReceiver);
       }catch(java.lang.IllegalArgumentException e0){
          jl.f("Should have been registered", e0);
       }
       if ((tmTelephonyM = this.mTelephonyManager) != null && (tmTelephonyL = this.mTelephonyListener) != null) {
          tmTelephonyM.listen(tmTelephonyL, 0);
       }
       this.mListening = false;
       return;
    }
    private boolean isRoaming(){
       if (ConnectivityListenerImplLegacy.sOverrideConnectionType != null) {
          return ConnectivityListenerImplLegacy.sOverrideRoaming;
       }
       return this.mTelephonyManager.isNetworkRoaming();
    }
    private static void onDataConnectionStateChanged(ConnectionType p0,boolean p1){
       Iterator iterator = ConnectivityListenerImplLegacy.LISTENERS.iterator();
       while (iterator.hasNext()) {
          iterator.next().setConnectionType(p0, p1);
       }
       return;
    }
    private void setConnectionType(ConnectionType p0,boolean p1){
       ConnectivityListener tmConnectivi = this.mConnectivityObservers;
       _monitor_enter(tmConnectivi);
       Iterator iterator = this.mConnectivityObservers.iterator();
       while (iterator.hasNext()) {
          iterator.next().setConnectivityType(p0, p1);
       }
       _monitor_exit(tmConnectivi);
       return;
    }
    public static void setOverrideConnectionState(ConnectionType p0,boolean p1){
       ConnectivityListenerImplLegacy.sOverrideConnectionType = p0;
       ConnectivityListenerImplLegacy.sOverrideRoaming = p1;
       if (p0 == null) {
          Iterator iterator = ConnectivityListenerImplLegacy.LISTENERS.iterator();
          while (iterator.hasNext()) {
             iterator.next().notifyObservers();
          }
       }else {
          ConnectivityListenerImplLegacy.onDataConnectionStateChanged(p0, p1);
       }
       return;
    }
    public void destroy(){
       this.hangUp();
    }
    public ConnectionType getConnectionType(){
       ConnectionType sOverrideCon;
       if ((sOverrideCon = ConnectivityListenerImplLegacy.sOverrideConnectionType) != null) {
          return sOverrideCon;
       }
       return this.mConnectivityUtil.getConnectionType(this.mConnectivityManager, this.mTelephonyManager);
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
       if (this.mListening != null) {
          return;
       }
       this.mContext.registerReceiver(this.mConnectivityReceiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
       if (this.mTelephonyManager != null) {
          ConnectivityListenerImplLegacy$2 u2 = new ConnectivityListenerImplLegacy$2(this);
          this.mTelephonyListener = u2;
          this.mTelephonyManager.listen(u2, 64);
       }
       this.mListening = true;
       ConnectivityListenerImplLegacy.LISTENERS.add(this);
       return;
    }
}
