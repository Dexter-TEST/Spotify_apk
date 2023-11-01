package com.spotify.messaging.criticalmessaging.criticalmessagingview.internal.encorecomponents.messageimage.MessageImage$Event;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class MessageImage$Event extends Enum	// class@000a20 from classes.dex
{
    private static final MessageImage$Event[] $VALUES;
    public static final MessageImage$Event ImageFetchComplete;
    public static final MessageImage$Event ImageFetchError;

    private static final MessageImage$Event[] $values(){
       MessageImage$Event[] uEventArray = new MessageImage$Event[]{MessageImage$Event.ImageFetchComplete,MessageImage$Event.ImageFetchError};
       return uEventArray;
    }
    static {
       MessageImage$Event.ImageFetchComplete = new MessageImage$Event("ImageFetchComplete", 0);
       MessageImage$Event.ImageFetchError = new MessageImage$Event("ImageFetchError", 1);
       MessageImage$Event.$VALUES = MessageImage$Event.$values();
    }
    private void MessageImage$Event(String p0,int p1){
       super(p0, p1);
    }
    public static MessageImage$Event valueOf(String p0){
       return Enum.valueOf(MessageImage$Event.class, p0);
    }
    public static MessageImage$Event[] values(){
       return MessageImage$Event.$VALUES.clone();
    }
}
