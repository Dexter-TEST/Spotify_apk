package com.spotify.connectivity.product_state.esperanto.proto.DelOverridesValuesRequest$Builder;
import com.spotify.connectivity.product_state.esperanto.proto.DelOverridesValuesRequestOrBuilder;
import com.google.protobuf.b;
import com.spotify.connectivity.product_state.esperanto.proto.DelOverridesValuesRequest;
import com.google.protobuf.c;
import java.lang.Iterable;
import java.lang.String;
import p.i80;
import java.util.List;
import java.util.Collections;

public final class DelOverridesValuesRequest$Builder extends b implements DelOverridesValuesRequestOrBuilder	// class@0007a5 from classes.dex
{

    private void DelOverridesValuesRequest$Builder(){
       super(DelOverridesValuesRequest.j());
    }
    public void DelOverridesValuesRequest$Builder(int p0){
       super();
    }
    public DelOverridesValuesRequest$Builder addAllKeys(Iterable p0){
       this.copyOnWrite();
       DelOverridesValuesRequest.e(this.instance, p0);
       return this;
    }
    public DelOverridesValuesRequest$Builder addKeys(String p0){
       this.copyOnWrite();
       DelOverridesValuesRequest.f(this.instance, p0);
       return this;
    }
    public DelOverridesValuesRequest$Builder addKeysBytes(i80 p0){
       this.copyOnWrite();
       DelOverridesValuesRequest.g(this.instance, p0);
       return this;
    }
    public DelOverridesValuesRequest$Builder clearKeys(){
       this.copyOnWrite();
       DelOverridesValuesRequest.h(this.instance);
       return this;
    }
    public String getKeys(int p0){
       return this.instance.getKeys(p0);
    }
    public i80 getKeysBytes(int p0){
       return this.instance.getKeysBytes(p0);
    }
    public int getKeysCount(){
       return this.instance.getKeysCount();
    }
    public List getKeysList(){
       return Collections.unmodifiableList(this.instance.getKeysList());
    }
    public DelOverridesValuesRequest$Builder setKeys(int p0,String p1){
       this.copyOnWrite();
       DelOverridesValuesRequest.i(this.instance, p0, p1);
       return this;
    }
}
