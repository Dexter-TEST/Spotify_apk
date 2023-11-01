package com.spotify.eventsender.droppedevents.proto.EventCounters;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.g14;
import com.spotify.eventsender.droppedevents.proto.a;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import com.spotify.eventsender.droppedevents.proto.c;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import java.util.Map;
import java.util.Collections;
import p.r74;

public final class EventCounters extends c implements u74	// class@0008a7 from classes.dex
{
    private g14 eventNameToCountersMap_;
    private int fileFormatVersion_;
    private static final EventCounters DEFAULT_INSTANCE;
    public static final int EVENT_NAME_TO_COUNTERS_MAP_FIELD_NUMBER;
    public static final int FILE_FORMAT_VERSION_FIELD_NUMBER;
    private static r75 PARSER;

    static {
       EventCounters uEventCounte = new EventCounters();
       EventCounters.DEFAULT_INSTANCE = uEventCounte;
       c.registerDefaultInstance(EventCounters.class, uEventCounte);
    }
    private void EventCounters(){
       super();
       this.eventNameToCountersMap_ = g14.b;
    }
    public static EventCounters e(){
       return EventCounters.DEFAULT_INSTANCE;
    }
    public static void f(EventCounters p0){
       p0.fileFormatVersion_ = 3;
    }
    public static g14 g(EventCounters p0){
       EventCounters eventNameToC = p0.eventNameToCountersMap_;
       if (eventNameToC.a == null) {
          p0.eventNameToCountersMap_ = eventNameToC.d();
       }
       return p0.eventNameToCountersMap_;
    }
    public static a j(){
       return EventCounters.DEFAULT_INSTANCE.createBuilder();
    }
    public static EventCounters k(byte[] p0){
       return c.parseFrom(EventCounters.DEFAULT_INSTANCE, p0);
    }
    public static r75 parser(){
       return EventCounters.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"fileFormatVersion_","eventNameToCountersMap_",c.a};
             return c.newMessageInfo(EventCounters.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x04\x022", objArray);
           case 3:
             return new EventCounters();
           case 4:
             return new a();
           case 5:
             return EventCounters.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = EventCounters.PARSER) == null) {
                _monitor_enter(EventCounters.class);
                if ((pARSER = EventCounters.PARSER) == null) {
                   pARSER = new ii2(EventCounters.DEFAULT_INSTANCE);
                   EventCounters.PARSER = pARSER;
                }
                _monitor_exit(EventCounters.class);
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
    public final Map h(){
       return Collections.unmodifiableMap(this.eventNameToCountersMap_);
    }
    public final int i(){
       return this.fileFormatVersion_;
    }
    public final r74 newBuilderForType(){
       return super.newBuilderForType();
    }
    public final r74 toBuilder(){
       return super.toBuilder();
    }
}
