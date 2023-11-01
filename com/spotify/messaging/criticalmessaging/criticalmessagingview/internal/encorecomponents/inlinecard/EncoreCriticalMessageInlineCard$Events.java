package com.spotify.messaging.criticalmessaging.criticalmessagingview.internal.encorecomponents.inlinecard.EncoreCriticalMessageInlineCard$Events;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class EncoreCriticalMessageInlineCard$Events extends Enum	// class@000a1f from classes.dex
{
    private static final EncoreCriticalMessageInlineCard$Events[] $VALUES;
    public static final EncoreCriticalMessageInlineCard$Events CloseButtonTapped;
    public static final EncoreCriticalMessageInlineCard$Events PrimaryButtonTapped;

    private static final EncoreCriticalMessageInlineCard$Events[] $values(){
       EncoreCriticalMessageInlineCard$Events[] uEventsArray = new EncoreCriticalMessageInlineCard$Events[]{EncoreCriticalMessageInlineCard$Events.PrimaryButtonTapped,EncoreCriticalMessageInlineCard$Events.CloseButtonTapped};
       return uEventsArray;
    }
    static {
       EncoreCriticalMessageInlineCard$Events.PrimaryButtonTapped = new EncoreCriticalMessageInlineCard$Events("PrimaryButtonTapped", 0);
       EncoreCriticalMessageInlineCard$Events.CloseButtonTapped = new EncoreCriticalMessageInlineCard$Events("CloseButtonTapped", 1);
       EncoreCriticalMessageInlineCard$Events.$VALUES = EncoreCriticalMessageInlineCard$Events.$values();
    }
    private void EncoreCriticalMessageInlineCard$Events(String p0,int p1){
       super(p0, p1);
    }
    public static EncoreCriticalMessageInlineCard$Events valueOf(String p0){
       return Enum.valueOf(EncoreCriticalMessageInlineCard$Events.class, p0);
    }
    public static EncoreCriticalMessageInlineCard$Events[] values(){
       return EncoreCriticalMessageInlineCard$Events.$VALUES.clone();
    }
}
