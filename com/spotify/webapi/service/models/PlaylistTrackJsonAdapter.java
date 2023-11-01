package com.spotify.webapi.service.models.PlaylistTrackJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b$b;
import p.pl1;
import java.lang.reflect.Type;
import java.util.Set;
import com.spotify.webapi.service.models.UserPublic;
import com.spotify.webapi.service.models.Entity;
import java.lang.Boolean;
import com.squareup.moshi.b;
import com.spotify.webapi.service.models.PlaylistTrack;
import com.squareup.moshi.i;
import java.lang.NullPointerException;
import p.et0;

public final class PlaylistTrackJsonAdapter extends JsonAdapter	// class@000ca2 from classes.dex
{
    private final JsonAdapter nullableBooleanAdapter;
    private final JsonAdapter nullableEntityAdapter;
    private final JsonAdapter nullableStringAdapter;
    private final JsonAdapter nullableUserPublicAdapter;
    private final b$b options;

    public void PlaylistTrackJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"added_at","added_by","track","is_local"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"added_at\", \"added_by…track\",\n      \"is_local\"\)");
       this.options = uob;
       pl1 a = pl1.a;
       JsonAdapter jsonAdapter = p0.f(String.class, a, "added_at");
       co5.l(jsonAdapter, "moshi.adapter\(String::cl…  emptySet\(\), \"added_at\"\)");
       this.nullableStringAdapter = jsonAdapter;
       jsonAdapter = p0.f(UserPublic.class, a, "added_by");
       co5.l(jsonAdapter, "moshi.adapter\(UserPublic…, emptySet\(\), \"added_by\"\)");
       this.nullableUserPublicAdapter = jsonAdapter;
       jsonAdapter = p0.f(Entity.class, a, "entity");
       co5.l(jsonAdapter, "moshi.adapter\(Entity::cl…    emptySet\(\), \"entity\"\)");
       this.nullableEntityAdapter = jsonAdapter;
       JsonAdapter jsonAdapter1 = p0.f(Boolean.class, a, "is_local");
       co5.l(jsonAdapter1, "moshi.adapter\(Boolean::c…, emptySet\(\), \"is_local\"\)");
       this.nullableBooleanAdapter = jsonAdapter1;
    }
    public PlaylistTrack fromJson(b p0){
       int i4;
       co5.o(p0, "reader");
       p0.f();
       String str = null;
       UserPublic userPublic = str;
       Entity uEntity = userPublic;
       Boolean uBoolean = uEntity;
       int i = 0;
       int i1 = 0;
       int i2 = 0;
       int i3 = 0;
       while (p0.T()) {
          if ((i4 = p0.v0(this.options)) != -1) {
             int i5 = 1;
             if (i4) {
                if (i4 != i5) {
                   if (i4 != 2) {
                      if (i4 != 3) {
                         continue ;
                      }
                   }else {
                      uEntity = this.nullableEntityAdapter.fromJson(p0);
                      i2 = 1;
                   }
                }else {
                   userPublic = this.nullableUserPublicAdapter.fromJson(p0);
                   i1 = 1;
                }
             }else {
                str = this.nullableStringAdapter.fromJson(p0);
                i = 1;
             }
          }else {
             p0.z0();
             p0.A0();
          }
          uBoolean = this.nullableBooleanAdapter.fromJson(p0);
          i3 = 1;
       }
       p0.y();
       PlaylistTrack playlistTrac = new PlaylistTrack();
       if (i) {
          playlistTrac.added_at = str;
       }
       if (i1) {
          playlistTrac.added_by = userPublic;
       }
       if (i2) {
          playlistTrac.entity = uEntity;
       }
       if (i3) {
          playlistTrac.is_local = uBoolean;
       }
       return playlistTrac;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,PlaylistTrack p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("added_at");
       this.nullableStringAdapter.toJson(p0, p1.added_at);
       p0.l0("added_by");
       this.nullableUserPublicAdapter.toJson(p0, p1.added_by);
       p0.l0("track");
       this.nullableEntityAdapter.toJson(p0, p1.entity);
       p0.l0("is_local");
       this.nullableBooleanAdapter.toJson(p0, p1.is_local);
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(35, "GeneratedJsonAdapter\(PlaylistTrack\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
