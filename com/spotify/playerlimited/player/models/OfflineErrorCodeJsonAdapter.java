package com.spotify.playerlimited.player.models.OfflineErrorCodeJsonAdapter;
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
import com.spotify.playerlimited.player.models.OfflineErrorCode;
import p.hf3;
import p.ve7;
import com.squareup.moshi.i;
import java.lang.NullPointerException;
import p.et0;

public final class OfflineErrorCodeJsonAdapter extends JsonAdapter	// class@000b75 from classes.dex
{
    private final JsonAdapter intAdapter;
    private final b$b options;

    public void OfflineErrorCodeJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"code"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"code\"\)");
       this.options = uob;
       JsonAdapter jsonAdapter = p0.f(Integer.TYPE, pl1.a, "code");
       co5.l(jsonAdapter, "moshi.adapter\(Int::class.java, emptySet\(\), \"code\"\)");
       this.intAdapter = jsonAdapter;
    }
    public OfflineErrorCode fromJson(b p0){
       int i;
       OfflineErrorCode offlineError;
       int i1;
       co5.o(p0, "reader");
       p0.f();
       Integer integer = null;
       while (true) {
          if (p0.T()) {
             if ((i = p0.v0(this.options)) != -1) {
                if (i || (integer = this.intAdapter.fromJson(p0)) != null) {
                   continue ;
                }else {
                   hf3 ohf3 = ve7.w("code", "code", p0);
                   co5.l(ohf3, "unexpectedNull\(\"code\", \"code\", reader\)");
                   throw ohf3;
                }
             }else {
                p0.z0();
                p0.A0();
             }
          }else {
             p0.y();
             offlineError = new OfflineErrorCode();
             i1 = (integer != null)? integer.intValue(): offlineError.a;
             break ;
          }
       }
       offlineError.a = i1;
       return offlineError;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,OfflineErrorCode p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("code");
       this.intAdapter.toJson(p0, Integer.valueOf(p1.a));
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(38, "GeneratedJsonAdapter\(OfflineErrorCode\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
