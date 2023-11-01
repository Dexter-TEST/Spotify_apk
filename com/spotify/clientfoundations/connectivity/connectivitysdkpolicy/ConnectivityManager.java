package com.spotify.clientfoundations.connectivity.connectivitysdkpolicy.ConnectivityManager;
import com.spotify.connectivity.ConnectionType;

public interface abstract ConnectivityManager	// class@000552 from classes.dex
{

    void destroy();
    ConnectionType getConnectionType();
    boolean isNetworkAllowed();
    boolean isNetworkAllowedIfRoaming();
    boolean isRoaming();
    boolean isSyncAllowedOverCellular();
    boolean isSyncAllowedOverWifi();
    void setConnectionType(ConnectionType p0,boolean p1);
    void setNetworkAllowed(boolean p0);
    void setNetworkAllowedIfRoaming(boolean p0);
    void setSyncAllowedOverCellular(boolean p0);
    void setSyncAllowedOverWifi(boolean p0);
}
