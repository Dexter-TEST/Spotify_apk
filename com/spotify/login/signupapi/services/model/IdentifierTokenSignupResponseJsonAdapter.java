package com.spotify.login.signupapi.services.model.IdentifierTokenSignupResponseJsonAdapter;
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
import com.spotify.login.signupapi.services.model.IdentifierTokenSignupResponse;
import p.hf3;
import p.ve7;
import java.lang.Class;
import java.lang.reflect.Constructor;
import com.squareup.moshi.i;
import java.lang.NullPointerException;
import p.et0;

public final class IdentifierTokenSignupResponseJsonAdapter extends JsonAdapter	// class@0009b6 from classes.dex
{
    private Constructor constructorRef;
    private final JsonAdapter intAdapter;
    private final JsonAdapter nullableMapOfStringStringAdapter;
    private final JsonAdapter nullableStringAdapter;
    private final b$b options;

    public void IdentifierTokenSignupResponseJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"status","username","login_token","errors"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"status\", \"username\",… \"login_token\", \"errors\"\)");
       this.options = uob;
       pl1 a = pl1.a;
       JsonAdapter jsonAdapter = p0.f(Integer.TYPE, a, "statusCode");
       co5.l(jsonAdapter, "moshi.adapter\(Int::class…et\(\),\n      \"statusCode\"\)");
       this.intAdapter = jsonAdapter;
       jsonAdapter = p0.f(String.class, a, "userName");
       co5.l(jsonAdapter, "moshi.adapter\(String::cl…  emptySet\(\), \"userName\"\)");
       this.nullableStringAdapter = jsonAdapter;
       Type[] typeArray = new Type[]{String.class,String.class};
       JsonAdapter jsonAdapter1 = p0.f(ya7.j(Map.class, typeArray), a, "errors");
       co5.l(jsonAdapter1, "moshi.adapter\(Types.newP…a\), emptySet\(\), \"errors\"\)");
       this.nullableMapOfStringStringAdapter = jsonAdapter1;
    }
    public IdentifierTokenSignupResponse fromJson(b p0){
       int i3;
       IdentifierTokenSignupResponseJsonAdapter constructorR;
       int i4;
       IdentifierTokenSignupResponseJsonAdapter identifierTo = this;
       hf3 obj = p0;
       co5.o(obj, "reader");
       int i = 0;
       Integer integer = Integer.valueOf(i);
       p0.f();
       int i1 = -1;
       String str = null;
       String str1 = str;
       Map map = str1;
       int i2 = -1;
       while (true) {
          if (p0.T()) {
             if ((i3 = obj.v0(identifierTo.options)) != i1) {
                if (i3) {
                   if (i3 != 1) {
                      if (i3 != 2) {
                         if (i3 != 3) {
                            continue ;
                         }else {
                            map = identifierTo.nullableMapOfStringStringAdapter.fromJson(obj);
                            i2 = i2 & 0xf7;
                         }
                      }else {
                         str1 = identifierTo.nullableStringAdapter.fromJson(obj);
                         i2 = i2 & 0xfb;
                      }
                   }else {
                      str = identifierTo.nullableStringAdapter.fromJson(obj);
                      i2 = i2 & 0xfd;
                   }
                }else if((integer = identifierTo.intAdapter.fromJson(obj)) != null){
                   i2 = i2 & 0xfe;
                }else {
                   obj = ve7.w("statusCode", "status", obj);
                   co5.l(obj, "unexpectedNull\(\"statusCo…        \"status\", reader\)");
                   throw obj;
                }
             }else {
                p0.z0();
                p0.A0();
             }
          }else {
             p0.y();
             if (i2 == -16) {
                return new IdentifierTokenSignupResponse(integer.intValue(), str, str1, map);
             }
             constructorR = identifierTo.constructorRef;
             i4 = 6;
             if (constructorR == null) {
                Class[] uClassArray = new Class[i4];
                Class tYPE = Integer.TYPE;
                uClassArray[i] = tYPE;
                uClassArray[1] = String.class;
                uClassArray[2] = String.class;
                uClassArray[3] = Map.class;
                uClassArray[4] = tYPE;
                uClassArray[5] = ve7.c;
                constructorR = IdentifierTokenSignupResponse.class.getDeclaredConstructor(uClassArray);
                identifierTo.constructorRef = constructorR;
                co5.l(constructorR, "IdentifierTokenSignupRes…his.constructorRef = it }");
                break ;
             }
             break ;
          }
       }
       Object[] objArray = new Object[i4];
       objArray[i] = integer;
       objArray[1] = str;
       objArray[2] = str1;
       objArray[3] = map;
       objArray[4] = Integer.valueOf(i2);
       objArray[5] = null;
       Object obj1 = constructorR.newInstance(objArray);
       co5.l(obj1, "localConstructor.newInst…torMarker */ null\n      \)");
       return obj1;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,IdentifierTokenSignupResponse p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("status");
       this.intAdapter.toJson(p0, Integer.valueOf(p1.getStatusCode()));
       p0.l0("username");
       this.nullableStringAdapter.toJson(p0, p1.getUserName());
       p0.l0("login_token");
       this.nullableStringAdapter.toJson(p0, p1.getOneTimeToken());
       p0.l0("errors");
       this.nullableMapOfStringStringAdapter.toJson(p0, p1.getErrors());
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(51, "GeneratedJsonAdapter\(IdentifierTokenSignupResponse\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
