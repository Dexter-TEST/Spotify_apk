package com.spotify.connectivity.productstateesperanto.ProductStateDefaultModule_ProvideProductStateFactory;
import p.a02;
import p.tm5;
import java.lang.Object;
import com.spotify.connectivity.productstateesperanto.LoggedInProductStateClient;
import io.reactivex.rxjava3.core.Scheduler;
import p.mi0;
import io.reactivex.rxjava3.core.Observable;
import p.cl5;
import p.co5;

public final class ProductStateDefaultModule_ProvideProductStateFactory implements a02	// class@0007ed from classes.dex
{
    private final tm5 mColdStartupTimeKeeperProvider;
    private final tm5 mainThreadProvider;
    private final tm5 productStateClientProvider;

    public void ProductStateDefaultModule_ProvideProductStateFactory(tm5 p0,tm5 p1,tm5 p2){
       super();
       this.productStateClientProvider = p0;
       this.mainThreadProvider = p1;
       this.mColdStartupTimeKeeperProvider = p2;
    }
    public static ProductStateDefaultModule_ProvideProductStateFactory create(tm5 p0,tm5 p1,tm5 p2){
       return new ProductStateDefaultModule_ProvideProductStateFactory(p0, p1, p2);
    }
    public static Observable provideProductState(LoggedInProductStateClient p0,Scheduler p1,mi0 p2){
       Observable observable = cl5.d(p0, p1, p2);
       co5.n(observable);
       return observable;
    }
    public Observable get(){
       return ProductStateDefaultModule_ProvideProductStateFactory.provideProductState(this.productStateClientProvider.get(), this.mainThreadProvider.get(), this.mColdStartupTimeKeeperProvider.get());
    }
    public Object get(){
       return this.get();
    }
}
