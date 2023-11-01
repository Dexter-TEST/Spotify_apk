package com.spotify.player.legacyplayer.LoggingParametersJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b$b;
import java.lang.Long;
import p.pl1;
import java.lang.reflect.Type;
import java.util.Set;
import com.squareup.moshi.b;
import com.spotify.player.legacyplayer.LoggingParameters;
import p.hf3;
import p.ve7;
import com.squareup.moshi.i;
import java.lang.NullPointerException;
import p.et0;

public final class LoggingParametersJsonAdapter extends JsonAdapter	// class@000b19 from classes.dex
{
    private final JsonAdapter longAdapter;
    private final b$b options;

    public void LoggingParametersJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"command_initiated_time"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"command_initiated_time\"\)");
       this.options = uob;
       JsonAdapter jsonAdapter = p0.f(Long.TYPE, pl1.a, "commandInitiatedTime");
       co5.l(jsonAdapter, "moshi.adapter\(Long::clas…  \"commandInitiatedTime\"\)");
       this.longAdapter = jsonAdapter;
    }
    public LoggingParameters fromJson(b p0){
       int i;
       LoggingParameters loggingParam;
       long l;
       co5.o(p0, "reader");
       p0.f();
       Long longx = null;
       while (true) {
          if (p0.T()) {
             if ((i = p0.v0(this.options)) != -1) {
                if (i || (longx = this.longAdapter.fromJson(p0)) != null) {
                   continue ;
                }else {
                   hf3 ohf3 = ve7.w("commandInitiatedTime", "command_initiated_time", p0);
                   co5.l(ohf3, "unexpectedNull\(\"commandI…_initiated_time\", reader\)");
                   throw ohf3;
                }
             }else {
                p0.z0();
                p0.A0();
             }
          }else {
             p0.y();
             loggingParam = new LoggingParameters();
             l = (longx != null)? longx.longValue(): loggingParam.a;
             break ;
          }
       }
       loggingParam.a = l;
       return loggingParam;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,LoggingParameters p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("command_initiated_time");
       this.longAdapter.toJson(p0, Long.valueOf(p1.a));
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(39, "GeneratedJsonAdapter\(LoggingParameters\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
