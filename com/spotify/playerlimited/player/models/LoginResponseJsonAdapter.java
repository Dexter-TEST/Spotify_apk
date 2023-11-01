package com.spotify.playerlimited.player.models.LoginResponseJsonAdapter;
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
import java.lang.Integer;
import com.squareup.moshi.b;
import com.spotify.playerlimited.player.models.LoginResponse;
import p.hf3;
import p.ve7;
import com.squareup.moshi.i;
import p.tp2;
import java.lang.NullPointerException;
import p.et0;

public final class LoginResponseJsonAdapter extends JsonAdapter	// class@000b73 from classes.dex
{
    private final JsonAdapter intAdapter;
    private final JsonAdapter longAdapter;
    private final JsonAdapter nullableStringAdapter;
    private final b$b options;

    public void LoginResponseJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"accessToken","canonical_phone_number","challenge_id","code_length","expires_in","identifier_token","locale","method","retry_number","storedCredentials","tokenType","type","username"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"accessToken\",\n      …ype\", \"type\", \"username\"\)");
       this.options = uob;
       pl1 a = pl1.a;
       JsonAdapter jsonAdapter = p0.f(String.class, a, "accessToken");
       co5.l(jsonAdapter, "moshi.adapter\(String::cl…mptySet\(\), \"accessToken\"\)");
       this.nullableStringAdapter = jsonAdapter;
       jsonAdapter = p0.f(Long.TYPE, a, "codeLength");
       co5.l(jsonAdapter, "moshi.adapter\(Long::clas…et\(\),\n      \"codeLength\"\)");
       this.longAdapter = jsonAdapter;
       JsonAdapter jsonAdapter1 = p0.f(Integer.TYPE, a, "method");
       co5.l(jsonAdapter1, "moshi.adapter\(Int::class…va, emptySet\(\), \"method\"\)");
       this.intAdapter = jsonAdapter1;
    }
    public LoginResponse fromJson(b p0){
       String str8;
       LoginResponse loginRespons1;
       LoginResponse m;
       LoginResponseJsonAdapter loginRespons = this;
       hf3 obj = p0;
       co5.o(obj, "reader");
       p0.f();
       String str = null;
       String str1 = str;
       String str2 = str1;
       Long longx = str2;
       Long longx1 = longx;
       String str3 = longx1;
       String str4 = str3;
       Integer integer = str4;
       Integer integer1 = integer;
       String str5 = integer1;
       String str6 = str5;
       String str7 = str6;
       int i = str7;
       int i1 = 0;
       int i2 = 0;
       int i3 = 0;
       int i4 = 0;
       int i5 = 0;
       int i6 = 0;
       int i7 = 0;
       int i8 = 0;
       int i9 = 0;
       while (true) {
          if (p0.T()) {
             str8 = i;
             switch (obj.v0(loginRespons.options)){
                 case 0xffffffff:
                   p0.z0();
                   p0.A0();
                label_0121 :
                   i = str8;
                   break;
                 case 0:
                   str = loginRespons.nullableStringAdapter.fromJson(obj);
                   i = str8;
                   i1 = 1;
                   break;
                 case 1:
                   str1 = loginRespons.nullableStringAdapter.fromJson(obj);
                   i = str8;
                   i2 = 1;
                   break;
                 case 2:
                   str2 = loginRespons.nullableStringAdapter.fromJson(obj);
                   i = str8;
                   i3 = 1;
                   break;
                 case 3:
                   if ((longx = loginRespons.longAdapter.fromJson(obj)) != null) {
                      goto label_0121 ;
                   }else {
                      obj = ve7.w("codeLength", "code_length", obj);
                      co5.l(obj, "unexpectedNull\(\"codeLeng…   \"code_length\", reader\)");
                      throw obj;
                   }
                   break;
                 case 4:
                   if ((longx1 = loginRespons.longAdapter.fromJson(obj)) != null) {
                      goto label_0121 ;
                   }else {
                      obj = ve7.w("expiresIn", "expires_in", obj);
                      co5.l(obj, "unexpectedNull\(\"expiresI…    \"expires_in\", reader\)");
                      throw obj;
                   }
                   break;
                 case 5:
                   str3 = loginRespons.nullableStringAdapter.fromJson(obj);
                   i = str8;
                   i4 = 1;
                   break;
                 case 6:
                   str4 = loginRespons.nullableStringAdapter.fromJson(obj);
                   i = str8;
                   i5 = 1;
                   break;
                 case 7:
                   if ((integer = loginRespons.intAdapter.fromJson(obj)) != null) {
                      goto label_0121 ;
                   }else {
                      obj = ve7.w("method", "method", obj);
                      co5.l(obj, "unexpectedNull\(\"method\",…hod\",\n            reader\)");
                      throw obj;
                   }
                   break;
                 case 8:
                   if ((integer1 = loginRespons.intAdapter.fromJson(obj)) != null) {
                      goto label_0121 ;
                   }else {
                      obj = ve7.w("retryNumber", "retry_number", obj);
                      co5.l(obj, "unexpectedNull\(\"retryNum…  \"retry_number\", reader\)");
                      throw obj;
                   }
                   break;
                 case 9:
                   str5 = loginRespons.nullableStringAdapter.fromJson(obj);
                   i = str8;
                   i6 = 1;
                   break;
                 case 10:
                   str6 = loginRespons.nullableStringAdapter.fromJson(obj);
                   i = str8;
                   i7 = 1;
                   break;
                 case 11:
                   str7 = loginRespons.nullableStringAdapter.fromJson(obj);
                   i = str8;
                   i8 = 1;
                   break;
                 case 12:
                   i = loginRespons.nullableStringAdapter.fromJson(obj);
                   i9 = 1;
                   break;
                 default:
                   goto label_0121 ;
             }
          }else {
             str8 = i;
             p0.y();
             loginRespons1 = new LoginResponse();
             if (i1) {
                loginRespons1.f = str;
             }
             if (i2) {
                loginRespons1.j = str1;
             }
             if (i3) {
                loginRespons1.g = str2;
             }
             long l = (longx != null)? longx.longValue(): loginRespons1.i;
             loginRespons1.i = l;
             l = (longx1 != null)? longx1.longValue(): loginRespons1.k;
             loginRespons1.k = l;
             if (i4) {
                loginRespons1.b = str3;
             }
             if (i5) {
                loginRespons1.e = str4;
             }
             int i10 = (integer != null)? integer.intValue(): loginRespons1.h;
             loginRespons1.h = i10;
             i10 = (integer1 != null)? integer1.intValue(): loginRespons1.m;
             loginRespons1.m = i10;
             if (i6) {
                loginRespons1.d = str5;
             }
             if (i7) {
                loginRespons1.l = str6;
             }
             if (i8) {
                loginRespons1.a = str7;
             }
             if (i9) {
                loginRespons1.c = str8;
                break ;
             }
             break ;
          }
       }
       return loginRespons1;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,LoginResponse p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("accessToken");
       this.nullableStringAdapter.toJson(p0, p1.f);
       p0.l0("canonical_phone_number");
       this.nullableStringAdapter.toJson(p0, p1.j);
       p0.l0("challenge_id");
       this.nullableStringAdapter.toJson(p0, p1.g);
       p0.l0("code_length");
       this.longAdapter.toJson(p0, Long.valueOf(p1.i));
       p0.l0("expires_in");
       this.longAdapter.toJson(p0, Long.valueOf(p1.k));
       p0.l0("identifier_token");
       this.nullableStringAdapter.toJson(p0, p1.b);
       p0.l0("locale");
       this.nullableStringAdapter.toJson(p0, p1.e);
       p0.l0("method");
       tp2.q(p1.h, this.intAdapter, p0, "retry_number");
       tp2.q(p1.m, this.intAdapter, p0, "storedCredentials");
       this.nullableStringAdapter.toJson(p0, p1.d);
       p0.l0("tokenType");
       this.nullableStringAdapter.toJson(p0, p1.l);
       p0.l0("type");
       this.nullableStringAdapter.toJson(p0, p1.a);
       p0.l0("username");
       this.nullableStringAdapter.toJson(p0, p1.c);
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(35, "GeneratedJsonAdapter\(LoginResponse\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
