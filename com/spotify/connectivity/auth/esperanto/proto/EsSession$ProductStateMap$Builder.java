package com.spotify.connectivity.auth.esperanto.proto.EsSession$ProductStateMap$Builder;
import com.spotify.connectivity.auth.esperanto.proto.EsSession$ProductStateMapOrBuilder;
import com.google.protobuf.b;
import com.spotify.connectivity.auth.esperanto.proto.EsSession$ProductStateMap;
import com.google.protobuf.c;
import java.util.Map;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import java.util.Collections;
import java.lang.IllegalArgumentException;

public final class EsSession$ProductStateMap$Builder extends b implements EsSession$ProductStateMapOrBuilder	// class@000628 from classes.dex
{

    private void EsSession$ProductStateMap$Builder(){
       super(EsSession$ProductStateMap.f());
    }
    public void EsSession$ProductStateMap$Builder(int p0){
       super();
    }
    public EsSession$ProductStateMap$Builder clearProductStateMap(){
       this.copyOnWrite();
       EsSession$ProductStateMap.e(this.instance).clear();
       return this;
    }
    public boolean containsProductStateMap(String p0){
       p0.getClass();
       return this.instance.getProductStateMapMap().containsKey(p0);
    }
    public Map getProductStateMap(){
       return this.getProductStateMapMap();
    }
    public int getProductStateMapCount(){
       return this.instance.getProductStateMapMap().size();
    }
    public Map getProductStateMapMap(){
       return Collections.unmodifiableMap(this.instance.getProductStateMapMap());
    }
    public String getProductStateMapOrDefault(String p0,String p1){
       p0.getClass();
       Map productState = this.instance.getProductStateMapMap();
       if (productState.containsKey(p0)) {
          p1 = productState.get(p0);
       }
       return p1;
    }
    public String getProductStateMapOrThrow(String p0){
       p0.getClass();
       Map productState = this.instance.getProductStateMapMap();
       if (productState.containsKey(p0)) {
          return productState.get(p0);
       }
       throw new IllegalArgumentException();
    }
    public EsSession$ProductStateMap$Builder putAllProductStateMap(Map p0){
       this.copyOnWrite();
       EsSession$ProductStateMap.e(this.instance).putAll(p0);
       return this;
    }
    public EsSession$ProductStateMap$Builder putProductStateMap(String p0,String p1){
       p0.getClass();
       p1.getClass();
       this.copyOnWrite();
       EsSession$ProductStateMap.e(this.instance).put(p0, p1);
       return this;
    }
    public EsSession$ProductStateMap$Builder removeProductStateMap(String p0){
       p0.getClass();
       this.copyOnWrite();
       EsSession$ProductStateMap.e(this.instance).remove(p0);
       return this;
    }
}
