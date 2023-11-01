package com.spotify.playerlimited.player.models.LoginRequestJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b$b;
import p.pl1;
import com.spotify.playerlimited.player.models.LoginCredentials;
import java.lang.reflect.Type;
import java.util.Set;
import com.spotify.playerlimited.player.models.LoginOptions;
import com.squareup.moshi.b;
import com.spotify.playerlimited.player.models.LoginRequest;
import com.squareup.moshi.i;
import java.lang.NullPointerException;
import p.et0;

public final class LoginRequestJsonAdapter extends JsonAdapter	// class@000b71 from classes.dex
{
    private final JsonAdapter nullableLoginCredentialsAdapter;
    private final JsonAdapter nullableLoginOptionsAdapter;
    private final b$b options;

    public void LoginRequestJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"credentials","options"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"credentials\", \"options\"\)");
       this.options = uob;
       pl1 a = pl1.a;
       JsonAdapter jsonAdapter = p0.f(LoginCredentials.class, a, "credentials");
       co5.l(jsonAdapter, "moshi.adapter\(LoginCrede…mptySet\(\), \"credentials\"\)");
       this.nullableLoginCredentialsAdapter = jsonAdapter;
       JsonAdapter jsonAdapter1 = p0.f(LoginOptions.class, a, "loginOptions");
       co5.l(jsonAdapter1, "moshi.adapter\(LoginOptio…ptySet\(\), \"loginOptions\"\)");
       this.nullableLoginOptionsAdapter = jsonAdapter1;
    }
    public LoginRequest fromJson(b p0){
       int i2;
       co5.o(p0, "reader");
       p0.f();
       LoginCredentials loginCredent = null;
       LoginOptions loginOptions = loginCredent;
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
                loginCredent = this.nullableLoginCredentialsAdapter.fromJson(p0);
                i = 1;
             }
          }else {
             p0.z0();
             p0.A0();
          }
          loginOptions = this.nullableLoginOptionsAdapter.fromJson(p0);
          i1 = 1;
       }
       p0.y();
       LoginRequest loginRequest = new LoginRequest();
       if (i) {
          loginRequest.a = loginCredent;
       }
       if (i1) {
          loginRequest.b = loginOptions;
       }
       return loginRequest;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,LoginRequest p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("credentials");
       this.nullableLoginCredentialsAdapter.toJson(p0, p1.a);
       p0.l0("options");
       this.nullableLoginOptionsAdapter.toJson(p0, p1.b);
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(34, "GeneratedJsonAdapter\(LoginRequest\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
