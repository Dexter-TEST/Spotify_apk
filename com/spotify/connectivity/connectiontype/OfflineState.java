package com.spotify.connectivity.connectiontype.OfflineState;
import java.lang.Object;
import com.spotify.connectivity.connectiontype.OfflineState$State;
import com.spotify.connectivity.connectiontype.AutoValue_OfflineState;

public abstract class OfflineState	// class@0006a9 from classes.dex
{

    public void OfflineState(){
       super();
    }
    public static OfflineState create(OfflineState$State p0){
       return new AutoValue_OfflineState(p0);
    }
    public boolean offline(){
       boolean b = (OfflineState$State.ONLINE != this.offlineState())? true: false;
       return b;
    }
    public abstract OfflineState$State offlineState();
}
