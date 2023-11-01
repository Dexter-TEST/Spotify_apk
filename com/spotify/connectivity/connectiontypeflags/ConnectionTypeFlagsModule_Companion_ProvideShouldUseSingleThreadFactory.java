package com.spotify.connectivity.connectiontypeflags.ConnectionTypeFlagsModule_Companion_ProvideShouldUseSingleThreadFactory;
import p.a02;
import p.tm5;
import java.lang.Object;
import com.spotify.connectivity.connectiontypeflags.ConnectionTypePropertiesReader;
import com.spotify.connectivity.connectiontypeflags.ConnectionTypeFlagsModule;
import com.spotify.connectivity.connectiontypeflags.ConnectionTypeFlagsModule$Companion;
import java.lang.Boolean;

public final class ConnectionTypeFlagsModule_Companion_ProvideShouldUseSingleThreadFactory implements a02	// class@0006b4 from classes.dex
{
    private final tm5 connectionTypePropertiesReaderProvider;

    public void ConnectionTypeFlagsModule_Companion_ProvideShouldUseSingleThreadFactory(tm5 p0){
       super();
       this.connectionTypePropertiesReaderProvider = p0;
    }
    public static ConnectionTypeFlagsModule_Companion_ProvideShouldUseSingleThreadFactory create(tm5 p0){
       return new ConnectionTypeFlagsModule_Companion_ProvideShouldUseSingleThreadFactory(p0);
    }
    public static boolean provideShouldUseSingleThread(ConnectionTypePropertiesReader p0){
       return ConnectionTypeFlagsModule.Companion.provideShouldUseSingleThread(p0);
    }
    public Boolean get(){
       return Boolean.valueOf(ConnectionTypeFlagsModule_Companion_ProvideShouldUseSingleThreadFactory.provideShouldUseSingleThread(this.connectionTypePropertiesReaderProvider.get()));
    }
    public Object get(){
       return this.get();
    }
}
