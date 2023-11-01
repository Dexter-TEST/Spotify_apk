package com.spotify.connectivity.productstateesperanto.ProductStateUtilModule_ProvideOnDemandEnabledFlowableFactory;
import p.a02;
import p.tm5;
import java.lang.Object;
import com.spotify.connectivity.flags.RxFlags;
import io.reactivex.rxjava3.core.Flowable;
import com.spotify.connectivity.productstateesperanto.ProductStateUtilModule;
import p.co5;

public final class ProductStateUtilModule_ProvideOnDemandEnabledFlowableFactory implements a02	// class@0007f9 from classes.dex
{
    private final tm5 rxFlagsProvider;

    public void ProductStateUtilModule_ProvideOnDemandEnabledFlowableFactory(tm5 p0){
       super();
       this.rxFlagsProvider = p0;
    }
    public static ProductStateUtilModule_ProvideOnDemandEnabledFlowableFactory create(tm5 p0){
       return new ProductStateUtilModule_ProvideOnDemandEnabledFlowableFactory(p0);
    }
    public static Flowable provideOnDemandEnabledFlowable(RxFlags p0){
       Flowable uFlowable = ProductStateUtilModule.provideOnDemandEnabledFlowable(p0);
       co5.n(uFlowable);
       return uFlowable;
    }
    public Flowable get(){
       return ProductStateUtilModule_ProvideOnDemandEnabledFlowableFactory.provideOnDemandEnabledFlowable(this.rxFlagsProvider.get());
    }
    public Object get(){
       return this.get();
    }
}
