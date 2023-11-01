package com.spotify.connectivity.connectivityservice.ConnectivityServiceFactoryInstaller;
import java.lang.Object;
import p.tb6;
import com.spotify.connectivity.connectivityapi.ConnectivityApi;
import java.lang.String;
import p.co5;
import p.tm5;
import p.jt0;
import p.s04;
import com.spotify.connectivity.connectivityservice.ConnectivityServiceFactoryInstaller$provideConnectivityService$1;
import p.wf2;

public final class ConnectivityServiceFactoryInstaller	// class@0006da from classes.dex
{
    public static final ConnectivityServiceFactoryInstaller INSTANCE;

    static {
       ConnectivityServiceFactoryInstaller.INSTANCE = new ConnectivityServiceFactoryInstaller();
    }
    private void ConnectivityServiceFactoryInstaller(){
       super();
    }
    public final ConnectivityApi provideConnectivityApi(tb6 p0){
       co5.o(p0, "service");
       return p0.getApi();
    }
    public final tb6 provideConnectivityService(tm5 p0,jt0 p1){
       co5.o(p0, "dependenciesProvider");
       co5.o(p1, "runtime");
       s04 os04 = new s04("ConnectivityService", new ConnectivityServiceFactoryInstaller$provideConnectivityService$1(p0));
       throw null;
    }
}
