package com.spotify.connectivity.productstateesperanto.ProductStateModule_ProvideProductStateClientFactory;
import p.a02;
import p.tm5;
import java.lang.Object;
import p.i16;
import com.spotify.connectivity.product_state.esperanto.proto.ProductStateClient;
import p.il5;
import p.co5;

public final class ProductStateModule_ProvideProductStateClientFactory implements a02	// class@0007f4 from classes.dex
{
    private final tm5 rxRouterProvider;

    public void ProductStateModule_ProvideProductStateClientFactory(tm5 p0){
       super();
       this.rxRouterProvider = p0;
    }
    public static ProductStateModule_ProvideProductStateClientFactory create(tm5 p0){
       return new ProductStateModule_ProvideProductStateClientFactory(p0);
    }
    public static ProductStateClient provideProductStateClient(i16 p0){
       ProductStateClient productState = il5.b(p0);
       co5.n(productState);
       return productState;
    }
    public ProductStateClient get(){
       return ProductStateModule_ProvideProductStateClientFactory.provideProductStateClient(this.rxRouterProvider.get());
    }
    public Object get(){
       return this.get();
    }
}
