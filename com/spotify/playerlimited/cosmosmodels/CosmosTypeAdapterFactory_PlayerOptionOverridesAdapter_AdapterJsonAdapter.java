package com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory_PlayerOptionOverridesAdapter_AdapterJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b$b;
import p.pl1;
import java.lang.Boolean;
import java.lang.reflect.Type;
import java.util.Set;
import com.squareup.moshi.b;
import com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory$PlayerOptionOverridesAdapter$Adapter;
import com.squareup.moshi.i;
import java.lang.NullPointerException;
import p.et0;

public final class CosmosTypeAdapterFactory_PlayerOptionOverridesAdapter_AdapterJsonAdapter extends JsonAdapter	// class@000b5a from classes.dex
{
    private final JsonAdapter nullableBooleanAdapter;
    private final b$b options;

    public void CosmosTypeAdapterFactory_PlayerOptionOverridesAdapter_AdapterJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"repeating_context","repeating_track","shuffling_context"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"repeating_context\",\n…ck\", \"shuffling_context\"\)");
       this.options = uob;
       JsonAdapter jsonAdapter = p0.f(Boolean.class, pl1.a, "repeatingContext");
       co5.l(jsonAdapter, "moshi.adapter\(Boolean::c…et\(\), \"repeatingContext\"\)");
       this.nullableBooleanAdapter = jsonAdapter;
    }
    public CosmosTypeAdapterFactory$PlayerOptionOverridesAdapter$Adapter fromJson(b p0){
       int i3;
       co5.o(p0, "reader");
       p0.f();
       Boolean uBoolean = null;
       Boolean uBoolean1 = uBoolean;
       Boolean uBoolean2 = uBoolean1;
       int i = 0;
       int i1 = 0;
       int i2 = 0;
       while (p0.T()) {
          if ((i3 = p0.v0(this.options)) != -1) {
             int i4 = 1;
             if (i3) {
                if (i3 != i4) {
                   if (i3 != 2) {
                      continue ;
                   }
                }else {
                   uBoolean1 = this.nullableBooleanAdapter.fromJson(p0);
                   i1 = 1;
                }
             }else {
                uBoolean = this.nullableBooleanAdapter.fromJson(p0);
                i = 1;
             }
          }else {
             p0.z0();
             p0.A0();
          }
          uBoolean2 = this.nullableBooleanAdapter.fromJson(p0);
          i2 = 1;
       }
       p0.y();
       CosmosTypeAdapterFactory$PlayerOptionOverridesAdapter$Adapter playerOption = new CosmosTypeAdapterFactory$PlayerOptionOverridesAdapter$Adapter();
       if (i) {
          playerOption.b = uBoolean;
       }
       if (i1) {
          playerOption.c = uBoolean1;
       }
       if (i2) {
          playerOption.a = uBoolean2;
       }
       return playerOption;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,CosmosTypeAdapterFactory$PlayerOptionOverridesAdapter$Adapter p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("repeating_context");
       this.nullableBooleanAdapter.toJson(p0, p1.b);
       p0.l0("repeating_track");
       this.nullableBooleanAdapter.toJson(p0, p1.c);
       p0.l0("shuffling_context");
       this.nullableBooleanAdapter.toJson(p0, p1.a);
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(83, "GeneratedJsonAdapter\(CosmosTypeAdapterFactory.PlayerOptionOverridesAdapter.Adapter\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
