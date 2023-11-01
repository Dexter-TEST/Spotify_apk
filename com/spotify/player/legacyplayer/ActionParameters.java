package com.spotify.player.legacyplayer.ActionParameters;
import java.lang.Object;
import com.spotify.player.legacyplayer.LoggingParameters;
import java.lang.String;
import p.co5;

public final class ActionParameters	// class@000b14 from classes.dex
{
    public final Object a;
    public final LoggingParameters b;

    public void ActionParameters(Object p0,LoggingParameters p1){
       co5.o(p1, "loggingParams");
       super();
       this.a = p0;
       this.b = p1;
    }
}
