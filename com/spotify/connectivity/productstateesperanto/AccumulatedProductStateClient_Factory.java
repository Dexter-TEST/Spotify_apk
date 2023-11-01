package com.spotify.connectivity.productstateesperanto.AccumulatedProductStateClient_Factory;
import p.a02;
import p.tm5;
import java.lang.Object;
import com.spotify.connectivity.productstateesperanto.ProductStateMethods;
import p.mi0;
import io.reactivex.rxjava3.core.ObservableTransformer;
import com.spotify.connectivity.productstateesperanto.AccumulatedProductStateClient;

public final class AccumulatedProductStateClient_Factory implements a02	// class@0007e5 from classes.dex
{
    private final tm5 accumulatorProvider;
    private final tm5 coldStartupTimeKeeperProvider;
    private final tm5 productStateMethodsProvider;

    public void AccumulatedProductStateClient_Factory(tm5 p0,tm5 p1,tm5 p2){
       super();
       this.productStateMethodsProvider = p0;
       this.coldStartupTimeKeeperProvider = p1;
       this.accumulatorProvider = p2;
    }
    public static AccumulatedProductStateClient_Factory create(tm5 p0,tm5 p1,tm5 p2){
       return new AccumulatedProductStateClient_Factory(p0, p1, p2);
    }
    public static AccumulatedProductStateClient newInstance(ProductStateMethods p0,mi0 p1,ObservableTransformer p2){
       return new AccumulatedProductStateClient(p0, p1, p2);
    }
    public AccumulatedProductStateClient get(){
       return AccumulatedProductStateClient_Factory.newInstance(this.productStateMethodsProvider.get(), this.coldStartupTimeKeeperProvider.get(), this.accumulatorProvider.get());
    }
    public Object get(){
       return this.get();
    }
}
