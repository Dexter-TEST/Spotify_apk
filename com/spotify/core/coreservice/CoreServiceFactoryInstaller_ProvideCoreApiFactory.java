package com.spotify.core.coreservice.CoreServiceFactoryInstaller_ProvideCoreApiFactory;
import p.a02;
import p.tm5;
import java.lang.Object;
import p.tb6;
import com.spotify.core.coreapi.CoreApi;
import com.spotify.core.coreservice.CoreServiceFactoryInstaller;
import p.co5;

public final class CoreServiceFactoryInstaller_ProvideCoreApiFactory implements a02	// class@000867 from classes.dex
{
    private final tm5 serviceProvider;

    public void CoreServiceFactoryInstaller_ProvideCoreApiFactory(tm5 p0){
       super();
       this.serviceProvider = p0;
    }
    public static CoreServiceFactoryInstaller_ProvideCoreApiFactory create(tm5 p0){
       return new CoreServiceFactoryInstaller_ProvideCoreApiFactory(p0);
    }
    public static CoreApi provideCoreApi(tb6 p0){
       CoreApi uCoreApi = CoreServiceFactoryInstaller.INSTANCE.provideCoreApi(p0);
       co5.n(uCoreApi);
       return uCoreApi;
    }
    public CoreApi get(){
       return CoreServiceFactoryInstaller_ProvideCoreApiFactory.provideCoreApi(this.serviceProvider.get());
    }
    public Object get(){
       return this.get();
    }
}
