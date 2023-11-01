package com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory_PlayOriginAdapter_AdapterJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b$b;
import p.pl1;
import java.lang.reflect.Type;
import java.util.Set;
import java.lang.reflect.ParameterizedType;
import p.ya7;
import com.squareup.moshi.b;
import com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory$PlayOriginAdapter$Adapter;
import com.squareup.moshi.i;
import java.lang.NullPointerException;
import p.et0;

public final class CosmosTypeAdapterFactory_PlayOriginAdapter_AdapterJsonAdapter extends JsonAdapter	// class@000b57 from classes.dex
{
    private final JsonAdapter nullableSetOfStringAdapter;
    private final JsonAdapter nullableStringAdapter;
    private final b$b options;

    public void CosmosTypeAdapterFactory_PlayOriginAdapter_AdapterJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"device_identifier","external_referrer","feature_classes","feature_identifier","feature_version","referrer_identifier","view_uri"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"device_identifier\",\n…_identifier\", \"view_uri\"\)");
       this.options = uob;
       pl1 a = pl1.a;
       JsonAdapter jsonAdapter = p0.f(String.class, a, "deviceIdentifier");
       co5.l(jsonAdapter, "moshi.adapter\(String::cl…et\(\), \"deviceIdentifier\"\)");
       this.nullableStringAdapter = jsonAdapter;
       Type[] typeArray = new Type[]{String.class};
       JsonAdapter jsonAdapter1 = p0.f(ya7.j(Set.class, typeArray), a, "featureClasses");
       co5.l(jsonAdapter1, "moshi.adapter\(Types.newP…,\n      \"featureClasses\"\)");
       this.nullableSetOfStringAdapter = jsonAdapter1;
    }
    public CosmosTypeAdapterFactory$PlayOriginAdapter$Adapter fromJson(b p0){
       String str5;
       CosmosTypeAdapterFactory_PlayOriginAdapter_AdapterJsonAdapter uCosmosTypeA = this;
       CosmosTypeAdapterFactory$PlayOriginAdapter$Adapter obj = p0;
       co5.o(obj, "reader");
       p0.f();
       String str = null;
       String str1 = str;
       Set set = str1;
       String str2 = set;
       String str3 = str2;
       String str4 = str3;
       int i = str4;
       int i1 = 0;
       int i2 = 0;
       int i3 = 0;
       int i4 = 0;
       int i5 = 0;
       int i6 = 0;
       int i7 = 0;
       while (p0.T()) {
          str5 = i;
          switch (obj.v0(uCosmosTypeA.options)){
              case 0xffffffff:
                p0.z0();
                p0.A0();
             label_0087 :
                i = str5;
                break;
              case 0:
                str = uCosmosTypeA.nullableStringAdapter.fromJson(obj);
                i = str5;
                i1 = 1;
                break;
              case 1:
                str1 = uCosmosTypeA.nullableStringAdapter.fromJson(obj);
                i = str5;
                i2 = 1;
                break;
              case 2:
                set = uCosmosTypeA.nullableSetOfStringAdapter.fromJson(obj);
                i = str5;
                i3 = 1;
                break;
              case 3:
                str2 = uCosmosTypeA.nullableStringAdapter.fromJson(obj);
                i = str5;
                i4 = 1;
                break;
              case 4:
                str3 = uCosmosTypeA.nullableStringAdapter.fromJson(obj);
                i = str5;
                i5 = 1;
                break;
              case 5:
                str4 = uCosmosTypeA.nullableStringAdapter.fromJson(obj);
                i = str5;
                i6 = 1;
                break;
              case 6:
                i = uCosmosTypeA.nullableStringAdapter.fromJson(obj);
                i7 = 1;
                break;
              default:
                goto label_0087 ;
          }
       }
       str5 = i;
       p0.y();
       obj = new CosmosTypeAdapterFactory$PlayOriginAdapter$Adapter();
       if (i1) {
          obj.f = str;
       }
       if (i2) {
          obj.d = str1;
       }
       if (i3) {
          obj.g = set;
       }
       if (i4) {
          obj.a = str2;
       }
       if (i5) {
          obj.b = str3;
       }
       if (i6) {
          obj.e = str4;
       }
       if (i7) {
          obj.c = str5;
       }
       return obj;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,CosmosTypeAdapterFactory$PlayOriginAdapter$Adapter p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("device_identifier");
       this.nullableStringAdapter.toJson(p0, p1.f);
       p0.l0("external_referrer");
       this.nullableStringAdapter.toJson(p0, p1.d);
       p0.l0("feature_classes");
       this.nullableSetOfStringAdapter.toJson(p0, p1.g);
       p0.l0("feature_identifier");
       this.nullableStringAdapter.toJson(p0, p1.a);
       p0.l0("feature_version");
       this.nullableStringAdapter.toJson(p0, p1.b);
       p0.l0("referrer_identifier");
       this.nullableStringAdapter.toJson(p0, p1.e);
       p0.l0("view_uri");
       this.nullableStringAdapter.toJson(p0, p1.c);
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(72, "GeneratedJsonAdapter\(CosmosTypeAdapterFactory.PlayOriginAdapter.Adapter\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
