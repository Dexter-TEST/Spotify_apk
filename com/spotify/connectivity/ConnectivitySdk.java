package com.spotify.connectivity.ConnectivitySdk;
import com.spotify.connectivity.ConnectivitySdk$Companion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.Object;
import com.spotify.connectivity.MobileDeviceInfo;

public final class ConnectivitySdk	// class@0005b7 from classes.dex
{
    public static final ConnectivitySdk$Companion Companion;

    static {
       ConnectivitySdk.Companion = new ConnectivitySdk$Companion(null);
    }
    public void ConnectivitySdk(){
       super();
    }
    public static native final void setMobileDeviceInfo(MobileDeviceInfo p0);
}
