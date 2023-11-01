package com.spotify.eventsender.gabo.EventEnvelope$EventFragment;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.i80;
import java.lang.String;
import java.lang.Object;
import com.spotify.eventsender.gabo.b;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.Byte;
import p.r74;

public final class EventEnvelope$EventFragment extends c implements u74	// class@0008b1 from classes.dex
{
    private i80 data_;
    private String name_;
    public static final int DATA_FIELD_NUMBER = 2;
    private static final EventEnvelope$EventFragment DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER;
    private static r75 PARSER;

    static {
       EventEnvelope$EventFragment uEventFragme = new EventEnvelope$EventFragment();
       EventEnvelope$EventFragment.DEFAULT_INSTANCE = uEventFragme;
       c.registerDefaultInstance(EventEnvelope$EventFragment.class, uEventFragme);
    }
    private void EventEnvelope$EventFragment(){
       super();
       this.name_ = "";
       this.data_ = i80.b;
    }
    public static EventEnvelope$EventFragment e(){
       return EventEnvelope$EventFragment.DEFAULT_INSTANCE;
    }
    public static void f(EventEnvelope$EventFragment p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.name_ = p1;
    }
    public static void g(EventEnvelope$EventFragment p0,i80 p1){
       p0.getClass();
       p1.getClass();
       p0.data_ = p1;
    }
    public static b h(){
       return EventEnvelope$EventFragment.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return EventEnvelope$EventFragment.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"name_","data_"};
             return c.newMessageInfo(EventEnvelope$EventFragment.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\n", objArray);
           case 3:
             return new EventEnvelope$EventFragment();
           case 4:
             return new b();
           case 5:
             return EventEnvelope$EventFragment.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = EventEnvelope$EventFragment.PARSER) == null) {
                _monitor_enter(EventEnvelope$EventFragment.class);
                if ((pARSER = EventEnvelope$EventFragment.PARSER) == null) {
                   pARSER = new ii2(EventEnvelope$EventFragment.DEFAULT_INSTANCE);
                   EventEnvelope$EventFragment.PARSER = pARSER;
                }
                _monitor_exit(EventEnvelope$EventFragment.class);
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
