package com.spotify.connectivity.productstateesperanto.ProductStateMethodsImpl_Factory;
import p.a02;
import p.tm5;
import java.lang.Object;
import com.spotify.connectivity.product_state.esperanto.proto.ProductStateClient;
import com.spotify.connectivity.productstateesperanto.ProductStateMethodsImpl;

public final class ProductStateMethodsImpl_Factory implements a02	// class@0007f1 from classes.dex
{
    private final tm5 productStateClientProvider;

    public void ProductStateMethodsImpl_Factory(tm5 p0){
       super();
       this.productStateClientProvider = p0;
    }
    public static ProductStateMethodsImpl_Factory create(tm5 p0){
       return new ProductStateMethodsImpl_Factory(p0);
    }
    public static ProductStateMethodsImpl newInstance(ProductStateClient p0){
       return new ProductStateMethodsImpl(p0);
    }
    public ProductStateMethodsImpl get(){
       return ProductStateMethodsImpl_Factory.newInstance(this.productStateClientProvider.get());
    }
    public Object get(){
       return this.get();
    }
}
