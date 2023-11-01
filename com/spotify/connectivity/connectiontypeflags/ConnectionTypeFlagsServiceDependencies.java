package com.spotify.connectivity.connectiontypeflags.ConnectionTypeFlagsServiceDependencies;
import p.pt5;
import p.tn6;
import java.lang.Object;
import java.lang.String;
import p.co5;

public final class ConnectionTypeFlagsServiceDependencies	// class@0006b6 from classes.dex
{
    private final pt5 remoteConfigUnauthResolverApi;
    private final tn6 sharedPrefs;

    public void ConnectionTypeFlagsServiceDependencies(pt5 p0,tn6 p1){
       co5.o(p0, "remoteConfigUnauthResolverApi");
       co5.o(p1, "sharedPrefs");
       super();
       this.sharedPrefs = p1;
    }
    public final pt5 getRemoteConfigUnauthResolverApi(){
       return null;
    }
    public final tn6 getSharedPrefs(){
       return this.sharedPrefs;
    }
}
