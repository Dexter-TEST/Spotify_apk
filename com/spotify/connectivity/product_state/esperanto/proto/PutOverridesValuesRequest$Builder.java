package com.spotify.connectivity.product_state.esperanto.proto.PutOverridesValuesRequest$Builder;
import com.spotify.connectivity.product_state.esperanto.proto.PutOverridesValuesRequestOrBuilder;
import com.google.protobuf.b;
import com.spotify.connectivity.product_state.esperanto.proto.PutOverridesValuesRequest;
import com.google.protobuf.c;
import java.util.Map;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import java.util.Collections;
import java.lang.IllegalArgumentException;

public final class PutOverridesValuesRequest$Builder extends b implements PutOverridesValuesRequestOrBuilder	// class@0007be from classes.dex
{

    private void PutOverridesValuesRequest$Builder(){
       super(PutOverridesValuesRequest.f());
    }
    public void PutOverridesValuesRequest$Builder(int p0){
       super();
    }
    public PutOverridesValuesRequest$Builder clearPairs(){
       this.copyOnWrite();
       PutOverridesValuesRequest.e(this.instance).clear();
       return this;
    }
    public boolean containsPairs(String p0){
       p0.getClass();
       return this.instance.getPairsMap().containsKey(p0);
    }
    public Map getPairs(){
       return this.getPairsMap();
    }
    public int getPairsCount(){
       return this.instance.getPairsMap().size();
    }
    public Map getPairsMap(){
       return Collections.unmodifiableMap(this.instance.getPairsMap());
    }
    public String getPairsOrDefault(String p0,String p1){
       p0.getClass();
       Map pairsMap = this.instance.getPairsMap();
       if (pairsMap.containsKey(p0)) {
          p1 = pairsMap.get(p0);
       }
       return p1;
    }
    public String getPairsOrThrow(String p0){
       p0.getClass();
       Map pairsMap = this.instance.getPairsMap();
       if (pairsMap.containsKey(p0)) {
          return pairsMap.get(p0);
       }
       throw new IllegalArgumentException();
    }
    public PutOverridesValuesRequest$Builder putAllPairs(Map p0){
       this.copyOnWrite();
       PutOverridesValuesRequest.e(this.instance).putAll(p0);
       return this;
    }
    public PutOverridesValuesRequest$Builder putPairs(String p0,String p1){
       p0.getClass();
       p1.getClass();
       this.copyOnWrite();
       PutOverridesValuesRequest.e(this.instance).put(p0, p1);
       return this;
    }
    public PutOverridesValuesRequest$Builder removePairs(String p0){
       p0.getClass();
       this.copyOnWrite();
       PutOverridesValuesRequest.e(this.instance).remove(p0);
       return this;
    }
}
