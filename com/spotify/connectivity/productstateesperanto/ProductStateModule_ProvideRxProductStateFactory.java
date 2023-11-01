package com.spotify.connectivity.productstateesperanto.ProductStateModule_ProvideRxProductStateFactory;
import p.a02;
import p.tm5;
import java.lang.Object;
import io.reactivex.rxjava3.core.Observable;
import com.spotify.connectivity.productstate.RxProductState;
import p.il5;
import p.co5;

public final class ProductStateModule_ProvideRxProductStateFactory implements a02	// class@0007f6 from classes.dex
{
    private final tm5 productStateProvider;

    public void ProductStateModule_ProvideRxProductStateFactory(tm5 p0){
       super();
       this.productStateProvider = p0;
    }
    public static ProductStateModule_ProvideRxProductStateFactory create(tm5 p0){
       return new ProductStateModule_ProvideRxProductStateFactory(p0);
    }
    public static RxProductState provideRxProductState(Observable p0){
       RxProductState rxProductSta = il5.d(p0);
       co5.n(rxProductSta);
       return rxProductSta;
    }
    public RxProductState get(){
       return ProductStateModule_ProvideRxProductStateFactory.provideRxProductState(this.productStateProvider.get());
    }
    public Object get(){
       return this.get();
    }
}
