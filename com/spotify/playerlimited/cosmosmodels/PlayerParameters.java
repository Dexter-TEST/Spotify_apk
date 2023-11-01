package com.spotify.playerlimited.cosmosmodels.PlayerParameters;
import com.spotify.player.legacyplayer.PlayerContext;
import com.spotify.player.legacyplayer.PlayOptions;
import p.kf5;
import com.spotify.player.legacyplayer.LoggingParameters;
import java.lang.Object;
import java.lang.String;
import p.co5;

public final class PlayerParameters	// class@000b64 from classes.dex
{
    public final PlayerContext a;
    public final PlayOptions b;
    public final kf5 c;
    public final LoggingParameters d;

    public void PlayerParameters(PlayerContext p0,PlayOptions p1,kf5 p2,LoggingParameters p3){
       co5.o(p3, "loggingParams");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
}
