package com.spotify.core.corelimitedsessionservice.CoreLimitedSessionServiceFactoryInstaller;
import java.lang.Object;
import p.tb6;
import com.spotify.core.corelimitedsessionapi.CoreLimitedSessionApi;
import java.lang.String;
import p.co5;
import p.tm5;
import p.jt0;
import p.s04;
import com.spotify.core.corelimitedsessionservice.CoreLimitedSessionServiceFactoryInstaller$provideCoreLimitedSessionService$1;
import p.wf2;

public final class CoreLimitedSessionServiceFactoryInstaller	// class@000855 from classes.dex
{
    public static final CoreLimitedSessionServiceFactoryInstaller INSTANCE;

    static {
       CoreLimitedSessionServiceFactoryInstaller.INSTANCE = new CoreLimitedSessionServiceFactoryInstaller();
    }
    private void CoreLimitedSessionServiceFactoryInstaller(){
       super();
    }
    public final CoreLimitedSessionApi provideCoreLimitedSessionApi(tb6 p0){
       co5.o(p0, "service");
       return p0.getApi();
    }
    public final tb6 provideCoreLimitedSessionService(tm5 p0,jt0 p1){
       co5.o(p0, "dependenciesProvider");
       co5.o(p1, "runtime");
       s04 os04 = new s04("CoreLimitedSessionService", new CoreLimitedSessionServiceFactoryInstaller$provideCoreLimitedSessionService$1(p0));
       throw null;
    }
}
