package com.spotify.connectivity.connectivitysessionservice.NucleusConnectivitySessionServiceInstallerKt;
import p.jt0;
import p.wf2;
import p.ra3;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.spotify.connectivity.connectivitysessionservice.NucleusConnectivitySessionServiceInstallerKt$installConnectivitySessionService$1;

public final class NucleusConnectivitySessionServiceInstallerKt	// class@0006f2 from classes.dex
{

    public static final ra3 installConnectivitySessionService(jt0 p0,wf2 p1,wf2 p2,wf2 p3,wf2 p4,wf2 p5,wf2 p6,wf2 p7,wf2 p8,wf2 p9){
       co5.o(p0, "contextRuntime");
       co5.o(p1, "coreThreadingApi");
       co5.o(p2, "sharedCosmosRouterApi");
       co5.o(p3, "connectivityApi");
       Object obj = p4;
       co5.o(obj, "analyticsDelegate");
       Object obj1 = p5;
       co5.o(obj1, "authenticatedScopeConfiguration");
       Object obj2 = p6;
       co5.o(obj2, "sessionApi");
       Object obj3 = p7;
       co5.o(obj3, "authAnalyticsDelegate");
       Object obj4 = p8;
       co5.o(obj4, "pubSubClient");
       Object obj5 = p9;
       co5.o(obj5, "snapshotIdResolver");
       NucleusConnectivitySessionServiceInstallerKt$installConnectivitySessionService$1 oinstallConn = new NucleusConnectivitySessionServiceInstallerKt$installConnectivitySessionService$1(p1, p2, p3, obj, obj1, obj2, obj3, obj4, obj5);
       p0.a();
       return null;
    }
}
