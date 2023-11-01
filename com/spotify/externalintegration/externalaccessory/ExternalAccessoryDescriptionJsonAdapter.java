package com.spotify.externalintegration.externalaccessory.ExternalAccessoryDescriptionJsonAdapter;
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
import com.spotify.externalintegration.externalaccessory.ExternalAccessoryDescription;
import p.hf3;
import p.ve7;
import java.lang.Class;
import java.lang.Integer;
import java.lang.reflect.Constructor;
import com.squareup.moshi.i;
import java.lang.NullPointerException;
import p.et0;

public final class ExternalAccessoryDescriptionJsonAdapter extends JsonAdapter	// class@0008bb from classes.dex
{
    private Constructor constructorRef;
    private final b$b options;
    private final JsonAdapter stringAdapter;

    public void ExternalAccessoryDescriptionJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"integration_type","client_id","name","transport_type","connection_label","category","company","model","version","protocol","sender_id"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"integration_type\", \"… \"protocol\", \"sender_id\"\)");
       this.options = uob;
       JsonAdapter jsonAdapter = p0.f(String.class, pl1.a, "integrationType");
       co5.l(jsonAdapter, "moshi.adapter\(String::cl…
          \"integrationType\"\)");
       this.stringAdapter = jsonAdapter;
    }
    public ExternalAccessoryDescription fromJson(b p0){
       ExternalAccessoryDescriptionJsonAdapter constructorR;
       int i2;
       ExternalAccessoryDescriptionJsonAdapter uExternalAcc = this;
       hf3 obj = p0;
       co5.o(obj, "reader");
       p0.f();
       int i = -1;
       Object obj1 = null;
       Object obj2 = null;
       Object obj3 = null;
       Object obj4 = null;
       Object obj5 = null;
       Object obj6 = null;
       Object obj7 = null;
       Object obj8 = null;
       Object obj9 = null;
       Object obj10 = null;
       Object obj11 = null;
       while (true) {
          if (p0.T()) {
             switch (obj.v0(uExternalAcc.options)){
                 case 0xffffffff:
                   p0.z0();
                   p0.A0();
                   break;
                 case 0:
                   if ((obj1 = uExternalAcc.stringAdapter.fromJson(obj)) != null) {
                      i = i & 0xfe;
                   }else {
                      obj = ve7.w("integrationType", "integration_type", obj);
                      co5.l(obj, "unexpectedNull\(\"integrat…ntegration_type\", reader\)");
                      throw obj;
                   }
                   break;
                 case 1:
                   if ((obj2 = uExternalAcc.stringAdapter.fromJson(obj)) != null) {
                      i = i & 0xfd;
                   }else {
                      obj = ve7.w("clientId", "client_id", obj);
                      co5.l(obj, "unexpectedNull\(\"clientId…     \"client_id\", reader\)");
                      throw obj;
                   }
                   break;
                 case 2:
                   if ((obj3 = uExternalAcc.stringAdapter.fromJson(obj)) != null) {
                      i = i & 0xfb;
                   }else {
                      obj = ve7.w("name", "name", obj);
                      co5.l(obj, "unexpectedNull\(\"name\", \"name\", reader\)");
                      throw obj;
                   }
                   break;
                 case 3:
                   if ((obj4 = uExternalAcc.stringAdapter.fromJson(obj)) != null) {
                      i = i & 0xf7;
                   }else {
                      obj = ve7.w("transportType", "transport_type", obj);
                      co5.l(obj, "unexpectedNull\(\"transpor…"transport_type\", reader\)");
                      throw obj;
                   }
                   break;
                 case 4:
                   if ((obj5 = uExternalAcc.stringAdapter.fromJson(obj)) != null) {
                      i = i & 0xef;
                   }else {
                      obj = ve7.w("connectionLabel", "connection_label", obj);
                      co5.l(obj, "unexpectedNull\(\"connecti…onnection_label\", reader\)");
                      throw obj;
                   }
                   break;
                 case 5:
                   if ((obj6 = uExternalAcc.stringAdapter.fromJson(obj)) != null) {
                      i = i & 0xdf;
                   }else {
                      obj = ve7.w("category", "category", obj);
                      co5.l(obj, "unexpectedNull\(\"category…      \"category\", reader\)");
                      throw obj;
                   }
                   break;
                 case 6:
                   if ((obj7 = uExternalAcc.stringAdapter.fromJson(obj)) != null) {
                      i = i & 0xbf;
                   }else {
                      obj = ve7.w("company", "company", obj);
                      co5.l(obj, "unexpectedNull\(\"company\"…       \"company\", reader\)");
                      throw obj;
                   }
                   break;
                 case 7:
                   if ((obj8 = uExternalAcc.stringAdapter.fromJson(obj)) != null) {
                      i = i & 0xff7f;
                   }else {
                      obj = ve7.w("model", "model", obj);
                      co5.l(obj, "unexpectedNull\(\"model\", …l\",\n              reader\)");
                      throw obj;
                   }
                   break;
                 case 8:
                   if ((obj9 = uExternalAcc.stringAdapter.fromJson(obj)) != null) {
                      i = i & 0xfeff;
                   }else {
                      obj = ve7.w("version", "version", obj);
                      co5.l(obj, "unexpectedNull\(\"version\"…       \"version\", reader\)");
                      throw obj;
                   }
                   break;
                 case 9:
                   if ((obj10 = uExternalAcc.stringAdapter.fromJson(obj)) != null) {
                      i = i & 0xfdff;
                   }else {
                      obj = ve7.w("protocol", "protocol", obj);
                      co5.l(obj, "unexpectedNull\(\"protocol…      \"protocol\", reader\)");
                      throw obj;
                   }
                   break;
                 case 10:
                   if ((obj11 = uExternalAcc.stringAdapter.fromJson(obj)) != null) {
                      i = i & 0xfbff;
                   }else {
                      obj = ve7.w("senderId", "sender_id", obj);
                      co5.l(obj, "unexpectedNull\(\"senderId…     \"sender_id\", reader\)");
                      throw obj;
                   }
                   break;
                 default:
             }
          }else {
             p0.y();
             if (i == -2048) {
                co5.j(obj1, "null cannot be cast to non-null type kotlin.String");
                co5.j(obj2, "null cannot be cast to non-null type kotlin.String");
                co5.j(obj3, "null cannot be cast to non-null type kotlin.String");
                co5.j(obj4, "null cannot be cast to non-null type kotlin.String");
                co5.j(obj5, "null cannot be cast to non-null type kotlin.String");
                co5.j(obj6, "null cannot be cast to non-null type kotlin.String");
                co5.j(obj7, "null cannot be cast to non-null type kotlin.String");
                co5.j(obj8, "null cannot be cast to non-null type kotlin.String");
                co5.j(obj9, "null cannot be cast to non-null type kotlin.String");
                co5.j(obj10, "null cannot be cast to non-null type kotlin.String");
                co5.j(obj11, "null cannot be cast to non-null type kotlin.String");
                ExternalAccessoryDescription obj12 = new ExternalAccessoryDescription(obj1, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11);
                return obj;
             }else {
                constructorR = uExternalAcc.constructorRef;
                int i1 = 12;
                i2 = 13;
                if (constructorR == null) {
                   Class[] uClassArray = new Class[i2];
                   uClassArray[0] = String.class;
                   uClassArray[1] = String.class;
                   uClassArray[2] = String.class;
                   uClassArray[3] = String.class;
                   uClassArray[4] = String.class;
                   uClassArray[5] = String.class;
                   uClassArray[6] = String.class;
                   uClassArray[7] = String.class;
                   uClassArray[8] = String.class;
                   uClassArray[9] = String.class;
                   uClassArray[10] = String.class;
                   uClassArray[11] = Integer.TYPE;
                   uClassArray[i1] = ve7.c;
                   constructorR = ExternalAccessoryDescription.class.getDeclaredConstructor(uClassArray);
                   uExternalAcc.constructorRef = constructorR;
                   co5.l(constructorR, "ExternalAccessoryDescrip…his.constructorRef = it }");
                   break ;
                }
                break ;
             }
          }
       }
       Object[] objArray = new Object[i2];
       objArray[0] = obj1;
       objArray[1] = obj2;
       objArray[2] = obj3;
       objArray[3] = obj4;
       objArray[4] = obj5;
       objArray[5] = obj6;
       objArray[6] = obj7;
       objArray[7] = obj8;
       objArray[8] = obj9;
       objArray[9] = obj10;
       objArray[10] = obj11;
       objArray[11] = Integer.valueOf(i);
       objArray[12] = null;
       Object obj13 = constructorR.newInstance(objArray);
       co5.l(obj13, "localConstructor.newInst…torMarker */ null\n      \)");
       return obj13;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,ExternalAccessoryDescription p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("integration_type");
       this.stringAdapter.toJson(p0, p1.a);
       p0.l0("client_id");
       this.stringAdapter.toJson(p0, p1.b);
       p0.l0("name");
       this.stringAdapter.toJson(p0, p1.c);
       p0.l0("transport_type");
       this.stringAdapter.toJson(p0, p1.d);
       p0.l0("connection_label");
       this.stringAdapter.toJson(p0, p1.e);
       p0.l0("category");
       this.stringAdapter.toJson(p0, p1.f);
       p0.l0("company");
       this.stringAdapter.toJson(p0, p1.g);
       p0.l0("model");
       this.stringAdapter.toJson(p0, p1.h);
       p0.l0("version");
       this.stringAdapter.toJson(p0, p1.i);
       p0.l0("protocol");
       this.stringAdapter.toJson(p0, p1.j);
       p0.l0("sender_id");
       this.stringAdapter.toJson(p0, p1.k);
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(50, "GeneratedJsonAdapter\(ExternalAccessoryDescription\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
