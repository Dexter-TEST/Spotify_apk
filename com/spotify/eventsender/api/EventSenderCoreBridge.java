package com.spotify.eventsender.api.EventSenderCoreBridge;

public interface abstract EventSenderCoreBridge	// class@0008a1 from classes.dex
{

    boolean send(byte[] p0,byte[] p1,byte[] p2);
    boolean sendBlocking(byte[] p0,byte[] p1,byte[] p2);
}
