package com.spotify.player.esperanto.proto.EsOptional$OptionalInt64;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.oq1;
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

public final class EsOptional$OptionalInt64 extends c implements u74	// class@000afd from classes.dex
{
    private long value_;
    private static final EsOptional$OptionalInt64 DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int VALUE_FIELD_NUMBER;

    static {
       EsOptional$OptionalInt64 optionalInt6 = new EsOptional$OptionalInt64();
       EsOptional$OptionalInt64.DEFAULT_INSTANCE = optionalInt6;
       c.registerDefaultInstance(EsOptional$OptionalInt64.class, optionalInt6);
    }
    private void EsOptional$OptionalInt64(){
       super();
    }
    public static void e(EsOptional$OptionalInt64 p0,long p1){
       p0.value_ = p1;
    }
    public static EsOptional$OptionalInt64 f(){
       return EsOptional$OptionalInt64.DEFAULT_INSTANCE;
    }
    public static EsOptional$OptionalInt64 g(){
       return EsOptional$OptionalInt64.DEFAULT_INSTANCE;
    }
    public static oq1 i(){
       return EsOptional$OptionalInt64.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return EsOptional$OptionalInt64.DEFAULT_INSTANCE.getParserForType();
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
             objArray[0] = "value_";
             return c.newMessageInfo(EsOptional$OptionalInt64.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02", objArray);
           case 3:
             return new EsOptional$OptionalInt64();
           case 4:
             return new oq1();
           case 5:
             return EsOptional$OptionalInt64.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = EsOptional$OptionalInt64.PARSER) == null) {
                _monitor_enter(EsOptional$OptionalInt64.class);
                if ((pARSER = EsOptional$OptionalInt64.PARSER) == null) {
                   pARSER = new ii2(EsOptional$OptionalInt64.DEFAULT_INSTANCE);
                   EsOptional$OptionalInt64.PARSER = pARSER;
                }
                _monitor_exit(EsOptional$OptionalInt64.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final long h(){
       return this.value_;
    }
}
