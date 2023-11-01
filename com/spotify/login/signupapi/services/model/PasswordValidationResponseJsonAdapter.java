package com.spotify.login.signupapi.services.model.PasswordValidationResponseJsonAdapter;
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
import com.spotify.login.signupapi.services.model.PasswordValidationResponse;
import p.hf3;
import p.ve7;
import java.lang.Class;
import java.lang.reflect.Constructor;
import com.squareup.moshi.i;
import java.lang.NullPointerException;
import p.et0;

public final class PasswordValidationResponseJsonAdapter extends JsonAdapter	// class@0009be from classes.dex
{
    private Constructor constructorRef;
    private final JsonAdapter intAdapter;
    private final JsonAdapter nullableMapOfStringStringAdapter;
    private final b$b options;

    public void PasswordValidationResponseJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"status","errors"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"status\", \"errors\"\)");
       this.options = uob;
       pl1 a = pl1.a;
       JsonAdapter jsonAdapter = p0.f(Integer.TYPE, a, "statusCode");
       co5.l(jsonAdapter, "moshi.adapter\(Int::class…et\(\),\n      \"statusCode\"\)");
       this.intAdapter = jsonAdapter;
       Type[] typeArray = new Type[]{String.class,String.class};
       JsonAdapter jsonAdapter1 = p0.f(ya7.j(Map.class, typeArray), a, "errors");
       co5.l(jsonAdapter1, "moshi.adapter\(Types.newP…a\), emptySet\(\), \"errors\"\)");
       this.nullableMapOfStringStringAdapter = jsonAdapter1;
    }
    public PasswordValidationResponse fromJson(b p0){
       int i3;
       PasswordValidationResponseJsonAdapter tconstructor;
       int i4;
       co5.o(p0, "reader");
       int i = 0;
       Integer integer = Integer.valueOf(i);
       p0.f();
       int i1 = -1;
       Map map = null;
       int i2 = -1;
       while (true) {
          if (p0.T()) {
             if ((i3 = p0.v0(this.options)) != i1) {
                if (i3) {
                   if (i3 != 1) {
                      continue ;
                   }else {
                      map = this.nullableMapOfStringStringAdapter.fromJson(p0);
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
             if (i2 == -4) {
                return new PasswordValidationResponse(integer.intValue(), map);
             }
             tconstructor = this.constructorRef;
             i4 = 4;
             if (tconstructor == null) {
                Class[] uClassArray = new Class[i4];
                Class tYPE = Integer.TYPE;
                uClassArray[i] = tYPE;
                uClassArray[1] = Map.class;
                uClassArray[2] = tYPE;
                uClassArray[3] = ve7.c;
                tconstructor = PasswordValidationResponse.class.getDeclaredConstructor(uClassArray);
                this.constructorRef = tconstructor;
                co5.l(tconstructor, "PasswordValidationRespon…his.constructorRef = it }");
                break ;
             }
             break ;
          }
       }
       Object[] objArray = new Object[i4];
       objArray[i] = integer;
       objArray[1] = map;
       objArray[2] = Integer.valueOf(i2);
       objArray[3] = null;
       tconstructor = tconstructor.newInstance(objArray);
       co5.l(tconstructor, "localConstructor.newInst…torMarker */ null\n      \)");
       return tconstructor;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,PasswordValidationResponse p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("status");
       this.intAdapter.toJson(p0, Integer.valueOf(p1.getStatusCode()));
       p0.l0("errors");
       this.nullableMapOfStringStringAdapter.toJson(p0, p1.getErrors());
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(48, "GeneratedJsonAdapter\(PasswordValidationResponse\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
