package com.spotify.clientfoundations.connectivity.connectivitysdkpolicyimpl.NativeConnectivityManager;
import com.spotify.clientfoundations.connectivity.connectivitysdkpolicy.ConnectivityManager;
import com.spotify.clientfoundations.connectivity.connectivitysdkpolicyimpl.NativeConnectivityManager$Companion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.Object;
import com.spotify.clientfoundations.cosmos.cosmosimpl.NativeRouter;
import com.spotify.connectivity.Scheduler;
import com.spotify.connectivity.AnalyticsDelegate;
import com.spotify.connectivity.ConnectionType;

public final class NativeConnectivityManager implements ConnectivityManager	// class@000558 from classes.dex
{
    private boolean isNetworkAllowed;
    private boolean isNetworkAllowedIfRoaming;
    private final boolean isRoaming;
    private boolean isSyncAllowedOverCellular;
    private boolean isSyncAllowedOverWifi;
    private long nThis;
    public static final NativeConnectivityManager$Companion Companion;

    static {
       NativeConnectivityManager.Companion = new NativeConnectivityManager$Companion(null);
    }
    private void NativeConnectivityManager(){
       super();
    }
    public static native final NativeConnectivityManager create(NativeRouter p0,Scheduler p1,AnalyticsDelegate p2,boolean p3);
    public native void destroy();
    public native ConnectionType getConnectionType();
    public native boolean isNetworkAllowed();
    public native boolean isNetworkAllowedIfRoaming();
    public native boolean isRoaming();
    public native boolean isSyncAllowedOverCellular();
    public native boolean isSyncAllowedOverWifi();
    public native void setConnectionType(ConnectionType p0,boolean p1);
    public native void setNetworkAllowed(boolean p0);
    public native void setNetworkAllowedIfRoaming(boolean p0);
    public native void setSyncAllowedOverCellular(boolean p0);
    public native void setSyncAllowedOverWifi(boolean p0);
}
