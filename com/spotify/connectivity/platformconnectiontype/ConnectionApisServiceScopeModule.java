package com.spotify.connectivity.platformconnectiontype.ConnectionApisServiceScopeModule;
import com.spotify.connectivity.platformconnectiontype.ConnectionApisServiceScopeModule$Companion;
import com.spotify.connectivity.platformconnectiontype.ConnectionApisImplLegacy;
import com.spotify.connectivity.connectiontype.ConnectionApis;

public interface abstract ConnectionApisServiceScopeModule	// class@000768 from classes.dex
{
    public static final ConnectionApisServiceScopeModule$Companion Companion;

    static {
       ConnectionApisServiceScopeModule.Companion = ConnectionApisServiceScopeModule$Companion.$$INSTANCE;
    }
    ConnectionApis bindConnectionApis(ConnectionApisImplLegacy p0);
}
