package com.spotify.core.corelimitedsessionservice.CoreLimitedSessionServiceFactoryInstaller_ProvideCoreLimitedSessionServiceFactory;
import p.a02;
import p.tm5;
import java.lang.Object;
import p.jt0;
import p.tb6;
import com.spotify.core.corelimitedsessionservice.CoreLimitedSessionServiceFactoryInstaller;
import p.co5;
import p.tp2;

public final class CoreLimitedSessionServiceFactoryInstaller_ProvideCoreLimitedSessionServiceFactory implements a02	// class@000857 from classes.dex
{
    private final tm5 dependenciesProvider;
    private final tm5 runtimeProvider;

    public void CoreLimitedSessionServiceFactoryInstaller_ProvideCoreLimitedSessionServiceFactory(tm5 p0,tm5 p1){
       super();
       this.dependenciesProvider = p0;
       this.runtimeProvider = p1;
    }
    public static CoreLimitedSessionServiceFactoryInstaller_ProvideCoreLimitedSessionServiceFactory create(tm5 p0,tm5 p1){
       return new CoreLimitedSessionServiceFactoryInstaller_ProvideCoreLimitedSessionServiceFactory(p0, p1);
    }
    public static tb6 provideCoreLimitedSessionService(tm5 p0,jt0 p1){
       tb6 otb6 = CoreLimitedSessionServiceFactoryInstaller.INSTANCE.provideCoreLimitedSessionService(p0, p1);
       co5.n(otb6);
       return otb6;
    }
    public Object get(){
       return this.get();
    }
    public tb6 get(){
       tp2.v(this.runtimeProvider.get());
       return CoreLimitedSessionServiceFactoryInstaller_ProvideCoreLimitedSessionServiceFactory.provideCoreLimitedSessionService(this.dependenciesProvider, null);
    }
}
