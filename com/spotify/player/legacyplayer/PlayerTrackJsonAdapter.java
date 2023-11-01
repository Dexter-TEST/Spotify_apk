package com.spotify.player.legacyplayer.PlayerTrackJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b$b;
import p.pl1;
import java.lang.reflect.Type;
import java.util.Set;
import java.util.Map;
import java.lang.reflect.ParameterizedType;
import p.ya7;
import com.squareup.moshi.b;
import com.spotify.player.legacyplayer.PlayerTrack;
import p.hf3;
import p.ve7;
import com.squareup.moshi.i;
import java.lang.NullPointerException;
import p.et0;

public final class PlayerTrackJsonAdapter extends JsonAdapter	// class@000b24 from classes.dex
{
    private final JsonAdapter nullableMapOfStringStringAdapter;
    private final JsonAdapter nullableStringAdapter;
    private final b$b options;
    private final JsonAdapter stringAdapter;

    public void PlayerTrackJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"uri","uid","album_uri","artist_uri","provider","metadata"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"uri\", \"uid\", \"album_…, \"provider\", \"metadata\"\)");
       this.options = uob;
       pl1 a = pl1.a;
       JsonAdapter jsonAdapter = p0.f(String.class, a, "uri");
       co5.l(jsonAdapter, "moshi.adapter\(String::cl… emptySet\(\),\n      \"uri\"\)");
       this.stringAdapter = jsonAdapter;
       jsonAdapter = p0.f(String.class, a, "uid");
       co5.l(jsonAdapter, "moshi.adapter\(String::cl…
          emptySet\(\), \"uid\"\)");
       this.nullableStringAdapter = jsonAdapter;
       Type[] typeArray = new Type[]{String.class,String.class};
       JsonAdapter jsonAdapter1 = p0.f(ya7.j(Map.class, typeArray), a, "metadata");
       co5.l(jsonAdapter1, "moshi.adapter\(Types.newP…, emptySet\(\), \"metadata\"\)");
       this.nullableMapOfStringStringAdapter = jsonAdapter1;
    }
    public PlayerTrack fromJson(b p0){
       hf3 ohf3;
       co5.o(p0, "reader");
       p0.f();
       String str = null;
       String str1 = str;
       String str2 = str1;
       String str3 = str2;
       String str4 = str3;
       Map map = str4;
       while (true) {
          String str5 = "uri";
          if (p0.T()) {
             switch (p0.v0(this.options)){
                 case 0xffffffff:
                   p0.z0();
                   p0.A0();
                   break;
                 case 0:
                   if ((str = this.stringAdapter.fromJson(p0)) != null) {
                      continue ;
                   }else {
                      ohf3 = ve7.w(str5, str5, p0);
                      co5.l(ohf3, "unexpectedNull\(\"uri\", \"uri\", reader\)");
                      throw ohf3;
                   }
                   break;
                 case 1:
                   str1 = this.nullableStringAdapter.fromJson(p0);
                   break;
                 case 2:
                   str2 = this.nullableStringAdapter.fromJson(p0);
                   break;
                 case 3:
                   str3 = this.nullableStringAdapter.fromJson(p0);
                   break;
                 case 4:
                   str4 = this.nullableStringAdapter.fromJson(p0);
                   break;
                 case 5:
                   map = this.nullableMapOfStringStringAdapter.fromJson(p0);
                   break;
                 default:
             }
          }else {
             p0.y();
             if (str != null) {
                PlayerTrack v0 = new PlayerTrack(str, str1, str2, str3, str4, map);
                return v0;
             }else {
                ohf3 = ve7.o(str5, str5, p0);
                co5.l(ohf3, "missingProperty\(\"uri\", \"uri\", reader\)");
                throw ohf3;
             }
          }
       }
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,PlayerTrack p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("uri");
       this.stringAdapter.toJson(p0, p1.a);
       p0.l0("uid");
       this.nullableStringAdapter.toJson(p0, p1.b);
       p0.l0("album_uri");
       this.nullableStringAdapter.toJson(p0, p1.c);
       p0.l0("artist_uri");
       this.nullableStringAdapter.toJson(p0, p1.t);
       p0.l0("provider");
       this.nullableStringAdapter.toJson(p0, p1.v);
       p0.l0("metadata");
       this.nullableMapOfStringStringAdapter.toJson(p0, p1.w);
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(33, "GeneratedJsonAdapter\(PlayerTrack\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
