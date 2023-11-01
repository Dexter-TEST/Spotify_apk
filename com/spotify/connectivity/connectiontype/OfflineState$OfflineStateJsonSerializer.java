package com.spotify.connectivity.connectiontype.OfflineState$OfflineStateJsonSerializer;
import p.mg3;
import com.spotify.connectivity.connectiontype.OfflineState;
import p.vf3;
import p.gb6;
import java.lang.String;
import com.spotify.connectivity.connectiontype.OfflineState$State;
import java.lang.Object;

public class OfflineState$OfflineStateJsonSerializer extends mg3	// class@0006a7 from classes.dex
{

    public void OfflineState$OfflineStateJsonSerializer(){
       super();
    }
    public void serialize(OfflineState p0,vf3 p1,gb6 p2){
       p1.v0();
       p1.i0("connection");
       p1.v0();
       boolean b = (p0.offlineState() == OfflineState$State.FORCED_OFFLINE)? true: false;
       p1.i0("force_offline");
       p1.T(b);
       p1.h0();
       p1.h0();
       return;
    }
    public void serialize(Object p0,vf3 p1,gb6 p2){
       this.serialize(p0, p1, p2);
    }
}
