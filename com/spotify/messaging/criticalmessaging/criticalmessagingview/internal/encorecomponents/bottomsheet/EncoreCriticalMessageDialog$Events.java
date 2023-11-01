package com.spotify.messaging.criticalmessaging.criticalmessagingview.internal.encorecomponents.bottomsheet.EncoreCriticalMessageDialog$Events;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class EncoreCriticalMessageDialog$Events extends Enum	// class@000a1e from classes.dex
{
    private static final EncoreCriticalMessageDialog$Events[] $VALUES;
    public static final EncoreCriticalMessageDialog$Events PrimaryActionTapped;
    public static final EncoreCriticalMessageDialog$Events SecondaryActionTapped;

    private static final EncoreCriticalMessageDialog$Events[] $values(){
       EncoreCriticalMessageDialog$Events[] uEventsArray = new EncoreCriticalMessageDialog$Events[]{EncoreCriticalMessageDialog$Events.PrimaryActionTapped,EncoreCriticalMessageDialog$Events.SecondaryActionTapped};
       return uEventsArray;
    }
    static {
       EncoreCriticalMessageDialog$Events.PrimaryActionTapped = new EncoreCriticalMessageDialog$Events("PrimaryActionTapped", 0);
       EncoreCriticalMessageDialog$Events.SecondaryActionTapped = new EncoreCriticalMessageDialog$Events("SecondaryActionTapped", 1);
       EncoreCriticalMessageDialog$Events.$VALUES = EncoreCriticalMessageDialog$Events.$values();
    }
    private void EncoreCriticalMessageDialog$Events(String p0,int p1){
       super(p0, p1);
    }
    public static EncoreCriticalMessageDialog$Events valueOf(String p0){
       return Enum.valueOf(EncoreCriticalMessageDialog$Events.class, p0);
    }
    public static EncoreCriticalMessageDialog$Events[] values(){
       return EncoreCriticalMessageDialog$Events.$VALUES.clone();
    }
}
