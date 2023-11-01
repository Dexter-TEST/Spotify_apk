package com.spotify.webapi.service.models.ErrorDetailsJsonAdapter;
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
import com.spotify.webapi.service.models.ErrorDetails;
import p.hf3;
import p.ve7;
import com.squareup.moshi.i;
import java.lang.NullPointerException;
import p.et0;

public final class ErrorDetailsJsonAdapter extends JsonAdapter	// class@000c89 from classes.dex
{
    private final JsonAdapter intAdapter;
    private final JsonAdapter nullableStringAdapter;
    private final b$b options;

    public void ErrorDetailsJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"message","status"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"message\", \"status\"\)");
       this.options = uob;
       pl1 a = pl1.a;
       JsonAdapter jsonAdapter = p0.f(String.class, a, "message");
       co5.l(jsonAdapter, "moshi.adapter\(String::cl…   emptySet\(\), \"message\"\)");
       this.nullableStringAdapter = jsonAdapter;
       JsonAdapter jsonAdapter1 = p0.f(Integer.TYPE, a, "status");
       co5.l(jsonAdapter1, "moshi.adapter\(Int::class…va, emptySet\(\), \"status\"\)");
       this.intAdapter = jsonAdapter1;
    }
    public ErrorDetails fromJson(b p0){
       int i1;
       ErrorDetails uErrorDetail;
       int i3;
       co5.o(p0, "reader");
       p0.f();
       String str = null;
       Integer integer = str;
       int i = 0;
       while (true) {
          if (p0.T()) {
             if ((i1 = p0.v0(this.options)) != -1) {
                int i2 = 1;
                if (i1) {
                   if (i1 != i2 || (integer = this.intAdapter.fromJson(p0)) != null) {
                      continue ;
                   }else {
                      hf3 ohf3 = ve7.w("status", "status", p0);
                      co5.l(ohf3, "unexpectedNull\(\"status\",…tus\",\n            reader\)");
                      throw ohf3;
                   }
                }else {
                   str = this.nullableStringAdapter.fromJson(p0);
                   i = 1;
                }
             }else {
                p0.z0();
                p0.A0();
             }
          }else {
             p0.y();
             uErrorDetail = new ErrorDetails();
             if (i) {
                uErrorDetail.message = str;
             }
             i3 = (integer != null)? integer.intValue(): uErrorDetail.status;
             break ;
          }
       }
       uErrorDetail.status = i3;
       return uErrorDetail;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,ErrorDetails p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("message");
       this.nullableStringAdapter.toJson(p0, p1.message);
       p0.l0("status");
       this.intAdapter.toJson(p0, Integer.valueOf(p1.status));
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(34, "GeneratedJsonAdapter\(ErrorDetails\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
