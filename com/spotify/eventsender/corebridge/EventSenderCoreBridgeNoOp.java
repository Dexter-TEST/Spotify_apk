package com.spotify.eventsender.corebridge.EventSenderCoreBridgeNoOp;
import com.spotify.eventsender.api.EventSenderCoreBridge;
import java.lang.Object;

public class EventSenderCoreBridgeNoOp implements EventSenderCoreBridge	// class@0008a3 from classes.dex
{

    public void EventSenderCoreBridgeNoOp(){
       super();
    }
    public boolean send(byte[] p0,byte[] p1,byte[] p2){
       return false;
    }
    public boolean sendBlocking(byte[] p0,byte[] p1,byte[] p2){
       return false;
    }
}
