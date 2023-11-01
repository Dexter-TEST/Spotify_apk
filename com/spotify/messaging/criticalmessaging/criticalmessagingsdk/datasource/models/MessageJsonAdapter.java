package com.spotify.messaging.criticalmessaging.criticalmessagingsdk.datasource.models.MessageJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b$b;
import p.pl1;
import java.lang.reflect.Type;
import java.util.Set;
import java.lang.Long;
import com.spotify.messaging.criticalmessaging.criticalmessagingsdk.datasource.models.Creative;
import java.lang.Boolean;
import com.squareup.moshi.b;
import com.spotify.messaging.criticalmessaging.criticalmessagingsdk.datasource.models.Message;
import p.hf3;
import p.ve7;
import com.squareup.moshi.i;
import p.kg4;
import java.lang.NullPointerException;
import p.et0;

public final class MessageJsonAdapter extends JsonAdapter	// class@000a12 from classes.dex
{
    private final JsonAdapter booleanAdapter;
    private final JsonAdapter creativeAdapter;
    private final JsonAdapter longAdapter;
    private final b$b options;
    private final JsonAdapter stringAdapter;

    public void MessageJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"uuid","id","endTimestamp","impressionUrl","creative","transactional","control"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"uuid\", \"id\", \"endTim…ransactional\", \"control\"\)");
       this.options = uob;
       pl1 a = pl1.a;
       JsonAdapter jsonAdapter = p0.f(String.class, a, "uuid");
       co5.l(jsonAdapter, "moshi.adapter\(String::cl…emptySet\(\),\n      \"uuid\"\)");
       this.stringAdapter = jsonAdapter;
       jsonAdapter = p0.f(Long.TYPE, a, "id");
       co5.l(jsonAdapter, "moshi.adapter\(Long::class.java, emptySet\(\), \"id\"\)");
       this.longAdapter = jsonAdapter;
       jsonAdapter = p0.f(Creative.class, a, "creative");
       co5.l(jsonAdapter, "moshi.adapter\(Creative::…  emptySet\(\), \"creative\"\)");
       this.creativeAdapter = jsonAdapter;
       JsonAdapter jsonAdapter1 = p0.f(Boolean.TYPE, a, "transactional");
       co5.l(jsonAdapter1, "moshi.adapter\(Boolean::c…),\n      \"transactional\"\)");
       this.booleanAdapter = jsonAdapter1;
    }
    public Message fromJson(b p0){
       MessageJsonAdapter messageJsonA = this;
       hf3 obj = p0;
       co5.o(obj, "reader");
       p0.f();
       Long longx = null;
       Long longx1 = longx;
       String str = longx1;
       Boolean uBoolean = str;
       int i = uBoolean;
       String str1 = i;
       Creative uCreative = str1;
       while (true) {
          String str2 = "transactional";
          String str3 = "creative";
          String str4 = "endTimestamp";
          Boolean uBoolean1 = i;
          String str5 = "uuid";
          if (p0.T()) {
             switch (obj.v0(messageJsonA.options)){
                 case 0xffffffff:
                   p0.z0();
                   p0.A0();
                   break;
                 case 0:
                   if ((str = messageJsonA.stringAdapter.fromJson(obj)) == null) {
                      obj = ve7.w(str5, str5, obj);
                      co5.l(obj, "unexpectedNull\(\"uuid\", \"uuid\",\n            reader\)");
                      throw obj;
                   }
                   break;
                 case 1:
                   if ((longx = messageJsonA.longAdapter.fromJson(obj)) == null) {
                      obj = ve7.w("id", "id", obj);
                      co5.l(obj, "unexpectedNull\(\"id\", \"id\", reader\)");
                      throw obj;
                   }
                   break;
                 case 2:
                   if ((longx1 = messageJsonA.longAdapter.fromJson(obj)) == null) {
                      obj = ve7.w(str4, str4, obj);
                      co5.l(obj, "unexpectedNull\(\"endTimes…, \"endTimestamp\", reader\)");
                      throw obj;
                   }
                   break;
                 case 3:
                   if ((str1 = messageJsonA.stringAdapter.fromJson(obj)) == null) {
                      obj = ve7.w("impressionUrl", "impressionUrl", obj);
                      co5.l(obj, "unexpectedNull\(\"impressi… \"impressionUrl\", reader\)");
                      throw obj;
                   }
                   break;
                 case 4:
                   if ((uCreative = messageJsonA.creativeAdapter.fromJson(obj)) == null) {
                      obj = ve7.w(str3, str3, obj);
                      co5.l(obj, "unexpectedNull\(\"creative…      \"creative\", reader\)");
                      throw obj;
                   }
                   break;
                 case 5:
                   if ((uBoolean = messageJsonA.booleanAdapter.fromJson(obj)) == null) {
                      obj = ve7.w(str2, str2, obj);
                      co5.l(obj, "unexpectedNull\(\"transact… \"transactional\", reader\)");
                      throw obj;
                   }
                   break;
                 case 6:
                   if ((i = messageJsonA.booleanAdapter.fromJson(obj)) != null) {
                      continue ;
                   }else {
                      obj = ve7.w("control", "control", obj);
                      co5.l(obj, "unexpectedNull\(\"control\"…       \"control\", reader\)");
                      throw obj;
                   }
                   break;
                 default:
             }
             i = uBoolean1;
          }else {
             p0.y();
             if (str != null) {
                if (longx != null) {
                   long l = longx.longValue();
                   if (longx1 != null) {
                      long l1 = longx1.longValue();
                      if (str1 != null) {
                         if (uCreative != null) {
                            if (uBoolean != null) {
                               boolean b = uBoolean.booleanValue();
                               if (uBoolean1) {
                                  Message v17 = new Message(str, l, l1, str1, uCreative, b, uBoolean1.booleanValue());
                                  return v17;
                               }else {
                                  obj = ve7.o("control", "control", obj);
                                  co5.l(obj, "missingProperty\(\"control\", \"control\", reader\)");
                                  throw obj;
                               }
                            }else {
                               obj = ve7.o(str2, str2, obj);
                               co5.l(obj, "missingProperty\(\"transac… \"transactional\", reader\)");
                               throw obj;
                            }
                         }else {
                            obj = ve7.o(str3, str3, obj);
                            co5.l(obj, "missingProperty\(\"creative\", \"creative\", reader\)");
                            throw obj;
                         }
                      }else {
                         obj = ve7.o("impressionUrl", "impressionUrl", obj);
                         co5.l(obj, "missingProperty\(\"impress… \"impressionUrl\", reader\)");
                         throw obj;
                      }
                   }else {
                      obj = ve7.o(str4, str4, obj);
                      co5.l(obj, "missingProperty\(\"endTime…amp\",\n            reader\)");
                      throw obj;
                   }
                }else {
                   obj = ve7.o("id", "id", obj);
                   co5.l(obj, "missingProperty\(\"id\", \"id\", reader\)");
                   throw obj;
                }
             }else {
                obj = ve7.o(str5, str5, obj);
                co5.l(obj, "missingProperty\(\"uuid\", \"uuid\", reader\)");
                throw obj;
             }
          }
       }
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,Message p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("uuid");
       this.stringAdapter.toJson(p0, p1.a);
       p0.l0("id");
       this.longAdapter.toJson(p0, Long.valueOf(p1.b));
       p0.l0("endTimestamp");
       this.longAdapter.toJson(p0, Long.valueOf(p1.c));
       p0.l0("impressionUrl");
       this.stringAdapter.toJson(p0, p1.d);
       p0.l0("creative");
       this.creativeAdapter.toJson(p0, p1.e);
       p0.l0("transactional");
       kg4.x(p1.f, this.booleanAdapter, p0, "control");
       this.booleanAdapter.toJson(p0, Boolean.valueOf(p1.g));
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(29, "GeneratedJsonAdapter\(Message\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
