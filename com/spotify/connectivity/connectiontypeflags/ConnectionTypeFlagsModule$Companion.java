package com.spotify.connectivity.connectiontypeflags.ConnectionTypeFlagsModule$Companion;
import java.lang.Object;
import com.spotify.connectivity.connectiontypeflags.ConnectionTypePropertiesReader;
import java.lang.String;
import p.co5;

public final class ConnectionTypeFlagsModule$Companion	// class@0006b1 from classes.dex
{
    static final ConnectionTypeFlagsModule$Companion $$INSTANCE;

    static {
       ConnectionTypeFlagsModule$Companion.$$INSTANCE = new ConnectionTypeFlagsModule$Companion();
    }
    private void ConnectionTypeFlagsModule$Companion(){
       super();
    }
    public final boolean provideNetCapabilitiesValidatedDisabledValue(ConnectionTypePropertiesReader p0){
       co5.o(p0, "connectionTypePropertiesReader");
       return p0.getNetCapabilitiesValidatedDisabled();
    }
    public final boolean provideShouldUseSingleThread(ConnectionTypePropertiesReader p0){
       co5.o(p0, "connectionTypePropertiesReader");
       return p0.getShouldUseSingleThread();
    }
}
