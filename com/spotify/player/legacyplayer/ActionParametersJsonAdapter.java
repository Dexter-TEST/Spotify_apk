package com.spotify.player.legacyplayer.ActionParametersJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.reflect.Type;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b$b;
import p.pl1;
import java.util.Set;
import com.spotify.player.legacyplayer.LoggingParameters;
import java.lang.StringBuilder;
import java.lang.IllegalArgumentException;
import com.squareup.moshi.b;
import com.spotify.player.legacyplayer.ActionParameters;
import p.hf3;
import p.ve7;
import com.squareup.moshi.i;
import java.lang.NullPointerException;
import p.et0;

public final class ActionParametersJsonAdapter extends JsonAdapter	// class@000b15 from classes.dex
{
    private final JsonAdapter loggingParametersAdapter;
    private final JsonAdapter nullableTNullableAnyAdapter;
    private final b$b options;

    public void ActionParametersJsonAdapter(Moshi p0,Type[] p1){
       co5.o(p0, "moshi");
       co5.o(p1, "types");
       super();
       int i = 0;
       int i1 = 1;
       if (p1.length == i1) {
       }else {
          i1 = 0;
       }
       if (i1) {
          String[] stringArray = new String[]{"value","logging_params"};
          b$b uob = b$b.a(stringArray);
          co5.l(uob, "of\(\"value\", \"logging_params\"\)");
          this.options = uob;
          pl1 a = pl1.a;
          JsonAdapter jsonAdapter = p0.f(p1[i], a, "value");
          co5.l(jsonAdapter, "moshi.adapter\(types[0], emptySet\(\),\n      \"value\"\)");
          this.nullableTNullableAnyAdapter = jsonAdapter;
          JsonAdapter jsonAdapter1 = p0.f(LoggingParameters.class, a, "loggingParams");
          co5.l(jsonAdapter1, "moshi.adapter\(LoggingPar…tySet\(\), \"loggingParams\"\)");
          this.loggingParametersAdapter = jsonAdapter1;
          return;
       }else {
          String str = "TypeVariable mismatch: Expecting 1 type for generic type variables [T], but received "+p1.length;
          co5.l(str, "StringBuilder\(\).apply\(builderAction\).toString\(\)");
          throw new IllegalArgumentException(str.toString());
       }
    }
    public ActionParameters fromJson(b p0){
       int i;
       hf3 ohf3;
       co5.o(p0, "reader");
       p0.f();
       Object obj = null;
       LoggingParameters loggingParam = obj;
       do {
          if (p0.T()) {
             if ((i = p0.v0(this.options)) != -1) {
                if (i) {
                }else {
                   obj = this.nullableTNullableAnyAdapter.fromJson(p0);
                }
             }else {
                p0.z0();
                p0.A0();
             }
          }else {
             p0.y();
             if (loggingParam != null) {
                return new ActionParameters(obj, loggingParam);
             }
             ohf3 = ve7.o("loggingParams", "logging_params", p0);
             co5.l(ohf3, "missingProperty\(\"logging…"logging_params\", reader\)");
             throw ohf3;
          }
       } while (i != 1 || (loggingParam = this.loggingParametersAdapter.fromJson(p0)) != null);
       ohf3 = ve7.w("loggingParams", "logging_params", p0);
       co5.l(ohf3, "unexpectedNull\(\"loggingP…"logging_params\", reader\)");
       throw ohf3;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,ActionParameters p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("value");
       this.nullableTNullableAnyAdapter.toJson(p0, p1.a);
       p0.l0("logging_params");
       this.loggingParametersAdapter.toJson(p0, p1.b);
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(38, "GeneratedJsonAdapter\(ActionParameters\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
