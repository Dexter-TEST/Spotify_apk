package com.spotify.login.signupapi.services.model.EmailValidationAndDisplayNameSuggestionResponseJsonAdapter;
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
import java.util.Map;
import java.lang.reflect.ParameterizedType;
import p.ya7;
import com.squareup.moshi.b;
import com.spotify.login.signupapi.services.model.EmailValidationAndDisplayNameSuggestionResponse;
import p.hf3;
import p.ve7;
import java.lang.Class;
import java.lang.reflect.Constructor;
import com.squareup.moshi.i;
import java.lang.NullPointerException;
import p.et0;

public final class EmailValidationAndDisplayNameSuggestionResponseJsonAdapter extends JsonAdapter	// class@0009a8 from classes.dex
{
    private Constructor constructorRef;
    private final JsonAdapter intAdapter;
    private final JsonAdapter nullableMapOfStringStringAdapter;
    private final JsonAdapter nullableStringAdapter;
    private final b$b options;

    public void EmailValidationAndDisplayNameSuggestionResponseJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"status","display_name_suggestion","errors"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"status\",\n      \"disp…me_suggestion\", \"errors\"\)");
       this.options = uob;
       pl1 a = pl1.a;
       JsonAdapter jsonAdapter = p0.f(Integer.TYPE, a, "statusCode");
       co5.l(jsonAdapter, "moshi.adapter\(Int::class…et\(\),\n      \"statusCode\"\)");
       this.intAdapter = jsonAdapter;
       jsonAdapter = p0.f(String.class, a, "displayNameSuggestion");
       co5.l(jsonAdapter, "moshi.adapter\(String::cl… \"displayNameSuggestion\"\)");
       this.nullableStringAdapter = jsonAdapter;
       Type[] typeArray = new Type[]{String.class,String.class};
       JsonAdapter jsonAdapter1 = p0.f(ya7.j(Map.class, typeArray), a, "errors");
       co5.l(jsonAdapter1, "moshi.adapter\(Types.newP…a\), emptySet\(\), \"errors\"\)");
       this.nullableMapOfStringStringAdapter = jsonAdapter1;
    }
    public EmailValidationAndDisplayNameSuggestionResponse fromJson(b p0){
       int i3;
       EmailValidationAndDisplayNameSuggestionResponseJsonAdapter tconstructor;
       int i4;
       co5.o(p0, "reader");
       int i = 0;
       Integer integer = Integer.valueOf(i);
       p0.f();
       int i1 = -1;
       String str = null;
       Map map = str;
       int i2 = -1;
       while (true) {
          if (p0.T()) {
             if ((i3 = p0.v0(this.options)) != i1) {
                if (i3) {
                   if (i3 != 1) {
                      if (i3 != 2) {
                         continue ;
                      }else {
                         map = this.nullableMapOfStringStringAdapter.fromJson(p0);
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
                return new EmailValidationAndDisplayNameSuggestionResponse(integer.intValue(), str, map);
             }
             tconstructor = this.constructorRef;
             i4 = 5;
             if (tconstructor == null) {
                Class[] uClassArray = new Class[i4];
                Class tYPE = Integer.TYPE;
                uClassArray[i] = tYPE;
                uClassArray[1] = String.class;
                uClassArray[2] = Map.class;
                uClassArray[3] = tYPE;
                uClassArray[4] = ve7.c;
                tconstructor = EmailValidationAndDisplayNameSuggestionResponse.class.getDeclaredConstructor(uClassArray);
                this.constructorRef = tconstructor;
                co5.l(tconstructor, "EmailValidationAndDispla…his.constructorRef = it }");
                break ;
             }
             break ;
          }
       }
       Object[] objArray = new Object[i4];
       objArray[i] = integer;
       objArray[1] = str;
       objArray[2] = map;
       objArray[3] = Integer.valueOf(i2);
       objArray[4] = null;
       tconstructor = tconstructor.newInstance(objArray);
       co5.l(tconstructor, "localConstructor.newInst…torMarker */ null\n      \)");
       return tconstructor;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,EmailValidationAndDisplayNameSuggestionResponse p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("status");
       this.intAdapter.toJson(p0, Integer.valueOf(p1.getStatusCode()));
       p0.l0("display_name_suggestion");
       this.nullableStringAdapter.toJson(p0, p1.getDisplayNameSuggestion());
       p0.l0("errors");
       this.nullableMapOfStringStringAdapter.toJson(p0, p1.getErrors());
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(69, "GeneratedJsonAdapter\(EmailValidationAndDisplayNameSuggestionResponse\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
