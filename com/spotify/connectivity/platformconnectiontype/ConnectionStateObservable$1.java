package com.spotify.connectivity.platformconnectiontype.ConnectionStateObservable$1;
import com.spotify.connectivity.connectiontype.OfflineState$State;
import java.lang.Enum;

class ConnectionStateObservable$1	// class@000770 from classes.dex
{
    static final int[] $SwitchMap$com$spotify$connectivity$connectiontype$OfflineState$State;

    static {
       int[] ointArray = new int[OfflineState$State.values().length];
       try{
          ConnectionStateObservable$1.$SwitchMap$com$spotify$connectivity$connectiontype$OfflineState$State = ointArray;
          ointArray[OfflineState$State.OFFLINE.ordinal()] = 1;
          try{
             ConnectionStateObservable$1.$SwitchMap$com$spotify$connectivity$connectiontype$OfflineState$State[OfflineState$State.ONLINE.ordinal()] = 2;
             try{
                ConnectionStateObservable$1.$SwitchMap$com$spotify$connectivity$connectiontype$OfflineState$State[OfflineState$State.RECONNECTING.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
