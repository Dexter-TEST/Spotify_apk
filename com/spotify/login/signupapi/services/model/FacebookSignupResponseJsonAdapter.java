package com.spotify.login.signupapi.services.model.FacebookSignupResponseJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b$b;
import java.lang.Integer;
import p.pl1;
import java.lang.reflect.Type;
import java.util.Set;
import com.squareup.moshi.b;
import com.spotify.login.signupapi.services.model.FacebookSignupResponse;
import p.hf3;
import p.ve7;
import java.lang.Class;
import java.lang.reflect.Constructor;
import com.squareup.moshi.i;
import java.lang.NullPointerException;
import p.et0;

public final class FacebookSignupResponseJsonAdapter extends JsonAdapter	// class@0009ae from classes.dex
{
    private Constructor constructorRef;
    private final JsonAdapter intAdapter;
    private final JsonAdapter nullableStringAdapter;
    private final b$b options;

    public void FacebookSignupResponseJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"status","username","message"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"status\", \"username\", \"message\"\)");
       this.options = uob;
       pl1 a = pl1.a;
       JsonAdapter jsonAdapter = p0.f(Integer.TYPE, a, "statusCode");
       co5.l(jsonAdapter, "moshi.adapter\(Int::class…et\(\),\n      \"statusCode\"\)");
       this.intAdapter = jsonAdapter;
       JsonAdapter jsonAdapter1 = p0.f(String.class, a, "username");
       co5.l(jsonAdapter1, "moshi.adapter\(String::cl…  emptySet\(\), \"username\"\)");
       this.nullableStringAdapter = jsonAdapter1;
    }
    public FacebookSignupResponse fromJson(b p0){
       int i3;
       FacebookSignupResponseJsonAdapter tconstructor;
       int i4;
       co5.o(p0, "reader");
       int i = 0;
       Integer integer = Integer.valueOf(i);
       p0.f();
       int i1 = -1;
       String str = null;
       String str1 = str;
       int i2 = -1;
       while (true) {
          if (p0.T()) {
             if ((i3 = p0.v0(this.options)) != i1) {
                if (i3) {
                   if (i3 != 1) {
                      if (i3 != 2) {
                         continue ;
                      }else {
                         str1 = this.nullableStringAdapter.fromJson(p0);
                         i2 = i2 & 0xfb;
                      }
                   }else {
                      str = this.nullableStringAdapter.fromJson(p0);
                      i2 = i2 & 0xfd;
                   }
                }else if((integer = this.intAdapter.fromJson(p0)) != null){
                   i2 = i2 & 0xfe;
                }else {
                   hf3 ohf3 = ve7.w("statusCode", "status", p0);
                   co5.l(ohf3, "unexpectedNull\(\"statusCo…        \"status\", reader\)");
                   throw ohf3;
                }
             }else {
                p0.z0();
                p0.A0();
             }
          }else {
             p0.y();
             if (i2 == -8) {
                return new FacebookSignupResponse(integer.intValue(), str, str1);
             }
             tconstructor = this.constructorRef;
             i4 = 5;
             if (tconstructor == null) {
                Class[] uClassArray = new Class[i4];
                Class tYPE = Integer.TYPE;
                uClassArray[i] = tYPE;
                uClassArray[1] = String.class;
                uClassArray[2] = String.class;
                uClassArray[3] = tYPE;
                uClassArray[4] = ve7.c;
                tconstructor = FacebookSignupResponse.class.getDeclaredConstructor(uClassArray);
                this.constructorRef = tconstructor;
                co5.l(tconstructor, "FacebookSignupResponse::…his.constructorRef = it }");
                break ;
             }
             break ;
          }
       }
       Object[] objArray = new Object[i4];
       objArray[i] = integer;
       objArray[1] = str;
       objArray[2] = str1;
       objArray[3] = Integer.valueOf(i2);
       objArray[4] = null;
       tconstructor = tconstructor.newInstance(objArray);
       co5.l(tconstructor, "localConstructor.newInst…torMarker */ null\n      \)");
       return tconstructor;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,FacebookSignupResponse p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("status");
       this.intAdapter.toJson(p0, Integer.valueOf(p1.getStatusCode()));
       p0.l0("username");
       this.nullableStringAdapter.toJson(p0, p1.getUsername());
       p0.l0("message");
       this.nullableStringAdapter.toJson(p0, p1.getMessage());
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(44, "GeneratedJsonAdapter\(FacebookSignupResponse\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
