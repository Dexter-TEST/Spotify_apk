package com.spotify.eventsender.gabo.EventEnvelope;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.bc3;
import p.i80;
import p.ab2;
import p.f2;
import java.lang.Iterable;
import java.util.List;
import com.google.protobuf.a;
import java.lang.Object;
import java.lang.String;
import com.spotify.eventsender.gabo.a;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import com.spotify.eventsender.gabo.EventEnvelope$EventFragment;
import p.s74;
import java.lang.Byte;
import p.r74;

public final class EventEnvelope extends c implements u74	// class@0008b2 from classes.dex
{
    private bc3 eventFragment_;
    private String eventName_;
    private i80 sequenceId_;
    private long sequenceNumber_;
    private static final EventEnvelope DEFAULT_INSTANCE;
    public static final int EVENT_FRAGMENT_FIELD_NUMBER;
    public static final int EVENT_NAME_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int SEQUENCE_ID_FIELD_NUMBER;
    public static final int SEQUENCE_NUMBER_FIELD_NUMBER;

    static {
       EventEnvelope uEventEnvelo = new EventEnvelope();
       EventEnvelope.DEFAULT_INSTANCE = uEventEnvelo;
       c.registerDefaultInstance(EventEnvelope.class, uEventEnvelo);
    }
    private void EventEnvelope(){
       super();
       this.eventName_ = "";
       this.eventFragment_ = c.emptyProtobufList();
       this.sequenceId_ = i80.b;
    }
    public static void e(EventEnvelope p0,ab2 p1){
       EventEnvelope eventFragmen = p0.eventFragment_;
       if (eventFragmen.a == null) {
          p0.eventFragment_ = c.mutableCopy(eventFragmen);
       }
       a.addAll(p1, p0.eventFragment_);
       return;
    }
    public static void f(EventEnvelope p0,i80 p1){
       p0.getClass();
       p1.getClass();
       p0.sequenceId_ = p1;
    }
    public static void g(EventEnvelope p0,long p1){
       p0.sequenceNumber_ = p1;
    }
    public static EventEnvelope h(){
       return EventEnvelope.DEFAULT_INSTANCE;
    }
    public static void i(EventEnvelope p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.eventName_ = p1;
    }
    public static a j(){
       return EventEnvelope.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return EventEnvelope.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"eventName_","eventFragment_",EventEnvelope$EventFragment.class,"sequenceId_","sequenceNumber_"};
             return c.newMessageInfo(EventEnvelope.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x04\xff\x02\xff\x02\xff\x02\xff\x02\x02\x05\x04\xff\x02\xff\x02\x01\xff\x02\xff\x02\x02\x02\x02\x03\x1b\x04\n\x05\x02", objArray);
           case 3:
             return new EventEnvelope();
           case 4:
             return new a();
           case 5:
             return EventEnvelope.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = EventEnvelope.PARSER) == null) {
                _monitor_enter(EventEnvelope.class);
                if ((pARSER = EventEnvelope.PARSER) == null) {
                   pARSER = new ii2(EventEnvelope.DEFAULT_INSTANCE);
                   EventEnvelope.PARSER = pARSER;
                }
                _monitor_exit(EventEnvelope.class);
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
