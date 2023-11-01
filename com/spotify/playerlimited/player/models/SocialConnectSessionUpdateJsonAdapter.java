package com.spotify.playerlimited.player.models.SocialConnectSessionUpdateJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b$b;
import p.pl1;
import java.lang.reflect.Type;
import java.util.Set;
import com.spotify.playerlimited.player.models.SocialConnectSession;
import com.squareup.moshi.b;
import com.spotify.playerlimited.player.models.SocialConnectSessionUpdate;
import com.squareup.moshi.i;
import java.lang.NullPointerException;
import p.et0;

public final class SocialConnectSessionUpdateJsonAdapter extends JsonAdapter	// class@000b89 from classes.dex
{
    private final JsonAdapter nullableSocialConnectSessionAdapter;
    private final JsonAdapter nullableStringAdapter;
    private final b$b options;

    public void SocialConnectSessionUpdateJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"reason","session"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"reason\", \"session\"\)");
       this.options = uob;
       pl1 a = pl1.a;
       JsonAdapter jsonAdapter = p0.f(String.class, a, "reason");
       co5.l(jsonAdapter, "moshi.adapter\(String::cl…    emptySet\(\), \"reason\"\)");
       this.nullableStringAdapter = jsonAdapter;
       JsonAdapter jsonAdapter1 = p0.f(SocialConnectSession.class, a, "session");
       co5.l(jsonAdapter1, "moshi.adapter\(SocialConn…a, emptySet\(\), \"session\"\)");
       this.nullableSocialConnectSessionAdapter = jsonAdapter1;
    }
    public SocialConnectSessionUpdate fromJson(b p0){
       int i2;
       co5.o(p0, "reader");
       p0.f();
       String str = null;
       SocialConnectSession socialConnec = str;
       int i = 0;
       int i1 = 0;
       while (p0.T()) {
          if ((i2 = p0.v0(this.options)) != -1) {
             int i3 = 1;
             if (i2) {
                if (i2 != i3) {
                   continue ;
                }
             }else {
                str = this.nullableStringAdapter.fromJson(p0);
                i = 1;
             }
          }else {
             p0.z0();
             p0.A0();
          }
          socialConnec = this.nullableSocialConnectSessionAdapter.fromJson(p0);
          i1 = 1;
       }
       p0.y();
       SocialConnectSessionUpdate socialConnec1 = new SocialConnectSessionUpdate();
       if (i) {
          socialConnec1.a = str;
       }
       if (i1) {
          socialConnec1.b = socialConnec;
       }
       return socialConnec1;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,SocialConnectSessionUpdate p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("reason");
       this.nullableStringAdapter.toJson(p0, p1.a);
       p0.l0("session");
       this.nullableSocialConnectSessionAdapter.toJson(p0, p1.b);
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(48, "GeneratedJsonAdapter\(SocialConnectSessionUpdate\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
