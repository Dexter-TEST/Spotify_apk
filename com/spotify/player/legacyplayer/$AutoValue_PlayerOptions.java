package com.spotify.player.legacyplayer.$AutoValue_PlayerOptions;
import com.spotify.player.legacyplayer.PlayerOptions;
import java.lang.String;
import java.lang.StringBuilder;
import p.en6;

abstract class $AutoValue_PlayerOptions extends PlayerOptions	// class@000b12 from classes.dex
{
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public void $AutoValue_PlayerOptions(boolean p0,boolean p1,boolean p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final boolean b(){
       return this.b;
    }
    public final boolean c(){
       return this.c;
    }
    public final boolean d(){
       return this.a;
    }
    public final String toString(){
       return en6.q("PlayerOptions{shufflingContext="+this.a+", repeatingContext="+this.b+", repeatingTrack=", this.c, "}");
    }
}
