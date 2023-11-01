package com.spotify.messaging.inappmessaging.inappmessagingsdk.domain.models.TriggerType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class TriggerType extends Enum	// class@000a2a from classes.dex
{
    private static final TriggerType[] $VALUES;
    public static final TriggerType CLIENT_EVENT;
    public static final TriggerType PLAYBACK_STARTED;
    public static final TriggerType URI;

    private static final TriggerType[] $values(){
       TriggerType[] triggerTypeA = new TriggerType[]{TriggerType.URI,TriggerType.PLAYBACK_STARTED,TriggerType.CLIENT_EVENT};
       return triggerTypeA;
    }
    static {
       TriggerType.URI = new TriggerType("URI", 0);
       TriggerType.PLAYBACK_STARTED = new TriggerType("PLAYBACK_STARTED", 1);
       TriggerType.CLIENT_EVENT = new TriggerType("CLIENT_EVENT", 2);
       TriggerType.$VALUES = TriggerType.$values();
    }
    private void TriggerType(String p0,int p1){
       super(p0, p1);
    }
    public static TriggerType valueOf(String p0){
       return Enum.valueOf(TriggerType.class, p0);
    }
    public static TriggerType[] values(){
       return TriggerType.$VALUES.clone();
    }
}
