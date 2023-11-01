package com.spotify.connectivity.productstateesperanto.ProductStateAccumulator;
import io.reactivex.rxjava3.core.ObservableTransformer;
import java.lang.Object;
import java.util.Map;
import p.r45;
import p.dt5;
import java.util.HashMap;
import p.w51;
import p.m73;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import com.spotify.connectivity.productstateesperanto.a;
import p.w00;

class ProductStateAccumulator implements ObservableTransformer	// class@0007e9 from classes.dex
{

    public void ProductStateAccumulator(){
       super();
    }
    public static Map toAccumulatedMap(Map p0,r45 p1){
       if (!p1.c()) {
          return dt5.x;
       }
       HashMap hashMap = new HashMap(w51.c((p1.b().size() + p0.size())));
       hashMap.putAll(p0);
       hashMap.putAll(p1.b());
       return m73.b(hashMap);
    }
    public ObservableSource apply(Observable p0){
       return p0.scan(dt5.x, new a()).skip(1);
    }
}
