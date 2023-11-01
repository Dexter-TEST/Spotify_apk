package com.spotify.core.coreservice.CoreServiceFactoryInstaller;
import java.lang.Object;
import p.tb6;
import com.spotify.core.coreapi.CoreApi;
import java.lang.String;
import p.co5;
import p.tm5;
import p.jt0;
import p.s04;
import com.spotify.core.coreservice.CoreServiceFactoryInstaller$provideCoreService$1;
import p.wf2;

public final class CoreServiceFactoryInstaller	// class@000866 from classes.dex
{
    public static final CoreServiceFactoryInstaller INSTANCE;

    static {
       CoreServiceFactoryInstaller.INSTANCE = new CoreServiceFactoryInstaller();
    }
    private void CoreServiceFactoryInstaller(){
       super();
    }
    public final CoreApi provideCoreApi(tb6 p0){
       co5.o(p0, "service");
       return p0.getApi();
    }
    public final tb6 provideCoreService(tm5 p0,jt0 p1){
       co5.o(p0, "dependenciesProvider");
       co5.o(p1, "runtime");
       s04 os04 = new s04("CoreService", new CoreServiceFactoryInstaller$provideCoreService$1(p0));
       throw null;
    }
}
