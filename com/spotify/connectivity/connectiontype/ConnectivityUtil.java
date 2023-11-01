package com.spotify.connectivity.connectiontype.ConnectivityUtil;
import android.content.Context;
import com.spotify.connectivity.connectiontype.ConnectionType;
import android.net.Network;
import android.net.ConnectivityManager;
import android.telephony.TelephonyManager;
import android.net.NetworkCapabilities;

public interface abstract ConnectivityUtil	// class@000695 from classes.dex
{

    ConnectionType getConnectionType(Context p0);
    ConnectionType getConnectionType(Context p0,Network p1);
    ConnectionType getConnectionType(ConnectivityManager p0);
    ConnectionType getConnectionType(ConnectivityManager p0,TelephonyManager p1);
    ConnectionType getConnectionType(NetworkCapabilities p0);
}
