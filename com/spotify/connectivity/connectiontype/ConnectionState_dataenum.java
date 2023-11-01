package com.spotify.connectivity.connectiontype.ConnectionState_dataenum;
import p.ct7;
import com.spotify.connectivity.connectiontype.OfflineReason;

interface abstract ConnectionState_dataenum	// class@000691 from classes.dex
{

    ct7 Connecting();
    ct7 Offline(OfflineReason p0);
    ct7 Online();
}
