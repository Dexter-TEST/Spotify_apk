package com.spotify.connectivity.product_state.esperanto.proto.PutValuesRequest$Builder;
import com.spotify.connectivity.product_state.esperanto.proto.PutValuesRequestOrBuilder;
import com.google.protobuf.b;
import com.spotify.connectivity.product_state.esperanto.proto.PutValuesRequest;
import com.google.protobuf.c;
import java.util.Map;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import java.util.Collections;
import java.lang.IllegalArgumentException;

public final class PutValuesRequest$Builder extends b implements PutValuesRequestOrBuilder	// class@0007c7 from classes.dex
{

    private void PutValuesRequest$Builder(){
       super(PutValuesRequest.f());
    }
    public void PutValuesRequest$Builder(int p0){
       super();
    }
    public PutValuesRequest$Builder clearPairs(){
       this.copyOnWrite();
       PutValuesRequest.e(this.instance).clear();
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
    public PutValuesRequest$Builder putAllPairs(Map p0){
       this.copyOnWrite();
       PutValuesRequest.e(this.instance).putAll(p0);
       return this;
    }
    public PutValuesRequest$Builder putPairs(String p0,String p1){
       p0.getClass();
       p1.getClass();
       this.copyOnWrite();
       PutValuesRequest.e(this.instance).put(p0, p1);
       return this;
    }
    public PutValuesRequest$Builder removePairs(String p0){
       p0.getClass();
       this.copyOnWrite();
       PutValuesRequest.e(this.instance).remove(p0);
       return this;
    }
}
