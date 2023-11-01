package com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory_PlayerOptionsAdapter_AdapterJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b$b;
import java.lang.Boolean;
import p.pl1;
import java.lang.reflect.Type;
import java.util.Set;
import com.squareup.moshi.b;
import com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory$PlayerOptionsAdapter$Adapter;
import p.hf3;
import p.ve7;
import com.squareup.moshi.i;
import p.kg4;
import java.lang.NullPointerException;
import p.et0;

public final class CosmosTypeAdapterFactory_PlayerOptionsAdapter_AdapterJsonAdapter extends JsonAdapter	// class@000b5b from classes.dex
{
    private final JsonAdapter booleanAdapter;
    private final b$b options;

    public void CosmosTypeAdapterFactory_PlayerOptionsAdapter_AdapterJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"repeating_context","repeating_track","shuffling_context"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"repeating_context\",\n…ck\", \"shuffling_context\"\)");
       this.options = uob;
       JsonAdapter jsonAdapter = p0.f(Boolean.TYPE, pl1.a, "repeatingContext");
       co5.l(jsonAdapter, "moshi.adapter\(Boolean::c…      \"repeatingContext\"\)");
       this.booleanAdapter = jsonAdapter;
    }
    public CosmosTypeAdapterFactory$PlayerOptionsAdapter$Adapter fromJson(b p0){
       int i;
       hf3 ohf3;
       CosmosTypeAdapterFactory$PlayerOptionsAdapter$Adapter playerOption;
       boolean b;
       CosmosTypeAdapterFactory$PlayerOptionsAdapter$Adapter a;
       co5.o(p0, "reader");
       p0.f();
       Boolean uBoolean = null;
       Boolean uBoolean1 = uBoolean;
       Boolean uBoolean2 = uBoolean1;
       while (true) {
          if (p0.T()) {
             if ((i = p0.v0(this.options)) != -1) {
                if (i) {
                   if (i != 1) {
                      if (i != 2 || (uBoolean2 = this.booleanAdapter.fromJson(p0)) != null) {
                         continue ;
                      }else {
                         ohf3 = ve7.w("shufflingContext", "shuffling_context", p0);
                         co5.l(ohf3, "unexpectedNull\(\"shufflin…uffling_context\", reader\)");
                         throw ohf3;
                      }
                   }else if((uBoolean1 = this.booleanAdapter.fromJson(p0)) != null){
                      continue ;
                   }else {
                      ohf3 = ve7.w("repeatingTrack", "repeating_track", p0);
                      co5.l(ohf3, "unexpectedNull\(\"repeatin…repeating_track\", reader\)");
                      throw ohf3;
                   }
                }else if((uBoolean = this.booleanAdapter.fromJson(p0)) != null){
                   continue ;
                }else {
                   ohf3 = ve7.w("repeatingContext", "repeating_context", p0);
                   co5.l(ohf3, "unexpectedNull\(\"repeatin…peating_context\", reader\)");
                   throw ohf3;
                }
             }else {
                p0.z0();
                p0.A0();
             }
          }else {
             p0.y();
             playerOption = new CosmosTypeAdapterFactory$PlayerOptionsAdapter$Adapter();
             b = (uBoolean != null)? uBoolean.booleanValue(): playerOption.b;
             playerOption.b = b;
             b = (uBoolean1 != null)? uBoolean1.booleanValue(): playerOption.c;
             playerOption.c = b;
             b = (uBoolean2 != null)? uBoolean2.booleanValue(): playerOption.a;
             break ;
          }
       }
       playerOption.a = b;
       return playerOption;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,CosmosTypeAdapterFactory$PlayerOptionsAdapter$Adapter p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("repeating_context");
       kg4.x(p1.b, this.booleanAdapter, p0, "repeating_track");
       kg4.x(p1.c, this.booleanAdapter, p0, "shuffling_context");
       this.booleanAdapter.toJson(p0, Boolean.valueOf(p1.a));
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(75, "GeneratedJsonAdapter\(CosmosTypeAdapterFactory.PlayerOptionsAdapter.Adapter\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
