package com.spotify.webapi.service.models.FollowersJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b$b;
import p.pl1;
import java.lang.reflect.Type;
import java.util.Set;
import java.lang.Integer;
import com.squareup.moshi.b;
import com.spotify.webapi.service.models.Followers;
import com.squareup.moshi.i;
import java.lang.NullPointerException;
import p.et0;

public final class FollowersJsonAdapter extends JsonAdapter	// class@000c8f from classes.dex
{
    private final JsonAdapter nullableIntAdapter;
    private final JsonAdapter nullableStringAdapter;
    private final b$b options;

    public void FollowersJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"href","total"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"href\", \"total\"\)");
       this.options = uob;
       pl1 a = pl1.a;
       JsonAdapter jsonAdapter = p0.f(String.class, a, "href");
       co5.l(jsonAdapter, "moshi.adapter\(String::cl…      emptySet\(\), \"href\"\)");
       this.nullableStringAdapter = jsonAdapter;
       JsonAdapter jsonAdapter1 = p0.f(Integer.class, a, "total");
       co5.l(jsonAdapter1, "moshi.adapter\(Int::class…     emptySet\(\), \"total\"\)");
       this.nullableIntAdapter = jsonAdapter1;
    }
    public Followers fromJson(b p0){
       int i2;
       co5.o(p0, "reader");
       p0.f();
       String str = null;
       Integer integer = str;
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
          integer = this.nullableIntAdapter.fromJson(p0);
          i1 = 1;
       }
       p0.y();
       Followers uFollowers = new Followers();
       if (i) {
          uFollowers.href = str;
       }
       if (i1) {
          uFollowers.total = integer;
       }
       return uFollowers;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,Followers p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("href");
       this.nullableStringAdapter.toJson(p0, p1.href);
       p0.l0("total");
       this.nullableIntAdapter.toJson(p0, p1.total);
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(31, "GeneratedJsonAdapter\(Followers\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
