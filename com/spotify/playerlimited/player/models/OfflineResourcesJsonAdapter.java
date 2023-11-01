package com.spotify.playerlimited.player.models.OfflineResourcesJsonAdapter;
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
import com.spotify.playerlimited.player.models.OfflineResources;
import com.squareup.moshi.i;
import java.lang.NullPointerException;
import p.et0;

public final class OfflineResourcesJsonAdapter extends JsonAdapter	// class@000b7d from classes.dex
{
    private final JsonAdapter nullableListOfOfflineResourceAdapter;
    private final b$b options;

    public void OfflineResourcesJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"resources"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"resources\"\)");
       this.options = uob;
       Type[] typeArray = new Type[]{OfflineResource.class};
       JsonAdapter jsonAdapter = p0.f(ya7.j(List.class, typeArray), pl1.a, "resources");
       co5.l(jsonAdapter, "moshi.adapter\(Types.newP… emptySet\(\), \"resources\"\)");
       this.nullableListOfOfflineResourceAdapter = jsonAdapter;
    }
    public OfflineResources fromJson(b p0){
       int i1;
       co5.o(p0, "reader");
       p0.f();
       List list = null;
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
          list = this.nullableListOfOfflineResourceAdapter.fromJson(p0);
          i = 1;
       }
       p0.y();
       OfflineResources offlineResou = new OfflineResources();
       if (i) {
          offlineResou.a = list;
       }
       return offlineResou;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,OfflineResources p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("resources");
       this.nullableListOfOfflineResourceAdapter.toJson(p0, p1.a);
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(38, "GeneratedJsonAdapter\(OfflineResources\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
