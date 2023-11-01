package com.spotify.playerlimited.player.models.GaiaState;
import java.lang.Object;
import java.util.Arrays;
import java.lang.Boolean;
import java.lang.String;
import java.lang.StringBuilder;

public class GaiaState	// class@000b6a from classes.dex
{
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public ConnectDevice[] e;

    public void GaiaState(){
       super();
    }
    public static void getDevices$annotations(){
    }
    public static void getLocalPlaybackEnabled$annotations(){
    }
    public static void isActive$annotations(){
    }
    public static void isActiveOnSameDevice$annotations(){
    }
    public static void isConnected$annotations(){
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof GaiaState) {
          return false;
       }
       if (this.a != p0.a || (this.b != p0.b || (this.c != p0.c || (this.d != p0.d || !Arrays.equals(this.e, p0.e))))) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       Object[] objArray = new Object[]{Boolean.valueOf(this.a),Boolean.valueOf(this.b),Boolean.valueOf(this.c),Boolean.valueOf(this.d)};
       return (Arrays.hashCode(this.e) + (Arrays.hashCode(objArray) * 31));
    }
    public final String toString(){
       return "{isActive="+this.a+", isActiveOnSameDevice="+this.c+", isConnected="+this.b+", localPlaybackEnabled="+this.d+", devices="+Arrays.toString(this.e)+'}';
    }
}
