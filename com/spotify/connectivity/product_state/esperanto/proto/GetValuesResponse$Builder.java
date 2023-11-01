package com.spotify.connectivity.product_state.esperanto.proto.GetValuesResponse$Builder;
import com.spotify.connectivity.product_state.esperanto.proto.GetValuesResponseOrBuilder;
import com.google.protobuf.b;
import com.spotify.connectivity.product_state.esperanto.proto.GetValuesResponse;
import com.google.protobuf.c;
import java.util.Map;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import java.util.Collections;
import java.lang.IllegalArgumentException;

public final class GetValuesResponse$Builder extends b implements GetValuesResponseOrBuilder	// class@0007b1 from classes.dex
{

    private void GetValuesResponse$Builder(){
       super(GetValuesResponse.f());
    }
    public void GetValuesResponse$Builder(int p0){
       super();
    }
    public GetValuesResponse$Builder clearPairs(){
       this.copyOnWrite();
       GetValuesResponse.e(this.instance).clear();
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
    public GetValuesResponse$Builder putAllPairs(Map p0){
       this.copyOnWrite();
       GetValuesResponse.e(this.instance).putAll(p0);
       return this;
    }
    public GetValuesResponse$Builder putPairs(String p0,String p1){
       p0.getClass();
       p1.getClass();
       this.copyOnWrite();
       GetValuesResponse.e(this.instance).put(p0, p1);
       return this;
    }
    public GetValuesResponse$Builder removePairs(String p0){
       p0.getClass();
       this.copyOnWrite();
       GetValuesResponse.e(this.instance).remove(p0);
       return this;
    }
}
