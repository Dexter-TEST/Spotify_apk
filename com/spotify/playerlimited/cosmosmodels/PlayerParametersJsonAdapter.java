package com.spotify.playerlimited.cosmosmodels.PlayerParametersJsonAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.squareup.moshi.b$b;
import p.pl1;
import com.spotify.player.legacyplayer.PlayerContext;
import java.lang.reflect.Type;
import java.util.Set;
import com.spotify.player.legacyplayer.PlayOptions;
import p.kf5;
import com.spotify.player.legacyplayer.LoggingParameters;
import com.squareup.moshi.b;
import com.spotify.playerlimited.cosmosmodels.PlayerParameters;
import p.hf3;
import p.ve7;
import com.squareup.moshi.i;
import java.lang.NullPointerException;
import p.et0;

public final class PlayerParametersJsonAdapter extends JsonAdapter	// class@000b65 from classes.dex
{
    private final JsonAdapter loggingParametersAdapter;
    private final JsonAdapter nullablePlayOptionsAdapter;
    private final JsonAdapter nullablePlayOriginAdapter;
    private final JsonAdapter nullablePlayerContextAdapter;
    private final b$b options;

    public void PlayerParametersJsonAdapter(Moshi p0){
       co5.o(p0, "moshi");
       super();
       String[] stringArray = new String[]{"context","options","play_origin","logging_params"};
       b$b uob = b$b.a(stringArray);
       co5.l(uob, "of\(\"context\", \"options\",…rigin\", \"logging_params\"\)");
       this.options = uob;
       pl1 a = pl1.a;
       JsonAdapter jsonAdapter = p0.f(PlayerContext.class, a, "context");
       co5.l(jsonAdapter, "moshi.adapter\(PlayerCont…a, emptySet\(\), \"context\"\)");
       this.nullablePlayerContextAdapter = jsonAdapter;
       jsonAdapter = p0.f(PlayOptions.class, a, "options");
       co5.l(jsonAdapter, "moshi.adapter\(PlayOption…a, emptySet\(\), \"options\"\)");
       this.nullablePlayOptionsAdapter = jsonAdapter;
       jsonAdapter = p0.f(kf5.class, a, "origin");
       co5.l(jsonAdapter, "moshi.adapter\(PlayOrigin…va, emptySet\(\), \"origin\"\)");
       this.nullablePlayOriginAdapter = jsonAdapter;
       JsonAdapter jsonAdapter1 = p0.f(LoggingParameters.class, a, "loggingParams");
       co5.l(jsonAdapter1, "moshi.adapter\(LoggingPar…tySet\(\), \"loggingParams\"\)");
       this.loggingParametersAdapter = jsonAdapter1;
    }
    public PlayerParameters fromJson(b p0){
       int i;
       hf3 ohf3;
       co5.o(p0, "reader");
       p0.f();
       PlayerContext playerContex = null;
       PlayOptions playOptions = playerContex;
       kf5 okf5 = playOptions;
       LoggingParameters loggingParam = okf5;
       do {
          if (p0.T()) {
             if ((i = p0.v0(this.options)) != -1) {
                if (i) {
                   if (i != 1) {
                      if (i != 2) {
                      }else {
                         okf5 = this.nullablePlayOriginAdapter.fromJson(p0);
                      }
                   }else {
                      playOptions = this.nullablePlayOptionsAdapter.fromJson(p0);
                   }
                }else {
                   playerContex = this.nullablePlayerContextAdapter.fromJson(p0);
                }
             }else {
                p0.z0();
                p0.A0();
             }
          }else {
             p0.y();
             if (loggingParam != null) {
                return new PlayerParameters(playerContex, playOptions, okf5, loggingParam);
             }
             ohf3 = ve7.o("loggingParams", "logging_params", p0);
             co5.l(ohf3, "missingProperty\(\"logging…"logging_params\", reader\)");
             throw ohf3;
          }
       } while (i != 3 || (loggingParam = this.loggingParametersAdapter.fromJson(p0)) != null);
       ohf3 = ve7.w("loggingParams", "logging_params", p0);
       co5.l(ohf3, "unexpectedNull\(\"loggingP…"logging_params\", reader\)");
       throw ohf3;
    }
    public Object fromJson(b p0){
       return this.fromJson(p0);
    }
    public void toJson(i p0,PlayerParameters p1){
       co5.o(p0, "writer");
       if (p1 == null) {
          throw new NullPointerException("value_ was null! Wrap in .nullSafe\(\) to write nullable values.");
       }
       p0.x();
       p0.l0("context");
       this.nullablePlayerContextAdapter.toJson(p0, p1.a);
       p0.l0("options");
       this.nullablePlayOptionsAdapter.toJson(p0, p1.b);
       p0.l0("play_origin");
       this.nullablePlayOriginAdapter.toJson(p0, p1.c);
       p0.l0("logging_params");
       this.loggingParametersAdapter.toJson(p0, p1.d);
       p0.g0();
       return;
    }
    public void toJson(i p0,Object p1){
       this.toJson(p0, p1);
    }
    public String toString(){
       return et0.o(38, "GeneratedJsonAdapter\(PlayerParameters\)", "StringBuilder\(capacity\).…builderAction\).toString\(\)");
    }
}
