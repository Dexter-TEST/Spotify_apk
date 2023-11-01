package com.spotify.webapi.service.models.SavedTrackJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b$b;
import p.pl1;
import java.lang.reflect.Type;
import java.util.Set;
import com.spotify.webapi.service.models.Track;
import com.squareup.moshi.b;
import com.spotify.webapi.service.models.SavedTrack;
import com.squareup.moshi.i;
import java.lang.NullPointerException;
import p.et0;

public final class SavedTrackJsonAdapter extends JsonAdapter	// class@000cb2 from classes.dex
{
    private final JsonAdapter nullableStringAdapter;
    private final JsonAdapter nullableTrackAdapter;
    private final b$b options;

    public void SavedTrackJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"added_at","track"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"added_at\", \"track\"\)");
       this.options = uob;
       pl1 a = pl1.a;
       JsonAdapter jsonAdapter = p0.f(String.class, a, "added_at");
       co5.l(jsonAdapter, "moshi.adapter\(String::cl…  emptySet\(\), \"added_at\"\)");
       this.nullableStringAdapter = jsonAdapter;
       JsonAdapter jsonAdapter1 = p0.f(Track.class, a, "track");
       co5.l(jsonAdapter1, "moshi.adapter\(Track::cla…     emptySet\(\), \"track\"\)");
       this.nullableTrackAdapter = jsonAdapter1;
    }
    public SavedTrack fromJson(b p0){
       int i2;
       co5.o(p0, "reader");
       p0.f();
       String str = null;
       Track track = str;
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
          track = this.nullableTrackAdapter.fromJson(p0);
          i1 = 1;
       }
       p0.y();
       SavedTrack savedTrack = new SavedTrack();
       if (i) {
          savedTrack.added_at = str;
       }
       if (i1) {
          savedTrack.track = track;
       }
       return savedTrack;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,SavedTrack p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("added_at");
       this.nullableStringAdapter.toJson(p0, p1.added_at);
       p0.l0("track");
       this.nullableTrackAdapter.toJson(p0, p1.track);
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(32, "GeneratedJsonAdapter\(SavedTrack\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
