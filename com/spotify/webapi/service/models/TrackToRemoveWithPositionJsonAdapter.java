package com.spotify.webapi.service.models.TrackToRemoveWithPositionJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b$b;
import java.lang.reflect.Type;
import java.lang.Integer;
import java.util.List;
import java.lang.reflect.ParameterizedType;
import p.ya7;
import p.pl1;
import java.util.Set;
import com.squareup.moshi.b;
import com.spotify.webapi.service.models.TrackToRemoveWithPosition;
import com.squareup.moshi.i;
import java.lang.NullPointerException;
import p.et0;

public final class TrackToRemoveWithPositionJsonAdapter extends JsonAdapter	// class@000cc6 from classes.dex
{
    private final JsonAdapter nullableListOfIntAdapter;
    private final JsonAdapter nullableStringAdapter;
    private final b$b options;

    public void TrackToRemoveWithPositionJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"positions","uri"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"positions\", \"uri\"\)");
       this.options = uob;
       Type[] typeArray = new Type[]{Integer.class};
       pl1 a = pl1.a;
       JsonAdapter jsonAdapter = p0.f(ya7.j(List.class, typeArray), a, "positions");
       co5.l(jsonAdapter, "moshi.adapter\(Types.newP… emptySet\(\), \"positions\"\)");
       this.nullableListOfIntAdapter = jsonAdapter;
       JsonAdapter jsonAdapter1 = p0.f(String.class, a, "uri");
       co5.l(jsonAdapter1, "moshi.adapter\(String::cl…
          emptySet\(\), \"uri\"\)");
       this.nullableStringAdapter = jsonAdapter1;
    }
    public TrackToRemoveWithPosition fromJson(b p0){
       int i2;
       co5.o(p0, "reader");
       p0.f();
       List list = null;
       String str = list;
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
                list = this.nullableListOfIntAdapter.fromJson(p0);
                i = 1;
             }
          }else {
             p0.z0();
             p0.A0();
          }
          str = this.nullableStringAdapter.fromJson(p0);
          i1 = 1;
       }
       p0.y();
       TrackToRemoveWithPosition trackToRemov = new TrackToRemoveWithPosition();
       if (i) {
          trackToRemov.positions = list;
       }
       if (i1) {
          trackToRemov.uri = str;
       }
       return trackToRemov;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,TrackToRemoveWithPosition p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("positions");
       this.nullableListOfIntAdapter.toJson(p0, p1.positions);
       p0.l0("uri");
       this.nullableStringAdapter.toJson(p0, p1.uri);
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(47, "GeneratedJsonAdapter\(TrackToRemoveWithPosition\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
