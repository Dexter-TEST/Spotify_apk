package com.spotify.connectivity.connectiontype.OfflineStateController_Factory;
import p.a02;
import p.tm5;
import java.lang.Object;
import com.spotify.connectivity.connectiontype.CoreConnectionState;
import io.reactivex.rxjava3.core.Scheduler;
import com.spotify.connectivity.connectiontype.OfflineStateController;

public final class OfflineStateController_Factory implements a02	// class@0006ab from classes.dex
{
    private final tm5 endpointProvider;
    private final tm5 mainSchedulerProvider;

    public void OfflineStateController_Factory(tm5 p0,tm5 p1){
       super();
       this.endpointProvider = p0;
       this.mainSchedulerProvider = p1;
    }
    public static OfflineStateController_Factory create(tm5 p0,tm5 p1){
       return new OfflineStateController_Factory(p0, p1);
    }
    public static OfflineStateController newInstance(CoreConnectionState p0,Scheduler p1){
       return new OfflineStateController(p0, p1);
    }
    public OfflineStateController get(){
       return OfflineStateController_Factory.newInstance(this.endpointProvider.get(), this.mainSchedulerProvider.get());
    }
    public Object get(){
       return this.get();
    }
}
