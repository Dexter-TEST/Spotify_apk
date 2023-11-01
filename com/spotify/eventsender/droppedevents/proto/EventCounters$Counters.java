package com.spotify.eventsender.droppedevents.proto.EventCounters$Counters;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.ac3;
import java.util.ArrayList;
import p.f2;
import java.lang.Iterable;
import java.util.List;
import com.google.protobuf.a;
import com.spotify.eventsender.droppedevents.proto.b;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;

public final class EventCounters$Counters extends c implements u74	// class@0008a6 from classes.dex
{
    private int countersMemoizedSerializedSize;
    private ac3 counters_;
    public static final int COUNTERS_FIELD_NUMBER = 1;
    private static final EventCounters$Counters DEFAULT_INSTANCE;
    private static r75 PARSER;

    static {
       EventCounters$Counters uCounters = new EventCounters$Counters();
       EventCounters$Counters.DEFAULT_INSTANCE = uCounters;
       c.registerDefaultInstance(EventCounters$Counters.class, uCounters);
    }
    private void EventCounters$Counters(){
       super();
       this.countersMemoizedSerializedSize = -1;
       this.counters_ = c.emptyLongList();
    }
    public static EventCounters$Counters e(){
       return EventCounters$Counters.DEFAULT_INSTANCE;
    }
    public static void f(EventCounters$Counters p0,ArrayList p1){
       EventCounters$Counters counters_ = p0.counters_;
       if (counters_.a == null) {
          p0.counters_ = c.mutableCopy(counters_);
       }
       a.addAll(p1, p0.counters_);
       return;
    }
    public static EventCounters$Counters h(){
       return EventCounters$Counters.DEFAULT_INSTANCE;
    }
    public static b i(){
       return EventCounters$Counters.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return EventCounters$Counters.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[b];
             objArray[0] = "counters_";
             return c.newMessageInfo(EventCounters$Counters.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01%", objArray);
           case 3:
             return new EventCounters$Counters();
           case 4:
             return new b();
           case 5:
             return EventCounters$Counters.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = EventCounters$Counters.PARSER) == null) {
                _monitor_enter(EventCounters$Counters.class);
                if ((pARSER = EventCounters$Counters.PARSER) == null) {
                   pARSER = new ii2(EventCounters$Counters.DEFAULT_INSTANCE);
                   EventCounters$Counters.PARSER = pARSER;
                }
                _monitor_exit(EventCounters$Counters.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final ac3 g(){
       return this.counters_;
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
