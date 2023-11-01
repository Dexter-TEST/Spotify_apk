package com.spotify.connectivity.connectiontype.AutoValue_OfflineState;
import com.spotify.connectivity.connectiontype.OfflineState;
import com.spotify.connectivity.connectiontype.OfflineState$State;
import java.lang.NullPointerException;
import java.lang.String;
import java.lang.Object;
import java.lang.StringBuilder;

final class AutoValue_OfflineState extends OfflineState	// class@00068b from classes.dex
{
    private final OfflineState$State offlineState;

    public void AutoValue_OfflineState(OfflineState$State p0){
       super();
       if (p0 == null) {
          throw new NullPointerException("Null offlineState");
       }
       this.offlineState = p0;
       return;
    }
    public boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (p0 instanceof OfflineState) {
          return this.offlineState.equals(p0.offlineState());
       }
       return false;
    }
    public int hashCode(){
       return (this.offlineState.hashCode() ^ 0xf4243);
    }
    public OfflineState$State offlineState(){
       return this.offlineState;
    }
    public String toString(){
       return "OfflineState{offlineState="+this.offlineState+"}";
    }
}
