package com.spotify.connectivity.eventsenderanalyticsdelegate.EventSenderAnalyticsDelegate;
import com.spotify.connectivity.AnalyticsDelegate;
import com.spotify.eventsender.api.EventSenderCoreBridge;
import java.lang.Object;

public class EventSenderAnalyticsDelegate implements AnalyticsDelegate	// class@000704 from classes.dex
{
    private final EventSenderCoreBridge mEventSenderCoreBridge;

    public void EventSenderAnalyticsDelegate(EventSenderCoreBridge p0){
       super();
       this.mEventSenderCoreBridge = p0;
    }
    public void logEvent(byte[] p0,byte[] p1){
       this.mEventSenderCoreBridge.send(p0, p1, null);
    }
}
