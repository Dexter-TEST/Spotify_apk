package com.spotify.localfiles.localfiles.LocalContentSummaryJsonAdapter;
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
import java.lang.Long;
import com.squareup.moshi.b;
import com.spotify.localfiles.localfiles.LocalContentSummary;
import p.hf3;
import p.ve7;
import com.squareup.moshi.i;
import p.tp2;
import java.lang.NullPointerException;
import p.et0;

public final class LocalContentSummaryJsonAdapter extends JsonAdapter	// class@00097a from classes.dex
{
    private final JsonAdapter intAdapter;
    private final JsonAdapter longAdapter;
    private final b$b options;

    public void LocalContentSummaryJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"numberOfTracks","totalDurationSeconds"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"numberOfTracks\",\n      \"totalDurationSeconds\"\)");
       this.options = uob;
       pl1 a = pl1.a;
       JsonAdapter jsonAdapter = p0.f(Integer.TYPE, a, "numberOfTracks");
       co5.l(jsonAdapter, "moshi.adapter\(Int::class…,\n      \"numberOfTracks\"\)");
       this.intAdapter = jsonAdapter;
       JsonAdapter jsonAdapter1 = p0.f(Long.TYPE, a, "totalDurationSeconds");
       co5.l(jsonAdapter1, "moshi.adapter\(Long::clas…  \"totalDurationSeconds\"\)");
       this.longAdapter = jsonAdapter1;
    }
    public LocalContentSummary fromJson(b p0){
       String str;
       int i;
       hf3 ohf3;
       co5.o(p0, "reader");
       p0.f();
       Integer integer = null;
       Long longx = integer;
       do {
          str = "totalDurationSeconds";
          String str1 = "numberOfTracks";
          if (p0.T()) {
             if ((i = p0.v0(this.options)) != -1) {
                if (i) {
                }else if((integer = this.intAdapter.fromJson(p0)) != null){
                   continue ;
                }else {
                   ohf3 = ve7.w(str1, str1, p0);
                   co5.l(ohf3, "unexpectedNull\(\"numberOf…"numberOfTracks\", reader\)");
                   throw ohf3;
                }
             }else {
                p0.z0();
                p0.A0();
             }
          }else {
             p0.y();
             if (integer != null) {
                int i1 = integer.intValue();
                if (longx != null) {
                   return new LocalContentSummary(i1, longx.longValue());
                }
                ohf3 = ve7.o(str, str, p0);
                co5.l(ohf3, "missingProperty\(\"totalDu…DurationSeconds\", reader\)");
                throw ohf3;
             }else {
                ohf3 = ve7.o(str1, str1, p0);
                co5.l(ohf3, "missingProperty\(\"numberO…"numberOfTracks\", reader\)");
                throw ohf3;
             }
          }
       } while (i != 1 || (longx = this.longAdapter.fromJson(p0)) != null);
       ohf3 = ve7.w(str, str, p0);
       co5.l(ohf3, "unexpectedNull\(\"totalDur…DurationSeconds\", reader\)");
       throw ohf3;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,LocalContentSummary p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("numberOfTracks");
       tp2.q(p1.a, this.intAdapter, p0, "totalDurationSeconds");
       this.longAdapter.toJson(p0, Long.valueOf(p1.b));
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(41, "GeneratedJsonAdapter\(LocalContentSummary\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
