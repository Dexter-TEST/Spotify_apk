package com.spotify.player.legacyplayer.$AutoValue_PlayerOptionsOverrides;
import com.spotify.player.legacyplayer.PlayerOptionsOverrides;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

abstract class $AutoValue_PlayerOptionsOverrides extends PlayerOptionsOverrides	// class@000b13 from classes.dex
{
    public final Boolean a;
    public final Boolean b;
    public final Boolean c;

    public void $AutoValue_PlayerOptionsOverrides(Boolean p0,Boolean p1,Boolean p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final Boolean b(){
       return this.b;
    }
    public final Boolean c(){
       return this.c;
    }
    public final Boolean d(){
       return this.a;
    }
    public final boolean equals(Object p0){
       $AutoValue_PlayerOptionsOverrides ta;
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof PlayerOptionsOverrides) {
          return false;
       }
       if ((ta = this.a) == null) {
          if (p0.a == null) {
          label_0022 :
             if ((ta = this.b) == null) {
                if (p0.b != null) {
                label_004f :
                   b = false;
                label_0050 :
                   return b;
                }
             }else if(ta.equals(p0.b)){
             }
             if ((ta = this.c) == null) {
                if (p0.c == null) {
                   goto label_0050 ;
                }else {
                   goto label_004f ;
                }
             }else if(ta.equals(p0.c)){
                goto label_0050 ;
             }else {
                goto label_004f ;
             }
          }else {
             goto label_004f ;
          }
       }else if(ta.equals(p0.a)){
          goto label_0022 ;
       }else {
          goto label_004f ;
       }
    }
    public final int hashCode(){
       $AutoValue_PlayerOptionsOverrides ta;
       $AutoValue_PlayerOptionsOverrides tb;
       $AutoValue_PlayerOptionsOverrides tc;
       int i = 0;
       int i1 = ((ta = this.a) == null)? 0: ta.hashCode();
       int i2 = 0xf4243;
       i1 = (i1 ^ i2) * i2;
       int i3 = ((tb = this.b) == null)? 0: tb.hashCode();
       i1 = (i1 ^ i3) * i2;
       if ((tc = this.c) != null) {
          i = tc.hashCode();
       }
       return (i ^ i1);
    }
    public final String toString(){
       return "PlayerOptionsOverrides{shufflingContext="+this.a+", repeatingContext="+this.b+", repeatingTrack="+this.c+"}";
    }
}
