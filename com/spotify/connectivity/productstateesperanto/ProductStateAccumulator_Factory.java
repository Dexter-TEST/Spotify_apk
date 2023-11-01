package com.spotify.connectivity.productstateesperanto.ProductStateAccumulator_Factory;
import p.a02;
import java.lang.Object;
import com.spotify.connectivity.productstateesperanto.ProductStateAccumulator_Factory$InstanceHolder;
import com.spotify.connectivity.productstateesperanto.ProductStateAccumulator;

public final class ProductStateAccumulator_Factory implements a02	// class@0007eb from classes.dex
{

    public void ProductStateAccumulator_Factory(){
       super();
    }
    public static ProductStateAccumulator_Factory create(){
       return ProductStateAccumulator_Factory$InstanceHolder.access$000();
    }
    public static ProductStateAccumulator newInstance(){
       return new ProductStateAccumulator();
    }
    public ProductStateAccumulator get(){
       return ProductStateAccumulator_Factory.newInstance();
    }
    public Object get(){
       return this.get();
    }
}
