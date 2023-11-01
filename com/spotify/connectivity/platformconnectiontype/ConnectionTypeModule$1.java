package com.spotify.connectivity.platformconnectiontype.ConnectionTypeModule$1;
import com.spotify.connectivity.platformconnectiontype.PlatformConnectionTypeProperties;
import java.lang.Object;

class ConnectionTypeModule$1 implements PlatformConnectionTypeProperties	// class@000773 from classes.dex
{
    final boolean val$netCapabilitiesValidatedDisabled;
    final boolean val$shouldUseSingleThread;

    public void ConnectionTypeModule$1(boolean p0,boolean p1){
       this.val$shouldUseSingleThread = p0;
       this.val$netCapabilitiesValidatedDisabled = p1;
       super();
    }
    public boolean netCapabilitiesValidatedDisregardedEnabled(){
       return this.val$netCapabilitiesValidatedDisabled;
    }
    public boolean shouldUseSingleThread(){
       return this.val$shouldUseSingleThread;
    }
}
