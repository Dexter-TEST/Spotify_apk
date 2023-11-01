package com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory_PlayOptionsSkipToAdapter_AdapterJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b$b;
import p.pl1;
import java.lang.Integer;
import java.lang.reflect.Type;
import java.util.Set;
import com.squareup.moshi.b;
import com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory$PlayOptionsSkipToAdapter$Adapter;
import p.hf3;
import p.ve7;
import com.squareup.moshi.i;
import p.tp2;
import java.lang.NullPointerException;
import p.et0;

public final class CosmosTypeAdapterFactory_PlayOptionsSkipToAdapter_AdapterJsonAdapter extends JsonAdapter	// class@000b56 from classes.dex
{
    private final JsonAdapter intAdapter;
    private final JsonAdapter nullableIntAdapter;
    private final JsonAdapter nullableStringAdapter;
    private final b$b options;

    public void CosmosTypeAdapterFactory_PlayOptionsSkipToAdapter_AdapterJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"page_index","page_url","track_index","track_uid","track_uri"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"page_index\", \"page_u…"track_uid\", \"track_uri\"\)");
       this.options = uob;
       pl1 a = pl1.a;
       JsonAdapter jsonAdapter = p0.f(Integer.class, a, "pageIndex");
       co5.l(jsonAdapter, "moshi.adapter\(Int::class… emptySet\(\), \"pageIndex\"\)");
       this.nullableIntAdapter = jsonAdapter;
       jsonAdapter = p0.f(String.class, a, "pageUrl");
       co5.l(jsonAdapter, "moshi.adapter\(String::cl…   emptySet\(\), \"pageUrl\"\)");
       this.nullableStringAdapter = jsonAdapter;
       JsonAdapter jsonAdapter1 = p0.f(Integer.TYPE, a, "trackIndex");
       co5.l(jsonAdapter1, "moshi.adapter\(Int::class…et\(\),\n      \"trackIndex\"\)");
       this.intAdapter = jsonAdapter1;
    }
    public CosmosTypeAdapterFactory$PlayOptionsSkipToAdapter$Adapter fromJson(b p0){
       int i4;
       CosmosTypeAdapterFactory$PlayOptionsSkipToAdapter$Adapter playOptionsS;
       co5.o(p0, "reader");
       p0.f();
       Integer integer = null;
       String str = integer;
       Integer integer1 = str;
       String str1 = integer1;
       String str2 = str1;
       int i = 0;
       int i1 = 0;
       int i2 = 0;
       int i3 = 0;
       while (true) {
          if (p0.T()) {
             if ((i4 = p0.v0(this.options)) != -1) {
                int i5 = 1;
                if (i4) {
                   if (i4 != i5) {
                      if (i4 != 2) {
                         if (i4 != 3) {
                            if (i4 != 4) {
                               continue ;
                            }else {
                               str2 = this.nullableStringAdapter.fromJson(p0);
                               i3 = 1;
                            }
                         }else {
                            str1 = this.nullableStringAdapter.fromJson(p0);
                            i2 = 1;
                         }
                      }else if((integer1 = this.intAdapter.fromJson(p0)) != null){
                         continue ;
                      }else {
                         hf3 ohf3 = ve7.w("trackIndex", "track_index", p0);
                         co5.l(ohf3, "unexpectedNull\(\"trackInd…   \"track_index\", reader\)");
                         throw ohf3;
                      }
                   }else {
                      str = this.nullableStringAdapter.fromJson(p0);
                      i1 = 1;
                   }
                }else {
                   integer = this.nullableIntAdapter.fromJson(p0);
                   i = 1;
                }
             }else {
                p0.z0();
                p0.A0();
             }
          }else {
             p0.y();
             playOptionsS = new CosmosTypeAdapterFactory$PlayOptionsSkipToAdapter$Adapter();
             if (i) {
                playOptionsS.b = integer;
             }
             if (i1) {
                playOptionsS.a = str;
             }
             int i6 = (integer1 != null)? integer1.intValue(): playOptionsS.e;
             playOptionsS.e = i6;
             if (i2) {
                playOptionsS.c = str1;
             }
             if (i3) {
                playOptionsS.d = str2;
                break ;
             }
             break ;
          }
       }
       return playOptionsS;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,CosmosTypeAdapterFactory$PlayOptionsSkipToAdapter$Adapter p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("page_index");
       this.nullableIntAdapter.toJson(p0, p1.b);
       p0.l0("page_url");
       this.nullableStringAdapter.toJson(p0, p1.a);
       p0.l0("track_index");
       tp2.q(p1.e, this.intAdapter, p0, "track_uid");
       this.nullableStringAdapter.toJson(p0, p1.c);
       p0.l0("track_uri");
       this.nullableStringAdapter.toJson(p0, p1.d);
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(79, "GeneratedJsonAdapter\(CosmosTypeAdapterFactory.PlayOptionsSkipToAdapter.Adapter\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
