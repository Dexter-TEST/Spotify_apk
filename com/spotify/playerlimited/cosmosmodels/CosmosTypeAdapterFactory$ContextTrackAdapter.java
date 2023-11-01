package com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory$ContextTrackAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b;
import p.nt0;
import p.lq5;
import java.util.LinkedHashMap;
import java.lang.NullPointerException;
import java.util.Map;
import java.lang.Class;
import java.lang.IllegalStateException;
import p.m73;
import p.ur;
import com.squareup.moshi.i;
import com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory$ContextTrackAdapter$Adapter;
import java.lang.IllegalArgumentException;

public final class CosmosTypeAdapterFactory$ContextTrackAdapter extends JsonAdapter	// class@000b2c from classes.dex
{
    private final Moshi moshi;

    public void CosmosTypeAdapterFactory$ContextTrackAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       this.moshi = p0;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public nt0 fromJson(b p0){
       Map map;
       co5.o(p0, "reader");
       lq5 olq5 = nt0.a("");
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       p0.f();
       while (true) {
          if (p0.T()) {
             String str = p0.l0();
             if (str.equals("uri")) {
                if ((str = p0.o0()) != null) {
                   olq5.b = str;
                }else {
                   break ;
                }
             }else if(str.equals("uid")){
                olq5.l(p0.o0());
             }else if(str.equals("provider")){
                if ((str = p0.o0()) == null) {
                   throw new NullPointerException("Null provider");
                }
                olq5.v = str;
             }else {
                String str1 = "album_uri";
                if (str.equals(str1)) {
                   str = p0.o0();
                   co5.l(str, "reader.nextString\(\)");
                   linkedHashMa.put(str1, str);
                }else {
                   str1 = "artist_uri";
                   if (str.equals(str1)) {
                      str = p0.o0();
                      co5.l(str, "reader.nextString\(\)");
                      linkedHashMa.put(str1, str);
                   }else if(str.equals("metadata")){
                      if ((map = this.moshi.c(Map.class).fromJson(p0)) == null) {
                         throw new IllegalStateException("Required value was null.".toString());
                      }
                      linkedHashMa.putAll(map);
                   }else {
                      p0.A0();
                   }
                }
             }
          }else {
             p0.y();
             olq5.t = m73.b(linkedHashMa);
             return olq5.e();
          }
       }
       throw new NullPointerException("Null uri");
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public void toJson(i p0,nt0 p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new IllegalArgumentException("Required value was null.".toString());
       }
       CosmosTypeAdapterFactory$ContextTrackAdapter$Adapter uContextTrac = new CosmosTypeAdapterFactory$ContextTrackAdapter$Adapter();
       uContextTrac.a = p1.a;
       uContextTrac.b = p1.b;
       uContextTrac.c = p1.c;
       uContextTrac.d = p1.d;
       this.moshi.c(CosmosTypeAdapterFactory$ContextTrackAdapter$Adapter.class).toJson(p0, uContextTrac);
       return;
    }
}
