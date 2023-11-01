package com.spotify.connectivity.productstateesperanto.RxProductStateUpdaterImpl_Factory;
import p.a02;
import p.tm5;
import java.lang.Object;
import com.spotify.connectivity.productstateesperanto.ProductStateMethods;
import com.spotify.connectivity.productstateesperanto.RxProductStateUpdaterImpl;

public final class RxProductStateUpdaterImpl_Factory implements a02	// class@000801 from classes.dex
{
    private final tm5 productStateMethodsProvider;

    public void RxProductStateUpdaterImpl_Factory(tm5 p0){
       super();
       this.productStateMethodsProvider = p0;
    }
    public static RxProductStateUpdaterImpl_Factory create(tm5 p0){
       return new RxProductStateUpdaterImpl_Factory(p0);
    }
    public static RxProductStateUpdaterImpl newInstance(ProductStateMethods p0){
       return new RxProductStateUpdaterImpl(p0);
    }
    public RxProductStateUpdaterImpl get(){
       return RxProductStateUpdaterImpl_Factory.newInstance(this.productStateMethodsProvider.get());
    }
    public Object get(){
       return this.get();
    }
}
