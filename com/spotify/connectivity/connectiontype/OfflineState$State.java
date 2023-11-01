package com.spotify.connectivity.connectiontype.OfflineState$State;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class OfflineState$State extends Enum	// class@0006a8 from classes.dex
{
    private static final OfflineState$State[] $VALUES;
    public static final OfflineState$State FORCED_OFFLINE;
    public static final OfflineState$State OFFLINE;
    public static final OfflineState$State ONLINE;
    public static final OfflineState$State RECONNECTING;

    static {
       OfflineState$State state = new OfflineState$State("ONLINE", 0);
       OfflineState$State.ONLINE = state;
       OfflineState$State state1 = new OfflineState$State("OFFLINE", 1);
       OfflineState$State.OFFLINE = state1;
       OfflineState$State state2 = new OfflineState$State("FORCED_OFFLINE", 2);
       OfflineState$State.FORCED_OFFLINE = state2;
       OfflineState$State state3 = new OfflineState$State("RECONNECTING", 3);
       OfflineState$State.RECONNECTING = state3;
       OfflineState$State[] stateArray = new OfflineState$State[]{state,state1,state2,state3};
       OfflineState$State.$VALUES = stateArray;
    }
    private void OfflineState$State(String p0,int p1){
       super(p0, p1);
    }
    public static OfflineState$State valueOf(String p0){
       return Enum.valueOf(OfflineState$State.class, p0);
    }
    public static OfflineState$State[] values(){
       return OfflineState$State.$VALUES.clone();
    }
}
