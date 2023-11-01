package com.spotify.connectivity.connectivityservice.ConnectivityServiceFactoryInstaller_ProvideConnectivityServiceFactory;
import p.a02;
import p.tm5;
import java.lang.Object;
import p.jt0;
import p.tb6;
import com.spotify.connectivity.connectivityservice.ConnectivityServiceFactoryInstaller;
import p.co5;
import p.tp2;

public final class ConnectivityServiceFactoryInstaller_ProvideConnectivityServiceFactory implements a02	// class@0006dc from classes.dex
{
    private final tm5 dependenciesProvider;
    private final tm5 runtimeProvider;

    public void ConnectivityServiceFactoryInstaller_ProvideConnectivityServiceFactory(tm5 p0,tm5 p1){
       super();
       this.dependenciesProvider = p0;
       this.runtimeProvider = p1;
    }
    public static ConnectivityServiceFactoryInstaller_ProvideConnectivityServiceFactory create(tm5 p0,tm5 p1){
       return new ConnectivityServiceFactoryInstaller_ProvideConnectivityServiceFactory(p0, p1);
    }
    public static tb6 provideConnectivityService(tm5 p0,jt0 p1){
       tb6 otb6 = ConnectivityServiceFactoryInstaller.INSTANCE.provideConnectivityService(p0, p1);
       co5.n(otb6);
       return otb6;
    }
    public Object get(){
       return this.get();
    }
    public tb6 get(){
       tp2.v(this.runtimeProvider.get());
       return ConnectivityServiceFactoryInstaller_ProvideConnectivityServiceFactory.provideConnectivityService(this.dependenciesProvider, null);
    }
}
