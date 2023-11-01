package com.spotify.playerlimited.player.models.OfflineTracksResourceJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b$b;
import java.lang.reflect.Type;
import com.spotify.playerlimited.player.models.OfflineResource;
import java.util.List;
import java.lang.reflect.ParameterizedType;
import p.ya7;
import p.pl1;
import java.util.Set;
import com.squareup.moshi.b;
import com.spotify.playerlimited.player.models.OfflineTracksResource;
import com.squareup.moshi.i;
import java.lang.NullPointerException;
import p.et0;

public final class OfflineTracksResourceJsonAdapter extends JsonAdapter	// class@000b81 from classes.dex
{
    private final JsonAdapter nullableListOfOfflineResourceAdapter;
    private final JsonAdapter nullableStringAdapter;
    private final b$b options;

    public void OfflineTracksResourceJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"tracks","offline_availability","uri"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"tracks\", \"offline_availability\",\n      \"uri\"\)");
       this.options = uob;
       Type[] typeArray = new Type[]{OfflineResource.class};
       pl1 a = pl1.a;
       JsonAdapter jsonAdapter = p0.f(ya7.j(List.class, typeArray), a, "tracks");
       co5.l(jsonAdapter, "moshi.adapter\(Types.newP…    emptySet\(\), \"tracks\"\)");
       this.nullableListOfOfflineResourceAdapter = jsonAdapter;
       JsonAdapter jsonAdapter1 = p0.f(String.class, a, "availability");
       co5.l(jsonAdapter1, "moshi.adapter\(String::cl…ptySet\(\), \"availability\"\)");
       this.nullableStringAdapter = jsonAdapter1;
    }
    public OfflineTracksResource fromJson(b p0){
       int i3;
       co5.o(p0, "reader");
       p0.f();
       List list = null;
       String str = list;
       String str1 = str;
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
                   str = this.nullableStringAdapter.fromJson(p0);
                   i1 = 1;
                }
             }else {
                list = this.nullableListOfOfflineResourceAdapter.fromJson(p0);
                i = 1;
             }
          }else {
             p0.z0();
             p0.A0();
          }
          str1 = this.nullableStringAdapter.fromJson(p0);
          i2 = 1;
       }
       p0.y();
       OfflineTracksResource offlineTrack = new OfflineTracksResource();
       if (i) {
          offlineTrack.c = list;
       }
       if (i1) {
          offlineTrack.b = str;
       }
       if (i2) {
          offlineTrack.a = str1;
       }
       return offlineTrack;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,OfflineTracksResource p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("tracks");
       this.nullableListOfOfflineResourceAdapter.toJson(p0, p1.c);
       p0.l0("offline_availability");
       this.nullableStringAdapter.toJson(p0, p1.b);
       p0.l0("uri");
       this.nullableStringAdapter.toJson(p0, p1.a);
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(43, "GeneratedJsonAdapter\(OfflineTracksResource\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
