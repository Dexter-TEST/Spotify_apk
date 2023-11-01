package com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory_PlayerSuppressionsAdapter_AdapterJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b$b;
import java.lang.reflect.Type;
import java.util.Set;
import java.lang.reflect.ParameterizedType;
import p.ya7;
import p.pl1;
import com.squareup.moshi.b;
import com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory$PlayerSuppressionsAdapter$Adapter;
import com.squareup.moshi.i;
import java.lang.NullPointerException;
import p.et0;

public final class CosmosTypeAdapterFactory_PlayerSuppressionsAdapter_AdapterJsonAdapter extends JsonAdapter	// class@000b5f from classes.dex
{
    private final JsonAdapter nullableSetOfStringAdapter;
    private final b$b options;

    public void CosmosTypeAdapterFactory_PlayerSuppressionsAdapter_AdapterJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"providers"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"providers\"\)");
       this.options = uob;
       Type[] typeArray = new Type[]{String.class};
       JsonAdapter jsonAdapter = p0.f(ya7.j(Set.class, typeArray), pl1.a, "providers");
       co5.l(jsonAdapter, "moshi.adapter\(Types.newP…Set\(\),\n      \"providers\"\)");
       this.nullableSetOfStringAdapter = jsonAdapter;
    }
    public CosmosTypeAdapterFactory$PlayerSuppressionsAdapter$Adapter fromJson(b p0){
       int i1;
       co5.o(p0, "reader");
       p0.f();
       Set set = null;
       int i = 0;
       while (p0.T()) {
          if ((i1 = p0.v0(this.options)) != -1) {
             if (i1) {
                continue ;
             }
          }else {
             p0.z0();
             p0.A0();
          }
          set = this.nullableSetOfStringAdapter.fromJson(p0);
          i = 1;
       }
       p0.y();
       CosmosTypeAdapterFactory$PlayerSuppressionsAdapter$Adapter playerSuppre = new CosmosTypeAdapterFactory$PlayerSuppressionsAdapter$Adapter();
       if (i) {
          playerSuppre.a = set;
       }
       return playerSuppre;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,CosmosTypeAdapterFactory$PlayerSuppressionsAdapter$Adapter p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("providers");
       this.nullableSetOfStringAdapter.toJson(p0, p1.a);
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(80, "GeneratedJsonAdapter\(CosmosTypeAdapterFactory.PlayerSuppressionsAdapter.Adapter\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
