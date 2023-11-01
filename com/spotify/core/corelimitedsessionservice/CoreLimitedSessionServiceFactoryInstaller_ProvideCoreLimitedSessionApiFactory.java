package com.spotify.core.corelimitedsessionservice.CoreLimitedSessionServiceFactoryInstaller_ProvideCoreLimitedSessionApiFactory;
import p.a02;
import p.tm5;
import java.lang.Object;
import p.tb6;
import com.spotify.core.corelimitedsessionapi.CoreLimitedSessionApi;
import com.spotify.core.corelimitedsessionservice.CoreLimitedSessionServiceFactoryInstaller;
import p.co5;

public final class CoreLimitedSessionServiceFactoryInstaller_ProvideCoreLimitedSessionApiFactory implements a02	// class@000856 from classes.dex
{
    private final tm5 serviceProvider;

    public void CoreLimitedSessionServiceFactoryInstaller_ProvideCoreLimitedSessionApiFactory(tm5 p0){
       super();
       this.serviceProvider = p0;
    }
    public static CoreLimitedSessionServiceFactoryInstaller_ProvideCoreLimitedSessionApiFactory create(tm5 p0){
       return new CoreLimitedSessionServiceFactoryInstaller_ProvideCoreLimitedSessionApiFactory(p0);
    }
    public static CoreLimitedSessionApi provideCoreLimitedSessionApi(tb6 p0){
       CoreLimitedSessionApi uCoreLimited = CoreLimitedSessionServiceFactoryInstaller.INSTANCE.provideCoreLimitedSessionApi(p0);
       co5.n(uCoreLimited);
       return uCoreLimited;
    }
    public CoreLimitedSessionApi get(){
       return CoreLimitedSessionServiceFactoryInstaller_ProvideCoreLimitedSessionApiFactory.provideCoreLimitedSessionApi(this.serviceProvider.get());
    }
    public Object get(){
       return this.get();
    }
}
