package com.spotify.playerlimited.player.models.ConnectDeviceJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b$b;
import p.pl1;
import java.lang.reflect.Type;
import java.util.Set;
import java.lang.Boolean;
import com.squareup.moshi.b;
import com.spotify.playerlimited.player.models.ConnectDevice;
import p.hf3;
import p.ve7;
import com.squareup.moshi.i;
import p.kg4;
import java.lang.NullPointerException;
import p.et0;

public final class ConnectDeviceJsonAdapter extends JsonAdapter	// class@000b67 from classes.dex
{
    private final JsonAdapter booleanAdapter;
    private final JsonAdapter nullableStringAdapter;
    private final b$b options;

    public void ConnectDeviceJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"identifier","is_active","is_self","name","physical_identifier","type"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"identifier\", \"is_act…ical_identifier\", \"type\"\)");
       this.options = uob;
       pl1 a = pl1.a;
       JsonAdapter jsonAdapter = p0.f(String.class, a, "identifier");
       co5.l(jsonAdapter, "moshi.adapter\(String::cl…emptySet\(\), \"identifier\"\)");
       this.nullableStringAdapter = jsonAdapter;
       JsonAdapter jsonAdapter1 = p0.f(Boolean.TYPE, a, "isActive");
       co5.l(jsonAdapter1, "moshi.adapter\(Boolean::c…ySet\(\),\n      \"isActive\"\)");
       this.booleanAdapter = jsonAdapter1;
    }
    public ConnectDevice fromJson(b p0){
       hf3 ohf3;
       ConnectDevice uConnectDevi;
       ConnectDevice b1;
       co5.o(p0, "reader");
       p0.f();
       String str = null;
       Boolean uBoolean = str;
       Boolean uBoolean1 = uBoolean;
       String str1 = uBoolean1;
       String str2 = str1;
       String str3 = str2;
       int i = 0;
       int i1 = 0;
       int i2 = 0;
       int i3 = 0;
       while (true) {
          if (p0.T()) {
             switch (p0.v0(this.options)){
                 case 0xffffffff:
                   p0.z0();
                   p0.A0();
                   break;
                 case 0:
                   str = this.nullableStringAdapter.fromJson(p0);
                   i = 1;
                   break;
                 case 1:
                   if ((uBoolean = this.booleanAdapter.fromJson(p0)) != null) {
                      continue ;
                   }else {
                      ohf3 = ve7.w("isActive", "is_active", p0);
                      co5.l(ohf3, "unexpectedNull\(\"isActive…     \"is_active\", reader\)");
                      throw ohf3;
                   }
                   break;
                 case 2:
                   if ((uBoolean1 = this.booleanAdapter.fromJson(p0)) != null) {
                      continue ;
                   }else {
                      ohf3 = ve7.w("isSelf", "is_self", p0);
                      co5.l(ohf3, "unexpectedNull\(\"isSelf\",…       \"is_self\", reader\)");
                      throw ohf3;
                   }
                   break;
                 case 3:
                   str1 = this.nullableStringAdapter.fromJson(p0);
                   i1 = 1;
                   break;
                 case 4:
                   str2 = this.nullableStringAdapter.fromJson(p0);
                   i2 = 1;
                   break;
                 case 5:
                   str3 = this.nullableStringAdapter.fromJson(p0);
                   i3 = 1;
                   break;
                 default:
             }
          }else {
             p0.y();
             uConnectDevi = new ConnectDevice();
             if (i) {
                uConnectDevi.e = str;
             }
             boolean b = (uBoolean != null)? uBoolean.booleanValue(): uConnectDevi.a;
             uConnectDevi.a = b;
             b = (uBoolean1 != null)? uBoolean1.booleanValue(): uConnectDevi.b;
             uConnectDevi.b = b;
             if (i1) {
                uConnectDevi.c = str1;
             }
             if (i2) {
                uConnectDevi.d = str2;
             }
             if (i3) {
                uConnectDevi.f = str3;
                break ;
             }
             break ;
          }
       }
       return uConnectDevi;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,ConnectDevice p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("identifier");
       this.nullableStringAdapter.toJson(p0, p1.e);
       p0.l0("is_active");
       kg4.x(p1.a, this.booleanAdapter, p0, "is_self");
       kg4.x(p1.b, this.booleanAdapter, p0, "name");
       this.nullableStringAdapter.toJson(p0, p1.c);
       p0.l0("physical_identifier");
       this.nullableStringAdapter.toJson(p0, p1.d);
       p0.l0("type");
       this.nullableStringAdapter.toJson(p0, p1.f);
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(35, "GeneratedJsonAdapter\(ConnectDevice\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
