package com.spotify.playerlimited.player.models.LoginCredentialsJsonAdapter;
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
import com.spotify.playerlimited.player.models.LoginCredentials;
import com.squareup.moshi.i;
import java.lang.NullPointerException;
import p.et0;

public final class LoginCredentialsJsonAdapter extends JsonAdapter	// class@000b6d from classes.dex
{
    private final JsonAdapter nullableStringAdapter;
    private final b$b options;

    public void LoginCredentialsJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"authenticationType","blob","password","refreshToken","username"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"authenticationType\",…efreshToken\", \"username\"\)");
       this.options = uob;
       JsonAdapter jsonAdapter = p0.f(String.class, pl1.a, "authenticationType");
       co5.l(jsonAdapter, "moshi.adapter\(String::cl…(\), \"authenticationType\"\)");
       this.nullableStringAdapter = jsonAdapter;
    }
    public LoginCredentials fromJson(b p0){
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
       LoginCredentials loginCredent = new LoginCredentials();
       if (i) {
          loginCredent.a = str;
       }
       if (i1) {
          loginCredent.c = str1;
       }
       if (i2) {
          loginCredent.d = str2;
       }
       if (i3) {
          loginCredent.e = str3;
       }
       if (i4) {
          loginCredent.b = str4;
       }
       return loginCredent;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,LoginCredentials p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("authenticationType");
       this.nullableStringAdapter.toJson(p0, p1.a);
       p0.l0("blob");
       this.nullableStringAdapter.toJson(p0, p1.c);
       p0.l0("password");
       this.nullableStringAdapter.toJson(p0, p1.d);
       p0.l0("refreshToken");
       this.nullableStringAdapter.toJson(p0, p1.e);
       p0.l0("username");
       this.nullableStringAdapter.toJson(p0, p1.b);
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(38, "GeneratedJsonAdapter\(LoginCredentials\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
