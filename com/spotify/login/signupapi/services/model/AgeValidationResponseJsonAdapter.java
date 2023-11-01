package com.spotify.login.signupapi.services.model.AgeValidationResponseJsonAdapter;
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
import com.spotify.login.signupapi.services.model.AgeValidationResponse;
import p.hf3;
import p.ve7;
import java.lang.Class;
import java.lang.reflect.Constructor;
import com.squareup.moshi.i;
import java.lang.NullPointerException;
import p.et0;

public final class AgeValidationResponseJsonAdapter extends JsonAdapter	// class@000991 from classes.dex
{
    private Constructor constructorRef;
    private final JsonAdapter intAdapter;
    private final b$b options;

    public void AgeValidationResponseJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"status"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"status\"\)");
       this.options = uob;
       JsonAdapter jsonAdapter = p0.f(Integer.TYPE, pl1.a, "statusCode");
       co5.l(jsonAdapter, "moshi.adapter\(Int::class…et\(\),\n      \"statusCode\"\)");
       this.intAdapter = jsonAdapter;
    }
    public AgeValidationResponse fromJson(b p0){
       int i3;
       AgeValidationResponseJsonAdapter tconstructor;
       int i4;
       co5.o(p0, "reader");
       int i = 0;
       Integer integer = Integer.valueOf(i);
       p0.f();
       int i1 = -1;
       int i2 = -1;
       while (true) {
          if (p0.T()) {
             if ((i3 = p0.v0(this.options)) != i1) {
                if (i3) {
                   continue ;
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
             if (i2 == -2) {
                return new AgeValidationResponse(integer.intValue());
             }
             tconstructor = this.constructorRef;
             i4 = 3;
             if (tconstructor == null) {
                Class[] uClassArray = new Class[i4];
                Class tYPE = Integer.TYPE;
                uClassArray[i] = tYPE;
                uClassArray[1] = tYPE;
                uClassArray[2] = ve7.c;
                tconstructor = AgeValidationResponse.class.getDeclaredConstructor(uClassArray);
                this.constructorRef = tconstructor;
                co5.l(tconstructor, "AgeValidationResponse::c…his.constructorRef = it }");
                break ;
             }
             break ;
          }
       }
       Object[] objArray = new Object[i4];
       objArray[i] = integer;
       objArray[1] = Integer.valueOf(i2);
       objArray[2] = null;
       tconstructor = tconstructor.newInstance(objArray);
       co5.l(tconstructor, "localConstructor.newInst…torMarker */ null\n      \)");
       return tconstructor;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,AgeValidationResponse p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("status");
       this.intAdapter.toJson(p0, Integer.valueOf(p1.getStatusCode()));
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(43, "GeneratedJsonAdapter\(AgeValidationResponse\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
