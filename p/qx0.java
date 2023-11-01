package p.qx0;
import com.squareup.moshi.JsonAdapter$a;
import java.lang.Object;
import java.lang.reflect.Type;
import java.util.Set;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.JsonAdapter;
import java.lang.String;
import p.co5;
import java.lang.Class;
import p.ya7;
import p.ks0;
import com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory$ContextAdapter;
import com.spotify.player.legacyplayer.PlayerContext;
import com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory$PlayerContextAdapter;
import p.qx5;
import com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory$RestrictionsAdapter;
import com.spotify.player.legacyplayer.PlayerRestrictions;
import com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory$PlayerRestrictionsAdapter;
import p.gt0;
import com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory$ContextPageAdapter;
import p.nt0;
import com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory$ContextTrackAdapter;
import com.spotify.player.legacyplayer.PlayerContextPage;
import com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory$PlayerContextPageAdapter;
import p.hj5;
import com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory$PreparePlayOptionsAdapter;
import com.spotify.player.legacyplayer.PlayOptions;
import com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory$PlayOptionsAdapter;
import p.rl6;
import com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory$SkipToTrackAdapter;
import com.spotify.player.legacyplayer.PlayOptionsSkipTo;
import com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory$PlayOptionsSkipToAdapter;
import p.jf5;
import com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory$TriggerAdapter;
import p.to;
import com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory$ModelAudioStreamAdapter;
import p.hf5;
import com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory$AudioStreamAdapter;
import p.if5;
import com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory$OperationAdapter;
import p.yf5;
import com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory$PlayerOptionOverridesAdapter;
import com.spotify.player.legacyplayer.PlayerOptionsOverrides;
import com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory$PlayerOptionsOverridesAdapter;
import p.vw6;
import com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory$SuppressionsAdapter;
import com.spotify.player.legacyplayer.PlayerSuppressions;
import com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory$PlayerSuppressionsAdapter;
import p.kf5;
import com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory$PlayOriginAdapter;
import com.spotify.player.legacyplayer.LoggingParameters;
import com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory$LoggingParametersAdapter;
import com.spotify.player.legacyplayer.PlayerOptions;
import com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory$PlayerOptionsAdapter;
import com.spotify.player.legacyplayer.PlayerQueue;
import com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory$PlayerQueueAdapter;
import p.ni5;
import com.spotify.playerlimited.cosmosmodels.CosmosTypeAdapterFactory$PrefetchLevelAdapter;

public final class qx0 implements JsonAdapter$a	// class@00242f from classes.dex
{

    public void qx0(){
       super();
    }
    public final JsonAdapter a(Type p0,Set p1,Moshi p2){
       CosmosTypeAdapterFactory$ContextAdapter uContextAdap;
       co5.o(p0, "type");
       co5.o(p1, "annotations");
       co5.o(p2, "moshi");
       Class uClass = ya7.g(p0);
       JsonAdapter jsonAdapter = null;
       if (ks0.class.isAssignableFrom(uClass)) {
          uContextAdap = new CosmosTypeAdapterFactory$ContextAdapter(p2);
       }else if(PlayerContext.class.isAssignableFrom(uClass)){
          uContextAdap = new CosmosTypeAdapterFactory$PlayerContextAdapter(p2);
       }else if(qx5.class.isAssignableFrom(uClass)){
          uContextAdap = new CosmosTypeAdapterFactory$RestrictionsAdapter(p2);
       }else if(PlayerRestrictions.class.isAssignableFrom(uClass)){
          uContextAdap = new CosmosTypeAdapterFactory$PlayerRestrictionsAdapter(p2);
       }else if(gt0.class.isAssignableFrom(uClass)){
          uContextAdap = new CosmosTypeAdapterFactory$ContextPageAdapter(p2);
       }else if(nt0.class.isAssignableFrom(uClass)){
          uContextAdap = new CosmosTypeAdapterFactory$ContextTrackAdapter(p2);
       }else if(PlayerContextPage.class.isAssignableFrom(uClass)){
          uContextAdap = new CosmosTypeAdapterFactory$PlayerContextPageAdapter(p2);
       }else if(hj5.class.isAssignableFrom(uClass)){
          uContextAdap = new CosmosTypeAdapterFactory$PreparePlayOptionsAdapter(p2);
       }else if(PlayOptions.class.isAssignableFrom(uClass)){
          uContextAdap = new CosmosTypeAdapterFactory$PlayOptionsAdapter(p2);
       }else if(rl6.class.isAssignableFrom(uClass)){
          uContextAdap = new CosmosTypeAdapterFactory$SkipToTrackAdapter(p2);
       }else if(PlayOptionsSkipTo.class.isAssignableFrom(uClass)){
          uContextAdap = new CosmosTypeAdapterFactory$PlayOptionsSkipToAdapter(p2);
       }else if(co5.c(jf5.class, uClass)){
          uContextAdap = new CosmosTypeAdapterFactory$TriggerAdapter();
       }else if(co5.c(to.class, uClass)){
          uContextAdap = new CosmosTypeAdapterFactory$ModelAudioStreamAdapter();
       }else if(co5.c(hf5.class, uClass)){
          uContextAdap = new CosmosTypeAdapterFactory$AudioStreamAdapter();
       }else if(co5.c(if5.class, uClass)){
          uContextAdap = new CosmosTypeAdapterFactory$OperationAdapter();
       }else if(yf5.class.isAssignableFrom(uClass)){
          uContextAdap = new CosmosTypeAdapterFactory$PlayerOptionOverridesAdapter(p2);
       }else if(PlayerOptionsOverrides.class.isAssignableFrom(uClass)){
          uContextAdap = new CosmosTypeAdapterFactory$PlayerOptionsOverridesAdapter(p2);
       }else if(vw6.class.isAssignableFrom(uClass)){
          uContextAdap = new CosmosTypeAdapterFactory$SuppressionsAdapter(p2);
       }else if(PlayerSuppressions.class.isAssignableFrom(uClass)){
          uContextAdap = new CosmosTypeAdapterFactory$PlayerSuppressionsAdapter(p2);
       }else if(kf5.class.isAssignableFrom(uClass)){
          uContextAdap = new CosmosTypeAdapterFactory$PlayOriginAdapter(p2);
       }else if(LoggingParameters.class.isAssignableFrom(uClass)){
          uContextAdap = new CosmosTypeAdapterFactory$LoggingParametersAdapter(p2);
       }else if(PlayerOptions.class.isAssignableFrom(uClass)){
          uContextAdap = new CosmosTypeAdapterFactory$PlayerOptionsAdapter(p2);
       }else if(PlayerQueue.class.isAssignableFrom(uClass)){
          uContextAdap = new CosmosTypeAdapterFactory$PlayerQueueAdapter(p2);
       }else if(ni5.class.isAssignableFrom(uClass)){
          uContextAdap = new CosmosTypeAdapterFactory$PrefetchLevelAdapter(p2);
       }else {
          uContextAdap = jsonAdapter;
       }
       if (uContextAdap != null) {
          jsonAdapter = uContextAdap.nullSafe();
       }
       return jsonAdapter;
    }
}
