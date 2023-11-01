package com.spotify.core.coreservice.CoreServiceFactoryInstaller$provideCoreService$1;
import p.wf2;
import p.gi3;
import p.tm5;
import java.lang.Object;
import p.tb6;
import com.spotify.core.coreservice.CoreServiceFactoryComponent$Factory;
import com.spotify.core.coreservice.DaggerCoreServiceFactoryComponent;
import java.lang.String;
import p.co5;
import com.spotify.core.coreservice.CoreServiceDependencies;
import com.spotify.core.coreservice.CoreServiceFactoryComponent;
import com.spotify.core.coreservice.CoreService;

final class CoreServiceFactoryInstaller$provideCoreService$1 extends gi3 implements wf2	// class@000865 from classes.dex
{
    final tm5 $dependenciesProvider;

    public void CoreServiceFactoryInstaller$provideCoreService$1(tm5 p0){
       this.$dependenciesProvider = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final tb6 invoke(){
       Object obj = this.$dependenciesProvider.get();
       co5.l(obj, "dependenciesProvider.get\(\)");
       return DaggerCoreServiceFactoryComponent.factory().create(obj).coreService();
    }
}
