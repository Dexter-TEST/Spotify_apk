package com.spotify.player.legacyplayer.PlayerOptionsOverrides;
import android.os.Parcelable;
import java.lang.Object;
import java.lang.Boolean;
import com.spotify.player.legacyplayer.AutoValue_PlayerOptionsOverrides;

public abstract class PlayerOptionsOverrides implements Parcelable	// class@000b1f from classes.dex
{

    public void PlayerOptionsOverrides(){
       super();
    }
    public static PlayerOptionsOverrides a(Boolean p0,Boolean p1,Boolean p2){
       return new AutoValue_PlayerOptionsOverrides(p0, p1, p2);
    }
    public abstract Boolean b();
    public abstract Boolean c();
    public abstract Boolean d();
}
