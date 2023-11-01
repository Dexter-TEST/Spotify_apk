package com.spotify.playerlimited.player.models.ForceOfflineJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b$b;
import java.lang.Boolean;
import p.pl1;
import java.lang.reflect.Type;
import java.util.Set;
import com.squareup.moshi.b;
import com.spotify.playerlimited.player.models.ForceOffline;
import p.hf3;
import p.ve7;
import com.squareup.moshi.i;
import java.lang.NullPointerException;
import p.et0;

public final class ForceOfflineJsonAdapter extends JsonAdapter	// class@000b69 from classes.dex
{
    private final JsonAdapter booleanAdapter;
    private final b$b options;

    public void ForceOfflineJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"force_offline"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"force_offline\"\)");
       this.options = uob;
       JsonAdapter jsonAdapter = p0.f(Boolean.TYPE, pl1.a, "forceOffline");
       co5.l(jsonAdapter, "moshi.adapter\(Boolean::c…(\),\n      \"forceOffline\"\)");
       this.booleanAdapter = jsonAdapter;
    }
    public ForceOffline fromJson(b p0){
       int i;
       hf3 ohf3;
       co5.o(p0, "reader");
       p0.f();
       Boolean uBoolean = null;
       do {
          if (p0.T()) {
             if ((i = p0.v0(this.options)) != -1) {
             }else {
                p0.z0();
                p0.A0();
             }
          }else {
             p0.y();
             if (uBoolean != null) {
                return new ForceOffline(uBoolean.booleanValue());
             }
             ohf3 = ve7.o("forceOffline", "force_offline", p0);
             co5.l(ohf3, "missingProperty\(\"forceOf…ine\",\n            reader\)");
             throw ohf3;
          }
       } while (i || (uBoolean = this.booleanAdapter.fromJson(p0)) != null);
       ohf3 = ve7.w("forceOffline", "force_offline", p0);
       co5.l(ohf3, "unexpectedNull\(\"forceOff… \"force_offline\", reader\)");
       throw ohf3;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,ForceOffline p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("force_offline");
       this.booleanAdapter.toJson(p0, Boolean.valueOf(p1.a));
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(34, "GeneratedJsonAdapter\(ForceOffline\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
