package com.spotify.connectivity.connectiontype.OfflineStateController;
import com.spotify.connectivity.connectiontype.CoreConnectionState;
import io.reactivex.rxjava3.core.Scheduler;
import java.lang.Object;
import p.fd1;
import p.v05;
import io.reactivex.rxjava3.core.Observable;
import p.zo0;
import java.lang.Class;
import p.tv4;
import java.lang.Throwable;
import com.spotify.connectivity.connectiontype.OfflineState;
import java.lang.String;
import com.spotify.base.java.logging.Logger;
import com.spotify.connectivity.connectiontype.OfflineState$State;
import io.reactivex.rxjava3.core.Single;
import p.ir0;
import io.reactivex.rxjava3.disposables.Disposable;

public class OfflineStateController	// class@0006aa from classes.dex
{
    private final fd1 mDisposable;
    private final CoreConnectionState mEndpoint;
    private final Scheduler mMainScheduler;
    private final Observable mObservable;
    private final ir0 mPutOnErrorHandler;
    private final ir0 mPutOnNextHandler;

    public void OfflineStateController(CoreConnectionState p0,Scheduler p1){
       super();
       this.mDisposable = new fd1();
       this.mPutOnNextHandler = new v05(0);
       this.mPutOnErrorHandler = new v05(1);
       this.mEndpoint = p0;
       this.mMainScheduler = p1;
       zo0 ozo0 = p0.connection().observeOn(p1).distinctUntilChanged().replay(1);
       ozo0.getClass();
       this.mObservable = new tv4(ozo0);
    }
    public static void a(Throwable p0){
       OfflineStateController.lambda$new$1(p0);
    }
    public static void b(OfflineState p0){
       OfflineStateController.lambda$new$0(p0);
    }
    private static void lambda$new$0(OfflineState p0){
       p0.offline();
    }
    private static void lambda$new$1(Throwable p0){
       Object[] objArray = new Object[0];
       Logger.j(p0, "PUT OfflineState error!", objArray);
    }
    public Observable observable(){
       return this.mObservable;
    }
    public void setOfflineMode(boolean p0){
       OfflineState$State fORCED_OFFLI = (p0)? OfflineState$State.FORCED_OFFLINE: OfflineState$State.ONLINE;
       this.mDisposable.a(this.mEndpoint.set(OfflineState.create(fORCED_OFFLI)).observeOn(this.mMainScheduler).subscribe(this.mPutOnNextHandler, this.mPutOnErrorHandler));
       return;
    }
}
