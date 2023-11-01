package com.spotify.localfiles.localfiles.LocalTrackJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b$b;
import p.pl1;
import java.lang.reflect.Type;
import java.util.Set;
import com.spotify.localfiles.localfiles.LocalAlbum;
import com.spotify.localfiles.localfiles.LocalArtist;
import java.util.List;
import java.lang.reflect.ParameterizedType;
import p.ya7;
import java.lang.Boolean;
import com.squareup.moshi.b;
import com.spotify.localfiles.localfiles.LocalTrack;
import p.hf3;
import p.ve7;
import com.squareup.moshi.i;
import p.kg4;
import java.lang.NullPointerException;
import p.et0;

public final class LocalTrackJsonAdapter extends JsonAdapter	// class@000980 from classes.dex
{
    private final JsonAdapter booleanAdapter;
    private final JsonAdapter nullableListOfLocalArtistAdapter;
    private final JsonAdapter nullableLocalAlbumAdapter;
    private final b$b options;
    private final JsonAdapter stringAdapter;

    public void LocalTrackJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"link","rowId","name","album","artists","inCollection","isExplicit","contentUri","is19PlusOnly"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"link\", \"rowId\", \"nam…tentUri\", \"is19PlusOnly\"\)");
       this.options = uob;
       pl1 a = pl1.a;
       JsonAdapter jsonAdapter = p0.f(String.class, a, "uri");
       co5.l(jsonAdapter, "moshi.adapter\(String::cl… emptySet\(\),\n      \"uri\"\)");
       this.stringAdapter = jsonAdapter;
       jsonAdapter = p0.f(LocalAlbum.class, a, "album");
       co5.l(jsonAdapter, "moshi.adapter\(LocalAlbum…ava, emptySet\(\), \"album\"\)");
       this.nullableLocalAlbumAdapter = jsonAdapter;
       Type[] typeArray = new Type[]{LocalArtist.class};
       jsonAdapter = p0.f(ya7.j(List.class, typeArray), a, "artists");
       co5.l(jsonAdapter, "moshi.adapter\(Types.newP…   emptySet\(\), \"artists\"\)");
       this.nullableListOfLocalArtistAdapter = jsonAdapter;
       JsonAdapter jsonAdapter1 = p0.f(Boolean.TYPE, a, "inCollection");
       co5.l(jsonAdapter1, "moshi.adapter\(Boolean::c…(\),\n      \"inCollection\"\)");
       this.booleanAdapter = jsonAdapter1;
    }
    public LocalTrack fromJson(b p0){
       LocalTrackJsonAdapter localTrackJs = this;
       hf3 obj = p0;
       co5.o(obj, "reader");
       p0.f();
       Boolean uBoolean = null;
       Boolean uBoolean1 = uBoolean;
       String str = uBoolean1;
       int i = str;
       int i1 = i;
       int i2 = i1;
       int i3 = i2;
       int i4 = i3;
       int i5 = i4;
       while (true) {
          String str1 = "link";
          Object obj1 = i4;
          String str2 = "isExplicit";
          Object obj2 = i3;
          String str3 = "inCollection";
          Boolean uBoolean2 = i;
          String str4 = "name";
          Object obj3 = i5;
          String str5 = "rowId";
          if (p0.T()) {
             switch (obj.v0(localTrackJs.options)){
                 case 0xffffffff:
                   p0.z0();
                   p0.A0();
                label_00fb :
                   i4 = obj1;
                label_00fd :
                   i3 = obj2;
                label_00ff :
                   i = uBoolean2;
                label_0101 :
                   i5 = obj3;
                   break;
                 case 0:
                   if ((str = localTrackJs.stringAdapter.fromJson(obj)) != null) {
                      goto label_00fb ;
                   }else {
                      obj = ve7.w("uri", str1, obj);
                      co5.l(obj, "unexpectedNull\(\"uri\", \"link\",\n            reader\)");
                      throw obj;
                   }
                   break;
                 case 1:
                   if ((i1 = localTrackJs.stringAdapter.fromJson(obj)) != null) {
                      goto label_00fb ;
                   }else {
                      obj = ve7.w(str5, str5, obj);
                      co5.l(obj, "unexpectedNull\(\"rowId\", …wId\",\n            reader\)");
                      throw obj;
                   }
                   break;
                 case 2:
                   if ((i2 = localTrackJs.stringAdapter.fromJson(obj)) != null) {
                      goto label_00fb ;
                   }else {
                      obj = ve7.w(str4, str4, obj);
                      co5.l(obj, "unexpectedNull\(\"name\", \"name\",\n            reader\)");
                      throw obj;
                   }
                   break;
                 case 3:
                   i3 = localTrackJs.nullableLocalAlbumAdapter.fromJson(obj);
                   i4 = obj1;
                   goto label_00ff ;
                   break;
                 case 4:
                   i4 = localTrackJs.nullableListOfLocalArtistAdapter.fromJson(obj);
                   goto label_00fd ;
                   break;
                 case 5:
                   if ((uBoolean = localTrackJs.booleanAdapter.fromJson(obj)) != null) {
                      goto label_00fb ;
                   }else {
                      obj = ve7.w(str3, str3, obj);
                      co5.l(obj, "unexpectedNull\(\"inCollec…, \"inCollection\", reader\)");
                      throw obj;
                   }
                   break;
                 case 6:
                   if ((uBoolean1 = localTrackJs.booleanAdapter.fromJson(obj)) != null) {
                      goto label_00fb ;
                   }else {
                      obj = ve7.w(str2, str2, obj);
                      co5.l(obj, "unexpectedNull\(\"isExplic…    \"isExplicit\", reader\)");
                      throw obj;
                   }
                   break;
                 case 7:
                   if ((i5 = localTrackJs.stringAdapter.fromJson(obj)) != null) {
                      i4 = obj1;
                      i3 = obj2;
                      i = uBoolean2;
                   }else {
                      obj = ve7.w("contentUri", "contentUri", obj);
                      co5.l(obj, "unexpectedNull\(\"contentU…    \"contentUri\", reader\)");
                      throw obj;
                   }
                   break;
                 case 8:
                   if ((i = localTrackJs.booleanAdapter.fromJson(obj)) != null) {
                      i4 = obj1;
                      i3 = obj2;
                      goto label_0101 ;
                   }else {
                      obj = ve7.w("is19PlusOnly", "is19PlusOnly", obj);
                      co5.l(obj, "unexpectedNull\(\"is19Plus…, \"is19PlusOnly\", reader\)");
                      throw obj;
                   }
                   break;
                 default:
                   goto label_00fb ;
             }
          }else {
             p0.y();
             if (str != null) {
                if (i1 != null) {
                   if (i2 != null) {
                      if (uBoolean != null) {
                         boolean b = uBoolean.booleanValue();
                         if (uBoolean1 != null) {
                            boolean b1 = uBoolean1.booleanValue();
                            if (obj3) {
                               if (uBoolean2) {
                                  LocalTrack v20 = new LocalTrack(str, i1, i2, obj2, obj1, b, b1, obj3, uBoolean2.booleanValue());
                                  return v20;
                               }else {
                                  obj = ve7.o("is19PlusOnly", "is19PlusOnly", obj);
                                  co5.l(obj, "missingProperty\(\"is19Plu…nly\",\n            reader\)");
                                  throw obj;
                               }
                            }else {
                               obj = ve7.o("contentUri", "contentUri", obj);
                               co5.l(obj, "missingProperty\(\"content…i\", \"contentUri\", reader\)");
                               throw obj;
                            }
                         }else {
                            obj = ve7.o(str2, str2, obj);
                            co5.l(obj, "missingProperty\(\"isExpli…t\", \"isExplicit\", reader\)");
                            throw obj;
                         }
                      }else {
                         obj = ve7.o(str3, str3, obj);
                         co5.l(obj, "missingProperty\(\"inColle…ion\",\n            reader\)");
                         throw obj;
                      }
                   }else {
                      obj = ve7.o(str4, str4, obj);
                      co5.l(obj, "missingProperty\(\"name\", \"name\", reader\)");
                      throw obj;
                   }
                }else {
                   obj = ve7.o(str5, str5, obj);
                   co5.l(obj, "missingProperty\(\"rowId\", \"rowId\", reader\)");
                   throw obj;
                }
             }else {
                obj = ve7.o("uri", str1, obj);
                co5.l(obj, "missingProperty\(\"uri\", \"link\", reader\)");
                throw obj;
             }
          }
       }
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,LocalTrack p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("link");
       this.stringAdapter.toJson(p0, p1.a);
       p0.l0("rowId");
       this.stringAdapter.toJson(p0, p1.b);
       p0.l0("name");
       this.stringAdapter.toJson(p0, p1.c);
       p0.l0("album");
       this.nullableLocalAlbumAdapter.toJson(p0, p1.d);
       p0.l0("artists");
       this.nullableListOfLocalArtistAdapter.toJson(p0, p1.e);
       p0.l0("inCollection");
       kg4.x(p1.f, this.booleanAdapter, p0, "isExplicit");
       kg4.x(p1.g, this.booleanAdapter, p0, "contentUri");
       this.stringAdapter.toJson(p0, p1.h);
       p0.l0("is19PlusOnly");
       this.booleanAdapter.toJson(p0, Boolean.valueOf(p1.i));
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(32, "GeneratedJsonAdapter\(LocalTrack\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
