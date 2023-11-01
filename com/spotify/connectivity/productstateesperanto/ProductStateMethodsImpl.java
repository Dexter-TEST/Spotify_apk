package com.spotify.connectivity.productstateesperanto.ProductStateMethodsImpl;
import com.spotify.connectivity.productstateesperanto.ProductStateMethods;
import com.spotify.connectivity.product_state.esperanto.proto.ProductStateClient;
import java.lang.Object;
import java.lang.String;
import p.co5;
import io.reactivex.rxjava3.core.Completable;
import com.spotify.connectivity.product_state.esperanto.proto.PutOverridesValuesRequest$Builder;
import com.spotify.connectivity.product_state.esperanto.proto.PutOverridesValuesRequest;
import com.google.protobuf.c;
import com.google.protobuf.b;
import io.reactivex.rxjava3.core.Single;
import com.spotify.connectivity.product_state.esperanto.proto.DelOverridesValuesRequest$Builder;
import com.spotify.connectivity.product_state.esperanto.proto.DelOverridesValuesRequest;
import com.spotify.connectivity.product_state.esperanto.proto.PutValuesRequest$Builder;
import com.spotify.connectivity.product_state.esperanto.proto.PutValuesRequest;
import io.reactivex.rxjava3.core.Observable;
import com.spotify.connectivity.product_state.esperanto.proto.SubValuesRequest;
import com.spotify.connectivity.productstateesperanto.ProductStateMethodsImpl$values$1;
import p.yf2;

public final class ProductStateMethodsImpl implements ProductStateMethods	// class@0007f0 from classes.dex
{
    private final ProductStateClient productStateClient;

    public void ProductStateMethodsImpl(ProductStateClient p0){
       co5.o(p0, "productStateClient");
       super();
       this.productStateClient = p0;
    }
    public Completable overrideValue(String p0,String p1){
       co5.o(p0, "key");
       co5.o(p1, "value");
       c uoc = PutOverridesValuesRequest.newBuilder().putPairs(p0, p1).build();
       co5.l(uoc, "newBuilder\(\)\n           …
                    .build\(\)");
       Completable uCompletable = this.productStateClient.PutOverridesValues(uoc).ignoreElement();
       co5.l(uCompletable, "productStateClient.PutOv…        \).ignoreElement\(\)");
       return uCompletable;
    }
    public Completable removeOverride(String p0){
       co5.o(p0, "key");
       c uoc = DelOverridesValuesRequest.newBuilder().addKeys(p0).build();
       co5.l(uoc, "newBuilder\(\)\n           …
                    .build\(\)");
       Completable uCompletable = this.productStateClient.DelOverridesValues(uoc).ignoreElement();
       co5.l(uCompletable, "productStateClient.DelOv…        \).ignoreElement\(\)");
       return uCompletable;
    }
    public Completable updateState(String p0,String p1){
       co5.o(p0, "key");
       co5.o(p1, "value");
       c uoc = PutValuesRequest.newBuilder().putPairs(p0, p1).build();
       co5.l(uoc, "newBuilder\(\).putPairs\(key, value\).build\(\)");
       Completable uCompletable = this.productStateClient.PutValues(uoc).ignoreElement();
       co5.l(uCompletable, "productStateClient.PutVa…         .ignoreElement\(\)");
       return uCompletable;
    }
    public Observable values(){
       SubValuesRequest defaultInsta = SubValuesRequest.getDefaultInstance();
       co5.l(defaultInsta, "getDefaultInstance\(\)");
       Observable observable = this.productStateClient.SubValues(defaultInsta);
       observable = observable.map(ProductStateMethodsImpl$values$1.INSTANCE);
       co5.l(observable, "productStateClient\n     …se -> response.pairsMap }");
       return observable;
    }
}
