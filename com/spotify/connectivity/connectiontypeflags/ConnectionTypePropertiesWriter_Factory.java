package com.spotify.connectivity.connectiontypeflags.ConnectionTypePropertiesWriter_Factory;
import p.a02;
import p.tm5;
import java.lang.Object;
import p.tn6;
import com.spotify.connectivity.connectiontypeflags.ConnectionTypePropertiesWriter;

public final class ConnectionTypePropertiesWriter_Factory implements a02	// class@0006be from classes.dex
{
    private final tm5 sharedPreferencesProvider;

    public void ConnectionTypePropertiesWriter_Factory(tm5 p0){
       super();
       this.sharedPreferencesProvider = p0;
    }
    public static ConnectionTypePropertiesWriter_Factory create(tm5 p0){
       return new ConnectionTypePropertiesWriter_Factory(p0);
    }
    public static ConnectionTypePropertiesWriter newInstance(tn6 p0){
       return new ConnectionTypePropertiesWriter(p0);
    }
    public ConnectionTypePropertiesWriter get(){
       return ConnectionTypePropertiesWriter_Factory.newInstance(this.sharedPreferencesProvider.get());
    }
    public Object get(){
       return this.get();
    }
}
