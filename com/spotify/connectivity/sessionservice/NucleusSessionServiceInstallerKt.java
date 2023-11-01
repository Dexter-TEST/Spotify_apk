package com.spotify.connectivity.sessionservice.NucleusSessionServiceInstallerKt;
import p.jt0;
import p.wf2;
import p.ra3;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.spotify.connectivity.sessionservice.NucleusSessionServiceInstallerKt$installSessionService$1;

public final class NucleusSessionServiceInstallerKt	// class@00081b from classes.dex
{

    public static final ra3 installSessionService(jt0 p0,wf2 p1,wf2 p2,wf2 p3,wf2 p4,wf2 p5,wf2 p6,wf2 p7){
       co5.o(p0, "contextRuntime");
       co5.o(p1, "temporarySessionLoginFlowDependencies");
       co5.o(p2, "coreThreadingApi");
       co5.o(p3, "analyticsDelegate");
       co5.o(p4, "connectivityApi");
       co5.o(p5, "coreApi");
       Object obj = p6;
       co5.o(obj, "loginControllerConfiguration");
       Object obj1 = p7;
       co5.o(obj1, "clientInfo");
       NucleusSessionServiceInstallerKt$installSessionService$1 oinstallSess = new NucleusSessionServiceInstallerKt$installSessionService$1(p1, p2, p3, p4, p5, obj, obj1);
       p0.a();
       return null;
    }
}
