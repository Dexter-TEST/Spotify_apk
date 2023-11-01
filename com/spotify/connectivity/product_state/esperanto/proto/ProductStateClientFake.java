package com.spotify.connectivity.product_state.esperanto.proto.ProductStateClientFake;
import com.spotify.connectivity.product_state.esperanto.proto.ProductStateClient;
import java.lang.Object;
import java.util.ArrayList;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Single;
import com.spotify.connectivity.product_state.esperanto.proto.DelOverridesValuesRequest;
import java.lang.String;
import p.co5;
import java.util.Collection;
import com.spotify.connectivity.product_state.esperanto.proto.GetValuesRequest;
import com.spotify.connectivity.product_state.esperanto.proto.PutOverridesValuesRequest;
import com.spotify.connectivity.product_state.esperanto.proto.PutValuesRequest;
import com.spotify.connectivity.product_state.esperanto.proto.SubValuesRequest;
import java.util.List;

public final class ProductStateClientFake implements ProductStateClient	// class@0007b6 from classes.dex
{
    private List DelOverridesValuesSingleArgs;
    private Single DelOverridesValuesSingleToReturn;
    private List GetValuesSingleArgs;
    private Single GetValuesSingleToReturn;
    private List PutOverridesValuesSingleArgs;
    private Single PutOverridesValuesSingleToReturn;
    private List PutValuesSingleArgs;
    private Single PutValuesSingleToReturn;
    private List SubValuesObservableArgs;
    private Observable SubValuesObservableToReturn;

    public void ProductStateClientFake(){
       super();
       this.SubValuesObservableArgs = new ArrayList();
       this.GetValuesSingleArgs = new ArrayList();
       this.PutValuesSingleArgs = new ArrayList();
       this.PutOverridesValuesSingleArgs = new ArrayList();
       this.DelOverridesValuesSingleArgs = new ArrayList();
       this.SubValuesObservableToReturn = Observable.empty();
       this.GetValuesSingleToReturn = Single.fromObservable(Observable.empty());
       this.PutValuesSingleToReturn = Single.fromObservable(Observable.empty());
       this.PutOverridesValuesSingleToReturn = Single.fromObservable(Observable.empty());
       this.DelOverridesValuesSingleToReturn = Single.fromObservable(Observable.empty());
    }
    public Single DelOverridesValues(DelOverridesValuesRequest p0){
       co5.o(p0, "request");
       this.DelOverridesValuesSingleArgs.add(p0);
       ProductStateClientFake tDelOverride = this.DelOverridesValuesSingleToReturn;
       co5.l(tDelOverride, "DelOverridesValuesSingleToReturn");
       return tDelOverride;
    }
    public Single GetValues(GetValuesRequest p0){
       co5.o(p0, "request");
       this.GetValuesSingleArgs.add(p0);
       ProductStateClientFake tGetValuesSi = this.GetValuesSingleToReturn;
       co5.l(tGetValuesSi, "GetValuesSingleToReturn");
       return tGetValuesSi;
    }
    public Single PutOverridesValues(PutOverridesValuesRequest p0){
       co5.o(p0, "request");
       this.PutOverridesValuesSingleArgs.add(p0);
       ProductStateClientFake tPutOverride = this.PutOverridesValuesSingleToReturn;
       co5.l(tPutOverride, "PutOverridesValuesSingleToReturn");
       return tPutOverride;
    }
    public Single PutValues(PutValuesRequest p0){
       co5.o(p0, "request");
       this.PutValuesSingleArgs.add(p0);
       ProductStateClientFake tPutValuesSi = this.PutValuesSingleToReturn;
       co5.l(tPutValuesSi, "PutValuesSingleToReturn");
       return tPutValuesSi;
    }
    public Observable SubValues(SubValuesRequest p0){
       co5.o(p0, "request");
       this.SubValuesObservableArgs.add(p0);
       ProductStateClientFake tSubValuesOb = this.SubValuesObservableToReturn;
       co5.l(tSubValuesOb, "SubValuesObservableToReturn");
       return tSubValuesOb;
    }
    public final List getDelOverridesValuesSingleArgs(){
       return this.DelOverridesValuesSingleArgs;
    }
    public final Single getDelOverridesValuesSingleToReturn(){
       return this.DelOverridesValuesSingleToReturn;
    }
    public final List getGetValuesSingleArgs(){
       return this.GetValuesSingleArgs;
    }
    public final Single getGetValuesSingleToReturn(){
       return this.GetValuesSingleToReturn;
    }
    public final List getPutOverridesValuesSingleArgs(){
       return this.PutOverridesValuesSingleArgs;
    }
    public final Single getPutOverridesValuesSingleToReturn(){
       return this.PutOverridesValuesSingleToReturn;
    }
    public final List getPutValuesSingleArgs(){
       return this.PutValuesSingleArgs;
    }
    public final Single getPutValuesSingleToReturn(){
       return this.PutValuesSingleToReturn;
    }
    public final List getSubValuesObservableArgs(){
       return this.SubValuesObservableArgs;
    }
    public final Observable getSubValuesObservableToReturn(){
       return this.SubValuesObservableToReturn;
    }
    public final void setDelOverridesValuesSingleToReturn(Single p0){
       this.DelOverridesValuesSingleToReturn = p0;
    }
    public final void setGetValuesSingleToReturn(Single p0){
       this.GetValuesSingleToReturn = p0;
    }
    public final void setPutOverridesValuesSingleToReturn(Single p0){
       this.PutOverridesValuesSingleToReturn = p0;
    }
    public final void setPutValuesSingleToReturn(Single p0){
       this.PutValuesSingleToReturn = p0;
    }
    public final void setSubValuesObservableToReturn(Observable p0){
       this.SubValuesObservableToReturn = p0;
    }
}
