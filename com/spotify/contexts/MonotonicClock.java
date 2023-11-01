package com.spotify.contexts.MonotonicClock;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.rc4;
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

public final class MonotonicClock extends c implements u74	// class@00083b from classes.dex
{
    private int bitField0_;
    private long id_;
    private long value_;
    private static final MonotonicClock DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int VALUE_FIELD_NUMBER;

    static {
       MonotonicClock monotonicClo = new MonotonicClock();
       MonotonicClock.DEFAULT_INSTANCE = monotonicClo;
       c.registerDefaultInstance(MonotonicClock.class, monotonicClo);
    }
    private void MonotonicClock(){
       super();
    }
    public static MonotonicClock e(){
       return MonotonicClock.DEFAULT_INSTANCE;
    }
    public static void f(MonotonicClock p0,long p1){
       p0.bitField0_ = p0.bitField0_ | 0x01;
       p0.id_ = p1;
    }
    public static void g(MonotonicClock p0,long p1){
       p0.bitField0_ = p0.bitField0_ | 0x02;
       p0.value_ = p1;
    }
    public static rc4 h(){
       return MonotonicClock.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return MonotonicClock.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"bitField0_","id_","value_"};
             return c.newMessageInfo(MonotonicClock.DEFAULT_INSTANCE, "\x01\x02\xff\x02\xff\x02\x01\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x10\x02\xff\x02\xff\x02\x02\x10\x02\x01", objArray);
           case 3:
             return new MonotonicClock();
           case 4:
             return new rc4();
           case 5:
             return MonotonicClock.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = MonotonicClock.PARSER) == null) {
                _monitor_enter(MonotonicClock.class);
                if ((pARSER = MonotonicClock.PARSER) == null) {
                   pARSER = new ii2(MonotonicClock.DEFAULT_INSTANCE);
                   MonotonicClock.PARSER = pARSER;
                }
                _monitor_exit(MonotonicClock.class);
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
