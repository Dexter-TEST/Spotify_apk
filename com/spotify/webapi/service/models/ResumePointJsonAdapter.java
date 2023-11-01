package com.spotify.webapi.service.models.ResumePointJsonAdapter;
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
import java.lang.Integer;
import com.squareup.moshi.b;
import com.spotify.webapi.service.models.ResumePoint;
import p.hf3;
import p.ve7;
import com.squareup.moshi.i;
import java.lang.NullPointerException;
import p.et0;

public final class ResumePointJsonAdapter extends JsonAdapter	// class@000caa from classes.dex
{
    private final JsonAdapter intAdapter;
    private final JsonAdapter nullableBooleanAdapter;
    private final b$b options;

    public void ResumePointJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"fully_played","resume_position_ms"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"fully_played\",\n      \"resume_position_ms\"\)");
       this.options = uob;
       pl1 a = pl1.a;
       JsonAdapter jsonAdapter = p0.f(Boolean.class, a, "fullyPlayed");
       co5.l(jsonAdapter, "moshi.adapter\(Boolean::c…mptySet\(\), \"fullyPlayed\"\)");
       this.nullableBooleanAdapter = jsonAdapter;
       JsonAdapter jsonAdapter1 = p0.f(Integer.TYPE, a, "resumePositionMs");
       co5.l(jsonAdapter1, "moshi.adapter\(Int::class…      \"resumePositionMs\"\)");
       this.intAdapter = jsonAdapter1;
    }
    public ResumePoint fromJson(b p0){
       int i1;
       ResumePoint resumePoint;
       int i3;
       co5.o(p0, "reader");
       p0.f();
       Boolean uBoolean = null;
       Integer integer = uBoolean;
       int i = 0;
       while (true) {
          if (p0.T()) {
             if ((i1 = p0.v0(this.options)) != -1) {
                int i2 = 1;
                if (i1) {
                   if (i1 != i2 || (integer = this.intAdapter.fromJson(p0)) != null) {
                      continue ;
                   }else {
                      hf3 ohf3 = ve7.w("resumePositionMs", "resume_position_ms", p0);
                      co5.l(ohf3, "unexpectedNull\(\"resumePo…ume_position_ms\", reader\)");
                      throw ohf3;
                   }
                }else {
                   uBoolean = this.nullableBooleanAdapter.fromJson(p0);
                   i = 1;
                }
             }else {
                p0.z0();
                p0.A0();
             }
          }else {
             p0.y();
             resumePoint = new ResumePoint();
             if (i) {
                resumePoint.fullyPlayed = uBoolean;
             }
             i3 = (integer != null)? integer.intValue(): resumePoint.resumePositionMs;
             break ;
          }
       }
       resumePoint.resumePositionMs = i3;
       return resumePoint;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,ResumePoint p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("fully_played");
       this.nullableBooleanAdapter.toJson(p0, p1.fullyPlayed);
       p0.l0("resume_position_ms");
       this.intAdapter.toJson(p0, Integer.valueOf(p1.resumePositionMs));
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(33, "GeneratedJsonAdapter\(ResumePoint\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
