package com.spotify.connectivity.connectivityservice.NucleusConnectivityServiceInstallerKt;
import p.jt0;
import p.wf2;
import p.ra3;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.spotify.connectivity.connectivityservice.NucleusConnectivityServiceInstallerKt$installConnectivityService$1;

public final class NucleusConnectivityServiceInstallerKt	// class@0006e6 from classes.dex
{

    public static final ra3 installConnectivityService(jt0 p0,wf2 p1,wf2 p2,wf2 p3,wf2 p4,wf2 p5,wf2 p6,wf2 p7,wf2 p8,wf2 p9){
       co5.o(p0, "contextRuntime");
       co5.o(p1, "analyticsDelegate");
       co5.o(p2, "coreThreadingApi");
       co5.o(p3, "corePreferencesApi");
       Object obj = p4;
       co5.o(obj, "connectivityApplicationScopeConfiguration");
       Object obj1 = p5;
       co5.o(obj1, "mobileDeviceInfo");
       Object obj2 = p6;
       co5.o(obj2, "sharedCosmosRouterApi");
       Object obj3 = p7;
       co5.o(obj3, "context");
       Object obj4 = p8;
       co5.o(obj4, "okHttpClient");
       Object obj5 = p9;
       co5.o(obj5, "connectionTypeObservable");
       NucleusConnectivityServiceInstallerKt$installConnectivityService$1 oinstallConn = new NucleusConnectivityServiceInstallerKt$installConnectivityService$1(p1, p2, p3, obj, obj1, obj2, obj3, obj4, obj5);
       p0.a();
       return null;
    }
}
