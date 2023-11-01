package com.spotify.playerlimited.player.models.OfflineResourceResponseJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b$b;
import p.pl1;
import com.spotify.playerlimited.player.models.OfflineResource;
import java.lang.reflect.Type;
import java.util.Set;
import com.squareup.moshi.b;
import com.spotify.playerlimited.player.models.OfflineResourceResponse;
import com.squareup.moshi.i;
import java.lang.NullPointerException;
import p.et0;

public final class OfflineResourceResponseJsonAdapter extends JsonAdapter	// class@000b7b from classes.dex
{
    private final JsonAdapter nullableOfflineResourceAdapter;
    private final b$b options;

    public void OfflineResourceResponseJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"resources"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"resources\"\)");
       this.options = uob;
       JsonAdapter jsonAdapter = p0.f(OfflineResource.class, pl1.a, "resource");
       co5.l(jsonAdapter, "moshi.adapter\(OfflineRes…, emptySet\(\), \"resource\"\)");
       this.nullableOfflineResourceAdapter = jsonAdapter;
    }
    public OfflineResourceResponse fromJson(b p0){
       int i1;
       co5.o(p0, "reader");
       p0.f();
       OfflineResource offlineResou = null;
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
          offlineResou = this.nullableOfflineResourceAdapter.fromJson(p0);
          i = 1;
       }
       p0.y();
       OfflineResourceResponse offlineResou1 = new OfflineResourceResponse();
       if (i) {
          offlineResou1.a = offlineResou;
       }
       return offlineResou1;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,OfflineResourceResponse p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("resources");
       this.nullableOfflineResourceAdapter.toJson(p0, p1.a);
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(45, "GeneratedJsonAdapter\(OfflineResourceResponse\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
