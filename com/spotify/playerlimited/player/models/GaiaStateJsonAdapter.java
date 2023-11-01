package com.spotify.playerlimited.player.models.GaiaStateJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b$b;
import com.spotify.playerlimited.player.models.ConnectDevice;
import java.lang.reflect.Type;
import java.lang.reflect.GenericArrayType;
import p.ya7;
import p.pl1;
import java.util.Set;
import java.lang.Boolean;
import com.squareup.moshi.b;
import com.spotify.playerlimited.player.models.GaiaState;
import p.hf3;
import p.ve7;
import com.squareup.moshi.i;
import p.kg4;
import java.lang.NullPointerException;
import p.et0;

public final class GaiaStateJsonAdapter extends JsonAdapter	// class@000b6b from classes.dex
{
    private final JsonAdapter booleanAdapter;
    private final JsonAdapter nullableArrayOfConnectDeviceAdapter;
    private final b$b options;

    public void GaiaStateJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"devices","is_active","is_active_on_same_device","is_connected","should_use_local_playback"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"devices\", \"is_active…ould_use_local_playback\"\)");
       this.options = uob;
       pl1 a = pl1.a;
       JsonAdapter jsonAdapter = p0.f(ya7.b(ConnectDevice.class), a, "devices");
       co5.l(jsonAdapter, "moshi.adapter\(Types.arra…), emptySet\(\), \"devices\"\)");
       this.nullableArrayOfConnectDeviceAdapter = jsonAdapter;
       JsonAdapter jsonAdapter1 = p0.f(Boolean.TYPE, a, "isActive");
       co5.l(jsonAdapter1, "moshi.adapter\(Boolean::c…ySet\(\),\n      \"isActive\"\)");
       this.booleanAdapter = jsonAdapter1;
    }
    public GaiaState fromJson(b p0){
       int i1;
       hf3 ohf3;
       GaiaState gaiaState;
       boolean b;
       GaiaState d;
       co5.o(p0, "reader");
       p0.f();
       ConnectDevice[] uConnectDevi = null;
       Boolean uBoolean = uConnectDevi;
       Boolean uBoolean1 = uBoolean;
       Boolean uBoolean2 = uBoolean1;
       Boolean uBoolean3 = uBoolean2;
       int i = 0;
       while (true) {
          if (p0.T()) {
             if ((i1 = p0.v0(this.options)) != -1) {
                int i2 = 1;
                if (i1) {
                   if (i1 != i2) {
                      if (i1 != 2) {
                         if (i1 != 3) {
                            if (i1 != 4 || (uBoolean3 = this.booleanAdapter.fromJson(p0)) != null) {
                               continue ;
                            }else {
                               ohf3 = ve7.w("localPlaybackEnabled", "should_use_local_playback", p0);
                               co5.l(ohf3, "unexpectedNull\(\"localPla…_local_playback\", reader\)");
                               throw ohf3;
                            }
                         }else if((uBoolean2 = this.booleanAdapter.fromJson(p0)) != null){
                            continue ;
                         }else {
                            ohf3 = ve7.w("isConnected", "is_connected", p0);
                            co5.l(ohf3, "unexpectedNull\(\"isConnec…, \"is_connected\", reader\)");
                            throw ohf3;
                         }
                      }else if((uBoolean1 = this.booleanAdapter.fromJson(p0)) != null){
                         continue ;
                      }else {
                         ohf3 = ve7.w("isActiveOnSameDevice", "is_active_on_same_device", p0);
                         co5.l(ohf3, "unexpectedNull\(\"isActive…_on_same_device\", reader\)");
                         throw ohf3;
                      }
                   }else if((uBoolean = this.booleanAdapter.fromJson(p0)) != null){
                      continue ;
                   }else {
                      ohf3 = ve7.w("isActive", "is_active", p0);
                      co5.l(ohf3, "unexpectedNull\(\"isActive…     \"is_active\", reader\)");
                      throw ohf3;
                   }
                }else {
                   uConnectDevi = this.nullableArrayOfConnectDeviceAdapter.fromJson(p0);
                   i = 1;
                }
             }else {
                p0.z0();
                p0.A0();
             }
          }else {
             p0.y();
             gaiaState = new GaiaState();
             if (i) {
                gaiaState.e = uConnectDevi;
             }
             b = (uBoolean != null)? uBoolean.booleanValue(): gaiaState.a;
             gaiaState.a = b;
             b = (uBoolean1 != null)? uBoolean1.booleanValue(): gaiaState.c;
             gaiaState.c = b;
             b = (uBoolean2 != null)? uBoolean2.booleanValue(): gaiaState.b;
             gaiaState.b = b;
             b = (uBoolean3 != null)? uBoolean3.booleanValue(): gaiaState.d;
             break ;
          }
       }
       gaiaState.d = b;
       return gaiaState;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,GaiaState p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("devices");
       this.nullableArrayOfConnectDeviceAdapter.toJson(p0, p1.e);
       p0.l0("is_active");
       kg4.x(p1.a, this.booleanAdapter, p0, "is_active_on_same_device");
       kg4.x(p1.c, this.booleanAdapter, p0, "is_connected");
       kg4.x(p1.b, this.booleanAdapter, p0, "should_use_local_playback");
       this.booleanAdapter.toJson(p0, Boolean.valueOf(p1.d));
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(31, "GeneratedJsonAdapter\(GaiaState\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
