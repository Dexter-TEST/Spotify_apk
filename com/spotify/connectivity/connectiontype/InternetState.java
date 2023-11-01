package com.spotify.connectivity.connectiontype.InternetState;
import java.lang.Object;
import com.spotify.connectivity.connectiontype.InternetState$Builder;
import com.spotify.connectivity.connectiontype.AutoValue_InternetState$Builder;
import com.spotify.connectivity.connectiontype.ConnectionType;

public abstract class InternetState	// class@00069d from classes.dex
{

    public void InternetState(){
       super();
    }
    public static InternetState$Builder builder(){
       return new AutoValue_InternetState$Builder().connectionType(ConnectionType.CONNECTION_TYPE_UNKNOWN).flightModeEnabled(false).mobileDataDisabled(false);
    }
    public abstract ConnectionType connectionType();
    public abstract boolean flightModeEnabled();
    public abstract boolean mobileDataDisabled();
    public abstract InternetState$Builder toBuilder();
}
