package com.spotify.messaging.inappmessaging.inappmessagingsdk.datasource.models.KodakImageResponseJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b$b;
import p.pl1;
import java.lang.reflect.Type;
import java.util.Set;
import com.squareup.moshi.b;
import com.spotify.messaging.inappmessaging.inappmessagingsdk.datasource.models.KodakImageResponse;
import p.hf3;
import p.ve7;
import com.squareup.moshi.i;
import java.lang.NullPointerException;
import p.et0;

public final class KodakImageResponseJsonAdapter extends JsonAdapter	// class@000a27 from classes.dex
{
    private final b$b options;
    private final JsonAdapter stringAdapter;

    public void KodakImageResponseJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"imageUrl"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"imageUrl\"\)");
       this.options = uob;
       JsonAdapter jsonAdapter = p0.f(String.class, pl1.a, "imageUrl");
       co5.l(jsonAdapter, "moshi.adapter\(String::cl…ySet\(\),\n      \"imageUrl\"\)");
       this.stringAdapter = jsonAdapter;
    }
    public KodakImageResponse fromJson(b p0){
       int i;
       hf3 ohf3;
       co5.o(p0, "reader");
       p0.f();
       String str = null;
       do {
          if (p0.T()) {
             if ((i = p0.v0(this.options)) != -1) {
             }else {
                p0.z0();
                p0.A0();
             }
          }else {
             p0.y();
             if (str != null) {
                return new KodakImageResponse(str);
             }
             ohf3 = ve7.o("imageUrl", "imageUrl", p0);
             co5.l(ohf3, "missingProperty\(\"imageUrl\", \"imageUrl\", reader\)");
             throw ohf3;
          }
       } while (i || (str = this.stringAdapter.fromJson(p0)) != null);
       ohf3 = ve7.w("imageUrl", "imageUrl", p0);
       co5.l(ohf3, "unexpectedNull\(\"imageUrl…      \"imageUrl\", reader\)");
       throw ohf3;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,KodakImageResponse p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("imageUrl");
       this.stringAdapter.toJson(p0, p1.a);
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(40, "GeneratedJsonAdapter\(KodakImageResponse\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
