package com.spotify.eventsender.gabo.PublishEventsRequest;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.bc3;
import com.google.common.collect.c;
import p.f2;
import java.lang.Iterable;
import java.util.List;
import com.google.protobuf.a;
import p.wm5;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import com.spotify.eventsender.gabo.EventEnvelope;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;

public final class PublishEventsRequest extends c implements u74	// class@0008b3 from classes.dex
{
    private bc3 event_;
    private boolean suppressPersist_;
    private static final PublishEventsRequest DEFAULT_INSTANCE;
    public static final int EVENT_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int SUPPRESS_PERSIST_FIELD_NUMBER;

    static {
       PublishEventsRequest publishEvent = new PublishEventsRequest();
       PublishEventsRequest.DEFAULT_INSTANCE = publishEvent;
       c.registerDefaultInstance(PublishEventsRequest.class, publishEvent);
    }
    private void PublishEventsRequest(){
       super();
       this.event_ = c.emptyProtobufList();
    }
    public static PublishEventsRequest e(){
       return PublishEventsRequest.DEFAULT_INSTANCE;
    }
    public static void f(PublishEventsRequest p0,c p1){
       PublishEventsRequest event_ = p0.event_;
       if (event_.a == null) {
          p0.event_ = c.mutableCopy(event_);
       }
       a.addAll(p1, p0.event_);
       return;
    }
    public static wm5 g(){
       return PublishEventsRequest.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return PublishEventsRequest.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"event_",EventEnvelope.class,"suppressPersist_"};
             return c.newMessageInfo(PublishEventsRequest.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x1b\x02\x07", objArray);
           case 3:
             return new PublishEventsRequest();
           case 4:
             return new wm5();
           case 5:
             return PublishEventsRequest.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = PublishEventsRequest.PARSER) == null) {
                _monitor_enter(PublishEventsRequest.class);
                if ((pARSER = PublishEventsRequest.PARSER) == null) {
                   pARSER = new ii2(PublishEventsRequest.DEFAULT_INSTANCE);
                   PublishEventsRequest.PARSER = pARSER;
                }
                _monitor_exit(PublishEventsRequest.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
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
