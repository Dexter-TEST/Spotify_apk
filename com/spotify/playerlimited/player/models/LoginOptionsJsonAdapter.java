package com.spotify.playerlimited.player.models.LoginOptionsJsonAdapter;
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
import com.spotify.playerlimited.player.models.LoginOptions;
import p.hf3;
import p.ve7;
import java.lang.Class;
import java.lang.Integer;
import java.lang.reflect.Constructor;
import com.squareup.moshi.i;
import p.kg4;
import java.lang.NullPointerException;
import p.et0;

public final class LoginOptionsJsonAdapter extends JsonAdapter	// class@000b6f from classes.dex
{
    private final JsonAdapter booleanAdapter;
    private Constructor constructorRef;
    private final b$b options;

    public void LoginOptionsJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"bootstrap_required","auth_only_setting"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"bootstrap_required\",…     \"auth_only_setting\"\)");
       this.options = uob;
       JsonAdapter jsonAdapter = p0.f(Boolean.TYPE, pl1.a, "isBootstrapRequired");
       co5.l(jsonAdapter, "moshi.adapter\(Boolean::c…   \"isBootstrapRequired\"\)");
       this.booleanAdapter = jsonAdapter;
    }
    public LoginOptions fromJson(b p0){
       int i2;
       hf3 ohf3;
       co5.o(p0, "reader");
       Boolean fALSE = Boolean.FALSE;
       p0.f();
       object oobject = null;
       int i = -1;
       Boolean uBoolean = oobject;
       int i1 = -1;
       while (true) {
          if (p0.T()) {
             if ((i2 = p0.v0(this.options)) != i) {
                if (i2) {
                   if (i2 != 1) {
                      continue ;
                   }else if((fALSE = this.booleanAdapter.fromJson(p0)) != null){
                      i1 = i1 & 0xfd;
                   }else {
                      break ;
                   }
                }else if((uBoolean = this.booleanAdapter.fromJson(p0)) != null){
                   continue ;
                }else {
                   ohf3 = ve7.w("isBootstrapRequired", "bootstrap_required", p0);
                   co5.l(ohf3, "unexpectedNull\(\"isBootst…tstrap_required\", reader\)");
                   throw ohf3;
                }
             }else {
                p0.z0();
                p0.A0();
             }
          }else {
             p0.y();
             if (i1 == -3) {
                if (uBoolean != null) {
                   return new LoginOptions(uBoolean.booleanValue(), fALSE.booleanValue());
                }else {
                   ohf3 = ve7.o("isBootstrapRequired", "bootstrap_required", p0);
                   co5.l(ohf3, "missingProperty\(\"isBoots…tstrap_required\", reader\)");
                   throw ohf3;
                }
             }else {
                LoginOptionsJsonAdapter tconstructor = this.constructorRef;
                int i3 = 4;
                if (tconstructor == null) {
                   Class[] uClassArray = new Class[i3];
                   Class tYPE = Boolean.TYPE;
                   uClassArray[0] = tYPE;
                   uClassArray[1] = tYPE;
                   uClassArray[2] = Integer.TYPE;
                   uClassArray[3] = ve7.c;
                   tconstructor = LoginOptions.class.getDeclaredConstructor(uClassArray);
                   this.constructorRef = tconstructor;
                   co5.l(tconstructor, "LoginOptions::class.java…his.constructorRef = it }");
                }
                Object[] objArray = new Object[i3];
                if (uBoolean != null) {
                   objArray[0] = Boolean.valueOf(uBoolean.booleanValue());
                   objArray[1] = fALSE;
                   objArray[2] = Integer.valueOf(i1);
                   objArray[3] = oobject;
                   p0 = tconstructor.newInstance(objArray);
                   co5.l(p0, "localConstructor.newInst…torMarker */ null\n      \)");
                   return p0;
                }else {
                   ohf3 = ve7.o("isBootstrapRequired", "bootstrap_required", p0);
                   co5.l(ohf3, "missingProperty\(\"isBoots…tstrap_required\", reader\)");
                   throw ohf3;
                }
             }
          }
       }
       ohf3 = ve7.w("authOnly", "auth_only_setting", p0);
       co5.l(ohf3, "unexpectedNull\(\"authOnly…th_only_setting\", reader\)");
       throw ohf3;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,LoginOptions p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("bootstrap_required");
       kg4.x(p1.a, this.booleanAdapter, p0, "auth_only_setting");
       this.booleanAdapter.toJson(p0, Boolean.valueOf(p1.b));
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(34, "GeneratedJsonAdapter\(LoginOptions\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
