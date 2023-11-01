package com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory_PlayerContextAdapter_AdapterJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b$b;
import com.spotify.player.legacyplayer.PlayerContextPage;
import java.lang.reflect.Type;
import java.lang.reflect.GenericArrayType;
import p.ya7;
import p.pl1;
import java.util.Set;
import java.util.Map;
import java.lang.reflect.ParameterizedType;
import com.spotify.player.legacyplayer.PlayerRestrictions;
import com.squareup.moshi.b;
import com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory$PlayerContextAdapter$Adapter;
import com.squareup.moshi.i;
import java.lang.NullPointerException;
import p.et0;

public final class CosmosTypeAdapterFactory_PlayerContextAdapter_AdapterJsonAdapter extends JsonAdapter	// class@000b58 from classes.dex
{
    private final JsonAdapter nullableArrayOfPlayerContextPageAdapter;
    private final JsonAdapter nullableMapOfStringStringAdapter;
    private final JsonAdapter nullablePlayerRestrictionsAdapter;
    private final JsonAdapter nullableStringAdapter;
    private final b$b options;

    public void CosmosTypeAdapterFactory_PlayerContextAdapter_AdapterJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"fallback_pages","metadata","pages","restrictions","uri","url"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"fallback_pages\", \"me…trictions\", \"uri\", \"url\"\)");
       this.options = uob;
       pl1 a = pl1.a;
       JsonAdapter jsonAdapter = p0.f(ya7.b(PlayerContextPage.class), a, "fallbackPages");
       co5.l(jsonAdapter, "moshi.adapter\(Types.arra…tySet\(\), \"fallbackPages\"\)");
       this.nullableArrayOfPlayerContextPageAdapter = jsonAdapter;
       Type[] typeArray = new Type[]{String.class,String.class};
       jsonAdapter = p0.f(ya7.j(Map.class, typeArray), a, "metadata");
       co5.l(jsonAdapter, "moshi.adapter\(Types.newP…, emptySet\(\), \"metadata\"\)");
       this.nullableMapOfStringStringAdapter = jsonAdapter;
       jsonAdapter = p0.f(PlayerRestrictions.class, a, "restrictions");
       co5.l(jsonAdapter, "moshi.adapter\(PlayerRest…ptySet\(\), \"restrictions\"\)");
       this.nullablePlayerRestrictionsAdapter = jsonAdapter;
       JsonAdapter jsonAdapter1 = p0.f(String.class, a, "uri");
       co5.l(jsonAdapter1, "moshi.adapter\(String::cl…
          emptySet\(\), \"uri\"\)");
       this.nullableStringAdapter = jsonAdapter1;
    }
    public CosmosTypeAdapterFactory$PlayerContextAdapter$Adapter fromJson(b p0){
       co5.o(p0, "reader");
       p0.f();
       PlayerContextPage[] playerContex = null;
       Map map = playerContex;
       PlayerContextPage[] playerContex1 = map;
       PlayerRestrictions playerRestri = playerContex1;
       String str = playerRestri;
       String str1 = str;
       int i = 0;
       int i1 = 0;
       int i2 = 0;
       int i3 = 0;
       int i4 = 0;
       int i5 = 0;
       while (p0.T()) {
          switch (p0.v0(this.options)){
              case 0xffffffff:
                p0.z0();
                p0.A0();
                break;
              case 0:
                playerContex = this.nullableArrayOfPlayerContextPageAdapter.fromJson(p0);
                i = 1;
                break;
              case 1:
                map = this.nullableMapOfStringStringAdapter.fromJson(p0);
                i1 = 1;
                break;
              case 2:
                playerContex1 = this.nullableArrayOfPlayerContextPageAdapter.fromJson(p0);
                i2 = 1;
                break;
              case 3:
                playerRestri = this.nullablePlayerRestrictionsAdapter.fromJson(p0);
                i3 = 1;
                break;
              case 4:
                str = this.nullableStringAdapter.fromJson(p0);
                i4 = 1;
                break;
              case 5:
                str1 = this.nullableStringAdapter.fromJson(p0);
                i5 = 1;
                break;
              default:
          }
       }
       p0.y();
       CosmosTypeAdapterFactory$PlayerContextAdapter$Adapter playerContex2 = new CosmosTypeAdapterFactory$PlayerContextAdapter$Adapter();
       if (i) {
          playerContex2.e = playerContex;
       }
       if (i1) {
          playerContex2.b = map;
       }
       if (i2) {
          playerContex2.d = playerContex1;
       }
       if (i3) {
          playerContex2.c = playerRestri;
       }
       if (i4) {
          playerContex2.a = str;
       }
       if (i5) {
          playerContex2.f = str1;
       }
       return playerContex2;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,CosmosTypeAdapterFactory$PlayerContextAdapter$Adapter p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("fallback_pages");
       this.nullableArrayOfPlayerContextPageAdapter.toJson(p0, p1.e);
       p0.l0("metadata");
       this.nullableMapOfStringStringAdapter.toJson(p0, p1.b);
       p0.l0("pages");
       this.nullableArrayOfPlayerContextPageAdapter.toJson(p0, p1.d);
       p0.l0("restrictions");
       this.nullablePlayerRestrictionsAdapter.toJson(p0, p1.c);
       p0.l0("uri");
       this.nullableStringAdapter.toJson(p0, p1.a);
       p0.l0("url");
       this.nullableStringAdapter.toJson(p0, p1.f);
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(75, "GeneratedJsonAdapter\(CosmosTypeAdapterFactory.PlayerContextAdapter.Adapter\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
