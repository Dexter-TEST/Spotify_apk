package com.spotify.webapi.service.models.ErrorResponseJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b$b;
import p.pl1;
import com.spotify.webapi.service.models.ErrorDetails;
import java.lang.reflect.Type;
import java.util.Set;
import com.squareup.moshi.b;
import com.spotify.webapi.service.models.ErrorResponse;
import com.squareup.moshi.i;
import java.lang.NullPointerException;
import p.et0;

public final class ErrorResponseJsonAdapter extends JsonAdapter	// class@000c8b from classes.dex
{
    private final JsonAdapter nullableErrorDetailsAdapter;
    private final b$b options;

    public void ErrorResponseJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"error"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"error\"\)");
       this.options = uob;
       JsonAdapter jsonAdapter = p0.f(ErrorDetails.class, pl1.a, "error");
       co5.l(jsonAdapter, "moshi.adapter\(ErrorDetai…ava, emptySet\(\), \"error\"\)");
       this.nullableErrorDetailsAdapter = jsonAdapter;
    }
    public ErrorResponse fromJson(b p0){
       int i1;
       co5.o(p0, "reader");
       p0.f();
       ErrorDetails uErrorDetail = null;
       int i = 0;
       while (p0.T()) {
          if ((i1 = p0.v0(this.options)) != -1) {
             if (i1) {
                continue ;
             }
          }else {
             p0.z0();
             p0.A0();
          }
          uErrorDetail = this.nullableErrorDetailsAdapter.fromJson(p0);
          i = 1;
       }
       p0.y();
       ErrorResponse uErrorRespon = new ErrorResponse();
       if (i) {
          uErrorRespon.error = uErrorDetail;
       }
       return uErrorRespon;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,ErrorResponse p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("error");
       this.nullableErrorDetailsAdapter.toJson(p0, p1.error);
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(35, "GeneratedJsonAdapter\(ErrorResponse\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
