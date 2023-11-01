package com.spotify.playerlimited.player.models.StorageStatisticsJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b$b;
import java.lang.Integer;
import p.pl1;
import java.lang.reflect.Type;
import java.util.Set;
import com.squareup.moshi.b;
import com.spotify.playerlimited.player.models.StorageStatistics;
import p.hf3;
import p.ve7;
import com.squareup.moshi.i;
import java.lang.NullPointerException;
import p.et0;

public final class StorageStatisticsJsonAdapter extends JsonAdapter	// class@000b8b from classes.dex
{
    private final JsonAdapter intAdapter;
    private final b$b options;

    public void StorageStatisticsJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"current_locked_size"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"current_locked_size\"\)");
       this.options = uob;
       JsonAdapter jsonAdapter = p0.f(Integer.TYPE, pl1.a, "currentLockedSize");
       co5.l(jsonAdapter, "moshi.adapter\(Int::class…     \"currentLockedSize\"\)");
       this.intAdapter = jsonAdapter;
    }
    public StorageStatistics fromJson(b p0){
       int i;
       hf3 ohf3;
       co5.o(p0, "reader");
       p0.f();
       Integer integer = null;
       do {
          if (p0.T()) {
             if ((i = p0.v0(this.options)) != -1) {
             }else {
                p0.z0();
                p0.A0();
             }
          }else {
             p0.y();
             if (integer != null) {
                return new StorageStatistics(integer.intValue());
             }
             ohf3 = ve7.o("currentLockedSize", "current_locked_size", p0);
             co5.l(ohf3, "missingProperty\(\"current…ent_locked_size\", reader\)");
             throw ohf3;
          }
       } while (i || (integer = this.intAdapter.fromJson(p0)) != null);
       ohf3 = ve7.w("currentLockedSize", "current_locked_size", p0);
       co5.l(ohf3, "unexpectedNull\(\"currentL…ent_locked_size\", reader\)");
       throw ohf3;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,StorageStatistics p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("current_locked_size");
       this.intAdapter.toJson(p0, Integer.valueOf(p1.a));
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(39, "GeneratedJsonAdapter\(StorageStatistics\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
