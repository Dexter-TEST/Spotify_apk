package com.spotify.localfiles.localfiles.LocalArtistJsonAdapter;
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
import com.spotify.localfiles.localfiles.LocalArtist;
import p.hf3;
import p.ve7;
import com.squareup.moshi.i;
import java.lang.NullPointerException;
import p.et0;

public final class LocalArtistJsonAdapter extends JsonAdapter	// class@000978 from classes.dex
{
    private final b$b options;
    private final JsonAdapter stringAdapter;

    public void LocalArtistJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"link","name"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"link\", \"name\"\)");
       this.options = uob;
       JsonAdapter jsonAdapter = p0.f(String.class, pl1.a, "uri");
       co5.l(jsonAdapter, "moshi.adapter\(String::cl� emptySet\(\),\n      \"uri\"\)");
       this.stringAdapter = jsonAdapter;
    }
    public LocalArtist fromJson(b p0){
       int i;
       hf3 ohf3;
       co5.o(p0, "reader");
       p0.f();
       String str = null;
       String str1 = str;
       do {
          String str2 = "link";
          if (p0.T()) {
             if ((i = p0.v0(this.options)) != -1) {
                if (i) {
                }else if((str = this.stringAdapter.fromJson(p0)) != null){
                   continue ;
                }else {
                   ohf3 = ve7.w("uri", str2, p0);
                   co5.l(ohf3, "unexpectedNull\(\"uri\", \"link\",\n            reader\)");
                   throw ohf3;
                }
             }else {
                p0.z0();
                p0.A0();
             }
          }else {
             p0.y();
             if (str != null) {
                if (str1 != null) {
                   return new LocalArtist(str, str1);
                }
                ohf3 = ve7.o("name", "name", p0);
                co5.l(ohf3, "missingProperty\(\"name\", \"name\", reader\)");
                throw ohf3;
             }else {
                ohf3 = ve7.o("uri", str2, p0);
                co5.l(ohf3, "missingProperty\(\"uri\", \"link\", reader\)");
                throw ohf3;
             }
          }
       } while (i != 1 || (str1 = this.stringAdapter.fromJson(p0)) != null);
       ohf3 = ve7.w("name", "name", p0);
       co5.l(ohf3, "unexpectedNull\(\"name\", \"name\",\n            reader\)");
       throw ohf3;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,LocalArtist p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("link");
       this.stringAdapter.toJson(p0, p1.a);
       p0.l0("name");
       this.stringAdapter.toJson(p0, p1.b);
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(33, "GeneratedJsonAdapter\(LocalArtist\)", "StringBuilder\(capacity\).�builderAction\).toString\(\)");
    }
}
