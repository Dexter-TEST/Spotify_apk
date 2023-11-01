package com.spotify.connectivity.productstateesperanto.ProductStateModule_ProvideLoggedInFactory;
import p.a02;
import p.tm5;
import java.lang.Object;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import p.il5;
import p.co5;

public final class ProductStateModule_ProvideLoggedInFactory implements a02	// class@0007f3 from classes.dex
{
    private final tm5 sessionStateProvider;

    public void ProductStateModule_ProvideLoggedInFactory(tm5 p0){
       super();
       this.sessionStateProvider = p0;
    }
    public static ProductStateModule_ProvideLoggedInFactory create(tm5 p0){
       return new ProductStateModule_ProvideLoggedInFactory(p0);
    }
    public static Observable provideLoggedIn(Flowable p0){
       Observable observable = il5.a(p0);
       co5.n(observable);
       return observable;
    }
    public Observable get(){
       return ProductStateModule_ProvideLoggedInFactory.provideLoggedIn(this.sessionStateProvider.get());
    }
    public Object get(){
       return this.get();
    }
}
