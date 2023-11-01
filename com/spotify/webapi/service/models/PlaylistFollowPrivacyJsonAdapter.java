package com.spotify.webapi.service.models.PlaylistFollowPrivacyJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b$b;
import p.pl1;
import java.lang.Boolean;
import java.lang.reflect.Type;
import java.util.Set;
import com.squareup.moshi.b;
import com.spotify.webapi.service.models.PlaylistFollowPrivacy;
import com.squareup.moshi.i;
import java.lang.NullPointerException;
import p.et0;

public final class PlaylistFollowPrivacyJsonAdapter extends JsonAdapter	// class@000c9d from classes.dex
{
    private final JsonAdapter nullableBooleanAdapter;
    private final b$b options;

    public void PlaylistFollowPrivacyJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"public"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"public\"\)");
       this.options = uob;
       JsonAdapter jsonAdapter = p0.f(Boolean.class, pl1.a, "is_public");
       co5.l(jsonAdapter, "moshi.adapter\(Boolean::c… emptySet\(\), \"is_public\"\)");
       this.nullableBooleanAdapter = jsonAdapter;
    }
    public PlaylistFollowPrivacy fromJson(b p0){
       int i1;
       co5.o(p0, "reader");
       p0.f();
       Boolean uBoolean = null;
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
          uBoolean = this.nullableBooleanAdapter.fromJson(p0);
          i = 1;
       }
       p0.y();
       PlaylistFollowPrivacy playlistFoll = new PlaylistFollowPrivacy();
       if (i) {
          playlistFoll.is_public = uBoolean;
       }
       return playlistFoll;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,PlaylistFollowPrivacy p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("public");
       this.nullableBooleanAdapter.toJson(p0, p1.is_public);
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(43, "GeneratedJsonAdapter\(PlaylistFollowPrivacy\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
