package com.spotify.connectivity.connectivityservice.ConnectivityServiceFactoryInstaller_ProvideConnectivityApiFactory;
import p.a02;
import p.tm5;
import java.lang.Object;
import p.tb6;
import com.spotify.connectivity.connectivityapi.ConnectivityApi;
import com.spotify.connectivity.connectivityservice.ConnectivityServiceFactoryInstaller;
import p.co5;

public final class ConnectivityServiceFactoryInstaller_ProvideConnectivityApiFactory implements a02	// class@0006db from classes.dex
{
    private final tm5 serviceProvider;

    public void ConnectivityServiceFactoryInstaller_ProvideConnectivityApiFactory(tm5 p0){
       super();
       this.serviceProvider = p0;
    }
    public static ConnectivityServiceFactoryInstaller_ProvideConnectivityApiFactory create(tm5 p0){
       return new ConnectivityServiceFactoryInstaller_ProvideConnectivityApiFactory(p0);
    }
    public static ConnectivityApi provideConnectivityApi(tb6 p0){
       ConnectivityApi uConnectivit = ConnectivityServiceFactoryInstaller.INSTANCE.provideConnectivityApi(p0);
       co5.n(uConnectivit);
       return uConnectivit;
    }
    public ConnectivityApi get(){
       return ConnectivityServiceFactoryInstaller_ProvideConnectivityApiFactory.provideConnectivityApi(this.serviceProvider.get());
    }
    public Object get(){
       return this.get();
    }
}
