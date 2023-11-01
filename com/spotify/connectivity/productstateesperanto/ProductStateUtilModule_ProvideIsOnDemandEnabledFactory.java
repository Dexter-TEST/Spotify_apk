package com.spotify.connectivity.productstateesperanto.ProductStateUtilModule_ProvideIsOnDemandEnabledFactory;
import p.a02;
import p.tm5;
import java.lang.Object;
import com.spotify.connectivity.flags.Flags;
import com.spotify.connectivity.productstateesperanto.ProductStateUtilModule;
import java.lang.Boolean;

public final class ProductStateUtilModule_ProvideIsOnDemandEnabledFactory implements a02	// class@0007f8 from classes.dex
{
    private final tm5 flagsProvider;

    public void ProductStateUtilModule_ProvideIsOnDemandEnabledFactory(tm5 p0){
       super();
       this.flagsProvider = p0;
    }
    public static ProductStateUtilModule_ProvideIsOnDemandEnabledFactory create(tm5 p0){
       return new ProductStateUtilModule_ProvideIsOnDemandEnabledFactory(p0);
    }
    public static boolean provideIsOnDemandEnabled(Flags p0){
       return ProductStateUtilModule.provideIsOnDemandEnabled(p0);
    }
    public Boolean get(){
       return Boolean.valueOf(ProductStateUtilModule_ProvideIsOnDemandEnabledFactory.provideIsOnDemandEnabled(this.flagsProvider.get()));
    }
    public Object get(){
       return this.get();
    }
}
