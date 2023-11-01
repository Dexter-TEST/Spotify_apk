package com.spotify.playerlimited.player.models.SocialConnectSessionJsonAdapter;
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
import com.spotify.playerlimited.player.models.SocialConnectSession;
import p.hf3;
import p.ve7;
import com.squareup.moshi.i;
import p.kg4;
import java.lang.NullPointerException;
import p.et0;

public final class SocialConnectSessionJsonAdapter extends JsonAdapter	// class@000b87 from classes.dex
{
    private final JsonAdapter booleanAdapter;
    private final JsonAdapter nullableStringAdapter;
    private final b$b options;

    public void SocialConnectSessionJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"is_session_owner","join_session_uri","session_id"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"is_session_owner\",\n …ssion_uri\", \"session_id\"\)");
       this.options = uob;
       pl1 a = pl1.a;
       JsonAdapter jsonAdapter = p0.f(Boolean.TYPE, a, "isHost");
       co5.l(jsonAdapter, "moshi.adapter\(Boolean::c…ptySet\(\),\n      \"isHost\"\)");
       this.booleanAdapter = jsonAdapter;
       JsonAdapter jsonAdapter1 = p0.f(String.class, a, "joinSessionUri");
       co5.l(jsonAdapter1, "moshi.adapter\(String::cl…ySet\(\), \"joinSessionUri\"\)");
       this.nullableStringAdapter = jsonAdapter1;
    }
    public SocialConnectSession fromJson(b p0){
       int i2;
       SocialConnectSession socialConnec;
       co5.o(p0, "reader");
       p0.f();
       Boolean uBoolean = null;
       String str = uBoolean;
       String str1 = str;
       int i = 0;
       int i1 = 0;
       while (true) {
          if (p0.T()) {
             if ((i2 = p0.v0(this.options)) != -1) {
                if (i2) {
                   if (i2 != 1) {
                      if (i2 != 2) {
                         continue ;
                      }else {
                         str1 = this.nullableStringAdapter.fromJson(p0);
                         i1 = 1;
                      }
                   }else {
                      str = this.nullableStringAdapter.fromJson(p0);
                      i = 1;
                   }
                }else if((uBoolean = this.booleanAdapter.fromJson(p0)) != null){
                   continue ;
                }else {
                   hf3 ohf3 = ve7.w("isHost", "is_session_owner", p0);
                   co5.l(ohf3, "unexpectedNull\(\"isHost\",…s_session_owner\", reader\)");
                   throw ohf3;
                }
             }else {
                p0.z0();
                p0.A0();
             }
          }else {
             p0.y();
             socialConnec = new SocialConnectSession();
             boolean b = (uBoolean != null)? uBoolean.booleanValue(): socialConnec.a;
             socialConnec.a = b;
             if (i) {
                socialConnec.b = str;
             }
             if (i1) {
                socialConnec.c = str1;
                break ;
             }
             break ;
          }
       }
       return socialConnec;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,SocialConnectSession p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("is_session_owner");
       kg4.x(p1.a, this.booleanAdapter, p0, "join_session_uri");
       this.nullableStringAdapter.toJson(p0, p1.b);
       p0.l0("session_id");
       this.nullableStringAdapter.toJson(p0, p1.c);
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(42, "GeneratedJsonAdapter\(SocialConnectSession\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
