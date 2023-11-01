package com.spotify.connectivity.productstateesperanto.ProductStateModule_ProvideProductStateMethodsFactory;
import p.a02;
import p.tm5;
import java.lang.Object;
import com.spotify.connectivity.product_state.esperanto.proto.ProductStateClient;
import com.spotify.connectivity.productstateesperanto.ProductStateMethods;
import p.il5;
import p.co5;

public final class ProductStateModule_ProvideProductStateMethodsFactory implements a02	// class@0007f5 from classes.dex
{
    private final tm5 productStateClientProvider;

    public void ProductStateModule_ProvideProductStateMethodsFactory(tm5 p0){
       super();
       this.productStateClientProvider = p0;
    }
    public static ProductStateModule_ProvideProductStateMethodsFactory create(tm5 p0){
       return new ProductStateModule_ProvideProductStateMethodsFactory(p0);
    }
    public static ProductStateMethods provideProductStateMethods(ProductStateClient p0){
       ProductStateMethods productState = il5.c(p0);
       co5.n(productState);
       return productState;
    }
    public ProductStateMethods get(){
       return ProductStateModule_ProvideProductStateMethodsFactory.provideProductStateMethods(this.productStateClientProvider.get());
    }
    public Object get(){
       return this.get();
    }
}
