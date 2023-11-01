package com.spotify.player.legacyplayer.PlayerOptions;
import android.os.Parcelable;
import java.lang.Object;
import com.spotify.player.legacyplayer.AutoValue_PlayerOptions;
import com.spotify.player.legacyplayer.$AutoValue_PlayerOptions;
import java.lang.Boolean;
import java.util.Arrays;

public abstract class PlayerOptions implements Parcelable	// class@000b1e from classes.dex
{

    public void PlayerOptions(){
       super();
    }
    public static PlayerOptions a(boolean p0,boolean p1,boolean p2){
       return new AutoValue_PlayerOptions(p0, p1, p2);
    }
    public abstract boolean b();
    public abstract boolean c();
    public abstract boolean d();
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof PlayerOptions) {
          return false;
       }
       $AutoValue_PlayerOptions $AutoValue_P = this;
       if ($AutoValue_P.a != p0.a) {
          return false;
       }
       if ($AutoValue_P.b != p0.b) {
          return false;
       }
       if ($AutoValue_P.c != p0.c) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       Object[] objArray = new Object[3];
       $AutoValue_PlayerOptions $AutoValue_P = this;
       objArray[0] = Boolean.valueOf($AutoValue_P.a);
       $AutoValue_P = $AutoValue_P.c;
       objArray[1] = Boolean.valueOf($AutoValue_P);
       objArray[2] = Boolean.valueOf($AutoValue_P);
       return Arrays.hashCode(objArray);
    }
}
