package com.spotify.connectivity.connectiontypeflags.ConnectionTypePropertiesReader_Factory;
import p.a02;
import p.tm5;
import java.lang.Object;
import p.tn6;
import com.spotify.connectivity.connectiontypeflags.ConnectionTypePropertiesReader;

public final class ConnectionTypePropertiesReader_Factory implements a02	// class@0006bc from classes.dex
{
    private final tm5 sharedPreferencesProvider;

    public void ConnectionTypePropertiesReader_Factory(tm5 p0){
       super();
       this.sharedPreferencesProvider = p0;
    }
    public static ConnectionTypePropertiesReader_Factory create(tm5 p0){
       return new ConnectionTypePropertiesReader_Factory(p0);
    }
    public static ConnectionTypePropertiesReader newInstance(tn6 p0){
       return new ConnectionTypePropertiesReader(p0);
    }
    public ConnectionTypePropertiesReader get(){
       return ConnectionTypePropertiesReader_Factory.newInstance(this.sharedPreferencesProvider.get());
    }
    public Object get(){
       return this.get();
    }
}
