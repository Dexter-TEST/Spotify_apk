package com.spotify.core.coreservice.NucleusCoreServiceInstallerKt;
import p.jt0;
import p.wf2;
import p.ra3;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.spotify.core.coreservice.NucleusCoreServiceInstallerKt$installCoreService$1;

public final class NucleusCoreServiceInstallerKt	// class@00086f from classes.dex
{

    public static final ra3 installCoreService(jt0 p0,wf2 p1,wf2 p2,wf2 p3,wf2 p4,wf2 p5,wf2 p6){
       co5.o(p0, "contextRuntime");
       co5.o(p1, "coreThreadingApi");
       co5.o(p2, "corePreferencesApi");
       co5.o(p3, "applicationScopeConfiguration");
       co5.o(p4, "connectivityApi");
       co5.o(p5, "sharedCosmosRouterApi");
       co5.o(p6, "eventSenderCoreBridge");
       NucleusCoreServiceInstallerKt$installCoreService$1 oinstallCore = new NucleusCoreServiceInstallerKt$installCoreService$1(p1, p2, p3, p4, p5, p6);
       p0.a();
       return null;
    }
}
