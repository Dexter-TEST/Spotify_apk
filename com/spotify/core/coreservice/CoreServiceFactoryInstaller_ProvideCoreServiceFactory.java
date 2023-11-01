package com.spotify.core.coreservice.CoreServiceFactoryInstaller_ProvideCoreServiceFactory;
import p.a02;
import p.tm5;
import java.lang.Object;
import p.jt0;
import p.tb6;
import com.spotify.core.coreservice.CoreServiceFactoryInstaller;
import p.co5;
import p.tp2;

public final class CoreServiceFactoryInstaller_ProvideCoreServiceFactory implements a02	// class@000868 from classes.dex
{
    private final tm5 dependenciesProvider;
    private final tm5 runtimeProvider;

    public void CoreServiceFactoryInstaller_ProvideCoreServiceFactory(tm5 p0,tm5 p1){
       super();
       this.dependenciesProvider = p0;
       this.runtimeProvider = p1;
    }
    public static CoreServiceFactoryInstaller_ProvideCoreServiceFactory create(tm5 p0,tm5 p1){
       return new CoreServiceFactoryInstaller_ProvideCoreServiceFactory(p0, p1);
    }
    public static tb6 provideCoreService(tm5 p0,jt0 p1){
       tb6 otb6 = CoreServiceFactoryInstaller.INSTANCE.provideCoreService(p0, p1);
       co5.n(otb6);
       return otb6;
    }
    public Object get(){
       return this.get();
    }
    public tb6 get(){
       tp2.v(this.runtimeProvider.get());
       return CoreServiceFactoryInstaller_ProvideCoreServiceFactory.provideCoreService(this.dependenciesProvider, null);
    }
}
