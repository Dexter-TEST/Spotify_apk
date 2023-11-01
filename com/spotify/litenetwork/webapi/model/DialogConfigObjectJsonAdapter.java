package com.spotify.litenetwork.webapi.model.DialogConfigObjectJsonAdapter;
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
import com.spotify.litenetwork.webapi.model.DialogConfigObject;
import com.squareup.moshi.i;
import java.lang.NullPointerException;
import p.et0;

public final class DialogConfigObjectJsonAdapter extends JsonAdapter	// class@000946 from classes.dex
{
    private final JsonAdapter nullableStringAdapter;
    private final b$b options;

    public void DialogConfigObjectJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"body","header","image_uri","primary_button","secondary_button"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"body\", \"header\", \"im…ton\", \"secondary_button\"\)");
       this.options = uob;
       JsonAdapter jsonAdapter = p0.f(String.class, pl1.a, "body");
       co5.l(jsonAdapter, "moshi.adapter\(String::cl…      emptySet\(\), \"body\"\)");
       this.nullableStringAdapter = jsonAdapter;
    }
    public DialogConfigObject fromJson(b p0){
       int i5;
       co5.o(p0, "reader");
       p0.f();
       String str = null;
       String str1 = str;
       String str2 = str1;
       String str3 = str2;
       String str4 = str3;
       int i = 0;
       int i1 = 0;
       int i2 = 0;
       int i3 = 0;
       int i4 = 0;
       while (p0.T()) {
          if ((i5 = p0.v0(this.options)) != -1) {
             int i6 = 1;
             if (i5) {
                if (i5 != i6) {
                   if (i5 != 2) {
                      if (i5 != 3) {
                         if (i5 != 4) {
                            continue ;
                         }
                      }else {
                         str3 = this.nullableStringAdapter.fromJson(p0);
                         i3 = 1;
                      }
                   }else {
                      str2 = this.nullableStringAdapter.fromJson(p0);
                      i2 = 1;
                   }
                }else {
                   str1 = this.nullableStringAdapter.fromJson(p0);
                   i1 = 1;
                }
             }else {
                str = this.nullableStringAdapter.fromJson(p0);
                i = 1;
             }
          }else {
             p0.z0();
             p0.A0();
          }
          str4 = this.nullableStringAdapter.fromJson(p0);
          i4 = 1;
       }
       p0.y();
       DialogConfigObject uDialogConfi = new DialogConfigObject();
       if (i) {
          uDialogConfi.b = str;
       }
       if (i1) {
          uDialogConfi.a = str1;
       }
       if (i2) {
          uDialogConfi.e = str2;
       }
       if (i3) {
          uDialogConfi.c = str3;
       }
       if (i4) {
          uDialogConfi.d = str4;
       }
       return uDialogConfi;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,DialogConfigObject p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("body");
       this.nullableStringAdapter.toJson(p0, p1.b);
       p0.l0("header");
       this.nullableStringAdapter.toJson(p0, p1.a);
       p0.l0("image_uri");
       this.nullableStringAdapter.toJson(p0, p1.e);
       p0.l0("primary_button");
       this.nullableStringAdapter.toJson(p0, p1.c);
       p0.l0("secondary_button");
       this.nullableStringAdapter.toJson(p0, p1.d);
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(40, "GeneratedJsonAdapter\(DialogConfigObject\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
