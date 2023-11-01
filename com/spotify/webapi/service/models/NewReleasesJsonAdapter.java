package com.spotify.webapi.service.models.NewReleasesJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b$b;
import java.lang.reflect.Type;
import com.spotify.webapi.service.models.AlbumSimple;
import com.spotify.webapi.service.models.Pager;
import java.lang.reflect.ParameterizedType;
import p.ya7;
import p.pl1;
import java.util.Set;
import com.squareup.moshi.b;
import com.spotify.webapi.service.models.NewReleases;
import com.squareup.moshi.i;
import java.lang.NullPointerException;
import p.et0;

public final class NewReleasesJsonAdapter extends JsonAdapter	// class@000c95 from classes.dex
{
    private final JsonAdapter nullablePagerOfAlbumSimpleAdapter;
    private final b$b options;

    public void NewReleasesJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"albums"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"albums\"\)");
       this.options = uob;
       Type[] typeArray = new Type[]{AlbumSimple.class};
       JsonAdapter jsonAdapter = p0.f(ya7.j(Pager.class, typeArray), pl1.a, "albums");
       co5.l(jsonAdapter, "moshi.adapter\(Types.newP…    emptySet\(\), \"albums\"\)");
       this.nullablePagerOfAlbumSimpleAdapter = jsonAdapter;
    }
    public NewReleases fromJson(b p0){
       int i1;
       co5.o(p0, "reader");
       p0.f();
       Pager pager = null;
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
          pager = this.nullablePagerOfAlbumSimpleAdapter.fromJson(p0);
          i = 1;
       }
       p0.y();
       NewReleases newReleases = new NewReleases();
       if (i) {
          newReleases.albums = pager;
       }
       return newReleases;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,NewReleases p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("albums");
       this.nullablePagerOfAlbumSimpleAdapter.toJson(p0, p1.albums);
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(33, "GeneratedJsonAdapter\(NewReleases\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
