package com.spotify.webapi.service.models.TrackToRemoveJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b$b;
import p.pl1;
import java.lang.reflect.Type;
import java.util.Set;
import com.squareup.moshi.b;
import com.spotify.webapi.service.models.TrackToRemove;
import com.squareup.moshi.i;
import java.lang.NullPointerException;
import p.et0;

public final class TrackToRemoveJsonAdapter extends JsonAdapter	// class@000cc4 from classes.dex
{
    private final JsonAdapter nullableStringAdapter;
    private final b$b options;

    public void TrackToRemoveJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"uri"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"uri\"\)");
       this.options = uob;
       JsonAdapter jsonAdapter = p0.f(String.class, pl1.a, "uri");
       co5.l(jsonAdapter, "moshi.adapter\(String::cl…
          emptySet\(\), \"uri\"\)");
       this.nullableStringAdapter = jsonAdapter;
    }
    public TrackToRemove fromJson(b p0){
       int i1;
       co5.o(p0, "reader");
       p0.f();
       String str = null;
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
          str = this.nullableStringAdapter.fromJson(p0);
          i = 1;
       }
       p0.y();
       TrackToRemove trackToRemov = new TrackToRemove();
       if (i) {
          trackToRemov.uri = str;
       }
       return trackToRemov;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,TrackToRemove p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("uri");
       this.nullableStringAdapter.toJson(p0, p1.uri);
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(35, "GeneratedJsonAdapter\(TrackToRemove\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
