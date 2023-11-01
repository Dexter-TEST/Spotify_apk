package com.spotify.connectivity.productstateesperanto.ProductStateUtilModule_ProvideOnDemandEnabledObservableFactory;
import p.a02;
import p.tm5;
import java.lang.Object;
import com.spotify.connectivity.productstate.RxProductState;
import io.reactivex.rxjava3.core.Observable;
import com.spotify.connectivity.productstateesperanto.ProductStateUtilModule;
import p.co5;

public final class ProductStateUtilModule_ProvideOnDemandEnabledObservableFactory implements a02	// class@0007fa from classes.dex
{
    private final tm5 rxProductStateProvider;

    public void ProductStateUtilModule_ProvideOnDemandEnabledObservableFactory(tm5 p0){
       super();
       this.rxProductStateProvider = p0;
    }
    public static ProductStateUtilModule_ProvideOnDemandEnabledObservableFactory create(tm5 p0){
       return new ProductStateUtilModule_ProvideOnDemandEnabledObservableFactory(p0);
    }
    public static Observable provideOnDemandEnabledObservable(RxProductState p0){
       Observable observable = ProductStateUtilModule.provideOnDemandEnabledObservable(p0);
       co5.n(observable);
       return observable;
    }
    public Observable get(){
       return ProductStateUtilModule_ProvideOnDemandEnabledObservableFactory.provideOnDemandEnabledObservable(this.rxProductStateProvider.get());
    }
    public Object get(){
       return this.get();
    }
}
