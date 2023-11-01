package com.spotify.connectivity.connectivityservice.ConnectivityServiceFactoryInstaller$provideConnectivityService$1;
import p.wf2;
import p.gi3;
import p.tm5;
import java.lang.Object;
import p.tb6;
import com.spotify.connectivity.connectivityservice.ConnectivityServiceFactoryComponent$Factory;
import com.spotify.connectivity.connectivityservice.DaggerConnectivityServiceFactoryComponent;
import java.lang.String;
import p.co5;
import com.spotify.connectivity.connectivityservice.ConnectivityServiceDependencies;
import com.spotify.connectivity.connectivityservice.ConnectivityServiceFactoryComponent;
import com.spotify.connectivity.connectivityservice.ConnectivityService;

final class ConnectivityServiceFactoryInstaller$provideConnectivityService$1 extends gi3 implements wf2	// class@0006d9 from classes.dex
{
    final tm5 $dependenciesProvider;

    public void ConnectivityServiceFactoryInstaller$provideConnectivityService$1(tm5 p0){
       this.$dependenciesProvider = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final tb6 invoke(){
       Object obj = this.$dependenciesProvider.get();
       co5.l(obj, "dependenciesProvider.get\(\)");
       return DaggerConnectivityServiceFactoryComponent.factory().create(obj).connectivityService();
    }
}
