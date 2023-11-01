package com.spotify.connectivity.connectiontypeflags.NucleusConnectionTypeFlagsServiceInstallerKt$installConnectionTypeFlagsService$1;
import p.wf2;
import p.gi3;
import java.lang.Object;
import p.tb6;
import com.spotify.connectivity.connectiontypeflags.ConnectionTypeFlagsServiceDependencies;
import p.tp2;
import p.tn6;
import p.pt5;
import com.spotify.connectivity.connectiontypeflags.ConnectionTypeFlagsService;
import com.spotify.connectivity.connectiontypeflags.ConnectionTypeFlagsServiceKt;

final class NucleusConnectionTypeFlagsServiceInstallerKt$installConnectionTypeFlagsService$1 extends gi3 implements wf2	// class@0006c0 from classes.dex
{
    final wf2 $remoteConfigUnauthResolverApi;
    final wf2 $sharedPrefs;

    public void NucleusConnectionTypeFlagsServiceInstallerKt$installConnectionTypeFlagsService$1(wf2 p0,wf2 p1){
       this.$remoteConfigUnauthResolverApi = p0;
       this.$sharedPrefs = p1;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final tb6 invoke(){
       tp2.v(this.$remoteConfigUnauthResolverApi.invoke());
       return ConnectionTypeFlagsServiceKt.createConnectionTypeFlagsService(new ConnectionTypeFlagsServiceDependencies(null, this.$sharedPrefs.invoke()));
    }
}
