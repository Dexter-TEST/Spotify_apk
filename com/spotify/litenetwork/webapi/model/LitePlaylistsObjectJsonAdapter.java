package com.spotify.litenetwork.webapi.model.LitePlaylistsObjectJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b$b;
import p.pl1;
import java.lang.reflect.Type;
import java.util.Set;
import com.spotify.litenetwork.webapi.model.LitePlaylistObject;
import java.util.List;
import java.lang.reflect.ParameterizedType;
import p.ya7;
import com.squareup.moshi.b;
import com.spotify.litenetwork.webapi.model.LitePlaylistsObject;
import com.squareup.moshi.i;
import java.lang.NullPointerException;
import p.et0;

public final class LitePlaylistsObjectJsonAdapter extends JsonAdapter	// class@00094a from classes.dex
{
    private final JsonAdapter nullableListOfLitePlaylistObjectAdapter;
    private final JsonAdapter nullableStringAdapter;
    private final b$b options;

    public void LitePlaylistsObjectJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"next","playlists"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"next\", \"playlists\"\)");
       this.options = uob;
       pl1 a = pl1.a;
       JsonAdapter jsonAdapter = p0.f(String.class, a, "next");
       co5.l(jsonAdapter, "moshi.adapter\(String::cl…      emptySet\(\), \"next\"\)");
       this.nullableStringAdapter = jsonAdapter;
       Type[] typeArray = new Type[]{LitePlaylistObject.class};
       JsonAdapter jsonAdapter1 = p0.f(ya7.j(List.class, typeArray), a, "playlists");
       co5.l(jsonAdapter1, "moshi.adapter\(Types.newP… emptySet\(\), \"playlists\"\)");
       this.nullableListOfLitePlaylistObjectAdapter = jsonAdapter1;
    }
    public LitePlaylistsObject fromJson(b p0){
       int i2;
       co5.o(p0, "reader");
       p0.f();
       String str = null;
       List list = str;
       int i = 0;
       int i1 = 0;
       while (p0.T()) {
          if ((i2 = p0.v0(this.options)) != -1) {
             int i3 = 1;
             if (i2) {
                if (i2 != i3) {
                   continue ;
                }
             }else {
                str = this.nullableStringAdapter.fromJson(p0);
                i = 1;
             }
          }else {
             p0.z0();
             p0.A0();
          }
          list = this.nullableListOfLitePlaylistObjectAdapter.fromJson(p0);
          i1 = 1;
       }
       p0.y();
       LitePlaylistsObject litePlaylist = new LitePlaylistsObject();
       if (i) {
          litePlaylist.b = str;
       }
       if (i1) {
          litePlaylist.a = list;
       }
       return litePlaylist;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,LitePlaylistsObject p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("next");
       this.nullableStringAdapter.toJson(p0, p1.b);
       p0.l0("playlists");
       this.nullableListOfLitePlaylistObjectAdapter.toJson(p0, p1.a);
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(41, "GeneratedJsonAdapter\(LitePlaylistsObject\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
