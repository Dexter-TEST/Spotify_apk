package com.spotify.eventsender.gabo.PublishEventsResponse$EventError;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import com.spotify.eventsender.gabo.d;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class PublishEventsResponse$EventError extends c implements u74	// class@0008b4 from classes.dex
{
    private int index_;
    private int reason_;
    private boolean transient_;
    private static final PublishEventsResponse$EventError DEFAULT_INSTANCE;
    public static final int INDEX_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int REASON_FIELD_NUMBER;
    public static final int TRANSIENT_FIELD_NUMBER;

    static {
       PublishEventsResponse$EventError uEventError = new PublishEventsResponse$EventError();
       PublishEventsResponse$EventError.DEFAULT_INSTANCE = uEventError;
       c.registerDefaultInstance(PublishEventsResponse$EventError.class, uEventError);
    }
    private void PublishEventsResponse$EventError(){
       super();
    }
    public static PublishEventsResponse$EventError e(){
       return PublishEventsResponse$EventError.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return PublishEventsResponse$EventError.DEFAULT_INSTANCE.getParserForType();
    }
    public final Object dynamicMethod(li2 p0,Object p1,Object p2){
       r75 pARSER;
       byte b = 1;
       switch (p0.ordinal()){
           case 0:
             return Byte.valueOf(b);
           case 1:
             return null;
           case 2:
             Object[] objArray = new Object[]{"index_","transient_","reason_"};
             return c.newMessageInfo(PublishEventsResponse$EventError.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x03\xff\x02\xff\x02\xff\x02\xff\x02\x01\x03\x03\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x04\x02\x07\x03\x04", objArray);
           case 3:
             return new PublishEventsResponse$EventError();
           case 4:
             return new d();
           case 5:
             return PublishEventsResponse$EventError.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = PublishEventsResponse$EventError.PARSER) == null) {
                _monitor_enter(PublishEventsResponse$EventError.class);
                if ((pARSER = PublishEventsResponse$EventError.PARSER) == null) {
                   pARSER = new ii2(PublishEventsResponse$EventError.DEFAULT_INSTANCE);
                   PublishEventsResponse$EventError.PARSER = pARSER;
                }
                _monitor_exit(PublishEventsResponse$EventError.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final int f(){
       return this.index_;
    }
    public final boolean g(){
       return this.transient_;
    }
    public final s74 getDefaultInstanceForType(){
       return super.getDefaultInstanceForType();
    }
    public final r74 newBuilderForType(){
       return super.newBuilderForType();
    }
    public final r74 toBuilder(){
       return super.toBuilder();
    }
}
