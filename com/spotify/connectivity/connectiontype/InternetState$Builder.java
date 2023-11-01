package com.spotify.connectivity.connectiontype.InternetState$Builder;
import com.spotify.connectivity.connectiontype.InternetState;
import com.spotify.connectivity.connectiontype.ConnectionType;

public interface abstract InternetState$Builder	// class@00069c from classes.dex
{

    InternetState build();
    InternetState$Builder connectionType(ConnectionType p0);
    InternetState$Builder flightModeEnabled(boolean p0);
    InternetState$Builder mobileDataDisabled(boolean p0);
}
