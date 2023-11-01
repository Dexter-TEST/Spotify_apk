package com.spotify.connectivity.connectiontypeflags.ConnectionTypeFlagsModule_Companion_ProvideNetCapabilitiesValidatedDisabledValueFactory;
import p.a02;
import p.tm5;
import java.lang.Object;
import com.spotify.connectivity.connectiontypeflags.ConnectionTypePropertiesReader;
import com.spotify.connectivity.connectiontypeflags.ConnectionTypeFlagsModule;
import com.spotify.connectivity.connectiontypeflags.ConnectionTypeFlagsModule$Companion;
import java.lang.Boolean;

public final class ConnectionTypeFlagsModule_Companion_ProvideNetCapabilitiesValidatedDisabledValueFactory implements a02	// class@0006b3 from classes.dex
{
    private final tm5 connectionTypePropertiesReaderProvider;

    public void ConnectionTypeFlagsModule_Companion_ProvideNetCapabilitiesValidatedDisabledValueFactory(tm5 p0){
       super();
       this.connectionTypePropertiesReaderProvider = p0;
    }
    public static ConnectionTypeFlagsModule_Companion_ProvideNetCapabilitiesValidatedDisabledValueFactory create(tm5 p0){
       return new ConnectionTypeFlagsModule_Companion_ProvideNetCapabilitiesValidatedDisabledValueFactory(p0);
    }
    public static boolean provideNetCapabilitiesValidatedDisabledValue(ConnectionTypePropertiesReader p0){
       return ConnectionTypeFlagsModule.Companion.provideNetCapabilitiesValidatedDisabledValue(p0);
    }
    public Boolean get(){
       return Boolean.valueOf(ConnectionTypeFlagsModule_Companion_ProvideNetCapabilitiesValidatedDisabledValueFactory.provideNetCapabilitiesValidatedDisabledValue(this.connectionTypePropertiesReaderProvider.get()));
    }
    public Object get(){
       return this.get();
    }
}
