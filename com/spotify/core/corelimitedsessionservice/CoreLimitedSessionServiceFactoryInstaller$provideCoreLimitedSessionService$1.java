package com.spotify.core.corelimitedsessionservice.CoreLimitedSessionServiceFactoryInstaller$provideCoreLimitedSessionService$1;
import p.wf2;
import p.gi3;
import p.tm5;
import java.lang.Object;
import p.tb6;
import com.spotify.core.corelimitedsessionservice.CoreLimitedSessionServiceFactoryComponent$Factory;
import com.spotify.core.corelimitedsessionservice.DaggerCoreLimitedSessionServiceFactoryComponent;
import java.lang.String;
import p.co5;
import com.spotify.core.corelimitedsessionservice.CoreLimitedSessionServiceDependencies;
import com.spotify.core.corelimitedsessionservice.CoreLimitedSessionServiceFactoryComponent;
import com.spotify.core.corelimitedsessionservice.CoreLimitedSessionService;

final class CoreLimitedSessionServiceFactoryInstaller$provideCoreLimitedSessionService$1 extends gi3 implements wf2	// class@000854 from classes.dex
{
    final tm5 $dependenciesProvider;

    public void CoreLimitedSessionServiceFactoryInstaller$provideCoreLimitedSessionService$1(tm5 p0){
       this.$dependenciesProvider = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final tb6 invoke(){
       Object obj = this.$dependenciesProvider.get();
       co5.l(obj, "dependenciesProvider.get\(\)");
       return DaggerCoreLimitedSessionServiceFactoryComponent.factory().create(obj).coreLimitedSessionService();
    }
}
