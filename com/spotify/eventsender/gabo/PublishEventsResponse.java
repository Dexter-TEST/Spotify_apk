package com.spotify.eventsender.gabo.PublishEventsResponse;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.bc3;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import com.spotify.eventsender.gabo.c;
import com.spotify.eventsender.gabo.PublishEventsResponse$EventError;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class PublishEventsResponse extends c implements u74	// class@0008b5 from classes.dex
{
    private bc3 error_;
    private static final PublishEventsResponse DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER;
    private static r75 PARSER;

    static {
       PublishEventsResponse publishEvent = new PublishEventsResponse();
       PublishEventsResponse.DEFAULT_INSTANCE = publishEvent;
       c.registerDefaultInstance(PublishEventsResponse.class, publishEvent);
    }
    private void PublishEventsResponse(){
       super();
       this.error_ = c.emptyProtobufList();
    }
    public static PublishEventsResponse e(){
       return PublishEventsResponse.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return PublishEventsResponse.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"error_",PublishEventsResponse$EventError.class};
             return c.newMessageInfo(PublishEventsResponse.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x1b", objArray);
           case 3:
             return new PublishEventsResponse();
           case 4:
             return new c();
           case 5:
             return PublishEventsResponse.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = PublishEventsResponse.PARSER) == null) {
                _monitor_enter(PublishEventsResponse.class);
                if ((pARSER = PublishEventsResponse.PARSER) == null) {
                   pARSER = new ii2(PublishEventsResponse.DEFAULT_INSTANCE);
                   PublishEventsResponse.PARSER = pARSER;
                }
                _monitor_exit(PublishEventsResponse.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final bc3 f(){
       return this.error_;
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
